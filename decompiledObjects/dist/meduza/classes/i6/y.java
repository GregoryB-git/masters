package i6;

import android.os.Bundle;

public final class y
  extends x
{
  public y(int paramInt1, int paramInt2, Bundle paramBundle)
  {
    super(paramInt1, paramInt2, paramBundle);
  }
  
  public final void a(Bundle paramBundle)
  {
    Bundle localBundle = paramBundle.getBundle("data");
    paramBundle = localBundle;
    if (localBundle == null) {
      paramBundle = Bundle.EMPTY;
    }
    d(paramBundle);
  }
  
  public final boolean b()
  {
    return false;
  }
}

/* Location:
 * Qualified Name:     i6.y
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */