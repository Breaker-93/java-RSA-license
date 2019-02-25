package zlicense.create;



public class LicenseCreateTest {
	public static void main(String[] args){
		CreateLicense cLicense = new CreateLicense();
		
		cLicense.setParam("D://ProjectFiles/SoftStone_Workspace/Edu_Project/Documents/ServerFiles/deploy2.0.2/working/lk/createparam.properties");

		cLicense.create();
	}
}
