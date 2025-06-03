package androidx.work.impl.utils;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public abstract interface WorkTimer$TimeLimitExceededListener
{
  public abstract void onTimeLimitExceeded(@NonNull String paramString);
}

/* Location:
 * Qualified Name:     androidx.work.impl.utils.WorkTimer.TimeLimitExceededListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */