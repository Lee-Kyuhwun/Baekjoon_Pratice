from sys import stdin
from collections import deque

def move(y, x, dy, dx):
    cnt = 0
    while board[y+dy][x+dx] != '#' and board[y][x] != 'O':
        y += dy
        x += dx
        cnt += 1
    return y, x, cnt

def bfs(ry, rx, by, bx):
    visited = set([(ry, rx, by, bx)])
    q = deque([(ry, rx, by, bx, 0)])
    while q:
        ry, rx, by, bx, count = q.popleft()
        if count >= 10:
            break
        for dy, dx in [(-1, 0), (1, 0), (0, -1), (0, 1)]:
            nry, nrx, rc = move(ry, rx, dy, dx)
            nby, nbx, bc = move(by, bx, dy, dx)
            if board[nby][nbx] == 'O':
                continue
            if board[nry][nrx] == 'O':
                return count + 1
            if (nry, nrx) == (nby, nbx):
                if rc > bc:
                    nry -= dy
                    nrx -= dx
                else:
                    nby -= dy
                    nbx -= dx
            if (nry, nrx, nby, nbx) not in visited:
                visited.add((nry, nrx, nby, nbx))
                q.append((nry, nrx, nby, nbx, count + 1))
    return -1

N, M = map(int, stdin.readline().split())
board = [stdin.readline().strip() for _ in range(N)]

ry = rx = by = bx = 0
for i in range(N):
    for j in range(M):
        if board[i][j] == 'R':
            ry, rx = i, j
        elif board[i][j] == 'B':
            by, bx = i, j

print(bfs(ry, rx, by, bx))
