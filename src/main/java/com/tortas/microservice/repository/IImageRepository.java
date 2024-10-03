package com.tortas.microservice.repository;


import com.tortas.microservice.model.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IImageRepository extends JpaRepository<Image, Long> {
}
