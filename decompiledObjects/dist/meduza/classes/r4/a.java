package r4;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import f;
import java.util.Arrays;
import p4.a.b;
import v3.i0;
import v3.i0.a;
import v5.e0;

public final class a
  implements a.b
{
  public static final Parcelable.Creator<a> CREATOR = new a();
  public static final i0 o;
  public static final i0 p;
  public final String a;
  public final String b;
  public final long c;
  public final long d;
  public final byte[] e;
  public int f;
  
  static
  {
    i0.a locala = new i0.a();
    k = "application/id3";
    o = locala.a();
    locala = new i0.a();
    k = "application/x-scte35";
    p = locala.a();
  }
  
  public a(Parcel paramParcel)
  {
    String str = paramParcel.readString();
    int i = e0.a;
    a = str;
    b = paramParcel.readString();
    c = paramParcel.readLong();
    d = paramParcel.readLong();
    e = paramParcel.createByteArray();
  }
  
  public a(String paramString1, String paramString2, long paramLong1, long paramLong2, byte[] paramArrayOfByte)
  {
    a = paramString1;
    b = paramString2;
    c = paramLong1;
    d = paramLong2;
    e = paramArrayOfByte;
  }
  
  public final byte[] B()
  {
    byte[] arrayOfByte;
    if (n() != null) {
      arrayOfByte = e;
    } else {
      arrayOfByte = null;
    }
    return arrayOfByte;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (a.class == paramObject.getClass()))
    {
      paramObject = (a)paramObject;
      if ((c != c) || (d != d) || (!e0.a(a, a)) || (!e0.a(b, b)) || (!Arrays.equals(e, e))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public final int hashCode()
  {
    if (f == 0)
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
      if (str != null) {
        i = str.hashCode();
      }
      long l = c;
      int k = (int)(l ^ l >>> 32);
      l = d;
      int m = (int)(l ^ l >>> 32);
      f = (Arrays.hashCode(e) + ((((527 + j) * 31 + i) * 31 + k) * 31 + m) * 31);
    }
    return f;
  }
  
  public final i0 n()
  {
    String str = a;
    str.getClass();
    int i = str.hashCode();
    int j = -1;
    switch (i)
    {
    default: 
      break;
    case 1303648457: 
      if (str.equals("https://developer.apple.com/streaming/emsg-id3")) {
        j = 2;
      }
      break;
    case -795945609: 
      if (str.equals("https://aomedia.org/emsg/ID3")) {
        j = 1;
      }
      break;
    case -1468477611: 
      if (str.equals("urn:scte:scte35:2014:bin")) {
        j = 0;
      }
      break;
    }
    switch (j)
    {
    default: 
      return null;
    case 1: 
    case 2: 
      return o;
    }
    return p;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("EMSG: scheme=");
    localStringBuilder.append(a);
    localStringBuilder.append(", id=");
    localStringBuilder.append(d);
    localStringBuilder.append(", durationMs=");
    localStringBuilder.append(c);
    localStringBuilder.append(", value=");
    localStringBuilder.append(b);
    return localStringBuilder.toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(a);
    paramParcel.writeString(b);
    paramParcel.writeLong(c);
    paramParcel.writeLong(d);
    paramParcel.writeByteArray(e);
  }
  
  public final class a
    implements Parcelable.Creator<a>
  {
    public final Object createFromParcel(Parcel paramParcel)
    {
      return new a(paramParcel);
    }
    
    public final Object[] newArray(int paramInt)
    {
      return new a[paramInt];
    }
  }
}

/* Location:
 * Qualified Name:     r4.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */