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

    public int getCustomer_id() {
        return customerId;
    }

    public void setCustomer_id(int customer_id) {
        this.customerId = customer_id;
    }

    public int getProduct_category() {
        return productCategory;
    }

    public void setProduct_category(int product_category) {
        this.productCategory = product_category;
    }

    public String getPayment_method() {
        return paymentMethod;
    }

    public void setPayment_method(String payment_method) {
        this.paymentMethod = payment_method;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getTime_on_site() {
        return timeOnSite;
    }

    public void setTime_on_site(double time_on_site) {
        this.timeOnSite = time_on_site;
    }

    public int getClicks_in_site() {
        return clicksInSite;
    }

    public void setClicks_in_site(int clicks_in_site) {
        this.clicksInSite = clicks_in_site;
    }

    public SalesRecord() {
    }

    @Override
    public String toString() {
        return "SalesRecord{" +
                "date='" + date + '\'' +
                ", customer_id=" + customerId +
                ", product_category=" + productCategory +
                ", payment_method='" + paymentMethod + '\'' +
                ", amount=" + amount +
                ", time_on_site=" + timeOnSite +
                ", clicks_in_site=" + clicksInSite +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SalesRecord)) return false;
        SalesRecord that = (SalesRecord) o;
        return getCustomer_id() == that.getCustomer_id() && getProduct_category() == that.getProduct_category() && Double.compare(that.getAmount(), getAmount()) == 0 && Double.compare(that.getTime_on_site(), getTime_on_site()) == 0 && getClicks_in_site() == that.getClicks_in_site() && Objects.equals(getDate(), that.getDate()) && Objects.equals(getPayment_method(), that.getPayment_method());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDate(), getCustomer_id(), getProduct_category(), getPayment_method(), getAmount(), getTime_on_site(), getClicks_in_site());
    }
}
