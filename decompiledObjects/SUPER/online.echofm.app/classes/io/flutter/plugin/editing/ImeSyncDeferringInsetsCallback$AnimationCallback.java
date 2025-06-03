package io.flutter.plugin.editing;

import I.B;
import I.F;
import I.M;
import I.P;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsets.Builder;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation.Callback;
import androidx.annotation.Keep;
import java.util.Iterator;
import java.util.List;

@Keep
class ImeSyncDeferringInsetsCallback$AnimationCallback
  extends WindowInsetsAnimation.Callback
{
  public ImeSyncDeferringInsetsCallback$AnimationCallback(ImeSyncDeferringInsetsCallback paramImeSyncDeferringInsetsCallback)
  {
    super(1);
  }
  
  public void onEnd(WindowInsetsAnimation paramWindowInsetsAnimation)
  {
    if ((ImeSyncDeferringInsetsCallback.access$300(this$0)) && ((c.a(paramWindowInsetsAnimation) & ImeSyncDeferringInsetsCallback.access$200(this$0)) != 0))
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
    if ((c.a(paramWindowInsetsAnimation) & ImeSyncDeferringInsetsCallback.access$200(this$0)) != 0) {
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
        if ((c.a(d.a(paramList.next())) & ImeSyncDeferringInsetsCallback.access$200(this$0)) != 0) {
          i = 1;
        }
      }
      if (i == 0) {
        return paramWindowInsets;
      }
      i = ImeSyncDeferringInsetsCallback.access$400(this$0).getWindowSystemUiVisibility();
      if (((i & 0x200) == 0) && ((i & 0x2) == 0)) {
        i = A.e.a(M.a(paramWindowInsets, P.a()));
      } else {
        i = 0;
      }
      g.a();
      WindowInsets.Builder localBuilder = F.a(ImeSyncDeferringInsetsCallback.access$500(this$0));
      paramList = e.a(0, 0, 0, Math.max(A.e.a(M.a(paramWindowInsets, ImeSyncDeferringInsetsCallback.access$200(this$0))) - i, 0));
      f.a(localBuilder, ImeSyncDeferringInsetsCallback.access$200(this$0), paramList);
      ImeSyncDeferringInsetsCallback.access$400(this$0).onApplyWindowInsets(B.a(localBuilder));
    }
    return paramWindowInsets;
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback.AnimationCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */