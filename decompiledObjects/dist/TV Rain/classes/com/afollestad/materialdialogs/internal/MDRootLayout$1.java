package com.afollestad.materialdialogs.internal;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.webkit.WebView;

class MDRootLayout$1
  implements ViewTreeObserver.OnPreDrawListener
{
  public MDRootLayout$1(MDRootLayout paramMDRootLayout, View paramView, boolean paramBoolean1, boolean paramBoolean2) {}
  
  public boolean onPreDraw()
  {
    if (val$view.getMeasuredHeight() != 0)
    {
      if (!MDRootLayout.access$000((WebView)val$view))
      {
        if (val$setForTop) {
          MDRootLayout.access$102(this$0, false);
        }
        if (val$setForBottom) {
          MDRootLayout.access$202(this$0, false);
        }
      }
      else
      {
        MDRootLayout.access$300(this$0, (ViewGroup)val$view, val$setForTop, val$setForBottom);
      }
      val$view.getViewTreeObserver().removeOnPreDrawListener(this);
    }
    return true;
  }
}

/* Location:
 * Qualified Name:     com.afollestad.materialdialogs.internal.MDRootLayout.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */