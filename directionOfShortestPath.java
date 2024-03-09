public class directionOfShortestPath {
    public static float shortestPath(String path){
        int x = 0, y=0;
        for(int i =0; i<path.length(); i++){
            char dir = path.charAt(i);
            //south
            if(dir=='S'){
                y--;
            }
            //north
            else if(dir=='N'){
                y++;
            }
            //west
           else if(dir=='W') {
                x--;
            }
            else{
                x++;
            }

        }
        int x2= x*x;
        int y2= y*y;
        return (float) Math.sqrt(x2+y2);
    }
    public static void main(String[] args) {
        String str = "WNEENSSSN";
        System.out.println(shortestPath(str));
    }
    
}