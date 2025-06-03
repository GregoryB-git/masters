package io.flutter.plugin.editing;

import android.view.View;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.WindowInsets;

class ImeSyncDeferringInsetsCallback$InsetsListener
  implements View.OnApplyWindowInsetsListener
{
  private ImeSyncDeferringInsetsCallback$InsetsListener(ImeSyncDeferringInsetsCallback paramImeSyncDeferringInsetsCallback) {}
  
  public WindowInsets onApplyWindowInsets(View paramView, WindowInsets paramWindowInsets)
  {
    ImeSyncDeferringInsetsCallback.access$402(this$0, paramView);
    if (ImeSyncDeferringInsetsCallback.access$100(this$0))
    {
      ImeSyncDeferringInsetsCallback.access$502(this$0, paramWindowInsets);
      ImeSyncDeferringInsetsCallback.access$102(this$0, false);
    }
    if (ImeSyncDeferringInsetsCallback.access$300(this$0)) {
      return WindowInsets.CONSUMED;
    }
    return paramView.onApplyWindowInsets(paramWindowInsets);
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback.InsetsListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */