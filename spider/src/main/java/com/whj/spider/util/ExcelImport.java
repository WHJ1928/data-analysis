package com.whj.spider.util;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author wanghaijun
 * @date 2018/7/24
 * @desc excel导入
 */
public class ExcelImport {

    private final static String excel2003 =".xls";
    private final static String excel2007 =".xlsx";

    /**
     * @param in
     * @param fileName
     * 处理上传的excel文件
     *
     * */
    public  List<List<Object>> getBankListByExcel(InputStream in, String fileName) throws Exception{
        List<List<Object>> list = null;
        //创建Excel工作薄
        Workbook work = this.getWorkbook(in,fileName);
        if(null == work){
            throw new Exception("创建Excel工作薄为空！");
        }
        Sheet sheet = null;
        Row row = null;
        Cell cell = null;

        list = new ArrayList<List<Object>>();
        for (int i = 0; i < work.getNumberOfSheets(); i++) {
            sheet = work.getSheetAt(i);
            if(sheet==null){continue;}

            for (int j = sheet.getFirstRowNum(); j <= sheet.getLastRowNum(); j++) {
                row = sheet.getRow(j);
                if(row==null||row.getFirstCellNum()==j){continue;}

                List<Object> li = new ArrayList<Object>();
                for (int y = row.getFirstCellNum(); y < row.getLastCellNum(); y++) {
                    cell = row.getCell(y);
                    li.add(cell);
                }
                list.add(li);
            }
        }
        work.close();
        return list;
    }

    /**
     * 判断上传文件的版本
     * @param inStr
     * @param fileName
     * @return wb
     * */
    public Workbook getWorkbook(InputStream inStr, String fileName) throws Exception{
        Workbook wb = null;
        String fileType = fileName.substring(fileName.lastIndexOf("."));
        if(excel2003.equals(fileType)){
            wb = new HSSFWorkbook(inStr);
        }else if(excel2007.equals(fileType)){
            wb = new XSSFWorkbook(inStr);
        }else{
            throw new Exception("解析的文件格式有误！");
        }
        return wb;
    }

    /**
     * 判断身份证
     * @param idCard
     * @return
     */
    public Boolean verificationIdCard(Object idCard){
        String value = String.valueOf(idCard);
        String regExp = "^[0-9]{16}[02468][0-9Xx]$";
        Pattern pattern = Pattern.compile(regExp);
        Matcher matcher = pattern.matcher(value);
        return  matcher.matches();
    }
}
