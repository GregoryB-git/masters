package t4;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;
import p4.a.b;
import v3.p0.a;

public final class c
  implements a.b
{
  public static final Parcelable.Creator<c> CREATOR = new a();
  public final byte[] a;
  public final String b;
  public final String c;
  
  public c(Parcel paramParcel)
  {
    byte[] arrayOfByte = paramParcel.createByteArray();
    arrayOfByte.getClass();
    a = arrayOfByte;
    b = paramParcel.readString();
    c = paramParcel.readString();
  }
  
  public c(byte[] paramArrayOfByte, String paramString1, String paramString2)
  {
    a = paramArrayOfByte;
    b = paramString1;
    c = paramString2;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (c.class == paramObject.getClass()))
    {
      paramObject = (c)paramObject;
      return Arrays.equals(a, a);
    }
    return false;
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(a);
  }
  
  public final void l(p0.a parama)
  {
    String str = b;
    if (str != null) {
      a = str;
    }
  }
  
  public final String toString()
  {
    return String.format("ICY: title=\"%s\", url=\"%s\", rawMetadata.length=\"%s\"", new Object[] { b, c, Integer.valueOf(a.length) });
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeByteArray(a);
    paramParcel.writeString(b);
    paramParcel.writeString(c);
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
 * Qualified Name:     t4.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */