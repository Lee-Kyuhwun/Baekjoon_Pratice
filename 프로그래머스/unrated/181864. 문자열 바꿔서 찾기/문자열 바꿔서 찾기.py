def solution(myString, pat):
    tem = '#'
    myString=myString.replace('A',tem)
    myString=myString.replace('B','A')
    myString=myString.replace(tem,'B')
    return 1 if pat in myString else 0