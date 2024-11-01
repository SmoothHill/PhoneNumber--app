

import cn.com.webxml.MobileCodeWS;
import cn.com.webxml.MobileCodeWSSoap;

public class MobileClient {
    public static void main(String[] args) {
        MobileCodeWS mobileCodeWS = new MobileCodeWS();
        MobileCodeWSSoap soap = mobileCodeWS.getPort(MobileCodeWSSoap.class);
        String info = soap.getMobileCodeInfo("183xxxxxxxx", null); // 电话号码自己输入
        System.out.println(info);
    }
}
