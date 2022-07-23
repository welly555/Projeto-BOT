public class UsuarioCad extends UsuarioProxy{

  protected Curriculo curriculo = new Curriculo();
  private String empresaTrab;

  public void setCurriculo(Curriculo curriculo){
    this.curriculo = curriculo;
  }
  public Curriculo getCurriculo(){
    return curriculo;
  }
  public void setEmpresaTrab(String empresaTab){
    this.empresaTrab = empresaTab;
  }
  public String getEmpresaTrab(){
    return empresaTrab;
  }

  
  
  
}

 