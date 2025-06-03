package q4;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import f;
import g;
import p4.a.b;

public final class a
  implements a.b
{
  public static final Parcelable.Creator<a> CREATOR = new a();
  public final int a;
  public final String b;
  
  public a(int paramInt, String paramString)
  {
    a = paramInt;
    b = paramString;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("Ait(controlCode=");
    localStringBuilder.append(a);
    localStringBuilder.append(",url=");
    return g.f(localStringBuilder, b, ")");
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(b);
    paramParcel.writeInt(a);
  }
  
  public final class a
    implements Parcelable.Creator<a>
  {
    public final Object createFromParcel(Parcel paramParcel)
    {
      String str = paramParcel.readString();
      str.getClass();
      return new a(paramParcel.readInt(), str);
    }
    
    public final Object[] newArray(int paramInt)
    {
      return new a[paramInt];
    }
  }
}

/* Location:
 * Qualified Name:     q4.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */