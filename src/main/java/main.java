
public class Main {

    public static void main(String[] args) {

        GestorActivos gestor = new GestorActivos();

        Servidor servidor1 = new Servidor("SRV001", "Servidor Web", 9, false, "Linux");

        Firewall firewall1 = new Firewall("FW001", "Firewall Principal", 7, false, 150);


        gestor.registrarActivo(servidor1);
        gestor.registrarActivo(firewall1);


        ActivoDigital encontrado = gestor.buscarPorCodigo("SRV001");

        if (encontrado != null) {
            System.out.println("Activo encontrado: " + encontrado.getNombre());
        }


        System.out.println("Activos críticos: " + gestor.contarActivosCriticos());


        System.out.println("Promedio de riesgo: " + gestor.calcularPromedioRiesgo());


        boolean parche = gestor.aplicarParcheActivo("SRV001");

        System.out.println("Parche aplicado: " + parche);


        System.out.println("Cantidad de activos: "
                + gestor.obtenerCantidadActivos());
    }
}