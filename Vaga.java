import java.util.ArrayList;


public class Vaga{

  private String nomeVaga;
  private int idVaga;
  private String descricaoVaga;
  private String remuneracao;
  private ArrayList<Curriculo> curriculos = new ArrayList<Curriculo>();

  public Vaga(){};

  public void setNomeVaga(String nomeVag){
    this.nomeVaga = nomeVag;
  }
  public String getNomeVaga(){
    return nomeVaga;
  }
  public void setIDVaga(int idVag){
    this.idVaga = idVag;
  }
  public int getIDVaga(){
    return idVaga;
  }
  
  public void setDescricaoVaga(String descricaoVaga){
    this.descricaoVaga = descricaoVaga;
  }
  public String getDescricaoVaga(){
    return descricaoVaga;
  }
  public void setRemuneracao(String remuneracao){
    this.remuneracao = remuneracao;
  }
  public String getremuneracao(){
    return remuneracao;
  }
  /*public void setCurriculos(ArrayList<Curriculo> curriculos){
    this.curriculos = curriculos;
  }*/
  public ArrayList<Curriculo> visualizarCurriculos(){
    return curriculos;
  }

  public void addCurriculo(Curriculo curriculo){
    this.curriculos.add(curriculo);
  }

  
}