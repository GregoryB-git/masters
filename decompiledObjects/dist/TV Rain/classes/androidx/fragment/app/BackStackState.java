package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
final class BackStackState
  implements Parcelable
{
  public static final Parcelable.Creator<BackStackState> CREATOR = new Parcelable.Creator()
  {
    public BackStackState createFromParcel(Parcel paramAnonymousParcel)
    {
      return new BackStackState(paramAnonymousParcel);
    }
    
    public BackStackState[] newArray(int paramAnonymousInt)
    {
      return new BackStackState[paramAnonymousInt];
    }
  };
  private static final String TAG = "FragmentManager";
  public final int mBreadCrumbShortTitleRes;
  public final CharSequence mBreadCrumbShortTitleText;
  public final int mBreadCrumbTitleRes;
  public final CharSequence mBreadCrumbTitleText;
  public final int[] mCurrentMaxLifecycleStates;
  public final ArrayList<String> mFragmentWhos;
  public final int mIndex;
  public final String mName;
  public final int[] mOldMaxLifecycleStates;
  public final int[] mOps;
  public final boolean mReorderingAllowed;
  public final ArrayList<String> mSharedElementSourceNames;
  public final ArrayList<String> mSharedElementTargetNames;
  public final int mTransition;
  
  public BackStackState(Parcel paramParcel)
  {
    mOps = paramParcel.createIntArray();
    mFragmentWhos = paramParcel.createStringArrayList();
    mOldMaxLifecycleStates = paramParcel.createIntArray();
    mCurrentMaxLifecycleStates = paramParcel.createIntArray();
    mTransition = paramParcel.readInt();
    mName = paramParcel.readString();
    mIndex = paramParcel.readInt();
    mBreadCrumbTitleRes = paramParcel.readInt();
    mBreadCrumbTitleText = ((CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel));
    mBreadCrumbShortTitleRes = paramParcel.readInt();
    mBreadCrumbShortTitleText = ((CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel));
    mSharedElementSourceNames = paramParcel.createStringArrayList();
    mSharedElementTargetNames = paramParcel.createStringArrayList();
    boolean bool;
    if (paramParcel.readInt() != 0) {
      bool = true;
    } else {
      bool = false;
    }
    mReorderingAllowed = bool;
  }
  
  public BackStackState(BackStackRecord paramBackStackRecord)
  {
    int i = mOps.size();
    mOps = new int[i * 5];
    if (mAddToBackStack)
    {
      mFragmentWhos = new ArrayList(i);
      mOldMaxLifecycleStates = new int[i];
      mCurrentMaxLifecycleStates = new int[i];
      int j = 0;
      for (int k = 0; j < i; k++)
      {
        FragmentTransaction.Op localOp = (FragmentTransaction.Op)mOps.get(j);
        Object localObject = mOps;
        int m = k + 1;
        localObject[k] = mCmd;
        ArrayList localArrayList = mFragmentWhos;
        localObject = mFragment;
        if (localObject != null) {
          localObject = mWho;
        } else {
          localObject = null;
        }
        localArrayList.add(localObject);
        localObject = mOps;
        k = m + 1;
        localObject[m] = mEnterAnim;
        m = k + 1;
        localObject[k] = mExitAnim;
        k = m + 1;
        localObject[m] = mPopEnterAnim;
        localObject[k] = mPopExitAnim;
        mOldMaxLifecycleStates[j] = mOldMaxState.ordinal();
        mCurrentMaxLifecycleStates[j] = mCurrentMaxState.ordinal();
        j++;
      }
      mTransition = mTransition;
      mName = mName;
      mIndex = mIndex;
      mBreadCrumbTitleRes = mBreadCrumbTitleRes;
      mBreadCrumbTitleText = mBreadCrumbTitleText;
      mBreadCrumbShortTitleRes = mBreadCrumbShortTitleRes;
      mBreadCrumbShortTitleText = mBreadCrumbShortTitleText;
      mSharedElementSourceNames = mSharedElementSourceNames;
      mSharedElementTargetNames = mSharedElementTargetNames;
      mReorderingAllowed = mReorderingAllowed;
      return;
    }
    throw new IllegalStateException("Not on back stack");
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public BackStackRecord instantiate(FragmentManager paramFragmentManager)
  {
    BackStackRecord localBackStackRecord = new BackStackRecord(paramFragmentManager);
    int i = 0;
    int j = 0;
    while (i < mOps.length)
    {
      FragmentTransaction.Op localOp = new FragmentTransaction.Op();
      Object localObject = mOps;
      int k = i + 1;
      mCmd = localObject[i];
      if (FragmentManager.isLoggingEnabled(2))
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("Instantiate ");
        ((StringBuilder)localObject).append(localBackStackRecord);
        ((StringBuilder)localObject).append(" op #");
        ((StringBuilder)localObject).append(j);
        ((StringBuilder)localObject).append(" base fragment #");
        ((StringBuilder)localObject).append(mOps[k]);
        Log.v("FragmentManager", ((StringBuilder)localObject).toString());
      }
      localObject = (String)mFragmentWhos.get(j);
      if (localObject != null) {
        mFragment = paramFragmentManager.findActiveFragment((String)localObject);
      } else {
        mFragment = null;
      }
      mOldMaxState = androidx.lifecycle.Lifecycle.State.values()[mOldMaxLifecycleStates[j]];
      mCurrentMaxState = androidx.lifecycle.Lifecycle.State.values()[mCurrentMaxLifecycleStates[j]];
      localObject = mOps;
      i = k + 1;
      k = localObject[k];
      mEnterAnim = k;
      int m = i + 1;
      int n = localObject[i];
      mExitAnim = n;
      i = m + 1;
      m = localObject[m];
      mPopEnterAnim = m;
      int i1 = localObject[i];
      mPopExitAnim = i1;
      mEnterAnim = k;
      mExitAnim = n;
      mPopEnterAnim = m;
      mPopExitAnim = i1;
      localBackStackRecord.addOp(localOp);
      j++;
      i++;
    }
    mTransition = mTransition;
    mName = mName;
    mIndex = mIndex;
    mAddToBackStack = true;
    mBreadCrumbTitleRes = mBreadCrumbTitleRes;
    mBreadCrumbTitleText = mBreadCrumbTitleText;
    mBreadCrumbShortTitleRes = mBreadCrumbShortTitleRes;
    mBreadCrumbShortTitleText = mBreadCrumbShortTitleText;
    mSharedElementSourceNames = mSharedElementSourceNames;
    mSharedElementTargetNames = mSharedElementTargetNames;
    mReorderingAllowed = mReorderingAllowed;
    localBackStackRecord.bumpBackStackNesting(1);
    return localBackStackRecord;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeIntArray(mOps);
    paramParcel.writeStringList(mFragmentWhos);
    paramParcel.writeIntArray(mOldMaxLifecycleStates);
    paramParcel.writeIntArray(mCurrentMaxLifecycleStates);
    paramParcel.writeInt(mTransition);
    paramParcel.writeString(mName);
    paramParcel.writeInt(mIndex);
    paramParcel.writeInt(mBreadCrumbTitleRes);
    TextUtils.writeToParcel(mBreadCrumbTitleText, paramParcel, 0);
    paramParcel.writeInt(mBreadCrumbShortTitleRes);
    TextUtils.writeToParcel(mBreadCrumbShortTitleText, paramParcel, 0);
    paramParcel.writeStringList(mSharedElementSourceNames);
    paramParcel.writeStringList(mSharedElementTargetNames);
    paramParcel.writeInt(mReorderingAllowed);
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.BackStackState
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */