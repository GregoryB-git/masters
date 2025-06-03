/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 *  java.lang.Object
 *  java.lang.Runnable
 */
package com.vk.sdk.api;

import android.os.Handler;
import android.os.Looper;
import com.vk.sdk.VKObject;
import com.vk.sdk.api.VKBatchRequest;
import com.vk.sdk.api.VKError;
import com.vk.sdk.api.VKRequest;
import com.vk.sdk.api.VKResponse;
import com.vk.sdk.api.httpClient.VKHttpClient;

public class VKBatchRequest
extends VKObject {
    private boolean mCanceled = false;
    private final VKRequest.VKRequestListener[] mOriginalListeners;
    private final VKRequest[] mRequests;
    private final VKResponse[] mResponses;
    public VKBatchRequestListener requestListener;

    public VKBatchRequest(VKRequest ... vKRequestArray) {
        this.mRequests = vKRequestArray;
        this.mResponses = new VKResponse[vKRequestArray.length];
        this.mOriginalListeners = new VKRequest.VKRequestListener[vKRequestArray.length];
        for (int i = 0; i < (vKRequestArray = this.mRequests).length; ++i) {
            this.mOriginalListeners[i] = vKRequestArray[i].requestListener;
        }
    }

    private int indexOfRequest(VKRequest vKRequest) {
        VKRequest[] vKRequestArray;
        for (int i = 0; i < (vKRequestArray = this.mRequests).length; ++i) {
            if (!vKRequestArray[i].equals(vKRequest)) continue;
            return i;
        }
        return -1;
    }

    public void cancel() {
        if (this.mCanceled) {
            return;
        }
        this.mCanceled = true;
        VKRequest[] vKRequestArray = this.mRequests;
        int n = vKRequestArray.length;
        for (int i = 0; i < n; ++i) {
            vKRequestArray[i].cancel();
        }
    }

    public void executeWithListener(VKBatchRequestListener vKRequestArray) {
        if (this.mRequests == null) {
            this.provideError(new VKError(-103));
            return;
        }
        this.requestListener = vKRequestArray;
        Handler handler = new Handler(Looper.myLooper());
        vKRequestArray = this.mRequests;
        int n = vKRequestArray.length;
        int n2 = 0;
        for (int i = 0; i < n; ++i) {
            handler.postDelayed(new Runnable(this, vKRequestArray[i]){
                public final VKBatchRequest this$0;
                public final VKRequest val$request;
                {
                    this.this$0 = vKBatchRequest;
                    this.val$request = vKRequest;
                }

                public void run() {
                    VKRequest vKRequest = this.val$request;
                    vKRequest.setRequestListener(new VKRequest.VKRequestListener(this, vKRequest.requestListener){
                        public final 1 this$1;
                        public final VKRequest.VKRequestListener val$originalListener;
                        {
                            this.this$1 = var1_1;
                            this.val$originalListener = vKRequestListener;
                        }

                        public void onComplete(VKResponse vKResponse) {
                            this.this$1.this$0.provideResponse(vKResponse);
                        }

                        public void onError(VKError vKError) {
                            this.this$1.this$0.provideError(vKError);
                        }

                        public void onProgress(VKRequest.VKProgressType vKProgressType, long l, long l2) {
                            VKRequest.VKRequestListener vKRequestListener = this.val$originalListener;
                            if (vKRequestListener != null) {
                                vKRequestListener.onProgress(vKProgressType, l, l2);
                            }
                        }
                    });
                    VKHttpClient.enqueueOperation(this.val$request.getOperation());
                }
            }, (long)n2);
            n2 += 333;
        }
    }

    public void provideError(VKError vKError) {
        Object object;
        if (this.mCanceled) {
            return;
        }
        for (int i = 0; i < this.mRequests.length; ++i) {
            object = this.mOriginalListeners[i];
            if (object == null) continue;
            object.onError(vKError);
        }
        object = this.requestListener;
        if (object != null) {
            object.onError(vKError);
        }
        this.cancel();
    }

    public void provideResponse(VKResponse object) {
        this.mResponses[this.indexOfRequest((VKRequest)((VKResponse)object).request)] = object;
        object = this.mResponses;
        int n = ((VKResponse[])object).length;
        int n2 = 0;
        int n3 = 0;
        while (true) {
            if (n3 >= n) break;
            if (object[n3] == null) {
                return;
            }
            ++n3;
        }
        for (int i = n2; i < this.mRequests.length; ++i) {
            object = this.mOriginalListeners[i];
            if (object == null) continue;
            object.onComplete(this.mResponses[i]);
        }
        object = this.requestListener;
        if (object != null) {
            object.onComplete(this.mResponses);
        }
    }
}

