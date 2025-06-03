package x0;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;

public final class a0
  implements Parcelable
{
  public static final Parcelable.Creator<a0> CREATOR = new a();
  public ArrayList<String> a;
  public ArrayList<String> b;
  public b[] c;
  public int d;
  public String e = null;
  public ArrayList<String> f = new ArrayList();
  public ArrayList<c> o = new ArrayList();
  public ArrayList<y.k> p;
  
  public a0() {}
  
  public a0(Parcel paramParcel)
  {
    a = paramParcel.createStringArrayList();
    b = paramParcel.createStringArrayList();
    c = ((b[])paramParcel.createTypedArray(b.CREATOR));
    d = paramParcel.readInt();
    e = paramParcel.readString();
    f = paramParcel.createStringArrayList();
    o = paramParcel.createTypedArrayList(c.CREATOR);
    p = paramParcel.createTypedArrayList(y.k.CREATOR);
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeStringList(a);
    paramParcel.writeStringList(b);
    paramParcel.writeTypedArray(c, paramInt);
    paramParcel.writeInt(d);
    paramParcel.writeString(e);
    paramParcel.writeStringList(f);
    paramParcel.writeTypedList(o);
    paramParcel.writeTypedList(p);
  }
  
  public final class a
    implements Parcelable.Creator<a0>
  {
    public final Object createFromParcel(Parcel paramParcel)
    {
      return new a0(paramParcel);
    }
    
    public final Object[] newArray(int paramInt)
    {
      return new a0[paramInt];
    }
  }
}

/* Location:
 * Qualified Name:     x0.a0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */