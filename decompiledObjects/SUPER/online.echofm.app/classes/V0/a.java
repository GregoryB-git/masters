package V0;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import g0.M;
import g0.z;

public final class a
  extends b
{
  public static final Parcelable.Creator<a> CREATOR = new a();
  public final long o;
  public final long p;
  public final byte[] q;
  
  public a(long paramLong1, byte[] paramArrayOfByte, long paramLong2)
  {
    o = paramLong2;
    p = paramLong1;
    q = paramArrayOfByte;
  }
  
  public a(Parcel paramParcel)
  {
    o = paramParcel.readLong();
    p = paramParcel.readLong();
    q = ((byte[])M.i(paramParcel.createByteArray()));
  }
  
  public static a a(z paramz, int paramInt, long paramLong)
  {
    long l = paramz.I();
    paramInt -= 4;
    byte[] arrayOfByte = new byte[paramInt];
    paramz.l(arrayOfByte, 0, paramInt);
    return new a(l, arrayOfByte, paramLong);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("SCTE-35 PrivateCommand { ptsAdjustment=");
    localStringBuilder.append(o);
    localStringBuilder.append(", identifier= ");
    localStringBuilder.append(p);
    localStringBuilder.append(" }");
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeLong(o);
    paramParcel.writeLong(p);
    paramParcel.writeByteArray(q);
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
 * Qualified Name:     V0.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */