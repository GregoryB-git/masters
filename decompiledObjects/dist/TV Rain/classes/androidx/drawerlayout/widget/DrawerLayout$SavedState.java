package androidx.drawerlayout.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.customview.view.AbsSavedState;

public class DrawerLayout$SavedState
  extends AbsSavedState
{
  public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator()
  {
    public DrawerLayout.SavedState createFromParcel(Parcel paramAnonymousParcel)
    {
      return new DrawerLayout.SavedState(paramAnonymousParcel, null);
    }
    
    public DrawerLayout.SavedState createFromParcel(Parcel paramAnonymousParcel, ClassLoader paramAnonymousClassLoader)
    {
      return new DrawerLayout.SavedState(paramAnonymousParcel, paramAnonymousClassLoader);
    }
    
    public DrawerLayout.SavedState[] newArray(int paramAnonymousInt)
    {
      return new DrawerLayout.SavedState[paramAnonymousInt];
    }
  };
  public int lockModeEnd;
  public int lockModeLeft;
  public int lockModeRight;
  public int lockModeStart;
  public int openDrawerGravity = 0;
  
  public DrawerLayout$SavedState(@NonNull Parcel paramParcel, @Nullable ClassLoader paramClassLoader)
  {
    super(paramParcel, paramClassLoader);
    openDrawerGravity = paramParcel.readInt();
    lockModeLeft = paramParcel.readInt();
    lockModeRight = paramParcel.readInt();
    lockModeStart = paramParcel.readInt();
    lockModeEnd = paramParcel.readInt();
  }
  
  public DrawerLayout$SavedState(@NonNull Parcelable paramParcelable)
  {
    super(paramParcelable);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeInt(openDrawerGravity);
    paramParcel.writeInt(lockModeLeft);
    paramParcel.writeInt(lockModeRight);
    paramParcel.writeInt(lockModeStart);
    paramParcel.writeInt(lockModeEnd);
  }
}

/* Location:
 * Qualified Name:     androidx.drawerlayout.widget.DrawerLayout.SavedState
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */