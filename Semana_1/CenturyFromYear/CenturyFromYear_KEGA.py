def solution(year):
    if(year > 0 and year <= 2005 and year%100 == 0 ):
        return year/100
    else: 
        return round(year//100+1)
