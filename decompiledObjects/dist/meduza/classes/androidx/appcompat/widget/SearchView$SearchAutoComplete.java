package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.KeyEvent.DispatcherState;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;
import java.lang.reflect.Method;
import l.c;

public class SearchView$SearchAutoComplete
  extends c
{
  public int e = getThreshold();
  public SearchView f;
  public boolean o;
  public final a p = new a();
  
  public SearchView$SearchAutoComplete(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet, 0);
  }
  
  private int getSearchViewTextMinWidthDp()
  {
    Configuration localConfiguration = getResources().getConfiguration();
    int i = screenWidthDp;
    int j = screenHeightDp;
    if ((i >= 960) && (j >= 720) && (orientation == 2)) {
      return 256;
    }
    if ((i < 600) && ((i < 640) || (j < 480))) {
      return 160;
    }
    return 192;
  }
  
  public final void a()
  {
    Object localObject;
    if (Build.VERSION.SDK_INT >= 29)
    {
      SearchView.k.b(this, 1);
      if (enoughToFilter()) {
        showDropDown();
      }
    }
    else
    {
      localObject = SearchView.r0;
      localObject.getClass();
      SearchView.o.a();
      localObject = c;
      if (localObject == null) {}
    }
    try
    {
      ((Method)localObject).invoke(this, new Object[] { Boolean.TRUE });
      return;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
  
  public final boolean enoughToFilter()
  {
    boolean bool;
    if ((e > 0) && (!super.enoughToFilter())) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public final InputConnection onCreateInputConnection(EditorInfo paramEditorInfo)
  {
    paramEditorInfo = super.onCreateInputConnection(paramEditorInfo);
    if (o)
    {
      removeCallbacks(p);
      post(p);
    }
    return paramEditorInfo;
  }
  
  public final void onFinishInflate()
  {
    super.onFinishInflate();
    DisplayMetrics localDisplayMetrics = getResources().getDisplayMetrics();
    setMinWidth((int)TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), localDisplayMetrics));
  }
  
  public final void onFocusChanged(boolean paramBoolean, int paramInt, Rect paramRect)
  {
    super.onFocusChanged(paramBoolean, paramInt, paramRect);
    paramRect = f;
    paramRect.v(V);
    paramRect.post(m0);
    if (x.hasFocus()) {
      paramRect.k();
    }
  }
  
  public final boolean onKeyPreIme(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      KeyEvent.DispatcherState localDispatcherState;
      if ((paramKeyEvent.getAction() == 0) && (paramKeyEvent.getRepeatCount() == 0))
      {
        localDispatcherState = getKeyDispatcherState();
        if (localDispatcherState != null) {
          localDispatcherState.startTracking(paramKeyEvent, this);
        }
        return true;
      }
      if (paramKeyEvent.getAction() == 1)
      {
        localDispatcherState = getKeyDispatcherState();
        if (localDispatcherState != null) {
          localDispatcherState.handleUpEvent(paramKeyEvent);
        }
        if ((paramKeyEvent.isTracking()) && (!paramKeyEvent.isCanceled()))
        {
          f.clearFocus();
          setImeVisibility(false);
          return true;
        }
      }
    }
    return super.onKeyPreIme(paramInt, paramKeyEvent);
  }
  
  public final void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    if ((paramBoolean) && (f.hasFocus()) && (getVisibility() == 0))
    {
      int i = 1;
      o = true;
      Context localContext = getContext();
      SearchView.o localo = SearchView.r0;
      if (getResourcesgetConfigurationorientation != 2) {
        i = 0;
      }
      if (i != 0) {
        a();
      }
    }
  }
  
  public final void performCompletion() {}
  
  public final void replaceText(CharSequence paramCharSequence) {}
  
  public void setImeVisibility(boolean paramBoolean)
  {
    InputMethodManager localInputMethodManager = (InputMethodManager)getContext().getSystemService("input_method");
    if (!paramBoolean)
    {
      o = false;
      removeCallbacks(p);
      localInputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
      return;
    }
    if (localInputMethodManager.isActive(this))
    {
      o = false;
      removeCallbacks(p);
      localInputMethodManager.showSoftInput(this, 0);
      return;
    }
    o = true;
  }
  
  public void setSearchView(SearchView paramSearchView)
  {
    f = paramSearchView;
  }
  
  public void setThreshold(int paramInt)
  {
    super.setThreshold(paramInt);
    e = paramInt;
  }
  
  public final class a
    implements Runnable
  {
    public a() {}
    
    public final void run()
    {
      SearchView.SearchAutoComplete localSearchAutoComplete = SearchView.SearchAutoComplete.this;
      if (o)
      {
        ((InputMethodManager)localSearchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(localSearchAutoComplete, 0);
        o = false;
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.SearchView.SearchAutoComplete
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */