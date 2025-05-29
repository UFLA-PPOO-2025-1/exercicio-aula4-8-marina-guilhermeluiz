import java.awt.Color;

public class VisaoDeTexto implements VisaoSimulador {
    private EstatisticasCampo estatistica;
    private Campo campo;

    public VisaoDeTexto(Campo campo){
        estatistica = new EstatisticasCampo();
        this.campo = campo;
    }

    @Override
    public void definirCor(Class<?> classeAnimal, Color cor){
        //não é necessário implementar.
    }

    @Override
    public boolean ehViavel(Campo campo){
        return estatistica.ehViavel(campo);
    }

    
    public void mostrarStatus(int passo, Campo campo){
        estatistica.reiniciar();
        String resposta = "Passo " + passo + " - " + estatistica.obterDetalhesPopulacao(campo);
        System.out.println(resposta);
    }

    @Override
    public void reiniciar(){
        estatistica.reiniciar();
    }

    @Override
    public void reabilitarOpcoes(){
        //não é necessário implementar.

    }

}