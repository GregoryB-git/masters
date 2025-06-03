package com.afollestad.materialdialogs;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import androidx.recyclerview.widget.RecyclerView.LayoutManager;
import java.util.Collections;
import java.util.List;

class MaterialDialog$1
  implements ViewTreeObserver.OnGlobalLayoutListener
{
  public MaterialDialog$1(MaterialDialog paramMaterialDialog) {}
  
  public void onGlobalLayout()
  {
    this$0.recyclerView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    Object localObject = this$0;
    MaterialDialog.ListType localListType1 = listType;
    MaterialDialog.ListType localListType2 = MaterialDialog.ListType.SINGLE;
    if ((localListType1 == localListType2) || (localListType1 == MaterialDialog.ListType.MULTI))
    {
      final int j;
      if (localListType1 == localListType2)
      {
        int i = builder.selectedIndex;
        j = i;
        if (i >= 0) {}
      }
      else
      {
        localObject = selectedIndicesList;
        if ((localObject == null) || (((List)localObject).size() == 0)) {
          return;
        }
        Collections.sort(this$0.selectedIndicesList);
        j = ((Integer)this$0.selectedIndicesList.get(0)).intValue();
      }
      this$0.recyclerView.post(new Runnable()
      {
        public void run()
        {
          this$0.recyclerView.requestFocus();
          this$0.builder.layoutManager.scrollToPosition(j);
        }
      });
    }
  }
}

/* Location:
 * Qualified Name:     com.afollestad.materialdialogs.MaterialDialog.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */