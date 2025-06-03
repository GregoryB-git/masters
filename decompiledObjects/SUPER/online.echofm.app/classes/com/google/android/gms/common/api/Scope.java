package com.google.android.gms.common.api;

import A2.n;
import B2.a;
import B2.c;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import y2.i;

public final class Scope
  extends a
  implements ReflectedParcelable
{
  @NonNull
  public static final Parcelable.Creator<Scope> CREATOR = new i();
  public final int o;
  public final String p;
  
  public Scope(int paramInt, String paramString)
  {
    n.f(paramString, "scopeUri must not be null or empty");
    o = paramInt;
    p = paramString;
  }
  
  public Scope(String paramString)
  {
    this(1, paramString);
  }
  
  public String a()
  {
    return p;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof Scope)) {
      return false;
    }
    return p.equals(p);
  }
  
  public int hashCode()
  {
    return p.hashCode();
  }
  
  public String toString()
  {
    return p;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = c.a(paramParcel);
    c.i(paramParcel, 1, o);
    c.n(paramParcel, 2, a(), false);
    c.b(paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.api.Scope
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */