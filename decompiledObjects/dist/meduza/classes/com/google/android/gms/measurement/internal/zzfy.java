package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.zzbw;
import com.google.android.gms.internal.measurement.zzbx;
import e7.a1;
import e7.b1;
import e7.d6;
import e7.e;
import e7.e2;
import e7.f;
import e7.f0;
import e7.i6;
import e7.k6;
import e7.n0;
import e7.p0;
import e7.q6;
import e7.r0;
import e7.r6;
import e7.s0;
import e7.s2;
import e7.s6;
import e7.u0;
import e7.z1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import m6.j;

public abstract class zzfy
  extends zzbx
  implements n0
{
  public zzfy()
  {
    super("com.google.android.gms.measurement.internal.IMeasurementService");
  }
  
  public final boolean zza(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    Object localObject3 = null;
    Object localObject4;
    boolean bool;
    switch (paramInt1)
    {
    case 3: 
    case 8: 
    case 22: 
    case 23: 
    case 28: 
    default: 
      return false;
    case 31: 
      localObject4 = (k6)zzbw.zza(paramParcel1, k6.CREATOR);
      localObject1 = (Bundle)zzbw.zza(paramParcel1, Bundle.CREATOR);
      localObject2 = paramParcel1.readStrongBinder();
      if (localObject2 == null)
      {
        localObject2 = localObject3;
      }
      else
      {
        localObject3 = ((IBinder)localObject2).queryLocalInterface("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
        if ((localObject3 instanceof p0)) {
          localObject2 = (p0)localObject3;
        } else {
          localObject2 = new r0((IBinder)localObject2);
        }
      }
      zzbw.zzb(paramParcel1);
      ((zzig)this).h2((k6)localObject4, (Bundle)localObject1, (p0)localObject2);
      break;
    case 30: 
      localObject3 = (k6)zzbw.zza(paramParcel1, k6.CREATOR);
      localObject2 = (e)zzbw.zza(paramParcel1, e.CREATOR);
      zzbw.zzb(paramParcel1);
      ((zzig)this).M1((k6)localObject3, (e)localObject2);
      break;
    case 29: 
      localObject4 = (k6)zzbw.zza(paramParcel1, k6.CREATOR);
      localObject3 = (d6)zzbw.zza(paramParcel1, d6.CREATOR);
      localObject2 = paramParcel1.readStrongBinder();
      if (localObject2 == null)
      {
        localObject2 = localObject1;
      }
      else
      {
        localObject1 = ((IBinder)localObject2).queryLocalInterface("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
        if ((localObject1 instanceof s0)) {
          localObject2 = (s0)localObject1;
        } else {
          localObject2 = new u0((IBinder)localObject2);
        }
      }
      zzbw.zzb(paramParcel1);
      ((zzig)this).N1((k6)localObject4, (d6)localObject3, (s0)localObject2);
      break;
    case 27: 
      localObject2 = (k6)zzbw.zza(paramParcel1, k6.CREATOR);
      zzbw.zzb(paramParcel1);
      ((zzig)this).Y1((k6)localObject2);
      break;
    case 26: 
      localObject2 = (k6)zzbw.zza(paramParcel1, k6.CREATOR);
      zzbw.zzb(paramParcel1);
      ((zzig)this).k0((k6)localObject2);
      break;
    case 25: 
      localObject2 = (k6)zzbw.zza(paramParcel1, k6.CREATOR);
      zzbw.zzb(paramParcel1);
      ((zzig)this).l1((k6)localObject2);
      break;
    case 24: 
      localObject2 = (k6)zzbw.zza(paramParcel1, k6.CREATOR);
      localObject3 = (Bundle)zzbw.zza(paramParcel1, Bundle.CREATOR);
      zzbw.zzb(paramParcel1);
      paramParcel1 = ((zzig)this).m((Bundle)localObject3, (k6)localObject2);
      break;
    case 21: 
      localObject2 = (k6)zzbw.zza(paramParcel1, k6.CREATOR);
      zzbw.zzb(paramParcel1);
      paramParcel1 = ((zzig)this).v1((k6)localObject2);
      paramParcel2.writeNoException();
      zzbw.zzb(paramParcel2, paramParcel1);
      break;
    case 20: 
      localObject2 = (k6)zzbw.zza(paramParcel1, k6.CREATOR);
      zzbw.zzb(paramParcel1);
      ((zzig)this).C((k6)localObject2);
      break;
    case 19: 
      localObject3 = (Bundle)zzbw.zza(paramParcel1, Bundle.CREATOR);
      localObject2 = (k6)zzbw.zza(paramParcel1, k6.CREATOR);
      zzbw.zzb(paramParcel1);
      ((zzig)this).m((Bundle)localObject3, (k6)localObject2);
      break;
    case 18: 
      localObject2 = (k6)zzbw.zza(paramParcel1, k6.CREATOR);
      zzbw.zzb(paramParcel1);
      ((zzig)this).M2((k6)localObject2);
      break;
    case 17: 
      localObject3 = paramParcel1.readString();
      localObject1 = paramParcel1.readString();
      localObject2 = paramParcel1.readString();
      zzbw.zzb(paramParcel1);
      paramParcel1 = ((zzig)this).h1((String)localObject3, (String)localObject1, (String)localObject2);
      break;
    case 16: 
      localObject2 = paramParcel1.readString();
      localObject1 = paramParcel1.readString();
      localObject3 = (k6)zzbw.zza(paramParcel1, k6.CREATOR);
      zzbw.zzb(paramParcel1);
      paramParcel1 = ((zzig)this).T2((String)localObject2, (String)localObject1, (k6)localObject3);
      break;
    case 15: 
      localObject3 = paramParcel1.readString();
      localObject1 = paramParcel1.readString();
      localObject2 = paramParcel1.readString();
      bool = zzbw.zzc(paramParcel1);
      zzbw.zzb(paramParcel1);
      paramParcel1 = ((zzig)this).h0((String)localObject3, (String)localObject1, (String)localObject2, bool);
      break;
    case 14: 
      localObject2 = paramParcel1.readString();
      localObject1 = paramParcel1.readString();
      bool = zzbw.zzc(paramParcel1);
      localObject3 = (k6)zzbw.zza(paramParcel1, k6.CREATOR);
      zzbw.zzb(paramParcel1);
      paramParcel1 = ((zzig)this).O2((String)localObject2, (String)localObject1, bool, (k6)localObject3);
      paramParcel2.writeNoException();
      paramParcel2.writeTypedList(paramParcel1);
      break;
    case 13: 
      localObject2 = (f)zzbw.zza(paramParcel1, f.CREATOR);
      zzbw.zzb(paramParcel1);
      paramParcel1 = (zzig)this;
      j.i(localObject2);
      j.i(c);
      j.e(a);
      paramParcel1.d3(a, true);
      paramParcel1.f3(new s2(0, paramParcel1, new f((f)localObject2)));
      break;
    case 12: 
      localObject3 = (f)zzbw.zza(paramParcel1, f.CREATOR);
      localObject2 = (k6)zzbw.zza(paramParcel1, k6.CREATOR);
      zzbw.zzb(paramParcel1);
      ((zzig)this).F((f)localObject3, (k6)localObject2);
      break;
    case 11: 
      localObject2 = (k6)zzbw.zza(paramParcel1, k6.CREATOR);
      zzbw.zzb(paramParcel1);
      paramParcel1 = ((zzig)this).V1((k6)localObject2);
      paramParcel2.writeNoException();
      paramParcel2.writeString(paramParcel1);
      break;
    case 10: 
      long l = paramParcel1.readLong();
      localObject1 = paramParcel1.readString();
      localObject2 = paramParcel1.readString();
      localObject3 = paramParcel1.readString();
      zzbw.zzb(paramParcel1);
      ((zzig)this).d1(l, (String)localObject1, (String)localObject2, (String)localObject3);
      break;
    case 9: 
      localObject2 = (f0)zzbw.zza(paramParcel1, f0.CREATOR);
      localObject3 = paramParcel1.readString();
      zzbw.zzb(paramParcel1);
      paramParcel1 = ((zzig)this).V2((f0)localObject2, (String)localObject3);
      paramParcel2.writeNoException();
      paramParcel2.writeByteArray(paramParcel1);
      break;
    case 7: 
      localObject3 = (k6)zzbw.zza(paramParcel1, k6.CREATOR);
      bool = zzbw.zzc(paramParcel1);
      zzbw.zzb(paramParcel1);
      localObject1 = (zzig)this;
      ((zzig)localObject1).e3((k6)localObject3);
      paramParcel1 = a;
      j.i(paramParcel1);
      paramParcel1 = a.zzl().p(new z1(paramParcel1, 1, localObject1));
      try
      {
        localObject4 = (List)paramParcel1.get();
        paramParcel1 = new java/util/ArrayList;
        paramParcel1.<init>(((List)localObject4).size());
        Iterator localIterator = ((List)localObject4).iterator();
        while (localIterator.hasNext())
        {
          localObject4 = (s6)localIterator.next();
          if ((bool) || (!r6.r0(c)))
          {
            q6 localq6 = new e7/q6;
            localq6.<init>((s6)localObject4);
            paramParcel1.add(localq6);
          }
        }
      }
      catch (ExecutionException paramParcel1) {}catch (InterruptedException paramParcel1) {}
      a.zzj().o.d("Failed to get user properties. appId", a1.p(a), paramParcel1);
      paramParcel1 = (Parcel)localObject2;
      paramParcel2.writeNoException();
      paramParcel2.writeTypedList(paramParcel1);
      break;
    case 6: 
      localObject2 = (k6)zzbw.zza(paramParcel1, k6.CREATOR);
      zzbw.zzb(paramParcel1);
      ((zzig)this).E0((k6)localObject2);
      break;
    case 5: 
      localObject3 = (f0)zzbw.zza(paramParcel1, f0.CREATOR);
      localObject2 = paramParcel1.readString();
      localObject1 = paramParcel1.readString();
      zzbw.zzb(paramParcel1);
      ((zzig)this).g((f0)localObject3, (String)localObject2, (String)localObject1);
      break;
    case 4: 
      localObject2 = (k6)zzbw.zza(paramParcel1, k6.CREATOR);
      zzbw.zzb(paramParcel1);
      ((zzig)this).r2((k6)localObject2);
      break;
    case 2: 
      localObject2 = (q6)zzbw.zza(paramParcel1, q6.CREATOR);
      localObject3 = (k6)zzbw.zza(paramParcel1, k6.CREATOR);
      zzbw.zzb(paramParcel1);
      ((zzig)this).g0((q6)localObject2, (k6)localObject3);
      break;
    }
    localObject3 = (f0)zzbw.zza(paramParcel1, f0.CREATOR);
    localObject2 = (k6)zzbw.zza(paramParcel1, k6.CREATOR);
    zzbw.zzb(paramParcel1);
    ((zzig)this).V((f0)localObject3, (k6)localObject2);
    paramParcel2.writeNoException();
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.measurement.internal.zzfy
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */