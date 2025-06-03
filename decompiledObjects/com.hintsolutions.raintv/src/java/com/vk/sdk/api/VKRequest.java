/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.os.Handler
 *  android.os.Looper
 *  androidx.annotation.Nullable
 *  com.vk.sdk.api.VKRequest$1
 *  com.vk.sdk.api.httpClient.VKJsonOperation
 *  com.vk.sdk.api.httpClient.VKModelOperation
 *  java.lang.Class
 *  java.lang.Deprecated
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.ref.WeakReference
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Locale
 *  java.util.Map
 *  org.json.JSONObject
 */
package com.vk.sdk.api;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import com.vk.sdk.VKAccessToken;
import com.vk.sdk.VKObject;
import com.vk.sdk.VKSdk;
import com.vk.sdk.VKServiceActivity;
import com.vk.sdk.VKUIHelper;
import com.vk.sdk.api.VKError;
import com.vk.sdk.api.VKParameters;
import com.vk.sdk.api.VKParser;
import com.vk.sdk.api.VKRequest;
import com.vk.sdk.api.VKResponse;
import com.vk.sdk.api.VKSyncRequestUtil;
import com.vk.sdk.api.httpClient.VKAbstractOperation;
import com.vk.sdk.api.httpClient.VKHttpClient;
import com.vk.sdk.api.httpClient.VKHttpOperation;
import com.vk.sdk.api.httpClient.VKJsonOperation;
import com.vk.sdk.api.httpClient.VKModelOperation;
import com.vk.sdk.api.model.VKApiModel;
import com.vk.sdk.util.VKStringJoiner;
import com.vk.sdk.util.VKUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

