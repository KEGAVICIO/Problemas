def solution(statues):
    count = 0
    aux = 0
    swapped = True 
    
    while swapped: #Ordenamos el arreglo del array
        swapped = False
        for i in range(len(statues) - 1):
            if statues[i] > statues[i + 1]:
                swapped = True
                statues[i], statues[i + 1] = statues[i + 1], statues[i]
    i = statues[0]
    while i < (statues[len(statues)-1]+1):  # Aqui empieza a comparar los numeros          
        for j in range(len(statues)):
            if(i == statues[j]):
                count = 0
                break
            else:
                count += 1
        i += 1
        if (count > 0):
            aux += 1
    return aux
