package androidx.work;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public abstract interface InitializationExceptionHandler
{
  public abstract void handleException(@NonNull Throwable paramThrowable);
}

/* Location:
 * Qualified Name:     androidx.work.InitializationExceptionHandler
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */