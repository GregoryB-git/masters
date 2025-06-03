package io.flutter.plugin.editing;

import android.graphics.Insets;
import android.view.View;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.WindowInsets;
import android.view.WindowInsets.Builder;
import android.view.WindowInsets.Type;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation.Callback;
import e0.f0;
import e0.g0;
import java.util.Iterator;
import java.util.List;

class ImeSyncDeferringInsetsCallback
{
  private boolean animating = false;
  private AnimationCallback animationCallback;
  private final int deferredInsetTypes = WindowInsets.Type.ime();
  private InsetsListener insetsListener;
  private WindowInsets lastWindowInsets;
  private boolean needsSave = false;
  private View view;
  
  public ImeSyncDeferringInsetsCallback(View paramView)
  {
    view = paramView;
    animationCallback = new AnimationCallback();
    insetsListener = new InsetsListener(null);
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
    g0.f(view, animationCallback);
    view.setOnApplyWindowInsetsListener(insetsListener);
  }
  
  public void remove()
  {
    f0.f(view);
    view.setOnApplyWindowInsetsListener(null);
  }
  
  public class AnimationCallback
    extends WindowInsetsAnimation.Callback
  {
    public AnimationCallback()
    {
      super();
    }
    
    public void onEnd(WindowInsetsAnimation paramWindowInsetsAnimation)
    {
      if ((ImeSyncDeferringInsetsCallback.access$300(ImeSyncDeferringInsetsCallback.this)) && ((paramWindowInsetsAnimation.getTypeMask() & ImeSyncDeferringInsetsCallback.access$200(ImeSyncDeferringInsetsCallback.this)) != 0))
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
      if ((paramWindowInsetsAnimation.getTypeMask() & ImeSyncDeferringInsetsCallback.access$200(ImeSyncDeferringInsetsCallback.this)) != 0) {
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
          if ((((WindowInsetsAnimation)paramList.next()).getTypeMask() & ImeSyncDeferringInsetsCallback.access$200(ImeSyncDeferringInsetsCallback.this)) != 0) {
            i = 1;
          }
        }
        if (i == 0) {
          return paramWindowInsets;
        }
        i = ImeSyncDeferringInsetsCallback.access$400(ImeSyncDeferringInsetsCallback.this).getWindowSystemUiVisibility();
        if (((i & 0x200) == 0) && ((i & 0x2) == 0)) {
          i = getInsetsnavigationBarsbottom;
        } else {
          i = 0;
        }
        paramList = new WindowInsets.Builder(ImeSyncDeferringInsetsCallback.access$500(ImeSyncDeferringInsetsCallback.this));
        Insets localInsets = Insets.of(0, 0, 0, Math.max(getInsetsaccess$200bottom - i, 0));
        paramList.setInsets(ImeSyncDeferringInsetsCallback.access$200(ImeSyncDeferringInsetsCallback.this), localInsets);
        ImeSyncDeferringInsetsCallback.access$400(ImeSyncDeferringInsetsCallback.this).onApplyWindowInsets(paramList.build());
      }
      return paramWindowInsets;
    }
  }
  
  public class InsetsListener
    implements View.OnApplyWindowInsetsListener
  {
    private InsetsListener() {}
    
    public WindowInsets onApplyWindowInsets(View paramView, WindowInsets paramWindowInsets)
    {
      ImeSyncDeferringInsetsCallback.access$402(ImeSyncDeferringInsetsCallback.this, paramView);
      if (ImeSyncDeferringInsetsCallback.access$100(ImeSyncDeferringInsetsCallback.this))
      {
        ImeSyncDeferringInsetsCallback.access$502(ImeSyncDeferringInsetsCallback.this, paramWindowInsets);
        ImeSyncDeferringInsetsCallback.access$102(ImeSyncDeferringInsetsCallback.this, false);
      }
      if (ImeSyncDeferringInsetsCallback.access$300(ImeSyncDeferringInsetsCallback.this)) {
        return WindowInsets.CONSUMED;
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