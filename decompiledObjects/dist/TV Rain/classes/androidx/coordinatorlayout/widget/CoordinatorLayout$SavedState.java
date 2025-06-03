package androidx.coordinatorlayout.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.util.SparseArray;
import androidx.customview.view.AbsSavedState;

public class CoordinatorLayout$SavedState
  extends AbsSavedState
{
  public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator()
  {
    public CoordinatorLayout.SavedState createFromParcel(Parcel paramAnonymousParcel)
    {
      return new CoordinatorLayout.SavedState(paramAnonymousParcel, null);
    }
    
    public CoordinatorLayout.SavedState createFromParcel(Parcel paramAnonymousParcel, ClassLoader paramAnonymousClassLoader)
    {
      return new CoordinatorLayout.SavedState(paramAnonymousParcel, paramAnonymousClassLoader);
    }
    
    public CoordinatorLayout.SavedState[] newArray(int paramAnonymousInt)
    {
      return new CoordinatorLayout.SavedState[paramAnonymousInt];
    }
  };
  public SparseArray<Parcelable> behaviorStates;
  
  public CoordinatorLayout$SavedState(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    super(paramParcel, paramClassLoader);
    int i = paramParcel.readInt();
    int[] arrayOfInt = new int[i];
    paramParcel.readIntArray(arrayOfInt);
    paramParcel = paramParcel.readParcelableArray(paramClassLoader);
    behaviorStates = new SparseArray(i);
    for (int j = 0; j < i; j++) {
      behaviorStates.append(arrayOfInt[j], paramParcel[j]);
    }
  }
  
  public CoordinatorLayout$SavedState(Parcelable paramParcelable)
  {
    super(paramParcelable);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    Object localObject = behaviorStates;
    int i = 0;
    int j;
    if (localObject != null) {
      j = ((SparseArray)localObject).size();
    } else {
      j = 0;
    }
    paramParcel.writeInt(j);
    localObject = new int[j];
    Parcelable[] arrayOfParcelable = new Parcelable[j];
    while (i < j)
    {
      localObject[i] = behaviorStates.keyAt(i);
      arrayOfParcelable[i] = ((Parcelable)behaviorStates.valueAt(i));
      i++;
    }
    paramParcel.writeIntArray((int[])localObject);
    paramParcel.writeParcelableArray(arrayOfParcelable, paramInt);
  }
}

/* Location:
 * Qualified Name:     androidx.coordinatorlayout.widget.CoordinatorLayout.SavedState
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */