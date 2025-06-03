package androidx.activity;

import android.text.TextUtils;

public class ComponentActivity$a
  implements Runnable
{
  public ComponentActivity$a(ComponentActivity paramComponentActivity) {}
  
  public void run()
  {
    try
    {
      ComponentActivity.e(o);
    }
    catch (IllegalStateException localIllegalStateException)
    {
      if (!TextUtils.equals(localIllegalStateException.getMessage(), "Can not perform this action after onSaveInstanceState")) {
        break label24;
      }
    }
    return;
    label24:
    throw localIllegalStateException;
  }
}

/* Location:
 * Qualified Name:     androidx.activity.ComponentActivity.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */