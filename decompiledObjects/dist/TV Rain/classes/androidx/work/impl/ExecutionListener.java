package androidx.work.impl;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public abstract interface ExecutionListener
{
  public abstract void onExecuted(@NonNull String paramString, boolean paramBoolean);
}

/* Location:
 * Qualified Name:     androidx.work.impl.ExecutionListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */