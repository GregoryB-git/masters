package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import androidx.annotation.RestrictTo;
import androidx.customview.view.AbsSavedState;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
public class RecyclerView$SavedState
  extends AbsSavedState
{
  public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator()
  {
    public RecyclerView.SavedState createFromParcel(Parcel paramAnonymousParcel)
    {
      return new RecyclerView.SavedState(paramAnonymousParcel, null);
    }
    
    public RecyclerView.SavedState createFromParcel(Parcel paramAnonymousParcel, ClassLoader paramAnonymousClassLoader)
    {
      return new RecyclerView.SavedState(paramAnonymousParcel, paramAnonymousClassLoader);
    }
    
    public RecyclerView.SavedState[] newArray(int paramAnonymousInt)
    {
      return new RecyclerView.SavedState[paramAnonymousInt];
    }
  };
  public Parcelable mLayoutState;
  
  public RecyclerView$SavedState(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    super(paramParcel, paramClassLoader);
    if (paramClassLoader == null) {
      paramClassLoader = RecyclerView.LayoutManager.class.getClassLoader();
    }
    mLayoutState = paramParcel.readParcelable(paramClassLoader);
  }
  
  public RecyclerView$SavedState(Parcelable paramParcelable)
  {
    super(paramParcelable);
  }
  
  public void copyFrom(SavedState paramSavedState)
  {
    mLayoutState = mLayoutState;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeParcelable(mLayoutState, 0);
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.RecyclerView.SavedState
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */