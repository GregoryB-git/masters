package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzdn extends zzbu implements zzdl {
    public zzdn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    @Override // com.google.android.gms.internal.measurement.zzdl
    public final void beginAdUnitExposure(String str, long j10) {
        Parcel b_ = b_();
        b_.writeString(str);
        b_.writeLong(j10);
        zzb(23, b_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdl
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel b_ = b_();
        b_.writeString(str);
        b_.writeString(str2);
        zzbw.zza(b_, bundle);
        zzb(9, b_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdl
    public final void clearMeasurementEnabled(long j10) {
        Parcel b_ = b_();
        b_.writeLong(j10);
        zzb(43, b_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdl
    public final void endAdUnitExposure(String str, long j10) {
        Parcel b_ = b_();
        b_.writeString(str);
        b_.writeLong(j10);
        zzb(24, b_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdl
    public final void generateEventId(zzdq zzdqVar) {
        Parcel b_ = b_();
        zzbw.zza(b_, zzdqVar);
        zzb(22, b_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdl
    public final void getAppInstanceId(zzdq zzdqVar) {
        Parcel b_ = b_();
        zzbw.zza(b_, zzdqVar);
        zzb(20, b_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdl
    public final void getCachedAppInstanceId(zzdq zzdqVar) {
        Parcel b_ = b_();
        zzbw.zza(b_, zzdqVar);
        zzb(19, b_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdl
    public final void getConditionalUserProperties(String str, String str2, zzdq zzdqVar) {
        Parcel b_ = b_();
        b_.writeString(str);
        b_.writeString(str2);
        zzbw.zza(b_, zzdqVar);
        zzb(10, b_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdl
    public final void getCurrentScreenClass(zzdq zzdqVar) {
        Parcel b_ = b_();
        zzbw.zza(b_, zzdqVar);
        zzb(17, b_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdl
    public final void getCurrentScreenName(zzdq zzdqVar) {
        Parcel b_ = b_();
        zzbw.zza(b_, zzdqVar);
        zzb(16, b_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdl
    public final void getGmpAppId(zzdq zzdqVar) {
        Parcel b_ = b_();
        zzbw.zza(b_, zzdqVar);
        zzb(21, b_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdl
    public final void getMaxUserProperties(String str, zzdq zzdqVar) {
        Parcel b_ = b_();
        b_.writeString(str);
        zzbw.zza(b_, zzdqVar);
        zzb(6, b_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdl
    public final void getSessionId(zzdq zzdqVar) {
        Parcel b_ = b_();
        zzbw.zza(b_, zzdqVar);
        zzb(46, b_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdl
    public final void getTestFlag(zzdq zzdqVar, int i10) {
        Parcel b_ = b_();
        zzbw.zza(b_, zzdqVar);
        b_.writeInt(i10);
        zzb(38, b_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdl
    public final void getUserProperties(String str, String str2, boolean z10, zzdq zzdqVar) {
        Parcel b_ = b_();
        b_.writeString(str);
        b_.writeString(str2);
        zzbw.zza(b_, z10);
        zzbw.zza(b_, zzdqVar);
        zzb(5, b_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdl
    public final void initForTests(Map map) {
        Parcel b_ = b_();
        b_.writeMap(map);
        zzb(37, b_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdl
    public final void initialize(IObjectWrapper iObjectWrapper, zzdz zzdzVar, long j10) {
        Parcel b_ = b_();
        zzbw.zza(b_, iObjectWrapper);
        zzbw.zza(b_, zzdzVar);
        b_.writeLong(j10);
        zzb(1, b_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdl
    public final void isDataCollectionEnabled(zzdq zzdqVar) {
        Parcel b_ = b_();
        zzbw.zza(b_, zzdqVar);
        zzb(40, b_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdl
    public final void logEvent(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10) {
        Parcel b_ = b_();
        b_.writeString(str);
        b_.writeString(str2);
        zzbw.zza(b_, bundle);
        zzbw.zza(b_, z10);
        zzbw.zza(b_, z11);
        b_.writeLong(j10);
        zzb(2, b_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdl
    public final void logEventAndBundle(String str, String str2, Bundle bundle, zzdq zzdqVar, long j10) {
        Parcel b_ = b_();
        b_.writeString(str);
        b_.writeString(str2);
        zzbw.zza(b_, bundle);
        zzbw.zza(b_, zzdqVar);
        b_.writeLong(j10);
        zzb(3, b_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdl
    public final void logHealthData(int i10, String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        Parcel b_ = b_();
        b_.writeInt(i10);
        b_.writeString(str);
        zzbw.zza(b_, iObjectWrapper);
        zzbw.zza(b_, iObjectWrapper2);
        zzbw.zza(b_, iObjectWrapper3);
        zzb(33, b_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdl
    public final void onActivityCreated(IObjectWrapper iObjectWrapper, Bundle bundle, long j10) {
        Parcel b_ = b_();
        zzbw.zza(b_, iObjectWrapper);
        zzbw.zza(b_, bundle);
        b_.writeLong(j10);
        zzb(27, b_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdl
    public final void onActivityCreatedByScionActivityInfo(zzeb zzebVar, Bundle bundle, long j10) {
        Parcel b_ = b_();
        zzbw.zza(b_, zzebVar);
        zzbw.zza(b_, bundle);
        b_.writeLong(j10);
        zzb(53, b_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdl
    public final void onActivityDestroyed(IObjectWrapper iObjectWrapper, long j10) {
        Parcel b_ = b_();
        zzbw.zza(b_, iObjectWrapper);
        b_.writeLong(j10);
        zzb(28, b_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdl
    public final void onActivityDestroyedByScionActivityInfo(zzeb zzebVar, long j10) {
        Parcel b_ = b_();
        zzbw.zza(b_, zzebVar);
        b_.writeLong(j10);
        zzb(54, b_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdl
    public final void onActivityPaused(IObjectWrapper iObjectWrapper, long j10) {
        Parcel b_ = b_();
        zzbw.zza(b_, iObjectWrapper);
        b_.writeLong(j10);
        zzb(29, b_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdl
    public final void onActivityPausedByScionActivityInfo(zzeb zzebVar, long j10) {
        Parcel b_ = b_();
        zzbw.zza(b_, zzebVar);
        b_.writeLong(j10);
        zzb(55, b_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdl
    public final void onActivityResumed(IObjectWrapper iObjectWrapper, long j10) {
        Parcel b_ = b_();
        zzbw.zza(b_, iObjectWrapper);
        b_.writeLong(j10);
        zzb(30, b_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdl
    public final void onActivityResumedByScionActivityInfo(zzeb zzebVar, long j10) {
        Parcel b_ = b_();
        zzbw.zza(b_, zzebVar);
        b_.writeLong(j10);
        zzb(56, b_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdl
    public final void onActivitySaveInstanceState(IObjectWrapper iObjectWrapper, zzdq zzdqVar, long j10) {
        Parcel b_ = b_();
        zzbw.zza(b_, iObjectWrapper);
        zzbw.zza(b_, zzdqVar);
        b_.writeLong(j10);
        zzb(31, b_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdl
    public final void onActivitySaveInstanceStateByScionActivityInfo(zzeb zzebVar, zzdq zzdqVar, long j10) {
        Parcel b_ = b_();
        zzbw.zza(b_, zzebVar);
        zzbw.zza(b_, zzdqVar);
        b_.writeLong(j10);
        zzb(57, b_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdl
    public final void onActivityStarted(IObjectWrapper iObjectWrapper, long j10) {
        Parcel b_ = b_();
        zzbw.zza(b_, iObjectWrapper);
        b_.writeLong(j10);
        zzb(25, b_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdl
    public final void onActivityStartedByScionActivityInfo(zzeb zzebVar, long j10) {
        Parcel b_ = b_();
        zzbw.zza(b_, zzebVar);
        b_.writeLong(j10);
        zzb(51, b_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdl
    public final void onActivityStopped(IObjectWrapper iObjectWrapper, long j10) {
        Parcel b_ = b_();
        zzbw.zza(b_, iObjectWrapper);
        b_.writeLong(j10);
        zzb(26, b_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdl
    public final void onActivityStoppedByScionActivityInfo(zzeb zzebVar, long j10) {
        Parcel b_ = b_();
        zzbw.zza(b_, zzebVar);
        b_.writeLong(j10);
        zzb(52, b_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdl
    public final void performAction(Bundle bundle, zzdq zzdqVar, long j10) {
        Parcel b_ = b_();
        zzbw.zza(b_, bundle);
        zzbw.zza(b_, zzdqVar);
        b_.writeLong(j10);
        zzb(32, b_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdl
    public final void registerOnMeasurementEventListener(zzdw zzdwVar) {
        Parcel b_ = b_();
        zzbw.zza(b_, zzdwVar);
        zzb(35, b_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdl
    public final void resetAnalyticsData(long j10) {
        Parcel b_ = b_();
        b_.writeLong(j10);
        zzb(12, b_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdl
    public final void retrieveAndUploadBatches(zzdr zzdrVar) {
        Parcel b_ = b_();
        zzbw.zza(b_, zzdrVar);
        zzb(58, b_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdl
    public final void setConditionalUserProperty(Bundle bundle, long j10) {
        Parcel b_ = b_();
        zzbw.zza(b_, bundle);
        b_.writeLong(j10);
        zzb(8, b_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdl
    public final void setConsent(Bundle bundle, long j10) {
        Parcel b_ = b_();
        zzbw.zza(b_, bundle);
        b_.writeLong(j10);
        zzb(44, b_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdl
    public final void setConsentThirdParty(Bundle bundle, long j10) {
        Parcel b_ = b_();
        zzbw.zza(b_, bundle);
        b_.writeLong(j10);
        zzb(45, b_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdl
    public final void setCurrentScreen(IObjectWrapper iObjectWrapper, String str, String str2, long j10) {
        Parcel b_ = b_();
        zzbw.zza(b_, iObjectWrapper);
        b_.writeString(str);
        b_.writeString(str2);
        b_.writeLong(j10);
        zzb(15, b_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdl
    public final void setCurrentScreenByScionActivityInfo(zzeb zzebVar, String str, String str2, long j10) {
        Parcel b_ = b_();
        zzbw.zza(b_, zzebVar);
        b_.writeString(str);
        b_.writeString(str2);
        b_.writeLong(j10);
        zzb(50, b_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdl
    public final void setDataCollectionEnabled(boolean z10) {
        Parcel b_ = b_();
        zzbw.zza(b_, z10);
        zzb(39, b_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdl
    public final void setDefaultEventParameters(Bundle bundle) {
        Parcel b_ = b_();
        zzbw.zza(b_, bundle);
        zzb(42, b_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdl
    public final void setEventInterceptor(zzdw zzdwVar) {
        Parcel b_ = b_();
        zzbw.zza(b_, zzdwVar);
        zzb(34, b_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdl
    public final void setInstanceIdProvider(zzdx zzdxVar) {
        Parcel b_ = b_();
        zzbw.zza(b_, zzdxVar);
        zzb(18, b_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdl
    public final void setMeasurementEnabled(boolean z10, long j10) {
        Parcel b_ = b_();
        zzbw.zza(b_, z10);
        b_.writeLong(j10);
        zzb(11, b_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdl
    public final void setMinimumSessionDuration(long j10) {
        Parcel b_ = b_();
        b_.writeLong(j10);
        zzb(13, b_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdl
    public final void setSessionTimeoutDuration(long j10) {
        Parcel b_ = b_();
        b_.writeLong(j10);
        zzb(14, b_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdl
    public final void setSgtmDebugInfo(Intent intent) {
        Parcel b_ = b_();
        zzbw.zza(b_, intent);
        zzb(48, b_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdl
    public final void setUserId(String str, long j10) {
        Parcel b_ = b_();
        b_.writeString(str);
        b_.writeLong(j10);
        zzb(7, b_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdl
    public final void setUserProperty(String str, String str2, IObjectWrapper iObjectWrapper, boolean z10, long j10) {
        Parcel b_ = b_();
        b_.writeString(str);
        b_.writeString(str2);
        zzbw.zza(b_, iObjectWrapper);
        zzbw.zza(b_, z10);
        b_.writeLong(j10);
        zzb(4, b_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdl
    public final void unregisterOnMeasurementEventListener(zzdw zzdwVar) {
        Parcel b_ = b_();
        zzbw.zza(b_, zzdwVar);
        zzb(36, b_);
    }
}
