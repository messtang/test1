package com.webtest.demo;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import com.webtest.dataprovider.ExcelDataProvider;

public class ZSS_DataProvider {
	@DataProvider(name = "pictureFile")
	public Object[][] pictureFile() throws IOException {
		return new ExcelDataProvider().getTestDataByExcel("F:/test/testExcel/Demo.xlsx", "图片路径");
	}

	@DataProvider(name = "nickName")
	public Object[][] nickName() throws IOException {
		return new ExcelDataProvider().getTestDataByExcel("F:/test/testExcel/Demo.xlsx", "昵称");
	}

	@DataProvider(name = "data")
	public Object[][] data() throws IOException {
		return new ExcelDataProvider().getTestDataByExcel("F:/test/testExcel/Demo.xlsx", "数据");
	}

	@DataProvider(name = "birthday")
	public Object[][] birthday() throws IOException {
		return new ExcelDataProvider().getTestDataByExcel("F:/test/testExcel/Demo.xlsx", "生日");
	}

	@DataProvider(name = "message")
	public Object[][] message() throws IOException {
		return new ExcelDataProvider().getTestDataByExcel("F:/test/testExcel/Demo.xlsx", "个性签名");
	}

	@DataProvider(name = "password")
	public Object[][] password() throws IOException {
		return new ExcelDataProvider().getTestDataByExcel("F:/test/testExcel/Demo.xlsx", "密码");
	}

}
