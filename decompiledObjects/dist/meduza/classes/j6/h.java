package j6;

import android.content.Intent;

public final class h
  extends Exception
{
  public final Intent a;
  public final int b;
  
  public h(int paramInt, Intent paramIntent)
  {
    super("Google Play Services not available");
    a = paramIntent;
    b = paramInt;
  }
}

/* Location:
 * Qualified Name:     j6.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */