def solution(n):
    composite_count = 0
    for i in range(4, n+1):
        for j in range(2,i): # 2부터 i-1까지의 숫자로 나누어보고
            if i%j ==0: # 나누어 떨어지는 수가 있다면,
                composite_count +=1 #합성수이므로 카운트 증가시키고
                break
    return composite_count
