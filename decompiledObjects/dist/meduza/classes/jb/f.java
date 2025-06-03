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
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import xc.i.a;
import xc.r;
import xc.s;
import xc.w;
import xc.y;
import xc.z;

public final class f
  implements h
{
  public static final Logger a = Logger.getLogger(b.class.getName());
  public static final xc.i b = i.a.a("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
  
  static
  {
    xc.i locali = xc.i.d;
  }
  
  public static int c(int paramInt, byte paramByte, short paramShort)
  {
    short s = paramInt;
    if ((paramByte & 0x8) != 0) {
      s = paramInt - 1;
    }
    if (paramShort <= s) {
      return (short)(s - paramShort);
    }
    d("PROTOCOL_ERROR padding %s > remaining length %s", new Object[] { Short.valueOf(paramShort), Integer.valueOf(s) });
    throw null;
  }
  
  public static void d(String paramString, Object... paramVarArgs)
  {
    throw new IOException(String.format(Locale.US, paramString, paramVarArgs));
  }
  
  public final d a(r paramr)
  {
    return new d(paramr);
  }
  
  public final c b(s params)
  {
    return new c(params);
  }
  
  public static final class a
    implements y
  {
    public final xc.h a;
    public int b;
    public byte c;
    public int d;
    public int e;
    public short f;
    
    public a(s params)
    {
      a = params;
    }
    
    public final z c()
    {
      return a.c();
    }
    
    public final void close() {}
    
    public final long e0(xc.f paramf, long paramLong)
    {
      int i;
      int k;
      byte b1;
      do
      {
        i = e;
        if (i != 0) {
          break label265;
        }
        a.skip(f);
        f = ((short)0);
        if ((c & 0x4) != 0) {
          return -1L;
        }
        i = d;
        Object localObject = a;
        Logger localLogger = f.a;
        int j = ((xc.h)localObject).readByte();
        k = ((xc.h)localObject).readByte();
        k = ((xc.h)localObject).readByte() & 0xFF | (j & 0xFF) << 16 | (k & 0xFF) << 8;
        e = k;
        b = k;
        b1 = (byte)(a.readByte() & 0xFF);
        c = ((byte)(byte)(a.readByte() & 0xFF));
        localObject = f.a;
        if (((Logger)localObject).isLoggable(Level.FINE)) {
          ((Logger)localObject).fine(f.b.a(true, d, b, b1, c));
        }
        k = a.readInt() & 0x7FFFFFFF;
        d = k;
        if (b1 != 9) {
          break;
        }
      } while (k == i);
      f.d("TYPE_CONTINUATION streamId changed", new Object[0]);
      throw null;
      f.d("%s != TYPE_CONTINUATION", new Object[] { Byte.valueOf(b1) });
      throw null;
      label265:
      paramLong = a.e0(paramf, Math.min(paramLong, i));
      if (paramLong == -1L) {
        return -1L;
      }
      e -= (int)paramLong;
      return paramLong;
    }
  }
  
  public static final class b
  {
    public static final String[] a = { "DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION" };
    public static final String[] b = new String[64];
    public static final String[] c = new String['Ā'];
    
    static
    {
      int i = 0;
      for (int j = 0;; j++)
      {
        localObject = c;
        if (j >= localObject.length) {
          break;
        }
        localObject[j] = String.format("%8s", new Object[] { Integer.toBinaryString(j) }).replace(' ', '0');
      }
      String[] arrayOfString = b;
      arrayOfString[0] = "";
      arrayOfString[1] = "END_STREAM";
      Object localObject = new int[1];
      localObject[0] = 1;
      arrayOfString[8] = "PADDED";
      int k;
      for (j = 0; j < 1; j++)
      {
        k = localObject[j];
        arrayOfString = b;
        arrayOfString[(k | 0x8)] = g.f(new StringBuilder(), arrayOfString[k], "|PADDED");
      }
      arrayOfString = b;
      arrayOfString[4] = "END_HEADERS";
      arrayOfString[32] = "PRIORITY";
      arrayOfString[36] = "END_HEADERS|PRIORITY";
      for (j = 0;; j++)
      {
        k = i;
        if (j >= 3) {
          break;
        }
        int m = new int[] { 4, 32, 36 }[j];
        for (k = 0; k < 1; k++)
        {
          int n = localObject[k];
          arrayOfString = b;
          int i1 = n | m;
          StringBuilder localStringBuilder = new StringBuilder();
          localStringBuilder.append(arrayOfString[n]);
          localStringBuilder.append('|');
          localStringBuilder.append(arrayOfString[m]);
          arrayOfString[i1] = localStringBuilder.toString();
          localStringBuilder = new StringBuilder();
          localStringBuilder.append(arrayOfString[n]);
          localStringBuilder.append('|');
          arrayOfString[(i1 | 0x8)] = g.f(localStringBuilder, arrayOfString[m], "|PADDED");
        }
      }
      for (;;)
      {
        localObject = b;
        if (k >= localObject.length) {
          break;
        }
        if (localObject[k] == null) {
          localObject[k] = c[k];
        }
        k++;
      }
    }
    
    public static String a(boolean paramBoolean, int paramInt1, int paramInt2, byte paramByte1, byte paramByte2)
    {
      Object localObject1 = a;
      String str1;
      if (paramByte1 < 10) {
        str1 = localObject1[paramByte1];
      } else {
        str1 = String.format("0x%02x", new Object[] { Byte.valueOf(paramByte1) });
      }
      String str2;
      if (paramByte2 == 0)
      {
        localObject1 = "";
      }
      else
      {
        if ((paramByte1 != 2) && (paramByte1 != 3)) {
          if ((paramByte1 != 4) && (paramByte1 != 6))
          {
            if ((paramByte1 != 7) && (paramByte1 != 8))
            {
              localObject1 = b;
              if (paramByte2 < 64) {
                localObject1 = localObject1[paramByte2];
              } else {
                localObject1 = c[paramByte2];
              }
              if ((paramByte1 == 5) && ((paramByte2 & 0x4) != 0)) {
                localObject2 = "HEADERS";
              }
              for (str2 = "PUSH_PROMISE";; str2 = "COMPRESSED")
              {
                localObject1 = ((String)localObject1).replace((CharSequence)localObject2, str2);
                break;
                if ((paramByte1 != 0) || ((paramByte2 & 0x20) == 0)) {
                  break;
                }
                localObject2 = "PRIORITY";
              }
              break label205;
            }
          }
          else
          {
            if (paramByte2 == 1)
            {
              localObject1 = "ACK";
              break label205;
            }
            localObject1 = c[paramByte2];
            break label205;
          }
        }
        localObject1 = c[paramByte2];
      }
      label205:
      Object localObject2 = Locale.US;
      if (paramBoolean) {
        str2 = "<<";
      } else {
        str2 = ">>";
      }
      return String.format((Locale)localObject2, "%s 0x%08x %5d %-13s %s", new Object[] { str2, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), str1, localObject1 });
    }
  }
  
  public static final class c
    implements b
  {
    public final xc.h a;
    public final f.a b;
    public final e.a c;
    
    public c(s params)
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
  
  public static final class d
    implements c
  {
    public final xc.g a;
    public final boolean b;
    public final xc.f c;
    public final e.b d;
    public int e;
    public boolean f;
    
    public d(r paramr)
    {
      a = paramr;
      b = true;
      paramr = new xc.f();
      c = paramr;
      d = new e.b(paramr);
      e = 16384;
    }
    
    public final void A(boolean paramBoolean, int paramInt, List paramList)
    {
      try
      {
        if (!f)
        {
          g(paramInt, paramList, paramBoolean);
          return;
        }
        paramList = new java/io/IOException;
        paramList.<init>("closed");
        throw paramList;
      }
      finally {}
    }
    
    public final void L(x paramx)
    {
      try
      {
        if (!f)
        {
          int i = e;
          if ((a & 0x20) != 0) {
            i = ((int[])d)[5];
          }
          e = i;
          f(0, 0, (byte)4, (byte)1);
          a.flush();
          return;
        }
        paramx = new java/io/IOException;
        paramx.<init>("closed");
        throw paramx;
      }
      finally {}
    }
    
    public final void R(int paramInt, a parama)
    {
      try
      {
        if (!f)
        {
          if (a != -1)
          {
            f(paramInt, 4, (byte)3, (byte)0);
            a.writeInt(a);
            a.flush();
            return;
          }
          parama = new java/lang/IllegalArgumentException;
          parama.<init>();
          throw parama;
        }
        parama = new java/io/IOException;
        parama.<init>("closed");
        throw parama;
      }
      finally {}
    }
    
    public final void a0(x paramx)
    {
      try
      {
        if (!f)
        {
          int i = Integer.bitCount(a);
          int j = 0;
          f(0, i * 6, (byte)4, (byte)0);
          while (j < 10)
          {
            if (paramx.a(j))
            {
              if (j == 4) {
                i = 3;
              } else if (j == 7) {
                i = 4;
              } else {
                i = j;
              }
              a.writeShort(i);
              a.writeInt(((int[])d)[j]);
            }
            j++;
          }
          a.flush();
          return;
        }
        paramx = new java/io/IOException;
        paramx.<init>("closed");
        throw paramx;
      }
      finally {}
    }
    
    public final void close()
    {
      try
      {
        f = true;
        a.close();
        return;
      }
      finally
      {
        localObject = finally;
        throw ((Throwable)localObject);
      }
    }
    
    public final void d(int paramInt, long paramLong)
    {
      try
      {
        if (!f)
        {
          if ((paramLong != 0L) && (paramLong <= 2147483647L))
          {
            f(paramInt, 4, (byte)8, (byte)0);
            a.writeInt((int)paramLong);
            a.flush();
            return;
          }
          localObject1 = new java/lang/IllegalArgumentException;
          ((IllegalArgumentException)localObject1).<init>(String.format(Locale.US, "windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", new Object[] { Long.valueOf(paramLong) }));
          throw ((Throwable)localObject1);
        }
        Object localObject1 = new java/io/IOException;
        ((IOException)localObject1).<init>("closed");
        throw ((Throwable)localObject1);
      }
      finally {}
    }
    
    public final void e(int paramInt1, int paramInt2, boolean paramBoolean)
    {
      try
      {
        if (!f)
        {
          byte b1;
          byte b2;
          if (paramBoolean)
          {
            b1 = 1;
            b2 = b1;
          }
          else
          {
            b1 = 0;
            b2 = b1;
          }
          f(0, 8, (byte)6, b2);
          a.writeInt(paramInt1);
          a.writeInt(paramInt2);
          a.flush();
          return;
        }
        IOException localIOException = new java/io/IOException;
        localIOException.<init>("closed");
        throw localIOException;
      }
      finally {}
    }
    
    public final void f(int paramInt1, int paramInt2, byte paramByte1, byte paramByte2)
    {
      Object localObject = f.a;
      if (((Logger)localObject).isLoggable(Level.FINE)) {
        ((Logger)localObject).fine(f.b.a(false, paramInt1, paramInt2, paramByte1, paramByte2));
      }
      int i = e;
      if (paramInt2 <= i)
      {
        if ((0x80000000 & paramInt1) == 0)
        {
          localObject = a;
          ((xc.g)localObject).writeByte(paramInt2 >>> 16 & 0xFF);
          ((xc.g)localObject).writeByte(paramInt2 >>> 8 & 0xFF);
          ((xc.g)localObject).writeByte(paramInt2 & 0xFF);
          a.writeByte(paramByte1 & 0xFF);
          a.writeByte(paramByte2 & 0xFF);
          a.writeInt(paramInt1 & 0x7FFFFFFF);
          return;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "reserved bit set: %s", new Object[] { Integer.valueOf(paramInt1) }));
      }
      throw new IllegalArgumentException(String.format(Locale.US, "FRAME_SIZE_ERROR length > %d: %d", new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt2) }));
    }
    
    public final void flush()
    {
      try
      {
        if (!f)
        {
          a.flush();
          return;
        }
        IOException localIOException = new java/io/IOException;
        localIOException.<init>("closed");
        throw localIOException;
      }
      finally {}
    }
    
    public final void g(int paramInt, List paramList, boolean paramBoolean)
    {
      if (!f)
      {
        e.b localb = d;
        localb.getClass();
        int i = paramList.size();
        int m;
        for (int j = 0; j < i; j++)
        {
          d locald = (d)paramList.get(j);
          Object localObject1 = a.r();
          Object localObject2 = b;
          Object localObject3 = (Integer)e.c.get(localObject1);
          if (localObject3 != null)
          {
            k = ((Integer)localObject3).intValue() + 1;
            if ((k >= 2) && (k <= 7))
            {
              localObject3 = e.b;
              if (1b.equals(localObject2)) {
                break label169;
              }
              if (b.equals(localObject2))
              {
                m = k + 1;
                break label173;
              }
            }
            m = -1;
            break label173;
          }
          else
          {
            k = -1;
          }
          label169:
          m = k;
          label173:
          int n = k;
          int i1 = m;
          int i2;
          if (m == -1) {
            for (n = d;; n = i2)
            {
              i2 = n + 1;
              localObject3 = b;
              n = k;
              i1 = m;
              if (i2 >= localObject3.length) {
                break;
              }
              n = k;
              if (a.equals(localObject1))
              {
                if (b[i2].b.equals(localObject2))
                {
                  m = d;
                  i1 = e.b.length + (i2 - m);
                  n = k;
                  break;
                }
                n = k;
                if (k == -1) {
                  n = i2 - d + e.b.length;
                }
              }
              k = n;
            }
          }
          if (i1 != -1)
          {
            localb.a(i1, 127, 128);
          }
          else
          {
            if (n == -1)
            {
              a.B0(64);
              localb.a(((xc.i)localObject1).i(), 127, 0);
              a.z0((xc.i)localObject1);
            }
            else
            {
              localObject3 = e.a;
              localObject1.getClass();
              ec.i.e(localObject3, "prefix");
              if ((((xc.i)localObject1).q((xc.i)localObject3, a.length)) && (!d.h.equals(localObject1)))
              {
                localb.a(n, 15, 0);
                localb.a(((xc.i)localObject2).i(), 127, 0);
                a.z0((xc.i)localObject2);
                continue;
              }
              localb.a(n, 63, 64);
            }
            localb.a(((xc.i)localObject2).i(), 127, 0);
            a.z0((xc.i)localObject2);
            i1 = c;
            if (i1 > 4096)
            {
              Arrays.fill(b, null);
              d = (b.length - 1);
              c = 0;
              e = 0;
            }
            else
            {
              n = e + i1 - 4096;
              if (n > 0)
              {
                k = b.length - 1;
                m = 0;
                for (;;)
                {
                  i2 = d;
                  if ((k < i2) || (n <= 0)) {
                    break;
                  }
                  i2 = b[k].c;
                  n -= i2;
                  e -= i2;
                  c -= 1;
                  m++;
                  k--;
                }
                localObject1 = b;
                k = i2 + 1;
                System.arraycopy(localObject1, k, localObject1, k + m, c);
                d += m;
              }
              m = c;
              localObject1 = b;
              if (m + 1 > localObject1.length)
              {
                localObject2 = new d[localObject1.length * 2];
                System.arraycopy(localObject1, 0, localObject2, localObject1.length, localObject1.length);
                d = (b.length - 1);
                b = ((d[])localObject2);
              }
              m = d;
              d = (m - 1);
              b[m] = locald;
              c += 1;
              e += i1;
            }
          }
        }
        long l1 = c.b;
        int k = (int)Math.min(e, l1);
        long l2 = k;
        boolean bool = l1 < l2;
        if (!bool) {
          m = 4;
        } else {
          m = 0;
        }
        int i3 = m;
        if (paramBoolean)
        {
          m = (byte)(m | 0x1);
          i3 = m;
        }
        f(paramInt, k, (byte)1, i3);
        a.g0(c, l2);
        if (bool)
        {
          l1 -= l2;
          while (l1 > 0L)
          {
            m = (int)Math.min(e, l1);
            l2 = m;
            l1 -= l2;
            if (l1 == 0L)
            {
              k = 4;
              i3 = k;
            }
            else
            {
              k = 0;
              i3 = k;
            }
            f(paramInt, m, (byte)9, i3);
            a.g0(c, l2);
          }
        }
        return;
      }
      throw new IOException("closed");
    }
    
    public final void o0(a parama, byte[] paramArrayOfByte)
    {
      try
      {
        if (!f)
        {
          if (a != -1)
          {
            f(0, paramArrayOfByte.length + 8, (byte)7, (byte)0);
            a.writeInt(0);
            a.writeInt(a);
            if (paramArrayOfByte.length > 0) {
              a.write(paramArrayOfByte);
            }
            a.flush();
            return;
          }
          parama = new java/lang/IllegalArgumentException;
          parama.<init>(String.format(Locale.US, "errorCode.httpCode == -1", new Object[0]));
          throw parama;
        }
        parama = new java/io/IOException;
        parama.<init>("closed");
        throw parama;
      }
      finally {}
    }
    
    public final int t0()
    {
      return e;
    }
    
    public final void u(boolean paramBoolean, int paramInt1, xc.f paramf, int paramInt2)
    {
      try
      {
        if (!f)
        {
          byte b1;
          byte b2;
          if (paramBoolean)
          {
            b1 = (byte)1;
            b2 = b1;
          }
          else
          {
            b1 = 0;
            b2 = b1;
          }
          f(paramInt1, paramInt2, (byte)0, b2);
          if (paramInt2 > 0) {
            a.g0(paramf, paramInt2);
          }
          return;
        }
        paramf = new java/io/IOException;
        paramf.<init>("closed");
        throw paramf;
      }
      finally {}
    }
    
    public final void w()
    {
      try
      {
        if (!f)
        {
          boolean bool = b;
          if (!bool) {
            return;
          }
          localObject1 = f.a;
          if (((Logger)localObject1).isLoggable(Level.FINE)) {
            ((Logger)localObject1).fine(String.format(">> CONNECTION %s", new Object[] { f.b.l() }));
          }
          a.write(f.b.s());
          a.flush();
          return;
        }
        Object localObject1 = new java/io/IOException;
        ((IOException)localObject1).<init>("closed");
        throw ((Throwable)localObject1);
      }
      finally {}
    }
  }
}

/* Location:
 * Qualified Name:     jb.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */