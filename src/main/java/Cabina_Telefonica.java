public class Cabina_Telefonica {

    private int Minuto_Llamada_local = 50;
    private int Minuto_Llamada_Distancia = 350;
    private int Minuto_Llamada_Celular = 150;
    private int Codigo_Cabina;
    private int Numero_Llamadas_Local= 0;
    private int Numero_Llamadas_Distancia= 0;
    private int Numero_Llamadas_Celular= 0;
    private String Nombre_Cabina = "";

    public Cabina_Telefonica(int Minuto_Llamada_local, int Minuto_Llamada_Distancia, int Minuto_Llamada_Celular, int Codigo_Cabina,
                             int Numero_Llamadas_Local, int Numero_Llamadas_Distancia, int Numero_Llamadas_Celular, String Nombre_Cabina) {
        this.Minuto_Llamada_local = Minuto_Llamada_local;
        this.Minuto_Llamada_Distancia = Minuto_Llamada_Distancia;
        this.Minuto_Llamada_Celular = Minuto_Llamada_Celular;
        this.Codigo_Cabina = Codigo_Cabina;
        this.Numero_Llamadas_Local = Numero_Llamadas_Local;
        this.Numero_Llamadas_Distancia = Numero_Llamadas_Distancia;
        this.Numero_Llamadas_Celular = Numero_Llamadas_Celular;
        this.Nombre_Cabina = Nombre_Cabina;
    }
    public void Mostrar_Datos_Cabina(){
        System.out.println("Nombre de la cabina: " + Nombre_Cabina);
        System.out.println("Codigo de la cabina: " + Codigo_Cabina);
        System.out.println("Valor llamada local: " + Minuto_Llamada_local + "$");
        System.out.println("El numero de llamadas es: " + Numero_Llamadas_Local);
        System.out.println("Valor llamada distancia: "+ Minuto_Llamada_Distancia + "$");
        System.out.println("El numero de llamadas es: " + Numero_Llamadas_Distancia);
        System.out.println("Valor llamada celular: " + Minuto_Llamada_Celular + "$");
        System.out.println("El numero de llamadas es: " + Numero_Llamadas_Celular);
    }
    public int Calcular_Costo_Llamadas_Local(int Minutos_llamada_local, int Valor_llamada_local) {
        return Minutos_llamada_local * Valor_llamada_local;
    }
    public int Calcular_Costo_Llamadas_Distancia(int Minutos_llamada_distancia, int Valor_llamada_distancia) {
        return Minutos_llamada_distancia * Valor_llamada_distancia;
    }
    public int Calcular_Costo_Llamadas_Celular(int Minutos_llamada_celular, int Valor_llamada_celular) {
        return Minutos_llamada_celular * Valor_llamada_celular;
    }
    public int Caluclar_Numero_Llamdas_Local(int Numero_minuto_local){
        return Numero_minuto_local ++;
    }
    public int Caluclar_Numero_Llamdas_Distancia(int Numero_minuto_distancia){
        return Numero_minuto_distancia ++;
    }
    public int Caluclar_Numero_Llamadas_Celular(int Numero_minuto_celular){
        return Numero_minuto_celular ++;
    }
    public int Tiempo_Total_Llamadas(int Minutos_local, int Minutos_distancia, int Minutos_celular){
        return Minutos_local + Minutos_distancia + Minutos_celular;
    }

    public int getMinuto_Llamada_local() {
        return Minuto_Llamada_local;
    }

    public void setMinuto_Llamada_local(int minuto_Llamada_local) {
        Minuto_Llamada_local = minuto_Llamada_local;
    }

    public int getMinuto_Llamada_Distancia() {
        return Minuto_Llamada_Distancia;
    }

    public void setMinuto_Llamada_Distancia(int minuto_Llamada_Distancia) {
        Minuto_Llamada_Distancia = minuto_Llamada_Distancia;
    }

    public int getMinuto_Llamada_Celular() {
        return Minuto_Llamada_Celular;
    }

    public void setMinuto_Llamada_Celular(int minuto_Llamada_Celular) {
        Minuto_Llamada_Celular = minuto_Llamada_Celular;
    }

    public int getCodigo_Cabina() {
        return Codigo_Cabina;
    }

    public void setCodigo_Cabina(int codigo_Cabina) {
        Codigo_Cabina = codigo_Cabina;
    }

    public int getNumero_Llamadas_Local() {
        return Numero_Llamadas_Local;
    }

    public void setNumero_Llamadas_Local(int numero_Llamadas_Local) {
        Numero_Llamadas_Local = numero_Llamadas_Local;
    }

    public int getNumero_Llamadas_Distancia() {
        return Numero_Llamadas_Distancia;
    }

    public void setNumero_Llamadas_Distancia(int numero_Llamadas_Distancia) {
        Numero_Llamadas_Distancia = numero_Llamadas_Distancia;
    }

    public int getNumero_Llamadas_Celular() {
        return Numero_Llamadas_Celular;
    }

    public void setNumero_Llamadas_Celular(int numero_Llamadas_Celular) {
        Numero_Llamadas_Celular = numero_Llamadas_Celular;
    }

    public String getNombre_Cabina() {
        return Nombre_Cabina;
    }

    public void setNombre_Cabina(String nombre_Cabina) {
        Nombre_Cabina = nombre_Cabina;
    }
}
