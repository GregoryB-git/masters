package y1;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.View.BaseSavedState;

public final class e$k
  extends View.BaseSavedState
{
  public static final Parcelable.Creator<k> CREATOR = new a();
  public final boolean a;
  
  public e$k(Parcel paramParcel)
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
  
  public e$k(Parcelable paramParcelable, boolean paramBoolean)
  {
    super(paramParcelable);
    a = paramBoolean;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeByte(a);
  }
  
  public final class a
    implements Parcelable.Creator<e.k>
  {
    public final Object createFromParcel(Parcel paramParcel)
    {
      return new e.k(paramParcel);
    }
    
    public final Object[] newArray(int paramInt)
    {
      return new e.k[paramInt];
    }
  }
}

/* Location:
 * Qualified Name:     y1.e.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */