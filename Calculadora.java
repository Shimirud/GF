import javax.swing.*;

public class Calculadora {

    public static void main(String[] args) {
        menuCalculadora();
    }

    public static void menuCalculadora() {
        String menu = "Calculadora Gestión Financiera - 2021-II\n"
                        + "1. Razón Corriente\n"
                        + "2. Razón de la Prueba Ácida\n"
                        + "3. Índice de Liquidez\n"
                        + "4. Capital de Trabajo\n"
                        + "5. Cuentas por Cobrar\n"
                        + "6. Cuentas por Pagar\n"
                        + "7. Rotación de Inventarios\n"
                        + "7. Salir\n"
                        + "\n Ingrese el número correspondiente de la acción a ejecutar", opcion;
        opcion = JOptionPane.showInputDialog(null, menu);
        dosvalores(opcion);
    }


    public static void dosvalores(String opcion){
        String activoCorriente, pasivoCorriente, activoDisponible;

        switch (opcion) {
            case "1":
                activoCorriente = ingresoActivoCorriente();
                pasivoCorriente = ingresoPasivoCorriente();
                
                if(activoCorriente == "0" || pasivoCorriente == "0"){
                    JOptionPane.showMessageDialog(null, "Uno de los datos es inválido.");
                }else {
                    razonCorriente(activoCorriente, pasivoCorriente);
                }
                break;

            case "3":
                activoDisponible = ingresoActivoDisponible();
                pasivoCorriente = ingresoPasivoCorriente();
                
                if(activoDisponible == "0" || pasivoCorriente == "0"){
                    JOptionPane.showMessageDialog(null, "Uno de los datos es inválido.");
                }else {
                    indiceLiquidez(activoDisponible, pasivoCorriente);
                }
                break;

            case "8":
                System.exit(0);
                break;
        
            default:
                JOptionPane.showMessageDialog(null, "Ha ingresado una opción inválida");
                break;
        }
    }

    public static String ingresoActivoCorriente(){
        String actCorr = "Ingrese el Activo Corriente";
        String activoCorriente = JOptionPane.showInputDialog(actCorr);

        return activoCorriente;
    }

    public static String ingresoPasivoCorriente(){
        String pasCorr = "Ingrese el Pasivo Corriente";
        String pasivoCorriente = JOptionPane.showInputDialog(pasCorr);

        return pasivoCorriente;
    }

    public static String ingresoActivoDisponible(){
        String actDisp = "Ingrese el Activo Disponible";
        String activoDisponible = JOptionPane.showInputDialog(actDisp);

        return activoDisponible;
    }




    public static void valorInvalido(){
        JOptionPane.showMessageDialog(null, "Un dato no fue válido");
    }


    public static void razonCorriente(String activoCorriente, String pasivoCorriente){
        try {
            
            double resultado = Double.parseDouble(activoCorriente) / Double.parseDouble(pasivoCorriente);
            JOptionPane.showMessageDialog(null, "La Razón Corriente es: "+ resultado);
            
        } catch (Exception ex) {
            
            valorInvalido();
        } finally {

            menuCalculadora();
        }
    }

    public static void indiceLiquidez(String activoDisponible, String pasivoCorriente){
        try {
            
            double resultado = Double.parseDouble(activoDisponible) / Double.parseDouble(pasivoCorriente);
            JOptionPane.showMessageDialog(null, "El Índice de Liquidez es: "+ resultado);
            
        } catch (Exception ex) {
            
            valorInvalido();
        } finally {

            menuCalculadora();
        }
    }

}

