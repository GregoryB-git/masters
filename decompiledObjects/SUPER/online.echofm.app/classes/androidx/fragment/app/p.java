package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;

public final class p
  implements Parcelable
{
  public static final Parcelable.Creator<p> CREATOR = new a();
  public ArrayList o;
  public ArrayList p;
  public b[] q;
  public int r;
  public String s = null;
  public ArrayList t = new ArrayList();
  public ArrayList u = new ArrayList();
  public ArrayList v;
  
  public p() {}
  
  public p(Parcel paramParcel)
  {
    o = paramParcel.createTypedArrayList(s.CREATOR);
    p = paramParcel.createStringArrayList();
    q = ((b[])paramParcel.createTypedArray(b.CREATOR));
    r = paramParcel.readInt();
    s = paramParcel.readString();
    t = paramParcel.createStringArrayList();
    u = paramParcel.createTypedArrayList(Bundle.CREATOR);
    v = paramParcel.createTypedArrayList(n.m.CREATOR);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeTypedList(o);
    paramParcel.writeStringList(p);
    paramParcel.writeTypedArray(q, paramInt);
    paramParcel.writeInt(r);
    paramParcel.writeString(s);
    paramParcel.writeStringList(t);
    paramParcel.writeTypedList(u);
    paramParcel.writeTypedList(v);
  }
  
  public class a
    implements Parcelable.Creator
  {
    public p a(Parcel paramParcel)
    {
      return new p(paramParcel);
    }
    
    public p[] b(int paramInt)
    {
      return new p[paramInt];
    }
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.p
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */