package U0;

import W2.k;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import d0.x.b;
import g0.M;
import g0.a;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public final class b
  implements x.b
{
  public static final Parcelable.Creator<b> CREATOR = new a();
  public final List o;
  
  public b(List paramList)
  {
    o = paramList;
    a.a(a(paramList) ^ true);
  }
  
  public static boolean a(List paramList)
  {
    if (paramList.isEmpty()) {
      return false;
    }
    long l = get0p;
    for (int i = 1; i < paramList.size(); i++)
    {
      if (geto < l) {
        return true;
      }
      l = getp;
    }
    return false;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (b.class == paramObject.getClass()))
    {
      paramObject = (b)paramObject;
      return o.equals(o);
    }
    return false;
  }
  
  public int hashCode()
  {
    return o.hashCode();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("SlowMotion: segments=");
    localStringBuilder.append(o);
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeList(o);
  }
  
  public class a
    implements Parcelable.Creator
  {
    public b a(Parcel paramParcel)
    {
      ArrayList localArrayList = new ArrayList();
      paramParcel.readList(localArrayList, b.b.class.getClassLoader());
      return new b(localArrayList);
    }
    
    public b[] b(int paramInt)
    {
      return new b[paramInt];
    }
  }
  
  public static final class b
    implements Parcelable
  {
    public static final Parcelable.Creator<b> CREATOR = new a();
    public static final Comparator r = new c();
    public final long o;
    public final long p;
    public final int q;
    
    public b(long paramLong1, long paramLong2, int paramInt)
    {
      boolean bool;
      if (paramLong1 < paramLong2) {
        bool = true;
      } else {
        bool = false;
      }
      a.a(bool);
      o = paramLong1;
      p = paramLong2;
      q = paramInt;
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
      if ((paramObject != null) && (b.class == paramObject.getClass()))
      {
        paramObject = (b)paramObject;
        if ((o != o) || (p != p) || (q != q)) {
          bool = false;
        }
        return bool;
      }
      return false;
    }
    
    public int hashCode()
    {
      return k.b(new Object[] { Long.valueOf(o), Long.valueOf(p), Integer.valueOf(q) });
    }
    
    public String toString()
    {
      return M.G("Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", new Object[] { Long.valueOf(o), Long.valueOf(p), Integer.valueOf(q) });
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      paramParcel.writeLong(o);
      paramParcel.writeLong(p);
      paramParcel.writeInt(q);
    }
    
    public class a
      implements Parcelable.Creator
    {
      public b.b a(Parcel paramParcel)
      {
        return new b.b(paramParcel.readLong(), paramParcel.readLong(), paramParcel.readInt());
      }
      
      public b.b[] b(int paramInt)
      {
        return new b.b[paramInt];
      }
    }
  }
}

/* Location:
 * Qualified Name:     U0.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */