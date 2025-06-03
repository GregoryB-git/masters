package androidx.work.impl.foreground;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.ForegroundInfo;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public abstract interface ForegroundProcessor
{
  public abstract void startForeground(@NonNull String paramString, @NonNull ForegroundInfo paramForegroundInfo);
  
  public abstract void stopForeground(@NonNull String paramString);
}

/* Location:
 * Qualified Name:     androidx.work.impl.foreground.ForegroundProcessor
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */