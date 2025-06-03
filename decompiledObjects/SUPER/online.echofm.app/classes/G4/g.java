package G4;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.concurrent.atomic.AtomicLong;

public class g
  implements Parcelable
{
  public static final Parcelable.Creator<g> CREATOR = new a();
  public final String o;
  public final AtomicLong p;
  
  public g(Parcel paramParcel)
  {
    o = paramParcel.readString();
    p = new AtomicLong(paramParcel.readLong());
  }
  
  public g(String paramString)
  {
    o = paramString;
    p = new AtomicLong(0L);
  }
  
  public long a()
  {
    return p.get();
  }
  
  public String b()
  {
    return o;
  }
  
  public void c(long paramLong)
  {
    p.addAndGet(paramLong);
  }
  
  public void d(long paramLong)
  {
    p.set(paramLong);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(o);
    paramParcel.writeLong(p.get());
  }
  
  public class a
    implements Parcelable.Creator
  {
    public g a(Parcel paramParcel)
    {
      return new g(paramParcel, null);
    }
    
    public g[] b(int paramInt)
    {
      return new g[paramInt];
    }
  }
}

/* Location:
 * Qualified Name:     G4.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */