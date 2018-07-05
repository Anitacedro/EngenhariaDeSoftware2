/**
 *
 * @author Eduardo
 */

/**
import model.Pessoa;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AdcionarObjeto {
    public static void main(String[] args) {
    Configuration conf = new Configuration();
    conf.configure();
    SessionFactory factory = conf.SessionFactory();
    Session session = factory.openSession();

    Transaction trans = session.beginTransaction();
     //cria um novo objeto da classe Produto
    Pessoa pessoa = new Pessoa();
    pessoa.setNomeCompleto("Eduardo");
    pessoa.setEmail("dudu@email.com");

     session.save(pessoa); /*salva o objeto na sessão do Hibernate
                            se for usado o comando saveOrUpdate(), o Hibernate irá inserir
                            no banco de dados caso seja um novo objeto (new Produto())
                            ou alterar se for um objeto já existente*/

    //trans.commit(); //confirma a transação salvando o objeto no banco de dados

  //   session.close();
//     }
//}   
 

