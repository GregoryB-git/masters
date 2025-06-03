/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.annotation.NonNull
 *  com.google.gson.FieldNamingPolicy
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.hintsolutions.raintv.utils.ChangeableBaseUrlInterceptor
 *  dagger.Module
 *  dagger.Provides
 *  java.lang.Object
 *  java.util.concurrent.TimeUnit
 *  javax.inject.Named
 *  javax.inject.Singleton
 *  okhttp3.Interceptor
 *  okhttp3.OkHttpClient
 *  okhttp3.OkHttpClient$Builder
 *  retrofit2.CallAdapter$Factory
 *  retrofit2.Converter$Factory
 *  retrofit2.Retrofit
 *  retrofit2.Retrofit$Builder
 *  retrofit2.adapter.rxjava.RxJavaCallAdapterFactory
 *  retrofit2.converter.gson.GsonConverterFactory
 *  ru.tvrain.core.data.AutoVideoAuto
 *  ru.tvrain.core.data.AutoVideoAuto$AutoVideoAutoDeserializer
 *  ru.tvrain.core.services.CommonService
 *  ru.tvrain.core.services.EagleService
 *  ru.tvrain.core.services.RainService
 *  tvrain.utils.ConstsKt
 */
package com.hintsolutions.raintv.di.modules;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.hintsolutions.raintv.utils.ChangeableBaseUrlInterceptor;
import com.hintsolutions.raintv.utils.CommonUtils;
import dagger.Module;
import dagger.Provides;
import java.util.concurrent.TimeUnit;
import javax.inject.Named;
import javax.inject.Singleton;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import retrofit2.CallAdapter;
import retrofit2.Converter;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import ru.tvrain.core.data.AutoVideoAuto;
import ru.tvrain.core.services.CommonService;
import ru.tvrain.core.services.EagleService;
import ru.tvrain.core.services.RainService;
import tvrain.utils.ConstsKt;

@Module
public class NetworkModule {
    @Provides
    @Named(value="common_retrofit")
    @Singleton
    @NonNull
    public Retrofit provideCommonRetrofit(Context context, @Named(value="default_http_client") OkHttpClient okHttpClient) {
        return new Retrofit.Builder().baseUrl(context.getString(2131755228)).addCallAdapterFactory((CallAdapter.Factory)RxJavaCallAdapterFactory.create()).client(okHttpClient).build();
    }

    @Provides
    @Singleton
    @NonNull
    public CommonService provideCommonService(@Named(value="common_retrofit") Retrofit retrofit) {
        return (CommonService)retrofit.create(CommonService.class);
    }

    @Provides
    @Named(value="custom_http_client")
    @Singleton
    @NonNull
    public OkHttpClient provideCustomHttpClient(Context context) {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        ChangeableBaseUrlInterceptor changeableBaseUrlInterceptor = new ChangeableBaseUrlInterceptor(context, ConstsKt.getUserAgentHeader(), ConstsKt.getAcceptHeader(), CommonUtils.getDeviceUid(context));
        context = TimeUnit.SECONDS;
        builder.callTimeout(60L, (TimeUnit)context).readTimeout(60L, (TimeUnit)context).addInterceptor((Interceptor)changeableBaseUrlInterceptor);
        return builder.build();
    }

    @Provides
    @Named(value="default_http_client")
    @Singleton
    @NonNull
    public OkHttpClient provideDefaultHttpClient(Context context) {
        return new OkHttpClient();
    }

    @Provides
    @Named(value="eagle_retrofit")
    @Singleton
    @NonNull
    public Retrofit provideEagleRetrofit(Context context, @Named(value="default_http_client") OkHttpClient okHttpClient, Gson gson) {
        return new Retrofit.Builder().baseUrl(context.getString(2131755229)).addConverterFactory((Converter.Factory)GsonConverterFactory.create((Gson)gson)).addCallAdapterFactory((CallAdapter.Factory)RxJavaCallAdapterFactory.create()).client(new OkHttpClient()).build();
    }

    @Provides
    @Singleton
    @NonNull
    public EagleService provideEagleService(@Named(value="eagle_retrofit") Retrofit retrofit) {
        return (EagleService)retrofit.create(EagleService.class);
    }

    @Provides
    @Singleton
    @NonNull
    public Gson provideGson() {
        return new GsonBuilder().setDateFormat("EEE, d MMM yy HH:mm:ss Z").setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).registerTypeAdapter(AutoVideoAuto.class, (Object)new AutoVideoAuto.AutoVideoAutoDeserializer()).create();
    }

    @Provides
    @Named(value="rain_retrofit")
    @Singleton
    @NonNull
    public Retrofit provideRainRetrofit(Context context, @Named(value="custom_http_client") OkHttpClient okHttpClient, Gson gson) {
        return new Retrofit.Builder().baseUrl(context.getString(2131755529)).addConverterFactory((Converter.Factory)GsonConverterFactory.create((Gson)gson)).addCallAdapterFactory((CallAdapter.Factory)RxJavaCallAdapterFactory.create()).client(okHttpClient).build();
    }

    @Provides
    @Singleton
    @NonNull
    public RainService provideRainService(@Named(value="rain_retrofit") Retrofit retrofit) {
        return (RainService)retrofit.create(RainService.class);
    }
}

