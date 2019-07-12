package dataDrivenTest;

import dataDrivenFW.Xls_Reader1;

public class ExcelOperations {

	public static void main(String[] args) {
		//Get test data from excel
		Xls_Reader1 reader=new Xls_Reader1("D:\\Workspacedate13month4_Selenium\\Selenium_Auromation"
				+ "\\src\\tsetData\\HalfEbay.xlsx");
		if(!reader.isSheetExist("HomePage")){
		reader.addSheet("HomePage");
		}
	int	colCount=reader.getColumnCount("RegTestData");
	System.out.println(colCount);
	
	int cellRowNo=reader.getCellRowNum("RegTestData", "firstName", "sunil");
	System.out.println("Cell row no is:- "+cellRowNo);
		}

}
