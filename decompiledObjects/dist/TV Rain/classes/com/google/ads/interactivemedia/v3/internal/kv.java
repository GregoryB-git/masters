package com.google.ads.interactivemedia.v3.internal;

import a;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class kv
  extends la
{
  public static final Parcelable.Creator<kv> CREATOR = new ku();
  public final String a;
  public final String b;
  private final String d;
  
  public kv(Parcel paramParcel)
  {
    super("COMM");
    d = ((String)wl.a(paramParcel.readString()));
    a = ((String)wl.a(paramParcel.readString()));
    b = ((String)wl.a(paramParcel.readString()));
  }
  
  public kv(String paramString1, String paramString2, String paramString3)
  {
    super("COMM");
    d = paramString1;
    a = paramString2;
    b = paramString3;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (kv.class == paramObject.getClass()))
    {
      paramObject = (kv)paramObject;
      if ((wl.a(a, a)) && (wl.a(d, d)) && (wl.a(b, b))) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    String str = d;
    int i = 0;
    int j;
    if (str != null) {
      j = str.hashCode();
    } else {
      j = 0;
    }
    str = a;
    int k;
    if (str != null) {
      k = str.hashCode();
    } else {
      k = 0;
    }
    str = b;
    if (str != null) {
      i = str.hashCode();
    }
    return ((j + 527) * 31 + k) * 31 + i;
  }
  
  public final String toString()
  {
    Object localObject = c;
    String str1 = d;
    String str2 = a;
    localObject = a.q(a.b(str2, a.b(str1, a.b((String)localObject, 25))), (String)localObject, ": language=", str1, ", description=");
    ((StringBuilder)localObject).append(str2);
    return ((StringBuilder)localObject).toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(c);
    paramParcel.writeString(d);
    paramParcel.writeString(b);
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.kv
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */