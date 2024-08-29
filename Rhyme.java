static int score(String coin){
        int score=0,count=0;
        for(char ch: coin.toCharArray()){
            if(ch=='H') {
                score+=2;
                count++;
                
                if(count==3) return score;
            }
            else {
                score--;
                count=0;
            }
            
            
        }
        
        return score;
    }
    
    static int findMatchingIndex(int divident[],int divisor,int quotient, int remainder){
        
        for(int i=0;i<divident.length;i++){
            if(divident[i]/divisor==quotient&&divident[i]%divisor==remainder) return i;
        }
        return -1;
    }
    //thunder under
    static String checkRhyming(String word,String []Dictionary){
        for(int i=0;i<Dictionary.length;i++){
            int index=word.indexOf(Dictionary[i].charAt(0));
            if(index!=-1&&index!=0&& word.substring(index).equals(Dictionary[i])){
                return Dictionary[i];
                
            }
        }
        return "";
    }
