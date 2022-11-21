package com.jap.sales;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SalesDataAnalyzer {
    // Read the data from the file and store in a List
   public List<SalesRecord> readFile(String fileName) {
        List<SalesRecord>list=new ArrayList<>();
       try (FileReader fileReader=new FileReader(fileName);
            BufferedReader buffer=new BufferedReader(fileReader)){
           String line= buffer.readLine();
           while((line= buffer.readLine())!=null){
               String[] value=line.split(",");
               SalesRecord salesRecord=new SalesRecord();
               salesRecord.setDate(value[0]);
               salesRecord.setCustomer_id(Integer.parseInt(value[1]));
               salesRecord.setProduct_category(Integer.parseInt(value[2]));
               salesRecord.setPayment_method(value[3]);
               salesRecord.setAmount(Double.parseDouble(value[4]));
               salesRecord.setTime_on_site(Double.parseDouble(value[5]));
               salesRecord.setClicks_in_site(Integer.parseInt(value[6]));
               list.add(salesRecord);

           }

       } catch (IOException e) {
           throw new RuntimeException(e);
       }
       return list;

   }

    // Sort the customers based on purchase amount
    public List<SalesRecord> getAllCustomersSortedByPurchaseAmount(List<SalesRecord> salesData, AmountComparator amountComparator){
        List<SalesRecord> list1=new ArrayList<>();
        Collections.sort(salesData, amountComparator);
        for (SalesRecord s1:salesData){
            list1.add(s1);


    } return list1;
   }

    // Find the top customer who spent the maximum time on the site
    public SalesRecord getTopCustomerWhoSpentMaxTimeOnSite(List<SalesRecord> salesData,TimeOnSiteComparator timeOnSiteComparator) {
        SalesRecord salesRecord = new SalesRecord();
        Collections.sort(salesData, timeOnSiteComparator);
        for (SalesRecord s2 : salesData) {
            salesRecord = s2;

        }
        return salesRecord;


    }
}
