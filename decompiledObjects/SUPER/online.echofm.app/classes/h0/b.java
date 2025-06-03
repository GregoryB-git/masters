package h0;

import a3.c;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import d0.x.b;
import g0.a;

public final class b
  implements x.b
{
  public static final Parcelable.Creator<b> CREATOR = new a();
  public final float o;
  public final float p;
  
  public b(float paramFloat1, float paramFloat2)
  {
    boolean bool;
    if ((paramFloat1 >= -90.0F) && (paramFloat1 <= 90.0F) && (paramFloat2 >= -180.0F) && (paramFloat2 <= 180.0F)) {
      bool = true;
    } else {
      bool = false;
    }
    a.b(bool, "Invalid latitude or longitude");
    o = paramFloat1;
    p = paramFloat2;
  }
  
  public b(Parcel paramParcel)
  {
    o = paramParcel.readFloat();
    p = paramParcel.readFloat();
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
      if ((o != o) || (p != p)) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public int hashCode()
  {
    return (527 + c.a(o)) * 31 + c.a(p);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("xyz: latitude=");
    localStringBuilder.append(o);
    localStringBuilder.append(", longitude=");
    localStringBuilder.append(p);
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeFloat(o);
    paramParcel.writeFloat(p);
  }
  
  public class a
    implements Parcelable.Creator
  {
    public b a(Parcel paramParcel)
    {
      return new b(paramParcel, null);
    }
    
    public b[] b(int paramInt)
    {
      return new b[paramInt];
    }
  }
}

/* Location:
 * Qualified Name:     h0.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */