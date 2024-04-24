public class Main {
    public static void main(String[] args) {
        Fila fila = Fila.getInstance();

        fila.ImprimeDocumento();

        fila.RemoveDocumento();

        fila.RemoveTodosDocumentos();
    }
}