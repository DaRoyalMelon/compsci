a
sum = 0;
for(i = first; i < last; i++){
	sum = sum + score[i];
}
return(sum / last - last + 1);

b
for(int i = 0; i < scores.length-1; i++){
	if(scores[i] >= scores[i+1]){
		return false;	
	}
return true;
}

c
if(hasImproved){
	return average (scores.length/2, scores.length)
}else {
	return average (0, scores.length -1)
}
