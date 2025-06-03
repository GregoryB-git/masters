/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.concurrent.ExecutorService
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.vk.sdk.api;

import com.vk.sdk.api.VKError;
import com.vk.sdk.api.VKRequest;
import com.vk.sdk.api.VKResponse;
import com.vk.sdk.api.VKUploadBase;
import com.vk.sdk.api.httpClient.VKAbstractOperation;
import com.vk.sdk.api.httpClient.VKHttpClient;
import com.vk.sdk.api.httpClient.VKJsonOperation;
import java.util.concurrent.ExecutorService;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class VKUploadBase
extends VKRequest {
    public VKUploadBase() {
        super(null);
    }

    @Override
    public VKAbstractOperation getOperation() {
        return new VKAbstractOperation(this, null){
            public VKAbstractOperation lastOperation;
            public final VKUploadBase this$0;
            {
                this.this$0 = vKUploadBase;
            }
            {
                this(vKUploadBase);
            }

            public static /* synthetic */ void access$400(VKUploadOperation vKUploadOperation, VKAbstractOperation.VKOperationState vKOperationState) {
                vKUploadOperation.setState(vKOperationState);
            }

            @Override
            public void cancel() {
                VKAbstractOperation vKAbstractOperation = this.lastOperation;
                if (vKAbstractOperation != null) {
                    vKAbstractOperation.cancel();
                }
                super.cancel();
            }

            @Override
            public void finish() {
                super.finish();
                this.lastOperation = null;
            }

            @Override
            public Object getResultObject() {
                return null;
            }

            @Override
            public void start(ExecutorService object) {
                super.start((ExecutorService)object);
                object = this.this$0;
                ((VKRequest)object).requestListener = new VKRequest.VKRequestListener(this, ((VKRequest)object).requestListener){
                    public final VKUploadOperation this$1;
                    public final VKRequest.VKRequestListener val$originalListener;
                    {
                        this.this$1 = vKUploadOperation;
                        this.val$originalListener = vKRequestListener;
                    }

                    @Override
                    public void onComplete(VKResponse vKResponse) {
                        this.this$1.setState(VKAbstractOperation.VKOperationState.Finished);
                        vKResponse.request = this.this$1.this$0;
                        VKRequest.VKRequestListener vKRequestListener = this.val$originalListener;
                        if (vKRequestListener != null) {
                            vKRequestListener.onComplete(vKResponse);
                        }
                    }

                    @Override
                    public void onError(VKError vKError) {
                        this.this$1.setState(VKAbstractOperation.VKOperationState.Finished);
                        vKError.request = this.this$1.this$0;
                        VKRequest.VKRequestListener vKRequestListener = this.val$originalListener;
                        if (vKRequestListener != null) {
                            vKRequestListener.onError(vKError);
                        }
                    }

                    @Override
                    public void onProgress(VKRequest.VKProgressType vKProgressType, long l4, long l5) {
                        VKRequest.VKRequestListener vKRequestListener = this.val$originalListener;
                        if (vKRequestListener != null) {
                            vKRequestListener.onProgress(vKProgressType, l4, l5);
                        }
                    }
                };
                this.setState(VKAbstractOperation.VKOperationState.Executing);
                object = this.this$0.getServerRequest();
                ((VKRequest)object).setRequestListener(new VKUploadRequestListener(this, null));
                this.lastOperation = object = ((VKRequest)object).getOperation();
                VKHttpClient.enqueueOperation((VKAbstractOperation)object);
            }

            public class VKUploadRequestListener
            extends VKRequest.VKRequestListener {
                public final VKUploadOperation this$1;

                private VKUploadRequestListener(VKUploadOperation vKUploadOperation) {
                    this.this$1 = vKUploadOperation;
                }

                public /* synthetic */ VKUploadRequestListener(VKUploadOperation vKUploadOperation, com.vk.sdk.api.VKUploadBase$1 var2_2) {
                    this(vKUploadOperation);
                }

                @Override
                public void onComplete(VKResponse vKJSONOperationCompleteListener) {
                    block2: {
                        try {
                            vKJSONOperationCompleteListener = ((VKResponse)((Object)vKJSONOperationCompleteListener)).json.getJSONObject("response").getString("upload_url");
                            VKJsonOperation vKJsonOperation = this.this$1.this$0.getUploadOperation((String)((Object)vKJSONOperationCompleteListener));
                            vKJSONOperationCompleteListener = new VKJsonOperation.VKJSONOperationCompleteListener(this){
                                public final VKUploadRequestListener this$2;
                                {
                                    this.this$2 = vKUploadRequestListener;
                                }

                                public void onComplete(VKJsonOperation object, JSONObject jSONObject) {
                                    object = this.this$2.this$1.this$0.getSaveRequest(jSONObject);
                                    ((VKRequest)object).setRequestListener(new VKRequest.VKRequestListener(this){
                                        public final 1 this$3;
                                        {
                                            this.this$3 = var1_1;
                                        }

                                        public void onComplete(VKResponse vKResponse) {
                                            VKRequest.VKRequestListener vKRequestListener = this.this$3.this$2.this$1.this$0.requestListener;
                                            if (vKRequestListener != null) {
                                                vKRequestListener.onComplete(vKResponse);
                                            }
                                            VKUploadOperation.access$400(this.this$3.this$2.this$1, VKAbstractOperation.VKOperationState.Finished);
                                        }

                                        public void onError(VKError vKError) {
                                            VKRequest.VKRequestListener vKRequestListener = this.this$3.this$2.this$1.this$0.requestListener;
                                            if (vKRequestListener != null) {
                                                vKRequestListener.onError(vKError);
                                            }
                                        }
                                    });
                                    this.this$2.this$1.lastOperation = ((VKRequest)object).getOperation();
                                    VKHttpClient.enqueueOperation(this.this$2.this$1.lastOperation);
                                }

                                public void onError(VKJsonOperation object, VKError vKError) {
                                    object = this.this$2.this$1.this$0.requestListener;
                                    if (object != null) {
                                        object.onError(vKError);
                                    }
                                }
                            };
                            vKJsonOperation.setHttpOperationListener(vKJSONOperationCompleteListener);
                            this.this$1.lastOperation = vKJsonOperation;
                            VKHttpClient.enqueueOperation(vKJsonOperation);
                        }
                        catch (JSONException jSONException) {
                            vKJSONOperationCompleteListener = new VKError(-104);
                            ((VKError)((Object)vKJSONOperationCompleteListener)).httpError = jSONException;
                            ((VKError)((Object)vKJSONOperationCompleteListener)).errorMessage = jSONException.getMessage();
                            VKRequest.VKRequestListener vKRequestListener = this.this$1.this$0.requestListener;
                            if (vKRequestListener == null) break block2;
                            vKRequestListener.onError((VKError)((Object)vKJSONOperationCompleteListener));
                        }
                    }
                }

                @Override
                public void onError(VKError vKError) {
                    VKRequest.VKRequestListener vKRequestListener = this.this$1.this$0.requestListener;
                    if (vKRequestListener != null) {
                        vKRequestListener.onError(vKError);
                    }
                }
            }
        };
    }

    public abstract VKRequest getSaveRequest(JSONObject var1);

    public abstract VKRequest getServerRequest();

    public abstract VKJsonOperation getUploadOperation(String var1);
}

