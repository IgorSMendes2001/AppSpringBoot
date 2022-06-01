package br.com.squadra.bootcamp.exceptions;

public class AprendendoExcessoes {
    public static void main(String[] args) {
        try{
            validarCampo("", "apelido");
            System.out.println("GRAVOU COM SUCESSO");
        }catch(CampoObrigatorioException e){
            e.printStackTrace();
            System.out.println("NÃO DEU CERTO");
        }finally{
            System.out.println("EXECUTA SE DEU CERTO OU ERRADO");
        }
        System.out.println("FIM");
        
        
    }
    public static void validarCampo(String valorCampo,String nomeCampo)throws CampoObrigatorioException{
        if(valorCampo==null||valorCampo.trim().equals("")){
            throw new CampoObrigatorioException("cadastrar uf","apelido do usuário");
        }
        System.out.println("EXECUTOU SEM ERRO");
    }
}
