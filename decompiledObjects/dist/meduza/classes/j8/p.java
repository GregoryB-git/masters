package j8;

import android.os.BaseBundle;
import android.os.Bundle;
import h8.a;
import java.util.concurrent.Callable;

public final class p
  implements Callable<Void>
{
  public final Object call()
  {
    Bundle localBundle = new Bundle();
    localBundle.putInt("fatal", 1);
    localBundle.putLong("timestamp", a);
    b.k.d(localBundle);
    return null;
  }
}

/* Location:
 * Qualified Name:     j8.p
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */