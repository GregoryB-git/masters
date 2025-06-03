package androidx.appcompat.app;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ArrayAdapter;

class AlertController$AlertParams$1
  extends ArrayAdapter<CharSequence>
{
  public AlertController$AlertParams$1(AlertController.AlertParams paramAlertParams, Context paramContext, int paramInt1, int paramInt2, CharSequence[] paramArrayOfCharSequence, AlertController.RecycleListView paramRecycleListView)
  {
    super(paramContext, paramInt1, paramInt2, paramArrayOfCharSequence);
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    paramViewGroup = super.getView(paramInt, paramView, paramViewGroup);
    paramView = this$0.mCheckedItems;
    if ((paramView != null) && (paramView[paramInt] != 0)) {
      val$listView.setItemChecked(paramInt, true);
    }
    return paramViewGroup;
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.app.AlertController.AlertParams.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */