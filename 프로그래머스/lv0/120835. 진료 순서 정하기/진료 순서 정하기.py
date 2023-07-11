def solution(emergency):
    sorted_emergency = sorted(emergency, reverse = True)
    answer = []
    for i in emergency:
        index = sorted_emergency.index(i) +1
        answer.append(index)
    return answer
