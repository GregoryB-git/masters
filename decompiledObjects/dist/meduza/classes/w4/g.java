package w4;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import v5.u;

public final class g
  extends b
{
  public static final Parcelable.Creator<g> CREATOR = new a();
  public final long a;
  public final long b;
  
  public g(long paramLong1, long paramLong2)
  {
    a = paramLong1;
    b = paramLong2;
  }
  
  public static long a(long paramLong, u paramu)
  {
    long l = paramu.v();
    if ((0x80 & l) != 0L) {
      paramLong = 0x1FFFFFFFF & ((l & 1L) << 32 | paramu.w()) + paramLong;
    } else {
      paramLong = -9223372036854775807L;
    }
    return paramLong;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeLong(a);
    paramParcel.writeLong(b);
  }
  
  public final class a
    implements Parcelable.Creator<g>
  {
    public final Object createFromParcel(Parcel paramParcel)
    {
      return new g(paramParcel.readLong(), paramParcel.readLong());
    }
    
    public final Object[] newArray(int paramInt)
    {
      return new g[paramInt];
    }
  }
}

/* Location:
 * Qualified Name:     w4.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */