package sid.org.clientservice.Repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import sid.org.clientservice.Entity.Client;
@RepositoryRestResource
public interface ClientRepostorys extends JpaRepository<Client,Long> {
}
