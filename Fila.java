public class Fila {
    private static Fila instancia;

    private Fila() {}

    public static synchronized Fila getInstance() {
        if (instancia == null) {
            instancia = new Fila();
        }
        return instancia;
    }

    public void ImprimeDocumento() {
        System.out.println("Documento impresso.");
    }

    public void RemoveDocumento() {
        System.out.println("Documento removido da fila.");
    }

    public void RemoveTodosDocumentos() {
        System.out.println("Todos os documentos removidos da fila.");
    }
}