package com.libraryManagementSystem.libraryrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.libraryManagementSystem.entity.Library;

@Repository
public interface LibraryRepository extends JpaRepository<Library, Integer> {

}
