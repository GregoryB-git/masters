/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.Parcel
 *  android.os.Parcelable
 *  java.lang.String
 */
package com.google.android.gms.internal.measurement;

import H2.a;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.measurement.E0;
import com.google.android.gms.internal.measurement.H0;
import com.google.android.gms.internal.measurement.Y;
import com.google.android.gms.internal.measurement.a0;
import com.google.android.gms.internal.measurement.x0;
import com.google.android.gms.internal.measurement.y0;

public final class z0
extends Y
implements x0 {
    public z0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    @Override
    public final void beginAdUnitExposure(String string2, long l8) {
        Parcel parcel = this.n();
        parcel.writeString(string2);
        parcel.writeLong(l8);
        this.v(23, parcel);
    }

    @Override
    public final void clearConditionalUserProperty(String string2, String string3, Bundle bundle) {
        Parcel parcel = this.n();
        parcel.writeString(string2);
        parcel.writeString(string3);
        a0.d(parcel, (Parcelable)bundle);
        this.v(9, parcel);
    }

    @Override
    public final void clearMeasurementEnabled(long l8) {
        Parcel parcel = this.n();
        parcel.writeLong(l8);
        this.v(43, parcel);
    }

    @Override
    public final void endAdUnitExposure(String string2, long l8) {
        Parcel parcel = this.n();
        parcel.writeString(string2);
        parcel.writeLong(l8);
        this.v(24, parcel);
    }

    @Override
    public final void generateEventId(y0 y02) {
        Parcel parcel = this.n();
        a0.c(parcel, y02);
        this.v(22, parcel);
    }

    @Override
    public final void getAppInstanceId(y0 y02) {
        Parcel parcel = this.n();
        a0.c(parcel, y02);
        this.v(20, parcel);
    }

    @Override
    public final void getCachedAppInstanceId(y0 y02) {
        Parcel parcel = this.n();
        a0.c(parcel, y02);
        this.v(19, parcel);
    }

    @Override
    public final void getConditionalUserProperties(String string2, String string3, y0 y02) {
        Parcel parcel = this.n();
        parcel.writeString(string2);
        parcel.writeString(string3);
        a0.c(parcel, y02);
        this.v(10, parcel);
    }

    @Override
    public final void getCurrentScreenClass(y0 y02) {
        Parcel parcel = this.n();
        a0.c(parcel, y02);
        this.v(17, parcel);
    }

    @Override
    public final void getCurrentScreenName(y0 y02) {
        Parcel parcel = this.n();
        a0.c(parcel, y02);
        this.v(16, parcel);
    }

    @Override
    public final void getGmpAppId(y0 y02) {
        Parcel parcel = this.n();
        a0.c(parcel, y02);
        this.v(21, parcel);
    }

    @Override
    public final void getMaxUserProperties(String string2, y0 y02) {
        Parcel parcel = this.n();
        parcel.writeString(string2);
        a0.c(parcel, y02);
        this.v(6, parcel);
    }

    @Override
    public final void getSessionId(y0 y02) {
        Parcel parcel = this.n();
        a0.c(parcel, y02);
        this.v(46, parcel);
    }

    @Override
    public final void getUserProperties(String string2, String string3, boolean bl, y0 y02) {
        Parcel parcel = this.n();
        parcel.writeString(string2);
        parcel.writeString(string3);
        a0.e(parcel, bl);
        a0.c(parcel, y02);
        this.v(5, parcel);
    }

    @Override
    public final void initialize(a a8, H0 h02, long l8) {
        Parcel parcel = this.n();
        a0.c(parcel, a8);
        a0.d(parcel, h02);
        parcel.writeLong(l8);
        this.v(1, parcel);
    }

    @Override
    public final void logEvent(String string2, String string3, Bundle bundle, boolean bl, boolean bl2, long l8) {
        Parcel parcel = this.n();
        parcel.writeString(string2);
        parcel.writeString(string3);
        a0.d(parcel, (Parcelable)bundle);
        a0.e(parcel, bl);
        a0.e(parcel, bl2);
        parcel.writeLong(l8);
        this.v(2, parcel);
    }

    @Override
    public final void logHealthData(int n8, String string2, a a8, a a9, a a10) {
        Parcel parcel = this.n();
        parcel.writeInt(n8);
        parcel.writeString(string2);
        a0.c(parcel, a8);
        a0.c(parcel, a9);
        a0.c(parcel, a10);
        this.v(33, parcel);
    }

    @Override
    public final void onActivityCreated(a a8, Bundle bundle, long l8) {
        Parcel parcel = this.n();
        a0.c(parcel, a8);
        a0.d(parcel, (Parcelable)bundle);
        parcel.writeLong(l8);
        this.v(27, parcel);
    }

    @Override
    public final void onActivityDestroyed(a a8, long l8) {
        Parcel parcel = this.n();
        a0.c(parcel, a8);
        parcel.writeLong(l8);
        this.v(28, parcel);
    }

    @Override
    public final void onActivityPaused(a a8, long l8) {
        Parcel parcel = this.n();
        a0.c(parcel, a8);
        parcel.writeLong(l8);
        this.v(29, parcel);
    }

    @Override
    public final void onActivityResumed(a a8, long l8) {
        Parcel parcel = this.n();
        a0.c(parcel, a8);
        parcel.writeLong(l8);
        this.v(30, parcel);
    }

    @Override
    public final void onActivitySaveInstanceState(a a8, y0 y02, long l8) {
        Parcel parcel = this.n();
        a0.c(parcel, a8);
        a0.c(parcel, y02);
        parcel.writeLong(l8);
        this.v(31, parcel);
    }

    @Override
    public final void onActivityStarted(a a8, long l8) {
        Parcel parcel = this.n();
        a0.c(parcel, a8);
        parcel.writeLong(l8);
        this.v(25, parcel);
    }

    @Override
    public final void onActivityStopped(a a8, long l8) {
        Parcel parcel = this.n();
        a0.c(parcel, a8);
        parcel.writeLong(l8);
        this.v(26, parcel);
    }

    @Override
    public final void registerOnMeasurementEventListener(E0 e02) {
        Parcel parcel = this.n();
        a0.c(parcel, e02);
        this.v(35, parcel);
    }

    @Override
    public final void resetAnalyticsData(long l8) {
        Parcel parcel = this.n();
        parcel.writeLong(l8);
        this.v(12, parcel);
    }

    @Override
    public final void setConditionalUserProperty(Bundle bundle, long l8) {
        Parcel parcel = this.n();
        a0.d(parcel, (Parcelable)bundle);
        parcel.writeLong(l8);
        this.v(8, parcel);
    }

    @Override
    public final void setConsentThirdParty(Bundle bundle, long l8) {
        Parcel parcel = this.n();
        a0.d(parcel, (Parcelable)bundle);
        parcel.writeLong(l8);
        this.v(45, parcel);
    }

    @Override
    public final void setCurrentScreen(a a8, String string2, String string3, long l8) {
        Parcel parcel = this.n();
        a0.c(parcel, a8);
        parcel.writeString(string2);
        parcel.writeString(string3);
        parcel.writeLong(l8);
        this.v(15, parcel);
    }

    @Override
    public final void setDataCollectionEnabled(boolean bl) {
        Parcel parcel = this.n();
        a0.e(parcel, bl);
        this.v(39, parcel);
    }

    @Override
    public final void setDefaultEventParameters(Bundle bundle) {
        Parcel parcel = this.n();
        a0.d(parcel, (Parcelable)bundle);
        this.v(42, parcel);
    }

    @Override
    public final void setMeasurementEnabled(boolean bl, long l8) {
        Parcel parcel = this.n();
        a0.e(parcel, bl);
        parcel.writeLong(l8);
        this.v(11, parcel);
    }

    @Override
    public final void setSessionTimeoutDuration(long l8) {
        Parcel parcel = this.n();
        parcel.writeLong(l8);
        this.v(14, parcel);
    }

    @Override
    public final void setUserId(String string2, long l8) {
        Parcel parcel = this.n();
        parcel.writeString(string2);
        parcel.writeLong(l8);
        this.v(7, parcel);
    }

    @Override
    public final void setUserProperty(String string2, String string3, a a8, boolean bl, long l8) {
        Parcel parcel = this.n();
        parcel.writeString(string2);
        parcel.writeString(string3);
        a0.c(parcel, a8);
        a0.e(parcel, bl);
        parcel.writeLong(l8);
        this.v(4, parcel);
    }
}

