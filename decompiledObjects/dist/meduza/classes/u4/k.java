package u4;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;
import v5.e0;

public final class k
  extends h
{
  public static final Parcelable.Creator<k> CREATOR = new a();
  public final String b;
  public final byte[] c;
  
  public k(Parcel paramParcel)
  {
    super("PRIV");
    String str = paramParcel.readString();
    int i = e0.a;
    b = str;
    c = paramParcel.createByteArray();
  }
  
  public k(String paramString, byte[] paramArrayOfByte)
  {
    super("PRIV");
    b = paramString;
    c = paramArrayOfByte;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (k.class == paramObject.getClass()))
    {
      paramObject = (k)paramObject;
      if ((!e0.a(b, b)) || (!Arrays.equals(c, c))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public final int hashCode()
  {
    String str = b;
    int i;
    if (str != null) {
      i = str.hashCode();
    } else {
      i = 0;
    }
    return Arrays.hashCode(c) + (527 + i) * 31;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(a);
    localStringBuilder.append(": owner=");
    localStringBuilder.append(b);
    return localStringBuilder.toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(b);
    paramParcel.writeByteArray(c);
  }
  
  public final class a
    implements Parcelable.Creator<k>
  {
    public final Object createFromParcel(Parcel paramParcel)
    {
      return new k(paramParcel);
    }
    
    public final Object[] newArray(int paramInt)
    {
      return new k[paramInt];
    }
  }
}

/* Location:
 * Qualified Name:     u4.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */