package io.flutter.plugin.platform;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Presentation;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Display;
import android.view.View.OnFocusChangeListener;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import androidx.annotation.Keep;

@Keep
class SingleViewPresentation
  extends Presentation
{
  private static final String TAG = "PlatformViewsController";
  private final a accessibilityEventsDelegate;
  private FrameLayout container;
  private final View.OnFocusChangeListener focusChangeListener;
  private final Context outerContext;
  private a rootView;
  private boolean startFocused = false;
  private final d state;
  private int viewId;
  
  public SingleViewPresentation(Context paramContext, Display paramDisplay, a parama, d paramd, View.OnFocusChangeListener paramOnFocusChangeListener, boolean paramBoolean)
  {
    super(new b(paramContext), paramDisplay);
    accessibilityEventsDelegate = parama;
    state = paramd;
    focusChangeListener = paramOnFocusChangeListener;
    outerContext = paramContext;
    getWindow().setFlags(8, 8);
    startFocused = paramBoolean;
  }
  
  public SingleViewPresentation(Context paramContext, Display paramDisplay, j paramj, a parama, int paramInt, View.OnFocusChangeListener paramOnFocusChangeListener)
  {
    super(new b(paramContext), paramDisplay);
    accessibilityEventsDelegate = parama;
    viewId = paramInt;
    focusChangeListener = paramOnFocusChangeListener;
    outerContext = paramContext;
    paramContext = new d();
    state = paramContext;
    d.b(paramContext, paramj);
    getWindow().setFlags(8, 8);
    getWindow().setType(2030);
  }
  
  public d detachState()
  {
    FrameLayout localFrameLayout = container;
    if (localFrameLayout != null) {
      localFrameLayout.removeAllViews();
    }
    return state;
  }
  
  public j getView()
  {
    d.a(state);
    return null;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    getWindow().setBackgroundDrawable(new ColorDrawable(0));
    if (d.c(state) == null) {
      d.d(state, new s(getContext()));
    }
    if (d.e(state) == null)
    {
      WindowManager localWindowManager = (WindowManager)getContext().getSystemService("window");
      paramBundle = state;
      d.f(paramBundle, new z(localWindowManager, d.c(paramBundle)));
    }
    container = new FrameLayout(getContext());
    new c(getContext(), d.e(state), outerContext);
    d.a(state);
    throw null;
  }
  
  public static abstract class a
    extends FrameLayout
  {}
  
  public static class b
    extends ContextWrapper
  {
    public final InputMethodManager a;
    
    public b(Context paramContext)
    {
      this(paramContext, null);
    }
    
    public b(Context paramContext, InputMethodManager paramInputMethodManager)
    {
      super();
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
  
  public static class c
    extends ContextWrapper
  {
    public final z a;
    public WindowManager b;
    public final Context c;
    
    public c(Context paramContext1, z paramz, Context paramContext2)
    {
      super();
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
  
  public static class d
  {
    public z a;
    public s b;
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugin.platform.SingleViewPresentation
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */