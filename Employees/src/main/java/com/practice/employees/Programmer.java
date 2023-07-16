package com.practice.employees;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Programmer extends Employee implements IEmployee, Chef {
    private int linesOfCode = 0;
    private int yearsOfExp = 0;
    private int iq = 0;

    private final String progRegex = "\\w+\\=(?<locpd>\\w+)\\,\\w+\\=(?<yoe>\\w+)\\,\\w+\\=(?<iq>\\w+)";
    private final Pattern coderPattern = Pattern.compile(progRegex);

    public Programmer(String personText) {
        super(personText);
            Matcher coderMat = coderPattern.matcher(mat.group("details"));
            if(coderMat.find()){
                this.linesOfCode = Integer.parseInt(coderMat.group("locpd"));
                this.yearsOfExp = Integer.parseInt(coderMat.group("yoe"));
                this.iq = Integer.parseInt(coderMat.group("iq"));
            }
        }

    public int getSalary(){
        return 3000 + linesOfCode * yearsOfExp * iq;
    }

    public int getLinesOfCode() {
        return linesOfCode;
    }

    public void setLinesOfCode(int linesOfCode) {
        this.linesOfCode = linesOfCode;
    }

    public int getYearsOfExp() {
        return yearsOfExp;
    }

    public void setYearsOfExp(int yearsOfExp) {
        this.yearsOfExp = yearsOfExp;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }
}
