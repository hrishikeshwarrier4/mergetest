/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author hrishikeshwarrier
 */
public class EnterpriseDirectory {
    private ArrayList<Enterprise1> enterpriseList;
   

    public ArrayList<Enterprise1> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise1> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    public EnterpriseDirectory(){
        enterpriseList=new ArrayList<Enterprise1>();
    }
    
   //Creating and initializing Enterprise1
    public Enterprise1 createAndAddEnterprise(String name,Enterprise1.EnterpriseType type){
        Enterprise1 enterprise = null;
        if(type==Enterprise1.EnterpriseType.Hospital){
            enterprise=new HospitalEnterprise(name);
            enterprise.setEnterpriseType(type);
            enterpriseList.add(enterprise);
            return enterprise;
        }
        if(type==Enterprise1.EnterpriseType.FinancialEnterprise){

            enterprise=new FinancialEnterprise(name);
            enterprise.setEnterpriseType(type);
            enterpriseList.add(enterprise);
            return enterprise;
        }
         if(type==Enterprise1.EnterpriseType.OrphanageEnterprise){
            enterprise=new OrphangeEnterprise(name);
            enterprise.setEnterpriseType(type);
            enterpriseList.add(enterprise);
            return enterprise;
        }
        return null;
    }
    public boolean containsName(String type){
        for (Enterprise1 org : enterpriseList){
            if(org.getName().equals(type)){
                return true;
            }
        }
        return false;
    }
    
}
