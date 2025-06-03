package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;

class RecyclerView$SavedState$1
  implements Parcelable.ClassLoaderCreator<RecyclerView.SavedState>
{
  public RecyclerView.SavedState createFromParcel(Parcel paramParcel)
  {
    return new RecyclerView.SavedState(paramParcel, null);
  }
  
  public RecyclerView.SavedState createFromParcel(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    return new RecyclerView.SavedState(paramParcel, paramClassLoader);
  }
  
  public RecyclerView.SavedState[] newArray(int paramInt)
  {
    return new RecyclerView.SavedState[paramInt];
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.RecyclerView.SavedState.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */