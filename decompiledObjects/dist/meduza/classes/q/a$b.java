package q;

import android.os.BaseBundle;
import android.os.Bundle;

public final class a$b
  implements a
{
  public final boolean a;
  public final int b;
  
  public a$b(int paramInt, boolean paramBoolean)
  {
    a = paramBoolean;
    b = paramInt;
  }
  
  public final Bundle a()
  {
    Bundle localBundle = new Bundle();
    localBundle.putInt("androidx.browser.trusted.displaymode.KEY_ID", 1);
    localBundle.putBoolean("androidx.browser.trusted.displaymode.KEY_STICKY", a);
    localBundle.putInt("androidx.browser.trusted.displaymode.KEY_CUTOUT_MODE", b);
    return localBundle;
  }
}

/* Location:
 * Qualified Name:     q.a.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */