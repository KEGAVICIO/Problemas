boolean solution(String inputString) {
    String revers = "";
    int lstring = inputString.length() - 1;
    while(lstring > -1){
        revers = revers + inputString.charAt(lstring);
        lstring--;
    }
    return inputString.equals(revers);
}