package pa;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import b1.t;
import com.jhomlala.better_player.ImageWorker;
import ec.i;
import java.util.HashMap;
import java.util.Set;
import o2.l;
import o2.l.a;
import o2.p;
import o2.q;
import o2.q.a;
import p2.k0;
import s5.c.a;
import s5.c.c;
import v3.f1;

public final class b$d
  implements c.c
{
  public b$d(String paramString1, Context paramContext, String paramString2, String paramString3, String paramString4, b paramb) {}
  
  public final CharSequence a(f1 paramf1)
  {
    i.e(paramf1, "player");
    return a;
  }
  
  public final Bitmap b(f1 paramf1, c.a parama)
  {
    i.e(paramf1, "player");
    if (e == null) {
      return null;
    }
    paramf1 = f.m;
    if (paramf1 != null) {
      return paramf1;
    }
    paramf1 = new l.a(ImageWorker.class);
    Object localObject = e;
    i.e(localObject, "tag");
    d.add(localObject);
    localObject = new HashMap();
    ((HashMap)localObject).put("url", e);
    localObject = new androidx.work.c((HashMap)localObject);
    androidx.work.c.e((androidx.work.c)localObject);
    c.e = ((androidx.work.c)localObject);
    paramf1 = paramf1.a();
    i.d(paramf1, "build(...)");
    localObject = (l)paramf1;
    f.p.a((q)localObject);
    paramf1 = new c(f, (l)localObject, parama);
    parama = a;
    i.d(parama, "getId(...)");
    f.p.e(parama).observeForever(paramf1);
    f.q.put(parama, paramf1);
    return null;
  }
  
  public final PendingIntent d(f1 paramf1)
  {
    i.e(paramf1, "player");
    paramf1 = b.getApplicationContext().getPackageName();
    Intent localIntent = new Intent();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramf1);
    localStringBuilder.append('.');
    localStringBuilder.append(c);
    localIntent.setClassName(paramf1, localStringBuilder.toString());
    localIntent.setFlags(603979776);
    return PendingIntent.getActivity(b, 0, localIntent, 67108864);
  }
  
  public final CharSequence e(f1 paramf1)
  {
    i.e(paramf1, "player");
    return d;
  }
}

/* Location:
 * Qualified Name:     pa.b.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */