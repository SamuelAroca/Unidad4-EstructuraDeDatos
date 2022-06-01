import java.io.*;

public class Quiz5 {
    File archivoLectura = new File("estudiantes.txt");
    BufferedReader almacenar;
    FileReader leer;
    String NombreArchivoRepo = "";
    int CantidadDatos = 0;
    static String nombreFichero = "xd .txt";
    static BufferedReader br = null;

    public Quiz5(){
        menuPrincipal();
    }

    public void menuPrincipal(){
        try {
            
            subMenu();
            int cantidad = CantidadDatos-1;
            System.out.println("La cantidad de estudiantes es: " + cantidad);
            System.out.println("\n\n\n");
            
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

    public void ListaDaros() throws IOException{
        try {
            // VARIABLES PARA PODER LEER EL ARCHIVO.
            leer = new FileReader(archivoLectura);
            almacenar = new BufferedReader(leer);
            String cadenaArchivo = "";
           // CLICLO PARA VALIDAR CADA LINEA DEL ARCHIVO.
            while ((cadenaArchivo = almacenar.readLine()) != null){
                System.out.println("\t" + cadenaArchivo);
            }
            leer.close();
            almacenar.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Error");
        }
    }

    public void subMenu(){
        int subMenuV = 0;
        CantidadDatos = CantidadDatos();
        String NombreOpcion = "";
        String separador = "|";
        String finalSig = ";";

        String[] CARNET = new String[CantidadDatos];
        String[] NOMBRES = new String[CantidadDatos];
        String[] CORREO = new String[CantidadDatos];
        String[] posiciones = new String[CantidadDatos];

        SeparacionVariables(CARNET, NOMBRES, CORREO, posiciones, separador, finalSig);

        try {
            NombreOpcion = "CARNETs";
            posiciones = OrdenPosiciones(CARNET, posiciones);
            GenerarReporte(NombreOpcion, CARNET, NOMBRES, CORREO, posiciones);
            Dibujar();
            
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

    public static void Dibujar() {

        try {
            ArbolBinario arbol;
            Nodo a1, a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12,a13,a14, a,b,arbolbb;
            br = new BufferedReader(new FileReader(nombreFichero));
            String texto = br.readLine();

            while(texto !=null){
                a10 = ArbolBinario.nuevoArbol(null, texto, null); //Hamlet
                texto = br.readLine();
                a3 = ArbolBinario.nuevoArbol(null, texto, null); //giancarlo
                texto = br.readLine();
                a5 = ArbolBinario.nuevoArbol(a10, texto, a3); //keny
                texto = br.readLine();

                a13 = ArbolBinario.nuevoArbol(null, texto, null);//fernei
                texto = br.readLine();
                a1 = ArbolBinario.nuevoArbol(null, texto, null);//aroca
                texto = br.readLine();
                a6 = ArbolBinario.nuevoArbol(a13,texto,a1);//kevin
                texto = br.readLine();


                a9=ArbolBinario.nuevoArbol(a5, texto, a6); //Kamila
                texto = br.readLine();

                //Parte Derecha
                a2 = ArbolBinario.nuevoArbol(null, texto, null);//blanco
                texto = br.readLine();

                a4 = ArbolBinario.nuevoArbol(a2, texto, null); //jim
                texto = br.readLine();

                a7 = ArbolBinario.nuevoArbol(null, texto, null); //yesica
                texto = br.readLine();
                a8 = ArbolBinario.nuevoArbol(null, texto, null); //jamir
                texto = br.readLine();
                a11 = ArbolBinario.nuevoArbol(a7, texto, a8); //juan pablo
                texto = br.readLine();


                a12 = ArbolBinario.nuevoArbol(a4, texto, a11);//angel
                texto = br.readLine();

                arbolbb = ArbolBinario.nuevoArbol(a9, texto, a12); //yuneidy
                texto = br.readLine();
                arbol = new ArbolBinario(arbolbb);
                ArbolBinario.dibujar("",false, arbol.raiz);
            }
        } catch (Exception e) {
            System.out.println("Error"+e.getMessage());
        }
    }

    public int CantidadDatos(){
        int cantidad = 0;
        
        try {
            leer = new FileReader(archivoLectura);
            almacenar = new BufferedReader(leer);
            
            // PRIMER CICLO QUE RECORRERA LINE POR LINEA AL ARCHIVO "ENTADA.TXT".
            while(almacenar.readLine() != null){
                cantidad++;
            }
            almacenar.close();
            leer.close();
        } catch (Exception ex) {
            System.out.println("Error");
        }
        return cantidad;
    }

    public void SeparacionVariables(String[] CARNET,String[] NOMBRE,String[] CORREO,String[] posiciones,String separador,String finalizacion){
        try {
            
            int NumeroDatos = 0;
            
            leer = new FileReader(archivoLectura);
            almacenar = new BufferedReader(leer);
            String Cadena = "";
            
            
            while((Cadena = almacenar.readLine()) != null){
                int tempContador = 0;
                StringBuilder carnet = new StringBuilder();
                StringBuilder nombre = new StringBuilder();
                StringBuilder correo = new StringBuilder();

                for (int i = 0; i < Cadena.length(); i++) {

                    if(Cadena.charAt(i) != finalizacion.charAt(0)) {
                        if (Cadena.charAt(i) != separador.charAt(0)){

                            switch (tempContador) {
                                case 0 -> carnet.append(Cadena.charAt(i));
                                case 1 -> nombre.append(Cadena.charAt(i));
                                case 2 -> correo.append(Cadena.charAt(i));
                            }
                        } else {
                            tempContador ++;
                        }
                    }
                }
                CARNET[NumeroDatos] = carnet.toString();
                NOMBRE[NumeroDatos] = nombre.toString();
                CORREO[NumeroDatos] = correo.toString();
                posiciones[NumeroDatos] = String.valueOf(NumeroDatos);
                NumeroDatos++;
            }
            almacenar.close();
            leer.close();
        } catch(Exception ex){
            System.out.println("Error");
        }
    }

    public String[] OrdenPosiciones(String[] VectorOrden,String[] posiciones){
        String[] VectorTemp = new String[CantidadDatos];
        System.arraycopy(VectorOrden, 0, VectorTemp, 0, VectorOrden.length);
        
        for (int i = 0; i < VectorTemp.length; i++) {
            for (int j = 0; j < VectorTemp.length && i != j ; j++) {
                if(VectorTemp[i].compareToIgnoreCase(VectorTemp[j]) < 0){
                    String aux = VectorTemp[i];
                    VectorTemp[i] = VectorTemp[j];
                    VectorTemp[j] = aux;
                    // -----------------------
                    String auxPosicion = posiciones[i];
                    posiciones[i] = posiciones[j];
                    posiciones[j] = auxPosicion;
                }
            }
        }
        for (String DatosOrden : VectorTemp) {
            System.out.println("\t\t\t" + DatosOrden);
        }
        return posiciones;
    }

    public void GenerarReporte(String nomOpcion, String[] CARNET, String[] NOMBRE, String[] CORREO,String[] posiciones) throws IOException{
        FileWriter fichero = null;
        PrintWriter pw = null;
        String AdressArchivo = "xd " + ".txt";
        
        File file = new File(AdressArchivo);
        if (!file.exists()) {
           file.createNewFile();
        }
        try {
            
            fichero = new FileWriter(AdressArchivo);
            pw = new PrintWriter(fichero);
            
            for (int i = 1; i < posiciones.length; i++) {
                int TemPos =Integer.parseInt(posiciones[i]);
                pw.println(CARNET[TemPos]  + NOMBRE[TemPos]  + CORREO[TemPos]);
            }
            System.out.println("\033[36m \t\t==============================");
            System.out.println("\033[36m \t\tREPORTE GENERADO CON EXITO :)\n"
                                    + "\033[36m\t" + AdressArchivo );
            System.out.println("\033[36m \t\t==============================\n");
            
        } catch (Exception ex) {
            System.out.println("Error");
        } finally{
            if (null != fichero)
              fichero.close();
        }
    }
}