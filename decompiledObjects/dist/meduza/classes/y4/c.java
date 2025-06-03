package y4;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class c
  implements Comparable<c>, Parcelable
{
  public static final Parcelable.Creator<c> CREATOR = new a();
  public final int a;
  public final int b;
  public final int c;
  
  public c()
  {
    a = -1;
    b = -1;
    c = -1;
  }
  
  public c(Parcel paramParcel)
  {
    a = paramParcel.readInt();
    b = paramParcel.readInt();
    c = paramParcel.readInt();
  }
  
  public final int compareTo(Object paramObject)
  {
    paramObject = (c)paramObject;
    int i = a - a;
    int j = i;
    if (i == 0)
    {
      i = b - b;
      j = i;
      if (i == 0) {
        j = c - c;
      }
    }
    return j;
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
    if ((paramObject != null) && (c.class == paramObject.getClass()))
    {
      paramObject = (c)paramObject;
      if ((a != a) || (b != b) || (c != c)) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public final int hashCode()
  {
    return (a * 31 + b) * 31 + c;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(a);
    localStringBuilder.append(".");
    localStringBuilder.append(b);
    localStringBuilder.append(".");
    localStringBuilder.append(c);
    return localStringBuilder.toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(a);
    paramParcel.writeInt(b);
    paramParcel.writeInt(c);
  }
  
  public final class a
    implements Parcelable.Creator<c>
  {
    public final Object createFromParcel(Parcel paramParcel)
    {
      return new c(paramParcel);
    }
    
    public final Object[] newArray(int paramInt)
    {
      return new c[paramInt];
    }
  }
}

/* Location:
 * Qualified Name:     y4.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */