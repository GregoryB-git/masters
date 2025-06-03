package androidx.appcompat.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;

@SuppressLint({"BanParcelableUsage"})
class AppCompatDelegateImpl$PanelFeatureState$SavedState
  implements Parcelable
{
  public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator()
  {
    public AppCompatDelegateImpl.PanelFeatureState.SavedState createFromParcel(Parcel paramAnonymousParcel)
    {
      return AppCompatDelegateImpl.PanelFeatureState.SavedState.readFromParcel(paramAnonymousParcel, null);
    }
    
    public AppCompatDelegateImpl.PanelFeatureState.SavedState createFromParcel(Parcel paramAnonymousParcel, ClassLoader paramAnonymousClassLoader)
    {
      return AppCompatDelegateImpl.PanelFeatureState.SavedState.readFromParcel(paramAnonymousParcel, paramAnonymousClassLoader);
    }
    
    public AppCompatDelegateImpl.PanelFeatureState.SavedState[] newArray(int paramAnonymousInt)
    {
      return new AppCompatDelegateImpl.PanelFeatureState.SavedState[paramAnonymousInt];
    }
  };
  public int featureId;
  public boolean isOpen;
  public Bundle menuState;
  
  public static SavedState readFromParcel(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    SavedState localSavedState = new SavedState();
    featureId = paramParcel.readInt();
    int i = paramParcel.readInt();
    boolean bool = true;
    if (i != 1) {
      bool = false;
    }
    isOpen = bool;
    if (bool) {
      menuState = paramParcel.readBundle(paramClassLoader);
    }
    return localSavedState;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(featureId);
    paramParcel.writeInt(isOpen);
    if (isOpen) {
      paramParcel.writeBundle(menuState);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState.SavedState
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */