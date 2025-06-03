package androidx.appcompat.app;

import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.View.OnClickListener;

public final class AlertController$a
  implements View.OnClickListener
{
  public AlertController$a(AlertController paramAlertController) {}
  
  public final void onClick(View paramView)
  {
    AlertController localAlertController = a;
    Message localMessage;
    if (paramView == k)
    {
      localMessage = m;
      if (localMessage != null)
      {
        paramView = localMessage;
        break label46;
      }
    }
    if (paramView == o)
    {
      localMessage = q;
      if (localMessage != null)
      {
        paramView = localMessage;
        label46:
        paramView = Message.obtain(paramView);
        break label81;
      }
    }
    if (paramView == s)
    {
      paramView = u;
      if (paramView != null)
      {
        paramView = Message.obtain(paramView);
        break label81;
      }
    }
    paramView = null;
    label81:
    if (paramView != null) {
      paramView.sendToTarget();
    }
    paramView = a;
    L.obtainMessage(1, b).sendToTarget();
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.app.AlertController.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */