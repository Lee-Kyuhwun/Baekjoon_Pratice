def solution(num_list, n):
    answer = []
    cnt =0
    for i in num_list:
        if(cnt % n ==0):
            answer.append(i)
        cnt+=1
    return answer