
package univs.edu.util;

import java.util.List;
import univs.edu.model.PodCast;
import univs.edu.view.PaginaPodcasts;

public class PodcastUtil {
    public void abrirPaginaPodcast(List<PodCast> lista){
        new PaginaPodcasts(lista).setVisible(true);
        
    }
    
}
