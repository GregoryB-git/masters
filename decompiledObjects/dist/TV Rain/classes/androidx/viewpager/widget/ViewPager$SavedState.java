package androidx.viewpager.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import androidx.annotation.NonNull;
import androidx.customview.view.AbsSavedState;
import z2;

public class ViewPager$SavedState
  extends AbsSavedState
{
  public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator()
  {
    public ViewPager.SavedState createFromParcel(Parcel paramAnonymousParcel)
    {
      return new ViewPager.SavedState(paramAnonymousParcel, null);
    }
    
    public ViewPager.SavedState createFromParcel(Parcel paramAnonymousParcel, ClassLoader paramAnonymousClassLoader)
    {
      return new ViewPager.SavedState(paramAnonymousParcel, paramAnonymousClassLoader);
    }
    
    public ViewPager.SavedState[] newArray(int paramAnonymousInt)
    {
      return new ViewPager.SavedState[paramAnonymousInt];
    }
  };
  public Parcelable adapterState;
  public ClassLoader loader;
  public int position;
  
  public ViewPager$SavedState(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    super(paramParcel, paramClassLoader);
    ClassLoader localClassLoader = paramClassLoader;
    if (paramClassLoader == null) {
      localClassLoader = getClass().getClassLoader();
    }
    position = paramParcel.readInt();
    adapterState = paramParcel.readParcelable(localClassLoader);
    loader = localClassLoader;
  }
  
  public ViewPager$SavedState(@NonNull Parcelable paramParcelable)
  {
    super(paramParcelable);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = z2.t("FragmentPager.SavedState{");
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    localStringBuilder.append(" position=");
    return z2.q(localStringBuilder, position, "}");
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeInt(position);
    paramParcel.writeParcelable(adapterState, paramInt);
  }
}

/* Location:
 * Qualified Name:     androidx.viewpager.widget.ViewPager.SavedState
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */