// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer.deeplink;

import org.json.JSONException;
import com.appsflyer.AFLogger;
import org.json.JSONObject;
import androidx.annotation.NonNull;

public class DeepLinkResult
{
    private final DeepLink deepLink;
    private final Error error;
    @NonNull
    private final Status status;
    
    public DeepLinkResult(final DeepLink deepLink, final Error error) {
        this.deepLink = deepLink;
        this.error = error;
        Status status;
        if (error != null) {
            status = Status.ERROR;
        }
        else if (deepLink != null) {
            status = Status.FOUND;
        }
        else {
            status = Status.NOT_FOUND;
        }
        this.status = status;
    }
    
    public DeepLink getDeepLink() {
        return this.deepLink;
    }
    
    public Error getError() {
        return this.error;
    }
    
    @NonNull
    public Status getStatus() {
        return this.status;
    }
    
    @Override
    public String toString() {
        final JSONObject jsonObject = new JSONObject();
        try {
            jsonObject.put("deepLink", (Object)this.deepLink);
            jsonObject.put("error", (Object)this.error);
            jsonObject.put("status", (Object)this.status);
        }
        catch (JSONException ex) {
            AFLogger.afErrorLogForExcManagerOnly("error while creating deep link json", (Throwable)ex);
        }
        return jsonObject.toString();
    }
    
    public enum Error
    {
        DEVELOPER_ERROR, 
        HTTP_STATUS_CODE, 
        NETWORK, 
        TIMEOUT, 
        UNEXPECTED;
    }
    
    public enum Status
    {
        ERROR, 
        FOUND, 
        NOT_FOUND;
    }
}
