package readExcelData;

import lib.excelDataConfig;

public class ReadExcelData {

	public static void main(String[] args) {

		excelDataConfig excel = new excelDataConfig("C:\\ExcelData\\TestData.xlsx");
		System.out.println(excel.getData(0, 0, 0));

	}

}
