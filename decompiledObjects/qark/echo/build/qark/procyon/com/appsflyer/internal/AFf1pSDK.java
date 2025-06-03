// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer.internal;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import java.util.Observable;

public abstract class AFf1pSDK extends Observable
{
    public final Map<String, Object> AFInAppEventParameterName;
    public final String AFKeystoreWrapper;
    public AFa1zSDK afDebugLog;
    long afInfoLog;
    public final String afRDLog;
    final Runnable values;
    
    public AFf1pSDK(final String afRDLog, final String afKeystoreWrapper, final Runnable values) {
        this.AFInAppEventParameterName = new HashMap<String, Object>();
        this.afDebugLog = AFa1zSDK.valueOf;
        this.values = values;
        this.AFKeystoreWrapper = afKeystoreWrapper;
        this.afRDLog = afRDLog;
    }
    
    public abstract void valueOf(final Context p0);
    
    public final void values() {
        this.AFInAppEventParameterName.put("source", this.AFKeystoreWrapper);
        this.AFInAppEventParameterName.put("type", this.afRDLog);
        this.AFInAppEventParameterName.put("latency", System.currentTimeMillis() - this.afInfoLog);
        this.afDebugLog = AFa1zSDK.values;
        this.setChanged();
        this.notifyObservers();
    }
    
    public enum AFa1zSDK
    {
        AFInAppEventType, 
        valueOf, 
        values;
    }
}
