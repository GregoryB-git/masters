package androidx.appcompat.app;

import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.View.OnClickListener;

class AlertController$1
  implements View.OnClickListener
{
  public AlertController$1(AlertController paramAlertController) {}
  
  public void onClick(View paramView)
  {
    AlertController localAlertController = this$0;
    Message localMessage;
    if (paramView == mButtonPositive)
    {
      localMessage = mButtonPositiveMessage;
      if (localMessage != null)
      {
        paramView = Message.obtain(localMessage);
        break label82;
      }
    }
    if (paramView == mButtonNegative)
    {
      localMessage = mButtonNegativeMessage;
      if (localMessage != null)
      {
        paramView = Message.obtain(localMessage);
        break label82;
      }
    }
    if (paramView == mButtonNeutral)
    {
      paramView = mButtonNeutralMessage;
      if (paramView != null)
      {
        paramView = Message.obtain(paramView);
        break label82;
      }
    }
    paramView = null;
    label82:
    if (paramView != null) {
      paramView.sendToTarget();
    }
    paramView = this$0;
    mHandler.obtainMessage(1, mDialog).sendToTarget();
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.app.AlertController.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */