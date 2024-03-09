public class sumOfDiagonal {
    public static int diagonal(int matric[][]){
        int sum=0;
        int m=matric.length;
        int n=matric[0].length;
       // for(int i=0; i<m; i++){
        //    for(int j=0; j<n; j++){
           //     if(i==j){
            //        sum +=matric[i][j];
           //     }else if(i+j == matric.length-1){
            //        sum += matric[i][j];
            //    }
          //  }
      //  }
      for(int i =0; i<m; i++){
        //pd
        sum+=matric[i][i];
        //sd
        if(i!=matric.length-1-i)
        sum+=matric[i][matric.length-1-i];
      }
      return sum;
        
    }
    public static void main(String args[]){
        int matric[][]={{1,2},
                        {4,5}};
                       // {7,8,9}};
                        //{13,14,15,16}};

           System.out.println(diagonal(matric) );            
    }
    
}
