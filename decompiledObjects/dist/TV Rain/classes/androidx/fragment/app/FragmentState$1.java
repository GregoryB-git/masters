package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class FragmentState$1
  implements Parcelable.Creator<FragmentState>
{
  public FragmentState createFromParcel(Parcel paramParcel)
  {
    return new FragmentState(paramParcel);
  }
  
  public FragmentState[] newArray(int paramInt)
  {
    return new FragmentState[paramInt];
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.FragmentState.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */