package l6;

import android.os.Handler;
import com.google.android.gms.internal.base.zau;

public final class z
  implements b.a
{
  public z(d paramd) {}
  
  public final void a(boolean paramBoolean)
  {
    zau localzau = a.v;
    localzau.sendMessage(localzau.obtainMessage(1, Boolean.valueOf(paramBoolean)));
  }
}

/* Location:
 * Qualified Name:     l6.z
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */