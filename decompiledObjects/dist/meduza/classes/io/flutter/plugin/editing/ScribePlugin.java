package io.flutter.plugin.editing;

import android.os.Build.VERSION;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import io.flutter.embedding.engine.systemchannels.ScribeChannel;
import io.flutter.embedding.engine.systemchannels.ScribeChannel.ScribeMethodHandler;

public class ScribePlugin
  implements ScribeChannel.ScribeMethodHandler
{
  private final InputMethodManager mInputMethodManager;
  private final ScribeChannel mScribeChannel;
  private View mView;
  
  public ScribePlugin(View paramView, InputMethodManager paramInputMethodManager, ScribeChannel paramScribeChannel)
  {
    if (Build.VERSION.SDK_INT >= 33) {
      paramView.setAutoHandwritingEnabled(false);
    }
    mView = paramView;
    mInputMethodManager = paramInputMethodManager;
    mScribeChannel = paramScribeChannel;
    paramScribeChannel.setScribeMethodHandler(this);
  }
  
  public void destroy()
  {
    mScribeChannel.setScribeMethodHandler(null);
  }
  
  public boolean isFeatureAvailable()
  {
    boolean bool;
    if ((Build.VERSION.SDK_INT >= 34) && (isStylusHandwritingAvailable())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean isStylusHandwritingAvailable()
  {
    return mInputMethodManager.isStylusHandwritingAvailable();
  }
  
  public void setView(View paramView)
  {
    if (paramView == mView) {
      return;
    }
    mView = paramView;
  }
  
  public void startStylusHandwriting()
  {
    mInputMethodManager.startStylusHandwriting(mView);
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugin.editing.ScribePlugin
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */