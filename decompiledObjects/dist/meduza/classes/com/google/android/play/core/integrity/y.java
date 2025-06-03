package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.BaseBundle;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import m7.v;

abstract class y
{
  private final v a = new v("IntegrityDialogWrapper");
  private final String b;
  private final long c;
  private final Object d = new Object();
  private boolean e;
  
  public y(String paramString, long paramLong)
  {
    b = paramString;
    c = paramLong;
  }
  
  public final Task a(Activity paramActivity, int paramInt)
  {
    synchronized (d)
    {
      if (e)
      {
        paramActivity = Tasks.forResult(Integer.valueOf(0));
        return paramActivity;
      }
      e = true;
      ??? = a;
      ???.getClass();
      if (Log.isLoggable("PlayCore", 3)) {
        Log.d("PlayCore", v.c(a, "checkAndShowDialog(%s)", new Object[] { Integer.valueOf(paramInt) }));
      }
      ??? = new Bundle();
      ((BaseBundle)???).putInt("dialog.intent.type", paramInt);
      ((BaseBundle)???).putString("package.name", b);
      ((BaseBundle)???).putInt("playcore.integrity.version.major", 1);
      ((BaseBundle)???).putInt("playcore.integrity.version.minor", 3);
      ((BaseBundle)???).putInt("playcore.integrity.version.patch", 0);
      ((BaseBundle)???).putLong("request.token.sid", c);
      return b(paramActivity, (Bundle)???);
    }
  }
  
  public abstract Task b(Activity paramActivity, Bundle paramBundle);
}

/* Location:
 * Qualified Name:     com.google.android.play.core.integrity.y
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */