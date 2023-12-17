package First_POO_Project;

public class TipoCombustivel{

    private float combustao(float media, float precoComb){
        return media * precoComb;
    }

    private float eletrico(float media, float precoKw){
        return media * precoKw;
    }
}