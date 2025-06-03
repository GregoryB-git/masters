package androidx.appcompat.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import androidx.customview.view.AbsSavedState;
import z2;

class SearchView$SavedState
  extends AbsSavedState
{
  public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator()
  {
    public SearchView.SavedState createFromParcel(Parcel paramAnonymousParcel)
    {
      return new SearchView.SavedState(paramAnonymousParcel, null);
    }
    
    public SearchView.SavedState createFromParcel(Parcel paramAnonymousParcel, ClassLoader paramAnonymousClassLoader)
    {
      return new SearchView.SavedState(paramAnonymousParcel, paramAnonymousClassLoader);
    }
    
    public SearchView.SavedState[] newArray(int paramAnonymousInt)
    {
      return new SearchView.SavedState[paramAnonymousInt];
    }
  };
  public boolean isIconified;
  
  public SearchView$SavedState(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    super(paramParcel, paramClassLoader);
    isIconified = ((Boolean)paramParcel.readValue(null)).booleanValue();
  }
  
  public SearchView$SavedState(Parcelable paramParcelable)
  {
    super(paramParcelable);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = z2.t("SearchView.SavedState{");
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    localStringBuilder.append(" isIconified=");
    localStringBuilder.append(isIconified);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeValue(Boolean.valueOf(isIconified));
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.SearchView.SavedState
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */