package w2;

import android.os.BaseBundle;
import android.os.Bundle;

public final class s
  extends t
{
  public s(int paramInt1, int paramInt2, Bundle paramBundle)
  {
    super(paramInt1, 2, paramBundle);
  }
  
  public final void a(Bundle paramBundle)
  {
    if (paramBundle.getBoolean("ack", false))
    {
      d(null);
      return;
    }
    c(new u(4, "Invalid response to one way request", null));
  }
  
  public final boolean b()
  {
    return true;
  }
}

/* Location:
 * Qualified Name:     w2.s
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */