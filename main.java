public class main{
  public static void main(String [] args){
    main s = new main();
    s.inicio();
  }
  public void inicio(){
        int[][] numeros = new int[][]{{7, 0, 0}, {0, 0, 0}, {0, 1, 0}};
        int dimensionx = numeros.length;
        matriz m = new matriz(dimensionx, numeros[0].length);
        m.setmatriz(numeros);

        System.out.println(m);
        if (!m.esVacia()) {
            if (m.filascorrectas()) {
                if (m.privotesCorrectos()) {
                    System.out.println(true);
                } else {
                    System.out.println(false);
                }
            } else {
                System.out.println(false);
            }
        } else {
            System.out.println(true);
        }
  }
}
