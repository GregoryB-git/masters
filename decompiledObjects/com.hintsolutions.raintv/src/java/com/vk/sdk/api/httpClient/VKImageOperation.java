/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.BitmapFactory
 *  android.os.Handler
 *  android.os.Looper
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.Runnable
 *  java.lang.String
 */
package com.vk.sdk.api.httpClient;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.os.Looper;
import com.vk.sdk.api.httpClient.VKAbstractOperation;
import com.vk.sdk.api.httpClient.VKHttpClient;
import com.vk.sdk.api.httpClient.VKHttpOperation;
import com.vk.sdk.api.httpClient.VKImageOperation;

public class VKImageOperation
extends VKHttpOperation<Bitmap> {
    public float imageDensity;

    public VKImageOperation(String string) {
        super(new VKHttpClient.VKHTTPRequest(string));
    }

    @Override
    public Bitmap getResultObject() {
        Object object = this.getResponseData();
        Bitmap bitmap = BitmapFactory.decodeByteArray((byte[])object, (int)0, (int)((byte[])object).length);
        object = bitmap;
        if (this.imageDensity > 0.0f) {
            object = Bitmap.createScaledBitmap((Bitmap)bitmap, (int)((int)((float)bitmap.getWidth() * this.imageDensity)), (int)((int)((float)bitmap.getHeight() * this.imageDensity)), (boolean)true);
        }
        return object;
    }

    public void setImageOperationListener(VKImageOperationListener vKImageOperationListener) {
        this.setCompleteListener(new VKAbstractOperation.VKOperationCompleteListener(this, vKImageOperationListener){
            public final VKImageOperation this$0;
            public final VKImageOperationListener val$listener;
            {
                this.this$0 = vKImageOperation;
                this.val$listener = vKImageOperationListener;
            }

            /*
             * Enabled aggressive block sorting
             */
            public void onComplete() {
                VKImageOperation vKImageOperation;
                if (this.this$0.state() == VKAbstractOperation.VKOperationState.Finished) {
                    vKImageOperation = this.this$0;
                    if (vKImageOperation.mLastException == null) {
                        vKImageOperation = vKImageOperation.getResultObject();
                        new Handler(Looper.getMainLooper()).post(new Runnable(this, (Bitmap)vKImageOperation){
                            public final 1 this$1;
                            public final Bitmap val$result;
                            {
                                this.this$1 = var1_1;
                                this.val$result = bitmap;
                            }

                            public void run() {
                                1 var1_1 = this.this$1;
                                var1_1.val$listener.onComplete(var1_1.this$0, this.val$result);
                            }
                        });
                        return;
                    }
                }
                VKImageOperationListener vKImageOperationListener = this.val$listener;
                vKImageOperation = this.this$0;
                vKImageOperationListener.onError(vKImageOperation, vKImageOperation.generateError(vKImageOperation.mLastException));
            }
        });
    }
}

