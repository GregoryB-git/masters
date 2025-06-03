package com.google.android.gms.internal.measurement;

import H2.a;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.appsflyer.attribution.RequestError;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.measurement.w0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC1053w0 extends AbstractBinderC0865b0 implements InterfaceC1062x0 {
    public AbstractBinderC1053w0() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public static InterfaceC1062x0 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        return queryLocalInterface instanceof InterfaceC1062x0 ? (InterfaceC1062x0) queryLocalInterface : new C1079z0(iBinder);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractBinderC0865b0
    public final boolean n(int i7, Parcel parcel, Parcel parcel2, int i8) {
        InterfaceC1071y0 a02;
        InterfaceC1071y0 interfaceC1071y0 = null;
        InterfaceC1071y0 interfaceC1071y02 = null;
        InterfaceC1071y0 interfaceC1071y03 = null;
        InterfaceC1071y0 interfaceC1071y04 = null;
        E0 e02 = null;
        E0 e03 = null;
        E0 e04 = null;
        InterfaceC1071y0 interfaceC1071y05 = null;
        InterfaceC1071y0 interfaceC1071y06 = null;
        InterfaceC1071y0 interfaceC1071y07 = null;
        InterfaceC1071y0 interfaceC1071y08 = null;
        InterfaceC1071y0 interfaceC1071y09 = null;
        InterfaceC1071y0 interfaceC1071y010 = null;
        F0 f02 = null;
        InterfaceC1071y0 interfaceC1071y011 = null;
        InterfaceC1071y0 interfaceC1071y012 = null;
        InterfaceC1071y0 interfaceC1071y013 = null;
        InterfaceC1071y0 interfaceC1071y014 = null;
        switch (i7) {
            case 1:
                H2.a o7 = a.AbstractBinderC0037a.o(parcel.readStrongBinder());
                H0 h02 = (H0) AbstractC0856a0.a(parcel, H0.CREATOR);
                long readLong = parcel.readLong();
                AbstractC0856a0.f(parcel);
                initialize(o7, h02, readLong);
                break;
            case 2:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                Bundle bundle = (Bundle) AbstractC0856a0.a(parcel, Bundle.CREATOR);
                boolean h7 = AbstractC0856a0.h(parcel);
                boolean h8 = AbstractC0856a0.h(parcel);
                long readLong2 = parcel.readLong();
                AbstractC0856a0.f(parcel);
                logEvent(readString, readString2, bundle, h7, h8, readLong2);
                break;
            case 3:
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                Bundle bundle2 = (Bundle) AbstractC0856a0.a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    a02 = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    a02 = queryLocalInterface instanceof InterfaceC1071y0 ? (InterfaceC1071y0) queryLocalInterface : new A0(readStrongBinder);
                }
                long readLong3 = parcel.readLong();
                AbstractC0856a0.f(parcel);
                logEventAndBundle(readString3, readString4, bundle2, a02, readLong3);
                break;
            case 4:
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                H2.a o8 = a.AbstractBinderC0037a.o(parcel.readStrongBinder());
                boolean h9 = AbstractC0856a0.h(parcel);
                long readLong4 = parcel.readLong();
                AbstractC0856a0.f(parcel);
                setUserProperty(readString5, readString6, o8, h9, readLong4);
                break;
            case 5:
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                boolean h10 = AbstractC0856a0.h(parcel);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    interfaceC1071y0 = queryLocalInterface2 instanceof InterfaceC1071y0 ? (InterfaceC1071y0) queryLocalInterface2 : new A0(readStrongBinder2);
                }
                AbstractC0856a0.f(parcel);
                getUserProperties(readString7, readString8, h10, interfaceC1071y0);
                break;
            case 6:
                String readString9 = parcel.readString();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    interfaceC1071y014 = queryLocalInterface3 instanceof InterfaceC1071y0 ? (InterfaceC1071y0) queryLocalInterface3 : new A0(readStrongBinder3);
                }
                AbstractC0856a0.f(parcel);
                getMaxUserProperties(readString9, interfaceC1071y014);
                break;
            case 7:
                String readString10 = parcel.readString();
                long readLong5 = parcel.readLong();
                AbstractC0856a0.f(parcel);
                setUserId(readString10, readLong5);
                break;
            case 8:
                Bundle bundle3 = (Bundle) AbstractC0856a0.a(parcel, Bundle.CREATOR);
                long readLong6 = parcel.readLong();
                AbstractC0856a0.f(parcel);
                setConditionalUserProperty(bundle3, readLong6);
                break;
            case 9:
                String readString11 = parcel.readString();
                String readString12 = parcel.readString();
                Bundle bundle4 = (Bundle) AbstractC0856a0.a(parcel, Bundle.CREATOR);
                AbstractC0856a0.f(parcel);
                clearConditionalUserProperty(readString11, readString12, bundle4);
                break;
            case 10:
                String readString13 = parcel.readString();
                String readString14 = parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    interfaceC1071y013 = queryLocalInterface4 instanceof InterfaceC1071y0 ? (InterfaceC1071y0) queryLocalInterface4 : new A0(readStrongBinder4);
                }
                AbstractC0856a0.f(parcel);
                getConditionalUserProperties(readString13, readString14, interfaceC1071y013);
                break;
            case 11:
                boolean h11 = AbstractC0856a0.h(parcel);
                long readLong7 = parcel.readLong();
                AbstractC0856a0.f(parcel);
                setMeasurementEnabled(h11, readLong7);
                break;
            case N4.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                long readLong8 = parcel.readLong();
                AbstractC0856a0.f(parcel);
                resetAnalyticsData(readLong8);
                break;
            case N4.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                long readLong9 = parcel.readLong();
                AbstractC0856a0.f(parcel);
                setMinimumSessionDuration(readLong9);
                break;
            case 14:
                long readLong10 = parcel.readLong();
                AbstractC0856a0.f(parcel);
                setSessionTimeoutDuration(readLong10);
                break;
            case 15:
                H2.a o9 = a.AbstractBinderC0037a.o(parcel.readStrongBinder());
                String readString15 = parcel.readString();
                String readString16 = parcel.readString();
                long readLong11 = parcel.readLong();
                AbstractC0856a0.f(parcel);
                setCurrentScreen(o9, readString15, readString16, readLong11);
                break;
            case 16:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    interfaceC1071y012 = queryLocalInterface5 instanceof InterfaceC1071y0 ? (InterfaceC1071y0) queryLocalInterface5 : new A0(readStrongBinder5);
                }
                AbstractC0856a0.f(parcel);
                getCurrentScreenName(interfaceC1071y012);
                break;
            case 17:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    interfaceC1071y011 = queryLocalInterface6 instanceof InterfaceC1071y0 ? (InterfaceC1071y0) queryLocalInterface6 : new A0(readStrongBinder6);
                }
                AbstractC0856a0.f(parcel);
                getCurrentScreenClass(interfaceC1071y011);
                break;
            case 18:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    f02 = queryLocalInterface7 instanceof F0 ? (F0) queryLocalInterface7 : new I0(readStrongBinder7);
                }
                AbstractC0856a0.f(parcel);
                setInstanceIdProvider(f02);
                break;
            case 19:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    interfaceC1071y010 = queryLocalInterface8 instanceof InterfaceC1071y0 ? (InterfaceC1071y0) queryLocalInterface8 : new A0(readStrongBinder8);
                }
                AbstractC0856a0.f(parcel);
                getCachedAppInstanceId(interfaceC1071y010);
                break;
            case 20:
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    interfaceC1071y09 = queryLocalInterface9 instanceof InterfaceC1071y0 ? (InterfaceC1071y0) queryLocalInterface9 : new A0(readStrongBinder9);
                }
                AbstractC0856a0.f(parcel);
                getAppInstanceId(interfaceC1071y09);
                break;
            case 21:
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 != null) {
                    IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    interfaceC1071y08 = queryLocalInterface10 instanceof InterfaceC1071y0 ? (InterfaceC1071y0) queryLocalInterface10 : new A0(readStrongBinder10);
                }
                AbstractC0856a0.f(parcel);
                getGmpAppId(interfaceC1071y08);
                break;
            case 22:
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 != null) {
                    IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    interfaceC1071y07 = queryLocalInterface11 instanceof InterfaceC1071y0 ? (InterfaceC1071y0) queryLocalInterface11 : new A0(readStrongBinder11);
                }
                AbstractC0856a0.f(parcel);
                generateEventId(interfaceC1071y07);
                break;
            case 23:
                String readString17 = parcel.readString();
                long readLong12 = parcel.readLong();
                AbstractC0856a0.f(parcel);
                beginAdUnitExposure(readString17, readLong12);
                break;
            case 24:
                String readString18 = parcel.readString();
                long readLong13 = parcel.readLong();
                AbstractC0856a0.f(parcel);
                endAdUnitExposure(readString18, readLong13);
                break;
            case 25:
                H2.a o10 = a.AbstractBinderC0037a.o(parcel.readStrongBinder());
                long readLong14 = parcel.readLong();
                AbstractC0856a0.f(parcel);
                onActivityStarted(o10, readLong14);
                break;
            case 26:
                H2.a o11 = a.AbstractBinderC0037a.o(parcel.readStrongBinder());
                long readLong15 = parcel.readLong();
                AbstractC0856a0.f(parcel);
                onActivityStopped(o11, readLong15);
                break;
            case 27:
                H2.a o12 = a.AbstractBinderC0037a.o(parcel.readStrongBinder());
                Bundle bundle5 = (Bundle) AbstractC0856a0.a(parcel, Bundle.CREATOR);
                long readLong16 = parcel.readLong();
                AbstractC0856a0.f(parcel);
                onActivityCreated(o12, bundle5, readLong16);
                break;
            case 28:
                H2.a o13 = a.AbstractBinderC0037a.o(parcel.readStrongBinder());
                long readLong17 = parcel.readLong();
                AbstractC0856a0.f(parcel);
                onActivityDestroyed(o13, readLong17);
                break;
            case 29:
                H2.a o14 = a.AbstractBinderC0037a.o(parcel.readStrongBinder());
                long readLong18 = parcel.readLong();
                AbstractC0856a0.f(parcel);
                onActivityPaused(o14, readLong18);
                break;
            case 30:
                H2.a o15 = a.AbstractBinderC0037a.o(parcel.readStrongBinder());
                long readLong19 = parcel.readLong();
                AbstractC0856a0.f(parcel);
                onActivityResumed(o15, readLong19);
                break;
            case 31:
                H2.a o16 = a.AbstractBinderC0037a.o(parcel.readStrongBinder());
                IBinder readStrongBinder12 = parcel.readStrongBinder();
                if (readStrongBinder12 != null) {
                    IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    interfaceC1071y06 = queryLocalInterface12 instanceof InterfaceC1071y0 ? (InterfaceC1071y0) queryLocalInterface12 : new A0(readStrongBinder12);
                }
                long readLong20 = parcel.readLong();
                AbstractC0856a0.f(parcel);
                onActivitySaveInstanceState(o16, interfaceC1071y06, readLong20);
                break;
            case 32:
                Bundle bundle6 = (Bundle) AbstractC0856a0.a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder13 = parcel.readStrongBinder();
                if (readStrongBinder13 != null) {
                    IInterface queryLocalInterface13 = readStrongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    interfaceC1071y05 = queryLocalInterface13 instanceof InterfaceC1071y0 ? (InterfaceC1071y0) queryLocalInterface13 : new A0(readStrongBinder13);
                }
                long readLong21 = parcel.readLong();
                AbstractC0856a0.f(parcel);
                performAction(bundle6, interfaceC1071y05, readLong21);
                break;
            case 33:
                int readInt = parcel.readInt();
                String readString19 = parcel.readString();
                H2.a o17 = a.AbstractBinderC0037a.o(parcel.readStrongBinder());
                H2.a o18 = a.AbstractBinderC0037a.o(parcel.readStrongBinder());
                H2.a o19 = a.AbstractBinderC0037a.o(parcel.readStrongBinder());
                AbstractC0856a0.f(parcel);
                logHealthData(readInt, readString19, o17, o18, o19);
                break;
            case 34:
                IBinder readStrongBinder14 = parcel.readStrongBinder();
                if (readStrongBinder14 != null) {
                    IInterface queryLocalInterface14 = readStrongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    e04 = queryLocalInterface14 instanceof E0 ? (E0) queryLocalInterface14 : new G0(readStrongBinder14);
                }
                AbstractC0856a0.f(parcel);
                setEventInterceptor(e04);
                break;
            case 35:
                IBinder readStrongBinder15 = parcel.readStrongBinder();
                if (readStrongBinder15 != null) {
                    IInterface queryLocalInterface15 = readStrongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    e03 = queryLocalInterface15 instanceof E0 ? (E0) queryLocalInterface15 : new G0(readStrongBinder15);
                }
                AbstractC0856a0.f(parcel);
                registerOnMeasurementEventListener(e03);
                break;
            case 36:
                IBinder readStrongBinder16 = parcel.readStrongBinder();
                if (readStrongBinder16 != null) {
                    IInterface queryLocalInterface16 = readStrongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    e02 = queryLocalInterface16 instanceof E0 ? (E0) queryLocalInterface16 : new G0(readStrongBinder16);
                }
                AbstractC0856a0.f(parcel);
                unregisterOnMeasurementEventListener(e02);
                break;
            case 37:
                HashMap b7 = AbstractC0856a0.b(parcel);
                AbstractC0856a0.f(parcel);
                initForTests(b7);
                break;
            case 38:
                IBinder readStrongBinder17 = parcel.readStrongBinder();
                if (readStrongBinder17 != null) {
                    IInterface queryLocalInterface17 = readStrongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    interfaceC1071y04 = queryLocalInterface17 instanceof InterfaceC1071y0 ? (InterfaceC1071y0) queryLocalInterface17 : new A0(readStrongBinder17);
                }
                int readInt2 = parcel.readInt();
                AbstractC0856a0.f(parcel);
                getTestFlag(interfaceC1071y04, readInt2);
                break;
            case 39:
                boolean h12 = AbstractC0856a0.h(parcel);
                AbstractC0856a0.f(parcel);
                setDataCollectionEnabled(h12);
                break;
            case RequestError.NETWORK_FAILURE /* 40 */:
                IBinder readStrongBinder18 = parcel.readStrongBinder();
                if (readStrongBinder18 != null) {
                    IInterface queryLocalInterface18 = readStrongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    interfaceC1071y03 = queryLocalInterface18 instanceof InterfaceC1071y0 ? (InterfaceC1071y0) queryLocalInterface18 : new A0(readStrongBinder18);
                }
                AbstractC0856a0.f(parcel);
                isDataCollectionEnabled(interfaceC1071y03);
                break;
            case RequestError.NO_DEV_KEY /* 41 */:
            default:
                return false;
            case 42:
                Bundle bundle7 = (Bundle) AbstractC0856a0.a(parcel, Bundle.CREATOR);
                AbstractC0856a0.f(parcel);
                setDefaultEventParameters(bundle7);
                break;
            case 43:
                long readLong22 = parcel.readLong();
                AbstractC0856a0.f(parcel);
                clearMeasurementEnabled(readLong22);
                break;
            case 44:
                Bundle bundle8 = (Bundle) AbstractC0856a0.a(parcel, Bundle.CREATOR);
                long readLong23 = parcel.readLong();
                AbstractC0856a0.f(parcel);
                setConsent(bundle8, readLong23);
                break;
            case 45:
                Bundle bundle9 = (Bundle) AbstractC0856a0.a(parcel, Bundle.CREATOR);
                long readLong24 = parcel.readLong();
                AbstractC0856a0.f(parcel);
                setConsentThirdParty(bundle9, readLong24);
                break;
            case 46:
                IBinder readStrongBinder19 = parcel.readStrongBinder();
                if (readStrongBinder19 != null) {
                    IInterface queryLocalInterface19 = readStrongBinder19.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    interfaceC1071y02 = queryLocalInterface19 instanceof InterfaceC1071y0 ? (InterfaceC1071y0) queryLocalInterface19 : new A0(readStrongBinder19);
                }
                AbstractC0856a0.f(parcel);
                getSessionId(interfaceC1071y02);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
