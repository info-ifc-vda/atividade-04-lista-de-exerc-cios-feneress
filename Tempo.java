public class Tempo {
    private int hora;
    private int minuto;
    private int segundo;

    public Tempo() {
        this(0, 0, 0);
    }

    public Tempo(int hora) {
        this(hora, 0, 0);
    }

    public Tempo(int hora, int minuto) {
        this(hora, minuto, 0);
    }

    public Tempo(int hora, int minuto, int segundo) {
        if (hora >= 0 && hora < 24 && minuto >= 0 && minuto < 60 && segundo >= 0 && segundo < 60) {
            this.hora = hora;
            this.minuto = minuto;
            this.segundo = segundo;
        } else {
            this.hora = 0;
            this.minuto = 0;
            this.segundo = 0;
        }
    }

    public boolean setHora(int hora) {
        if (hora >= 0 && hora < 24) {
            this.hora = hora;
            return true;
        }
        return false;
    }

    public boolean setMinuto(int minuto) {
        if (minuto >= 0 && minuto < 60) {
            this.minuto = minuto;
            return true;
        }
        return false;
    }

    public boolean setSegundo(int segundo) {
        if (segundo >= 0 && segundo < 60) {
            this.segundo = segundo;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }

    public long emSegundos() {
        return (hora * 3600L) + (minuto * 60L) + segundo;
    }

    public long diferencaEmSegundos(Tempo outro) {
        return Math.abs(this.emSegundos() - outro.emSegundos());
    }

    public void exibirInfo() {
        System.out.println("Hora atual: " + this);
    }
}
