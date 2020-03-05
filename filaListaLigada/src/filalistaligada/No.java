package filalistaligada;

/**
 *
 * @author luca
 */
public class No {
    private Object elemento;
    private No proximo;

    public No(Object elemento) {
      this.elemento = elemento;
      this.proximo = null;
    }

    public Object getElemento() {
      return this.elemento;
    }

    public void setElemento(Object elemento) {
      this.elemento = elemento;
    }

    public No getProximo() {
      return this.proximo;
    }

    public void setProximo(No proximo) {
      this.proximo = proximo;
    }
}

