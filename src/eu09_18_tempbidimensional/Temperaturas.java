
package eu09_18_tempbidimensional;

public class Temperaturas {
    
    private int[][] temperatura;
    
    public Temperaturas(int filas, int column){
          temperatura = new int[filas][column];      
    }
    
    public void generar(){
        for (int i = 0; i < temperatura.length; i++){
            for (int j = 0; j < temperatura[i].length; j++){
                int temp = (int)(Math.random() * 20 + 15);
                temperatura[i][j] = temp;
            }
        }        
    }
    
    public void mostrar(){
        for (int[] f)
    }
    
    
    
}
