package androidx.appcompat.graphics.drawable;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.StateSet;
import androidx.annotation.NonNull;

class StateListDrawable$StateListState
  extends DrawableContainer.DrawableContainerState
{
  public int[][] mStateSets;
  
  public StateListDrawable$StateListState(StateListState paramStateListState, StateListDrawable paramStateListDrawable, Resources paramResources)
  {
    super(paramStateListState, paramStateListDrawable, paramResources);
    if (paramStateListState != null) {
      mStateSets = mStateSets;
    } else {
      mStateSets = new int[getCapacity()][];
    }
  }
  
  public int addStateSet(int[] paramArrayOfInt, Drawable paramDrawable)
  {
    int i = addChild(paramDrawable);
    mStateSets[i] = paramArrayOfInt;
    return i;
  }
  
  public void growArray(int paramInt1, int paramInt2)
  {
    super.growArray(paramInt1, paramInt2);
    int[][] arrayOfInt = new int[paramInt2][];
    System.arraycopy(mStateSets, 0, arrayOfInt, 0, paramInt1);
    mStateSets = arrayOfInt;
  }
  
  public int indexOfStateSet(int[] paramArrayOfInt)
  {
    int[][] arrayOfInt = mStateSets;
    int i = getChildCount();
    for (int j = 0; j < i; j++) {
      if (StateSet.stateSetMatches(arrayOfInt[j], paramArrayOfInt)) {
        return j;
      }
    }
    return -1;
  }
  
  public void mutate()
  {
    Object localObject = mStateSets;
    int[][] arrayOfInt = new int[localObject.length][];
    for (int i = localObject.length - 1; i >= 0; i--)
    {
      localObject = mStateSets[i];
      if (localObject != null) {
        localObject = (int[])((int[])localObject).clone();
      } else {
        localObject = null;
      }
      arrayOfInt[i] = localObject;
    }
    mStateSets = arrayOfInt;
  }
  
  @NonNull
  public Drawable newDrawable()
  {
    return new StateListDrawable(this, null);
  }
  
  @NonNull
  public Drawable newDrawable(Resources paramResources)
  {
    return new StateListDrawable(this, paramResources);
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.graphics.drawable.StateListDrawable.StateListState
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */