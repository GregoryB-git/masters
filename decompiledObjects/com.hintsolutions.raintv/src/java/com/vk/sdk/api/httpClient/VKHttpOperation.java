/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Nullable
 *  java.io.IOException
 *  java.io.UnsupportedEncodingException
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.concurrent.ExecutorService
 */
package com.vk.sdk.api.httpClient;

import androidx.annotation.Nullable;
import com.vk.sdk.api.VKError;
import com.vk.sdk.api.httpClient.VKAbstractOperation;
import com.vk.sdk.api.httpClient.VKHttpClient;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.concurrent.ExecutorService;

public class VKHttpOperation<ResponseType>
extends VKAbstractOperation {
    public Exception mLastException;
    private String mResponseString;
    private final VKHttpClient.VKHTTPRequest mUriRequest;
    @Nullable
    public VKHttpClient.VKHttpResponse response;

    public VKHttpOperation(VKHttpClient.VKHTTPRequest vKHTTPRequest) {
        this.mUriRequest = vKHTTPRequest;
    }

    @Override
    public void cancel() {
        VKHttpClient.cancelHttpOperation(this);
        super.cancel();
    }

    @Override
    public void finish() {
        this.postExecution();
        super.finish();
    }

    public VKError generateError(Exception exception) {
        VKError vKError = this.state() == VKAbstractOperation.VKOperationState.Canceled ? new VKError(-102) : new VKError(-105);
        if (exception != null) {
            String string2;
            vKError.errorMessage = string2 = exception.getMessage();
            if (string2 == null) {
                vKError.errorMessage = exception.toString();
            }
            vKError.httpError = exception;
        }
        return vKError;
    }

    public byte[] getResponseData() {
        Object object = this.response;
        object = object != null ? (Object)((VKHttpClient.VKHttpResponse)object).responseBytes : null;
        return object;
    }

    public String getResponseString() {
        Object object = this.response;
        if (object != null && (object = (Object)((VKHttpClient.VKHttpResponse)object).responseBytes) != null) {
            if (this.mResponseString == null) {
                try {
                    String string2;
                    this.mResponseString = string2 = new String((byte[])object, "UTF-8");
                }
                catch (UnsupportedEncodingException unsupportedEncodingException) {
                    this.mLastException = unsupportedEncodingException;
                }
            }
            return this.mResponseString;
        }
        return null;
    }

    public ResponseType getResultObject() {
        Object object = this.response;
        object = object != null ? (Object)((VKHttpClient.VKHttpResponse)object).responseBytes : null;
        return (ResponseType)object;
    }

    public VKHttpClient.VKHTTPRequest getUriRequest() {
        return this.mUriRequest;
    }

    public boolean postExecution() {
        return true;
    }

    public <OperationType extends VKHttpOperation> void setHttpOperationListener(VKAbstractOperation.VKAbstractCompleteListener<OperationType, ResponseType> vKAbstractCompleteListener) {
        this.setCompleteListener(new VKAbstractOperation.VKOperationCompleteListener(this, vKAbstractCompleteListener){
            public final VKHttpOperation this$0;
            public final VKAbstractOperation.VKAbstractCompleteListener val$listener;
            {
                this.this$0 = vKHttpOperation;
                this.val$listener = vKAbstractCompleteListener;
            }

            /*
             * Enabled aggressive block sorting
             */
            @Override
            public void onComplete() {
                VKHttpOperation vKHttpOperation;
                if (this.this$0.state() == VKAbstractOperation.VKOperationState.Finished) {
                    vKHttpOperation = this.this$0;
                    if (vKHttpOperation.mLastException == null) {
                        this.val$listener.onComplete(vKHttpOperation, vKHttpOperation.getResultObject());
                        return;
                    }
                }
                VKAbstractOperation.VKAbstractCompleteListener vKAbstractCompleteListener = this.val$listener;
                vKHttpOperation = this.this$0;
                vKAbstractCompleteListener.onError(vKHttpOperation, vKHttpOperation.generateError(vKHttpOperation.mLastException));
            }
        });
    }

    @Override
    public void start(ExecutorService object) {
        super.start((ExecutorService)object);
        this.setState(VKAbstractOperation.VKOperationState.Executing);
        try {
            object = this.mUriRequest;
            if (object.isAborted) {
                return;
            }
            this.response = VKHttpClient.execute((VKHttpClient.VKHTTPRequest)object);
        }
        catch (IOException iOException) {
            this.mLastException = iOException;
        }
        this.setState(VKAbstractOperation.VKOperationState.Finished);
    }
}

