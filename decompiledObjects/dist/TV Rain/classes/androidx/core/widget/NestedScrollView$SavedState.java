package androidx.core.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.View.BaseSavedState;
import androidx.annotation.NonNull;
import z2;

class NestedScrollView$SavedState
  extends View.BaseSavedState
{
  public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator()
  {
    public NestedScrollView.SavedState createFromParcel(Parcel paramAnonymousParcel)
    {
      return new NestedScrollView.SavedState(paramAnonymousParcel);
    }
    
    public NestedScrollView.SavedState[] newArray(int paramAnonymousInt)
    {
      return new NestedScrollView.SavedState[paramAnonymousInt];
    }
  };
  public int scrollPosition;
  
  public NestedScrollView$SavedState(Parcel paramParcel)
  {
    super(paramParcel);
    scrollPosition = paramParcel.readInt();
  }
  
  public NestedScrollView$SavedState(Parcelable paramParcelable)
  {
    super(paramParcelable);
  }
  
  @NonNull
  public String toString()
  {
    StringBuilder localStringBuilder = z2.t("HorizontalScrollView.SavedState{");
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    localStringBuilder.append(" scrollPosition=");
    return z2.q(localStringBuilder, scrollPosition, "}");
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeInt(scrollPosition);
  }
}

/* Location:
 * Qualified Name:     androidx.core.widget.NestedScrollView.SavedState
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */