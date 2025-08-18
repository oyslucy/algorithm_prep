def solution(emergency):
    sorted_emg = sorted(emergency, reverse = True)
    rank = {num: i+1 for i, num in enumerate(sorted_emg)}
    return [rank[num] for num in emergency]
