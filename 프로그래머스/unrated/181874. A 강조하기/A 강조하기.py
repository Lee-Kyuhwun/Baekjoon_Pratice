def solution(myString):
    answer = ''
    for i in myString:
        if i.lower() == 'a':
            answer += 'A'
        else:
            answer += i.lower()
    return answer