public class VKRequest
extends VKObject {
    public int attempts;
    public final Context context = VKUIHelper.getApplicationContext();
    private int mAttemptsUsed;
    private VKAbstractOperation mLoadingOperation;
    private Looper mLooper;
    private final VKParameters mMethodParameters;
    private Class<? extends VKApiModel> mModelClass;
    private VKParser mModelParser;
    private ArrayList<VKRequest> mPostRequestsQueue;
    private String mPreferredLang;
    private VKParameters mPreparedParameters;
    private boolean mUseLooperForCallListener = true;
    public final String methodName;
    public boolean parseModel;
    @Nullable
    public VKRequestListener requestListener;
    public WeakReference<VKResponse> response;
    public boolean secure;
    public boolean shouldInterruptUI;
    public boolean useSystemLanguage;

    public VKRequest(String string2) {
        this(string2, null);
    }

    public VKRequest(String string2, VKParameters vKParameters) {
        this(string2, vKParameters, null);
    }

    @Deprecated
    public VKRequest(String string2, VKParameters vKParameters, HttpMethod httpMethod, Class<? extends VKApiModel> clazz) {
        this(string2, vKParameters, clazz);
    }

    public VKRequest(String object, VKParameters vKParameters, Class<? extends VKApiModel> clazz) {
        this.methodName = object;
        object = vKParameters;
        if (vKParameters == null) {
            object = new VKParameters();
        }
        this.mMethodParameters = new VKParameters((Map<String, Object>)object);
        this.mAttemptsUsed = 0;
        this.secure = true;
        this.attempts = 1;
        this.mPreferredLang = "en";
        this.useSystemLanguage = true;
        this.shouldInterruptUI = true;
        this.setModelClass(clazz);
    }

    public static /* synthetic */ boolean access$000(VKRequest vKRequest, VKError vKError) {
        return vKRequest.processCommonError(vKError);
    }

    public static /* synthetic */ void access$100(VKRequest vKRequest, VKError vKError) {
        vKRequest.provideError(vKError);
    }

    public static /* synthetic */ VKAbstractOperation access$200(VKRequest vKRequest) {
        return vKRequest.mLoadingOperation;
    }

    public static /* synthetic */ void access$300(VKRequest vKRequest, JSONObject jSONObject, Object object) {
        vKRequest.provideResponse(jSONObject, object);
    }

    public static /* synthetic */ int access$400(VKRequest vKRequest) {
        return vKRequest.mAttemptsUsed;
    }

    public static /* synthetic */ int access$404(VKRequest vKRequest) {
        int n;
        vKRequest.mAttemptsUsed = n = vKRequest.mAttemptsUsed + 1;
        return n;
    }

    public static /* synthetic */ void access$500(VKRequest vKRequest, Runnable runnable, int n) {
        vKRequest.runOnLooper(runnable, n);
    }

    public static /* synthetic */ ArrayList access$600(VKRequest vKRequest) {
        return vKRequest.mPostRequestsQueue;
    }

    private void addPostRequest(VKRequest vKRequest) {
        if (this.mPostRequestsQueue == null) {
            this.mPostRequestsQueue = new ArrayList();
        }
        this.mPostRequestsQueue.add((Object)vKRequest);
    }

    private String generateSig(VKAccessToken vKAccessToken) {
        String string2 = VKStringJoiner.joinParams(this.mPreparedParameters);
        string2 = z2.t(String.format((Locale)Locale.US, (String)"/method/%s?%s", (Object[])new Object[]{this.methodName, string2}));
        string2.append(vKAccessToken.secret);
        return VKUtil.md5(string2.toString());
    }

    private VKJsonOperation.VKJSONOperationCompleteListener getHttpListener() {
        return new 1(this);
    }

    private String getLang() {
        String string2 = this.mPreferredLang;
        Resources resources = Resources.getSystem();
        String string3 = string2;
        if (this.useSystemLanguage) {
            string3 = string2;
            if (resources != null) {
                string2 = string3 = resources.getConfiguration().locale.getLanguage();
                if (string3.equals((Object)"uk")) {
                    string2 = "ua";
                }
                string3 = string2;
                if (!Arrays.asList((Object[])new String[]{"ru", "en", "ua", "es", "fi", "de", "it"}).contains((Object)string2)) {
                    string3 = this.mPreferredLang;
                }
            }
        }
        return string3;
    }

    public static VKRequest getRegisteredRequest(long l) {
        return (VKRequest)VKObject.getRegisteredObject(l);
    }

    private boolean processCommonError(VKError object) {
        if (((VKError)object).errorCode == -101) {
            VKError vKError = ((VKError)object).apiError;
            VKSdk.notifySdkAboutApiError(vKError);
            int n = vKError.errorCode;
            if (n == 16) {
                object = VKAccessToken.currentToken();
                if (object != null) {
                    ((VKAccessToken)object).httpsRequired = true;
                    ((VKAccessToken)object).save();
                }
                this.repeat();
                return true;
            }
            if (this.shouldInterruptUI) {
                vKError.request = this;
                if (((VKError)object).apiError.errorCode == 14) {
                    this.mLoadingOperation = null;
                    VKServiceActivity.interruptWithError(this.context, vKError, VKServiceActivity.VKServiceType.Captcha);
                    return true;
                }
                if (n == 17) {
                    VKServiceActivity.interruptWithError(this.context, vKError, VKServiceActivity.VKServiceType.Validation);
                    return true;
                }
            }
        }
        return false;
    }

    private void provideError(VKError vKError) {
        VKRequestListener vKRequestListener;
        vKError.request = this;
        boolean bl = this.mUseLooperForCallListener;
        if (!bl && (vKRequestListener = this.requestListener) != null) {
            vKRequestListener.onError(vKError);
        }
        this.runOnLooper(new Runnable(this, bl, vKError){
            public final VKRequest this$0;
            public final VKError val$error;
            public final boolean val$useLooperForCallListener;
            {
                this.this$0 = vKRequest;
                this.val$useLooperForCallListener = bl;
                this.val$error = vKError;
            }

            public void run() {
                VKRequestListener vKRequestListener;
                if (this.val$useLooperForCallListener && (vKRequestListener = this.this$0.requestListener) != null) {
                    vKRequestListener.onError(this.val$error);
                }
                if (VKRequest.access$600(this.this$0) != null && VKRequest.access$600(this.this$0).size() > 0) {
                    vKRequestListener = VKRequest.access$600(this.this$0).iterator();
                    while (vKRequestListener.hasNext()) {
                        VKRequestListener vKRequestListener2 = ((VKRequest)vKRequestListener.next()).requestListener;
                        if (vKRequestListener2 == null) continue;
                        vKRequestListener2.onError(this.val$error);
                    }
                }
            }
        });
    }

    private void provideResponse(JSONObject object, Object object2) {
        VKResponse vKResponse = new VKResponse();
        vKResponse.request = this;
        vKResponse.json = object;
        vKResponse.parsedModel = object2;
        this.response = new WeakReference((Object)vKResponse);
        object = this.mLoadingOperation;
        if (object instanceof VKHttpOperation) {
            vKResponse.responseString = ((VKHttpOperation)object).getResponseString();
        }
        boolean bl = this.mUseLooperForCallListener;
        this.runOnLooper(new Runnable(this, bl, vKResponse){
            public final VKRequest this$0;
            public final VKResponse val$response;
            public final boolean val$useLooperForCallListener;
            {
                this.this$0 = vKRequest;
                this.val$useLooperForCallListener = bl;
                this.val$response = vKResponse;
            }

            public void run() {
                VKRequestListener vKRequestListener;
                if (VKRequest.access$600(this.this$0) != null && VKRequest.access$600(this.this$0).size() > 0) {
                    vKRequestListener = VKRequest.access$600(this.this$0).iterator();
                    while (vKRequestListener.hasNext()) {
                        ((VKRequest)vKRequestListener.next()).start();
                    }
                }
                if (this.val$useLooperForCallListener && (vKRequestListener = this.this$0.requestListener) != null) {
                    vKRequestListener.onComplete(this.val$response);
                }
            }
        });
        if (!bl && (object = this.requestListener) != null) {
            object.onComplete(vKResponse);
        }
    }

    private void runOnLooper(Runnable runnable) {
        this.runOnLooper(runnable, 0);
    }

    private void runOnLooper(Runnable runnable, int n) {
        if (this.mLooper == null) {
            this.mLooper = Looper.getMainLooper();
        }
        if (n > 0) {
            new Handler(this.mLooper).postDelayed(runnable, (long)n);
        } else {
            new Handler(this.mLooper).post(runnable);
        }
    }

    private void runOnMainLooper(Runnable runnable) {
        new Handler(Looper.getMainLooper()).post(runnable);
    }

    public void addExtraParameter(String string2, Object object) {
        this.mMethodParameters.put(string2, object);
    }

    public void addExtraParameters(VKParameters vKParameters) {
        this.mMethodParameters.putAll((Map)vKParameters);
    }

    public void cancel() {
        VKAbstractOperation vKAbstractOperation = this.mLoadingOperation;
        if (vKAbstractOperation != null) {
            vKAbstractOperation.cancel();
        } else {
            this.provideError(new VKError(-102));
        }
    }

    public void executeAfterRequest(VKRequest vKRequest, VKRequestListener vKRequestListener) {
        this.requestListener = vKRequestListener;
        vKRequest.addPostRequest(this);
    }

    public void executeSyncWithListener(VKRequestListener vKRequestListener) {
        VKSyncRequestUtil.executeSyncWithListener(this, vKRequestListener);
    }

    public void executeWithListener(VKRequestListener vKRequestListener) {
        this.requestListener = vKRequestListener;
        this.start();
    }

    public VKParameters getMethodParameters() {
        return this.mMethodParameters;
    }

    public VKAbstractOperation getOperation() {
        VKAbstractOperation vKAbstractOperation;
        if (this.parseModel) {
            if (this.mModelClass != null) {
                this.mLoadingOperation = new VKModelOperation(this.getPreparedRequest(), this.mModelClass);
            } else if (this.mModelParser != null) {
                this.mLoadingOperation = new VKModelOperation(this.getPreparedRequest(), this.mModelParser);
            }
        }
        if (this.mLoadingOperation == null) {
            this.mLoadingOperation = new VKJsonOperation(this.getPreparedRequest());
        }
        if ((vKAbstractOperation = this.mLoadingOperation) instanceof VKHttpOperation) {
            ((VKHttpOperation)vKAbstractOperation).setHttpOperationListener(this.getHttpListener());
        }
        return this.mLoadingOperation;
    }

    public VKParameters getPreparedParameters() {
        if (this.mPreparedParameters == null) {
            this.mPreparedParameters = new VKParameters((Map<String, Object>)this.mMethodParameters);
            Object object = VKAccessToken.currentToken();
            if (object != null) {
                this.mPreparedParameters.put("access_token", ((VKAccessToken)object).accessToken);
                if (((VKAccessToken)object).httpsRequired) {
                    this.secure = true;
                }
            }
            this.mPreparedParameters.put("v", VKSdk.getApiVersion());
            this.mPreparedParameters.put("lang", this.getLang());
            if (this.secure) {
                this.mPreparedParameters.put("https", "1");
            }
            if (object != null && ((VKAccessToken)object).secret != null) {
                object = this.generateSig((VKAccessToken)object);
                this.mPreparedParameters.put("sig", object);
            }
        }
        return this.mPreparedParameters;
    }

    public VKHttpClient.VKHTTPRequest getPreparedRequest() {
        VKHttpClient.VKHTTPRequest vKHTTPRequest;
        VKHttpClient.VKHTTPRequest vKHTTPRequest2 = vKHTTPRequest = VKHttpClient.requestWithVkRequest(this);
        if (vKHTTPRequest == null) {
            this.provideError(new VKError(-103));
            vKHTTPRequest2 = null;
        }
        return vKHTTPRequest2;
    }

    public void repeat() {
        this.mAttemptsUsed = 0;
        this.mPreparedParameters = null;
        this.mLoadingOperation = null;
        this.start();
    }

    public void setModelClass(Class<? extends VKApiModel> clazz) {
        this.mModelClass = clazz;
        if (clazz != null) {
            this.parseModel = true;
        }
    }

    public void setPreferredLang(String string2) {
        this.useSystemLanguage = false;
        this.mPreferredLang = string2;
    }

    public void setRequestListener(@Nullable VKRequestListener vKRequestListener) {
        this.requestListener = vKRequestListener;
    }

    public void setResponseParser(VKParser vKParser) {
        this.mModelParser = vKParser;
        if (vKParser != null) {
            this.parseModel = true;
        }
    }

    public void setUseLooperForCallListener(boolean bl) {
        this.mUseLooperForCallListener = bl;
    }

    public void start() {
        VKAbstractOperation vKAbstractOperation;
        this.mLoadingOperation = vKAbstractOperation = this.getOperation();
        if (vKAbstractOperation == null) {
            return;
        }
        if (this.mLooper == null) {
            this.mLooper = Looper.myLooper();
        }
        VKHttpClient.enqueueOperation(this.mLoadingOperation);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(super.toString());
        stringBuilder.append("{");
        stringBuilder.append(this.methodName);
        stringBuilder.append(" ");
        VKParameters vKParameters = this.getMethodParameters();
        for (String string2 : vKParameters.keySet()) {
            stringBuilder.append(string2);
            stringBuilder.append("=");
            stringBuilder.append(vKParameters.get(string2));
            stringBuilder.append(" ");
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

