def add_matrix(A, B):
  """
  두 개의 2차원 행렬을 더한다.

  Args:
    A: 첫 번째 행렬
    B: 두 번째 행렬

  Returns:
    두 행렬의 합
  """

  n, m = len(A), len(A[0])
  C = [[0 for _ in range(m)] for _ in range(n)]

  for i in range(n):
    for j in range(m):
      C[i][j] = A[i][j] + B[i][j]

  return C


if __name__ == "__main__":
  n, m = map(int, input().split())
  A = []
  for _ in range(n):
    A.append(list(map(int, input().split())))
  B = []
  for _ in range(n):
    B.append(list(map(int, input().split())))

  C = add_matrix(A, B)

  for i in range(n):
    print(" ".join(map(str, C[i])))
