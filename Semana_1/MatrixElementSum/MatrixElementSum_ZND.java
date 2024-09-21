int solution(int[][] matrix) {
    int filas = matrix.length;
    int columnas = matrix[0].length;
    //System.out.println(" "+ filas + "   " + columnas);
    int[] contadores = new int[columnas];
    for(int i = 0; i < matrix.length; i++){
        for(int j = 0; j<matrix[i].length; j++){
            if(i == 0){
                contadores[j] = matrix[i][j];
            }else{
                for(int k = 0; k < i; k++){
                    if(matrix[k][j] != 0){
                        contadores[j] += matrix[i][j];
                    }
                }
            }
            System.out.print(" " + matrix[i][j] + ",");
        }
        System.out.println("");
    }
    int resulta = 0;
    for(int e = 0; e<matrix[0].length; e++){
        System.out.print(" " + contadores[e] + ",");
        resulta += contadores[e];
    }
    System.out.println();
    int[] resulta2 = new int[columnas];
    for(int i = 0; i < matrix[0].length; i++){
        for(int j = 0; j<matrix.length; j++){
            if(matrix[j][i] != 0 ){
                resulta2[i] += matrix[j][i]; 
            }else{
                break;
            }
        }
        System.out.print(" " + resulta2[i] + ",");
    }
    int gallo = 0;
    for(int i = 0; i<resulta2.length;i++){
        gallo += resulta2[i];
    }
    return gallo;
}
