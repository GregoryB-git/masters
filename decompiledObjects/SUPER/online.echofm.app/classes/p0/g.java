package p0;

import B0.m;
import B0.m.c;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import g0.M;
import g0.a;
import g0.h;
import g0.o;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import l0.y1;
import x0.r;
import x0.u;

public class g
  implements n
{
  public final List a;
  public final F b;
  public final a c;
  public final b d;
  public final int e;
  public final boolean f;
  public final boolean g;
  public final HashMap h;
  public final h i;
  public final m j;
  public final y1 k;
  public final Q l;
  public final UUID m;
  public final Looper n;
  public final e o;
  public int p;
  public int q;
  public HandlerThread r;
  public c s;
  public j0.b t;
  public n.a u;
  public byte[] v;
  public byte[] w;
  public F.a x;
  public F.d y;
  
  public g(UUID paramUUID, F paramF, a parama, b paramb, List paramList, int paramInt, boolean paramBoolean1, boolean paramBoolean2, byte[] paramArrayOfByte, HashMap paramHashMap, Q paramQ, Looper paramLooper, m paramm, y1 paramy1)
  {
    if ((paramInt == 1) || (paramInt == 3)) {
      a.e(paramArrayOfByte);
    }
    m = paramUUID;
    c = parama;
    d = paramb;
    b = paramF;
    e = paramInt;
    f = paramBoolean1;
    g = paramBoolean2;
    if (paramArrayOfByte != null) {
      w = paramArrayOfByte;
    }
    for (paramUUID = null;; paramUUID = Collections.unmodifiableList((List)a.e(paramList)))
    {
      a = paramUUID;
      break;
    }
    h = paramHashMap;
    l = paramQ;
    i = new h();
    j = paramm;
    k = paramy1;
    p = 2;
    n = paramLooper;
    o = new e(paramLooper);
  }
  
  public final void A()
  {
    if ((e == 0) && (p == 4))
    {
      M.i(v);
      r(false);
    }
  }
  
  public void B(int paramInt)
  {
    if (paramInt == 2) {
      A();
    }
  }
  
  public void C()
  {
    if (F()) {
      r(true);
    }
  }
  
  public void D(Exception paramException, boolean paramBoolean)
  {
    int i1;
    if (paramBoolean) {
      i1 = 1;
    } else {
      i1 = 3;
    }
    x(paramException, i1);
  }
  
  public final void E(Object paramObject1, Object paramObject2)
  {
    if ((paramObject1 == y) && ((p == 2) || (u())))
    {
      y = null;
      if ((paramObject2 instanceof Exception))
      {
        c.c((Exception)paramObject2, false);
        return;
      }
      try
      {
        b.i((byte[])paramObject2);
        c.b();
        return;
      }
      catch (Exception paramObject1)
      {
        c.c((Exception)paramObject1, true);
      }
    }
  }
  
  public final boolean F()
  {
    if (u()) {
      return true;
    }
    try
    {
      try
      {
        Object localObject = b.m();
        v = ((byte[])localObject);
        b.f((byte[])localObject, k);
        t = b.l(v);
        p = 3;
        localObject = new p0/b;
        ((b)localObject).<init>(3);
        q((g0.g)localObject);
        a.e(v);
        return true;
      }
      catch (NoSuchMethodError localNoSuchMethodError) {}catch (Exception localException) {}
      if (!B.b(localException)) {
        break label109;
      }
    }
    catch (NotProvisionedException localNotProvisionedException)
    {
      for (;;) {}
    }
    c.a(this);
    break label115;
    label109:
    x(localException, 1);
    label115:
    return false;
  }
  
  public final void G(byte[] paramArrayOfByte, int paramInt, boolean paramBoolean)
  {
    try
    {
      x = b.j(paramArrayOfByte, a, paramInt, h);
      ((c)M.i(s)).b(2, a.e(x), paramBoolean);
    }
    catch (NoSuchMethodError paramArrayOfByte) {}catch (Exception paramArrayOfByte) {}
    z(paramArrayOfByte, true);
  }
  
  public void H()
  {
    y = b.h();
    ((c)M.i(s)).b(1, a.e(y), true);
  }
  
  public final boolean I()
  {
    try
    {
      b.c(v, w);
      return true;
    }
    catch (NoSuchMethodError localNoSuchMethodError) {}catch (Exception localException) {}
    x(localException, 1);
    return false;
  }
  
  public final void J()
  {
    if (Thread.currentThread() != n.getThread())
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("DefaultDrmSession accessed on the wrong thread.\nCurrent thread: ");
      localStringBuilder.append(Thread.currentThread().getName());
      localStringBuilder.append("\nExpected thread: ");
      localStringBuilder.append(n.getThread().getName());
      o.i("DefaultDrmSession", localStringBuilder.toString(), new IllegalStateException());
    }
  }
  
  public void a(v.a parama)
  {
    J();
    int i1 = q;
    boolean bool = false;
    if (i1 < 0)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Session reference count less than zero: ");
      localStringBuilder.append(q);
      o.c("DefaultDrmSession", localStringBuilder.toString());
      q = 0;
    }
    if (parama != null) {
      i.a(parama);
    }
    i1 = q + 1;
    q = i1;
    if (i1 == 1)
    {
      if (p == 2) {
        bool = true;
      }
      a.f(bool);
      parama = new HandlerThread("ExoPlayer:DrmRequestHandler");
      r = parama;
      parama.start();
      s = new c(r.getLooper());
      if (F()) {
        r(true);
      }
    }
    else if ((parama != null) && (u()) && (i.d(parama) == 1))
    {
      parama.k(p);
    }
    d.a(this, q);
  }
  
  public boolean b()
  {
    J();
    return f;
  }
  
  public Map c()
  {
    J();
    Object localObject = v;
    if (localObject == null) {
      localObject = null;
    } else {
      localObject = b.d((byte[])localObject);
    }
    return (Map)localObject;
  }
  
  public final UUID d()
  {
    J();
    return m;
  }
  
  public void e(v.a parama)
  {
    J();
    int i1 = q;
    if (i1 <= 0)
    {
      o.c("DefaultDrmSession", "release() called on a session that's already fully released.");
      return;
    }
    i1--;
    q = i1;
    if (i1 == 0)
    {
      p = 0;
      ((e)M.i(o)).removeCallbacksAndMessages(null);
      ((c)M.i(s)).c();
      s = null;
      ((HandlerThread)M.i(r)).quit();
      r = null;
      t = null;
      u = null;
      x = null;
      y = null;
      byte[] arrayOfByte = v;
      if (arrayOfByte != null)
      {
        b.e(arrayOfByte);
        v = null;
      }
    }
    if (parama != null)
    {
      i.f(parama);
      if (i.d(parama) == 0) {
        parama.m();
      }
    }
    d.b(this, q);
  }
  
  public boolean f(String paramString)
  {
    J();
    return b.b((byte[])a.h(v), paramString);
  }
  
  public final n.a g()
  {
    J();
    n.a locala;
    if (p == 1) {
      locala = u;
    } else {
      locala = null;
    }
    return locala;
  }
  
  public final int getState()
  {
    J();
    return p;
  }
  
  public final j0.b h()
  {
    J();
    return t;
  }
  
  public final void q(g0.g paramg)
  {
    Iterator localIterator = i.u().iterator();
    while (localIterator.hasNext()) {
      paramg.accept((v.a)localIterator.next());
    }
  }
  
  public final void r(boolean paramBoolean)
  {
    if (g) {
      return;
    }
    byte[] arrayOfByte = (byte[])M.i(v);
    int i1 = e;
    if ((i1 != 0) && (i1 != 1))
    {
      if (i1 != 2)
      {
        if (i1 == 3)
        {
          a.e(w);
          a.e(v);
          G(w, 3, paramBoolean);
        }
      }
      else if ((w != null) && (!I())) {}
    }
    else
    {
      long l1;
      for (;;)
      {
        G(arrayOfByte, 2, paramBoolean);
        return;
        if (w == null)
        {
          G(arrayOfByte, 1, paramBoolean);
          return;
        }
        if ((p != 4) && (!I())) {
          return;
        }
        l1 = s();
        if ((e != 0) || (l1 > 60L)) {
          break;
        }
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("Offline license has expired or will expire soon. Remaining seconds: ");
        localStringBuilder.append(l1);
        o.b("DefaultDrmSession", localStringBuilder.toString());
      }
      if (l1 <= 0L)
      {
        x(new P(), 2);
      }
      else
      {
        p = 4;
        q(new f());
      }
    }
  }
  
  public final long s()
  {
    if (!d0.g.d.equals(m)) {
      return Long.MAX_VALUE;
    }
    Pair localPair = (Pair)a.e(U.b(this));
    return Math.min(((Long)first).longValue(), ((Long)second).longValue());
  }
  
  public boolean t(byte[] paramArrayOfByte)
  {
    J();
    return Arrays.equals(v, paramArrayOfByte);
  }
  
  public final boolean u()
  {
    int i1 = p;
    boolean bool;
    if ((i1 != 3) && (i1 != 4)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public final void x(Throwable paramThrowable, int paramInt)
  {
    u = new n.a(paramThrowable, B.a(paramThrowable, paramInt));
    o.d("DefaultDrmSession", "DRM session error", paramThrowable);
    if ((paramThrowable instanceof Exception))
    {
      q(new e(paramThrowable));
    }
    else
    {
      if (!(paramThrowable instanceof Error)) {
        break label92;
      }
      if ((!B.c(paramThrowable)) && (!B.b(paramThrowable))) {
        throw ((Error)paramThrowable);
      }
    }
    if (p != 4) {
      p = 1;
    }
    return;
    label92:
    throw new IllegalStateException("Unexpected Throwable subclass", paramThrowable);
  }
  
  public final void y(Object paramObject1, Object paramObject2)
  {
    if ((paramObject1 == x) && (u()))
    {
      x = null;
      if ((!(paramObject2 instanceof Exception)) && (!(paramObject2 instanceof NoSuchMethodError)))
      {
        for (;;)
        {
          try
          {
            paramObject1 = (byte[])paramObject2;
            if (e == 3)
            {
              b.g((byte[])M.i(w), (byte[])paramObject1);
              paramObject1 = new p0/c;
              ((c)paramObject1).<init>();
              q((g0.g)paramObject1);
            }
          }
          catch (NoSuchMethodError paramObject1)
          {
            break;
          }
          catch (Exception paramObject1)
          {
            break;
          }
          paramObject1 = b.g(v, (byte[])paramObject1);
          int i1 = e;
          if (((i1 == 2) || ((i1 == 0) && (w != null))) && (paramObject1 != null) && (paramObject1.length != 0)) {
            w = ((byte[])paramObject1);
          }
          p = 4;
          paramObject1 = new d();
        }
        z((Throwable)paramObject1, true);
        return;
      }
      z((Throwable)paramObject2, false);
    }
  }
  
  public final void z(Throwable paramThrowable, boolean paramBoolean)
  {
    if ((!(paramThrowable instanceof NotProvisionedException)) && (!B.b(paramThrowable)))
    {
      int i1;
      if (paramBoolean) {
        i1 = 1;
      } else {
        i1 = 2;
      }
      x(paramThrowable, i1);
    }
    else
    {
      c.a(this);
    }
  }
  
  public static abstract interface a
  {
    public abstract void a(g paramg);
    
    public abstract void b();
    
    public abstract void c(Exception paramException, boolean paramBoolean);
  }
  
  public static abstract interface b
  {
    public abstract void a(g paramg, int paramInt);
    
    public abstract void b(g paramg, int paramInt);
  }
  
  public class c
    extends Handler
  {
    public boolean a;
    
    public c(Looper paramLooper)
    {
      super();
    }
    
    public final boolean a(Message paramMessage, S paramS)
    {
      g.d locald = (g.d)obj;
      if (!b) {
        return false;
      }
      int i = e + 1;
      e = i;
      if (i > g.o(g.this).d(3)) {
        return false;
      }
      r localr = new r(a, o, p, q, SystemClock.elapsedRealtime(), SystemClock.elapsedRealtime() - c, r);
      u localu = new u(3);
      if ((paramS.getCause() instanceof IOException)) {
        paramS = (IOException)paramS.getCause();
      } else {
        paramS = new g.f(paramS.getCause());
      }
      long l = g.o(g.this).c(new m.c(localr, localu, paramS, e));
      if (l == -9223372036854775807L) {
        return false;
      }
      label207:
      try
      {
        if (!a)
        {
          sendMessageDelayed(Message.obtain(paramMessage), l);
          return true;
        }
      }
      finally
      {
        break label207;
        return false;
      }
    }
    
    public void b(int paramInt, Object paramObject, boolean paramBoolean)
    {
      obtainMessage(paramInt, new g.d(r.a(), paramBoolean, SystemClock.elapsedRealtime(), paramObject)).sendToTarget();
    }
    
    public void c()
    {
      try
      {
        removeCallbacksAndMessages(null);
        a = true;
        return;
      }
      finally
      {
        localObject = finally;
        throw ((Throwable)localObject);
      }
    }
    
    public void handleMessage(Message paramMessage)
    {
      g.d locald = (g.d)obj;
      try
      {
        int i = what;
        if (i == 1) {
          break label77;
        }
        if (i == 2) {
          byte[] arrayOfByte = g.n(g.this).b(g.m(g.this), (F.a)d);
        }
      }
      catch (Exception localException)
      {
        break label108;
      }
      catch (S localS)
      {
        break label120;
      }
      Object localObject = new java/lang/RuntimeException;
      ((RuntimeException)localObject).<init>();
      throw ((Throwable)localObject);
      label77:
      localObject = g.n(g.this).a(g.m(g.this), (F.d)d);
      break label135;
      label108:
      o.i("DefaultDrmSession", "Key/provisioning request produced an unexpected exception. Not retrying.", (Throwable)localObject);
      break label135;
      label120:
      localObject = localS;
      if (a(paramMessage, localS)) {
        return;
      }
      label135:
      g.o(g.this).a(a);
      try
      {
        if (!a) {
          g.p(g.this).obtainMessage(what, Pair.create(d, localObject)).sendToTarget();
        }
      }
      finally
      {
        break label196;
      }
      return;
      label196:
      throw paramMessage;
    }
  }
  
  public static final class d
  {
    public final long a;
    public final boolean b;
    public final long c;
    public final Object d;
    public int e;
    
    public d(long paramLong1, boolean paramBoolean, long paramLong2, Object paramObject)
    {
      a = paramLong1;
      b = paramBoolean;
      c = paramLong2;
      d = paramObject;
    }
  }
  
  public class e
    extends Handler
  {
    public e(Looper paramLooper)
    {
      super();
    }
    
    public void handleMessage(Message paramMessage)
    {
      Object localObject1 = (Pair)obj;
      Object localObject2 = first;
      localObject1 = second;
      int i = what;
      if (i != 1)
      {
        if (i == 2) {
          g.l(g.this, localObject2, localObject1);
        }
      }
      else {
        g.k(g.this, localObject2, localObject1);
      }
    }
  }
  
  public static final class f
    extends IOException
  {
    public f(Throwable paramThrowable)
    {
      super();
    }
  }
}

/* Location:
 * Qualified Name:     p0.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */