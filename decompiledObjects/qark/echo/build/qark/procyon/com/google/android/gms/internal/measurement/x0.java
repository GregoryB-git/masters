// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import H2.a;
import java.util.Map;
import android.os.Bundle;
import android.os.IInterface;

public interface x0 extends IInterface
{
    void beginAdUnitExposure(final String p0, final long p1);
    
    void clearConditionalUserProperty(final String p0, final String p1, final Bundle p2);
    
    void clearMeasurementEnabled(final long p0);
    
    void endAdUnitExposure(final String p0, final long p1);
    
    void generateEventId(final y0 p0);
    
    void getAppInstanceId(final y0 p0);
    
    void getCachedAppInstanceId(final y0 p0);
    
    void getConditionalUserProperties(final String p0, final String p1, final y0 p2);
    
    void getCurrentScreenClass(final y0 p0);
    
    void getCurrentScreenName(final y0 p0);
    
    void getGmpAppId(final y0 p0);
    
    void getMaxUserProperties(final String p0, final y0 p1);
    
    void getSessionId(final y0 p0);
    
    void getTestFlag(final y0 p0, final int p1);
    
    void getUserProperties(final String p0, final String p1, final boolean p2, final y0 p3);
    
    void initForTests(final Map p0);
    
    void initialize(final a p0, final H0 p1, final long p2);
    
    void isDataCollectionEnabled(final y0 p0);
    
    void logEvent(final String p0, final String p1, final Bundle p2, final boolean p3, final boolean p4, final long p5);
    
    void logEventAndBundle(final String p0, final String p1, final Bundle p2, final y0 p3, final long p4);
    
    void logHealthData(final int p0, final String p1, final a p2, final a p3, final a p4);
    
    void onActivityCreated(final a p0, final Bundle p1, final long p2);
    
    void onActivityDestroyed(final a p0, final long p1);
    
    void onActivityPaused(final a p0, final long p1);
    
    void onActivityResumed(final a p0, final long p1);
    
    void onActivitySaveInstanceState(final a p0, final y0 p1, final long p2);
    
    void onActivityStarted(final a p0, final long p1);
    
    void onActivityStopped(final a p0, final long p1);
    
    void performAction(final Bundle p0, final y0 p1, final long p2);
    
    void registerOnMeasurementEventListener(final E0 p0);
    
    void resetAnalyticsData(final long p0);
    
    void setConditionalUserProperty(final Bundle p0, final long p1);
    
    void setConsent(final Bundle p0, final long p1);
    
    void setConsentThirdParty(final Bundle p0, final long p1);
    
    void setCurrentScreen(final a p0, final String p1, final String p2, final long p3);
    
    void setDataCollectionEnabled(final boolean p0);
    
    void setDefaultEventParameters(final Bundle p0);
    
    void setEventInterceptor(final E0 p0);
    
    void setInstanceIdProvider(final F0 p0);
    
    void setMeasurementEnabled(final boolean p0, final long p1);
    
    void setMinimumSessionDuration(final long p0);
    
    void setSessionTimeoutDuration(final long p0);
    
    void setUserId(final String p0, final long p1);
    
    void setUserProperty(final String p0, final String p1, final a p2, final boolean p3, final long p4);
    
    void unregisterOnMeasurementEventListener(final E0 p0);
}
