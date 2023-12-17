package First_POO_Project;

public class Veiculo extends Caracteristicas implements CalcConsumo{


    @Override
    public float consumo(float media, int kilometragem){
        return media * kilometragem;
    }
}