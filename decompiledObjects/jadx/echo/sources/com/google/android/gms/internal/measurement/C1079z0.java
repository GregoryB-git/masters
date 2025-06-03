package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.measurement.z0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1079z0 extends Y implements InterfaceC1062x0 {
    public C1079z0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1062x0
    public final void beginAdUnitExposure(String str, long j7) {
        Parcel n7 = n();
        n7.writeString(str);
        n7.writeLong(j7);
        v(23, n7);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1062x0
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel n7 = n();
        n7.writeString(str);
        n7.writeString(str2);
        AbstractC0856a0.d(n7, bundle);
        v(9, n7);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1062x0
    public final void clearMeasurementEnabled(long j7) {
        Parcel n7 = n();
        n7.writeLong(j7);
        v(43, n7);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1062x0
    public final void endAdUnitExposure(String str, long j7) {
        Parcel n7 = n();
        n7.writeString(str);
        n7.writeLong(j7);
        v(24, n7);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1062x0
    public final void generateEventId(InterfaceC1071y0 interfaceC1071y0) {
        Parcel n7 = n();
        AbstractC0856a0.c(n7, interfaceC1071y0);
        v(22, n7);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1062x0
    public final void getAppInstanceId(InterfaceC1071y0 interfaceC1071y0) {
        Parcel n7 = n();
        AbstractC0856a0.c(n7, interfaceC1071y0);
        v(20, n7);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1062x0
    public final void getCachedAppInstanceId(InterfaceC1071y0 interfaceC1071y0) {
        Parcel n7 = n();
        AbstractC0856a0.c(n7, interfaceC1071y0);
        v(19, n7);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1062x0
    public final void getConditionalUserProperties(String str, String str2, InterfaceC1071y0 interfaceC1071y0) {
        Parcel n7 = n();
        n7.writeString(str);
        n7.writeString(str2);
        AbstractC0856a0.c(n7, interfaceC1071y0);
        v(10, n7);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1062x0
    public final void getCurrentScreenClass(InterfaceC1071y0 interfaceC1071y0) {
        Parcel n7 = n();
        AbstractC0856a0.c(n7, interfaceC1071y0);
        v(17, n7);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1062x0
    public final void getCurrentScreenName(InterfaceC1071y0 interfaceC1071y0) {
        Parcel n7 = n();
        AbstractC0856a0.c(n7, interfaceC1071y0);
        v(16, n7);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1062x0
    public final void getGmpAppId(InterfaceC1071y0 interfaceC1071y0) {
        Parcel n7 = n();
        AbstractC0856a0.c(n7, interfaceC1071y0);
        v(21, n7);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1062x0
    public final void getMaxUserProperties(String str, InterfaceC1071y0 interfaceC1071y0) {
        Parcel n7 = n();
        n7.writeString(str);
        AbstractC0856a0.c(n7, interfaceC1071y0);
        v(6, n7);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1062x0
    public final void getSessionId(InterfaceC1071y0 interfaceC1071y0) {
        Parcel n7 = n();
        AbstractC0856a0.c(n7, interfaceC1071y0);
        v(46, n7);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1062x0
    public final void getUserProperties(String str, String str2, boolean z7, InterfaceC1071y0 interfaceC1071y0) {
        Parcel n7 = n();
        n7.writeString(str);
        n7.writeString(str2);
        AbstractC0856a0.e(n7, z7);
        AbstractC0856a0.c(n7, interfaceC1071y0);
        v(5, n7);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1062x0
    public final void initialize(H2.a aVar, H0 h02, long j7) {
        Parcel n7 = n();
        AbstractC0856a0.c(n7, aVar);
        AbstractC0856a0.d(n7, h02);
        n7.writeLong(j7);
        v(1, n7);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1062x0
    public final void logEvent(String str, String str2, Bundle bundle, boolean z7, boolean z8, long j7) {
        Parcel n7 = n();
        n7.writeString(str);
        n7.writeString(str2);
        AbstractC0856a0.d(n7, bundle);
        AbstractC0856a0.e(n7, z7);
        AbstractC0856a0.e(n7, z8);
        n7.writeLong(j7);
        v(2, n7);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1062x0
    public final void logHealthData(int i7, String str, H2.a aVar, H2.a aVar2, H2.a aVar3) {
        Parcel n7 = n();
        n7.writeInt(i7);
        n7.writeString(str);
        AbstractC0856a0.c(n7, aVar);
        AbstractC0856a0.c(n7, aVar2);
        AbstractC0856a0.c(n7, aVar3);
        v(33, n7);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1062x0
    public final void onActivityCreated(H2.a aVar, Bundle bundle, long j7) {
        Parcel n7 = n();
        AbstractC0856a0.c(n7, aVar);
        AbstractC0856a0.d(n7, bundle);
        n7.writeLong(j7);
        v(27, n7);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1062x0
    public final void onActivityDestroyed(H2.a aVar, long j7) {
        Parcel n7 = n();
        AbstractC0856a0.c(n7, aVar);
        n7.writeLong(j7);
        v(28, n7);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1062x0
    public final void onActivityPaused(H2.a aVar, long j7) {
        Parcel n7 = n();
        AbstractC0856a0.c(n7, aVar);
        n7.writeLong(j7);
        v(29, n7);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1062x0
    public final void onActivityResumed(H2.a aVar, long j7) {
        Parcel n7 = n();
        AbstractC0856a0.c(n7, aVar);
        n7.writeLong(j7);
        v(30, n7);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1062x0
    public final void onActivitySaveInstanceState(H2.a aVar, InterfaceC1071y0 interfaceC1071y0, long j7) {
        Parcel n7 = n();
        AbstractC0856a0.c(n7, aVar);
        AbstractC0856a0.c(n7, interfaceC1071y0);
        n7.writeLong(j7);
        v(31, n7);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1062x0
    public final void onActivityStarted(H2.a aVar, long j7) {
        Parcel n7 = n();
        AbstractC0856a0.c(n7, aVar);
        n7.writeLong(j7);
        v(25, n7);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1062x0
    public final void onActivityStopped(H2.a aVar, long j7) {
        Parcel n7 = n();
        AbstractC0856a0.c(n7, aVar);
        n7.writeLong(j7);
        v(26, n7);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1062x0
    public final void registerOnMeasurementEventListener(E0 e02) {
        Parcel n7 = n();
        AbstractC0856a0.c(n7, e02);
        v(35, n7);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1062x0
    public final void resetAnalyticsData(long j7) {
        Parcel n7 = n();
        n7.writeLong(j7);
        v(12, n7);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1062x0
    public final void setConditionalUserProperty(Bundle bundle, long j7) {
        Parcel n7 = n();
        AbstractC0856a0.d(n7, bundle);
        n7.writeLong(j7);
        v(8, n7);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1062x0
    public final void setConsentThirdParty(Bundle bundle, long j7) {
        Parcel n7 = n();
        AbstractC0856a0.d(n7, bundle);
        n7.writeLong(j7);
        v(45, n7);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1062x0
    public final void setCurrentScreen(H2.a aVar, String str, String str2, long j7) {
        Parcel n7 = n();
        AbstractC0856a0.c(n7, aVar);
        n7.writeString(str);
        n7.writeString(str2);
        n7.writeLong(j7);
        v(15, n7);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1062x0
    public final void setDataCollectionEnabled(boolean z7) {
        Parcel n7 = n();
        AbstractC0856a0.e(n7, z7);
        v(39, n7);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1062x0
    public final void setDefaultEventParameters(Bundle bundle) {
        Parcel n7 = n();
        AbstractC0856a0.d(n7, bundle);
        v(42, n7);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1062x0
    public final void setMeasurementEnabled(boolean z7, long j7) {
        Parcel n7 = n();
        AbstractC0856a0.e(n7, z7);
        n7.writeLong(j7);
        v(11, n7);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1062x0
    public final void setSessionTimeoutDuration(long j7) {
        Parcel n7 = n();
        n7.writeLong(j7);
        v(14, n7);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1062x0
    public final void setUserId(String str, long j7) {
        Parcel n7 = n();
        n7.writeString(str);
        n7.writeLong(j7);
        v(7, n7);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1062x0
    public final void setUserProperty(String str, String str2, H2.a aVar, boolean z7, long j7) {
        Parcel n7 = n();
        n7.writeString(str);
        n7.writeString(str2);
        AbstractC0856a0.c(n7, aVar);
        AbstractC0856a0.e(n7, z7);
        n7.writeLong(j7);
        v(4, n7);
    }
}
