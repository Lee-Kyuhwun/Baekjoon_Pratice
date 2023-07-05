def solution(array):
    count_dict={}
    for num in array:
        if num not in count_dict:
            count_dict[num] = 1
        else:
            count_dict[num] +=1
    
    max_count = max(count_dict.values())
    modes =[k for k,v in count_dict.items() if v == max_count]
    
    if len(modes)> 1: 
        return -1
    else:
        return modes[0]