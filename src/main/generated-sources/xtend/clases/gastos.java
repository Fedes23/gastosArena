package clases;

import clases.monto;

@SuppressWarnings("all")
public class gastos extends monto {
  public int getMonto() {
    int _monto = this.getMonto();
    return (0 - _monto);
  }
}
