package h0;

import a3.h;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import d0.x.b;

public final class c
  implements x.b
{
  public static final Parcelable.Creator<c> CREATOR = new a();
  public final long o;
  public final long p;
  public final long q;
  
  public c(long paramLong1, long paramLong2, long paramLong3)
  {
    o = paramLong1;
    p = paramLong2;
    q = paramLong3;
  }
  
  public c(Parcel paramParcel)
  {
    o = paramParcel.readLong();
    p = paramParcel.readLong();
    q = paramParcel.readLong();
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof c)) {
      return false;
    }
    paramObject = (c)paramObject;
    if ((o != o) || (p != p) || (q != q)) {
      bool = false;
    }
    return bool;
  }
  
  public int hashCode()
  {
    return ((527 + h.b(o)) * 31 + h.b(p)) * 31 + h.b(q);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Mp4Timestamp: creation time=");
    localStringBuilder.append(o);
    localStringBuilder.append(", modification time=");
    localStringBuilder.append(p);
    localStringBuilder.append(", timescale=");
    localStringBuilder.append(q);
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeLong(o);
    paramParcel.writeLong(p);
    paramParcel.writeLong(q);
  }
  
  public class a
    implements Parcelable.Creator
  {
    public c a(Parcel paramParcel)
    {
      return new c(paramParcel, null);
    }
    
    public c[] b(int paramInt)
    {
      return new c[paramInt];
    }
  }
}

/* Location:
 * Qualified Name:     h0.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */