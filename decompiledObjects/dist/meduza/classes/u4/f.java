package u4;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;
import v5.e0;

public final class f
  extends h
{
  public static final Parcelable.Creator<f> CREATOR = new a();
  public final String b;
  public final String c;
  public final String d;
  public final byte[] e;
  
  public f(Parcel paramParcel)
  {
    super("GEOB");
    String str = paramParcel.readString();
    int i = e0.a;
    b = str;
    c = paramParcel.readString();
    d = paramParcel.readString();
    e = paramParcel.createByteArray();
  }
  
  public f(String paramString1, String paramString2, String paramString3, byte[] paramArrayOfByte)
  {
    super("GEOB");
    b = paramString1;
    c = paramString2;
    d = paramString3;
    e = paramArrayOfByte;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (f.class == paramObject.getClass()))
    {
      paramObject = (f)paramObject;
      if ((!e0.a(b, b)) || (!e0.a(c, c)) || (!e0.a(d, d)) || (!Arrays.equals(e, e))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public final int hashCode()
  {
    String str = b;
    int i = 0;
    int j;
    if (str != null) {
      j = str.hashCode();
    } else {
      j = 0;
    }
    str = c;
    int k;
    if (str != null) {
      k = str.hashCode();
    } else {
      k = 0;
    }
    str = d;
    if (str != null) {
      i = str.hashCode();
    }
    return Arrays.hashCode(e) + (((527 + j) * 31 + k) * 31 + i) * 31;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(a);
    localStringBuilder.append(": mimeType=");
    localStringBuilder.append(b);
    localStringBuilder.append(", filename=");
    localStringBuilder.append(c);
    localStringBuilder.append(", description=");
    localStringBuilder.append(d);
    return localStringBuilder.toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(b);
    paramParcel.writeString(c);
    paramParcel.writeString(d);
    paramParcel.writeByteArray(e);
  }
  
  public final class a
    implements Parcelable.Creator<f>
  {
    public final Object createFromParcel(Parcel paramParcel)
    {
      return new f(paramParcel);
    }
    
    public final Object[] newArray(int paramInt)
    {
      return new f[paramInt];
    }
  }
}

/* Location:
 * Qualified Name:     u4.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */