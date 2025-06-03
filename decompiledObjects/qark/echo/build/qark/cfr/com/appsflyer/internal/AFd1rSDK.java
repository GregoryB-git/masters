/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.HashMap
 *  java.util.Map
 *  java.util.UUID
 */
package com.appsflyer.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.AFa1eSDK;
import com.appsflyer.internal.AFb1bSDK;
import com.appsflyer.internal.AFb1gSDK;
import com.appsflyer.internal.AFc1gSDK;
import com.appsflyer.internal.AFc1oSDK;
import com.appsflyer.internal.AFc1qSDK;
import com.appsflyer.internal.AFc1xSDK;
import com.appsflyer.internal.AFd1oSDK;
import com.appsflyer.internal.AFd1vSDK;
import com.appsflyer.internal.AFd1ySDK;
import com.appsflyer.internal.AFd1zSDK;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import com.appsflyer.share.LinkGenerator;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public final class AFd1rSDK
extends AFd1oSDK<String> {
    private final String AFLogger$LogLevel;
    private final String AFVersionDeclaration;
    private final Map<String, String> afErrorLogForExcManagerOnly;
    private final AFb1gSDK afInfoLog;
    private final UUID afWarnLog;
    private final LinkGenerator.ResponseListener getLevel;

    public AFd1rSDK(@NonNull AFc1xSDK aFc1xSDK, @NonNull UUID uUID, @NonNull String string2, @NonNull Map<String, String> map, String string3, LinkGenerator.ResponseListener responseListener) {
        AFd1vSDK aFd1vSDK = AFd1vSDK.valueOf;
        AFd1vSDK aFd1vSDK2 = AFd1vSDK.values;
        String string4 = uUID.toString();
        super(aFd1vSDK, new AFd1vSDK[]{aFd1vSDK2}, aFc1xSDK, string4);
        this.afInfoLog = aFc1xSDK.AFInAppEventParameterName();
        this.afWarnLog = uUID;
        this.AFVersionDeclaration = string2;
        this.afErrorLogForExcManagerOnly = new HashMap(map);
        this.getLevel = responseListener;
        this.AFLogger$LogLevel = string3;
    }

    private String AFVersionDeclaration() {
        Object object = AppsFlyerProperties.getInstance().getString("onelinkDomain");
        String string2 = this.afInfoLog.valueOf.AFInAppEventType.getPackageName();
        object = new LinkGenerator("af_app_invites").setBaseURL(this.AFVersionDeclaration, (String)object, string2).addParameter("af_siteid", string2).addParameters(this.afErrorLogForExcManagerOnly);
        AFa1eSDK.valueOf();
        string2 = AFa1eSDK.AFInAppEventParameterName();
        if (string2 != null) {
            object.setReferrerCustomerId(string2);
        }
        return object.generateLink();
    }

    @Override
    public final long AFInAppEventType() {
        return 3000L;
    }

    @Override
    public final boolean afInfoLog() {
        return false;
    }

    @Override
    public final AppsFlyerRequestListener afRDLog() {
        return null;
    }

    @Override
    public final boolean getLevel() {
        return false;
    }

    @Override
    public final AFc1qSDK<String> values(@NonNull String string2) {
        return this.AFLogger.AFInAppEventType(this.AFVersionDeclaration, this.afErrorLogForExcManagerOnly, this.AFLogger$LogLevel, this.afWarnLog, string2);
    }

    @Override
    public final void values() {
        super.values();
        LinkGenerator.ResponseListener responseListener = this.getLevel;
        if (responseListener != null) {
            Throwable throwable;
            if (this.valueOf == AFd1ySDK.AFInAppEventParameterName && (throwable = this.afErrorLog) != null) {
                responseListener.onResponse((String)throwable.getBody());
                return;
            }
            throwable = this.afDebugLog();
            if (throwable instanceof ParsingException) {
                if (((ParsingException)throwable).getRawResponse().isSuccessful()) {
                    responseListener.onResponseError("Can't parse one link data");
                    return;
                }
                responseListener.onResponse(this.AFVersionDeclaration());
                return;
            }
            responseListener.onResponse(this.AFVersionDeclaration());
        }
    }
}

