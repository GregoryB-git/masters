package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;

public final class RecyclerView$r$a
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

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.RecyclerView.r.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */