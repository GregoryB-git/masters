package androidx.fragment.app;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

public class d$b
  implements DialogInterface.OnCancelListener
{
  public d$b(d paramd) {}
  
  public void onCancel(DialogInterface paramDialogInterface)
  {
    if (d.H1(o) != null)
    {
      paramDialogInterface = o;
      paramDialogInterface.onCancel(d.H1(paramDialogInterface));
    }
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.d.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */