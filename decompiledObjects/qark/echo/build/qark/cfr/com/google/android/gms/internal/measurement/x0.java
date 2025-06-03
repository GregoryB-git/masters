/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.IInterface
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Map
 */
package com.google.android.gms.internal.measurement;

import H2.a;
import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.internal.measurement.E0;
import com.google.android.gms.internal.measurement.F0;
import com.google.android.gms.internal.measurement.H0;
import com.google.android.gms.internal.measurement.y0;
import java.util.Map;

public interface x0
extends IInterface {
    public void beginAdUnitExposure(String var1, long var2);

    public void clearConditionalUserProperty(String var1, String var2, Bundle var3);

    public void clearMeasurementEnabled(long var1);

    public void endAdUnitExposure(String var1, long var2);

    public void generateEventId(y0 var1);

    public void getAppInstanceId(y0 var1);

    public void getCachedAppInstanceId(y0 var1);

    public void getConditionalUserProperties(String var1, String var2, y0 var3);

    public void getCurrentScreenClass(y0 var1);

    public void getCurrentScreenName(y0 var1);

    public void getGmpAppId(y0 var1);

    public void getMaxUserProperties(String var1, y0 var2);

    public void getSessionId(y0 var1);

    public void getTestFlag(y0 var1, int var2);

    public void getUserProperties(String var1, String var2, boolean var3, y0 var4);

    public void initForTests(Map var1);

    public void initialize(a var1, H0 var2, long var3);

    public void isDataCollectionEnabled(y0 var1);

    public void logEvent(String var1, String var2, Bundle var3, boolean var4, boolean var5, long var6);

    public void logEventAndBundle(String var1, String var2, Bundle var3, y0 var4, long var5);

    public void logHealthData(int var1, String var2, a var3, a var4, a var5);

    public void onActivityCreated(a var1, Bundle var2, long var3);

    public void onActivityDestroyed(a var1, long var2);

    public void onActivityPaused(a var1, long var2);

    public void onActivityResumed(a var1, long var2);

    public void onActivitySaveInstanceState(a var1, y0 var2, long var3);

    public void onActivityStarted(a var1, long var2);

    public void onActivityStopped(a var1, long var2);

    public void performAction(Bundle var1, y0 var2, long var3);

    public void registerOnMeasurementEventListener(E0 var1);

    public void resetAnalyticsData(long var1);

    public void setConditionalUserProperty(Bundle var1, long var2);

    public void setConsent(Bundle var1, long var2);

    public void setConsentThirdParty(Bundle var1, long var2);

    public void setCurrentScreen(a var1, String var2, String var3, long var4);

    public void setDataCollectionEnabled(boolean var1);

    public void setDefaultEventParameters(Bundle var1);

    public void setEventInterceptor(E0 var1);

    public void setInstanceIdProvider(F0 var1);

    public void setMeasurementEnabled(boolean var1, long var2);

    public void setMinimumSessionDuration(long var1);

    public void setSessionTimeoutDuration(long var1);

    public void setUserId(String var1, long var2);

    public void setUserProperty(String var1, String var2, a var3, boolean var4, long var5);

    public void unregisterOnMeasurementEventListener(E0 var1);
}

