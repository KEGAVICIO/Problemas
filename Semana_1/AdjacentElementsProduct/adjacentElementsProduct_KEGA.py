def solution(inputArray):
    res = -9999
    for d in range(len(inputArray)-1):
        iz = d + 1
        if (res < inputArray[d]*inputArray[iz]):
            res = inputArray[d]*inputArray[iz]
    return res

