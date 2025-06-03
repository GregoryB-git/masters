package v4;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import f;
import p4.a.b;

public final class b
  implements a.b
{
  public static final Parcelable.Creator<b> CREATOR = new a();
  public final long a;
  public final long b;
  public final long c;
  public final long d;
  public final long e;
  
  public b(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5)
  {
    a = paramLong1;
    b = paramLong2;
    c = paramLong3;
    d = paramLong4;
    e = paramLong5;
  }
  
  public b(Parcel paramParcel)
  {
    a = paramParcel.readLong();
    b = paramParcel.readLong();
    c = paramParcel.readLong();
    d = paramParcel.readLong();
    e = paramParcel.readLong();
  }
  
  public final int describeContents()
  {
    return 0;
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
      if ((a != a) || (b != b) || (c != c) || (d != d) || (e != e)) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public final int hashCode()
  {
    int i = x6.b.b0(a);
    int j = x6.b.b0(b);
    int k = x6.b.b0(c);
    int m = x6.b.b0(d);
    return x6.b.b0(e) + (m + (k + (j + (i + 527) * 31) * 31) * 31) * 31;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("Motion photo metadata: photoStartPosition=");
    localStringBuilder.append(a);
    localStringBuilder.append(", photoSize=");
    localStringBuilder.append(b);
    localStringBuilder.append(", photoPresentationTimestampUs=");
    localStringBuilder.append(c);
    localStringBuilder.append(", videoStartPosition=");
    localStringBuilder.append(d);
    localStringBuilder.append(", videoSize=");
    localStringBuilder.append(e);
    return localStringBuilder.toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeLong(a);
    paramParcel.writeLong(b);
    paramParcel.writeLong(c);
    paramParcel.writeLong(d);
    paramParcel.writeLong(e);
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
 * Qualified Name:     v4.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */