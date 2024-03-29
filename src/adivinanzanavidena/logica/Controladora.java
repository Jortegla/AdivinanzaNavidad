
package adivinanzanavidena.logica;

import java.util.Random;


public class Controladora {
    
    public int determinarCantEmoji(String emoji, int cant, String matriz[][] ){
        int cantEncontrada = 0;
        for(int f=0; f<matriz.length; f++){
            for(int c=0; c<matriz.length; c++){
                if(matriz[f][c].equals(emoji)){
                    cantEncontrada++;
                }
            }
        }
        
        return cantEncontrada;
    }
    
    public String[][] generarMatriz(){
        
        Random random = new Random();
        String emoji[] = {"🎅","⭐","🎄","🎁"};
        String matriz[][] = new String[4][4];
        
         for(int f=0; f<4; f++){
            for(int c=0; c<4; c++){
               matriz[f][c] = emoji[random.nextInt(emoji.length)];
            }
        
    }
        return matriz ;
    }
    
    }
