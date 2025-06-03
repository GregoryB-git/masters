package io.flutter.plugin.platform;

import android.app.AlertDialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.WindowManager;

public class SingleViewPresentation$c
  extends ContextWrapper
{
  public final z a;
  public WindowManager b;
  public final Context c;
  
  public SingleViewPresentation$c(Context paramContext1, z paramz, Context paramContext2)
  {
    super(paramContext1);
    a = paramz;
    c = paramContext2;
  }
  
  public final WindowManager a()
  {
    if (b == null) {
      b = a;
    }
    return b;
  }
  
  public final boolean b()
  {
    StackTraceElement[] arrayOfStackTraceElement = Thread.currentThread().getStackTrace();
    for (int i = 0; (i < arrayOfStackTraceElement.length) && (i < 11); i++) {
      if ((arrayOfStackTraceElement[i].getClassName().equals(AlertDialog.class.getCanonicalName())) && (arrayOfStackTraceElement[i].getMethodName().equals("<init>"))) {
        return true;
      }
    }
    return false;
  }
  
  public Object getSystemService(String paramString)
  {
    if ("window".equals(paramString))
    {
      if (b()) {
        return c.getSystemService(paramString);
      }
      return a();
    }
    return super.getSystemService(paramString);
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugin.platform.SingleViewPresentation.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */