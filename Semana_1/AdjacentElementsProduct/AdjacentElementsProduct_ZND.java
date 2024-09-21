int solution(int[] inputArray) {
    int cantity = inputArray.length - 1;
    int result = -9999;
    while(cantity > 0){
        if(result < (inputArray[cantity]*inputArray[cantity-1])){
            result = (inputArray[cantity]*inputArray[cantity-1]);
        }
        cantity--;
    }
    return result;
}
