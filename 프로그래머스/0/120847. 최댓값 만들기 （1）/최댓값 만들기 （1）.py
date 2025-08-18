def solution(numbers):
    answer = 0
    n = sorted(numbers)[-1]
    m = sorted(numbers)[-2]
    return n*m