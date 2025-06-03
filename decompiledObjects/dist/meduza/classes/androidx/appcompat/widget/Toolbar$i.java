package androidx.appcompat.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import n0.a;

public final class Toolbar$i
  extends a
{
  public static final Parcelable.Creator<i> CREATOR = new a();
  public int c;
  public boolean d;
  
  public Toolbar$i(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    super(paramParcel, paramClassLoader);
    c = paramParcel.readInt();
    boolean bool;
    if (paramParcel.readInt() != 0) {
      bool = true;
    } else {
      bool = false;
    }
    d = bool;
  }
  
  public Toolbar$i(Parcelable paramParcelable)
  {
    super(paramParcelable);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeParcelable(a, paramInt);
    paramParcel.writeInt(c);
    paramParcel.writeInt(d);
  }
  
  public final class a
    implements Parcelable.ClassLoaderCreator<Toolbar.i>
  {
    public final Object createFromParcel(Parcel paramParcel)
    {
      return new Toolbar.i(paramParcel, null);
    }
    
    public final Object createFromParcel(Parcel paramParcel, ClassLoader paramClassLoader)
    {
      return new Toolbar.i(paramParcel, paramClassLoader);
    }
    
    public final Object[] newArray(int paramInt)
    {
      return new Toolbar.i[paramInt];
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.Toolbar.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */