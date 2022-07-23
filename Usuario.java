public abstract class Usuario{
  
  protected String login;
  protected String senha;

  public Usuario(){}

  public Usuario(String login, String senha){
    this.login = login;
    this.senha = senha;
  }

  public void setLogin(String login){
    this.login = login;
  }

  public String getLogin(){
    return this.login;
  }

  public void setSenha(String senha){
    this.senha = senha;
  }

  public String getSenha(){
    return this.senha;
  }
}