def solution(matrix):
    suma = 0
    if len(matrix) > 1:
        for f in range(1, len(matrix)):
            for i in range(len(matrix[f])):
                if matrix[f-1][i] == 0:
                    matrix[f][i] = 0
    
    for f in matrix:
        for i in f:
            suma += i
            
    return suma
