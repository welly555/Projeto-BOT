public class Curriculo{

  private String nomeUsuario;
  private String telefone;
  private String email;
  private String descricao;
  private String formacao;

  public Curriculo(){}

  public Curriculo(String nomeUsuario, String telefone, String email, String descricao, String formacao){
    this.nomeUsuario = nomeUsuario;
    this.telefone = telefone;
    this.email = email;
    this.descricao = descricao;
    this.formacao = formacao;
  }

  public void setNomeUsuario(String nomeUsuario){
    this.nomeUsuario = nomeUsuario;
  }

  public String getNomeUsuario(){
    return this.nomeUsuario;
  }

  public void setTelefone(String telefone){
    this.telefone = telefone;
  }

  public String getTelefone(){
    return this.telefone;
  }

  public void setEmail(String email){
    this.email = email;
  }

  public String getEmail(){
    return this.email;
  }

  public void setDescricao(String descricao){
    this.descricao = descricao;
  }

  public String getDescricao(){
    return this.descricao;
  }

  public void setFormacao(String formacao){
    this.formacao = formacao;
  }

  public String getFormacao(){
    return this.formacao;
  }
}