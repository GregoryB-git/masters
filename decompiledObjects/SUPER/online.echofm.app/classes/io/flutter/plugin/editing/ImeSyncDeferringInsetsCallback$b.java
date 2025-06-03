package io.flutter.plugin.editing;

import I.N;
import android.view.View;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.WindowInsets;

public class ImeSyncDeferringInsetsCallback$b
  implements View.OnApplyWindowInsetsListener
{
  public ImeSyncDeferringInsetsCallback$b(ImeSyncDeferringInsetsCallback paramImeSyncDeferringInsetsCallback) {}
  
  public WindowInsets onApplyWindowInsets(View paramView, WindowInsets paramWindowInsets)
  {
    ImeSyncDeferringInsetsCallback.access$402(a, paramView);
    if (ImeSyncDeferringInsetsCallback.access$100(a))
    {
      ImeSyncDeferringInsetsCallback.access$502(a, paramWindowInsets);
      ImeSyncDeferringInsetsCallback.access$102(a, false);
    }
    if (ImeSyncDeferringInsetsCallback.access$300(a)) {
      return N.a();
    }
    return paramView.onApplyWindowInsets(paramWindowInsets);
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */