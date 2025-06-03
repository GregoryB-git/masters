package androidx.appcompat.widget;

import N.a;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;

public class Toolbar$g
  extends a
{
  public static final Parcelable.Creator<g> CREATOR = new a();
  public int q;
  public boolean r;
  
  public Toolbar$g(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    super(paramParcel, paramClassLoader);
    q = paramParcel.readInt();
    boolean bool;
    if (paramParcel.readInt() != 0) {
      bool = true;
    } else {
      bool = false;
    }
    r = bool;
  }
  
  public Toolbar$g(Parcelable paramParcelable)
  {
    super(paramParcelable);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeInt(q);
    paramParcel.writeInt(r);
  }
  
  public class a
    implements Parcelable.ClassLoaderCreator
  {
    public Toolbar.g a(Parcel paramParcel)
    {
      return new Toolbar.g(paramParcel, null);
    }
    
    public Toolbar.g b(Parcel paramParcel, ClassLoader paramClassLoader)
    {
      return new Toolbar.g(paramParcel, paramClassLoader);
    }
    
    public Toolbar.g[] c(int paramInt)
    {
      return new Toolbar.g[paramInt];
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.Toolbar.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */