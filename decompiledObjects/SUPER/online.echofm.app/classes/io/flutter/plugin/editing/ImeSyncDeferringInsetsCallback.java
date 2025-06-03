package io.flutter.plugin.editing;

import I.B;
import I.F;
import I.M;
import I.N;
import I.P;
import I.S;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.view.View;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.WindowInsets;
import android.view.WindowInsets.Builder;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation.Callback;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import java.util.Iterator;
import java.util.List;

@SuppressLint({"NewApi", "Override"})
@TargetApi(30)
@Keep
class ImeSyncDeferringInsetsCallback
{
  private boolean animating = false;
  private AnimationCallback animationCallback;
  private final int deferredInsetTypes = S.a();
  private b insetsListener;
  private WindowInsets lastWindowInsets;
  private boolean needsSave = false;
  private View view;
  
  public ImeSyncDeferringInsetsCallback(@NonNull View paramView)
  {
    view = paramView;
    animationCallback = new AnimationCallback();
    insetsListener = new b(null);
  }
  
  public WindowInsetsAnimation.Callback getAnimationCallback()
  {
    return animationCallback;
  }
  
  public View.OnApplyWindowInsetsListener getInsetsListener()
  {
    return insetsListener;
  }
  
  public void install()
  {
    b.a(view, animationCallback);
    view.setOnApplyWindowInsetsListener(insetsListener);
  }
  
  public void remove()
  {
    b.a(view, null);
    view.setOnApplyWindowInsetsListener(null);
  }
  
  @Keep
  public class AnimationCallback
    extends WindowInsetsAnimation.Callback
  {
    public AnimationCallback()
    {
      super();
    }
    
    public void onEnd(WindowInsetsAnimation paramWindowInsetsAnimation)
    {
      if ((ImeSyncDeferringInsetsCallback.access$300(ImeSyncDeferringInsetsCallback.this)) && ((c.a(paramWindowInsetsAnimation) & ImeSyncDeferringInsetsCallback.access$200(ImeSyncDeferringInsetsCallback.this)) != 0))
      {
        ImeSyncDeferringInsetsCallback.access$302(ImeSyncDeferringInsetsCallback.this, false);
        if ((ImeSyncDeferringInsetsCallback.access$500(ImeSyncDeferringInsetsCallback.this) != null) && (ImeSyncDeferringInsetsCallback.access$400(ImeSyncDeferringInsetsCallback.this) != null)) {
          ImeSyncDeferringInsetsCallback.access$400(ImeSyncDeferringInsetsCallback.this).dispatchApplyWindowInsets(ImeSyncDeferringInsetsCallback.access$500(ImeSyncDeferringInsetsCallback.this));
        }
      }
    }
    
    public void onPrepare(WindowInsetsAnimation paramWindowInsetsAnimation)
    {
      ImeSyncDeferringInsetsCallback.access$102(ImeSyncDeferringInsetsCallback.this, true);
      if ((c.a(paramWindowInsetsAnimation) & ImeSyncDeferringInsetsCallback.access$200(ImeSyncDeferringInsetsCallback.this)) != 0) {
        ImeSyncDeferringInsetsCallback.access$302(ImeSyncDeferringInsetsCallback.this, true);
      }
    }
    
    public WindowInsets onProgress(WindowInsets paramWindowInsets, List<WindowInsetsAnimation> paramList)
    {
      if ((ImeSyncDeferringInsetsCallback.access$300(ImeSyncDeferringInsetsCallback.this)) && (!ImeSyncDeferringInsetsCallback.access$100(ImeSyncDeferringInsetsCallback.this)))
      {
        paramList = paramList.iterator();
        int i = 0;
        while (paramList.hasNext()) {
          if ((c.a(d.a(paramList.next())) & ImeSyncDeferringInsetsCallback.access$200(ImeSyncDeferringInsetsCallback.this)) != 0) {
            i = 1;
          }
        }
        if (i == 0) {
          return paramWindowInsets;
        }
        i = ImeSyncDeferringInsetsCallback.access$400(ImeSyncDeferringInsetsCallback.this).getWindowSystemUiVisibility();
        if (((i & 0x200) == 0) && ((i & 0x2) == 0)) {
          i = A.e.a(M.a(paramWindowInsets, P.a()));
        } else {
          i = 0;
        }
        g.a();
        WindowInsets.Builder localBuilder = F.a(ImeSyncDeferringInsetsCallback.access$500(ImeSyncDeferringInsetsCallback.this));
        paramList = e.a(0, 0, 0, Math.max(A.e.a(M.a(paramWindowInsets, ImeSyncDeferringInsetsCallback.access$200(ImeSyncDeferringInsetsCallback.this))) - i, 0));
        f.a(localBuilder, ImeSyncDeferringInsetsCallback.access$200(ImeSyncDeferringInsetsCallback.this), paramList);
        ImeSyncDeferringInsetsCallback.access$400(ImeSyncDeferringInsetsCallback.this).onApplyWindowInsets(B.a(localBuilder));
      }
      return paramWindowInsets;
    }
  }
  
  public class b
    implements View.OnApplyWindowInsetsListener
  {
    public b() {}
    
    public WindowInsets onApplyWindowInsets(View paramView, WindowInsets paramWindowInsets)
    {
      ImeSyncDeferringInsetsCallback.access$402(ImeSyncDeferringInsetsCallback.this, paramView);
      if (ImeSyncDeferringInsetsCallback.access$100(ImeSyncDeferringInsetsCallback.this))
      {
        ImeSyncDeferringInsetsCallback.access$502(ImeSyncDeferringInsetsCallback.this, paramWindowInsets);
        ImeSyncDeferringInsetsCallback.access$102(ImeSyncDeferringInsetsCallback.this, false);
      }
      if (ImeSyncDeferringInsetsCallback.access$300(ImeSyncDeferringInsetsCallback.this)) {
        return N.a();
      }
      return paramView.onApplyWindowInsets(paramWindowInsets);
    }
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */