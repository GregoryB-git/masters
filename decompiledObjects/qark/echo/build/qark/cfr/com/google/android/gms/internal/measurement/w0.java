/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Map
 */
package com.google.android.gms.internal.measurement;

import H2.a;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.measurement.A0;
import com.google.android.gms.internal.measurement.E0;
import com.google.android.gms.internal.measurement.F0;
import com.google.android.gms.internal.measurement.G0;
import com.google.android.gms.internal.measurement.H0;
import com.google.android.gms.internal.measurement.I0;
import com.google.android.gms.internal.measurement.a0;
import com.google.android.gms.internal.measurement.b0;
import com.google.android.gms.internal.measurement.x0;
import com.google.android.gms.internal.measurement.y0;
import com.google.android.gms.internal.measurement.z0;
import java.util.Map;

public abstract class w0
extends b0
implements x0 {
    public w0() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public static x0 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        if (iInterface instanceof x0) {
            return (x0)iInterface;
        }
        return new z0(iBinder);
    }

    @Override
    public final boolean n(int n8, Parcel parcel, Parcel parcel2, int n9) {
        Object var15_5 = null;
        Object var16_6 = null;
        Object var17_7 = null;
        Object var18_8 = null;
        Object var19_9 = null;
        Object object = null;
        Object object2 = null;
        Object var20_12 = null;
        Object var21_13 = null;
        Object var22_14 = null;
        Object var23_15 = null;
        Object var24_16 = null;
        Object var25_17 = null;
        Object var26_18 = null;
        Object object3 = null;
        IInterface iInterface = null;
        Object object4 = null;
        Object var14_22 = null;
        switch (n8) {
            default: {
                return false;
            }
            case 46: {
                object3 = parcel.readStrongBinder();
                object3 = object3 == null ? var14_22 : ((object4 = object3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver")) instanceof y0 ? (y0)object4 : new A0((IBinder)object3));
                a0.f(parcel);
                this.getSessionId((y0)object3);
                break;
            }
            case 45: {
                object3 = (Bundle)a0.a(parcel, Bundle.CREATOR);
                long l8 = parcel.readLong();
                a0.f(parcel);
                this.setConsentThirdParty((Bundle)object3, l8);
                break;
            }
            case 44: {
                object3 = (Bundle)a0.a(parcel, Bundle.CREATOR);
                long l9 = parcel.readLong();
                a0.f(parcel);
                this.setConsent((Bundle)object3, l9);
                break;
            }
            case 43: {
                long l10 = parcel.readLong();
                a0.f(parcel);
                this.clearMeasurementEnabled(l10);
                break;
            }
            case 42: {
                object3 = (Bundle)a0.a(parcel, Bundle.CREATOR);
                a0.f(parcel);
                this.setDefaultEventParameters((Bundle)object3);
                break;
            }
            case 40: {
                object3 = parcel.readStrongBinder();
                object3 = object3 == null ? var15_5 : ((object4 = object3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver")) instanceof y0 ? (y0)object4 : new A0((IBinder)object3));
                a0.f(parcel);
                this.isDataCollectionEnabled((y0)object3);
                break;
            }
            case 39: {
                boolean bl = a0.h(parcel);
                a0.f(parcel);
                this.setDataCollectionEnabled(bl);
                break;
            }
            case 38: {
                object3 = parcel.readStrongBinder();
                object3 = object3 == null ? var16_6 : ((object4 = object3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver")) instanceof y0 ? (y0)object4 : new A0((IBinder)object3));
                n8 = parcel.readInt();
                a0.f(parcel);
                this.getTestFlag((y0)object3, n8);
                break;
            }
            case 37: {
                object3 = a0.b(parcel);
                a0.f(parcel);
                this.initForTests((Map)object3);
                break;
            }
            case 36: {
                object3 = parcel.readStrongBinder();
                object3 = object3 == null ? var17_7 : ((object4 = object3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy")) instanceof E0 ? (E0)object4 : new G0((IBinder)object3));
                a0.f(parcel);
                this.unregisterOnMeasurementEventListener((E0)object3);
                break;
            }
            case 35: {
                object3 = parcel.readStrongBinder();
                object3 = object3 == null ? var18_8 : ((object4 = object3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy")) instanceof E0 ? (E0)object4 : new G0((IBinder)object3));
                a0.f(parcel);
                this.registerOnMeasurementEventListener((E0)object3);
                break;
            }
            case 34: {
                object3 = parcel.readStrongBinder();
                object3 = object3 == null ? var19_9 : ((object4 = object3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy")) instanceof E0 ? (E0)object4 : new G0((IBinder)object3));
                a0.f(parcel);
                this.setEventInterceptor((E0)object3);
                break;
            }
            case 33: {
                n8 = parcel.readInt();
                object3 = parcel.readString();
                object4 = a.a.o(parcel.readStrongBinder());
                object = a.a.o(parcel.readStrongBinder());
                object2 = a.a.o(parcel.readStrongBinder());
                a0.f(parcel);
                this.logHealthData(n8, (String)object3, (a)object4, (a)object, (a)object2);
                break;
            }
            case 32: {
                object4 = (Bundle)a0.a(parcel, Bundle.CREATOR);
                object3 = parcel.readStrongBinder();
                object3 = object3 == null ? object : ((object = object3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver")) instanceof y0 ? (Object)object : new A0((IBinder)object3));
                long l11 = parcel.readLong();
                a0.f(parcel);
                this.performAction((Bundle)object4, (y0)object3, l11);
                break;
            }
            case 31: {
                object4 = a.a.o(parcel.readStrongBinder());
                object3 = parcel.readStrongBinder();
                object3 = object3 == null ? object2 : ((object = object3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver")) instanceof y0 ? (Object)object : new A0((IBinder)object3));
                long l12 = parcel.readLong();
                a0.f(parcel);
                this.onActivitySaveInstanceState((a)object4, (y0)object3, l12);
                break;
            }
            case 30: {
                object3 = a.a.o(parcel.readStrongBinder());
                long l13 = parcel.readLong();
                a0.f(parcel);
                this.onActivityResumed((a)object3, l13);
                break;
            }
            case 29: {
                object3 = a.a.o(parcel.readStrongBinder());
                long l14 = parcel.readLong();
                a0.f(parcel);
                this.onActivityPaused((a)object3, l14);
                break;
            }
            case 28: {
                object3 = a.a.o(parcel.readStrongBinder());
                long l15 = parcel.readLong();
                a0.f(parcel);
                this.onActivityDestroyed((a)object3, l15);
                break;
            }
            case 27: {
                object3 = a.a.o(parcel.readStrongBinder());
                object4 = (Bundle)a0.a(parcel, Bundle.CREATOR);
                long l16 = parcel.readLong();
                a0.f(parcel);
                this.onActivityCreated((a)object3, (Bundle)object4, l16);
                break;
            }
            case 26: {
                object3 = a.a.o(parcel.readStrongBinder());
                long l17 = parcel.readLong();
                a0.f(parcel);
                this.onActivityStopped((a)object3, l17);
                break;
            }
            case 25: {
                object3 = a.a.o(parcel.readStrongBinder());
                long l18 = parcel.readLong();
                a0.f(parcel);
                this.onActivityStarted((a)object3, l18);
                break;
            }
            case 24: {
                object3 = parcel.readString();
                long l19 = parcel.readLong();
                a0.f(parcel);
                this.endAdUnitExposure((String)object3, l19);
                break;
            }
            case 23: {
                object3 = parcel.readString();
                long l20 = parcel.readLong();
                a0.f(parcel);
                this.beginAdUnitExposure((String)object3, l20);
                break;
            }
            case 22: {
                object3 = parcel.readStrongBinder();
                object3 = object3 == null ? var20_12 : ((object4 = object3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver")) instanceof y0 ? (y0)object4 : new A0((IBinder)object3));
                a0.f(parcel);
                this.generateEventId((y0)object3);
                break;
            }
            case 21: {
                object3 = parcel.readStrongBinder();
                object3 = object3 == null ? var21_13 : ((object4 = object3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver")) instanceof y0 ? (y0)object4 : new A0((IBinder)object3));
                a0.f(parcel);
                this.getGmpAppId((y0)object3);
                break;
            }
            case 20: {
                object3 = parcel.readStrongBinder();
                object3 = object3 == null ? var22_14 : ((object4 = object3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver")) instanceof y0 ? (y0)object4 : new A0((IBinder)object3));
                a0.f(parcel);
                this.getAppInstanceId((y0)object3);
                break;
            }
            case 19: {
                object3 = parcel.readStrongBinder();
                object3 = object3 == null ? var23_15 : ((object4 = object3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver")) instanceof y0 ? (y0)object4 : new A0((IBinder)object3));
                a0.f(parcel);
                this.getCachedAppInstanceId((y0)object3);
                break;
            }
            case 18: {
                object3 = parcel.readStrongBinder();
                object3 = object3 == null ? var24_16 : ((object4 = object3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider")) instanceof F0 ? (F0)object4 : new I0((IBinder)object3));
                a0.f(parcel);
                this.setInstanceIdProvider((F0)object3);
                break;
            }
            case 17: {
                object3 = parcel.readStrongBinder();
                object3 = object3 == null ? var25_17 : ((object4 = object3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver")) instanceof y0 ? (y0)object4 : new A0((IBinder)object3));
                a0.f(parcel);
                this.getCurrentScreenClass((y0)object3);
                break;
            }
            case 16: {
                object3 = parcel.readStrongBinder();
                object3 = object3 == null ? var26_18 : ((object4 = object3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver")) instanceof y0 ? (y0)object4 : new A0((IBinder)object3));
                a0.f(parcel);
                this.getCurrentScreenName((y0)object3);
                break;
            }
            case 15: {
                object3 = a.a.o(parcel.readStrongBinder());
                object4 = parcel.readString();
                object = parcel.readString();
                long l21 = parcel.readLong();
                a0.f(parcel);
                this.setCurrentScreen((a)object3, (String)object4, (String)object, l21);
                break;
            }
            case 14: {
                long l22 = parcel.readLong();
                a0.f(parcel);
                this.setSessionTimeoutDuration(l22);
                break;
            }
            case 13: {
                long l23 = parcel.readLong();
                a0.f(parcel);
                this.setMinimumSessionDuration(l23);
                break;
            }
            case 12: {
                long l24 = parcel.readLong();
                a0.f(parcel);
                this.resetAnalyticsData(l24);
                break;
            }
            case 11: {
                boolean bl = a0.h(parcel);
                long l25 = parcel.readLong();
                a0.f(parcel);
                this.setMeasurementEnabled(bl, l25);
                break;
            }
            case 10: {
                object4 = parcel.readString();
                object = parcel.readString();
                object2 = parcel.readStrongBinder();
                if (object2 != null) {
                    object3 = object2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    object3 = object3 instanceof y0 ? (y0)object3 : new A0((IBinder)object2);
                }
                a0.f(parcel);
                this.getConditionalUserProperties((String)object4, (String)object, (y0)object3);
                break;
            }
            case 9: {
                object3 = parcel.readString();
                object4 = parcel.readString();
                object = (Bundle)a0.a(parcel, Bundle.CREATOR);
                a0.f(parcel);
                this.clearConditionalUserProperty((String)object3, (String)object4, (Bundle)object);
                break;
            }
            case 8: {
                object3 = (Bundle)a0.a(parcel, Bundle.CREATOR);
                long l26 = parcel.readLong();
                a0.f(parcel);
                this.setConditionalUserProperty((Bundle)object3, l26);
                break;
            }
            case 7: {
                object3 = parcel.readString();
                long l27 = parcel.readLong();
                a0.f(parcel);
                this.setUserId((String)object3, l27);
                break;
            }
            case 6: {
                object4 = parcel.readString();
                object3 = parcel.readStrongBinder();
                object3 = object3 == null ? iInterface : ((object = object3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver")) instanceof y0 ? (y0)object : new A0((IBinder)object3));
                a0.f(parcel);
                this.getMaxUserProperties((String)object4, (y0)object3);
                break;
            }
            case 5: {
                object = parcel.readString();
                object2 = parcel.readString();
                boolean bl = a0.h(parcel);
                object3 = parcel.readStrongBinder();
                object3 = object3 == null ? object4 : ((object4 = object3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver")) instanceof y0 ? (Object)object4 : new A0((IBinder)object3));
                a0.f(parcel);
                this.getUserProperties((String)object, (String)object2, bl, (y0)object3);
                break;
            }
            case 4: {
                object3 = parcel.readString();
                object4 = parcel.readString();
                object = a.a.o(parcel.readStrongBinder());
                boolean bl = a0.h(parcel);
                long l28 = parcel.readLong();
                a0.f(parcel);
                this.setUserProperty((String)object3, (String)object4, (a)object, bl, l28);
                break;
            }
            case 3: {
                object4 = parcel.readString();
                object = parcel.readString();
                object2 = (Bundle)a0.a(parcel, Bundle.CREATOR);
                object3 = parcel.readStrongBinder();
                object3 = object3 == null ? null : ((iInterface = object3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver")) instanceof y0 ? (y0)iInterface : new A0((IBinder)object3));
                long l29 = parcel.readLong();
                a0.f(parcel);
                this.logEventAndBundle((String)object4, (String)object, (Bundle)object2, (y0)object3, l29);
                break;
            }
            case 2: {
                object3 = parcel.readString();
                object4 = parcel.readString();
                object = (Bundle)a0.a(parcel, Bundle.CREATOR);
                boolean bl = a0.h(parcel);
                boolean bl2 = a0.h(parcel);
                long l30 = parcel.readLong();
                a0.f(parcel);
                this.logEvent((String)object3, (String)object4, (Bundle)object, bl, bl2, l30);
                break;
            }
            case 1: {
                object3 = a.a.o(parcel.readStrongBinder());
                object4 = (H0)a0.a(parcel, H0.CREATOR);
                long l31 = parcel.readLong();
                a0.f(parcel);
                this.initialize((a)object3, (H0)object4, l31);
            }
        }
        parcel2.writeNoException();
        return true;
    }
}

