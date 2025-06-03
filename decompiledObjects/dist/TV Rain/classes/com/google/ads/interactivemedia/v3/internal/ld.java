package com.google.ads.interactivemedia.v3.internal;

import a;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class ld
  extends la
{
  public static final Parcelable.Creator<ld> CREATOR = new lc();
  public final String a;
  public final String b;
  public final String d;
  
  public ld(Parcel paramParcel)
  {
    super("----");
    a = ((String)wl.a(paramParcel.readString()));
    b = ((String)wl.a(paramParcel.readString()));
    d = ((String)wl.a(paramParcel.readString()));
  }
  
  public ld(String paramString1, String paramString2, String paramString3)
  {
    super("----");
    a = paramString1;
    b = paramString2;
    d = paramString3;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (ld.class == paramObject.getClass()))
    {
      paramObject = (ld)paramObject;
      if ((wl.a(b, b)) && (wl.a(a, a)) && (wl.a(d, d))) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    String str = a;
    int i = 0;
    int j;
    if (str != null) {
      j = str.hashCode();
    } else {
      j = 0;
    }
    str = b;
    int k;
    if (str != null) {
      k = str.hashCode();
    } else {
      k = 0;
    }
    str = d;
    if (str != null) {
      i = str.hashCode();
    }
    return ((j + 527) * 31 + k) * 31 + i;
  }
  
  public final String toString()
  {
    String str1 = c;
    Object localObject = a;
    String str2 = b;
    localObject = a.q(a.b(str2, a.b((String)localObject, a.b(str1, 23))), str1, ": domain=", (String)localObject, ", description=");
    ((StringBuilder)localObject).append(str2);
    return ((StringBuilder)localObject).toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(c);
    paramParcel.writeString(a);
    paramParcel.writeString(d);
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.ld
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */