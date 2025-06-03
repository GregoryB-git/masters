package s5;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.media.session.MediaSessionCompat.Token;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import u.n;
import u.q;
import u.s;
import u.u;
import v3.e1;
import v3.f1;
import v3.f1.b;
import v3.f1.c;
import v3.j0;
import v3.r1;
import v5.e0;

public final class c
{
  public static int G;
  public boolean A;
  public int B;
  public int C;
  public int D;
  public boolean E;
  public String F;
  public final Context a;
  public final String b;
  public final int c;
  public final c d;
  public final Handler e;
  public final u f;
  public final IntentFilter g;
  public final f h;
  public final d i;
  public final HashMap j;
  public final Map<String, n> k;
  public final PendingIntent l;
  public final int m;
  public q n;
  public ArrayList o;
  public f1 p;
  public boolean q;
  public int r;
  public MediaSessionCompat.Token s;
  public boolean t;
  public boolean u;
  public boolean v;
  public boolean w;
  public boolean x;
  public boolean y;
  public int z;
  
  public c(Context paramContext, String paramString, int paramInt1, c paramc, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9)
  {
    paramContext = paramContext.getApplicationContext();
    a = paramContext;
    b = paramString;
    c = paramInt1;
    d = paramc;
    B = paramInt2;
    F = null;
    paramInt2 = G;
    G = paramInt2 + 1;
    m = paramInt2;
    paramString = Looper.getMainLooper();
    paramc = new b(this, 0);
    paramInt1 = e0.a;
    e = new Handler(paramString, paramc);
    f = new u(paramContext);
    h = new f();
    i = new d();
    g = new IntentFilter();
    t = true;
    u = true;
    x = true;
    v = true;
    w = true;
    A = true;
    E = true;
    D = -1;
    z = 1;
    C = 1;
    paramString = new HashMap();
    paramString.put("com.google.android.exoplayer.play", new n(paramInt3, paramContext.getString(2131886155), a(paramContext, "com.google.android.exoplayer.play", paramInt2)));
    paramString.put("com.google.android.exoplayer.pause", new n(paramInt4, paramContext.getString(2131886154), a(paramContext, "com.google.android.exoplayer.pause", paramInt2)));
    paramString.put("com.google.android.exoplayer.stop", new n(paramInt5, paramContext.getString(2131886167), a(paramContext, "com.google.android.exoplayer.stop", paramInt2)));
    paramString.put("com.google.android.exoplayer.rewind", new n(paramInt6, paramContext.getString(2131886161), a(paramContext, "com.google.android.exoplayer.rewind", paramInt2)));
    paramString.put("com.google.android.exoplayer.ffwd", new n(paramInt7, paramContext.getString(2131886147), a(paramContext, "com.google.android.exoplayer.ffwd", paramInt2)));
    paramString.put("com.google.android.exoplayer.prev", new n(paramInt8, paramContext.getString(2131886157), a(paramContext, "com.google.android.exoplayer.prev", paramInt2)));
    paramString.put("com.google.android.exoplayer.next", new n(paramInt9, paramContext.getString(2131886151), a(paramContext, "com.google.android.exoplayer.next", paramInt2)));
    j = paramString;
    paramc = paramString.keySet().iterator();
    while (paramc.hasNext())
    {
      paramString = (String)paramc.next();
      g.addAction(paramString);
    }
    paramString = Collections.emptyMap();
    k = paramString;
    paramString = paramString.keySet().iterator();
    while (paramString.hasNext())
    {
      paramc = (String)paramString.next();
      g.addAction(paramc);
    }
    l = a(paramContext, "com.google.android.exoplayer.dismiss", m);
    g.addAction("com.google.android.exoplayer.dismiss");
  }
  
  public static PendingIntent a(Context paramContext, String paramString, int paramInt)
  {
    paramString = new Intent(paramString).setPackage(paramContext.getPackageName());
    paramString.putExtra("INSTANCE_ID", paramInt);
    int i1;
    if (e0.a >= 23) {
      i1 = 201326592;
    } else {
      i1 = 134217728;
    }
    return PendingIntent.getBroadcast(paramContext, paramInt, paramString, i1);
  }
  
  public final void b(j0 paramj0)
  {
    Object localObject = Looper.myLooper();
    Looper localLooper = Looper.getMainLooper();
    boolean bool1 = true;
    if (localObject == localLooper) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    x6.b.H(bool2);
    boolean bool2 = bool1;
    if (paramj0 != null) {
      if (paramj0.K() == Looper.getMainLooper()) {
        bool2 = bool1;
      } else {
        bool2 = false;
      }
    }
    x6.b.q(bool2);
    localObject = p;
    if (localObject == paramj0) {
      return;
    }
    if (localObject != null)
    {
      ((f1)localObject).h(h);
      if (paramj0 == null) {
        d(false);
      }
    }
    p = paramj0;
    if (paramj0 != null)
    {
      paramj0.s(h);
      if (!e.hasMessages(0)) {
        e.sendEmptyMessage(0);
      }
    }
  }
  
  public final void c(f1 paramf1, Bitmap paramBitmap)
  {
    int i1 = paramf1.d();
    boolean bool1;
    if (((i1 == 2) || (i1 == 3)) && (paramf1.k())) {
      bool1 = true;
    } else {
      bool1 = false;
    }
    Object localObject1 = n;
    i1 = paramf1.d();
    Object localObject2 = null;
    if ((i1 == 1) && (paramf1.J().p()))
    {
      o = null;
      paramf1 = (f1)localObject2;
    }
    else
    {
      boolean bool2 = paramf1.G(7);
      boolean bool3 = paramf1.G(11);
      boolean bool4 = paramf1.G(12);
      boolean bool5 = paramf1.G(9);
      Object localObject3 = new ArrayList();
      if ((t) && (bool2)) {
        ((ArrayList)localObject3).add("com.google.android.exoplayer.prev");
      }
      if ((v) && (bool3)) {
        ((ArrayList)localObject3).add("com.google.android.exoplayer.rewind");
      }
      if (x)
      {
        if ((paramf1.d() != 4) && (paramf1.d() != 1) && (paramf1.k())) {
          i1 = 1;
        } else {
          i1 = 0;
        }
        if (i1 != 0) {
          localObject2 = "com.google.android.exoplayer.pause";
        } else {
          localObject2 = "com.google.android.exoplayer.play";
        }
        ((ArrayList)localObject3).add(localObject2);
      }
      if ((w) && (bool4)) {
        ((ArrayList)localObject3).add("com.google.android.exoplayer.ffwd");
      }
      if ((u) && (bool5)) {
        ((ArrayList)localObject3).add("com.google.android.exoplayer.next");
      }
      if (y) {
        ((ArrayList)localObject3).add("com.google.android.exoplayer.stop");
      }
      Object localObject4 = new ArrayList(((ArrayList)localObject3).size());
      for (i1 = 0; i1 < ((ArrayList)localObject3).size(); i1++)
      {
        localObject2 = (String)((ArrayList)localObject3).get(i1);
        if (j.containsKey(localObject2)) {
          localObject2 = j.get(localObject2);
        } else {
          localObject2 = k.get(localObject2);
        }
        localObject2 = (n)localObject2;
        if (localObject2 != null) {
          ((ArrayList)localObject4).add(localObject2);
        }
      }
      if (localObject1 != null)
      {
        localObject2 = localObject1;
        if (((ArrayList)localObject4).equals(o)) {}
      }
      else
      {
        localObject1 = new q(a, b);
        o = ((ArrayList)localObject4);
        for (i1 = 0;; i1++)
        {
          localObject2 = localObject1;
          if (i1 >= ((ArrayList)localObject4).size()) {
            break;
          }
          localObject2 = (n)((ArrayList)localObject4).get(i1);
          if (localObject2 != null) {
            b.add(localObject2);
          }
        }
      }
      localObject1 = new h1.b();
      localObject4 = s;
      if (localObject4 != null) {
        c = ((MediaSessionCompat.Token)localObject4);
      }
      int i2 = ((ArrayList)localObject3).indexOf("com.google.android.exoplayer.pause");
      int i3 = ((ArrayList)localObject3).indexOf("com.google.android.exoplayer.play");
      localObject3 = new int[3];
      if ((paramf1.d() != 4) && (paramf1.d() != 1) && (paramf1.k())) {
        i1 = 1;
      } else {
        i1 = 0;
      }
      if ((i2 != -1) && (i1 != 0))
      {
        localObject3[0] = i2;
      }
      else
      {
        if ((i3 == -1) || (i1 != 0)) {
          break label608;
        }
        localObject3[0] = i3;
      }
      i1 = 1;
      break label610;
      label608:
      i1 = 0;
      label610:
      b = Arrays.copyOf((int[])localObject3, i1);
      ((q)localObject2).g((s)localObject1);
      localObject1 = l;
      B.deleteIntent = ((PendingIntent)localObject1);
      z = z;
      ((q)localObject2).d(2, bool1);
      w = 0;
      t = A;
      u = true;
      i1 = B;
      localObject1 = B;
      icon = i1;
      x = C;
      j = D;
      defaults = 0;
      if ((e0.a >= 21) && (E) && (paramf1.D()) && (!paramf1.g()) && (!paramf1.H()) && (fa == 1.0F))
      {
        long l1 = System.currentTimeMillis();
        long l2 = paramf1.y();
        B.when = (l1 - l2);
        k = true;
        l = true;
      }
      else
      {
        k = false;
        l = false;
      }
      e = q.b(d.a(paramf1));
      ((q)localObject2).c(d.e(paramf1));
      d.c();
      n = q.b(null);
      if (paramBitmap == null)
      {
        paramBitmap = d;
        i1 = r + 1;
        r = i1;
        paramBitmap = paramBitmap.b(paramf1, new a(i1));
      }
      ((q)localObject2).e(paramBitmap);
      g = d.d(paramf1);
      paramf1 = F;
      if (paramf1 != null) {
        r = paramf1;
      }
      ((q)localObject2).d(8, true);
      paramf1 = (f1)localObject2;
    }
    n = paramf1;
    if (paramf1 == null)
    {
      d(false);
      return;
    }
    paramf1 = paramf1.a();
    f.b(c, paramf1);
    if (!q) {
      a.registerReceiver(i, g);
    }
    q = true;
  }
  
  public final void d(boolean paramBoolean)
  {
    if (q)
    {
      q = false;
      e.removeMessages(0);
      u localu = f;
      int i1 = c;
      b.cancel(null, i1);
      a.unregisterReceiver(i);
    }
  }
  
  public final class a
  {
    public final int a;
    
    public a(int paramInt)
    {
      a = paramInt;
    }
  }
  
  public static abstract interface b
  {
    public abstract void a();
    
    public abstract List b();
  }
  
  public static abstract interface c
  {
    public abstract CharSequence a(f1 paramf1);
    
    public abstract Bitmap b(f1 paramf1, c.a parama);
    
    public abstract void c();
    
    public abstract PendingIntent d(f1 paramf1);
    
    public abstract CharSequence e(f1 paramf1);
  }
  
  public final class d
    extends BroadcastReceiver
  {
    public d() {}
    
    public final void onReceive(Context paramContext, Intent paramIntent)
    {
      c localc = c.this;
      paramContext = p;
      if ((paramContext != null) && (q) && (paramIntent.getIntExtra("INSTANCE_ID", m) == m))
      {
        paramIntent = paramIntent.getAction();
        if ("com.google.android.exoplayer.play".equals(paramIntent))
        {
          if (paramContext.d() == 1) {
            paramContext.a();
          } else if (paramContext.d() == 4) {
            paramContext.w(paramContext.F());
          }
          paramContext.b();
        }
        else if ("com.google.android.exoplayer.pause".equals(paramIntent))
        {
          paramContext.pause();
        }
        else if ("com.google.android.exoplayer.prev".equals(paramIntent))
        {
          paramContext.t();
        }
        else if ("com.google.android.exoplayer.rewind".equals(paramIntent))
        {
          paramContext.O();
        }
        else if ("com.google.android.exoplayer.ffwd".equals(paramIntent))
        {
          paramContext.N();
        }
        else if ("com.google.android.exoplayer.next".equals(paramIntent))
        {
          paramContext.M();
        }
        else if ("com.google.android.exoplayer.stop".equals(paramIntent))
        {
          paramContext.o(true);
        }
        else if ("com.google.android.exoplayer.dismiss".equals(paramIntent))
        {
          d(true);
        }
        else if (paramIntent != null)
        {
          getClass();
        }
      }
    }
  }
  
  public static abstract interface e
  {
    public abstract void a();
    
    public abstract void b();
  }
  
  public final class f
    implements f1.c
  {
    public f() {}
    
    public final void e0(f1 paramf1, f1.b paramb)
    {
      if (paramb.a(new int[] { 4, 5, 7, 0, 12, 11, 8, 9, 14 }))
      {
        paramf1 = c.this;
        if (!e.hasMessages(0)) {
          e.sendEmptyMessage(0);
        }
      }
    }
  }
}

/* Location:
 * Qualified Name:     s5.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */