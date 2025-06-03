package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

@SuppressLint({"BanParcelableUsage, ParcelClassLoader"})
public class Fragment$SavedState
  implements Parcelable
{
  @NonNull
  public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator()
  {
    public Fragment.SavedState createFromParcel(Parcel paramAnonymousParcel)
    {
      return new Fragment.SavedState(paramAnonymousParcel, null);
    }
    
    public Fragment.SavedState createFromParcel(Parcel paramAnonymousParcel, ClassLoader paramAnonymousClassLoader)
    {
      return new Fragment.SavedState(paramAnonymousParcel, paramAnonymousClassLoader);
    }
    
    public Fragment.SavedState[] newArray(int paramAnonymousInt)
    {
      return new Fragment.SavedState[paramAnonymousInt];
    }
  };
  public final Bundle mState;
  
  public Fragment$SavedState(Bundle paramBundle)
  {
    mState = paramBundle;
  }
  
  public Fragment$SavedState(@NonNull Parcel paramParcel, @Nullable ClassLoader paramClassLoader)
  {
    paramParcel = paramParcel.readBundle();
    mState = paramParcel;
    if ((paramClassLoader != null) && (paramParcel != null)) {
      paramParcel.setClassLoader(paramClassLoader);
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(@NonNull Parcel paramParcel, int paramInt)
  {
    paramParcel.writeBundle(mState);
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.Fragment.SavedState
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */