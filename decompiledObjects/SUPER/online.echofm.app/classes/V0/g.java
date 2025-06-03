package V0;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import g0.E;
import g0.z;

public final class g
  extends b
{
  public static final Parcelable.Creator<g> CREATOR = new a();
  public final long o;
  public final long p;
  
  public g(long paramLong1, long paramLong2)
  {
    o = paramLong1;
    p = paramLong2;
  }
  
  public static g a(z paramz, long paramLong, E paramE)
  {
    paramLong = b(paramz, paramLong);
    return new g(paramLong, paramE.b(paramLong));
  }
  
  public static long b(z paramz, long paramLong)
  {
    long l = paramz.G();
    if ((0x80 & l) != 0L) {
      paramLong = 0x1FFFFFFFF & ((l & 1L) << 32 | paramz.I()) + paramLong;
    } else {
      paramLong = -9223372036854775807L;
    }
    return paramLong;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("SCTE-35 TimeSignalCommand { ptsTime=");
    localStringBuilder.append(o);
    localStringBuilder.append(", playbackPositionUs= ");
    localStringBuilder.append(p);
    localStringBuilder.append(" }");
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeLong(o);
    paramParcel.writeLong(p);
  }
  
  public class a
    implements Parcelable.Creator
  {
    public g a(Parcel paramParcel)
    {
      return new g(paramParcel.readLong(), paramParcel.readLong(), null);
    }
    
    public g[] b(int paramInt)
    {
      return new g[paramInt];
    }
  }
}

/* Location:
 * Qualified Name:     V0.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */