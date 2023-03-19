package com.loanrecovery.pay.app.service;

import com.loanrecovery.pay.app.model.FileDataBase;
import com.loanrecovery.pay.app.repository.FileDataBaseRepository;
import com.loanrecovery.pay.app.util.FileConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.time.Instant;
import java.util.stream.Stream;

@Service
public class FileStorageService {

    @Autowired
    private FileDataBaseRepository fileDataBaseRepository;

    public FileDataBase store(MultipartFile file) throws IOException {
        String fileName = StringUtils.cleanPath(file.getOriginalFilename());
        FileDataBase fileDataBase = null;

        if( fileName.toLowerCase().contains(FileConstants.INITIAL)){
            fileDataBase = new FileDataBase(
                    getFileNewName(fileName), file.getContentType(), file.getBytes(),1,Boolean.FALSE);
        }else if (fileName.toLowerCase().contains(FileConstants.FINAL)) {
            fileDataBase = new FileDataBase(
                    getFileNewName(fileName), file.getContentType(), file.getBytes(),2,Boolean.FALSE);
        } else {
            fileDataBase = new FileDataBase(
                    getFileNewName(fileName), file.getContentType(), file.getBytes(),3,Boolean.FALSE);
        }
        return fileDataBaseRepository.save(fileDataBase);
    }

    public FileDataBase getFile(Long id) {
        return fileDataBaseRepository.findById(id).get();
    }

    public Stream<FileDataBase> getAllFiles() {
        return fileDataBaseRepository.findAll().stream();
    }

    private String getFileNewName(String fileName){
        return fileName+Instant.now().toString();
    }
}
