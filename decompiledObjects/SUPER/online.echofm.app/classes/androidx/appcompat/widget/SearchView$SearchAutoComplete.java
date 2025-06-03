package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.text.TextUtils;
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
import android.widget.EditText;
import android.widget.TextView;
import e.a;
import l.Q;
import l.c;

public class SearchView$SearchAutoComplete
  extends c
{
  public int r = getThreshold();
  public SearchView s;
  public boolean t;
  public final Runnable u = new a();
  
  public SearchView$SearchAutoComplete(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, a.g);
  }
  
  public SearchView$SearchAutoComplete(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
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
  
  public void a()
  {
    if (Build.VERSION.SDK_INT >= 29)
    {
      Q.a(this, 1);
      if (enoughToFilter()) {
        showDropDown();
      }
    }
    else
    {
      SearchView.B0.c(this);
    }
  }
  
  public boolean b()
  {
    boolean bool;
    if (TextUtils.getTrimmedLength(getText()) == 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void c()
  {
    if (t)
    {
      ((InputMethodManager)getContext().getSystemService("input_method")).showSoftInput(this, 0);
      t = false;
    }
  }
  
  public boolean enoughToFilter()
  {
    boolean bool;
    if ((r > 0) && (!super.enoughToFilter())) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public InputConnection onCreateInputConnection(EditorInfo paramEditorInfo)
  {
    paramEditorInfo = super.onCreateInputConnection(paramEditorInfo);
    if (t)
    {
      removeCallbacks(u);
      post(u);
    }
    return paramEditorInfo;
  }
  
  public void onFinishInflate()
  {
    super.onFinishInflate();
    DisplayMetrics localDisplayMetrics = getResources().getDisplayMetrics();
    setMinWidth((int)TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), localDisplayMetrics));
  }
  
  public void onFocusChanged(boolean paramBoolean, int paramInt, Rect paramRect)
  {
    super.onFocusChanged(paramBoolean, paramInt, paramRect);
    s.W();
  }
  
  public boolean onKeyPreIme(int paramInt, KeyEvent paramKeyEvent)
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
          s.clearFocus();
          setImeVisibility(false);
          return true;
        }
      }
    }
    return super.onKeyPreIme(paramInt, paramKeyEvent);
  }
  
  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    if ((paramBoolean) && (s.hasFocus()) && (getVisibility() == 0))
    {
      t = true;
      if (SearchView.J(getContext())) {
        a();
      }
    }
  }
  
  public void performCompletion() {}
  
  public void replaceText(CharSequence paramCharSequence) {}
  
  public void setImeVisibility(boolean paramBoolean)
  {
    InputMethodManager localInputMethodManager = (InputMethodManager)getContext().getSystemService("input_method");
    if (!paramBoolean)
    {
      t = false;
      removeCallbacks(u);
      localInputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
      return;
    }
    if (localInputMethodManager.isActive(this))
    {
      t = false;
      removeCallbacks(u);
      localInputMethodManager.showSoftInput(this, 0);
      return;
    }
    t = true;
  }
  
  public void setSearchView(SearchView paramSearchView)
  {
    s = paramSearchView;
  }
  
  public void setThreshold(int paramInt)
  {
    super.setThreshold(paramInt);
    r = paramInt;
  }
  
  public class a
    implements Runnable
  {
    public a() {}
    
    public void run()
    {
      c();
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.SearchView.SearchAutoComplete
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */