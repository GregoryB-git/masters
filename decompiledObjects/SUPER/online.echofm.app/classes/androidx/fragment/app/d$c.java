package androidx.fragment.app;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;

public class d$c
  implements DialogInterface.OnDismissListener
{
  public d$c(d paramd) {}
  
  public void onDismiss(DialogInterface paramDialogInterface)
  {
    if (d.H1(o) != null)
    {
      paramDialogInterface = o;
      paramDialogInterface.onDismiss(d.H1(paramDialogInterface));
    }
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.d.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */