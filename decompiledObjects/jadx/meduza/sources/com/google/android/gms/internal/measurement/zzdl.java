package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.Map;

/* loaded from: classes.dex */
public interface zzdl extends IInterface {
    void beginAdUnitExposure(String str, long j10);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j10);

    void endAdUnitExposure(String str, long j10);

    void generateEventId(zzdq zzdqVar);

    void getAppInstanceId(zzdq zzdqVar);

    void getCachedAppInstanceId(zzdq zzdqVar);

    void getConditionalUserProperties(String str, String str2, zzdq zzdqVar);

    void getCurrentScreenClass(zzdq zzdqVar);

    void getCurrentScreenName(zzdq zzdqVar);

    void getGmpAppId(zzdq zzdqVar);

    void getMaxUserProperties(String str, zzdq zzdqVar);

    void getSessionId(zzdq zzdqVar);

    void getTestFlag(zzdq zzdqVar, int i10);

    void getUserProperties(String str, String str2, boolean z10, zzdq zzdqVar);

    void initForTests(Map map);

    void initialize(IObjectWrapper iObjectWrapper, zzdz zzdzVar, long j10);

    void isDataCollectionEnabled(zzdq zzdqVar);

    void logEvent(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10);

    void logEventAndBundle(String str, String str2, Bundle bundle, zzdq zzdqVar, long j10);

    void logHealthData(int i10, String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3);

    void onActivityCreated(IObjectWrapper iObjectWrapper, Bundle bundle, long j10);

    void onActivityCreatedByScionActivityInfo(zzeb zzebVar, Bundle bundle, long j10);

    void onActivityDestroyed(IObjectWrapper iObjectWrapper, long j10);

    void onActivityDestroyedByScionActivityInfo(zzeb zzebVar, long j10);

    void onActivityPaused(IObjectWrapper iObjectWrapper, long j10);

    void onActivityPausedByScionActivityInfo(zzeb zzebVar, long j10);

    void onActivityResumed(IObjectWrapper iObjectWrapper, long j10);

    void onActivityResumedByScionActivityInfo(zzeb zzebVar, long j10);

    void onActivitySaveInstanceState(IObjectWrapper iObjectWrapper, zzdq zzdqVar, long j10);

    void onActivitySaveInstanceStateByScionActivityInfo(zzeb zzebVar, zzdq zzdqVar, long j10);

    void onActivityStarted(IObjectWrapper iObjectWrapper, long j10);

    void onActivityStartedByScionActivityInfo(zzeb zzebVar, long j10);

    void onActivityStopped(IObjectWrapper iObjectWrapper, long j10);

    void onActivityStoppedByScionActivityInfo(zzeb zzebVar, long j10);

    void performAction(Bundle bundle, zzdq zzdqVar, long j10);

    void registerOnMeasurementEventListener(zzdw zzdwVar);

    void resetAnalyticsData(long j10);

    void retrieveAndUploadBatches(zzdr zzdrVar);

    void setConditionalUserProperty(Bundle bundle, long j10);

    void setConsent(Bundle bundle, long j10);

    void setConsentThirdParty(Bundle bundle, long j10);

    void setCurrentScreen(IObjectWrapper iObjectWrapper, String str, String str2, long j10);

    void setCurrentScreenByScionActivityInfo(zzeb zzebVar, String str, String str2, long j10);

    void setDataCollectionEnabled(boolean z10);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(zzdw zzdwVar);

    void setInstanceIdProvider(zzdx zzdxVar);

    void setMeasurementEnabled(boolean z10, long j10);

    void setMinimumSessionDuration(long j10);

    void setSessionTimeoutDuration(long j10);

    void setSgtmDebugInfo(Intent intent);

    void setUserId(String str, long j10);

    void setUserProperty(String str, String str2, IObjectWrapper iObjectWrapper, boolean z10, long j10);

    void unregisterOnMeasurementEventListener(zzdw zzdwVar);
}
