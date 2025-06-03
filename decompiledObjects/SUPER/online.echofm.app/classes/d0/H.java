package d0;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import g0.M;

public final class H
  implements Comparable, Parcelable
{
  public static final Parcelable.Creator<H> CREATOR = new a();
  public static final String r = M.w0(0);
  public static final String s = M.w0(1);
  public static final String t = M.w0(2);
  public final int o;
  public final int p;
  public final int q;
  
  public H(int paramInt1, int paramInt2, int paramInt3)
  {
    o = paramInt1;
    p = paramInt2;
    q = paramInt3;
  }
  
  public H(Parcel paramParcel)
  {
    o = paramParcel.readInt();
    p = paramParcel.readInt();
    q = paramParcel.readInt();
  }
  
  public int c(H paramH)
  {
    int i = o - o;
    int j = i;
    if (i == 0)
    {
      i = p - p;
      j = i;
      if (i == 0) {
        j = q - q;
      }
    }
    return j;
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
    if ((paramObject != null) && (H.class == paramObject.getClass()))
    {
      paramObject = (H)paramObject;
      if ((o != o) || (p != p) || (q != q)) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public int hashCode()
  {
    return (o * 31 + p) * 31 + q;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(o);
    localStringBuilder.append(".");
    localStringBuilder.append(p);
    localStringBuilder.append(".");
    localStringBuilder.append(q);
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(o);
    paramParcel.writeInt(p);
    paramParcel.writeInt(q);
  }
  
  public class a
    implements Parcelable.Creator
  {
    public H a(Parcel paramParcel)
    {
      return new H(paramParcel);
    }
    
    public H[] b(int paramInt)
    {
      return new H[paramInt];
    }
  }
}

/* Location:
 * Qualified Name:     d0.H
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */