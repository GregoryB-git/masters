package u4;

import a0.j;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;

public final class b
  extends h
{
  public static final Parcelable.Creator<b> CREATOR = new a();
  public final byte[] b;
  
  public b(Parcel paramParcel)
  {
    super(str);
    b = paramParcel.createByteArray();
  }
  
  public b(String paramString, byte[] paramArrayOfByte)
  {
    super(paramString);
    b = paramArrayOfByte;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (b.class == paramObject.getClass()))
    {
      paramObject = (b)paramObject;
      if ((!a.equals(a)) || (!Arrays.equals(b, b))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public final int hashCode()
  {
    int i = j.e(a, 527, 31);
    return Arrays.hashCode(b) + i;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(a);
    paramParcel.writeByteArray(b);
  }
  
  public final class a
    implements Parcelable.Creator<b>
  {
    public final Object createFromParcel(Parcel paramParcel)
    {
      return new b(paramParcel);
    }
    
    public final Object[] newArray(int paramInt)
    {
      return new b[paramInt];
    }
  }
}

/* Location:
 * Qualified Name:     u4.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */