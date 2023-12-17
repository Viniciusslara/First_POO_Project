package First_POO_Project;

public class Veiculo extends Caracteristicas implements CalcConsumo{

    private String modelo;
    private String marca;

    @Override
    public float consumo(float media, int kilometragem){
        return media * kilometragem;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}