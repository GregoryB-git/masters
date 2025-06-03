package io.flutter.plugin.platform;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.Display;
import android.view.inputmethod.InputMethodManager;

public class SingleViewPresentation$b
  extends ContextWrapper
{
  public final InputMethodManager a;
  
  public SingleViewPresentation$b(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public SingleViewPresentation$b(Context paramContext, InputMethodManager paramInputMethodManager)
  {
    super(paramContext);
    if (paramInputMethodManager == null) {
      paramInputMethodManager = (InputMethodManager)paramContext.getSystemService("input_method");
    }
    a = paramInputMethodManager;
  }
  
  public Context createDisplayContext(Display paramDisplay)
  {
    return new b(super.createDisplayContext(paramDisplay), a);
  }
  
  public Object getSystemService(String paramString)
  {
    if ("input_method".equals(paramString)) {
      return a;
    }
    return super.getSystemService(paramString);
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugin.platform.SingleViewPresentation.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */