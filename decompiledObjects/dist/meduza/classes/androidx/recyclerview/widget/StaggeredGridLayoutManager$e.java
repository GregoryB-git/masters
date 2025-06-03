package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.List;

public final class StaggeredGridLayoutManager$e
  implements Parcelable
{
  public static final Parcelable.Creator<e> CREATOR = new a();
  public int a;
  public int b;
  public int c;
  public int[] d;
  public int e;
  public int[] f;
  public List<StaggeredGridLayoutManager.d.a> o;
  public boolean p;
  public boolean q;
  public boolean r;
  
  public StaggeredGridLayoutManager$e() {}
  
  public StaggeredGridLayoutManager$e(Parcel paramParcel)
  {
    a = paramParcel.readInt();
    b = paramParcel.readInt();
    int i = paramParcel.readInt();
    c = i;
    int[] arrayOfInt;
    if (i > 0)
    {
      arrayOfInt = new int[i];
      d = arrayOfInt;
      paramParcel.readIntArray(arrayOfInt);
    }
    i = paramParcel.readInt();
    e = i;
    if (i > 0)
    {
      arrayOfInt = new int[i];
      f = arrayOfInt;
      paramParcel.readIntArray(arrayOfInt);
    }
    i = paramParcel.readInt();
    boolean bool1 = false;
    if (i == 1) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    p = bool2;
    if (paramParcel.readInt() == 1) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    q = bool2;
    boolean bool2 = bool1;
    if (paramParcel.readInt() == 1) {
      bool2 = true;
    }
    r = bool2;
    o = paramParcel.readArrayList(StaggeredGridLayoutManager.d.a.class.getClassLoader());
  }
  
  public StaggeredGridLayoutManager$e(e parame)
  {
    c = c;
    a = a;
    b = b;
    d = d;
    e = e;
    f = f;
    p = p;
    q = q;
    r = r;
    o = o;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(a);
    paramParcel.writeInt(b);
    paramParcel.writeInt(c);
    if (c > 0) {
      paramParcel.writeIntArray(d);
    }
    paramParcel.writeInt(e);
    if (e > 0) {
      paramParcel.writeIntArray(f);
    }
    paramParcel.writeInt(p);
    paramParcel.writeInt(q);
    paramParcel.writeInt(r);
    paramParcel.writeList(o);
  }
  
  public final class a
    implements Parcelable.Creator<StaggeredGridLayoutManager.e>
  {
    public final Object createFromParcel(Parcel paramParcel)
    {
      return new StaggeredGridLayoutManager.e(paramParcel);
    }
    
    public final Object[] newArray(int paramInt)
    {
      return new StaggeredGridLayoutManager.e[paramInt];
    }
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.StaggeredGridLayoutManager.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */