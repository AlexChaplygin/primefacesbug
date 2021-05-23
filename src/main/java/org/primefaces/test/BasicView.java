package org.primefaces.test;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import java.io.Serializable;
import java.util.List;

@Named("dtBasicView")
@ViewScoped
public class BasicView implements Serializable {

    private List<Product> products;
    private List<Product> selectedProducts;
    private Product selectedProduct;

    @Inject
    private ProductService service;

    @PostConstruct
    public void init() {
        products = service.getProducts(10);
    }

    public List<Product> getProducts() {
        return products;
    }

    public Product getSelectedProduct() {
        return selectedProduct;
    }

    public void setSelectedProduct(Product selectedProduct) {
        this.selectedProduct = selectedProduct;
    }

    public void setService(ProductService service) {
        this.service = service;
    }

    public List<Product> getSelectedProducts() {
        return selectedProducts;
    }

    public void setSelectedProducts(List<Product> selectedProducts) {
        this.selectedProducts = selectedProducts;
    }
}