package R0;

import W2.e;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import d0.w.b;
import d0.x.b;
import g0.M;
import java.util.Arrays;

public final class a
  implements x.b
{
  public static final Parcelable.Creator<a> CREATOR = new a();
  public final int o;
  public final String p;
  public final String q;
  public final int r;
  public final int s;
  public final int t;
  public final int u;
  public final byte[] v;
  
  public a(int paramInt1, String paramString1, String paramString2, int paramInt2, int paramInt3, int paramInt4, int paramInt5, byte[] paramArrayOfByte)
  {
    o = paramInt1;
    p = paramString1;
    q = paramString2;
    r = paramInt2;
    s = paramInt3;
    t = paramInt4;
    u = paramInt5;
    v = paramArrayOfByte;
  }
  
  public a(Parcel paramParcel)
  {
    o = paramParcel.readInt();
    p = ((String)M.i(paramParcel.readString()));
    q = ((String)M.i(paramParcel.readString()));
    r = paramParcel.readInt();
    s = paramParcel.readInt();
    t = paramParcel.readInt();
    u = paramParcel.readInt();
    v = ((byte[])M.i(paramParcel.createByteArray()));
  }
  
  public static a a(g0.z paramz)
  {
    int i = paramz.p();
    String str1 = d0.z.t(paramz.E(paramz.p(), e.a));
    String str2 = paramz.D(paramz.p());
    int j = paramz.p();
    int k = paramz.p();
    int m = paramz.p();
    int n = paramz.p();
    int i1 = paramz.p();
    byte[] arrayOfByte = new byte[i1];
    paramz.l(arrayOfByte, 0, i1);
    return new a(i, str1, str2, j, k, m, n, arrayOfByte);
  }
  
  public void D(w.b paramb)
  {
    paramb.J(v, o);
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
      if ((o != o) || (!p.equals(p)) || (!q.equals(q)) || (r != r) || (s != s) || (t != t) || (u != u) || (!Arrays.equals(v, v))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public int hashCode()
  {
    return (((((((527 + o) * 31 + p.hashCode()) * 31 + q.hashCode()) * 31 + r) * 31 + s) * 31 + t) * 31 + u) * 31 + Arrays.hashCode(v);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Picture: mimeType=");
    localStringBuilder.append(p);
    localStringBuilder.append(", description=");
    localStringBuilder.append(q);
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(o);
    paramParcel.writeString(p);
    paramParcel.writeString(q);
    paramParcel.writeInt(r);
    paramParcel.writeInt(s);
    paramParcel.writeInt(t);
    paramParcel.writeInt(u);
    paramParcel.writeByteArray(v);
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
 * Qualified Name:     R0.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */