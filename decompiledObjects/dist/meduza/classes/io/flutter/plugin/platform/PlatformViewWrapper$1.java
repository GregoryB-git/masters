package io.flutter.plugin.platform;

import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.view.ViewTreeObserver.OnGlobalFocusChangeListener;
import io.flutter.util.ViewUtils;

class PlatformViewWrapper$1
  implements ViewTreeObserver.OnGlobalFocusChangeListener
{
  public void onGlobalFocusChanged(View paramView1, View paramView2)
  {
    paramView1 = val$userFocusListener;
    paramView2 = this$0;
    paramView1.onFocusChange(paramView2, ViewUtils.childHasFocus(paramView2));
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugin.platform.PlatformViewWrapper.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */