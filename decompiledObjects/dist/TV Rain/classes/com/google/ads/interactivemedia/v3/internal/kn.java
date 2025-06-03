package com.google.ads.interactivemedia.v3.internal;

import a;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;

public final class kn
  extends la
{
  public static final Parcelable.Creator<kn> CREATOR = new km();
  private final String a;
  private final String b;
  private final int d;
  private final byte[] e;
  
  public kn(Parcel paramParcel)
  {
    super("APIC");
    a = ((String)wl.a(paramParcel.readString()));
    b = ((String)wl.a(paramParcel.readString()));
    d = paramParcel.readInt();
    e = ((byte[])wl.a(paramParcel.createByteArray()));
  }
  
  public kn(String paramString1, String paramString2, int paramInt, byte[] paramArrayOfByte)
  {
    super("APIC");
    a = paramString1;
    b = paramString2;
    d = paramInt;
    e = paramArrayOfByte;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (kn.class == paramObject.getClass()))
    {
      paramObject = (kn)paramObject;
      if ((d == d) && (wl.a(a, a)) && (wl.a(b, b)) && (Arrays.equals(e, e))) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    int i = d;
    String str = a;
    int j = 0;
    int k;
    if (str != null) {
      k = str.hashCode();
    } else {
      k = 0;
    }
    str = b;
    if (str != null) {
      j = str.hashCode();
    }
    return Arrays.hashCode(e) + (((i + 527) * 31 + k) * 31 + j) * 31;
  }
  
  public final String toString()
  {
    String str1 = c;
    Object localObject = a;
    String str2 = b;
    localObject = a.q(a.b(str2, a.b((String)localObject, a.b(str1, 25))), str1, ": mimeType=", (String)localObject, ", description=");
    ((StringBuilder)localObject).append(str2);
    return ((StringBuilder)localObject).toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(a);
    paramParcel.writeString(b);
    paramParcel.writeInt(d);
    paramParcel.writeByteArray(e);
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.kn
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */