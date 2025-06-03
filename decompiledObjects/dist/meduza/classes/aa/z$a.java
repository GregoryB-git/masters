package aa;

import android.net.Uri;
import android.text.TextUtils;

public final class z$a
{
  public final String a;
  public final String b;
  public final String[] c;
  public final String d;
  public final String e;
  public final String[] f;
  public final String g;
  public final String h;
  public final String i;
  public final String j;
  public final String k;
  public final String l;
  public final String m;
  public final Uri n;
  public final String o;
  public final Integer p;
  public final Integer q;
  public final Integer r;
  
  public z$a(s params)
  {
    a = params.j("gcm.n.title");
    b = params.g("gcm.n.title");
    Object[] arrayOfObject = params.f("gcm.n.title");
    Object localObject1 = null;
    int i1 = 0;
    int i2;
    if (arrayOfObject == null)
    {
      localObject2 = null;
    }
    else
    {
      localObject3 = new String[arrayOfObject.length];
      for (i2 = 0;; i2++)
      {
        localObject2 = localObject3;
        if (i2 >= arrayOfObject.length) {
          break;
        }
        localObject3[i2] = String.valueOf(arrayOfObject[i2]);
      }
    }
    c = ((String[])localObject2);
    d = params.j("gcm.n.body");
    e = params.g("gcm.n.body");
    Object localObject3 = params.f("gcm.n.body");
    if (localObject3 == null)
    {
      localObject2 = localObject1;
    }
    else
    {
      localObject1 = new String[localObject3.length];
      for (i2 = i1;; i2++)
      {
        localObject2 = localObject1;
        if (i2 >= localObject3.length) {
          break;
        }
        localObject1[i2] = String.valueOf(localObject3[i2]);
      }
    }
    f = ((String[])localObject2);
    g = params.j("gcm.n.icon");
    localObject1 = params.j("gcm.n.sound2");
    Object localObject2 = localObject1;
    if (TextUtils.isEmpty((CharSequence)localObject1)) {
      localObject2 = params.j("gcm.n.sound");
    }
    i = ((String)localObject2);
    j = params.j("gcm.n.tag");
    k = params.j("gcm.n.color");
    l = params.j("gcm.n.click_action");
    m = params.j("gcm.n.android_channel_id");
    n = params.e();
    h = params.j("gcm.n.image");
    o = params.j("gcm.n.ticker");
    p = params.b("gcm.n.notification_priority");
    q = params.b("gcm.n.visibility");
    r = params.b("gcm.n.notification_count");
    params.a("gcm.n.sticky");
    params.a("gcm.n.local_only");
    params.a("gcm.n.default_sound");
    params.a("gcm.n.default_vibrate_timings");
    params.a("gcm.n.default_light_settings");
    params.h();
    params.d();
    params.k();
  }
}

/* Location:
 * Qualified Name:     aa.z.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */