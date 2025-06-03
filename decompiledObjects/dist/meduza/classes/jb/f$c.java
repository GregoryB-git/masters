package jb;

import c4.x;
import eb.e1;
import eb.e1.a;
import eb.s0;
import gb.a.b;
import gb.h2.a;
import gb.t.a;
import gb.v0.g;
import hb.h.b;
import hb.i.d;
import hb.p;
import hb.p.b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import xc.s;
import xc.y;

public final class f$c
  implements b
{
  public final xc.h a;
  public final f.a b;
  public final e.a c;
  
  public f$c(s params)
  {
    a = params;
    params = new f.a(params);
    b = params;
    c = new e.a(params);
  }
  
  public final void C(b.a parama, int paramInt1, byte paramByte, int paramInt2)
  {
    ??? = null;
    int i = 0;
    if (paramInt2 != 0)
    {
      boolean bool;
      if ((paramByte & 0x1) != 0) {
        bool = true;
      } else {
        bool = false;
      }
      int k;
      if ((paramByte & 0x8) != 0)
      {
        j = (short)(a.readByte() & 0xFF);
        k = j;
      }
      else
      {
        j = 0;
        k = j;
      }
      int j = paramInt1;
      if ((paramByte & 0x20) != 0)
      {
        a.readInt();
        a.readByte();
        parama.getClass();
        j = paramInt1 - 5;
      }
      Object localObject2 = g(f.c(j, paramByte, k), k, paramByte, paramInt2);
      i.d locald = (i.d)parama;
      Object localObject3 = a;
      if (((hb.j)localObject3).a())
      {
        parama = a;
        Level localLevel = b;
        localObject3 = new StringBuilder();
        ((StringBuilder)localObject3).append(a0.j.u(1));
        ((StringBuilder)localObject3).append(" HEADERS: streamId=");
        ((StringBuilder)localObject3).append(paramInt2);
        ((StringBuilder)localObject3).append(" headers=");
        ((StringBuilder)localObject3).append(localObject2);
        ((StringBuilder)localObject3).append(" endStream=");
        ((StringBuilder)localObject3).append(bool);
        parama.log(localLevel, ((StringBuilder)localObject3).toString());
      }
      parama = (b.a)???;
      if (d.M != Integer.MAX_VALUE)
      {
        long l = 0L;
        for (paramInt1 = 0; paramInt1 < ((ArrayList)localObject2).size(); paramInt1++)
        {
          parama = (d)((ArrayList)localObject2).get(paramInt1);
          j = a.i();
          l += b.i() + (j + 32);
        }
        j = (int)Math.min(l, 2147483647L);
        paramInt1 = d.M;
        parama = (b.a)???;
        if (j > paramInt1)
        {
          ??? = e1.k;
          localObject3 = Locale.US;
          if (bool) {
            parama = "trailer";
          } else {
            parama = "header";
          }
          parama = ((e1)???).g(String.format((Locale)localObject3, "Response %s metadata larger than %d: %d", new Object[] { parama, Integer.valueOf(paramInt1), Integer.valueOf(j) }));
        }
      }
      synchronized (d.k)
      {
        localObject3 = (hb.h)d.n.get(Integer.valueOf(paramInt2));
        if (localObject3 != null) {
          break label480;
        }
        if (d.p(paramInt2))
        {
          d.i.R(paramInt2, a.f);
          paramInt1 = i;
        }
      }
      paramInt1 = 1;
      break label568;
      label480:
      if (parama == null)
      {
        parama = l.J;
        pb.b.a.getClass();
        l.q((ArrayList)localObject2, bool);
        paramInt1 = i;
      }
      else
      {
        if (!bool) {
          d.i.R(paramInt2, a.q);
        }
        localObject3 = l;
        localObject2 = new eb/s0;
        ((s0)localObject2).<init>();
        ((a.b)localObject3).i((s0)localObject2, parama, false);
        paramInt1 = i;
      }
      label568:
      if (paramInt1 != 0)
      {
        ??? = d;
        parama = new StringBuilder();
        parama.append("Received header for unknown stream: ");
        parama.append(paramInt2);
        hb.i.i((hb.i)???, parama.toString());
      }
      return;
      throw parama;
    }
    f.d("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
    throw null;
  }
  
  /* Error */
  public final void H(b.a parama, int paramInt1, byte paramByte, int paramInt2)
  {
    // Byte code:
    //   0: iload_2
    //   1: bipush 8
    //   3: if_icmpne +398 -> 401
    //   6: iload 4
    //   8: ifne +381 -> 389
    //   11: aload_0
    //   12: getfield 21	jb/f$c:a	Lxc/h;
    //   15: invokeinterface 47 1 0
    //   20: istore 5
    //   22: aload_0
    //   23: getfield 21	jb/f$c:a	Lxc/h;
    //   26: invokeinterface 47 1 0
    //   31: istore 4
    //   33: iload_3
    //   34: iconst_1
    //   35: iand
    //   36: ifeq +8 -> 44
    //   39: iconst_1
    //   40: istore_2
    //   41: goto +5 -> 46
    //   44: iconst_0
    //   45: istore_2
    //   46: aload_1
    //   47: checkcast 60	hb/i$d
    //   50: astore_1
    //   51: iload 5
    //   53: i2l
    //   54: bipush 32
    //   56: lshl
    //   57: iload 4
    //   59: i2l
    //   60: ldc2_w 259
    //   63: land
    //   64: lor
    //   65: lstore 6
    //   67: aload_1
    //   68: getfield 63	hb/i$d:a	Lhb/j;
    //   71: iconst_1
    //   72: lload 6
    //   74: invokevirtual 263	hb/j:d	(IJ)V
    //   77: iload_2
    //   78: ifne +42 -> 120
    //   81: aload_1
    //   82: getfield 116	hb/i$d:d	Lhb/i;
    //   85: getfield 188	hb/i:k	Ljava/lang/Object;
    //   88: astore 8
    //   90: aload 8
    //   92: monitorenter
    //   93: aload_1
    //   94: getfield 116	hb/i$d:d	Lhb/i;
    //   97: getfield 206	hb/i:i	Lhb/b;
    //   100: iload 5
    //   102: iload 4
    //   104: iconst_1
    //   105: invokevirtual 267	hb/b:e	(IIZ)V
    //   108: aload 8
    //   110: monitorexit
    //   111: goto +271 -> 382
    //   114: astore_1
    //   115: aload 8
    //   117: monitorexit
    //   118: aload_1
    //   119: athrow
    //   120: aload_1
    //   121: getfield 116	hb/i$d:d	Lhb/i;
    //   124: getfield 188	hb/i:k	Ljava/lang/Object;
    //   127: astore 8
    //   129: aload 8
    //   131: monitorenter
    //   132: aload_1
    //   133: getfield 116	hb/i$d:d	Lhb/i;
    //   136: astore 9
    //   138: aload 9
    //   140: getfield 271	hb/i:x	Lgb/b1;
    //   143: astore_1
    //   144: aload_1
    //   145: ifnull +67 -> 212
    //   148: aload_1
    //   149: getfield 275	gb/b1:a	J
    //   152: lstore 10
    //   154: lload 10
    //   156: lload 6
    //   158: lcmp
    //   159: ifne +12 -> 171
    //   162: aload 9
    //   164: aconst_null
    //   165: putfield 271	hb/i:x	Lgb/b1;
    //   168: goto +55 -> 223
    //   171: getstatic 278	hb/i:T	Ljava/util/logging/Logger;
    //   174: getstatic 283	java/util/logging/Level:WARNING	Ljava/util/logging/Level;
    //   177: getstatic 164	java/util/Locale:US	Ljava/util/Locale;
    //   180: ldc_w 285
    //   183: iconst_2
    //   184: anewarray 4	java/lang/Object
    //   187: dup
    //   188: iconst_0
    //   189: lload 10
    //   191: invokestatic 290	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   194: aastore
    //   195: dup
    //   196: iconst_1
    //   197: lload 6
    //   199: invokestatic 290	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   202: aastore
    //   203: invokestatic 182	java/lang/String:format	(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   206: invokevirtual 112	java/util/logging/Logger:log	(Ljava/util/logging/Level;Ljava/lang/String;)V
    //   209: goto +12 -> 221
    //   212: getstatic 278	hb/i:T	Ljava/util/logging/Logger;
    //   215: ldc_w 292
    //   218: invokevirtual 296	java/util/logging/Logger:warning	(Ljava/lang/String;)V
    //   221: aconst_null
    //   222: astore_1
    //   223: aload 8
    //   225: monitorexit
    //   226: aload_1
    //   227: ifnull +155 -> 382
    //   230: aload_1
    //   231: monitorenter
    //   232: aload_1
    //   233: getfield 299	gb/b1:d	Z
    //   236: ifeq +8 -> 244
    //   239: aload_1
    //   240: monitorexit
    //   241: goto +141 -> 382
    //   244: aload_1
    //   245: iconst_1
    //   246: putfield 299	gb/b1:d	Z
    //   249: aload_1
    //   250: getfield 302	gb/b1:b	Ln7/p;
    //   253: getstatic 308	java/util/concurrent/TimeUnit:NANOSECONDS	Ljava/util/concurrent/TimeUnit;
    //   256: invokevirtual 313	n7/p:a	(Ljava/util/concurrent/TimeUnit;)J
    //   259: lstore 6
    //   261: aload_1
    //   262: lload 6
    //   264: putfield 315	gb/b1:f	J
    //   267: aload_1
    //   268: getfield 318	gb/b1:c	Ljava/util/LinkedHashMap;
    //   271: astore 8
    //   273: aload_1
    //   274: aconst_null
    //   275: putfield 318	gb/b1:c	Ljava/util/LinkedHashMap;
    //   278: aload_1
    //   279: monitorexit
    //   280: aload 8
    //   282: invokevirtual 324	java/util/LinkedHashMap:entrySet	()Ljava/util/Set;
    //   285: invokeinterface 330 1 0
    //   290: astore_1
    //   291: aload_1
    //   292: invokeinterface 335 1 0
    //   297: ifeq +85 -> 382
    //   300: aload_1
    //   301: invokeinterface 339 1 0
    //   306: checkcast 341	java/util/Map$Entry
    //   309: astore 9
    //   311: aload 9
    //   313: invokeinterface 344 1 0
    //   318: checkcast 346	java/util/concurrent/Executor
    //   321: astore 8
    //   323: new 348	gb/z0
    //   326: dup
    //   327: aload 9
    //   329: invokeinterface 351 1 0
    //   334: checkcast 353	gb/u$a
    //   337: lload 6
    //   339: invokespecial 356	gb/z0:<init>	(Lgb/u$a;J)V
    //   342: astore 9
    //   344: aload 8
    //   346: aload 9
    //   348: invokeinterface 360 2 0
    //   353: goto -62 -> 291
    //   356: astore 8
    //   358: getstatic 362	gb/b1:g	Ljava/util/logging/Logger;
    //   361: getstatic 365	java/util/logging/Level:SEVERE	Ljava/util/logging/Level;
    //   364: ldc_w 367
    //   367: aload 8
    //   369: invokevirtual 370	java/util/logging/Logger:log	(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   372: goto -81 -> 291
    //   375: astore 8
    //   377: aload_1
    //   378: monitorexit
    //   379: aload 8
    //   381: athrow
    //   382: return
    //   383: astore_1
    //   384: aload 8
    //   386: monitorexit
    //   387: aload_1
    //   388: athrow
    //   389: ldc_w 372
    //   392: iconst_0
    //   393: anewarray 4	java/lang/Object
    //   396: invokestatic 257	jb/f:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   399: aconst_null
    //   400: athrow
    //   401: ldc_w 374
    //   404: iconst_1
    //   405: anewarray 4	java/lang/Object
    //   408: dup
    //   409: iconst_0
    //   410: iload_2
    //   411: invokestatic 176	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   414: aastore
    //   415: invokestatic 257	jb/f:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   418: aconst_null
    //   419: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	420	0	this	c
    //   0	420	1	parama	b.a
    //   0	420	2	paramInt1	int
    //   0	420	3	paramByte	byte
    //   0	420	4	paramInt2	int
    //   20	81	5	i	int
    //   65	273	6	l1	long
    //   88	257	8	localObject1	Object
    //   356	12	8	localThrowable	Throwable
    //   375	10	8	localObject2	Object
    //   136	211	9	localObject3	Object
    //   152	38	10	l2	long
    // Exception table:
    //   from	to	target	type
    //   93	111	114	finally
    //   115	118	114	finally
    //   344	353	356	finally
    //   232	241	375	finally
    //   244	280	375	finally
    //   377	379	375	finally
    //   132	144	383	finally
    //   148	154	383	finally
    //   162	168	383	finally
    //   171	209	383	finally
    //   212	221	383	finally
    //   223	226	383	finally
    //   384	387	383	finally
  }
  
  public final void I(b.a parama, int paramInt1, byte paramByte, int paramInt2)
  {
    int i = 0;
    if (paramInt2 != 0)
    {
      int j = i;
      if ((paramByte & 0x8) != 0)
      {
        i = (short)(a.readByte() & 0xFF);
        j = i;
      }
      i = a.readInt();
      ??? = g(f.c(paramInt1 - 4, paramByte, j), j, paramByte, paramInt2);
      parama = (i.d)parama;
      Object localObject2 = a;
      if (((hb.j)localObject2).a())
      {
        Logger localLogger = a;
        localObject2 = b;
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append(a0.j.u(1));
        localStringBuilder.append(" PUSH_PROMISE: streamId=");
        localStringBuilder.append(paramInt2);
        localStringBuilder.append(" promisedStreamId=");
        localStringBuilder.append(i & 0x7FFFFFFF);
        localStringBuilder.append(" headers=");
        localStringBuilder.append(???);
        localLogger.log((Level)localObject2, localStringBuilder.toString());
      }
      synchronized (d.k)
      {
        d.i.R(paramInt2, a.c);
        return;
      }
    }
    f.d("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
    throw null;
  }
  
  public final void M(b.a parama, int paramInt1, int paramInt2)
  {
    if (paramInt1 == 4)
    {
      if (paramInt2 != 0)
      {
        int i = a.readInt();
        for (locala : a.values()) {
          if (a == i) {
            break label66;
          }
        }
        a locala = null;
        label66:
        if (locala != null)
        {
          parama = (i.d)parama;
          a.e(1, paramInt2, locala);
          ??? = hb.i.x(locala).a("Rst Stream");
          ??? = a;
          boolean bool;
          if ((??? != e1.a.d) && (??? != e1.a.o)) {
            bool = false;
          } else {
            bool = true;
          }
          synchronized (d.k)
          {
            Object localObject3 = (hb.h)d.n.get(Integer.valueOf(paramInt2));
            if (localObject3 != null)
            {
              localObject3 = l.J;
              pb.b.a.getClass();
              localObject3 = d;
              if (locala == a.p) {
                parama = t.a.b;
              } else {
                parama = t.a.a;
              }
              ((hb.i)localObject3).l(paramInt2, (e1)???, parama, bool, null, null);
            }
            return;
          }
        }
        f.d("TYPE_RST_STREAM unexpected error code: %d", new Object[] { Integer.valueOf(i) });
        throw null;
      }
      f.d("TYPE_RST_STREAM streamId == 0", new Object[0]);
      throw null;
    }
    f.d("TYPE_RST_STREAM length: %d != 4", new Object[] { Integer.valueOf(paramInt1) });
    throw null;
  }
  
  public final void Q(b.a arg1, int paramInt1, byte paramByte, int paramInt2)
  {
    if (paramInt2 == 0)
    {
      if ((paramByte & 0x1) != 0)
      {
        if (paramInt1 == 0)
        {
          ???.getClass();
          return;
        }
        f.d("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
        throw null;
      }
      if (paramInt1 % 6 == 0)
      {
        x localx1 = new x();
        for (paramInt2 = 0;; paramInt2 += 6)
        {
          paramByte = 7;
          if (paramInt2 >= paramInt1) {
            break;
          }
          byte b1 = a.readShort();
          int i = a.readInt();
          switch (b1)
          {
          default: 
            break;
          case 5: 
            if ((i < 16384) || (i > 16777215))
            {
              f.d("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", new Object[] { Integer.valueOf(i) });
              throw null;
            }
            break;
          case 4: 
            if (i >= 0) {
              break label220;
            }
            f.d("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
            throw null;
          case 3: 
            paramByte = 4;
            break;
          case 2: 
            if ((i != 0) && (i != 1))
            {
              f.d("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
              throw null;
            }
            break;
          }
          paramByte = b1;
          label220:
          localx1.d(paramByte, i);
        }
        i.d locald = (i.d)???;
        a.f(1, localx1);
        synchronized (d.k)
        {
          if (localx1.a(4))
          {
            paramInt1 = ((int[])d)[4];
            d.D = paramInt1;
          }
        }
        boolean bool;
        if (localx2.a(7))
        {
          paramInt1 = ((int[])d)[7];
          bool = d.j.b(paramInt1);
        }
        else
        {
          bool = false;
        }
        if (c)
        {
          hb.i locali = d;
          u = h.c(u);
          d.h.b();
          c = false;
        }
        d.i.L(localx2);
        if (bool) {
          d.j.d();
        }
        d.u();
        paramByte = a;
        if ((paramByte & 0x2) != 0) {
          paramInt1 = ((int[])d)[1];
        } else {
          paramInt1 = -1;
        }
        if (paramInt1 >= 0)
        {
          ??? = c;
          if ((paramByte & 0x2) != 0) {
            paramInt1 = ((int[])d)[1];
          } else {
            paramInt1 = -1;
          }
          c = paramInt1;
          d = paramInt1;
          paramByte = h;
          if (paramInt1 < paramByte) {
            if (paramInt1 == 0)
            {
              Arrays.fill(e, null);
              f = (e.length - 1);
              g = 0;
              h = 0;
            }
            else
            {
              ???.a(paramByte - paramInt1);
            }
          }
        }
        return;
        throw localx2;
      }
      f.d("TYPE_SETTINGS length %% 6 != 0: %s", new Object[] { Integer.valueOf(paramInt1) });
      throw null;
    }
    f.d("TYPE_SETTINGS streamId != 0", new Object[0]);
    throw null;
  }
  
  public final void b0(b.a parama, int paramInt1, int paramInt2)
  {
    int i = 1;
    if (paramInt1 == 4)
    {
      long l = a.readInt() & 0x7FFFFFFF;
      paramInt1 = l < 0L;
      if (paramInt1 != 0)
      {
        Object localObject1 = (i.d)parama;
        ??? = a.c;
        a.g(1, paramInt2, l);
        if (paramInt1 == 0)
        {
          parama = "Received 0 flow control window increment.";
          if (paramInt2 == 0)
          {
            localObject1 = d;
          }
          else
          {
            d.l(paramInt2, e1.m.g("Received 0 flow control window increment."), t.a.a, false, (a)???, null);
            break label273;
          }
        }
        else
        {
          parama = d.k;
          if (paramInt2 != 0) {}
        }
        try
        {
          d.j.c(null, (int)l);
          break label273;
          ??? = (hb.h)d.n.get(Integer.valueOf(paramInt2));
          if (??? != null)
          {
            p localp = d.j;
            Object localObject5 = l;
            synchronized (x)
            {
              localObject5 = K;
              paramInt1 = (int)l;
              localp.c((p.b)localObject5, paramInt1);
            }
          }
          if (!d.p(paramInt2)) {
            paramInt1 = i;
          } else {
            paramInt1 = 0;
          }
          if (paramInt1 != 0)
          {
            hb.i locali = d;
            parama = f.h("Received window_update for unknown stream: ", paramInt2);
            hb.i.i(locali, parama);
          }
          label273:
          return;
        }
        finally {}
      }
      f.d("windowSizeIncrement was 0", new Object[0]);
      throw null;
    }
    f.d("TYPE_WINDOW_UPDATE length !=4: %s", new Object[] { Integer.valueOf(paramInt1) });
    throw null;
  }
  
  public final void close()
  {
    a.close();
  }
  
  public final boolean f(b.a parama)
  {
    try
    {
      a.u0(9L);
      ??? = a;
      int i = ((xc.h)???).readByte();
      int j = ((xc.h)???).readByte();
      i = ((xc.h)???).readByte() & 0xFF | (i & 0xFF) << 16 | (j & 0xFF) << 8;
      if ((i >= 0) && (i <= 16384))
      {
        byte b1 = (byte)(a.readByte() & 0xFF);
        byte b2 = (byte)(a.readByte() & 0xFF);
        int k = a.readInt() & 0x7FFFFFFF;
        ??? = f.a;
        if (((Logger)???).isLoggable(Level.FINE)) {
          ((Logger)???).fine(f.b.a(true, k, i, b1, b2));
        }
        label308:
        long l;
        switch (b1)
        {
        default: 
          a.skip(i);
          break;
        case 8: 
          b0(parama, i, k);
          break;
        case 7: 
          if (i >= 8)
          {
            if (k == 0)
            {
              k = a.readInt();
              int m = a.readInt();
              int n = i - 8;
              for (??? : a.values()) {
                if (a == m) {
                  break label308;
                }
              }
              ??? = null;
              if (??? != null)
              {
                ??? = xc.i.d;
                if (n > 0) {
                  ??? = a.l(n);
                }
                ??? = (i.d)parama;
                a.c(1, k, (a)???, (xc.i)???);
                if (??? == a.t)
                {
                  parama = ((xc.i)???).t();
                  hb.i.T.log(Level.WARNING, String.format("%s: Received GOAWAY with ENHANCE_YOUR_CALM. Debug data: %s", new Object[] { ???, parama }));
                  if ("too_many_pings".equals(parama)) {
                    d.L.run();
                  }
                }
                l = a;
                parama = v0.g.d;
                if ((l < parama.length) && (l >= 0L)) {
                  parama = parama[((int)l)];
                } else {
                  parama = null;
                }
                if (parama == null)
                {
                  ??? = e1.c(cb.a.a);
                  parama = new StringBuilder();
                  parama.append("Unrecognized HTTP/2 error code: ");
                  parama.append(l);
                  parama = ((e1)???).g(parama.toString());
                }
                else
                {
                  parama = b;
                }
                ??? = parama.a("Received Goaway");
                parama = (b.a)???;
                if (((xc.i)???).i() > 0) {
                  parama = ((e1)???).a(((xc.i)???).t());
                }
                ??? = d;
                ??? = hb.i.S;
                ((hb.i)???).t(k, null, parama);
              }
              else
              {
                f.d("TYPE_GOAWAY unexpected error code: %d", new Object[] { Integer.valueOf(m) });
                throw null;
              }
            }
            else
            {
              f.d("TYPE_GOAWAY streamId != 0", new Object[0]);
              throw null;
            }
          }
          else
          {
            f.d("TYPE_GOAWAY length < 8: %s", new Object[] { Integer.valueOf(i) });
            throw null;
          }
          break;
        case 6: 
          H(parama, i, b2, k);
          break;
        case 5: 
          I(parama, i, b2, k);
          break;
        case 4: 
          Q(parama, i, b2, k);
          break;
        case 3: 
          M(parama, i, k);
          break;
        case 2: 
          if (i == 5)
          {
            if (k != 0)
            {
              a.readInt();
              a.readByte();
              parama.getClass();
            }
            else
            {
              f.d("TYPE_PRIORITY streamId == 0", new Object[0]);
              throw null;
            }
          }
          else
          {
            f.d("TYPE_PRIORITY length: %d != 5", new Object[] { Integer.valueOf(i) });
            throw null;
          }
          break;
        case 1: 
          C(parama, i, b2, k);
          break;
        case 0: 
          boolean bool;
          if ((b2 & 0x1) != 0) {
            bool = true;
          } else {
            bool = false;
          }
          if ((b2 & 0x20) != 0) {
            j = 1;
          } else {
            j = 0;
          }
          if (j == 0)
          {
            int i1;
            if ((b2 & 0x8) != 0)
            {
              j = (short)(a.readByte() & 0xFF);
              i1 = j;
            }
            else
            {
              j = 0;
              i1 = j;
            }
            j = f.c(i, b2, i1);
            ??? = a;
            parama = (i.d)parama;
            a.b(1, k, ((xc.h)???).t(), j, bool);
            ??? = d;
            synchronized (k)
            {
              ??? = (hb.h)n.get(Integer.valueOf(k));
              if (??? == null)
              {
                if (d.p(k)) {
                  synchronized (d.k)
                  {
                    d.i.R(k, a.f);
                    ((xc.h)???).skip(j);
                  }
                }
                ??? = d;
                parama = new StringBuilder();
                parama.append("Received data for unknown stream: ");
                parama.append(k);
                hb.i.i((hb.i)???, parama.toString());
              }
              else
              {
                l = j;
                ((xc.h)???).u0(l);
                ??? = new xc.f();
                ((xc.f)???).g0(((xc.h)???).t(), l);
                ??? = l.J;
                pb.b.a.getClass();
              }
              synchronized (d.k)
              {
                l.p(i - j, (xc.f)???, bool);
                ??? = d;
                j = s + i;
                s = j;
                if (j >= f * 0.5F) {
                  synchronized (k)
                  {
                    ??? = d;
                    i.d(0, s);
                    d.s = 0;
                  }
                }
                a.skip(i1);
              }
            }
          }
          f.d("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
          throw null;
        }
        return true;
      }
      f.d("FRAME_SIZE_ERROR: %s", new Object[] { Integer.valueOf(i) });
      throw null;
    }
    catch (IOException parama) {}
    return false;
  }
  
  public final ArrayList g(int paramInt1, short paramShort, byte paramByte, int paramInt2)
  {
    Object localObject1 = b;
    e = paramInt1;
    b = paramInt1;
    f = ((short)paramShort);
    c = ((byte)paramByte);
    d = paramInt2;
    localObject1 = c;
    while (!b.v())
    {
      paramInt1 = b.readByte() & 0xFF;
      if (paramInt1 != 128)
      {
        paramShort = 0;
        if ((paramInt1 & 0x80) == 128)
        {
          paramByte = ((e.a)localObject1).e(paramInt1, 127) - 1;
          paramInt1 = paramShort;
          if (paramByte >= 0)
          {
            paramInt1 = paramShort;
            if (paramByte <= e.b.length - 1) {
              paramInt1 = 1;
            }
          }
          if (paramInt1 != 0)
          {
            localObject2 = e.b[paramByte];
            a.add(localObject2);
          }
          else
          {
            paramInt1 = e.b.length;
            paramInt1 = f + 1 + (paramByte - paramInt1);
            if (paramInt1 >= 0)
            {
              localObject2 = e;
              if (paramInt1 <= localObject2.length - 1)
              {
                a.add(localObject2[paramInt1]);
                continue;
              }
            }
            localObject1 = f.l("Header index too large ");
            ((StringBuilder)localObject1).append(paramByte + 1);
            throw new IOException(((StringBuilder)localObject1).toString());
          }
        }
        else if (paramInt1 == 64)
        {
          localObject2 = ((e.a)localObject1).d();
          e.a((xc.i)localObject2);
          ((e.a)localObject1).c(new d((xc.i)localObject2, ((e.a)localObject1).d()));
        }
        else if ((paramInt1 & 0x40) == 64)
        {
          ((e.a)localObject1).c(new d(((e.a)localObject1).b(((e.a)localObject1).e(paramInt1, 63) - 1), ((e.a)localObject1).d()));
        }
        else if ((paramInt1 & 0x20) == 32)
        {
          paramShort = ((e.a)localObject1).e(paramInt1, 31);
          d = paramShort;
          if ((paramShort >= 0) && (paramShort <= c))
          {
            paramInt1 = h;
            if (paramShort < paramInt1) {
              if (paramShort == 0)
              {
                Arrays.fill(e, null);
                f = (e.length - 1);
                g = 0;
                h = 0;
              }
              else
              {
                ((e.a)localObject1).a(paramInt1 - paramShort);
              }
            }
          }
          else
          {
            localObject2 = f.l("Invalid dynamic table size update ");
            ((StringBuilder)localObject2).append(d);
            throw new IOException(((StringBuilder)localObject2).toString());
          }
        }
        else
        {
          xc.i locali;
          if ((paramInt1 != 16) && (paramInt1 != 0))
          {
            localObject2 = ((e.a)localObject1).b(((e.a)localObject1).e(paramInt1, 15) - 1);
            locali = ((e.a)localObject1).d();
            a.add(new d((xc.i)localObject2, locali));
          }
          else
          {
            locali = ((e.a)localObject1).d();
            e.a(locali);
            localObject2 = ((e.a)localObject1).d();
            a.add(new d(locali, (xc.i)localObject2));
          }
        }
      }
      else
      {
        throw new IOException("index == 0");
      }
    }
    Object localObject2 = c;
    localObject2.getClass();
    localObject1 = new ArrayList(a);
    a.clear();
    return (ArrayList)localObject1;
  }
}

/* Location:
 * Qualified Name:     jb.f.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */