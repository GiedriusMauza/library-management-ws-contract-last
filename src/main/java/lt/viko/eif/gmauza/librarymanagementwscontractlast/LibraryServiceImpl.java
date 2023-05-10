package lt.viko.eif.gmauza.librarymanagementwscontractlast;

import javax.jws.WebService;
import lt.viko.eif.gmauza.librarymanagementwscontractlast.models.Library;
import java.util.List;

@WebService(serviceName = "LibraryService", endpointInterface = "lt.viko.eif.gmauza.librarymanagementwscontractlast.LibraryService")
public class LibraryServiceImpl implements LibraryService {


    private final LibraryRepository libraryRepositoryImpl = new LibraryRepository();

    @Override
    public Library getLibrary(String name) {
        return libraryRepositoryImpl.getLibrary(name);
    }

    @Override
    public boolean deleteLibrary(String name) {
        return false;
    }

    @Override
    public Library addLibrary(String name) {
        return null;
    }

    @Override
    public int countLibrary() {
        return 0;
    }

    @Override
    public List<Library> getAllLibraries() {
        return null;
    }

}
