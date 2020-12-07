
package univs.edu.util;

import java.util.List;
import univs.edu.model.PodCast;
import univs.edu.model.Usuario;
import univs.edu.view.PaginaPodcasts;

public class PodcastUtil {
    public void abrirPaginaPodcast(List<PodCast> lista, Usuario usuario){
        new PaginaPodcasts(lista, usuario).setVisible(true);
        
    }
    
}
