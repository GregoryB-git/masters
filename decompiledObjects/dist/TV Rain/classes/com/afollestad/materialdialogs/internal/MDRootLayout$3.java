package com.afollestad.materialdialogs.internal;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.webkit.WebView;

class MDRootLayout$3
  implements ViewTreeObserver.OnScrollChangedListener
{
  public MDRootLayout$3(MDRootLayout paramMDRootLayout, ViewGroup paramViewGroup, boolean paramBoolean1, boolean paramBoolean2) {}
  
  public void onScrollChanged()
  {
    Object localObject1 = MDRootLayout.access$400(this$0);
    int i = localObject1.length;
    boolean bool1 = false;
    boolean bool2;
    for (int j = 0;; j++)
    {
      bool2 = bool1;
      if (j >= i) {
        break;
      }
      Object localObject2 = localObject1[j];
      if ((localObject2 != null) && (((View)localObject2).getVisibility() != 8))
      {
        bool2 = true;
        break;
      }
    }
    localObject1 = val$vg;
    if ((localObject1 instanceof WebView)) {
      MDRootLayout.access$600(this$0, (WebView)localObject1, val$setForTop, val$setForBottom, bool2);
    } else {
      MDRootLayout.access$500(this$0, (ViewGroup)localObject1, val$setForTop, val$setForBottom, bool2);
    }
    this$0.invalidate();
  }
}

/* Location:
 * Qualified Name:     com.afollestad.materialdialogs.internal.MDRootLayout.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */