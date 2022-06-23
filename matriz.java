public class matriz{
  //atributos de la clase matriz
  private int [][] matriz;
  private int DIMX;
  private int DIMY;
  
  
  
  //metodo constructor vacio de la clase;
  public matriz(){
  }
  
  //metodo constructor con parametros en donde le pasamos los parametros DIMX y DIMY de la matriz
  public matriz(int DIMX,int DIMY){
  this.DIMX=DIMX;
  this.DIMY=DIMY;
  }
  
  //metodos gets y sets
  public void setDIMX(int DIMX){
  this.DIMX=DIMX;
  }
  public void setDIMY(int DIMY){
  this.DIMY=DIMY;
  }
  public void setmatriz(int [][]matriz){
  this.matriz=matriz;
  }
  public int getDIMX(){
  return DIMX;
  }
  public int getDIMY(){
  return DIMY;
  }
  //metodos funcionales
  //metodo esvacia, que mira si una matriz es vacia,que significa que todos los elementos de su matriz son 0.
  //en el momento en que algun elemento sea distinto a 0, automaticamente para el recorrido y devuelve un false.
  //si una matriz es vacia, quiere decir que esta escalonada y por lo tanto es lo primero que veremos
  public boolean esVacia(){
    booleaan esvacia=true;
    for(int i =0; i<DIMX; i++){
        for(int j=0;j <DIMY; j++){
            if(matriz[i][j]!=0){
                esvacia=false;
                break;
            }
              
        }
    }
    return esvacia;
  }
  //metodo filascorrectas,que es un metodo el cual mira si las posiciones posteriores en donde se ha encontrado una fila vacia, siguen siendo vacias, en caso
  //de que alguna fila no vacia este debajo de una vacia, esto querra decir que no es una matriz escalonada
  
  public boolean filas correctas(){
    boolean filaschek=true;
    int posicion=0;
    for(int i=0;i <DIMX;i++){
      if(filaVacia(matriz[i])){
        break;
      }
      else{
        posicion++;
      }
    }
    if(posicion!=DIMX){
    for(int k=posicion+1;k<DIMX;k++){
      if(filaVacia(matriz[k])){
        filaschek=true;
      }
      else{
        filaschek=false;
        break;
      }
    }
    }
    return filaschek;
  }
  //metodo pivotesCorrectos en donde lo que hacemos es mirar el pivote de una fila, que sera el primer elemento que encontremos de esa fila de tal forma
  //que sea distinto de 0 y comprobamos si ese pivote cumple con las condiciones.
  private boolean privotesCorrectos(){
    int pivote=-1;
    boolean pivoteCorrecto=false;
    for(int i=0;i<DIMX;){
      for(int j=0;j<DIMY;j++){
        if(matriz[i][j]!=0){
          //confirmamos que el pivote este en la posicion correcta, es decir en el lado derecho del anterior pivote
          if(j>pivote){
            //guardamos esa posicion en pivote
            pivote=j;
            //confirmamos que ese pivote tiene todas las posiciones posteriores de su columna pivote en 0
            if(pivote(i,pivote)){
              privoteCorrecto=true;
            }
            else{
              //si hay algun pivote que no lo cumple, pues paramos el recorrido
              pivoteCorrecto=false;
              break;
            } 
          }
          //cuando hayamos encontrado ya el pivote y hayamos visto que cumple la condicion de ser pivote pues pasamos a la siguiente fila y 
          //inicializamos otravez j a 0.
          i++;
          j=0;
        }
      } 
    }
    return pivoteCorrecto;
  }
  //metodo filaVacia que tiene  como ebjetivo ver si la fila que le pasamos por parametro es vacia o no
  private boolean filaVacia(int []) p){
    boolean filavacia=false;
    for(int i=0;i<p.length;i++){
        if(p[i]==0){
          filavacia=true;
        }
        else{
          filavacia=false;
          break;
        }
    }
    return filavacia;
  }
  //metodo pivote el cual confirma si un pivote es un pivote real, esto lo hacemos mirando que las posiciones que estan por debajo de el sean 0.
  private boolean pivote(int i,int pivote){
    boolean pivote=false;
    for(int k =i+1; k<DIMX;k++){
      if(matriz[k][pivote]==0){
        pivote=true;
      }
      else{
        pivote=false;
        break;
      }
    }
    return pivote;
  }
  }
