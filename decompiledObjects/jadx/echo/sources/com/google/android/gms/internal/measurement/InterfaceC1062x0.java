package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IInterface;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.x0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1062x0 extends IInterface {
    void beginAdUnitExposure(String str, long j7);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j7);

    void endAdUnitExposure(String str, long j7);

    void generateEventId(InterfaceC1071y0 interfaceC1071y0);

    void getAppInstanceId(InterfaceC1071y0 interfaceC1071y0);

    void getCachedAppInstanceId(InterfaceC1071y0 interfaceC1071y0);

    void getConditionalUserProperties(String str, String str2, InterfaceC1071y0 interfaceC1071y0);

    void getCurrentScreenClass(InterfaceC1071y0 interfaceC1071y0);

    void getCurrentScreenName(InterfaceC1071y0 interfaceC1071y0);

    void getGmpAppId(InterfaceC1071y0 interfaceC1071y0);

    void getMaxUserProperties(String str, InterfaceC1071y0 interfaceC1071y0);

    void getSessionId(InterfaceC1071y0 interfaceC1071y0);

    void getTestFlag(InterfaceC1071y0 interfaceC1071y0, int i7);

    void getUserProperties(String str, String str2, boolean z7, InterfaceC1071y0 interfaceC1071y0);

    void initForTests(Map map);

    void initialize(H2.a aVar, H0 h02, long j7);

    void isDataCollectionEnabled(InterfaceC1071y0 interfaceC1071y0);

    void logEvent(String str, String str2, Bundle bundle, boolean z7, boolean z8, long j7);

    void logEventAndBundle(String str, String str2, Bundle bundle, InterfaceC1071y0 interfaceC1071y0, long j7);

    void logHealthData(int i7, String str, H2.a aVar, H2.a aVar2, H2.a aVar3);

    void onActivityCreated(H2.a aVar, Bundle bundle, long j7);

    void onActivityDestroyed(H2.a aVar, long j7);

    void onActivityPaused(H2.a aVar, long j7);

    void onActivityResumed(H2.a aVar, long j7);

    void onActivitySaveInstanceState(H2.a aVar, InterfaceC1071y0 interfaceC1071y0, long j7);

    void onActivityStarted(H2.a aVar, long j7);

    void onActivityStopped(H2.a aVar, long j7);

    void performAction(Bundle bundle, InterfaceC1071y0 interfaceC1071y0, long j7);

    void registerOnMeasurementEventListener(E0 e02);

    void resetAnalyticsData(long j7);

    void setConditionalUserProperty(Bundle bundle, long j7);

    void setConsent(Bundle bundle, long j7);

    void setConsentThirdParty(Bundle bundle, long j7);

    void setCurrentScreen(H2.a aVar, String str, String str2, long j7);

    void setDataCollectionEnabled(boolean z7);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(E0 e02);

    void setInstanceIdProvider(F0 f02);

    void setMeasurementEnabled(boolean z7, long j7);

    void setMinimumSessionDuration(long j7);

    void setSessionTimeoutDuration(long j7);

    void setUserId(String str, long j7);

    void setUserProperty(String str, String str2, H2.a aVar, boolean z7, long j7);

    void unregisterOnMeasurementEventListener(E0 e02);
}
