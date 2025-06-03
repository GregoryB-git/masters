package l;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.View.BaseSavedState;

public final class z$h
  extends View.BaseSavedState
{
  public static final Parcelable.Creator<h> CREATOR = new a();
  public boolean a;
  
  public z$h(Parcel paramParcel)
  {
    super(paramParcel);
    boolean bool;
    if (paramParcel.readByte() != 0) {
      bool = true;
    } else {
      bool = false;
    }
    a = bool;
  }
  
  public z$h(Parcelable paramParcelable)
  {
    super(paramParcelable);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeByte((byte)a);
  }
  
  public final class a
    implements Parcelable.Creator<z.h>
  {
    public final Object createFromParcel(Parcel paramParcel)
    {
      return new z.h(paramParcel);
    }
    
    public final Object[] newArray(int paramInt)
    {
      return new z.h[paramInt];
    }
  }
}

/* Location:
 * Qualified Name:     l.z.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */