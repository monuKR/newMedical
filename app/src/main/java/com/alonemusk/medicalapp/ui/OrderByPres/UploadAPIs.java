package com.alonemusk.medicalapp.ui.OrderByPres;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface UploadAPIs {
    @Multipart
    @POST("/post-direct-order")
    Call<ResponseBody> uploadImage(@Part MultipartBody.Part file, @Part("productImage") RequestBody requestBody);
}

