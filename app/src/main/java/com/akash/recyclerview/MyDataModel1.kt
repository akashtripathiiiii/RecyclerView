package com.akash.recyclerview


class MyDataModel1(sem:String?,cgpa:String?,year:String?) {
    private var sem:String
    private var cgpa:String
    private var year:String

    init {
        this.sem=sem!!
        this.cgpa=cgpa!!
        this.year=year!!


    }

    fun getSem(): String?
    {
        return sem
    }

    fun getCGPA(): String? {
        return cgpa
    }

    fun getYear(): String? {
        return year
    }


}