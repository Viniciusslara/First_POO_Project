package First_POO_Project;

public class TipoCombustivel{

    public float combustao(float media, float precoComb){
        return media * precoComb;
    }

    public float eletrico(float media, float precoKw){
        return media * precoKw;
    }
}