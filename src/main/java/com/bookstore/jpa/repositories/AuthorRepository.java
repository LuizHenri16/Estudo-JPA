package com.bookstore.jpa.repositories;

import com.bookstore.jpa.models.AuthorModel;
import com.bookstore.jpa.models.PublisherModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;
import java.util.UUID;

public interface AuthorRepository extends JpaRepository<AuthorModel, UUID> {
}
