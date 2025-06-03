/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.Map
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.appsflyer;

import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.share.LinkGenerator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class AppsFlyer2dXConversionCallback
implements AppsFlyerConversionListener,
DeepLinkListener,
LinkGenerator.ResponseListener {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void AFInAppEventParameterName(String string2, String string3) {
        int n8;
        JSONObject jSONObject;
        block7 : {
            try {
                jSONObject = new JSONObject();
                jSONObject.put("status", (Object)"failure");
                jSONObject.put("data", (Object)string3);
                n8 = string2.hashCode();
                if (n8 != -1390007222) {
                    if (n8 != 1050716216) {
                        return;
                    }
                    if (!string2.equals((Object)"onInstallConversionFailure")) return;
                    n8 = 0;
                } else {
                    if (!string2.equals((Object)"onAttributionFailure")) return;
                    n8 = 1;
                }
                break block7;
            }
            catch (JSONException jSONException) {}
            AFLogger.afErrorLogForExcManagerOnly("2dx error", (Throwable)jSONException);
            jSONException.printStackTrace();
            return;
        }
        if (n8 == 0) {
            this.onInstallConversionFailureNative((Object)jSONObject);
            return;
        }
        if (n8 == 1) {
            this.onAttributionFailureNative((Object)jSONObject);
            return;
        }
    }

    @Override
    public void onAppOpenAttribution(Map<String, String> map) {
        this.onAppOpenAttributionNative(map);
    }

    public native void onAppOpenAttributionNative(Object var1);

    @Override
    public void onAttributionFailure(String string2) {
        this.AFInAppEventParameterName("onInstallConversionFailure", string2);
    }

    public native void onAttributionFailureNative(Object var1);

    @Override
    public void onConversionDataFail(String string2) {
        this.AFInAppEventParameterName("onAttributionFailure", string2);
    }

    @Override
    public void onConversionDataSuccess(Map<String, Object> map) {
        this.onInstallConversionDataLoadedNative(map);
    }

    @Override
    public void onDeepLinking(@NonNull DeepLinkResult deepLinkResult) {
        this.onDeepLinkingNative(deepLinkResult);
    }

    public native void onDeepLinkingNative(@NonNull DeepLinkResult var1);

    public native void onInstallConversionDataLoadedNative(Object var1);

    public native void onInstallConversionFailureNative(Object var1);

    @Override
    public void onResponse(String string2) {
        this.onResponseNative(string2);
    }

    @Override
    public void onResponseError(String string2) {
        this.onResponseErrorNative(string2);
    }

    public native void onResponseErrorNative(String var1);

    public native void onResponseNative(String var1);
}

