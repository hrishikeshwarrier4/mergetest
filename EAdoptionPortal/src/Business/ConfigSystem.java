package Business;

import Business.Enterprise.Enterprise;
import Business.Enterprise.FinancialEnterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Network.Networking;
import Business.Organization.Organization;
import Business.People.*;
import Business.Role.BankerRole;
import Business.Role.CounsellorRole;
import Business.Role.FinancialAdminRole;
import Business.Role.HospitalsAdminRole;
import Business.Role.InsuranceManagersRole;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAcc;

/**
 *
 * @author patil
 */
public class ConfigSystem {
    
    public static EcoSystem system; 
    
    public static EcoSystem configure(){
        system = EcoSystem.getInstance();     
        Employees employee = system.getEmployeeDirectory().createandaddEmployee("sysadmin");
        UserAcc ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
        ConfigSystem configure = new ConfigSystem();
        configure.configureNetwork();
        return system;
    }
    
    public void configureNetwork(){
        
        Networking network = system.createAndAddNetwork();
        network.setCountry("United States");
        network.setState("Massachusetts");
        network.setCity("Boston");
        network.setName("Boston Network");
    // Boston   
        HospitalEnterprise hospital = (HospitalEnterprise)network.getEnterpriseDirectory().createAndAddEnterprise("Boston Public Hospital", Enterprise.EnterpriseType.Hospital);
        FinancialEnterprise financial = (FinancialEnterprise)network.getEnterpriseDirectory().createAndAddEnterprise("Boston Public Finance Center", Enterprise.EnterpriseType.FinancialEnterprise);
        
        Employees employee = hospital.getEmployeeDirectory().createandaddEmployee("Boston Hospital Admin");
        UserAcc account = hospital.getUserAccountDirectory().createUserAccount("hadmin", "hadmin", employee, new HospitalsAdminRole(), network.getName());
        
        Organization organization = hospital.getOrganizationDirectory().createOrganization(Organization.Type.Counselor);
     
        
        Counselor employee1 = organization.getEmployeeDirectory().createandaddCounselor("Counselor");
        account = organization.getUserAccountDirectory().createCounselorUserAccount("Counselor", "Counselor", employee1, new CounsellorRole(),network.getName() );
        
        employee = financial.getEmployeeDirectory().createandaddEmployee("Boston Public Finance Admin"); 
        
        account = financial.getUserAccountDirectory().createUserAccount("fadmin", "fadmin", employee, new FinancialAdminRole(),network.getName());
     
        
        organization = financial.getOrganizationDirectory().createOrganization(Organization.Type.BankManager);
        
        Banker employee2 = organization.getEmployeeDirectory().createandaddBankManager("Bank Manager");
        
        
        account = organization.getUserAccountDirectory().createBankManagerUserAccount("bmanager", "bmanager", employee2, new BankerRole(),network.getName());
        
    
        Organization organization1 = financial.getOrganizationDirectory().createOrganization(Organization.Type.InsuranceManager);
        
        
        InsuranceManager employee3 = organization1.getEmployeeDirectory().createandadInsuranceManager("Insurance Manager");
        account = organization1.getUserAccountDirectory().createInsuranceManagerUserAccount("imanager", "imanager", employee3, new InsuranceManagersRole(), network.getName());
        
        account.setNetwork(network.getName());
        
        hospital.getOrganizationDirectory().createOrganization(Organization.Type.BirthMotherOrg);
        hospital.getOrganizationDirectory().createOrganization(Organization.Type.ParentsOrg);
        
        
    }
    
}
