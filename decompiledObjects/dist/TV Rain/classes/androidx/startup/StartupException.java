package androidx.startup;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
public final class StartupException
  extends RuntimeException
{
  public StartupException(@NonNull String paramString)
  {
    super(paramString);
  }
  
  public StartupException(@NonNull String paramString, @NonNull Throwable paramThrowable)
  {
    super(paramString, paramThrowable);
  }
  
  public StartupException(@NonNull Throwable paramThrowable)
  {
    super(paramThrowable);
  }
}

/* Location:
 * Qualified Name:     androidx.startup.StartupException
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */