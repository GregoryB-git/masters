package io.flutter.plugin.editing;

import android.graphics.Insets;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsets.Builder;
import android.view.WindowInsets.Type;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation.Callback;
import java.util.Iterator;
import java.util.List;

class ImeSyncDeferringInsetsCallback$AnimationCallback
  extends WindowInsetsAnimation.Callback
{
  public ImeSyncDeferringInsetsCallback$AnimationCallback(ImeSyncDeferringInsetsCallback paramImeSyncDeferringInsetsCallback)
  {
    super(1);
  }
  
  public void onEnd(WindowInsetsAnimation paramWindowInsetsAnimation)
  {
    if ((ImeSyncDeferringInsetsCallback.access$300(this$0)) && ((paramWindowInsetsAnimation.getTypeMask() & ImeSyncDeferringInsetsCallback.access$200(this$0)) != 0))
    {
      ImeSyncDeferringInsetsCallback.access$302(this$0, false);
      if ((ImeSyncDeferringInsetsCallback.access$500(this$0) != null) && (ImeSyncDeferringInsetsCallback.access$400(this$0) != null)) {
        ImeSyncDeferringInsetsCallback.access$400(this$0).dispatchApplyWindowInsets(ImeSyncDeferringInsetsCallback.access$500(this$0));
      }
    }
  }
  
  public void onPrepare(WindowInsetsAnimation paramWindowInsetsAnimation)
  {
    ImeSyncDeferringInsetsCallback.access$102(this$0, true);
    if ((paramWindowInsetsAnimation.getTypeMask() & ImeSyncDeferringInsetsCallback.access$200(this$0)) != 0) {
      ImeSyncDeferringInsetsCallback.access$302(this$0, true);
    }
  }
  
  public WindowInsets onProgress(WindowInsets paramWindowInsets, List<WindowInsetsAnimation> paramList)
  {
    if ((ImeSyncDeferringInsetsCallback.access$300(this$0)) && (!ImeSyncDeferringInsetsCallback.access$100(this$0)))
    {
      paramList = paramList.iterator();
      int i = 0;
      while (paramList.hasNext()) {
        if ((((WindowInsetsAnimation)paramList.next()).getTypeMask() & ImeSyncDeferringInsetsCallback.access$200(this$0)) != 0) {
          i = 1;
        }
      }
      if (i == 0) {
        return paramWindowInsets;
      }
      i = ImeSyncDeferringInsetsCallback.access$400(this$0).getWindowSystemUiVisibility();
      if (((i & 0x200) == 0) && ((i & 0x2) == 0)) {
        i = getInsetsnavigationBarsbottom;
      } else {
        i = 0;
      }
      paramList = new WindowInsets.Builder(ImeSyncDeferringInsetsCallback.access$500(this$0));
      Insets localInsets = Insets.of(0, 0, 0, Math.max(getInsetsaccess$200this$0)).bottom - i, 0));
      paramList.setInsets(ImeSyncDeferringInsetsCallback.access$200(this$0), localInsets);
      ImeSyncDeferringInsetsCallback.access$400(this$0).onApplyWindowInsets(paramList.build());
    }
    return paramWindowInsets;
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback.AnimationCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */