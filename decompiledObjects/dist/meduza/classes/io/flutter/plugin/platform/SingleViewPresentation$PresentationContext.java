package io.flutter.plugin.platform;

import android.app.AlertDialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.WindowManager;

class SingleViewPresentation$PresentationContext
  extends ContextWrapper
{
  private final Context flutterAppWindowContext;
  private WindowManager windowManager;
  private final WindowManagerHandler windowManagerHandler;
  
  public SingleViewPresentation$PresentationContext(Context paramContext1, WindowManagerHandler paramWindowManagerHandler, Context paramContext2)
  {
    super(paramContext1);
    windowManagerHandler = paramWindowManagerHandler;
    flutterAppWindowContext = paramContext2;
  }
  
  private WindowManager getWindowManager()
  {
    if (windowManager == null) {
      windowManager = windowManagerHandler;
    }
    return windowManager;
  }
  
  private boolean isCalledFromAlertDialog()
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
      if (isCalledFromAlertDialog()) {
        return flutterAppWindowContext.getSystemService(paramString);
      }
      return getWindowManager();
    }
    return super.getSystemService(paramString);
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugin.platform.SingleViewPresentation.PresentationContext
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */