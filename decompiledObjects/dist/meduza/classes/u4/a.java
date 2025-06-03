package u4;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;
import v3.p0.a;
import v5.e0;

public final class a
  extends h
{
  public static final Parcelable.Creator<a> CREATOR = new a();
  public final String b;
  public final String c;
  public final int d;
  public final byte[] e;
  
  public a(int paramInt, String paramString1, String paramString2, byte[] paramArrayOfByte)
  {
    super("APIC");
    b = paramString1;
    c = paramString2;
    d = paramInt;
    e = paramArrayOfByte;
  }
  
  public a(Parcel paramParcel)
  {
    super("APIC");
    String str = paramParcel.readString();
    int i = e0.a;
    b = str;
    c = paramParcel.readString();
    d = paramParcel.readInt();
    e = paramParcel.createByteArray();
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
      if ((d != d) || (!e0.a(b, b)) || (!e0.a(c, c)) || (!Arrays.equals(e, e))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public final int hashCode()
  {
    int i = d;
    String str = b;
    int j = 0;
    int k;
    if (str != null) {
      k = str.hashCode();
    } else {
      k = 0;
    }
    str = c;
    if (str != null) {
      j = str.hashCode();
    }
    return Arrays.hashCode(e) + (((527 + i) * 31 + k) * 31 + j) * 31;
  }
  
  public final void l(p0.a parama)
  {
    parama.a(e, d);
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(a);
    localStringBuilder.append(": mimeType=");
    localStringBuilder.append(b);
    localStringBuilder.append(", description=");
    localStringBuilder.append(c);
    return localStringBuilder.toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(b);
    paramParcel.writeString(c);
    paramParcel.writeInt(d);
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
 * Qualified Name:     u4.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */