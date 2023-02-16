package com.casemodule4.controller;

import com.casemodule4.model.Product;
import com.casemodule4.model.ProductDetail;
import com.casemodule4.model.Size;
<<<<<<< HEAD
import com.casemodule4.repository.IProductDetailRepo;
import com.casemodule4.service.Imp.ProductDetailServiceImp;
=======
import com.casemodule4.service.ProductDetailService;
import com.casemodule4.service.ProductService;
import com.casemodule4.service.SizeService;
>>>>>>> 9d1ea54a26c96830a3a28a3f3e35b4bb42c547b2
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;

@RestController
<<<<<<< HEAD
@RequestMapping("/productDetail")
@CrossOrigin("*")
=======
@CrossOrigin
@RequestMapping("/admin")
>>>>>>> 9d1ea54a26c96830a3a28a3f3e35b4bb42c547b2
public class ProductDetailController {
    @Autowired
    ProductDetailService productDetailService;
    @Autowired
    ProductService productService;
    @Autowired
    SizeService sizeService;

    @GetMapping("/productsDetail")
    public ResponseEntity<List<ProductDetail>> getAllProductsDetail() {
        return new ResponseEntity<>(productDetailService.getAllProductsDetail(), HttpStatus.OK);
    }

    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

<<<<<<< HEAD
    @GetMapping("SingleProduct/{id}")
    public List<ProductDetail> singleProductList(@PathVariable int id){
        return productDetailServiceImp.findProductDetailByProduct_id(id);
    }

    @GetMapping("size/{id}")
    public List<Size> listSize(@PathVariable int id){
        return productDetailServiceImp.getSize(id);
    }

    @GetMapping("/{id}")
    public ProductDetail showEdit(@PathVariable int id){
        return productDetailServiceImp.findById(id);
=======
    @GetMapping("/sizes")
    public List<Size> getAllSize() {
        return sizeService.getAllSize();
>>>>>>> 9d1ea54a26c96830a3a28a3f3e35b4bb42c547b2
    }

    @PostMapping("/upImg")
    public String upImg(@RequestParam MultipartFile fileImg) {
        String nameImg = fileImg.getOriginalFilename();
        try {
            FileCopyUtils.copy(fileImg.getBytes(), new File("D:\\DailyShop Free Website Template - Free-CSS.com\\MarkUps-dailyShop\\dailyShop\\img/" + nameImg));
            return "/MarkUps-dailyShop/dailyShop/img/" + nameImg;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @PostMapping("/addProducts")
    public Product createProduct(@RequestBody Product product) {
        return productService.saveProduct(product);
    }

    @PostMapping("/addSizes")
    public Size createSize(@RequestBody Size size) {
        return sizeService.saveSize(size);
    }

    @PostMapping("/addProductDetail")
    public ProductDetail createProductDetail(@RequestBody ProductDetail productDetail) {
        return productDetailService.saveProductDetail(productDetail);
    }
    @GetMapping("/product/{idProduct}")
    public Product showEditProduct(@PathVariable int idProduct){
        return productService.findProductById(idProduct);
    }
    @GetMapping("/size/{idSize}")
    public Size showEditSize(@PathVariable int idSize){
        return sizeService.findSizeById(idSize);
    }
    @GetMapping("/productDetail/{idProductDetail}")
    public ProductDetail showEditProductDetail(@PathVariable int idProductDetail){
        return productDetailService.findProductDetailById(idProductDetail);
    }
    @PutMapping("/product/{idProduct}")
    public Product editProduct(@RequestBody Product product){
        return productService.saveProduct(product);
    }
    @PutMapping("/size/{idSize}")
    public Size editSize(@RequestBody Size size){
        return sizeService.saveSize(size);
    }
    @PutMapping("/productDetail/{idProductDetail}")
    public ProductDetail editProductDetail(@RequestBody ProductDetail productDetail){
        return productDetailService.saveProductDetail(productDetail);
    }
    @DeleteMapping("/product/{idProduct}")
    public Product deleteProduct(@PathVariable int idProduct) {
        return productService.deleteProductById(idProduct);
    }

    @DeleteMapping("/size/{idSize}")
    public Size deleteSize(@PathVariable int idSize) {
        return sizeService.deleteSize(idSize);
    }
    @DeleteMapping("/productDetail/{idProductDetail}")
    public ProductDetail deleteProductDetail(@PathVariable int idProductDetail) {
        return productDetailService.deleteProductDetailById(idProductDetail);
    }

    @GetMapping("findById/{id}")
    public ProductDetail productDetail(@PathVariable int id){
        return productDetailServiceImp.findById(id);
    }
}

