package com.jap.sales;


import java.util.Objects;

public class SalesRecord {

    private String date;
    private int customerId;

    private int productCategory;

    private String paymentMethod;

    private double amount;
    private double timeOnSite;

    private int clicksInSite;



    public SalesRecord() {
    }

    public SalesRecord(String date, int customer_id, int product_category, String payment_method, double amount, double time_on_site, int clicks_in_site) {
        this.date = date;
        this.customerId = customer_id;
        this.productCategory = product_category;
        this.paymentMethod = payment_method;
        this.amount = amount;
        this.timeOnSite = time_on_site;
        this.clicksInSite = clicks_in_site;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(int productCategory) {
        this.productCategory = productCategory;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getTimeOnSite() {
        return timeOnSite;
    }

    public void setTimeOnSite(double timeOnSite) {
        this.timeOnSite = timeOnSite;
    }

    public int getClicksInSite() {
        return clicksInSite;
    }

    public void setClicksInSite(int clicksInSite) {
        this.clicksInSite = clicksInSite;
    }

    // Override the toString method


    @Override
    public String toString() {
        return "SalesRecord{" +
                "date='" + date + '\'' +
                ", customerId=" + customerId +
                ", productCategory=" + productCategory +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", amount=" + amount +
                ", timeOnSite=" + timeOnSite +
                ", clicksInSite=" + clicksInSite +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SalesRecord)) return false;
        SalesRecord that = (SalesRecord) o;
        return customerId == that.customerId && productCategory == that.productCategory && Double.compare(that.getAmount(), getAmount()) == 0 && Double.compare(that.timeOnSite, timeOnSite) == 0 && clicksInSite == that.clicksInSite && Objects.equals(getDate(), that.getDate()) && Objects.equals(paymentMethod, that.paymentMethod);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDate(), customerId, productCategory, paymentMethod, getAmount(), timeOnSite, clicksInSite);
    }

}
