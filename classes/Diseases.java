package classes;

import java.util.Scanner;

public class Diseases {
    private int diseasesName;
    private int diseasesCatagory;

    private int problemId;


    public Diseases(){

    }

    public Diseases(int diseasesName, int diseasesCatagory) {
        this.diseasesName = diseasesName;
        this.diseasesCatagory = diseasesCatagory;
    }

    public int getDiseasesName() {
        return diseasesName;
    }

    public void setDiseasesName(int diseasesName) {
        this.diseasesName = diseasesName;
    }

    public int getDiseasesCatagory() {
        return diseasesCatagory;
    }

    public void setDiseasesCatagory(int diseasesCatagory) {
        this.diseasesCatagory = diseasesCatagory;
    }



}
