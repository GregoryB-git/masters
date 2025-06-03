package com.afollestad.materialdialogs;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView.LayoutManager;

class MaterialDialog$1$1
  implements Runnable
{
  public MaterialDialog$1$1(MaterialDialog.1 param1, int paramInt) {}
  
  public void run()
  {
    this$1.this$0.recyclerView.requestFocus();
    this$1.this$0.builder.layoutManager.scrollToPosition(val$fSelectedIndex);
  }
}

/* Location:
 * Qualified Name:     com.afollestad.materialdialogs.MaterialDialog.1.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */