// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer;

import androidx.annotation.NonNull;
import com.appsflyer.deeplink.DeepLinkResult;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import com.appsflyer.share.LinkGenerator;
import com.appsflyer.deeplink.DeepLinkListener;

public class AppsFlyer2dXConversionCallback implements AppsFlyerConversionListener, DeepLinkListener, ResponseListener
{
    private void AFInAppEventParameterName(final String s, final String s2) {
        Block_0: {
            break Block_0;
        Block_1:
            while (true) {
                int i = 0;
            Label_0083_Outer:
                do {
                    while (true) {
                        Label_0107: {
                            Label_0076: {
                                break Label_0076;
                                while (true) {
                                    try {
                                        final JSONObject jsonObject = new JSONObject();
                                        jsonObject.put("status", (Object)"failure");
                                        jsonObject.put("data", (Object)s2);
                                        final int hashCode = s.hashCode();
                                        if (hashCode != -1390007222) {
                                            if (hashCode != 1050716216) {
                                                break Label_0076;
                                            }
                                            if (s.equals("onInstallConversionFailure")) {
                                                i = 0;
                                                break Label_0107;
                                            }
                                            break Label_0076;
                                        }
                                        else {
                                            if (s.equals("onAttributionFailure")) {
                                                i = 1;
                                                break Label_0107;
                                            }
                                            break Label_0076;
                                        }
                                        final JSONException ex;
                                        com.appsflyer.AFLogger.afErrorLogForExcManagerOnly("2dx error", (Throwable)ex);
                                        ((Throwable)ex).printStackTrace();
                                        return;
                                        this.onAttributionFailureNative(jsonObject);
                                        return;
                                        this.onInstallConversionFailureNative(jsonObject);
                                        return;
                                    }
                                    catch (JSONException ex) {
                                        continue Label_0083_Outer;
                                    }
                                    break;
                                }
                            }
                            i = -1;
                        }
                        if (i != 0) {
                            continue Block_1;
                        }
                        continue;
                    }
                } while (i == 1);
                break;
            }
        }
    }
    
    @Override
    public void onAppOpenAttribution(final Map<String, String> map) {
        this.onAppOpenAttributionNative(map);
    }
    
    public native void onAppOpenAttributionNative(final Object p0);
    
    @Override
    public void onAttributionFailure(final String s) {
        this.AFInAppEventParameterName("onInstallConversionFailure", s);
    }
    
    public native void onAttributionFailureNative(final Object p0);
    
    @Override
    public void onConversionDataFail(final String s) {
        this.AFInAppEventParameterName("onAttributionFailure", s);
    }
    
    @Override
    public void onConversionDataSuccess(final Map<String, Object> map) {
        this.onInstallConversionDataLoadedNative(map);
    }
    
    @Override
    public void onDeepLinking(@NonNull final DeepLinkResult deepLinkResult) {
        this.onDeepLinkingNative(deepLinkResult);
    }
    
    public native void onDeepLinkingNative(@NonNull final DeepLinkResult p0);
    
    public native void onInstallConversionDataLoadedNative(final Object p0);
    
    public native void onInstallConversionFailureNative(final Object p0);
    
    @Override
    public void onResponse(final String s) {
        this.onResponseNative(s);
    }
    
    @Override
    public void onResponseError(final String s) {
        this.onResponseErrorNative(s);
    }
    
    public native void onResponseErrorNative(final String p0);
    
    public native void onResponseNative(final String p0);
}
