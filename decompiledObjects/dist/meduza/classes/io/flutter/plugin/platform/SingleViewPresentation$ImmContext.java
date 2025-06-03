package io.flutter.plugin.platform;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.Display;
import android.view.inputmethod.InputMethodManager;

class SingleViewPresentation$ImmContext
  extends ContextWrapper
{
  private final InputMethodManager inputMethodManager;
  
  public SingleViewPresentation$ImmContext(Context paramContext)
  {
    this(paramContext, null);
  }
  
  private SingleViewPresentation$ImmContext(Context paramContext, InputMethodManager paramInputMethodManager)
  {
    super(paramContext);
    if (paramInputMethodManager == null) {
      paramInputMethodManager = (InputMethodManager)paramContext.getSystemService("input_method");
    }
    inputMethodManager = paramInputMethodManager;
  }
  
  public Context createDisplayContext(Display paramDisplay)
  {
    return new ImmContext(super.createDisplayContext(paramDisplay), inputMethodManager);
  }
  
  public Object getSystemService(String paramString)
  {
    if ("input_method".equals(paramString)) {
      return inputMethodManager;
    }
    return super.getSystemService(paramString);
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugin.platform.SingleViewPresentation.ImmContext
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */