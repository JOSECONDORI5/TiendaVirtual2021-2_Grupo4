
package tienda.models;

public class Camara {
    private String principal;
    private String posterior;
    private String profundidad;
    
    public Camara() {
    }

    public String getProfundidad() {
        return profundidad;
    }

    public void setProfundidad(String profundidad) {
        this.profundidad = profundidad;
    }

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    public String getPosterior() {
        return posterior;
    }

    public void setPosterior(String posterior) {
        this.posterior = posterior;
    }

    @Override
    public String toString() {
        return "Camara{" + "principal=" + principal + ", posterior=" + posterior + ", profundidad=" + profundidad + '}';
    }
    
}
