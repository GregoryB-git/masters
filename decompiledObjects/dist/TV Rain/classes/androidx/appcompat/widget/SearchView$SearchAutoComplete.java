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
import androidx.annotation.RestrictTo;
import androidx.appcompat.R.attr;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class SearchView$SearchAutoComplete
  extends AppCompatAutoCompleteTextView
{
  private boolean mHasPendingShowSoftInputRequest;
  public final Runnable mRunShowSoftInputIfNecessary = new Runnable()
  {
    public void run()
    {
      showSoftInputIfNecessary();
    }
  };
  private SearchView mSearchView;
  private int mThreshold = getThreshold();
  
  public SearchView$SearchAutoComplete(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public SearchView$SearchAutoComplete(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, R.attr.autoCompleteTextViewStyle);
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
  
  public boolean enoughToFilter()
  {
    boolean bool;
    if ((mThreshold > 0) && (!super.enoughToFilter())) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public void ensureImeVisible()
  {
    if (Build.VERSION.SDK_INT >= 29)
    {
      SearchView.Api29Impl.setInputMethodMode(this, 1);
      if (enoughToFilter()) {
        showDropDown();
      }
    }
    else
    {
      SearchView.PRE_API_29_HIDDEN_METHOD_INVOKER.ensureImeVisible(this);
    }
  }
  
  public boolean isEmpty()
  {
    boolean bool;
    if (TextUtils.getTrimmedLength(getText()) == 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public InputConnection onCreateInputConnection(EditorInfo paramEditorInfo)
  {
    paramEditorInfo = super.onCreateInputConnection(paramEditorInfo);
    if (mHasPendingShowSoftInputRequest)
    {
      removeCallbacks(mRunShowSoftInputIfNecessary);
      post(mRunShowSoftInputIfNecessary);
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
    mSearchView.onTextFocusChanged();
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
          mSearchView.clearFocus();
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
    if ((paramBoolean) && (mSearchView.hasFocus()) && (getVisibility() == 0))
    {
      mHasPendingShowSoftInputRequest = true;
      if (SearchView.isLandscapeMode(getContext())) {
        ensureImeVisible();
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
      mHasPendingShowSoftInputRequest = false;
      removeCallbacks(mRunShowSoftInputIfNecessary);
      localInputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
      return;
    }
    if (localInputMethodManager.isActive(this))
    {
      mHasPendingShowSoftInputRequest = false;
      removeCallbacks(mRunShowSoftInputIfNecessary);
      localInputMethodManager.showSoftInput(this, 0);
      return;
    }
    mHasPendingShowSoftInputRequest = true;
  }
  
  public void setSearchView(SearchView paramSearchView)
  {
    mSearchView = paramSearchView;
  }
  
  public void setThreshold(int paramInt)
  {
    super.setThreshold(paramInt);
    mThreshold = paramInt;
  }
  
  public void showSoftInputIfNecessary()
  {
    if (mHasPendingShowSoftInputRequest)
    {
      ((InputMethodManager)getContext().getSystemService("input_method")).showSoftInput(this, 0);
      mHasPendingShowSoftInputRequest = false;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.SearchView.SearchAutoComplete
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */