def solution(ineq, eq, n, m):
    op = {">": n.__gt__, "<": n.__lt__}
    if eq == "=":
        return int(op[ineq](m) or n == m)
    else:
        return int(op[ineq](m))
