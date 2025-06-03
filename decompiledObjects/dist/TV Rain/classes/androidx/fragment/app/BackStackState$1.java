package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class BackStackState$1
  implements Parcelable.Creator<BackStackState>
{
  public BackStackState createFromParcel(Parcel paramParcel)
  {
    return new BackStackState(paramParcel);
  }
  
  public BackStackState[] newArray(int paramInt)
  {
    return new BackStackState[paramInt];
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.BackStackState.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */