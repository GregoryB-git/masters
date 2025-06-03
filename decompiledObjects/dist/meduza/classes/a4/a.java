package a4;

import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import b.d;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;
import o7.t;
import t5.c0;
import v3.h;
import v5.e0;
import v5.m;
import w3.a0;
import z4.n;

public final class a
  implements e
{
  public final List<d.b> a;
  public final o b;
  public final a c;
  public final b d;
  public final int e;
  public final boolean f;
  public final boolean g;
  public final HashMap<String, String> h;
  public final v5.f<g.a> i;
  public final c0 j;
  public final a0 k;
  public final w l;
  public final UUID m;
  public final Looper n;
  public final e o;
  public int p;
  public int q;
  public HandlerThread r;
  public c s;
  public z3.b t;
  public e.a u;
  public byte[] v;
  public byte[] w;
  public o.a x;
  public o.d y;
  
  public a(UUID paramUUID, o paramo, b.e parame, b.f paramf, List paramList, int paramInt, boolean paramBoolean1, boolean paramBoolean2, byte[] paramArrayOfByte, HashMap paramHashMap, w paramw, Looper paramLooper, c0 paramc0, a0 parama0)
  {
    if ((paramInt == 1) || (paramInt == 3)) {
      paramArrayOfByte.getClass();
    }
    m = paramUUID;
    c = parame;
    d = paramf;
    b = paramo;
    e = paramInt;
    f = paramBoolean1;
    g = paramBoolean2;
    if (paramArrayOfByte != null)
    {
      w = paramArrayOfByte;
      paramUUID = null;
    }
    else
    {
      paramList.getClass();
      paramUUID = Collections.unmodifiableList(paramList);
    }
    a = paramUUID;
    h = paramHashMap;
    l = paramw;
    i = new v5.f();
    j = paramc0;
    k = parama0;
    p = 2;
    n = paramLooper;
    o = new e(paramLooper);
  }
  
  public final void a(boolean paramBoolean)
  {
    if (g) {
      return;
    }
    Object localObject1 = v;
    int i1 = e0.a;
    int i2 = e;
    int i3 = 0;
    i1 = 0;
    if ((i2 != 0) && (i2 != 1))
    {
      if (i2 != 2)
      {
        if (i2 != 3) {
          break label492;
        }
        w.getClass();
        v.getClass();
        n(w, 3, paramBoolean);
        break label492;
      }
      byte[] arrayOfByte1 = w;
      if (arrayOfByte1 != null)
      {
        try
        {
          b.e((byte[])localObject1, arrayOfByte1);
          i1 = 1;
        }
        catch (Exception localException1)
        {
          c(1, localException1);
        }
        if (i1 == 0) {
          break label492;
        }
      }
    }
    else
    {
      byte[] arrayOfByte2 = w;
      if (arrayOfByte2 == null)
      {
        n((byte[])localObject1, 1, paramBoolean);
        break label492;
      }
      if (p != 4)
      {
        try
        {
          b.e((byte[])localObject1, arrayOfByte2);
          i1 = 1;
        }
        catch (Exception localException2)
        {
          c(1, localException2);
          i1 = i3;
        }
        if (i1 == 0) {
          break label492;
        }
      }
      if (!h.d.equals(m))
      {
        l1 = Long.MAX_VALUE;
      }
      else
      {
        ??? = o();
        if (??? == null) {
          ??? = null;
        } else {
          l2 = -9223372036854775807L;
        }
      }
    }
    try
    {
      String str = (String)((Map)???).get("LicenseDurationRemaining");
      if (str != null) {
        l1 = Long.parseLong(str);
      }
    }
    catch (NumberFormatException localNumberFormatException2)
    {
      label492:
      for (;;) {}
    }
    long l1 = -9223372036854775807L;
    try
    {
      ??? = (String)((Map)???).get("PlaybackDurationRemaining");
      l3 = l2;
      if (??? != null) {
        l3 = Long.parseLong((String)???);
      }
    }
    catch (NumberFormatException localNumberFormatException1)
    {
      for (;;)
      {
        long l3 = l2;
      }
    }
    ??? = new Pair(Long.valueOf(l1), Long.valueOf(l3));
    ???.getClass();
    l1 = Math.min(((Long)first).longValue(), ((Long)second).longValue());
    if ((e == 0) && (l1 <= 60L))
    {
      ??? = new StringBuilder();
      ((StringBuilder)???).append("Offline license has expired or will expire soon. Remaining seconds: ");
      ((StringBuilder)???).append(l1);
      m.b("DefaultDrmSession", ((StringBuilder)???).toString());
      n((byte[])localObject1, 2, paramBoolean);
    }
    else if (l1 <= 0L)
    {
      c(2, new u());
    }
    else
    {
      p = 4;
      localObject1 = i;
    }
    synchronized (a)
    {
      localObject1 = c;
      ??? = ((Set)localObject1).iterator();
      while (((Iterator)???).hasNext()) {
        ((g.a)((Iterator)???).next()).c();
      }
      return;
    }
  }
  
  public final boolean b()
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
  
  public final void c(int paramInt, Exception paramException)
  {
    int i1 = e0.a;
    if ((i1 >= 21) && (k.a(paramException)))
    {
      paramInt = k.b(paramException);
    }
    else if ((i1 >= 23) && (l.a(paramException)))
    {
      paramInt = 6006;
    }
    else
    {
      if ((i1 >= 18) && (j.b(paramException))) {}
      for (;;)
      {
        paramInt = 6002;
        break label155;
        if ((i1 >= 18) && (j.a(paramException)))
        {
          paramInt = 6007;
          break label155;
        }
        if ((paramException instanceof y))
        {
          paramInt = 6001;
          break label155;
        }
        if ((paramException instanceof b.c))
        {
          paramInt = 6003;
          break label155;
        }
        if ((paramException instanceof u))
        {
          paramInt = 6008;
          break label155;
        }
        if (paramInt == 1) {
          break;
        }
        if (paramInt == 2)
        {
          paramInt = 6004;
          break label155;
        }
        if (paramInt != 3) {
          break label259;
        }
      }
    }
    label155:
    u = new e.a(paramInt, paramException);
    m.d("DefaultDrmSession", "DRM session error", paramException);
    Object localObject1 = i;
    synchronized (a)
    {
      localObject1 = c;
      ??? = ((Set)localObject1).iterator();
      while (((Iterator)???).hasNext()) {
        ((g.a)((Iterator)???).next()).e(paramException);
      }
      if (p != 4) {
        p = 1;
      }
      return;
    }
    label259:
    throw new IllegalArgumentException();
  }
  
  public final void d(Exception paramException, boolean paramBoolean)
  {
    int i1;
    if ((paramException instanceof NotProvisionedException))
    {
      paramException = (b.e)c;
      a.add(this);
      if (b == null)
      {
        b = this;
        paramException = b.b();
        y = paramException;
        c localc = s;
        i1 = e0.a;
        paramException.getClass();
        localc.getClass();
        localc.obtainMessage(0, new d(n.b.getAndIncrement(), true, SystemClock.elapsedRealtime(), paramException)).sendToTarget();
      }
    }
    else
    {
      if (paramBoolean) {
        i1 = 1;
      } else {
        i1 = 2;
      }
      c(i1, paramException);
    }
  }
  
  public final int e()
  {
    p();
    return p;
  }
  
  public final void f(g.a parama)
  {
    p();
    int i1 = q;
    if (i1 <= 0)
    {
      m.c("DefaultDrmSession", "release() called on a session that's already fully released.");
      return;
    }
    i1--;
    q = i1;
    if (i1 == 0)
    {
      p = 0;
      ??? = o;
      i1 = e0.a;
      ((Handler)???).removeCallbacksAndMessages(null);
    }
    synchronized (s)
    {
      ((Handler)???).removeCallbacksAndMessages(null);
      a = true;
      s = null;
      r.quit();
      r = null;
      t = null;
      u = null;
      x = null;
      y = null;
      ??? = v;
      if (??? != null)
      {
        b.f((byte[])???);
        v = null;
      }
    }
    Object localObject2 = i;
    synchronized (a)
    {
      Integer localInteger = (Integer)b.get(parama);
      if (localInteger != null)
      {
        Object localObject3 = new java/util/ArrayList;
        ((ArrayList)localObject3).<init>(d);
        ((ArrayList)localObject3).remove(parama);
        d = Collections.unmodifiableList((List)localObject3);
        if (localInteger.intValue() == 1)
        {
          b.remove(parama);
          localObject3 = new java/util/HashSet;
          ((HashSet)localObject3).<init>(c);
          ((HashSet)localObject3).remove(parama);
          c = Collections.unmodifiableSet((Set)localObject3);
        }
        else
        {
          b.put(parama, Integer.valueOf(localInteger.intValue() - 1));
        }
      }
      if (i.a(parama) == 0) {
        parama.f();
      }
    }
    parama = d;
    i1 = q;
    parama = (b.f)parama;
    if (i1 == 1)
    {
      ??? = a;
      if ((p > 0) && (l != -9223372036854775807L))
      {
        o.add(this);
        ??? = a.u;
        ???.getClass();
        ((Handler)???).postAtTime(new d(this, 8), this, SystemClock.uptimeMillis() + a.l);
        break label628;
      }
    }
    if (i1 == 0)
    {
      a.m.remove(this);
      ??? = a;
      if (r == this) {
        r = null;
      }
      if (s == this) {
        s = null;
      }
      ??? = i;
      a.remove(this);
      if (b == this)
      {
        b = null;
        if (!a.isEmpty())
        {
          localObject2 = (a)a.iterator().next();
          b = ((a)localObject2);
          ??? = b.b();
          y = ((o.d)???);
          localObject2 = s;
          i1 = e0.a;
          ???.getClass();
          localObject2.getClass();
          ((Handler)localObject2).obtainMessage(0, new d(n.b.getAndIncrement(), true, SystemClock.elapsedRealtime(), ???)).sendToTarget();
        }
      }
      ??? = a;
      if (l != -9223372036854775807L)
      {
        ??? = u;
        ???.getClass();
        ((Handler)???).removeCallbacksAndMessages(this);
        a.o.remove(this);
      }
    }
    label628:
    a.k();
  }
  
  public final UUID g()
  {
    p();
    return m;
  }
  
  public final void h(g.a parama)
  {
    p();
    int i1 = q;
    boolean bool = false;
    if (i1 < 0)
    {
      ??? = f.l("Session reference count less than zero: ");
      ((StringBuilder)???).append(q);
      m.c("DefaultDrmSession", ((StringBuilder)???).toString());
      q = 0;
    }
    if (parama != null)
    {
      Object localObject2 = i;
      synchronized (a)
      {
        Object localObject3 = new java/util/ArrayList;
        ((ArrayList)localObject3).<init>(d);
        ((ArrayList)localObject3).add(parama);
        d = Collections.unmodifiableList((List)localObject3);
        localObject3 = (Integer)b.get(parama);
        if (localObject3 == null)
        {
          HashSet localHashSet = new java/util/HashSet;
          localHashSet.<init>(c);
          localHashSet.add(parama);
          c = Collections.unmodifiableSet(localHashSet);
        }
        localObject2 = b;
        if (localObject3 != null) {
          i1 = ((Integer)localObject3).intValue() + 1;
        } else {
          i1 = 1;
        }
        ((HashMap)localObject2).put(parama, Integer.valueOf(i1));
      }
    }
    i1 = q + 1;
    q = i1;
    if (i1 == 1)
    {
      if (p == 2) {
        bool = true;
      }
      x6.b.H(bool);
      parama = new HandlerThread("ExoPlayer:DrmRequestHandler");
      r = parama;
      parama.start();
      s = new c(r.getLooper());
      if (m()) {
        a(true);
      }
    }
    else if ((parama != null) && (b()) && (i.a(parama) == 1))
    {
      parama.d(p);
    }
    ??? = (b.f)d;
    parama = a;
    if (l != -9223372036854775807L)
    {
      o.remove(this);
      parama = a.u;
      parama.getClass();
      parama.removeCallbacksAndMessages(this);
    }
  }
  
  public final boolean i()
  {
    p();
    return f;
  }
  
  public final boolean j(String paramString)
  {
    p();
    o localo = b;
    byte[] arrayOfByte = v;
    x6.b.K(arrayOfByte);
    return localo.m(paramString, arrayOfByte);
  }
  
  public final e.a k()
  {
    p();
    e.a locala;
    if (p == 1) {
      locala = u;
    } else {
      locala = null;
    }
    return locala;
  }
  
  public final z3.b l()
  {
    p();
    return t;
  }
  
  public final boolean m()
  {
    if (b()) {
      return true;
    }
    try
    {
      ??? = b.d();
      v = ((byte[])???);
      b.j((byte[])???, k);
      t = b.c(v);
      p = 3;
      Object localObject3 = i;
      synchronized (a)
      {
        localObject3 = c;
        ??? = ((Set)localObject3).iterator();
        while (((Iterator)???).hasNext()) {
          ((g.a)((Iterator)???).next()).d(3);
        }
        v.getClass();
        return true;
      }
      Object localObject2;
      c localc;
      int i1;
      return false;
    }
    catch (Exception localException)
    {
      c(1, localException);
    }
    catch (NotProvisionedException localNotProvisionedException)
    {
      localObject2 = (b.e)c;
      a.add(this);
      if (b == null)
      {
        b = this;
        localObject2 = b.b();
        y = ((o.d)localObject2);
        localc = s;
        i1 = e0.a;
        localObject2.getClass();
        localc.getClass();
        localc.obtainMessage(0, new d(n.b.getAndIncrement(), true, SystemClock.elapsedRealtime(), localObject2)).sendToTarget();
      }
    }
  }
  
  public final void n(byte[] paramArrayOfByte, int paramInt, boolean paramBoolean)
  {
    try
    {
      paramArrayOfByte = b.k(paramArrayOfByte, a, paramInt, h);
      x = paramArrayOfByte;
      c localc = s;
      paramInt = e0.a;
      paramArrayOfByte.getClass();
      localc.getClass();
      d locald = new a4/a$d;
      locald.<init>(n.b.getAndIncrement(), paramBoolean, SystemClock.elapsedRealtime(), paramArrayOfByte);
      localc.obtainMessage(1, locald).sendToTarget();
    }
    catch (Exception paramArrayOfByte)
    {
      d(paramArrayOfByte, true);
    }
  }
  
  public final Map<String, String> o()
  {
    p();
    Object localObject = v;
    if (localObject == null) {
      localObject = null;
    } else {
      localObject = b.a((byte[])localObject);
    }
    return (Map<String, String>)localObject;
  }
  
  public final void p()
  {
    if (Thread.currentThread() != n.getThread())
    {
      StringBuilder localStringBuilder = f.l("DefaultDrmSession accessed on the wrong thread.\nCurrent thread: ");
      localStringBuilder.append(Thread.currentThread().getName());
      localStringBuilder.append("\nExpected thread: ");
      localStringBuilder.append(n.getThread().getName());
      m.g("DefaultDrmSession", localStringBuilder.toString(), new IllegalStateException());
    }
  }
  
  public static abstract interface a {}
  
  public static abstract interface b {}
  
  public final class c
    extends Handler
  {
    public boolean a;
    
    public c(Looper paramLooper)
    {
      super();
    }
    
    /* Error */
    public final void handleMessage(Message paramMessage)
    {
      // Byte code:
      //   0: aload_1
      //   1: getfield 31	android/os/Message:obj	Ljava/lang/Object;
      //   4: checkcast 33	a4/a$d
      //   7: astore_2
      //   8: iconst_1
      //   9: istore_3
      //   10: aload_1
      //   11: getfield 37	android/os/Message:what	I
      //   14: istore 4
      //   16: iload 4
      //   18: ifeq +55 -> 73
      //   21: iload 4
      //   23: iconst_1
      //   24: if_icmpne +36 -> 60
      //   27: aload_0
      //   28: getfield 15	a4/a$c:b	La4/a;
      //   31: astore 5
      //   33: aload 5
      //   35: getfield 41	a4/a:l	La4/w;
      //   38: aload 5
      //   40: getfield 45	a4/a:m	Ljava/util/UUID;
      //   43: aload_2
      //   44: getfield 47	a4/a$d:c	Ljava/lang/Object;
      //   47: checkcast 49	a4/o$a
      //   50: invokeinterface 54 3 0
      //   55: astore 5
      //   57: goto +361 -> 418
      //   60: new 56	java/lang/RuntimeException
      //   63: astore 5
      //   65: aload 5
      //   67: invokespecial 59	java/lang/RuntimeException:<init>	()V
      //   70: aload 5
      //   72: athrow
      //   73: aload_0
      //   74: getfield 15	a4/a$c:b	La4/a;
      //   77: getfield 41	a4/a:l	La4/w;
      //   80: aload_2
      //   81: getfield 47	a4/a$d:c	Ljava/lang/Object;
      //   84: checkcast 61	a4/o$d
      //   87: invokeinterface 64 2 0
      //   92: astore 5
      //   94: goto +324 -> 418
      //   97: astore 5
      //   99: ldc 66
      //   101: ldc 68
      //   103: aload 5
      //   105: invokestatic 74	v5/m:g	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V
      //   108: goto +310 -> 418
      //   111: astore 6
      //   113: aload_1
      //   114: getfield 31	android/os/Message:obj	Ljava/lang/Object;
      //   117: checkcast 33	a4/a$d
      //   120: astore 7
      //   122: aload 7
      //   124: getfield 76	a4/a$d:b	Z
      //   127: ifne +6 -> 133
      //   130: goto +275 -> 405
      //   133: aload 7
      //   135: getfield 79	a4/a$d:d	I
      //   138: iconst_1
      //   139: iadd
      //   140: istore 4
      //   142: aload 7
      //   144: iload 4
      //   146: putfield 79	a4/a$d:d	I
      //   149: iload 4
      //   151: aload_0
      //   152: getfield 15	a4/a$c:b	La4/a;
      //   155: getfield 83	a4/a:j	Lt5/c0;
      //   158: checkcast 85	t5/u
      //   161: iconst_3
      //   162: invokevirtual 88	t5/u:b	(I)I
      //   165: if_icmple +6 -> 171
      //   168: goto +237 -> 405
      //   171: new 90	z4/n
      //   174: astore 5
      //   176: invokestatic 96	android/os/SystemClock:elapsedRealtime	()J
      //   179: pop2
      //   180: invokestatic 96	android/os/SystemClock:elapsedRealtime	()J
      //   183: pop2
      //   184: aload 6
      //   186: invokevirtual 102	java/lang/Throwable:getCause	()Ljava/lang/Throwable;
      //   189: instanceof 104
      //   192: ifeq +16 -> 208
      //   195: aload 6
      //   197: invokevirtual 102	java/lang/Throwable:getCause	()Ljava/lang/Throwable;
      //   200: checkcast 104	java/io/IOException
      //   203: astore 5
      //   205: goto +17 -> 222
      //   208: new 106	a4/a$f
      //   211: dup
      //   212: aload 6
      //   214: invokevirtual 102	java/lang/Throwable:getCause	()Ljava/lang/Throwable;
      //   217: invokespecial 109	a4/a$f:<init>	(Ljava/lang/Throwable;)V
      //   220: astore 5
      //   222: aload_0
      //   223: getfield 15	a4/a$c:b	La4/a;
      //   226: getfield 83	a4/a:j	Lt5/c0;
      //   229: astore 8
      //   231: aload 7
      //   233: getfield 79	a4/a$d:d	I
      //   236: istore 9
      //   238: aload 8
      //   240: checkcast 85	t5/u
      //   243: invokevirtual 115	java/lang/Object:getClass	()Ljava/lang/Class;
      //   246: pop
      //   247: aload 5
      //   249: instanceof 117
      //   252: ifne +106 -> 358
      //   255: aload 5
      //   257: instanceof 119
      //   260: ifne +98 -> 358
      //   263: aload 5
      //   265: instanceof 121
      //   268: ifne +90 -> 358
      //   271: aload 5
      //   273: instanceof 123
      //   276: ifne +82 -> 358
      //   279: getstatic 127	t5/l:b	I
      //   282: istore 4
      //   284: aload 5
      //   286: ifnull +41 -> 327
      //   289: aload 5
      //   291: instanceof 125
      //   294: ifeq +23 -> 317
      //   297: aload 5
      //   299: checkcast 125	t5/l
      //   302: getfield 129	t5/l:a	I
      //   305: sipush 2008
      //   308: if_icmpne +9 -> 317
      //   311: iconst_1
      //   312: istore 4
      //   314: goto +16 -> 330
      //   317: aload 5
      //   319: invokevirtual 102	java/lang/Throwable:getCause	()Ljava/lang/Throwable;
      //   322: astore 5
      //   324: goto -40 -> 284
      //   327: iconst_0
      //   328: istore 4
      //   330: iload 4
      //   332: ifeq +6 -> 338
      //   335: goto +23 -> 358
      //   338: iload 9
      //   340: iconst_1
      //   341: isub
      //   342: sipush 1000
      //   345: imul
      //   346: sipush 5000
      //   349: invokestatic 135	java/lang/Math:min	(II)I
      //   352: i2l
      //   353: lstore 10
      //   355: goto +8 -> 363
      //   358: ldc2_w 136
      //   361: lstore 10
      //   363: lload 10
      //   365: ldc2_w 136
      //   368: lcmp
      //   369: ifne +6 -> 375
      //   372: goto +33 -> 405
      //   375: aload_0
      //   376: monitorenter
      //   377: aload_0
      //   378: getfield 139	a4/a$c:a	Z
      //   381: ifne +22 -> 403
      //   384: aload_0
      //   385: aload_1
      //   386: invokestatic 143	android/os/Message:obtain	(Landroid/os/Message;)Landroid/os/Message;
      //   389: lload 10
      //   391: invokevirtual 147	android/os/Handler:sendMessageDelayed	(Landroid/os/Message;J)Z
      //   394: pop
      //   395: aload_0
      //   396: monitorexit
      //   397: iload_3
      //   398: istore 4
      //   400: goto +8 -> 408
      //   403: aload_0
      //   404: monitorexit
      //   405: iconst_0
      //   406: istore 4
      //   408: iload 4
      //   410: ifeq +4 -> 414
      //   413: return
      //   414: aload 6
      //   416: astore 5
      //   418: aload_0
      //   419: getfield 15	a4/a$c:b	La4/a;
      //   422: getfield 83	a4/a:j	Lt5/c0;
      //   425: astore 6
      //   427: aload_2
      //   428: getfield 150	a4/a$d:a	J
      //   431: lstore 10
      //   433: aload 6
      //   435: invokevirtual 115	java/lang/Object:getClass	()Ljava/lang/Class;
      //   438: pop
      //   439: aload_0
      //   440: monitorenter
      //   441: aload_0
      //   442: getfield 139	a4/a$c:a	Z
      //   445: ifne +29 -> 474
      //   448: aload_0
      //   449: getfield 15	a4/a$c:b	La4/a;
      //   452: getfield 154	a4/a:o	La4/a$e;
      //   455: aload_1
      //   456: getfield 37	android/os/Message:what	I
      //   459: aload_2
      //   460: getfield 47	a4/a$d:c	Ljava/lang/Object;
      //   463: aload 5
      //   465: invokestatic 160	android/util/Pair:create	(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;
      //   468: invokevirtual 164	android/os/Handler:obtainMessage	(ILjava/lang/Object;)Landroid/os/Message;
      //   471: invokevirtual 167	android/os/Message:sendToTarget	()V
      //   474: aload_0
      //   475: monitorexit
      //   476: return
      //   477: astore_1
      //   478: aload_0
      //   479: monitorexit
      //   480: aload_1
      //   481: athrow
      //   482: astore_1
      //   483: aload_0
      //   484: monitorexit
      //   485: aload_1
      //   486: athrow
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	487	0	this	c
      //   0	487	1	paramMessage	Message
      //   7	453	2	locald1	a.d
      //   9	389	3	i	int
      //   14	395	4	j	int
      //   31	62	5	localObject1	Object
      //   97	7	5	localException	Exception
      //   174	290	5	localObject2	Object
      //   111	304	6	localx	x
      //   425	9	6	localc01	c0
      //   120	112	7	locald2	a.d
      //   229	10	8	localc02	c0
      //   236	106	9	k	int
      //   353	79	10	l	long
      // Exception table:
      //   from	to	target	type
      //   10	16	97	java/lang/Exception
      //   27	57	97	java/lang/Exception
      //   60	73	97	java/lang/Exception
      //   73	94	97	java/lang/Exception
      //   10	16	111	a4/x
      //   27	57	111	a4/x
      //   60	73	111	a4/x
      //   73	94	111	a4/x
      //   441	474	477	finally
      //   474	476	477	finally
      //   478	480	477	finally
      //   377	397	482	finally
      //   403	405	482	finally
      //   483	485	482	finally
    }
  }
  
  public static final class d
  {
    public final long a;
    public final boolean b;
    public final Object c;
    public int d;
    
    public d(long paramLong1, boolean paramBoolean, long paramLong2, Object paramObject)
    {
      a = paramLong1;
      b = paramBoolean;
      c = paramObject;
    }
  }
  
  public final class e
    extends Handler
  {
    public e(Looper paramLooper)
    {
      super();
    }
    
    public final void handleMessage(Message paramMessage)
    {
      Object localObject1 = (Pair)obj;
      ??? = first;
      localObject1 = second;
      int i = what;
      if (i != 0)
      {
        if (i == 1)
        {
          paramMessage = a.this;
          if ((??? == x) && (paramMessage.b()))
          {
            x = null;
            if ((localObject1 instanceof Exception)) {
              paramMessage.d((Exception)localObject1, false);
            } else {
              try
              {
                ??? = (byte[])localObject1;
                if (e == 3)
                {
                  localObject1 = b;
                  byte[] arrayOfByte = w;
                  i = e0.a;
                  ((o)localObject1).h(arrayOfByte, (byte[])???);
                  localObject1 = i;
                  synchronized (a)
                  {
                    localObject1 = c;
                    ??? = ((Set)localObject1).iterator();
                    if (!((Iterator)???).hasNext()) {
                      return;
                    }
                    ((g.a)((Iterator)???).next()).b();
                  }
                }
                ??? = b.h(v, (byte[])???);
                i = e;
                if (((i == 2) || ((i == 0) && (w != null))) && (??? != null) && (???.length != 0)) {
                  w = ((byte[])???);
                }
                p = 4;
                Object localObject3 = i;
                synchronized (a)
                {
                  localObject3 = c;
                  ??? = ((Set)localObject3).iterator();
                  if (!((Iterator)???).hasNext()) {
                    return;
                  }
                  ((g.a)((Iterator)???).next()).a();
                }
                paramMessage = a.this;
              }
              catch (Exception localException1)
              {
                paramMessage.d(localException1, true);
              }
            }
          }
        }
      }
      else if ((localException1 == y) && ((p == 2) || (paramMessage.b())))
      {
        y = null;
        Object localObject6;
        if ((localObject4 instanceof Exception))
        {
          paramMessage = c;
          localObject6 = (Exception)localObject4;
          ((b.e)paramMessage).a((Exception)localObject6, false);
        }
        else
        {
          try
          {
            b.i((byte[])localObject4);
            paramMessage = (b.e)c;
            b = null;
            localObject6 = t.p(a);
            a.clear();
            localObject6 = ((t)localObject6).r(0);
            while (((o7.a)localObject6).hasNext())
            {
              paramMessage = (a)((o7.a)localObject6).next();
              if (paramMessage.m()) {
                paramMessage.a(true);
              }
            }
            return;
          }
          catch (Exception localException2)
          {
            ((b.e)c).a(localException2, true);
          }
        }
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
 * Qualified Name:     a4.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */