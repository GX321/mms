package com.clps.mms.util.excel;



import org.apache.log4j.Logger;
import org.apache.poi.hssf.usermodel.*;



import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

/**
 * 
* @ClassName: ExportMapExcel  
* @Description: 导出以SpringMVC+Mybatis框架结构实现  
* @author Clement.chen  
* @date 2018年5月10日 上午10:05:47  
*
 */
public class ExportMapExcel {
    private Iterator<String> headersNameIt;
	private HSSFCell cell;
	private Iterator<String> iterator;
	private static Logger logger = Logger.getLogger(ExportMapExcel.class);

	@SuppressWarnings({ })
	public void exportExcel(String title, List<String> headersName, List<String> headersId,
                            List<Map<String, Object>> dtoList) {
        /*
               （一）表头--标题栏
         */
        Map<Integer, String> headersNameMap = new HashMap<Integer, String>();
        int key = 0;
        for (int i = 0; i < headersName.size(); i++) {
            if (!headersName.get(i).equals(null)) {
                headersNameMap.put(key, headersName.get(i));
                key++;
            }
        }
        /*
                （二）字段---标题的字段
         */
        Map<Integer, String> titleFieldMap = new HashMap<Integer, String>();
        int value = 0;
        for (int i = 0; i < headersId.size(); i++) {
            if (!headersId.get(i).equals(null)) {
                titleFieldMap.put(value, headersId.get(i));
                value++;
            }
        }
       /*
                （三）声明一个工作薄：包括构建工作簿、表格、样式
       */
        HSSFWorkbook wb = new HSSFWorkbook();
        // 生成一个样式
        HSSFCellStyle style = wb.createCellStyle();
        style.setAlignment(HSSFCellStyle.ALIGN_CENTER);
        cell = null;
        headersNameIt = null;
		while (headersNameIt.hasNext()) {
            
            HSSFCell cell2 = cell;
			cell2.setCellValue(headersNameIt.next().toString());
            cell.setCellStyle(style);
        }
        titleFieldMap.values();
        Iterator<Map<String, Object>> titleFieldIt = dtoList.iterator();//总记录的迭代器
        while (titleFieldIt.hasNext()) {//记录的迭代器，遍历总记录
            Map<String, Object> mapTemp = titleFieldIt.next();//拿到一条记录
              
				iterator = null;
				while (iterator.hasNext()) {
                    String tempField =iterator.next();//字段的暂存
                    if (mapTemp.get(tempField) != null) {
                    }
                }
        }
        try {
            FileOutputStream exportXls = new FileOutputStream("src\\main\\webapp\\doc\\excelfile\\student.xlsx");
            wb.write(exportXls);
            exportXls.close();
            logger.info("导出成功!");
        } catch (FileNotFoundException e) {
        	logger.info("导出失败!");
            e.printStackTrace();
        } catch (IOException e) {
        	logger.info("导出失败!");
            e.printStackTrace();
        }
    }
	 public static void main(String [] args) {

	        List<String> listName = new ArrayList<>();
	        listName.add("id");
	        listName.add("名字");
	        listName.add("性别");
	        List<String> listId = new ArrayList<>();
	        listId.add("id");
	        listId.add("name");
	        listId.add("sex");

	        List<Map<String,Object>> listB = new ArrayList<>();
	        for (int t=0;t<6;t++){
	            Map<String,Object> map = new HashMap<>();
	            map.put("id",t);
	            map.put("name","abc"+t);
	            map.put("sex","男"+t);
	            listB.add(map);
	        }
	        logger.info("listB  : "+listB.toString());
	        ExportMapExcel exportExcelUtil = new ExportMapExcel();
	        exportExcelUtil.exportExcel("测试POI导出EXCEL文档",listName,listId,listB);

	    }
}
