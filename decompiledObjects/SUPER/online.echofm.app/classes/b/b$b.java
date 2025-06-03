package b;

import android.os.Bundle;
import android.os.Handler;

public class b$b
  extends a.a
{
  public b$b(b paramb) {}
  
  public void T0(int paramInt, Bundle paramBundle)
  {
    b localb = b;
    Handler localHandler = p;
    if (localHandler != null) {
      localHandler.post(new b.c(localb, paramInt, paramBundle));
    } else {
      localb.a(paramInt, paramBundle);
    }
  }
}

/* Location:
 * Qualified Name:     b.b.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */