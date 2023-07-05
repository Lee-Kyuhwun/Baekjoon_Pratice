def solution(n):
    # 유클리드 호제법으로 최대공약수를 찾는 함수
    def gcd(a, b):
        while(b!=0):
            r = a%b
            a= b
            b= r
        return a

    # 두 수의 최소공배수를 찾는 함수
    def lcm(a, b):
        return a * b // gcd(a, b)

    # 최소공배수를 6으로 나눈 후, 그 결과를 반환
    return lcm(n, 6) // 6
