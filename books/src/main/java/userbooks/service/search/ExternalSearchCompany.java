package userbooks.service.search;

import java.util.Arrays;

/**
 * Created by yjlee on 2018-07-14.
 */
public enum  ExternalSearchCompany {
    KAKAO("kakao") , GOOGLE("google");

    String companyName = "";
    ExternalSearchCompany(String companyName){
            this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

//    public static ExternalSearchCompany getExternalSearchCompany(String companyName){
//        return Arrays.asList(values()).stream().findFirst(company -> company.getCompanyName().equal(companyName))
//                .orElseThrow(() -> new RuntimeException("Not Support External Search Company"));
//    }


}
