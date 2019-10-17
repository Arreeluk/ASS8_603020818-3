package com.example.ass8

import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST

interface EmployeeApi {
    @GET( "allemp")
    fun retrieveEmployee(): Call<List<Employee>>

    @FormUrlEncoded
    @POST( "emp")
    fun insertEmp(
        @Field("emp_name") emp_name: String,
        @Field("emp_gender") emp_gender: String,
        @Field("emp_email") emp_email: String,
        @Field("emp_salary") emp_salary: Int): Call<Employee>
}