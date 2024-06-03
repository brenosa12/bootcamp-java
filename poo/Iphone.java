package poo;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{
    public void tocar() {
        System.out.println("TOCANDO A MUSICA");
    }
    
         
    public void pausar() {
        System.out.println("PAUSANDO A MUSICA");
    }

          
    public void selecionarMusica(String musica) {
        System.out.println("SELECIONANDO A MUSICA: " + musica);
    }

    
    public void exibirPagina(String url) {
        System.out.println("EXIBINDO A PAGINA: " + url);
         }

    
    public void adicionarNovaAba() {
        System.out.println("ADICIONANDO NOVA ABA");
    }

    
    public void atualizarPagina() {
        System.out.println("ATUALIZANDO A PAGINA");
            }

    
    public void ligar(String numero) {
      System.out.println("LIGANDO PARA: "+ numero);
    }

    
    public void atender() {  
        System.out.println("ATENDO A LIGAÇÃO");  
    }

    
    public void iniciarCorreioVoz() {
        System.out.println("INICIANDO CORREIO DE VOZ");
    }

}
