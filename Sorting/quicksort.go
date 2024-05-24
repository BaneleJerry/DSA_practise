package main

func main(){


}



func Qsort(barr []byte, lo, hi int){
    if lo >= hi{
        
    } else{
		p := Partition(barr, lo, hi)
        Qsort(barr, lo, p-1)
        Qsort(barr, p+1, hi)
	}
}



func Partition(byteArr []byte, lo, hi int) rune {
	p := byteArr[hi]
	idx := lo - 1
	 for(i := 0; i < hi; i++){
		if byteArr[i] <= p{
            idx++
            byteArr[i], byteArr[idx] = byteArr[idx], byteArr[i]
        }
	 }	

	 idx++
	 byteArr[idx], byteArr[hi] = byteArr[hi], byteArr[idx]
}