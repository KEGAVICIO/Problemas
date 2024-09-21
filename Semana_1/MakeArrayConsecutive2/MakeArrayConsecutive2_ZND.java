int solution(int[] statues) {
    //int size = statues.length -1;
    int size2 = statues.length -1;
    int L = 10, U = 0;
    //while(size>-1)
    for(int size = 0; size < statues.length; size++){
        if(statues[size] < L ){ //10 //6 //2 //2 //2
            L = statues[size];
        }
        if(statues[size] > U){
            U = statues[size];  //0 //0 //0 //3 //8
            }      
        
        //size--;
    }
    System.out.print("Este es L " + L + " y U:" + U);
    
    int contador = 0;
    for(int i = L; i<=U; i++){
        size2 = statues.length -1; //3
        for(int j = 0; j < statues.length - 1;j++){
            if(i == statues[j]){
                contador++;
            }
        }
        /*while(size2 > -1){
            if(i == statues[size2]){
                contador++;
            }
        size2--;
        }*/
    }
    return ((U-L) - contador);   
}
