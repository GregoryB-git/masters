package androidx.work.impl.constraints;

import androidx.annotation.MainThread;
import androidx.annotation.Nullable;

public abstract interface ConstraintListener<T>
{
  @MainThread
  public abstract void onConstraintChanged(@Nullable T paramT);
}

/* Location:
 * Qualified Name:     androidx.work.impl.constraints.ConstraintListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */