package androidx.browser.browseractions;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

class BrowserActionsFallbackMenuDialog$1
  extends AnimatorListenerAdapter
{
  public BrowserActionsFallbackMenuDialog$1(BrowserActionsFallbackMenuDialog paramBrowserActionsFallbackMenuDialog, boolean paramBoolean) {}
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    if (!val$isEnterAnimation) {
      BrowserActionsFallbackMenuDialog.access$001(this$0);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.browser.browseractions.BrowserActionsFallbackMenuDialog.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */