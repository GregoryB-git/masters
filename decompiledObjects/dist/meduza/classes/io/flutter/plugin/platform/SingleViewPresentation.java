package io.flutter.plugin.platform;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Presentation;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.MutableContextWrapper;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import f;
import io.flutter.Log;

class SingleViewPresentation
  extends Presentation
{
  private static final String TAG = "PlatformViewsController";
  private final AccessibilityEventsDelegate accessibilityEventsDelegate;
  private FrameLayout container;
  private final View.OnFocusChangeListener focusChangeListener;
  private final Context outerContext;
  private AccessibilityDelegatingFrameLayout rootView;
  private boolean startFocused = false;
  private final PresentationState state;
  private int viewId;
  
  public SingleViewPresentation(Context paramContext, Display paramDisplay, AccessibilityEventsDelegate paramAccessibilityEventsDelegate, PresentationState paramPresentationState, View.OnFocusChangeListener paramOnFocusChangeListener, boolean paramBoolean)
  {
    super(new ImmContext(paramContext), paramDisplay);
    accessibilityEventsDelegate = paramAccessibilityEventsDelegate;
    state = paramPresentationState;
    focusChangeListener = paramOnFocusChangeListener;
    outerContext = paramContext;
    getWindow().setFlags(8, 8);
    startFocused = paramBoolean;
  }
  
  public SingleViewPresentation(Context paramContext, Display paramDisplay, PlatformView paramPlatformView, AccessibilityEventsDelegate paramAccessibilityEventsDelegate, int paramInt, View.OnFocusChangeListener paramOnFocusChangeListener)
  {
    super(new ImmContext(paramContext), paramDisplay);
    accessibilityEventsDelegate = paramAccessibilityEventsDelegate;
    viewId = paramInt;
    focusChangeListener = paramOnFocusChangeListener;
    outerContext = paramContext;
    paramContext = new PresentationState();
    state = paramContext;
    PresentationState.access$002(paramContext, paramPlatformView);
    getWindow().setFlags(8, 8);
    getWindow().setType(2030);
  }
  
  public PresentationState detachState()
  {
    Object localObject = container;
    if (localObject != null) {
      ((ViewGroup)localObject).removeAllViews();
    }
    localObject = rootView;
    if (localObject != null) {
      ((ViewGroup)localObject).removeAllViews();
    }
    return state;
  }
  
  public PlatformView getView()
  {
    return PresentationState.access$000(state);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    getWindow().setBackgroundDrawable(new ColorDrawable(0));
    if (PresentationState.access$100(state) == null) {
      PresentationState.access$102(state, new SingleViewFakeWindowViewGroup(getContext()));
    }
    if (PresentationState.access$200(state) == null)
    {
      paramBundle = (WindowManager)getContext().getSystemService("window");
      localObject = state;
      PresentationState.access$202((PresentationState)localObject, new WindowManagerHandler(paramBundle, PresentationState.access$100((PresentationState)localObject)));
    }
    container = new FrameLayout(getContext());
    Object localObject = new PresentationContext(getContext(), PresentationState.access$200(state), outerContext);
    paramBundle = PresentationState.access$000(state).getView();
    if ((paramBundle.getContext() instanceof MutableContextWrapper))
    {
      ((MutableContextWrapper)paramBundle.getContext()).setBaseContext((Context)localObject);
    }
    else
    {
      localObject = f.l("Unexpected platform view context for view ID ");
      ((StringBuilder)localObject).append(viewId);
      ((StringBuilder)localObject).append("; some functionality may not work correctly. When constructing a platform view in the factory, ensure that the view returned from PlatformViewFactory#create returns the provided context from getContext(). If you are unable to associate the view with that context, consider using Hybrid Composition instead.");
      Log.w("PlatformViewsController", ((StringBuilder)localObject).toString());
    }
    container.addView(paramBundle);
    localObject = new AccessibilityDelegatingFrameLayout(getContext(), accessibilityEventsDelegate, paramBundle);
    rootView = ((AccessibilityDelegatingFrameLayout)localObject);
    ((ViewGroup)localObject).addView(container);
    rootView.addView(PresentationState.access$100(state));
    paramBundle.setOnFocusChangeListener(focusChangeListener);
    rootView.setFocusableInTouchMode(true);
    if (startFocused) {
      paramBundle.requestFocus();
    } else {
      rootView.requestFocus();
    }
    setContentView(rootView);
  }
  
  public static class AccessibilityDelegatingFrameLayout
    extends FrameLayout
  {
    private final AccessibilityEventsDelegate accessibilityEventsDelegate;
    private final View embeddedView;
    
    public AccessibilityDelegatingFrameLayout(Context paramContext, AccessibilityEventsDelegate paramAccessibilityEventsDelegate, View paramView)
    {
      super();
      accessibilityEventsDelegate = paramAccessibilityEventsDelegate;
      embeddedView = paramView;
    }
    
    public boolean requestSendAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
    {
      return accessibilityEventsDelegate.requestSendAccessibilityEvent(embeddedView, paramView, paramAccessibilityEvent);
    }
  }
  
  public static class ImmContext
    extends ContextWrapper
  {
    private final InputMethodManager inputMethodManager;
    
    public ImmContext(Context paramContext)
    {
      this(paramContext, null);
    }
    
    private ImmContext(Context paramContext, InputMethodManager paramInputMethodManager)
    {
      super();
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
  
  public static class PresentationContext
    extends ContextWrapper
  {
    private final Context flutterAppWindowContext;
    private WindowManager windowManager;
    private final WindowManagerHandler windowManagerHandler;
    
    public PresentationContext(Context paramContext1, WindowManagerHandler paramWindowManagerHandler, Context paramContext2)
    {
      super();
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
  
  public static class PresentationState
  {
    private SingleViewFakeWindowViewGroup fakeWindowViewGroup;
    private PlatformView platformView;
    private WindowManagerHandler windowManagerHandler;
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugin.platform.SingleViewPresentation
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */