package p2;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import q1.b;
import u1.c;

public final class s
  extends b
{
  public final Context c;
  
  public s(Context paramContext, int paramInt1, int paramInt2)
  {
    super(paramInt1, paramInt2);
    c = paramContext;
  }
  
  public final void a(c paramc)
  {
    if (b >= 10) {
      paramc.f("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[] { "reschedule_needed", Integer.valueOf(1) });
    } else {
      c.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
    }
  }
}

/* Location:
 * Qualified Name:     p2.s
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */