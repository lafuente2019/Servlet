package Modell;

import java.util.Date;

/**
 *
 * @author Valter Lafuente Junior
 */
public class Cliente {
    
  private int id;
  private String name;
  private String Email;
  private Date dataNascimento;

    public Cliente(int id, String name, String Email, Date dataNascimento) {
        this.id = id;
        this.name = name;
        this.Email = Email;
        this.dataNascimento = dataNascimento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", name=" + name + ", Email=" + Email + ", dataNascimento=" + dataNascimento + '}';
    }
  
  
    
  
}
