package h0;

import a3.f;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import d0.x.b;
import g0.M;
import java.util.Arrays;

public final class a
  implements x.b
{
  public static final Parcelable.Creator<a> CREATOR = new a();
  public final String o;
  public final byte[] p;
  public final int q;
  public final int r;
  
  public a(Parcel paramParcel)
  {
    o = ((String)M.i(paramParcel.readString()));
    p = ((byte[])M.i(paramParcel.createByteArray()));
    q = paramParcel.readInt();
    r = paramParcel.readInt();
  }
  
  public a(String paramString, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    o = paramString;
    p = paramArrayOfByte;
    q = paramInt1;
    r = paramInt2;
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
      if ((!o.equals(o)) || (!Arrays.equals(p, p)) || (q != q) || (r != r)) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public int hashCode()
  {
    return (((527 + o.hashCode()) * 31 + Arrays.hashCode(p)) * 31 + q) * 31 + r;
  }
  
  public String toString()
  {
    int i = r;
    String str;
    if (i != 1)
    {
      if (i != 23)
      {
        if (i != 67) {
          str = M.f1(p);
        } else {
          str = String.valueOf(f.g(p));
        }
      }
      else {
        str = String.valueOf(Float.intBitsToFloat(f.g(p)));
      }
    }
    else {
      str = M.H(p);
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("mdta: key=");
    localStringBuilder.append(o);
    localStringBuilder.append(", value=");
    localStringBuilder.append(str);
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(o);
    paramParcel.writeByteArray(p);
    paramParcel.writeInt(q);
    paramParcel.writeInt(r);
  }
  
  public class a
    implements Parcelable.Creator
  {
    public a a(Parcel paramParcel)
    {
      return new a(paramParcel, null);
    }
    
    public a[] b(int paramInt)
    {
      return new a[paramInt];
    }
  }
}

/* Location:
 * Qualified Name:     h0.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */