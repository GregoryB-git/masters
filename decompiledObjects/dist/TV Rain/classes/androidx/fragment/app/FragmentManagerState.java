package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
final class FragmentManagerState
  implements Parcelable
{
  public static final Parcelable.Creator<FragmentManagerState> CREATOR = new Parcelable.Creator()
  {
    public FragmentManagerState createFromParcel(Parcel paramAnonymousParcel)
    {
      return new FragmentManagerState(paramAnonymousParcel);
    }
    
    public FragmentManagerState[] newArray(int paramAnonymousInt)
    {
      return new FragmentManagerState[paramAnonymousInt];
    }
  };
  public ArrayList<FragmentState> mActive;
  public ArrayList<String> mAdded;
  public BackStackState[] mBackStack;
  public int mBackStackIndex;
  public ArrayList<FragmentManager.LaunchedFragmentInfo> mLaunchedFragments;
  public String mPrimaryNavActiveWho = null;
  public ArrayList<String> mResultKeys = new ArrayList();
  public ArrayList<Bundle> mResults = new ArrayList();
  
  public FragmentManagerState() {}
  
  public FragmentManagerState(Parcel paramParcel)
  {
    mActive = paramParcel.createTypedArrayList(FragmentState.CREATOR);
    mAdded = paramParcel.createStringArrayList();
    mBackStack = ((BackStackState[])paramParcel.createTypedArray(BackStackState.CREATOR));
    mBackStackIndex = paramParcel.readInt();
    mPrimaryNavActiveWho = paramParcel.readString();
    mResultKeys = paramParcel.createStringArrayList();
    mResults = paramParcel.createTypedArrayList(Bundle.CREATOR);
    mLaunchedFragments = paramParcel.createTypedArrayList(FragmentManager.LaunchedFragmentInfo.CREATOR);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeTypedList(mActive);
    paramParcel.writeStringList(mAdded);
    paramParcel.writeTypedArray(mBackStack, paramInt);
    paramParcel.writeInt(mBackStackIndex);
    paramParcel.writeString(mPrimaryNavActiveWho);
    paramParcel.writeStringList(mResultKeys);
    paramParcel.writeTypedList(mResults);
    paramParcel.writeTypedList(mLaunchedFragments);
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.FragmentManagerState
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */