def solution(age):
    answer = ''
    dic = {0:'a', 1:'b', 2:'c', 3:'d', 4:'e', 5:'f', 6:'g', 7:'h', 8:'i', 9:'j'}

    while age >0:
        digit = age % 10
        age = age //10
        answer = dic[digit] + answer
    return answer