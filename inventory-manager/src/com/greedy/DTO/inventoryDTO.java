package com.greedy.DTO;

public class inventoryDTO
{
    private int productCode;
    private String productName;
    private int productCost;
    private int productPrice;
    private String usedProduct;
    private int localCode;

    public inventoryDTO() {}

    public inventoryDTO(int productCode, String productName, int productCost, int productPrice, String usedProduct, int localCode)
    {
        this.productCode = productCode;
        this.productName = productName;
        this.productCost = productCost;
        this.productPrice = productPrice;
        this.usedProduct = usedProduct;
        this.localCode = localCode;
    }

    public int getProductCode() {  return productCode;}

    public void setProductCode(int productCode) { this.productCode = productCode; }

    public String getProductName() {  return productName; }

    public void setProductName(String productName) {this.productName = productName; }

    public int getProductCost() { return productCost;}

    public void setProductCost(int productCost) {this.productCost = productCost;}

    public int getProductPrice() { return productPrice; }

    public void setProductPrice(int productPrice) {this.productPrice = productPrice; }

    public String getUsedProduct() {return usedProduct;}

    public void setUsedProduct(String usedProduct) { this.usedProduct = usedProduct;}

    public int getLocalCode() {  return localCode;}

    public void setLocalCode(int localCode) {  this.localCode = localCode;}

    @Override
    public String toString()
    {
        return "inventoryDTO{" +
                "productCode=" + productCode +
                ", productName='" + productName + '\'' +
                ", productCost=" + productCost +
                ", productPrice=" + productPrice +
                ", usedProduct='" + usedProduct + '\'' +
                ", localCode=" + localCode +
                '}';
    }
}

