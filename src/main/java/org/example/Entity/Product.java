package org.example.Entity;

import jakarta.persistence.*;

import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private Double price;
    private Integer quantity;
    private String description;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;


    @CreationTimestamp
    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name="updated_at")
    private LocalDateTime updatedAt;

    public Category getCategory() { return category; }

    public void setCategory(Category category) { this.category = category; }


    public Product() { }

    public long getId() { return id; }
    public String getName() { return name; }
    public Double getPrice() { return price; }
    public Integer getQuantity() { return quantity; }
    public String getDescription() { return description; }
    public LocalDateTime getCreatedAt() { return createdAt; }
    public LocalDateTime getUpdatedAt() { return updatedAt; }

    public void setName(String name) { this.name = name; }
    public void setPrice(Double price) { this.price = price; }
    public void setQuantity(Integer quantity) { this.quantity = quantity; }
    public void setDescription(String description) { this.description = description; }


}
