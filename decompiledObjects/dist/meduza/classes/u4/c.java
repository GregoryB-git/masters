package u4;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;
import v5.e0;

public final class c
  extends h
{
  public static final Parcelable.Creator<c> CREATOR = new a();
  public final String b;
  public final int c;
  public final int d;
  public final long e;
  public final long f;
  public final h[] o;
  
  public c(Parcel paramParcel)
  {
    super("CHAP");
    String str = paramParcel.readString();
    int i = e0.a;
    b = str;
    c = paramParcel.readInt();
    d = paramParcel.readInt();
    e = paramParcel.readLong();
    f = paramParcel.readLong();
    int j = paramParcel.readInt();
    o = new h[j];
    for (i = 0; i < j; i++) {
      o[i] = ((h)paramParcel.readParcelable(h.class.getClassLoader()));
    }
  }
  
  public c(String paramString, int paramInt1, int paramInt2, long paramLong1, long paramLong2, h[] paramArrayOfh)
  {
    super("CHAP");
    b = paramString;
    c = paramInt1;
    d = paramInt2;
    e = paramLong1;
    f = paramLong2;
    o = paramArrayOfh;
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
    if ((paramObject != null) && (c.class == paramObject.getClass()))
    {
      paramObject = (c)paramObject;
      if ((c != c) || (d != d) || (e != e) || (f != f) || (!e0.a(b, b)) || (!Arrays.equals(o, o))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public final int hashCode()
  {
    int i = c;
    int j = d;
    int k = (int)e;
    int m = (int)f;
    String str = b;
    int n;
    if (str != null) {
      n = str.hashCode();
    } else {
      n = 0;
    }
    return ((((527 + i) * 31 + j) * 31 + k) * 31 + m) * 31 + n;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(b);
    paramParcel.writeInt(c);
    paramParcel.writeInt(d);
    paramParcel.writeLong(e);
    paramParcel.writeLong(f);
    paramParcel.writeInt(o.length);
    h[] arrayOfh = o;
    int i = arrayOfh.length;
    for (paramInt = 0; paramInt < i; paramInt++) {
      paramParcel.writeParcelable(arrayOfh[paramInt], 0);
    }
  }
  
  public final class a
    implements Parcelable.Creator<c>
  {
    public final Object createFromParcel(Parcel paramParcel)
    {
      return new c(paramParcel);
    }
    
    public final Object[] newArray(int paramInt)
    {
      return new c[paramInt];
    }
  }
}

/* Location:
 * Qualified Name:     u4.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */