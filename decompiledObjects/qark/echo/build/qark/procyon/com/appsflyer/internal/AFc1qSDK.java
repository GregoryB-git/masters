// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer.internal;

import org.json.JSONException;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import com.appsflyer.AFLogger;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.ExecutorService;

public final class AFc1qSDK<ResponseBody>
{
    private final AFc1lSDK AFInAppEventParameterName;
    private final ExecutorService AFInAppEventType;
    private final AtomicBoolean AFKeystoreWrapper;
    public final AFa1aSDK valueOf;
    private final AFc1hSDK<ResponseBody> values;
    
    public AFc1qSDK(final AFa1aSDK valueOf, final ExecutorService afInAppEventType, final AFc1lSDK afInAppEventParameterName, final AFc1hSDK<ResponseBody> values) {
        this.AFKeystoreWrapper = new AtomicBoolean(false);
        this.valueOf = valueOf;
        this.AFInAppEventType = afInAppEventType;
        this.AFInAppEventParameterName = afInAppEventParameterName;
        this.values = values;
    }
    
    public final AFc1gSDK<ResponseBody> AFInAppEventType() {
        if (!this.AFKeystoreWrapper.getAndSet(true)) {
            final AFc1gSDK<String> afInAppEventParameterName = this.AFInAppEventParameterName.AFInAppEventParameterName(this.valueOf);
            try {
                return new AFc1gSDK<ResponseBody>(this.values.values(afInAppEventParameterName.getBody()), afInAppEventParameterName.valueOf, afInAppEventParameterName.AFKeystoreWrapper, afInAppEventParameterName.AFInAppEventType, afInAppEventParameterName.values);
            }
            catch (JSONException ex) {
                AFLogger.afErrorLogForExcManagerOnly("could not parse raw response - execute", (Throwable)ex);
                throw new ParsingException(((Throwable)ex).getMessage(), (Throwable)ex, afInAppEventParameterName);
            }
        }
        throw new IllegalStateException("Http call is already executed");
    }
}
