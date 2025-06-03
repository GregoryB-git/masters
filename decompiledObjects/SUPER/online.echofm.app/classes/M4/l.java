package M4;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

public class l
  implements Parcelable
{
  public static final Parcelable.Creator<l> CREATOR = new a();
  public long o;
  public long p;
  
  public l()
  {
    this(h(), a());
  }
  
  public l(long paramLong1, long paramLong2)
  {
    o = paramLong1;
    p = paramLong2;
  }
  
  public l(Parcel paramParcel)
  {
    this(paramParcel.readLong(), paramParcel.readLong());
  }
  
  public static long a()
  {
    return TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos());
  }
  
  public static l f(long paramLong)
  {
    paramLong = TimeUnit.MILLISECONDS.toMicros(paramLong);
    return new l(h() + (paramLong - a()), paramLong);
  }
  
  public static long h()
  {
    return TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
  }
  
  public long b()
  {
    return o + c();
  }
  
  public long c()
  {
    return d(new l());
  }
  
  public long d(l paraml)
  {
    return p - p;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public long e()
  {
    return o;
  }
  
  public void g()
  {
    o = h();
    p = a();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeLong(o);
    paramParcel.writeLong(p);
  }
  
  public class a
    implements Parcelable.Creator
  {
    public l a(Parcel paramParcel)
    {
      return new l(paramParcel, null);
    }
    
    public l[] b(int paramInt)
    {
      return new l[paramInt];
    }
  }
}

/* Location:
 * Qualified Name:     M4.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */