/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.List
 *  java.util.Map
 *  java.util.concurrent.ExecutorService
 *  java.util.concurrent.atomic.AtomicBoolean
 *  org.json.JSONException
 */
package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFa1aSDK;
import com.appsflyer.internal.AFc1gSDK;
import com.appsflyer.internal.AFc1hSDK;
import com.appsflyer.internal.AFc1kSDK;
import com.appsflyer.internal.AFc1lSDK;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;

public final class AFc1qSDK<ResponseBody> {
    private final AFc1lSDK AFInAppEventParameterName;
    private final ExecutorService AFInAppEventType;
    private final AtomicBoolean AFKeystoreWrapper = new AtomicBoolean(false);
    public final AFa1aSDK valueOf;
    private final AFc1hSDK<ResponseBody> values;

    public AFc1qSDK(AFa1aSDK aFa1aSDK, ExecutorService executorService, AFc1lSDK aFc1lSDK, AFc1hSDK<ResponseBody> aFc1hSDK) {
        this.valueOf = aFa1aSDK;
        this.AFInAppEventType = executorService;
        this.AFInAppEventParameterName = aFc1lSDK;
        this.values = aFc1hSDK;
    }

    public final AFc1gSDK<ResponseBody> AFInAppEventType() {
        if (!this.AFKeystoreWrapper.getAndSet(true)) {
            AFc1gSDK<String> aFc1gSDK = this.AFInAppEventParameterName.AFInAppEventParameterName(this.valueOf);
            try {
                AFc1gSDK<ResponseBody> aFc1gSDK2 = new AFc1gSDK<ResponseBody>(this.values.values(aFc1gSDK.getBody()), aFc1gSDK.valueOf, aFc1gSDK.AFKeystoreWrapper, aFc1gSDK.AFInAppEventType, aFc1gSDK.values);
                return aFc1gSDK2;
            }
            catch (JSONException jSONException) {
                AFLogger.afErrorLogForExcManagerOnly("could not parse raw response - execute", (Throwable)jSONException);
                throw new ParsingException(jSONException.getMessage(), (Throwable)jSONException, aFc1gSDK);
            }
        }
        throw new IllegalStateException("Http call is already executed");
    }
}

