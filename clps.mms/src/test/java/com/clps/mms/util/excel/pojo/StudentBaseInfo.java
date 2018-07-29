package com.clps.mms.util.excel.pojo;

import java.math.BigDecimal;

import com.clps.mms.common.IsNeeded;

/**
 * 
* @ClassName: StudentBaseInfo  
* @Description: 测试用Student信息  
* @author Clement.chen  
* @date 2018年5月14日 上午10:36:17  
*
 */
public class StudentBaseInfo
{
    private Integer id;
    @IsNeeded
    private String no;
    @IsNeeded
    private String name;
    @IsNeeded
    private String idnum;
    @IsNeeded
    private String sex;
    @IsNeeded
    private BigDecimal grade;
    
    
    @Override
    public String toString()
    {
        return "StudentBaseInfo [id=" + id + ", no=" + no + ", name=" + name + ", idnum=" + idnum + ", sex=" + sex
            + ", grade=" + grade + "]";
    }
    public Integer getId()
    {
        return id;
    }
    public void setId(Integer id)
    {
        this.id = id;
    }
    public String getNo()
    {
        return no;
    }
    public void setNo(String no)
    {
        this.no = no;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getSex()
    {
        return sex;
    }
    public void setSex(String sex)
    {
        this.sex = sex;
    }
    public String getIdnum()
    {
        return idnum;
    }
    public void setIdnum(String idnum)
    {
        this.idnum = idnum;
    }
    public BigDecimal getGrade()
    {
        return grade;
    }
    public void setGrade(BigDecimal grade)
    {
        this.grade = grade;
    }
    
}
