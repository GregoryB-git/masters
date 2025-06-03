package b;

import android.text.TextUtils;

public final class j$e
  implements Runnable
{
  public j$e(j paramj) {}
  
  public final void run()
  {
    try
    {
      j.access$001(a);
    }
    catch (NullPointerException localNullPointerException)
    {
      if (!TextUtils.equals(localNullPointerException.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
        throw localNullPointerException;
      }
    }
    catch (IllegalStateException localIllegalStateException)
    {
      if (!TextUtils.equals(localIllegalStateException.getMessage(), "Can not perform this action after onSaveInstanceState")) {
        break label42;
      }
    }
    return;
    label42:
    throw localIllegalStateException;
  }
}

/* Location:
 * Qualified Name:     b.j.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */