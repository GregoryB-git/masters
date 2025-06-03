package v4;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p4.a.b;
import v5.e0;
import x6.b;

public final class c
  implements a.b
{
  public static final Parcelable.Creator<c> CREATOR = new a();
  public final List<b> a;
  
  public c(ArrayList paramArrayList)
  {
    a = paramArrayList;
    boolean bool = paramArrayList.isEmpty();
    int i = 0;
    int j;
    if (bool)
    {
      j = i;
    }
    else
    {
      long l = get0b;
      for (int k = 1;; k++)
      {
        j = i;
        if (k >= paramArrayList.size()) {
          break;
        }
        if (geta < l)
        {
          j = 1;
          break;
        }
        l = getb;
      }
    }
    b.q(j ^ 0x1);
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (c.class == paramObject.getClass()))
    {
      paramObject = (c)paramObject;
      return a.equals(a);
    }
    return false;
  }
  
  public final int hashCode()
  {
    return a.hashCode();
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("SlowMotion: segments=");
    localStringBuilder.append(a);
    return localStringBuilder.toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeList(a);
  }
  
  public final class a
    implements Parcelable.Creator<c>
  {
    public final Object createFromParcel(Parcel paramParcel)
    {
      ArrayList localArrayList = new ArrayList();
      paramParcel.readList(localArrayList, c.b.class.getClassLoader());
      return new c(localArrayList);
    }
    
    public final Object[] newArray(int paramInt)
    {
      return new c[paramInt];
    }
  }
  
  public static final class b
    implements Parcelable
  {
    public static final Parcelable.Creator<b> CREATOR = new a();
    public final long a;
    public final long b;
    public final int c;
    
    public b(int paramInt, long paramLong1, long paramLong2)
    {
      boolean bool;
      if (paramLong1 < paramLong2) {
        bool = true;
      } else {
        bool = false;
      }
      b.q(bool);
      a = paramLong1;
      b = paramLong2;
      c = paramInt;
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
        if ((a != a) || (b != b) || (c != c)) {
          bool = false;
        }
        return bool;
      }
      return false;
    }
    
    public final int hashCode()
    {
      return Arrays.hashCode(new Object[] { Long.valueOf(a), Long.valueOf(b), Integer.valueOf(c) });
    }
    
    public final String toString()
    {
      return e0.m("Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", new Object[] { Long.valueOf(a), Long.valueOf(b), Integer.valueOf(c) });
    }
    
    public final void writeToParcel(Parcel paramParcel, int paramInt)
    {
      paramParcel.writeLong(a);
      paramParcel.writeLong(b);
      paramParcel.writeInt(c);
    }
    
    public final class a
      implements Parcelable.Creator<c.b>
    {
      public final Object createFromParcel(Parcel paramParcel)
      {
        long l1 = paramParcel.readLong();
        long l2 = paramParcel.readLong();
        return new c.b(paramParcel.readInt(), l1, l2);
      }
      
      public final Object[] newArray(int paramInt)
      {
        return new c.b[paramInt];
      }
    }
  }
}

/* Location:
 * Qualified Name:     v4.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */