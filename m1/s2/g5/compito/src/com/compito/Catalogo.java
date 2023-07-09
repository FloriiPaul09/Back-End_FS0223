package com.compito;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.apache.commons.io.FileUtils;

public class Catalogo {
    private static final Logger logger = LoggerFactory.getLogger(Catalogo.class);
    private static final String TAG = "Catalogo.txt";

    
    private Map<String, ElemLetteratura> archive;

    public Catalogo(){
        this.archive = new HashMap<String, ElemLetteratura>();
    }

    public void add(ElemLetteratura newLettera) { 
        archive.put(newLettera.getIsbn(), newLettera);
        logger.info("Elemento aggiunto, ISBN{} pubblicato il {}", newLettera.getIsbn(), newLettera.getYearPub());

    
    }

    public void delete(String isbn){
        ElemLetteratura removeElem = archive.remove(isbn);
        if(removeElem != null){
            logger.info("Elemento rimosso", removeElem.getIsbn(), removeElem.getYearPub());
        }
    }

    public ElemLetteratura searchIsbn(String isbn){
        return archive.get(isbn);
    }

    public List<ElemLetteratura> searchYear(Integer yearPub){
        return archive.values().stream().filter(e -> yearPub.equals(e.getYearPub())).collect(Collectors.toList());
    }

    public List<Book> searchAuth(String auth){
        return archive.values().stream().filter(e -> e instanceof Book).map(e -> (Book) e)
                        .filter(e -> auth.equals(e.getAuth())).collect(Collectors.toList());
    }

    public void saveCatalogo() throws IOException{
        String fileHello = "";

        for (ElemLetteratura elem : archive.values()){
            if(fileHello.length() != 0){
                fileHello += "§";
            }
            if(elem instanceof Book){
                fileHello += Book.toStringFile((Book)elem);
            } else if(elem instanceof Rivista){
                fileHello += Rivista.toStringFile((Rivista)elem);
            }
        }

        File file = new File(TAG);
        FileUtils.writeStringToFile(file, fileHello, "UTF-8");
        logger.info("Data saved successfully" + TAG);

    }

    public void putCatalogo() throws IOException{
        this.archive.clear();

        File file = new File(TAG);

        String fileStr = FileUtils.readFileToString(file, "UTF-8");

        List<String> splitElem = Arrays.asList(fileStr.split("@"));

        for(String str : splitElem){
            ElemLetteratura elem = null;
            if(str.startsWith(Book.class.getSimpleName())){
                elem = Book.fromStringFile(str);
            } else if(str.startsWith(Rivista.class.getSimpleName())){
                elem = Rivista.fromStringFile(str);
            }
            this.archive.put(elem.getIsbn(), elem);
        }
        logger.info("Data insertion was successfully" + TAG);
    }
}
