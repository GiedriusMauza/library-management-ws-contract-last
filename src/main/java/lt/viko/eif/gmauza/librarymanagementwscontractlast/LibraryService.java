package lt.viko.eif.gmauza.librarymanagementwscontractlast;

import javax.jws.WebMethod;
import javax.jws.WebService;

import lt.viko.eif.gmauza.librarymanagementwscontractlast.models.Library;

import java.util.List;

@WebService
public interface LibraryService {

    @WebMethod
    Library getLibrary(String name);

    @WebMethod
    boolean deleteLibrary(String name);

    @WebMethod
    Library addLibrary(String name);

    @WebMethod
    int countLibrary();

    @WebMethod
    List<Library> getAllLibraries();

}
