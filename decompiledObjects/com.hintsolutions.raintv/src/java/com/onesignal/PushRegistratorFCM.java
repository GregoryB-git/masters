/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.Base64
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.annotation.WorkerThread
 *  com.google.android.gms.tasks.Task
 *  com.google.android.gms.tasks.Tasks
 *  com.google.firebase.FirebaseApp
 *  com.google.firebase.FirebaseOptions
 *  com.google.firebase.FirebaseOptions$Builder
 *  com.google.firebase.messaging.FirebaseMessaging
 *  java.io.IOException
 *  java.lang.Class
 *  java.lang.ClassNotFoundException
 *  java.lang.Deprecated
 *  java.lang.Error
 *  java.lang.Exception
 *  java.lang.IllegalAccessException
 *  java.lang.NoClassDefFoundError
 *  java.lang.NoSuchMethodError
 *  java.lang.NoSuchMethodException
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.reflect.InvocationTargetException
 *  java.util.concurrent.ExecutionException
 */
package com.onesignal;

import android.content.Context;
import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.messaging.FirebaseMessaging;
import com.onesignal.OneSignal;
import com.onesignal.PushRegistratorAbstractGoogle;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutionException;

class PushRegistratorFCM
extends PushRegistratorAbstractGoogle {
    private static final String FCM_APP_NAME = "ONESIGNAL_SDK_FCM_APP_NAME";
    @NonNull
    private final Context context;
    private FirebaseApp firebaseApp;
    @NonNull
    private final Params params;

    public PushRegistratorFCM(@NonNull Context context, @Nullable Params params) {
        this.context = context;
        this.params = params == null ? new Object(){
            private static final String FCM_DEFAULT_API_KEY_BASE64 = "QUl6YVN5QW5UTG41LV80TWMyYTJQLWRLVWVFLWFCdGd5Q3JqbFlV";
            private static final String FCM_DEFAULT_APP_ID = "1:754795614042:android:c682b8144a8dd52bc1ad63";
            private static final String FCM_DEFAULT_PROJECT_ID = "onesignal-shared-public";
            @NonNull
            private final String apiKey;
            @NonNull
            private final String appId;
            @NonNull
            private final String projectId;
            {
                this(null, null, null);
            }
            {
                if (string == null) {
                    string = FCM_DEFAULT_PROJECT_ID;
                }
                this.projectId = string;
                if (string2 == null) {
                    string2 = FCM_DEFAULT_APP_ID;
                }
                this.appId = string2;
                string = new String(Base64.decode((String)FCM_DEFAULT_API_KEY_BASE64, (int)0));
                if (string3 != null) {
                    string = string3;
                }
                this.apiKey = string;
            }
        } : params;
    }

    /*
     * WARNING - void declaration
     */
    @Deprecated
    @WorkerThread
    private String getTokenWithClassFirebaseInstanceId(String string) throws IOException {
        void var1_6;
        try {
            Object object = Class.forName((String)"com.google.firebase.iid.FirebaseInstanceId").getMethod("getInstance", new Class[]{FirebaseApp.class}).invoke(null, new Object[]{this.firebaseApp});
            string = (String)object.getClass().getMethod("getToken", new Class[]{String.class, String.class}).invoke(object, new Object[]{string, "FCM"});
            return string;
        }
        catch (InvocationTargetException invocationTargetException) {
        }
        catch (IllegalAccessException illegalAccessException) {
        }
        catch (NoSuchMethodException noSuchMethodException) {
        }
        catch (ClassNotFoundException classNotFoundException) {
            // empty catch block
        }
        throw new Error("Reflection error on FirebaseInstanceId.getInstance(firebaseApp).getToken(senderId, FirebaseMessaging.INSTANCE_ID_SCOPE)", (Throwable)var1_6);
    }

    @WorkerThread
    private String getTokenWithClassFirebaseMessaging() throws Exception {
        Task task = ((FirebaseMessaging)this.firebaseApp.get(FirebaseMessaging.class)).getToken();
        try {
            String string = (String)Tasks.await((Task)task);
            return string;
        }
        catch (ExecutionException executionException) {
            throw task.getException();
        }
    }

    private void initFirebaseApp(String string) {
        if (this.firebaseApp != null) {
            return;
        }
        string = new FirebaseOptions.Builder().setGcmSenderId(string).setApplicationId(this.params.appId).setApiKey(this.params.apiKey).setProjectId(this.params.projectId).build();
        this.firebaseApp = FirebaseApp.initializeApp((Context)this.context, (FirebaseOptions)string, (String)FCM_APP_NAME);
    }

    @Override
    public String getProviderName() {
        return "FCM";
    }

    @Override
    @WorkerThread
    public String getToken(String string) throws Exception {
        this.initFirebaseApp(string);
        try {
            String string2 = this.getTokenWithClassFirebaseMessaging();
            return string2;
        }
        catch (NoClassDefFoundError | NoSuchMethodError throwable) {
            OneSignal.Log(OneSignal.LOG_LEVEL.INFO, "FirebaseMessaging.getToken not found, attempting to use FirebaseInstanceId.getToken");
            return this.getTokenWithClassFirebaseInstanceId(string);
        }
    }
}

