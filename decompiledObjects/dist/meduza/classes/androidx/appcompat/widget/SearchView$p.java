package androidx.appcompat.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import f;
import n0.a;

public final class SearchView$p
  extends a
{
  public static final Parcelable.Creator<p> CREATOR = new a();
  public boolean c;
  
  public SearchView$p(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    super(paramParcel, paramClassLoader);
    c = ((Boolean)paramParcel.readValue(null)).booleanValue();
  }
  
  public SearchView$p(Parcelable paramParcelable)
  {
    super(paramParcelable);
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("SearchView.SavedState{");
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    localStringBuilder.append(" isIconified=");
    localStringBuilder.append(c);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeParcelable(a, paramInt);
    paramParcel.writeValue(Boolean.valueOf(c));
  }
  
  public final class a
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
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.SearchView.p
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */