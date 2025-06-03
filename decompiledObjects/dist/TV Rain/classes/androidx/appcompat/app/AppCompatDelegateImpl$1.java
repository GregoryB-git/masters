package androidx.appcompat.app;

import android.content.res.Resources.NotFoundException;
import androidx.annotation.NonNull;

class AppCompatDelegateImpl$1
  implements Thread.UncaughtExceptionHandler
{
  public AppCompatDelegateImpl$1(Thread.UncaughtExceptionHandler paramUncaughtExceptionHandler) {}
  
  private boolean shouldWrapException(Throwable paramThrowable)
  {
    boolean bool1 = paramThrowable instanceof Resources.NotFoundException;
    boolean bool2 = false;
    boolean bool3 = bool2;
    if (bool1)
    {
      paramThrowable = paramThrowable.getMessage();
      bool3 = bool2;
      if (paramThrowable != null) {
        if (!paramThrowable.contains("drawable"))
        {
          bool3 = bool2;
          if (!paramThrowable.contains("Drawable")) {}
        }
        else
        {
          bool3 = true;
        }
      }
    }
    return bool3;
  }
  
  public void uncaughtException(@NonNull Thread paramThread, @NonNull Throwable paramThrowable)
  {
    if (shouldWrapException(paramThrowable))
    {
      Object localObject = new StringBuilder();
      ((StringBuilder)localObject).append(paramThrowable.getMessage());
      ((StringBuilder)localObject).append(". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
      localObject = new Resources.NotFoundException(((StringBuilder)localObject).toString());
      ((Throwable)localObject).initCause(paramThrowable.getCause());
      ((Throwable)localObject).setStackTrace(paramThrowable.getStackTrace());
      val$defHandler.uncaughtException(paramThread, (Throwable)localObject);
    }
    else
    {
      val$defHandler.uncaughtException(paramThread, paramThrowable);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.app.AppCompatDelegateImpl.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */