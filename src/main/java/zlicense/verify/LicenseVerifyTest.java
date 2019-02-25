package zlicense.verify;

public class LicenseVerifyTest {
	public static void main(String[] args){
		VerifyLicense vLicense = new VerifyLicense();
		try{
			vLicense.setParam("/working/workspaces/java/intellij15/spring_sixth/cylicense/maclicense/src/main/resources/verifyparam.properties");
			vLicense.verify();
		}
		catch(Exception er){
			er.printStackTrace();
		}

	}
}
