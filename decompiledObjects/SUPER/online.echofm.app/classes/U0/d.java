package U0;

import a3.c;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import d0.x.b;

public final class d
  implements x.b
{
  public static final Parcelable.Creator<d> CREATOR = new a();
  public final float o;
  public final int p;
  
  public d(float paramFloat, int paramInt)
  {
    o = paramFloat;
    p = paramInt;
  }
  
  public d(Parcel paramParcel)
  {
    o = paramParcel.readFloat();
    p = paramParcel.readInt();
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
    if ((paramObject != null) && (d.class == paramObject.getClass()))
    {
      paramObject = (d)paramObject;
      if ((o != o) || (p != p)) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public int hashCode()
  {
    return (527 + c.a(o)) * 31 + p;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("smta: captureFrameRate=");
    localStringBuilder.append(o);
    localStringBuilder.append(", svcTemporalLayerCount=");
    localStringBuilder.append(p);
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeFloat(o);
    paramParcel.writeInt(p);
  }
  
  public class a
    implements Parcelable.Creator
  {
    public d a(Parcel paramParcel)
    {
      return new d(paramParcel, null);
    }
    
    public d[] b(int paramInt)
    {
      return new d[paramInt];
    }
  }
}

/* Location:
 * Qualified Name:     U0.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */