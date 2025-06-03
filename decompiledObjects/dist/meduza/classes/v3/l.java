package v3;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.provider.Settings.Global;
import h5.n;
import java.util.ArrayList;
import o4.h;
import v5.e0;
import w5.g;
import x3.e;
import x3.e.a;
import x3.s;
import x3.s.e;
import x3.s.g;
import x3.x;
import x5.b;

public final class l
  implements m1
{
  public final Context a;
  public final h b;
  public boolean c;
  
  public l(Context paramContext)
  {
    a = paramContext;
    b = new h();
  }
  
  public final j1[] a(Handler paramHandler, d0.b paramb1, d0.b paramb2, d0.b paramb3, d0.b paramb4)
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(new g(a, b, paramHandler, paramb1));
    Context localContext = a;
    int i = c;
    s.e locale = new s.e();
    paramb1 = localContext.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
    int j = e0.a;
    int k = 1;
    if (j >= 17)
    {
      String str = e0.c;
      if (("Amazon".equals(str)) || ("Xiaomi".equals(str)))
      {
        m = 1;
        break label118;
      }
    }
    int m = 0;
    label118:
    if ((m != 0) && (Settings.Global.getInt(localContext.getContentResolver(), "external_surround_sound_enabled", 0) == 1))
    {
      paramb1 = e.d;
    }
    else
    {
      if (j >= 29) {
        if (!e0.H(localContext))
        {
          if ((j >= 23) && (localContext.getPackageManager().hasSystemFeature("android.hardware.type.automotive"))) {
            m = k;
          } else {
            m = 0;
          }
          if (m == 0) {}
        }
        else
        {
          paramb1 = new e(e.a.a(), 8);
          break label257;
        }
      }
      if ((paramb1 != null) && (paramb1.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 0)) {
        paramb1 = new e(paramb1.getIntArrayExtra("android.media.extra.ENCODINGS"), paramb1.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 8));
      } else {
        paramb1 = e.c;
      }
    }
    label257:
    paramb1.getClass();
    a = paramb1;
    c = false;
    d = false;
    e = i;
    if (b == null) {
      b = new s.g(new x3.f[0]);
    }
    paramb1 = new s(locale);
    localArrayList.add(new x(a, b, paramHandler, paramb2, paramb1));
    localArrayList.add(new n(paramb3, paramHandler.getLooper()));
    localArrayList.add(new p4.f(paramb4, paramHandler.getLooper()));
    localArrayList.add(new b());
    return (j1[])localArrayList.toArray(new j1[0]);
  }
}

/* Location:
 * Qualified Name:     v3.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */