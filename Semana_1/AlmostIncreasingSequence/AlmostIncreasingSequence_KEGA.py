def solution(sequence):
    j = 0
    win = 0
    strictly = sequence
    print(sequence)
    while j < len(sequence):
        strictly = sequence[:j] + sequence[j+1:] 
        print(strictly)
        if all(i<j for i,j in zip(strictly, strictly[1:])):
            win = 1
            break
        j+=1
    return win == 1
