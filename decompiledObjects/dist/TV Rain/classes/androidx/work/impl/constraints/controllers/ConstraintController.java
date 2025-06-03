package androidx.work.impl.constraints.controllers;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.work.impl.constraints.ConstraintListener;
import androidx.work.impl.constraints.trackers.ConstraintTracker;
import androidx.work.impl.model.WorkSpec;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class ConstraintController<T>
  implements ConstraintListener<T>
{
  private OnConstraintUpdatedCallback mCallback;
  private T mCurrentValue;
  private final List<String> mMatchingWorkSpecIds = new ArrayList();
  private ConstraintTracker<T> mTracker;
  
  public ConstraintController(ConstraintTracker<T> paramConstraintTracker)
  {
    mTracker = paramConstraintTracker;
  }
  
  private void updateCallback(@Nullable OnConstraintUpdatedCallback paramOnConstraintUpdatedCallback, @Nullable T paramT)
  {
    if ((!mMatchingWorkSpecIds.isEmpty()) && (paramOnConstraintUpdatedCallback != null)) {
      if ((paramT != null) && (!isConstrained(paramT))) {
        paramOnConstraintUpdatedCallback.onConstraintMet(mMatchingWorkSpecIds);
      } else {
        paramOnConstraintUpdatedCallback.onConstraintNotMet(mMatchingWorkSpecIds);
      }
    }
  }
  
  public abstract boolean hasConstraint(@NonNull WorkSpec paramWorkSpec);
  
  public abstract boolean isConstrained(@NonNull T paramT);
  
  public boolean isWorkSpecConstrained(@NonNull String paramString)
  {
    Object localObject = mCurrentValue;
    boolean bool;
    if ((localObject != null) && (isConstrained(localObject)) && (mMatchingWorkSpecIds.contains(paramString))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void onConstraintChanged(@Nullable T paramT)
  {
    mCurrentValue = paramT;
    updateCallback(mCallback, paramT);
  }
  
  public void replace(@NonNull Iterable<WorkSpec> paramIterable)
  {
    mMatchingWorkSpecIds.clear();
    Iterator localIterator = paramIterable.iterator();
    while (localIterator.hasNext())
    {
      paramIterable = (WorkSpec)localIterator.next();
      if (hasConstraint(paramIterable)) {
        mMatchingWorkSpecIds.add(id);
      }
    }
    if (mMatchingWorkSpecIds.isEmpty()) {
      mTracker.removeListener(this);
    } else {
      mTracker.addListener(this);
    }
    updateCallback(mCallback, mCurrentValue);
  }
  
  public void reset()
  {
    if (!mMatchingWorkSpecIds.isEmpty())
    {
      mMatchingWorkSpecIds.clear();
      mTracker.removeListener(this);
    }
  }
  
  public void setCallback(@Nullable OnConstraintUpdatedCallback paramOnConstraintUpdatedCallback)
  {
    if (mCallback != paramOnConstraintUpdatedCallback)
    {
      mCallback = paramOnConstraintUpdatedCallback;
      updateCallback(paramOnConstraintUpdatedCallback, mCurrentValue);
    }
  }
  
  public static abstract interface OnConstraintUpdatedCallback
  {
    public abstract void onConstraintMet(@NonNull List<String> paramList);
    
    public abstract void onConstraintNotMet(@NonNull List<String> paramList);
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.constraints.controllers.ConstraintController
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */