package Q0;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import d0.q;
import d0.q.b;
import d0.x.b;
import g0.M;
import java.util.Arrays;

public final class a
  implements x.b
{
  public static final Parcelable.Creator<a> CREATOR = new a();
  public static final q u = new q.b().o0("application/id3").K();
  public static final q v = new q.b().o0("application/x-scte35").K();
  public final String o;
  public final String p;
  public final long q;
  public final long r;
  public final byte[] s;
  public int t;
  
  public a(Parcel paramParcel)
  {
    o = ((String)M.i(paramParcel.readString()));
    p = ((String)M.i(paramParcel.readString()));
    q = paramParcel.readLong();
    r = paramParcel.readLong();
    s = ((byte[])M.i(paramParcel.createByteArray()));
  }
  
  public a(String paramString1, String paramString2, long paramLong1, long paramLong2, byte[] paramArrayOfByte)
  {
    o = paramString1;
    p = paramString2;
    q = paramLong1;
    r = paramLong2;
    s = paramArrayOfByte;
  }
  
  public byte[] M()
  {
    byte[] arrayOfByte;
    if (s() != null) {
      arrayOfByte = s;
    } else {
      arrayOfByte = null;
    }
    return arrayOfByte;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (a.class == paramObject.getClass()))
    {
      paramObject = (a)paramObject;
      if ((q != q) || (r != r) || (!M.c(o, o)) || (!M.c(p, p)) || (!Arrays.equals(s, s))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public int hashCode()
  {
    if (t == 0)
    {
      String str = o;
      int i = 0;
      int j;
      if (str != null) {
        j = str.hashCode();
      } else {
        j = 0;
      }
      str = p;
      if (str != null) {
        i = str.hashCode();
      }
      long l = q;
      int k = (int)(l ^ l >>> 32);
      l = r;
      t = (((((527 + j) * 31 + i) * 31 + k) * 31 + (int)(l ^ l >>> 32)) * 31 + Arrays.hashCode(s));
    }
    return t;
  }
  
  public q s()
  {
    String str = o;
    str.hashCode();
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
      return u;
    }
    return v;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("EMSG: scheme=");
    localStringBuilder.append(o);
    localStringBuilder.append(", id=");
    localStringBuilder.append(r);
    localStringBuilder.append(", durationMs=");
    localStringBuilder.append(q);
    localStringBuilder.append(", value=");
    localStringBuilder.append(p);
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(o);
    paramParcel.writeString(p);
    paramParcel.writeLong(q);
    paramParcel.writeLong(r);
    paramParcel.writeByteArray(s);
  }
  
  public class a
    implements Parcelable.Creator
  {
    public a a(Parcel paramParcel)
    {
      return new a(paramParcel);
    }
    
    public a[] b(int paramInt)
    {
      return new a[paramInt];
    }
  }
}

/* Location:
 * Qualified Name:     Q0.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */