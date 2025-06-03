package U0;

import a3.h;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import d0.x.b;

public final class a
  implements x.b
{
  public static final Parcelable.Creator<a> CREATOR = new a();
  public final long o;
  public final long p;
  public final long q;
  public final long r;
  public final long s;
  
  public a(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5)
  {
    o = paramLong1;
    p = paramLong2;
    q = paramLong3;
    r = paramLong4;
    s = paramLong5;
  }
  
  public a(Parcel paramParcel)
  {
    o = paramParcel.readLong();
    p = paramParcel.readLong();
    q = paramParcel.readLong();
    r = paramParcel.readLong();
    s = paramParcel.readLong();
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
    if ((paramObject != null) && (a.class == paramObject.getClass()))
    {
      paramObject = (a)paramObject;
      if ((o != o) || (p != p) || (q != q) || (r != r) || (s != s)) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public int hashCode()
  {
    return ((((527 + h.b(o)) * 31 + h.b(p)) * 31 + h.b(q)) * 31 + h.b(r)) * 31 + h.b(s);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Motion photo metadata: photoStartPosition=");
    localStringBuilder.append(o);
    localStringBuilder.append(", photoSize=");
    localStringBuilder.append(p);
    localStringBuilder.append(", photoPresentationTimestampUs=");
    localStringBuilder.append(q);
    localStringBuilder.append(", videoStartPosition=");
    localStringBuilder.append(r);
    localStringBuilder.append(", videoSize=");
    localStringBuilder.append(s);
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeLong(o);
    paramParcel.writeLong(p);
    paramParcel.writeLong(q);
    paramParcel.writeLong(r);
    paramParcel.writeLong(s);
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
 * Qualified Name:     U0.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */