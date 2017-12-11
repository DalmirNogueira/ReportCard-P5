package com.example.android.miwok;

public class ReportCard {
    private String mSubject;
    private int mStudentID;
    private double mGrade;

    public ReportCard(String subject, int studentID, double grade) {
        mSubject = subject;
        mStudentID = studentID;
        mGrade = grade;
    }

    public String getSubject() {
        return mSubject;}

    public int getStudent() {
        return mStudentID;}

    public double getGrade() {
        return mGrade;}

    public void setSubject(String subject) {
        mSubject = subject;}

    public void setStudent(int student) {
        mStudentID = student;}

    public void setSubject(double grade) {
        mGrade = grade;}

    @Override
    public String toString() {
        return  "Student ID = " + mStudentID +
                "\nSubject = " + mSubject +
                "\nGrade = " + mGrade;
    }
}
