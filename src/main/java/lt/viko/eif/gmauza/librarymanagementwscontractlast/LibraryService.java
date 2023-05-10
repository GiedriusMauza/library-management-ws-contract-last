package lt.viko.eif.gmauza.librarymanagementwscontractlast;

import javax.jws.WebMethod;
import javax.jws.WebService;

import lt.viko.eif.gmauza.librarymanagementwscontractlast.models.Library;

import java.util.List;

@WebService
public interface LibraryService {

    @WebMethod
    Library getLibrary(String name);


}
