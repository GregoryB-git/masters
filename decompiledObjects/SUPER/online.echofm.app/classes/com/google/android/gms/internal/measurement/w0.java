package com.google.android.gms.internal.measurement;

import H2.a;
import H2.a.a;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.Map;

public abstract class w0
  extends b0
  implements x0
{
  public w0()
  {
    super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
  }
  
  public static x0 asInterface(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    if ((localIInterface instanceof x0)) {
      return (x0)localIInterface;
    }
    return new z0(paramIBinder);
  }
  
  public final boolean n(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    Object localObject3 = null;
    Object localObject4 = null;
    Object localObject5 = null;
    Object localObject6 = null;
    Object localObject7 = null;
    Object localObject8 = null;
    Object localObject9 = null;
    Object localObject10 = null;
    Object localObject11 = null;
    Object localObject12 = null;
    Object localObject13 = null;
    Object localObject14 = null;
    Object localObject15 = null;
    IInterface localIInterface = null;
    Object localObject16 = null;
    Object localObject17 = null;
    long l;
    boolean bool1;
    switch (paramInt1)
    {
    case 41: 
    default: 
      return false;
    case 46: 
      localObject15 = paramParcel1.readStrongBinder();
      if (localObject15 == null)
      {
        localObject15 = localObject17;
      }
      else
      {
        localObject16 = ((IBinder)localObject15).queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
        if ((localObject16 instanceof y0)) {
          localObject15 = (y0)localObject16;
        } else {
          localObject15 = new A0((IBinder)localObject15);
        }
      }
      a0.f(paramParcel1);
      getSessionId((y0)localObject15);
      break;
    case 45: 
      localObject15 = (Bundle)a0.a(paramParcel1, Bundle.CREATOR);
      l = paramParcel1.readLong();
      a0.f(paramParcel1);
      setConsentThirdParty((Bundle)localObject15, l);
      break;
    case 44: 
      localObject15 = (Bundle)a0.a(paramParcel1, Bundle.CREATOR);
      l = paramParcel1.readLong();
      a0.f(paramParcel1);
      setConsent((Bundle)localObject15, l);
      break;
    case 43: 
      l = paramParcel1.readLong();
      a0.f(paramParcel1);
      clearMeasurementEnabled(l);
      break;
    case 42: 
      localObject15 = (Bundle)a0.a(paramParcel1, Bundle.CREATOR);
      a0.f(paramParcel1);
      setDefaultEventParameters((Bundle)localObject15);
      break;
    case 40: 
      localObject15 = paramParcel1.readStrongBinder();
      if (localObject15 == null)
      {
        localObject15 = localObject1;
      }
      else
      {
        localObject16 = ((IBinder)localObject15).queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
        if ((localObject16 instanceof y0)) {
          localObject15 = (y0)localObject16;
        } else {
          localObject15 = new A0((IBinder)localObject15);
        }
      }
      a0.f(paramParcel1);
      isDataCollectionEnabled((y0)localObject15);
      break;
    case 39: 
      bool1 = a0.h(paramParcel1);
      a0.f(paramParcel1);
      setDataCollectionEnabled(bool1);
      break;
    case 38: 
      localObject15 = paramParcel1.readStrongBinder();
      if (localObject15 == null)
      {
        localObject15 = localObject2;
      }
      else
      {
        localObject16 = ((IBinder)localObject15).queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
        if ((localObject16 instanceof y0)) {
          localObject15 = (y0)localObject16;
        } else {
          localObject15 = new A0((IBinder)localObject15);
        }
      }
      paramInt1 = paramParcel1.readInt();
      a0.f(paramParcel1);
      getTestFlag((y0)localObject15, paramInt1);
      break;
    case 37: 
      localObject15 = a0.b(paramParcel1);
      a0.f(paramParcel1);
      initForTests((Map)localObject15);
      break;
    case 36: 
      localObject15 = paramParcel1.readStrongBinder();
      if (localObject15 == null)
      {
        localObject15 = localObject3;
      }
      else
      {
        localObject16 = ((IBinder)localObject15).queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
        if ((localObject16 instanceof E0)) {
          localObject15 = (E0)localObject16;
        } else {
          localObject15 = new G0((IBinder)localObject15);
        }
      }
      a0.f(paramParcel1);
      unregisterOnMeasurementEventListener((E0)localObject15);
      break;
    case 35: 
      localObject15 = paramParcel1.readStrongBinder();
      if (localObject15 == null)
      {
        localObject15 = localObject4;
      }
      else
      {
        localObject16 = ((IBinder)localObject15).queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
        if ((localObject16 instanceof E0)) {
          localObject15 = (E0)localObject16;
        } else {
          localObject15 = new G0((IBinder)localObject15);
        }
      }
      a0.f(paramParcel1);
      registerOnMeasurementEventListener((E0)localObject15);
      break;
    case 34: 
      localObject15 = paramParcel1.readStrongBinder();
      if (localObject15 == null)
      {
        localObject15 = localObject5;
      }
      else
      {
        localObject16 = ((IBinder)localObject15).queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
        if ((localObject16 instanceof E0)) {
          localObject15 = (E0)localObject16;
        } else {
          localObject15 = new G0((IBinder)localObject15);
        }
      }
      a0.f(paramParcel1);
      setEventInterceptor((E0)localObject15);
      break;
    case 33: 
      paramInt1 = paramParcel1.readInt();
      localObject16 = paramParcel1.readString();
      localObject15 = a.a.o(paramParcel1.readStrongBinder());
      localObject7 = a.a.o(paramParcel1.readStrongBinder());
      localObject6 = a.a.o(paramParcel1.readStrongBinder());
      a0.f(paramParcel1);
      logHealthData(paramInt1, (String)localObject16, (a)localObject15, (a)localObject7, (a)localObject6);
      break;
    case 32: 
      localObject16 = (Bundle)a0.a(paramParcel1, Bundle.CREATOR);
      localObject15 = paramParcel1.readStrongBinder();
      if (localObject15 == null)
      {
        localObject15 = localObject6;
      }
      else
      {
        localObject6 = ((IBinder)localObject15).queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
        if ((localObject6 instanceof y0)) {
          localObject15 = (y0)localObject6;
        } else {
          localObject15 = new A0((IBinder)localObject15);
        }
      }
      l = paramParcel1.readLong();
      a0.f(paramParcel1);
      performAction((Bundle)localObject16, (y0)localObject15, l);
      break;
    case 31: 
      localObject16 = a.a.o(paramParcel1.readStrongBinder());
      localObject15 = paramParcel1.readStrongBinder();
      if (localObject15 == null)
      {
        localObject15 = localObject7;
      }
      else
      {
        localObject6 = ((IBinder)localObject15).queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
        if ((localObject6 instanceof y0)) {
          localObject15 = (y0)localObject6;
        } else {
          localObject15 = new A0((IBinder)localObject15);
        }
      }
      l = paramParcel1.readLong();
      a0.f(paramParcel1);
      onActivitySaveInstanceState((a)localObject16, (y0)localObject15, l);
      break;
    case 30: 
      localObject15 = a.a.o(paramParcel1.readStrongBinder());
      l = paramParcel1.readLong();
      a0.f(paramParcel1);
      onActivityResumed((a)localObject15, l);
      break;
    case 29: 
      localObject15 = a.a.o(paramParcel1.readStrongBinder());
      l = paramParcel1.readLong();
      a0.f(paramParcel1);
      onActivityPaused((a)localObject15, l);
      break;
    case 28: 
      localObject15 = a.a.o(paramParcel1.readStrongBinder());
      l = paramParcel1.readLong();
      a0.f(paramParcel1);
      onActivityDestroyed((a)localObject15, l);
      break;
    case 27: 
      localObject15 = a.a.o(paramParcel1.readStrongBinder());
      localObject16 = (Bundle)a0.a(paramParcel1, Bundle.CREATOR);
      l = paramParcel1.readLong();
      a0.f(paramParcel1);
      onActivityCreated((a)localObject15, (Bundle)localObject16, l);
      break;
    case 26: 
      localObject15 = a.a.o(paramParcel1.readStrongBinder());
      l = paramParcel1.readLong();
      a0.f(paramParcel1);
      onActivityStopped((a)localObject15, l);
      break;
    case 25: 
      localObject15 = a.a.o(paramParcel1.readStrongBinder());
      l = paramParcel1.readLong();
      a0.f(paramParcel1);
      onActivityStarted((a)localObject15, l);
      break;
    case 24: 
      localObject15 = paramParcel1.readString();
      l = paramParcel1.readLong();
      a0.f(paramParcel1);
      endAdUnitExposure((String)localObject15, l);
      break;
    case 23: 
      localObject15 = paramParcel1.readString();
      l = paramParcel1.readLong();
      a0.f(paramParcel1);
      beginAdUnitExposure((String)localObject15, l);
      break;
    case 22: 
      localObject15 = paramParcel1.readStrongBinder();
      if (localObject15 == null)
      {
        localObject15 = localObject8;
      }
      else
      {
        localObject16 = ((IBinder)localObject15).queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
        if ((localObject16 instanceof y0)) {
          localObject15 = (y0)localObject16;
        } else {
          localObject15 = new A0((IBinder)localObject15);
        }
      }
      a0.f(paramParcel1);
      generateEventId((y0)localObject15);
      break;
    case 21: 
      localObject15 = paramParcel1.readStrongBinder();
      if (localObject15 == null)
      {
        localObject15 = localObject9;
      }
      else
      {
        localObject16 = ((IBinder)localObject15).queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
        if ((localObject16 instanceof y0)) {
          localObject15 = (y0)localObject16;
        } else {
          localObject15 = new A0((IBinder)localObject15);
        }
      }
      a0.f(paramParcel1);
      getGmpAppId((y0)localObject15);
      break;
    case 20: 
      localObject15 = paramParcel1.readStrongBinder();
      if (localObject15 == null)
      {
        localObject15 = localObject10;
      }
      else
      {
        localObject16 = ((IBinder)localObject15).queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
        if ((localObject16 instanceof y0)) {
          localObject15 = (y0)localObject16;
        } else {
          localObject15 = new A0((IBinder)localObject15);
        }
      }
      a0.f(paramParcel1);
      getAppInstanceId((y0)localObject15);
      break;
    case 19: 
      localObject15 = paramParcel1.readStrongBinder();
      if (localObject15 == null)
      {
        localObject15 = localObject11;
      }
      else
      {
        localObject16 = ((IBinder)localObject15).queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
        if ((localObject16 instanceof y0)) {
          localObject15 = (y0)localObject16;
        } else {
          localObject15 = new A0((IBinder)localObject15);
        }
      }
      a0.f(paramParcel1);
      getCachedAppInstanceId((y0)localObject15);
      break;
    case 18: 
      localObject15 = paramParcel1.readStrongBinder();
      if (localObject15 == null)
      {
        localObject15 = localObject12;
      }
      else
      {
        localObject16 = ((IBinder)localObject15).queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
        if ((localObject16 instanceof F0)) {
          localObject15 = (F0)localObject16;
        } else {
          localObject15 = new I0((IBinder)localObject15);
        }
      }
      a0.f(paramParcel1);
      setInstanceIdProvider((F0)localObject15);
      break;
    case 17: 
      localObject15 = paramParcel1.readStrongBinder();
      if (localObject15 == null)
      {
        localObject15 = localObject13;
      }
      else
      {
        localObject16 = ((IBinder)localObject15).queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
        if ((localObject16 instanceof y0)) {
          localObject15 = (y0)localObject16;
        } else {
          localObject15 = new A0((IBinder)localObject15);
        }
      }
      a0.f(paramParcel1);
      getCurrentScreenClass((y0)localObject15);
      break;
    case 16: 
      localObject15 = paramParcel1.readStrongBinder();
      if (localObject15 == null)
      {
        localObject15 = localObject14;
      }
      else
      {
        localObject16 = ((IBinder)localObject15).queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
        if ((localObject16 instanceof y0)) {
          localObject15 = (y0)localObject16;
        } else {
          localObject15 = new A0((IBinder)localObject15);
        }
      }
      a0.f(paramParcel1);
      getCurrentScreenName((y0)localObject15);
      break;
    case 15: 
      localObject15 = a.a.o(paramParcel1.readStrongBinder());
      localObject16 = paramParcel1.readString();
      localObject6 = paramParcel1.readString();
      l = paramParcel1.readLong();
      a0.f(paramParcel1);
      setCurrentScreen((a)localObject15, (String)localObject16, (String)localObject6, l);
      break;
    case 14: 
      l = paramParcel1.readLong();
      a0.f(paramParcel1);
      setSessionTimeoutDuration(l);
      break;
    case 13: 
      l = paramParcel1.readLong();
      a0.f(paramParcel1);
      setMinimumSessionDuration(l);
      break;
    case 12: 
      l = paramParcel1.readLong();
      a0.f(paramParcel1);
      resetAnalyticsData(l);
      break;
    case 11: 
      bool1 = a0.h(paramParcel1);
      l = paramParcel1.readLong();
      a0.f(paramParcel1);
      setMeasurementEnabled(bool1, l);
      break;
    case 10: 
      localObject16 = paramParcel1.readString();
      localObject6 = paramParcel1.readString();
      localObject7 = paramParcel1.readStrongBinder();
      if (localObject7 != null)
      {
        localObject15 = ((IBinder)localObject7).queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
        if ((localObject15 instanceof y0)) {
          localObject15 = (y0)localObject15;
        } else {
          localObject15 = new A0((IBinder)localObject7);
        }
      }
      a0.f(paramParcel1);
      getConditionalUserProperties((String)localObject16, (String)localObject6, (y0)localObject15);
      break;
    case 9: 
      localObject16 = paramParcel1.readString();
      localObject15 = paramParcel1.readString();
      localObject6 = (Bundle)a0.a(paramParcel1, Bundle.CREATOR);
      a0.f(paramParcel1);
      clearConditionalUserProperty((String)localObject16, (String)localObject15, (Bundle)localObject6);
      break;
    case 8: 
      localObject15 = (Bundle)a0.a(paramParcel1, Bundle.CREATOR);
      l = paramParcel1.readLong();
      a0.f(paramParcel1);
      setConditionalUserProperty((Bundle)localObject15, l);
      break;
    case 7: 
      localObject15 = paramParcel1.readString();
      l = paramParcel1.readLong();
      a0.f(paramParcel1);
      setUserId((String)localObject15, l);
      break;
    case 6: 
      localObject16 = paramParcel1.readString();
      localObject15 = paramParcel1.readStrongBinder();
      if (localObject15 == null)
      {
        localObject15 = localIInterface;
      }
      else
      {
        localObject6 = ((IBinder)localObject15).queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
        if ((localObject6 instanceof y0)) {
          localObject15 = (y0)localObject6;
        } else {
          localObject15 = new A0((IBinder)localObject15);
        }
      }
      a0.f(paramParcel1);
      getMaxUserProperties((String)localObject16, (y0)localObject15);
      break;
    case 5: 
      localObject7 = paramParcel1.readString();
      localObject6 = paramParcel1.readString();
      bool1 = a0.h(paramParcel1);
      localObject15 = paramParcel1.readStrongBinder();
      if (localObject15 == null)
      {
        localObject15 = localObject16;
      }
      else
      {
        localObject16 = ((IBinder)localObject15).queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
        if ((localObject16 instanceof y0)) {
          localObject15 = (y0)localObject16;
        } else {
          localObject15 = new A0((IBinder)localObject15);
        }
      }
      a0.f(paramParcel1);
      getUserProperties((String)localObject7, (String)localObject6, bool1, (y0)localObject15);
      break;
    case 4: 
      localObject15 = paramParcel1.readString();
      localObject16 = paramParcel1.readString();
      localObject6 = a.a.o(paramParcel1.readStrongBinder());
      bool1 = a0.h(paramParcel1);
      l = paramParcel1.readLong();
      a0.f(paramParcel1);
      setUserProperty((String)localObject15, (String)localObject16, (a)localObject6, bool1, l);
      break;
    case 3: 
      localObject7 = paramParcel1.readString();
      localObject6 = paramParcel1.readString();
      localObject16 = (Bundle)a0.a(paramParcel1, Bundle.CREATOR);
      localObject15 = paramParcel1.readStrongBinder();
      if (localObject15 == null)
      {
        localObject15 = null;
      }
      else
      {
        localIInterface = ((IBinder)localObject15).queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
        if ((localIInterface instanceof y0)) {}
        for (localObject15 = (y0)localIInterface;; localObject15 = new A0((IBinder)localObject15)) {
          break;
        }
      }
      l = paramParcel1.readLong();
      a0.f(paramParcel1);
      logEventAndBundle((String)localObject7, (String)localObject6, (Bundle)localObject16, (y0)localObject15, l);
      break;
    case 2: 
      localObject6 = paramParcel1.readString();
      localObject15 = paramParcel1.readString();
      localObject16 = (Bundle)a0.a(paramParcel1, Bundle.CREATOR);
      bool1 = a0.h(paramParcel1);
      boolean bool2 = a0.h(paramParcel1);
      l = paramParcel1.readLong();
      a0.f(paramParcel1);
      logEvent((String)localObject6, (String)localObject15, (Bundle)localObject16, bool1, bool2, l);
      break;
    case 1: 
      localObject16 = a.a.o(paramParcel1.readStrongBinder());
      localObject15 = (H0)a0.a(paramParcel1, H0.CREATOR);
      l = paramParcel1.readLong();
      a0.f(paramParcel1);
      initialize((a)localObject16, (H0)localObject15, l);
    }
    paramParcel2.writeNoException();
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.w0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */