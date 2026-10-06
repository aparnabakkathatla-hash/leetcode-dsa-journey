int n=address.length();
       String result="";
       for(int i=0;i<n;i++){
        result=address.replace(".","[.]");
       }
       return result;
