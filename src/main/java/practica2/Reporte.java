
package practica2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;


public class Reporte {
    
    private int Icosto;
    private int Pcosto;
    private int Ecosto;
    private int Scosto;
    private String ruta = "C:\\Users\\joz\\OneDrive\\Documentos\\NetBeansProjects\\practica2\\reporte.html";

    
    
    
    public Reporte() {
        
    }
    
    private String style(){
     String style = 
             "table, td {\n" +
"        border:2px solid black;\n" +
"      }\n" +
"      table {\n" +
"        border-collapse:collapse;\n" +
"        width:25%;\n" +
"      }\n" +
"      td {\n" +
"        padding:20px;\n" +
"      }";
             
        return style;
    }
    
    private String reportebody(String costoinv,String costopro, String costoem,
                                  String costosa, String totalinv, String totalpro, String totalem,
    String totalsa){
    String body = 
            "<font face=\"Calibri\">\n" +
"    \n" +
"      <table>\n" +
"        <tr>\n" +
" 	<td colspan=\"4\"><b>Monkey</b> </td>      \n" +
"        </tr>\n" +
"      <tr>\n" +
" 	<td colspan=\"4\"> Reporte Proceso </td>      \n" +
"        \n" +
"        \n" +
"          </tr>\n" +
"   \n" +
"	 <tr>\n" +
" 	<td colspan=\"2\">Sector </td>      \n" +
"         <td> Costo por producto </td>\n" +
"        <td> Total </td>\n" +
"        \n" +
"          </tr>\n" +
"      <tr>\n" +
" 	<td colspan=\"2\">Inventario  <br/> Produccion <br/> Empaquetado <br/> Salida </td> \n" +
"        <td > "+ costoinv +"  <br/> "+costopro +" <br/> "+costoem+" <br/> "+costosa+" </td>\n" +
"        <td > "+totalinv+"  <br/> "+totalpro+" <br/> "+totalem+" <br/> "+totalsa+" </td>\n" +
"        </tr>\n" +
"\n" +
"          <tr>\n" +
" 	<td colspan=\"4\"> </td>      \n" +
"        \n" +
"        \n" +
"          </tr>\n" +
"         \n" +
"    </table>\n" +
"\n" +
"\n" +
       "</font>";
       
      return body;  
    }
    
    
    public void reporte(String costoinv,String costopro, String costoem,
                                  String costosa, String totalinv, String totalpro, String totalem,
    String totalsa){
      
  
   
        
        String body = reportebody(costoinv,costopro,costoem,costosa,totalinv,totalpro,totalem, totalsa);
        String Style = style();
        
        String html = "<html>"
                       + "<head>"
                       + "<meta charset=\"utf-5\">"
                       + "<title>Factura</title>"
                       + "<style>"
                       + Style
                       + "</style>"
                       + "</head>"
                       + "<body>"
                       + body
                       + "</body>"
                       + "</hmtl>";
        
        File file = new File(getRuta());
        
        try {

            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write(html);
            bw.close();
            

        } catch (Exception e) {
            e.printStackTrace();
        }
       
        
        
    }

    public String getRuta() {
        return ruta;
    }
    
    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
    
    
}
