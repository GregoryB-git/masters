package androidx.activity;

import android.text.TextUtils;

class ComponentActivity$1
  implements Runnable
{
  public ComponentActivity$1(ComponentActivity paramComponentActivity) {}
  
  public void run()
  {
    try
    {
      ComponentActivity.access$001(this$0);
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
 * Qualified Name:     androidx.activity.ComponentActivity.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */