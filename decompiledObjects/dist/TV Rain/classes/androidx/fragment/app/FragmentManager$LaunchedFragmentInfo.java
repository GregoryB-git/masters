package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import androidx.annotation.NonNull;

@SuppressLint({"BanParcelableUsage"})
class FragmentManager$LaunchedFragmentInfo
  implements Parcelable
{
  public static final Parcelable.Creator<LaunchedFragmentInfo> CREATOR = new Parcelable.Creator()
  {
    public FragmentManager.LaunchedFragmentInfo createFromParcel(Parcel paramAnonymousParcel)
    {
      return new FragmentManager.LaunchedFragmentInfo(paramAnonymousParcel);
    }
    
    public FragmentManager.LaunchedFragmentInfo[] newArray(int paramAnonymousInt)
    {
      return new FragmentManager.LaunchedFragmentInfo[paramAnonymousInt];
    }
  };
  public int mRequestCode;
  public String mWho;
  
  public FragmentManager$LaunchedFragmentInfo(@NonNull Parcel paramParcel)
  {
    mWho = paramParcel.readString();
    mRequestCode = paramParcel.readInt();
  }
  
  public FragmentManager$LaunchedFragmentInfo(@NonNull String paramString, int paramInt)
  {
    mWho = paramString;
    mRequestCode = paramInt;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(mWho);
    paramParcel.writeInt(mRequestCode);
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.FragmentManager.LaunchedFragmentInfo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */