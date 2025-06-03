package v4;

import a0.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import f;
import java.util.Arrays;
import p4.a.b;
import v5.e0;

public final class a
  implements a.b
{
  public static final Parcelable.Creator<a> CREATOR = new a();
  public final String a;
  public final byte[] b;
  public final int c;
  public final int d;
  
  public a(Parcel paramParcel)
  {
    String str = paramParcel.readString();
    int i = e0.a;
    a = str;
    b = paramParcel.createByteArray();
    c = paramParcel.readInt();
    d = paramParcel.readInt();
  }
  
  public a(String paramString, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    a = paramString;
    b = paramArrayOfByte;
    c = paramInt1;
    d = paramInt2;
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
      if ((!a.equals(a)) || (!Arrays.equals(b, b)) || (c != c) || (d != d)) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public final int hashCode()
  {
    int i = j.e(a, 527, 31);
    return ((Arrays.hashCode(b) + i) * 31 + c) * 31 + d;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("mdta: key=");
    localStringBuilder.append(a);
    return localStringBuilder.toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(a);
    paramParcel.writeByteArray(b);
    paramParcel.writeInt(c);
    paramParcel.writeInt(d);
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
 * Qualified Name:     v4.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */