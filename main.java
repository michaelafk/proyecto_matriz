public class main{
  public static void main(String [] args){
    main s = new main();
    s.inicio();
  }
  public void inicio(){
    int [][] numeros = new int[]{{7,0,0},{0,0,0},{0,0,0}};
    int dimensionx=numeros.lenght();
    matriz m = new matriz(dimensionx,numeros[0].lenght());
    m.setmatriz(numeros);
    
    if(!m.esvacia()){
      if(!m.filascorrectas()){
        if(!m.pivotecorrecto){
          System.out.println(false);
        }
        else{
          System.out.println(true);
        }
      }
      else{
        System.out.println(true);
      }
    }
    else{
      System.out.println(true);
    }
  }
}
