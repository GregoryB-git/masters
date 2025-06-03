// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import H2.a;
import android.os.IInterface;
import android.os.Parcelable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.IBinder;

public final class z0 extends Y implements x0
{
    public z0(final IBinder binder) {
        super(binder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }
    
    @Override
    public final void beginAdUnitExposure(final String s, final long n) {
        final Parcel n2 = this.n();
        n2.writeString(s);
        n2.writeLong(n);
        this.v(23, n2);
    }
    
    @Override
    public final void clearConditionalUserProperty(final String s, final String s2, final Bundle bundle) {
        final Parcel n = this.n();
        n.writeString(s);
        n.writeString(s2);
        a0.d(n, (Parcelable)bundle);
        this.v(9, n);
    }
    
    @Override
    public final void clearMeasurementEnabled(final long n) {
        final Parcel n2 = this.n();
        n2.writeLong(n);
        this.v(43, n2);
    }
    
    @Override
    public final void endAdUnitExposure(final String s, final long n) {
        final Parcel n2 = this.n();
        n2.writeString(s);
        n2.writeLong(n);
        this.v(24, n2);
    }
    
    @Override
    public final void generateEventId(final y0 y0) {
        final Parcel n = this.n();
        a0.c(n, (IInterface)y0);
        this.v(22, n);
    }
    
    @Override
    public final void getAppInstanceId(final y0 y0) {
        final Parcel n = this.n();
        a0.c(n, (IInterface)y0);
        this.v(20, n);
    }
    
    @Override
    public final void getCachedAppInstanceId(final y0 y0) {
        final Parcel n = this.n();
        a0.c(n, (IInterface)y0);
        this.v(19, n);
    }
    
    @Override
    public final void getConditionalUserProperties(final String s, final String s2, final y0 y0) {
        final Parcel n = this.n();
        n.writeString(s);
        n.writeString(s2);
        a0.c(n, (IInterface)y0);
        this.v(10, n);
    }
    
    @Override
    public final void getCurrentScreenClass(final y0 y0) {
        final Parcel n = this.n();
        a0.c(n, (IInterface)y0);
        this.v(17, n);
    }
    
    @Override
    public final void getCurrentScreenName(final y0 y0) {
        final Parcel n = this.n();
        a0.c(n, (IInterface)y0);
        this.v(16, n);
    }
    
    @Override
    public final void getGmpAppId(final y0 y0) {
        final Parcel n = this.n();
        a0.c(n, (IInterface)y0);
        this.v(21, n);
    }
    
    @Override
    public final void getMaxUserProperties(final String s, final y0 y0) {
        final Parcel n = this.n();
        n.writeString(s);
        a0.c(n, (IInterface)y0);
        this.v(6, n);
    }
    
    @Override
    public final void getSessionId(final y0 y0) {
        final Parcel n = this.n();
        a0.c(n, (IInterface)y0);
        this.v(46, n);
    }
    
    @Override
    public final void getUserProperties(final String s, final String s2, final boolean b, final y0 y0) {
        final Parcel n = this.n();
        n.writeString(s);
        n.writeString(s2);
        a0.e(n, b);
        a0.c(n, (IInterface)y0);
        this.v(5, n);
    }
    
    @Override
    public final void initialize(final a a, final H0 h0, final long n) {
        final Parcel n2 = this.n();
        a0.c(n2, (IInterface)a);
        a0.d(n2, (Parcelable)h0);
        n2.writeLong(n);
        this.v(1, n2);
    }
    
    @Override
    public final void logEvent(final String s, final String s2, final Bundle bundle, final boolean b, final boolean b2, final long n) {
        final Parcel n2 = this.n();
        n2.writeString(s);
        n2.writeString(s2);
        a0.d(n2, (Parcelable)bundle);
        a0.e(n2, b);
        a0.e(n2, b2);
        n2.writeLong(n);
        this.v(2, n2);
    }
    
    @Override
    public final void logHealthData(final int n, final String s, final a a, final a a2, final a a3) {
        final Parcel n2 = this.n();
        n2.writeInt(n);
        n2.writeString(s);
        a0.c(n2, (IInterface)a);
        a0.c(n2, (IInterface)a2);
        a0.c(n2, (IInterface)a3);
        this.v(33, n2);
    }
    
    @Override
    public final void onActivityCreated(final a a, final Bundle bundle, final long n) {
        final Parcel n2 = this.n();
        a0.c(n2, (IInterface)a);
        a0.d(n2, (Parcelable)bundle);
        n2.writeLong(n);
        this.v(27, n2);
    }
    
    @Override
    public final void onActivityDestroyed(final a a, final long n) {
        final Parcel n2 = this.n();
        a0.c(n2, (IInterface)a);
        n2.writeLong(n);
        this.v(28, n2);
    }
    
    @Override
    public final void onActivityPaused(final a a, final long n) {
        final Parcel n2 = this.n();
        a0.c(n2, (IInterface)a);
        n2.writeLong(n);
        this.v(29, n2);
    }
    
    @Override
    public final void onActivityResumed(final a a, final long n) {
        final Parcel n2 = this.n();
        a0.c(n2, (IInterface)a);
        n2.writeLong(n);
        this.v(30, n2);
    }
    
    @Override
    public final void onActivitySaveInstanceState(final a a, final y0 y0, final long n) {
        final Parcel n2 = this.n();
        a0.c(n2, (IInterface)a);
        a0.c(n2, (IInterface)y0);
        n2.writeLong(n);
        this.v(31, n2);
    }
    
    @Override
    public final void onActivityStarted(final a a, final long n) {
        final Parcel n2 = this.n();
        a0.c(n2, (IInterface)a);
        n2.writeLong(n);
        this.v(25, n2);
    }
    
    @Override
    public final void onActivityStopped(final a a, final long n) {
        final Parcel n2 = this.n();
        a0.c(n2, (IInterface)a);
        n2.writeLong(n);
        this.v(26, n2);
    }
    
    @Override
    public final void registerOnMeasurementEventListener(final E0 e0) {
        final Parcel n = this.n();
        a0.c(n, (IInterface)e0);
        this.v(35, n);
    }
    
    @Override
    public final void resetAnalyticsData(final long n) {
        final Parcel n2 = this.n();
        n2.writeLong(n);
        this.v(12, n2);
    }
    
    @Override
    public final void setConditionalUserProperty(final Bundle bundle, final long n) {
        final Parcel n2 = this.n();
        a0.d(n2, (Parcelable)bundle);
        n2.writeLong(n);
        this.v(8, n2);
    }
    
    @Override
    public final void setConsentThirdParty(final Bundle bundle, final long n) {
        final Parcel n2 = this.n();
        a0.d(n2, (Parcelable)bundle);
        n2.writeLong(n);
        this.v(45, n2);
    }
    
    @Override
    public final void setCurrentScreen(final a a, final String s, final String s2, final long n) {
        final Parcel n2 = this.n();
        a0.c(n2, (IInterface)a);
        n2.writeString(s);
        n2.writeString(s2);
        n2.writeLong(n);
        this.v(15, n2);
    }
    
    @Override
    public final void setDataCollectionEnabled(final boolean b) {
        final Parcel n = this.n();
        a0.e(n, b);
        this.v(39, n);
    }
    
    @Override
    public final void setDefaultEventParameters(final Bundle bundle) {
        final Parcel n = this.n();
        a0.d(n, (Parcelable)bundle);
        this.v(42, n);
    }
    
    @Override
    public final void setMeasurementEnabled(final boolean b, final long n) {
        final Parcel n2 = this.n();
        a0.e(n2, b);
        n2.writeLong(n);
        this.v(11, n2);
    }
    
    @Override
    public final void setSessionTimeoutDuration(final long n) {
        final Parcel n2 = this.n();
        n2.writeLong(n);
        this.v(14, n2);
    }
    
    @Override
    public final void setUserId(final String s, final long n) {
        final Parcel n2 = this.n();
        n2.writeString(s);
        n2.writeLong(n);
        this.v(7, n2);
    }
    
    @Override
    public final void setUserProperty(final String s, final String s2, final a a, final boolean b, final long n) {
        final Parcel n2 = this.n();
        n2.writeString(s);
        n2.writeString(s2);
        a0.c(n2, (IInterface)a);
        a0.e(n2, b);
        n2.writeLong(n);
        this.v(4, n2);
    }
}
