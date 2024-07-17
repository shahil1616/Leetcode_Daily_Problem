class Solution {
    boolean[][] visited;
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        visited = new boolean[image.length][image[0].length];
         find(image,sr,sc,color,image[sr][sc]);
         return image;
    }
    public void find(int[][] image, int sr, int sc, int color,int pc){
        if(sr<0||sr>=image.length||sc<0||sc>=image[0].length||  visited[sr][sc] == true   ) return;
      
      if(image[sr][sc]==pc){
         image[sr][sc]=color;
          visited[sr][sc] = true;
        find(image,sr-1,sc,color,pc);
        find(image,sr,sc+1,color,pc);
        find(image,sr+1,sc,color,pc);
      
        
        find(image,sr,sc-1,color,pc);
        
      }
        
    }
}