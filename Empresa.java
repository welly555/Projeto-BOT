import java.util.ArrayList;

public class Empresa extends Usuario{
  private String nomeempresa;
  private String cnpj;
  private String emailEmpresa;
  ArrayList<Vaga> vaga = new ArrayList<>();
  
  public Empresa(){
    
  }

   public void setNomeEmpresa(String nomeempresa){
    this.nomeempresa = nomeempresa;
  }

  public String getNomeEmpresa(){
    return nomeempresa;
  }

  public void setCnpj(String cnpj){
    this.cnpj = cnpj;
  }

  public String getCnpj(){
    return cnpj;
  }

  public void setEmailEmpresa(String emailEmpresa){
    this.emailEmpresa = emailEmpresa;
  }

  public String getEmailEmpresa(){
    return emailEmpresa;
  }

  public void addVaga(Vaga vaga){
    this.vaga.add(vaga);
  }

  public ArrayList<Vaga> getVaga(){
    return vaga;
  }

  public Vaga exibirVagas(String nomeVaga){
    for(Vaga v:vaga){
      if(v.getNomeVaga().equals(nomeVaga)){
        return v;
      }
    }
    return null;
  }

  public void atualizarVaga(String nomeVaga, String descricaoVaga, String remuneracao){
    for(Vaga v:vaga){
      if(v.getNomeVaga().equals(nomeVaga)){
        v.setNomeVaga(nomeVaga);
        v.setDescricaoVaga(descricaoVaga);
        v.setRemuneracao(remuneracao);
      }
    }
  }
  
}

