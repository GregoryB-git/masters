package w4;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import v5.e0;

public final class a
  extends b
{
  public static final Parcelable.Creator<a> CREATOR = new a();
  public final long a;
  public final long b;
  public final byte[] c;
  
  public a(long paramLong1, byte[] paramArrayOfByte, long paramLong2)
  {
    a = paramLong2;
    b = paramLong1;
    c = paramArrayOfByte;
  }
  
  public a(Parcel paramParcel)
  {
    a = paramParcel.readLong();
    b = paramParcel.readLong();
    paramParcel = paramParcel.createByteArray();
    int i = e0.a;
    c = paramParcel;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeLong(a);
    paramParcel.writeLong(b);
    paramParcel.writeByteArray(c);
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
 * Qualified Name:     w4.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */