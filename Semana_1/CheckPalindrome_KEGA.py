def solution(inputString):
    revers = ""
    lstring = len(inputString)-1
    while lstring > -1:
        revers = revers+inputString[lstring]
        lstring -= 1
        
    return inputString == revers
