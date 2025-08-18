def solution(my_string):
    answer = [int(c) for c in my_string if c.isdigit()]
    return sorted(answer)