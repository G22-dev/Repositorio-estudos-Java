package Poo;

public class IPhone {
    public static void main(final String[] args) {

        final AparelhoTelefonico aparelhoTelefonico = new AparelhoTelefonico();
        aparelhoTelefonico.setNumero("123456789");  
        aparelhoTelefonico.setTocar("Tocando");
        aparelhoTelefonico.setAtender("Atendendo chamada");
        
        System.out.println("=============================================================");
        System.out.println("Número: " + aparelhoTelefonico.getNumero());
        System.out.println("Tocar: " + aparelhoTelefonico.getTocar());  
        System.out.println("Atender: " + aparelhoTelefonico.getAtender());

        final NavegadorInternet navegadorInternet = new NavegadorInternet();
        navegadorInternet.setPaginaUrl("https://www.google.com");
        navegadorInternet.setNovaAba("Abrindo nova aba");
        navegadorInternet.setAtualizarPagina("Atualizando página");

        System.out.println("=============================================================");
        System.out.println("Página URL: " + navegadorInternet.getPaginaUrl());
        System.out.println("Nova Aba: " + navegadorInternet.getNovaAba());
        System.out.println("Atualizar Página: " + navegadorInternet.getAtualizarPagina());

        final ReprodutorMusica reprodutorMusica = new ReprodutorMusica();
        reprodutorMusica.setTocar("Tocando música");
        reprodutorMusica.setPausar("Pausando música");
        reprodutorMusica.setTocarMusica("Pulando música");
        
        System.out.println("=============================================================");
        System.out.println("Tocar Música: " + reprodutorMusica.getTocar());
        System.out.println("Pausar Música: " + reprodutorMusica.getPausar());
        System.out.println("Tocar Música: " + reprodutorMusica.getTocarMusica());
        System.out.println("=============================================================");
     



  
    
        
        
    }
}