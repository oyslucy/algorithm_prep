def solution(t, p):
    answer = 0
    len_t = len(t)
    len_p = len(p)
    
    for i in range(len_t - len_p + 1):
        str = t[i:i+len_p]
        if str <= p:
            answer += 1
    return answer