package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import j6.b;
import m6.h;
import n6.a;

public final class f
  extends a
{
  public static final Parcelable.Creator<f> CREATOR = new m6.z();
  public final int a;
  public final IBinder b;
  public final b c;
  public final boolean d;
  public final boolean e;
  
  public f(int paramInt, IBinder paramIBinder, b paramb, boolean paramBoolean1, boolean paramBoolean2)
  {
    a = paramInt;
    b = paramIBinder;
    c = paramb;
    d = paramBoolean1;
    e = paramBoolean2;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == null) {
      return false;
    }
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof f)) {
      return false;
    }
    Object localObject = (f)paramObject;
    if (c.equals(c))
    {
      paramObject = b;
      IAccountAccessor localIAccountAccessor = null;
      if (paramObject == null) {
        paramObject = null;
      } else {
        paramObject = IAccountAccessor.Stub.asInterface((IBinder)paramObject);
      }
      localObject = b;
      if (localObject != null) {
        localIAccountAccessor = IAccountAccessor.Stub.asInterface((IBinder)localObject);
      }
      if (h.a(paramObject, localIAccountAccessor)) {
        return true;
      }
    }
    return false;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = b.z.J(20293, paramParcel);
    b.z.z(paramParcel, 1, a);
    b.z.y(paramParcel, 2, b);
    b.z.E(paramParcel, 3, c, paramInt, false);
    b.z.t(paramParcel, 4, d);
    b.z.t(paramParcel, 5, e);
    b.z.L(i, paramParcel);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.internal.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */