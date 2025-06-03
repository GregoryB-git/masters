package com.afollestad.materialdialogs.internal;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.OnScrollListener;

class MDRootLayout$2
  extends RecyclerView.OnScrollListener
{
  public MDRootLayout$2(MDRootLayout paramMDRootLayout, ViewGroup paramViewGroup, boolean paramBoolean1, boolean paramBoolean2) {}
  
  public void onScrolled(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
  {
    super.onScrolled(paramRecyclerView, paramInt1, paramInt2);
    paramRecyclerView = MDRootLayout.access$400(this$0);
    paramInt2 = paramRecyclerView.length;
    boolean bool1 = false;
    boolean bool2;
    for (paramInt1 = 0;; paramInt1++)
    {
      bool2 = bool1;
      if (paramInt1 >= paramInt2) {
        break;
      }
      Object localObject = paramRecyclerView[paramInt1];
      if ((localObject != null) && (((View)localObject).getVisibility() != 8))
      {
        bool2 = true;
        break;
      }
    }
    MDRootLayout.access$500(this$0, val$vg, val$setForTop, val$setForBottom, bool2);
    this$0.invalidate();
  }
}

/* Location:
 * Qualified Name:     com.afollestad.materialdialogs.internal.MDRootLayout.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */