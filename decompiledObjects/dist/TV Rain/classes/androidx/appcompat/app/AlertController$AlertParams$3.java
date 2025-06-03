package androidx.appcompat.app;

import android.content.DialogInterface.OnClickListener;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

class AlertController$AlertParams$3
  implements AdapterView.OnItemClickListener
{
  public AlertController$AlertParams$3(AlertController.AlertParams paramAlertParams, AlertController paramAlertController) {}
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    this$0.mOnClickListener.onClick(val$dialog.mDialog, paramInt);
    if (!this$0.mIsSingleChoice) {
      val$dialog.mDialog.dismiss();
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.app.AlertController.AlertParams.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */