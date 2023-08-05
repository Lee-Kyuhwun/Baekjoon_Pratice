import sys

# 입력: 수의 개수 N, 합을 구해야 하는 횟수 M
N, M = map(int, sys.stdin.readline().strip().split())

# N개의 수를 입력받아 리스트에 저장
numbers = list(map(int, sys.stdin.readline().strip().split()))

# 누적 합을 계산
prefix_sum = [0] * (N + 1)
for i in range(1, N + 1):
    prefix_sum[i] = prefix_sum[i - 1] + numbers[i - 1]

# 결과를 담을 리스트
results = []

# M번 반복하여 각 구간의 합을 계산
for _ in range(M):
    # 구간의 시작 인덱스 i와 끝 인덱스 j를 입력받음
    i, j = map(int, sys.stdin.readline().strip().split())
    
    # 누적 합을 사용하여 구간의 합을 계산
    section_sum = prefix_sum[j] - prefix_sum[i - 1]
    
    # 결과 리스트에 추가
    results.append(str(section_sum))

# 결과 리스트를 출력
print('\n'.join(results))
