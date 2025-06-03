// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import android.os.Parcelable$Creator;
import H2.a;
import java.util.Map;
import android.os.Bundle;
import android.os.Parcel;
import android.os.IInterface;
import android.os.IBinder;

public abstract class w0 extends b0 implements x0
{
    public w0() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }
    
    public static x0 asInterface(final IBinder binder) {
        if (binder == null) {
            return null;
        }
        final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        if (queryLocalInterface instanceof x0) {
            return (x0)queryLocalInterface;
        }
        return new z0(binder);
    }
    
    @Override
    public final boolean n(int n, final Parcel parcel, final Parcel parcel2, final int n2) {
        final y0 y0 = null;
        final y0 y2 = null;
        final E0 e0 = null;
        final E0 e2 = null;
        final E0 e3 = null;
        final y0 y3 = null;
        final y0 y4 = null;
        final y0 y5 = null;
        final y0 y6 = null;
        final y0 y7 = null;
        final y0 y8 = null;
        final F0 f0 = null;
        final y0 y9 = null;
        final y0 y10 = null;
        y0 y11 = null;
        final y0 y12 = null;
        final y0 y13 = null;
        final y0 y14 = null;
        switch (n) {
            default: {
                return false;
            }
            case 46: {
                final IBinder strongBinder = parcel.readStrongBinder();
                y0 y15;
                if (strongBinder == null) {
                    y15 = y14;
                }
                else {
                    final IInterface queryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface instanceof y0) {
                        y15 = (y0)queryLocalInterface;
                    }
                    else {
                        y15 = new A0(strongBinder);
                    }
                }
                a0.f(parcel);
                this.getSessionId(y15);
                break;
            }
            case 45: {
                final Bundle bundle = (Bundle)a0.a(parcel, Bundle.CREATOR);
                final long long1 = parcel.readLong();
                a0.f(parcel);
                this.setConsentThirdParty(bundle, long1);
                break;
            }
            case 44: {
                final Bundle bundle2 = (Bundle)a0.a(parcel, Bundle.CREATOR);
                final long long2 = parcel.readLong();
                a0.f(parcel);
                this.setConsent(bundle2, long2);
                break;
            }
            case 43: {
                final long long3 = parcel.readLong();
                a0.f(parcel);
                this.clearMeasurementEnabled(long3);
                break;
            }
            case 42: {
                final Bundle defaultEventParameters = (Bundle)a0.a(parcel, Bundle.CREATOR);
                a0.f(parcel);
                this.setDefaultEventParameters(defaultEventParameters);
                break;
            }
            case 40: {
                final IBinder strongBinder2 = parcel.readStrongBinder();
                y0 y16;
                if (strongBinder2 == null) {
                    y16 = y0;
                }
                else {
                    final IInterface queryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface2 instanceof y0) {
                        y16 = (y0)queryLocalInterface2;
                    }
                    else {
                        y16 = new A0(strongBinder2);
                    }
                }
                a0.f(parcel);
                this.isDataCollectionEnabled(y16);
                break;
            }
            case 39: {
                final boolean h = a0.h(parcel);
                a0.f(parcel);
                this.setDataCollectionEnabled(h);
                break;
            }
            case 38: {
                final IBinder strongBinder3 = parcel.readStrongBinder();
                y0 y17;
                if (strongBinder3 == null) {
                    y17 = y2;
                }
                else {
                    final IInterface queryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface3 instanceof y0) {
                        y17 = (y0)queryLocalInterface3;
                    }
                    else {
                        y17 = new A0(strongBinder3);
                    }
                }
                n = parcel.readInt();
                a0.f(parcel);
                this.getTestFlag(y17, n);
                break;
            }
            case 37: {
                final HashMap b = a0.b(parcel);
                a0.f(parcel);
                this.initForTests(b);
                break;
            }
            case 36: {
                final IBinder strongBinder4 = parcel.readStrongBinder();
                E0 e4;
                if (strongBinder4 == null) {
                    e4 = e0;
                }
                else {
                    final IInterface queryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    if (queryLocalInterface4 instanceof E0) {
                        e4 = (E0)queryLocalInterface4;
                    }
                    else {
                        e4 = new G0(strongBinder4);
                    }
                }
                a0.f(parcel);
                this.unregisterOnMeasurementEventListener(e4);
                break;
            }
            case 35: {
                final IBinder strongBinder5 = parcel.readStrongBinder();
                E0 e5;
                if (strongBinder5 == null) {
                    e5 = e2;
                }
                else {
                    final IInterface queryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    if (queryLocalInterface5 instanceof E0) {
                        e5 = (E0)queryLocalInterface5;
                    }
                    else {
                        e5 = new G0(strongBinder5);
                    }
                }
                a0.f(parcel);
                this.registerOnMeasurementEventListener(e5);
                break;
            }
            case 34: {
                final IBinder strongBinder6 = parcel.readStrongBinder();
                E0 eventInterceptor;
                if (strongBinder6 == null) {
                    eventInterceptor = e3;
                }
                else {
                    final IInterface queryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    if (queryLocalInterface6 instanceof E0) {
                        eventInterceptor = (E0)queryLocalInterface6;
                    }
                    else {
                        eventInterceptor = new G0(strongBinder6);
                    }
                }
                a0.f(parcel);
                this.setEventInterceptor(eventInterceptor);
                break;
            }
            case 33: {
                n = parcel.readInt();
                final String string = parcel.readString();
                final a o = a.a.o(parcel.readStrongBinder());
                final a o2 = a.a.o(parcel.readStrongBinder());
                final a o3 = a.a.o(parcel.readStrongBinder());
                a0.f(parcel);
                this.logHealthData(n, string, o, o2, o3);
                break;
            }
            case 32: {
                final Bundle bundle3 = (Bundle)a0.a(parcel, Bundle.CREATOR);
                final IBinder strongBinder7 = parcel.readStrongBinder();
                y0 y18;
                if (strongBinder7 == null) {
                    y18 = y3;
                }
                else {
                    final IInterface queryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface7 instanceof y0) {
                        y18 = (y0)queryLocalInterface7;
                    }
                    else {
                        y18 = new A0(strongBinder7);
                    }
                }
                final long long4 = parcel.readLong();
                a0.f(parcel);
                this.performAction(bundle3, y18, long4);
                break;
            }
            case 31: {
                final a o4 = a.a.o(parcel.readStrongBinder());
                final IBinder strongBinder8 = parcel.readStrongBinder();
                y0 y19;
                if (strongBinder8 == null) {
                    y19 = y4;
                }
                else {
                    final IInterface queryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface8 instanceof y0) {
                        y19 = (y0)queryLocalInterface8;
                    }
                    else {
                        y19 = new A0(strongBinder8);
                    }
                }
                final long long5 = parcel.readLong();
                a0.f(parcel);
                this.onActivitySaveInstanceState(o4, y19, long5);
                break;
            }
            case 30: {
                final a o5 = a.a.o(parcel.readStrongBinder());
                final long long6 = parcel.readLong();
                a0.f(parcel);
                this.onActivityResumed(o5, long6);
                break;
            }
            case 29: {
                final a o6 = a.a.o(parcel.readStrongBinder());
                final long long7 = parcel.readLong();
                a0.f(parcel);
                this.onActivityPaused(o6, long7);
                break;
            }
            case 28: {
                final a o7 = a.a.o(parcel.readStrongBinder());
                final long long8 = parcel.readLong();
                a0.f(parcel);
                this.onActivityDestroyed(o7, long8);
                break;
            }
            case 27: {
                final a o8 = a.a.o(parcel.readStrongBinder());
                final Bundle bundle4 = (Bundle)a0.a(parcel, Bundle.CREATOR);
                final long long9 = parcel.readLong();
                a0.f(parcel);
                this.onActivityCreated(o8, bundle4, long9);
                break;
            }
            case 26: {
                final a o9 = a.a.o(parcel.readStrongBinder());
                final long long10 = parcel.readLong();
                a0.f(parcel);
                this.onActivityStopped(o9, long10);
                break;
            }
            case 25: {
                final a o10 = a.a.o(parcel.readStrongBinder());
                final long long11 = parcel.readLong();
                a0.f(parcel);
                this.onActivityStarted(o10, long11);
                break;
            }
            case 24: {
                final String string2 = parcel.readString();
                final long long12 = parcel.readLong();
                a0.f(parcel);
                this.endAdUnitExposure(string2, long12);
                break;
            }
            case 23: {
                final String string3 = parcel.readString();
                final long long13 = parcel.readLong();
                a0.f(parcel);
                this.beginAdUnitExposure(string3, long13);
                break;
            }
            case 22: {
                final IBinder strongBinder9 = parcel.readStrongBinder();
                y0 y20;
                if (strongBinder9 == null) {
                    y20 = y5;
                }
                else {
                    final IInterface queryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface9 instanceof y0) {
                        y20 = (y0)queryLocalInterface9;
                    }
                    else {
                        y20 = new A0(strongBinder9);
                    }
                }
                a0.f(parcel);
                this.generateEventId(y20);
                break;
            }
            case 21: {
                final IBinder strongBinder10 = parcel.readStrongBinder();
                y0 y21;
                if (strongBinder10 == null) {
                    y21 = y6;
                }
                else {
                    final IInterface queryLocalInterface10 = strongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface10 instanceof y0) {
                        y21 = (y0)queryLocalInterface10;
                    }
                    else {
                        y21 = new A0(strongBinder10);
                    }
                }
                a0.f(parcel);
                this.getGmpAppId(y21);
                break;
            }
            case 20: {
                final IBinder strongBinder11 = parcel.readStrongBinder();
                y0 y22;
                if (strongBinder11 == null) {
                    y22 = y7;
                }
                else {
                    final IInterface queryLocalInterface11 = strongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface11 instanceof y0) {
                        y22 = (y0)queryLocalInterface11;
                    }
                    else {
                        y22 = new A0(strongBinder11);
                    }
                }
                a0.f(parcel);
                this.getAppInstanceId(y22);
                break;
            }
            case 19: {
                final IBinder strongBinder12 = parcel.readStrongBinder();
                y0 y23;
                if (strongBinder12 == null) {
                    y23 = y8;
                }
                else {
                    final IInterface queryLocalInterface12 = strongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface12 instanceof y0) {
                        y23 = (y0)queryLocalInterface12;
                    }
                    else {
                        y23 = new A0(strongBinder12);
                    }
                }
                a0.f(parcel);
                this.getCachedAppInstanceId(y23);
                break;
            }
            case 18: {
                final IBinder strongBinder13 = parcel.readStrongBinder();
                F0 instanceIdProvider;
                if (strongBinder13 == null) {
                    instanceIdProvider = f0;
                }
                else {
                    final IInterface queryLocalInterface13 = strongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    if (queryLocalInterface13 instanceof F0) {
                        instanceIdProvider = (F0)queryLocalInterface13;
                    }
                    else {
                        instanceIdProvider = new I0(strongBinder13);
                    }
                }
                a0.f(parcel);
                this.setInstanceIdProvider(instanceIdProvider);
                break;
            }
            case 17: {
                final IBinder strongBinder14 = parcel.readStrongBinder();
                y0 y24;
                if (strongBinder14 == null) {
                    y24 = y9;
                }
                else {
                    final IInterface queryLocalInterface14 = strongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface14 instanceof y0) {
                        y24 = (y0)queryLocalInterface14;
                    }
                    else {
                        y24 = new A0(strongBinder14);
                    }
                }
                a0.f(parcel);
                this.getCurrentScreenClass(y24);
                break;
            }
            case 16: {
                final IBinder strongBinder15 = parcel.readStrongBinder();
                y0 y25;
                if (strongBinder15 == null) {
                    y25 = y10;
                }
                else {
                    final IInterface queryLocalInterface15 = strongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface15 instanceof y0) {
                        y25 = (y0)queryLocalInterface15;
                    }
                    else {
                        y25 = new A0(strongBinder15);
                    }
                }
                a0.f(parcel);
                this.getCurrentScreenName(y25);
                break;
            }
            case 15: {
                final a o11 = a.a.o(parcel.readStrongBinder());
                final String string4 = parcel.readString();
                final String string5 = parcel.readString();
                final long long14 = parcel.readLong();
                a0.f(parcel);
                this.setCurrentScreen(o11, string4, string5, long14);
                break;
            }
            case 14: {
                final long long15 = parcel.readLong();
                a0.f(parcel);
                this.setSessionTimeoutDuration(long15);
                break;
            }
            case 13: {
                final long long16 = parcel.readLong();
                a0.f(parcel);
                this.setMinimumSessionDuration(long16);
                break;
            }
            case 12: {
                final long long17 = parcel.readLong();
                a0.f(parcel);
                this.resetAnalyticsData(long17);
                break;
            }
            case 11: {
                final boolean h2 = a0.h(parcel);
                final long long18 = parcel.readLong();
                a0.f(parcel);
                this.setMeasurementEnabled(h2, long18);
                break;
            }
            case 10: {
                final String string6 = parcel.readString();
                final String string7 = parcel.readString();
                final IBinder strongBinder16 = parcel.readStrongBinder();
                if (strongBinder16 != null) {
                    final IInterface queryLocalInterface16 = strongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface16 instanceof y0) {
                        y11 = (y0)queryLocalInterface16;
                    }
                    else {
                        y11 = new A0(strongBinder16);
                    }
                }
                a0.f(parcel);
                this.getConditionalUserProperties(string6, string7, y11);
                break;
            }
            case 9: {
                final String string8 = parcel.readString();
                final String string9 = parcel.readString();
                final Bundle bundle5 = (Bundle)a0.a(parcel, Bundle.CREATOR);
                a0.f(parcel);
                this.clearConditionalUserProperty(string8, string9, bundle5);
                break;
            }
            case 8: {
                final Bundle bundle6 = (Bundle)a0.a(parcel, Bundle.CREATOR);
                final long long19 = parcel.readLong();
                a0.f(parcel);
                this.setConditionalUserProperty(bundle6, long19);
                break;
            }
            case 7: {
                final String string10 = parcel.readString();
                final long long20 = parcel.readLong();
                a0.f(parcel);
                this.setUserId(string10, long20);
                break;
            }
            case 6: {
                final String string11 = parcel.readString();
                final IBinder strongBinder17 = parcel.readStrongBinder();
                y0 y26;
                if (strongBinder17 == null) {
                    y26 = y12;
                }
                else {
                    final IInterface queryLocalInterface17 = strongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface17 instanceof y0) {
                        y26 = (y0)queryLocalInterface17;
                    }
                    else {
                        y26 = new A0(strongBinder17);
                    }
                }
                a0.f(parcel);
                this.getMaxUserProperties(string11, y26);
                break;
            }
            case 5: {
                final String string12 = parcel.readString();
                final String string13 = parcel.readString();
                final boolean h3 = a0.h(parcel);
                final IBinder strongBinder18 = parcel.readStrongBinder();
                y0 y27;
                if (strongBinder18 == null) {
                    y27 = y13;
                }
                else {
                    final IInterface queryLocalInterface18 = strongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface18 instanceof y0) {
                        y27 = (y0)queryLocalInterface18;
                    }
                    else {
                        y27 = new A0(strongBinder18);
                    }
                }
                a0.f(parcel);
                this.getUserProperties(string12, string13, h3, y27);
                break;
            }
            case 4: {
                final String string14 = parcel.readString();
                final String string15 = parcel.readString();
                final a o12 = a.a.o(parcel.readStrongBinder());
                final boolean h4 = a0.h(parcel);
                final long long21 = parcel.readLong();
                a0.f(parcel);
                this.setUserProperty(string14, string15, o12, h4, long21);
                break;
            }
            case 3: {
                final String string16 = parcel.readString();
                final String string17 = parcel.readString();
                final Bundle bundle7 = (Bundle)a0.a(parcel, Bundle.CREATOR);
                final IBinder strongBinder19 = parcel.readStrongBinder();
                y0 y28;
                if (strongBinder19 == null) {
                    y28 = null;
                }
                else {
                    final IInterface queryLocalInterface19 = strongBinder19.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface19 instanceof y0) {
                        y28 = (y0)queryLocalInterface19;
                    }
                    else {
                        y28 = new A0(strongBinder19);
                    }
                }
                final long long22 = parcel.readLong();
                a0.f(parcel);
                this.logEventAndBundle(string16, string17, bundle7, y28, long22);
                break;
            }
            case 2: {
                final String string18 = parcel.readString();
                final String string19 = parcel.readString();
                final Bundle bundle8 = (Bundle)a0.a(parcel, Bundle.CREATOR);
                final boolean h5 = a0.h(parcel);
                final boolean h6 = a0.h(parcel);
                final long long23 = parcel.readLong();
                a0.f(parcel);
                this.logEvent(string18, string19, bundle8, h5, h6, long23);
                break;
            }
            case 1: {
                final a o13 = a.a.o(parcel.readStrongBinder());
                final H0 h7 = (H0)a0.a(parcel, H0.CREATOR);
                final long long24 = parcel.readLong();
                a0.f(parcel);
                this.initialize(o13, h7, long24);
                break;
            }
        }
        parcel2.writeNoException();
        return true;
    }
}
