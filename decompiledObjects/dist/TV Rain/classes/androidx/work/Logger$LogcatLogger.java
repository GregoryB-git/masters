package androidx.work;

import android.util.Log;

public class Logger$LogcatLogger
  extends Logger
{
  private int mLoggingLevel;
  
  public Logger$LogcatLogger(int paramInt)
  {
    super(paramInt);
    mLoggingLevel = paramInt;
  }
  
  public void debug(String paramString1, String paramString2, Throwable... paramVarArgs)
  {
    if (mLoggingLevel <= 3) {
      if ((paramVarArgs != null) && (paramVarArgs.length >= 1)) {
        Log.d(paramString1, paramString2, paramVarArgs[0]);
      } else {
        Log.d(paramString1, paramString2);
      }
    }
  }
  
  public void error(String paramString1, String paramString2, Throwable... paramVarArgs)
  {
    if (mLoggingLevel <= 6) {
      if ((paramVarArgs != null) && (paramVarArgs.length >= 1)) {
        Log.e(paramString1, paramString2, paramVarArgs[0]);
      } else {
        Log.e(paramString1, paramString2);
      }
    }
  }
  
  public void info(String paramString1, String paramString2, Throwable... paramVarArgs)
  {
    if (mLoggingLevel <= 4) {
      if ((paramVarArgs != null) && (paramVarArgs.length >= 1)) {
        Log.i(paramString1, paramString2, paramVarArgs[0]);
      } else {
        Log.i(paramString1, paramString2);
      }
    }
  }
  
  public void verbose(String paramString1, String paramString2, Throwable... paramVarArgs)
  {
    if (mLoggingLevel <= 2) {
      if ((paramVarArgs != null) && (paramVarArgs.length >= 1)) {
        Log.v(paramString1, paramString2, paramVarArgs[0]);
      } else {
        Log.v(paramString1, paramString2);
      }
    }
  }
  
  public void warning(String paramString1, String paramString2, Throwable... paramVarArgs)
  {
    if (mLoggingLevel <= 5) {
      if ((paramVarArgs != null) && (paramVarArgs.length >= 1)) {
        Log.w(paramString1, paramString2, paramVarArgs[0]);
      } else {
        Log.w(paramString1, paramString2);
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.work.Logger.LogcatLogger
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */