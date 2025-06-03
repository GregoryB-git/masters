package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import androidx.annotation.NonNull;

@SuppressLint({"BanParcelableUsage"})
final class FragmentState
  implements Parcelable
{
  public static final Parcelable.Creator<FragmentState> CREATOR = new Parcelable.Creator()
  {
    public FragmentState createFromParcel(Parcel paramAnonymousParcel)
    {
      return new FragmentState(paramAnonymousParcel);
    }
    
    public FragmentState[] newArray(int paramAnonymousInt)
    {
      return new FragmentState[paramAnonymousInt];
    }
  };
  public final Bundle mArguments;
  public final String mClassName;
  public final int mContainerId;
  public final boolean mDetached;
  public final int mFragmentId;
  public final boolean mFromLayout;
  public final boolean mHidden;
  public final int mMaxLifecycleState;
  public final boolean mRemoving;
  public final boolean mRetainInstance;
  public Bundle mSavedFragmentState;
  public final String mTag;
  public final String mWho;
  
  public FragmentState(Parcel paramParcel)
  {
    mClassName = paramParcel.readString();
    mWho = paramParcel.readString();
    int i = paramParcel.readInt();
    boolean bool1 = true;
    boolean bool2;
    if (i != 0) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    mFromLayout = bool2;
    mFragmentId = paramParcel.readInt();
    mContainerId = paramParcel.readInt();
    mTag = paramParcel.readString();
    if (paramParcel.readInt() != 0) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    mRetainInstance = bool2;
    if (paramParcel.readInt() != 0) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    mRemoving = bool2;
    if (paramParcel.readInt() != 0) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    mDetached = bool2;
    mArguments = paramParcel.readBundle();
    if (paramParcel.readInt() != 0) {
      bool2 = bool1;
    } else {
      bool2 = false;
    }
    mHidden = bool2;
    mSavedFragmentState = paramParcel.readBundle();
    mMaxLifecycleState = paramParcel.readInt();
  }
  
  public FragmentState(Fragment paramFragment)
  {
    mClassName = paramFragment.getClass().getName();
    mWho = mWho;
    mFromLayout = mFromLayout;
    mFragmentId = mFragmentId;
    mContainerId = mContainerId;
    mTag = mTag;
    mRetainInstance = mRetainInstance;
    mRemoving = mRemoving;
    mDetached = mDetached;
    mArguments = mArguments;
    mHidden = mHidden;
    mMaxLifecycleState = mMaxState.ordinal();
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  @NonNull
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(128);
    localStringBuilder.append("FragmentState{");
    localStringBuilder.append(mClassName);
    localStringBuilder.append(" (");
    localStringBuilder.append(mWho);
    localStringBuilder.append(")}:");
    if (mFromLayout) {
      localStringBuilder.append(" fromLayout");
    }
    if (mContainerId != 0)
    {
      localStringBuilder.append(" id=0x");
      localStringBuilder.append(Integer.toHexString(mContainerId));
    }
    String str = mTag;
    if ((str != null) && (!str.isEmpty()))
    {
      localStringBuilder.append(" tag=");
      localStringBuilder.append(mTag);
    }
    if (mRetainInstance) {
      localStringBuilder.append(" retainInstance");
    }
    if (mRemoving) {
      localStringBuilder.append(" removing");
    }
    if (mDetached) {
      localStringBuilder.append(" detached");
    }
    if (mHidden) {
      localStringBuilder.append(" hidden");
    }
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(mClassName);
    paramParcel.writeString(mWho);
    paramParcel.writeInt(mFromLayout);
    paramParcel.writeInt(mFragmentId);
    paramParcel.writeInt(mContainerId);
    paramParcel.writeString(mTag);
    paramParcel.writeInt(mRetainInstance);
    paramParcel.writeInt(mRemoving);
    paramParcel.writeInt(mDetached);
    paramParcel.writeBundle(mArguments);
    paramParcel.writeInt(mHidden);
    paramParcel.writeBundle(mSavedFragmentState);
    paramParcel.writeInt(mMaxLifecycleState);
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.FragmentState
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */