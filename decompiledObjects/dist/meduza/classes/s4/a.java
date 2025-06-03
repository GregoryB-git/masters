package s4;

import a0.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import f;
import java.util.Arrays;
import n7.d;
import p4.a.b;
import v3.p0.a;
import v5.e0;
import v5.u;

public final class a
  implements a.b
{
  public static final Parcelable.Creator<a> CREATOR = new a();
  public final int a;
  public final String b;
  public final String c;
  public final int d;
  public final int e;
  public final int f;
  public final int o;
  public final byte[] p;
  
  public a(int paramInt1, String paramString1, String paramString2, int paramInt2, int paramInt3, int paramInt4, int paramInt5, byte[] paramArrayOfByte)
  {
    a = paramInt1;
    b = paramString1;
    c = paramString2;
    d = paramInt2;
    e = paramInt3;
    f = paramInt4;
    o = paramInt5;
    p = paramArrayOfByte;
  }
  
  public a(Parcel paramParcel)
  {
    a = paramParcel.readInt();
    String str = paramParcel.readString();
    int i = e0.a;
    b = str;
    c = paramParcel.readString();
    d = paramParcel.readInt();
    e = paramParcel.readInt();
    f = paramParcel.readInt();
    o = paramParcel.readInt();
    p = paramParcel.createByteArray();
  }
  
  public static a a(u paramu)
  {
    int i = paramu.f();
    String str1 = paramu.t(paramu.f(), d.a);
    String str2 = paramu.s(paramu.f());
    int j = paramu.f();
    int k = paramu.f();
    int m = paramu.f();
    int n = paramu.f();
    int i1 = paramu.f();
    byte[] arrayOfByte = new byte[i1];
    paramu.d(arrayOfByte, 0, i1);
    return new a(i, str1, str2, j, k, m, n, arrayOfByte);
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
      if ((a != a) || (!b.equals(b)) || (!c.equals(c)) || (d != d) || (e != e) || (f != f) || (o != o) || (!Arrays.equals(p, p))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public final int hashCode()
  {
    int i = a;
    i = j.e(b, (i + 527) * 31, 31);
    int j = j.e(c, i, 31);
    i = d;
    int k = e;
    int m = f;
    int n = o;
    return Arrays.hashCode(p) + ((((j + i) * 31 + k) * 31 + m) * 31 + n) * 31;
  }
  
  public final void l(p0.a parama)
  {
    parama.a(p, a);
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("Picture: mimeType=");
    localStringBuilder.append(b);
    localStringBuilder.append(", description=");
    localStringBuilder.append(c);
    return localStringBuilder.toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(a);
    paramParcel.writeString(b);
    paramParcel.writeString(c);
    paramParcel.writeInt(d);
    paramParcel.writeInt(e);
    paramParcel.writeInt(f);
    paramParcel.writeInt(o);
    paramParcel.writeByteArray(p);
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
 * Qualified Name:     s4.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */