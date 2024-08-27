 static void minCost(String word){
        
        int freq[]= new int[26];
        int cost=0, maxFreq=0;
        
        for(char ele: word.toCharArray())
                freq[ele-'a']++;
                
        char max='\0';
        for(char ele: word.toCharArray()) {
            if(freq[ele-'a']>maxFreq && isVowel(ele)){
                max=ele;
                maxFreq=freq[ele-'a'];
            } 
        }
        
    
        
        for(char ch: word.toCharArray()){
            if(ch==max){
                continue;
            }
            else if(isVowel(ch)){
                cost+=Math.abs(max-ch);
            }else{
                cost+=10;
            }
        }
        
        System.out.println("max cost : "+ cost);
        
        
        
        
    }
