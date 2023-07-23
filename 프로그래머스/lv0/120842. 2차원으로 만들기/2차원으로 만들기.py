def solution(num_list, n):
    result = []
    while num_list: # numlist 비워지기전까지
        sub_list = num_list[:n]
        result.append(sub_list)
        num_list = num_list[n:]
    return result