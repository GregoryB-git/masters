package l6;

import android.app.Activity;

public final class e
{
  public final Activity a;
  
  public e(Activity paramActivity)
  {
    if (paramActivity != null)
    {
      a = paramActivity;
      return;
    }
    throw new NullPointerException("Activity must not be null");
  }
}

/* Location:
 * Qualified Name:     l6.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */