package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

@SuppressLint({"BanParcelableUsage"})
class ActionMenuPresenter$SavedState
  implements Parcelable
{
  public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator()
  {
    public ActionMenuPresenter.SavedState createFromParcel(Parcel paramAnonymousParcel)
    {
      return new ActionMenuPresenter.SavedState(paramAnonymousParcel);
    }
    
    public ActionMenuPresenter.SavedState[] newArray(int paramAnonymousInt)
    {
      return new ActionMenuPresenter.SavedState[paramAnonymousInt];
    }
  };
  public int openSubMenuId;
  
  public ActionMenuPresenter$SavedState() {}
  
  public ActionMenuPresenter$SavedState(Parcel paramParcel)
  {
    openSubMenuId = paramParcel.readInt();
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(openSubMenuId);
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.ActionMenuPresenter.SavedState
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */