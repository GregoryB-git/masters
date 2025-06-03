package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.View.BaseSavedState;
import androidx.annotation.NonNull;
import z2;

class FragmentTabHost$SavedState
  extends View.BaseSavedState
{
  public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator()
  {
    public FragmentTabHost.SavedState createFromParcel(Parcel paramAnonymousParcel)
    {
      return new FragmentTabHost.SavedState(paramAnonymousParcel);
    }
    
    public FragmentTabHost.SavedState[] newArray(int paramAnonymousInt)
    {
      return new FragmentTabHost.SavedState[paramAnonymousInt];
    }
  };
  public String curTab;
  
  public FragmentTabHost$SavedState(Parcel paramParcel)
  {
    super(paramParcel);
    curTab = paramParcel.readString();
  }
  
  public FragmentTabHost$SavedState(Parcelable paramParcelable)
  {
    super(paramParcelable);
  }
  
  @NonNull
  public String toString()
  {
    StringBuilder localStringBuilder = z2.t("FragmentTabHost.SavedState{");
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    localStringBuilder.append(" curTab=");
    return z2.s(localStringBuilder, curTab, "}");
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeString(curTab);
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.FragmentTabHost.SavedState
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */