def solution(n):
    ans = 0
    num = str(n)
    for i in num:
        ans += int(i)
    return ans