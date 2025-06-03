package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class FragmentManager$LaunchedFragmentInfo$1
  implements Parcelable.Creator<FragmentManager.LaunchedFragmentInfo>
{
  public FragmentManager.LaunchedFragmentInfo createFromParcel(Parcel paramParcel)
  {
    return new FragmentManager.LaunchedFragmentInfo(paramParcel);
  }
  
  public FragmentManager.LaunchedFragmentInfo[] newArray(int paramInt)
  {
    return new FragmentManager.LaunchedFragmentInfo[paramInt];
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.FragmentManager.LaunchedFragmentInfo.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */