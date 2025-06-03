package i6;

import android.os.BaseBundle;
import android.os.Bundle;
import z3.f;

public final class w
  extends x
{
  public w(int paramInt1, int paramInt2, Bundle paramBundle)
  {
    super(paramInt1, paramInt2, paramBundle);
  }
  
  public final void a(Bundle paramBundle)
  {
    if (paramBundle.getBoolean("ack", false))
    {
      d(null);
      return;
    }
    c(new f("Invalid response to one way request", null));
  }
  
  public final boolean b()
  {
    return true;
  }
}

/* Location:
 * Qualified Name:     i6.w
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */