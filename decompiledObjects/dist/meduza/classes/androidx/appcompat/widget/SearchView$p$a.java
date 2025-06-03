package androidx.appcompat.widget;

import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;

public final class SearchView$p$a
  implements Parcelable.ClassLoaderCreator<SearchView.p>
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    return new SearchView.p(paramParcel, null);
  }
  
  public final Object createFromParcel(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    return new SearchView.p(paramParcel, paramClassLoader);
  }
  
  public final Object[] newArray(int paramInt)
  {
    return new SearchView.p[paramInt];
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.SearchView.p.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */