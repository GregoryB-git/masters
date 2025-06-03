package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;

public final class kt
  extends la
{
  public static final Parcelable.Creator<kt> CREATOR = new ks();
  private final String a;
  private final boolean b;
  private final boolean d;
  private final String[] e;
  private final la[] f;
  
  public kt(Parcel paramParcel)
  {
    super("CTOC");
    a = ((String)wl.a(paramParcel.readString()));
    int i = paramParcel.readByte();
    boolean bool1 = true;
    int j = 0;
    boolean bool2;
    if (i != 0) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    b = bool2;
    if (paramParcel.readByte() != 0) {
      bool2 = bool1;
    } else {
      bool2 = false;
    }
    d = bool2;
    e = ((String[])wl.a(paramParcel.createStringArray()));
    i = paramParcel.readInt();
    f = new la[i];
    while (j < i)
    {
      f[j] = ((la)paramParcel.readParcelable(la.class.getClassLoader()));
      j++;
    }
  }
  
  public kt(String paramString, boolean paramBoolean1, boolean paramBoolean2, String[] paramArrayOfString, la[] paramArrayOfla)
  {
    super("CTOC");
    a = paramString;
    b = paramBoolean1;
    d = paramBoolean2;
    e = paramArrayOfString;
    f = paramArrayOfla;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (kt.class == paramObject.getClass()))
    {
      paramObject = (kt)paramObject;
      if ((b == b) && (d == d) && (wl.a(a, a)) && (Arrays.equals(e, e)) && (Arrays.equals(f, f))) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    int i = b;
    int j = d;
    String str = a;
    int k;
    if (str != null) {
      k = str.hashCode();
    } else {
      k = 0;
    }
    return ((i + 527) * 31 + j) * 31 + k;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(a);
    paramParcel.writeByte((byte)b);
    paramParcel.writeByte((byte)d);
    paramParcel.writeStringArray(e);
    paramParcel.writeInt(f.length);
    la[] arrayOfla = f;
    int i = arrayOfla.length;
    for (paramInt = 0; paramInt < i; paramInt++) {
      paramParcel.writeParcelable(arrayOfla[paramInt], 0);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.kt
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */