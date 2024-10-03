package com.tortas.microservice.service.Image;

import com.tortas.microservice.dto.ImageDto;
import com.tortas.microservice.model.Image;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface IImageService {
    Image getImageById(Long id);
    void deleteImageById(Long id);
    List<ImageDto> saveImages(List<MultipartFile> file, Long productId);
    void updateImage(MultipartFile file, Long imageId);
}
