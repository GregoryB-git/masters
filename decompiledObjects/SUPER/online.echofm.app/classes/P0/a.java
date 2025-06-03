package P0;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import d0.x.b;

public final class a
  implements x.b
{
  public static final Parcelable.Creator<a> CREATOR = new a();
  public final int o;
  public final String p;
  
  public a(int paramInt, String paramString)
  {
    o = paramInt;
    p = paramString;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Ait(controlCode=");
    localStringBuilder.append(o);
    localStringBuilder.append(",url=");
    localStringBuilder.append(p);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(p);
    paramParcel.writeInt(o);
  }
  
  public class a
    implements Parcelable.Creator
  {
    public a a(Parcel paramParcel)
    {
      String str = (String)g0.a.e(paramParcel.readString());
      return new a(paramParcel.readInt(), str);
    }
    
    public a[] b(int paramInt)
    {
      return new a[paramInt];
    }
  }
}

/* Location:
 * Qualified Name:     P0.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */