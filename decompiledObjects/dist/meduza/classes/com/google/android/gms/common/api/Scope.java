package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import b.z;
import com.google.android.gms.common.internal.ReflectedParcelable;
import k6.q;
import m6.j;
import n6.a;

public final class Scope
  extends a
  implements ReflectedParcelable
{
  public static final Parcelable.Creator<Scope> CREATOR = new q();
  public final int a;
  public final String b;
  
  public Scope() {}
  
  public Scope(int paramInt, String paramString)
  {
    j.f("scopeUri must not be null or empty", paramString);
    a = paramInt;
    b = paramString;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof Scope)) {
      return false;
    }
    return b.equals(b);
  }
  
  public final int hashCode()
  {
    return b.hashCode();
  }
  
  public final String toString()
  {
    return b;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = a;
    paramInt = z.J(20293, paramParcel);
    z.z(paramParcel, 1, i);
    z.F(paramParcel, 2, b, false);
    z.L(paramInt, paramParcel);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.api.Scope
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */