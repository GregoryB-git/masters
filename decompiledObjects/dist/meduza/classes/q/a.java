package q;

import android.os.BaseBundle;
import android.os.Bundle;

public abstract interface a
{
  public abstract Bundle a();
  
  public static final class a
    implements a
  {
    public final Bundle a()
    {
      Bundle localBundle = new Bundle();
      localBundle.putInt("androidx.browser.trusted.displaymode.KEY_ID", 0);
      return localBundle;
    }
  }
  
  public static final class b
    implements a
  {
    public final boolean a;
    public final int b;
    
    public b(int paramInt, boolean paramBoolean)
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
}

/* Location:
 * Qualified Name:     q.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */