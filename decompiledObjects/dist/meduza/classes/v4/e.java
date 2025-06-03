package v4;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import f;
import p4.a.b;

public final class e
  implements a.b
{
  public static final Parcelable.Creator<e> CREATOR = new a();
  public final float a;
  public final int b;
  
  public e(float paramFloat, int paramInt)
  {
    a = paramFloat;
    b = paramInt;
  }
  
  public e(Parcel paramParcel)
  {
    a = paramParcel.readFloat();
    b = paramParcel.readInt();
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
    if ((paramObject != null) && (e.class == paramObject.getClass()))
    {
      paramObject = (e)paramObject;
      if ((a != a) || (b != b)) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public final int hashCode()
  {
    return (Float.valueOf(a).hashCode() + 527) * 31 + b;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("smta: captureFrameRate=");
    localStringBuilder.append(a);
    localStringBuilder.append(", svcTemporalLayerCount=");
    localStringBuilder.append(b);
    return localStringBuilder.toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeFloat(a);
    paramParcel.writeInt(b);
  }
  
  public final class a
    implements Parcelable.Creator<e>
  {
    public final Object createFromParcel(Parcel paramParcel)
    {
      return new e(paramParcel);
    }
    
    public final Object[] newArray(int paramInt)
    {
      return new e[paramInt];
    }
  }
}

/* Location:
 * Qualified Name:     v4.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */