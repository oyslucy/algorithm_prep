from collections import Counter

def solution(participant, completion):
    counter = Counter(participant)
    counter.subtract(completion)
    for name, i in counter.items():
        if i > 0:
            return name