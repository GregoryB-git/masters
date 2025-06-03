package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import n0.a;

public final class RecyclerView$r
  extends a
{
  public static final Parcelable.Creator<r> CREATOR = new a();
  public Parcelable c;
  
  public RecyclerView$r(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    super(paramParcel, paramClassLoader);
    if (paramClassLoader == null) {
      paramClassLoader = RecyclerView.j.class.getClassLoader();
    }
    c = paramParcel.readParcelable(paramClassLoader);
  }
  
  public RecyclerView$r(Parcelable paramParcelable)
  {
    super(paramParcelable);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeParcelable(a, paramInt);
    paramParcel.writeParcelable(c, 0);
  }
  
  public final class a
    implements Parcelable.ClassLoaderCreator<RecyclerView.r>
  {
    public final Object createFromParcel(Parcel paramParcel)
    {
      return new RecyclerView.r(paramParcel, null);
    }
    
    public final Object createFromParcel(Parcel paramParcel, ClassLoader paramClassLoader)
    {
      return new RecyclerView.r(paramParcel, paramClassLoader);
    }
    
    public final Object[] newArray(int paramInt)
    {
      return new RecyclerView.r[paramInt];
    }
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.RecyclerView.r
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */