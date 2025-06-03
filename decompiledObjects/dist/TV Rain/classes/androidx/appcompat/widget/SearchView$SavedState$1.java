package androidx.appcompat.widget;

import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;

class SearchView$SavedState$1
  implements Parcelable.ClassLoaderCreator<SearchView.SavedState>
{
  public SearchView.SavedState createFromParcel(Parcel paramParcel)
  {
    return new SearchView.SavedState(paramParcel, null);
  }
  
  public SearchView.SavedState createFromParcel(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    return new SearchView.SavedState(paramParcel, paramClassLoader);
  }
  
  public SearchView.SavedState[] newArray(int paramInt)
  {
    return new SearchView.SavedState[paramInt];
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.SearchView.SavedState.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */