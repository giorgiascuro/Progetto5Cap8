public class DistribuzioneVoti {
   private int ottimo;
   private int buono;  
   public void setOttimo(int numero) {
       ottimo = numero;
    }
   public void setBuono(int numero) {
       buono = numero;
    }
   public int getOttimo() {
       return ottimo;
    }
   public int getBuono() {
       return buono;
    }
   private int somma() {
       int somma = ottimo + buono;
       return somma;
    }
   public int percentualeOttimo() {
       int percentuale = (ottimo * 100) / somma();
       return percentuale;
    }
   public int percentualeBuono() {
       int percentuale = (buono * 100) / somma();
       return percentuale;
    }
   public void grafico() {
       int asterischiOttimo = percentualeOttimo() / 2;
       int asterischiBuono = percentualeBuono() / 2;
       for (int numero = 0; numero <= asterischiOttimo; numero++) {
          System.out.print("*");
        }
       System.out.println("OTTIMO");
       for (int numero = 0; numero <= asterischiBuono; numero++) {
          System.out.print("*");
        }
       System.out.println("BUONO");
    }
}
       
       
       
       
       
  
        
   
        
    
    
    
    
    
    