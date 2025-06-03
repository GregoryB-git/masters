package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class n$m
  implements Parcelable
{
  public static final Parcelable.Creator<m> CREATOR = new a();
  public String o;
  public int p;
  
  public n$m(Parcel paramParcel)
  {
    o = paramParcel.readString();
    p = paramParcel.readInt();
  }
  
  public n$m(String paramString, int paramInt)
  {
    o = paramString;
    p = paramInt;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(o);
    paramParcel.writeInt(p);
  }
  
  public class a
    implements Parcelable.Creator
  {
    public n.m a(Parcel paramParcel)
    {
      return new n.m(paramParcel);
    }
    
    public n.m[] b(int paramInt)
    {
      return new n.m[paramInt];
    }
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.n.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */