int solution(int year) {
    int contador = 0;
    if(year <= 2005 & year > 0){
        for(int i = 0; i < 2100; i += 100){
            if(year <= i){
                return contador;
            }
            contador += 1;
        }
    } else {
        return contador;
    }
    return contador;
}