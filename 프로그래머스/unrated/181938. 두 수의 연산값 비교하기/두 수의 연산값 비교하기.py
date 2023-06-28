def solution(a, b):
    answer = 0
    str_a ,str_b = str(a), str(b)
    return max(int(str_a+str_b) , 2*a*b)