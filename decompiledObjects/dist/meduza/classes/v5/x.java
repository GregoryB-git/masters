package v5;

import com.google.android.exoplayer2.source.dash.DashMediaSource;
import com.google.android.exoplayer2.source.dash.DashMediaSource.a;
import f;
import java.io.IOException;
import java.util.ConcurrentModificationException;
import t5.d0;
import t5.d0.a;
import t5.d0.b;
import t5.d0.d;

public final class x
{
  public static final Object a = new Object();
  public static final Object b = new Object();
  public static boolean c;
  public static long d;
  
  /* Error */
  public static long a()
  {
    // Byte code:
    //   0: getstatic 26	v5/x:b	Ljava/lang/Object;
    //   3: astore_0
    //   4: aload_0
    //   5: monitorenter
    //   6: aload_0
    //   7: monitorexit
    //   8: ldc 30
    //   10: invokestatic 36	java/net/InetAddress:getByName	(Ljava/lang/String;)Ljava/net/InetAddress;
    //   13: astore_1
    //   14: new 38	java/net/DatagramSocket
    //   17: dup
    //   18: invokespecial 39	java/net/DatagramSocket:<init>	()V
    //   21: astore_0
    //   22: aload_0
    //   23: sipush 10000
    //   26: invokevirtual 43	java/net/DatagramSocket:setSoTimeout	(I)V
    //   29: bipush 48
    //   31: newarray <illegal type>
    //   33: astore_2
    //   34: new 45	java/net/DatagramPacket
    //   37: astore_3
    //   38: aload_3
    //   39: aload_2
    //   40: bipush 48
    //   42: aload_1
    //   43: bipush 123
    //   45: invokespecial 48	java/net/DatagramPacket:<init>	([BILjava/net/InetAddress;I)V
    //   48: aload_2
    //   49: iconst_0
    //   50: bipush 27
    //   52: i2b
    //   53: bastore
    //   54: invokestatic 53	java/lang/System:currentTimeMillis	()J
    //   57: lstore 4
    //   59: invokestatic 58	android/os/SystemClock:elapsedRealtime	()J
    //   62: lstore 6
    //   64: lload 4
    //   66: lconst_0
    //   67: lcmp
    //   68: ifne +15 -> 83
    //   71: aload_2
    //   72: bipush 40
    //   74: bipush 48
    //   76: iconst_0
    //   77: invokestatic 64	java/util/Arrays:fill	([BIIB)V
    //   80: goto +145 -> 225
    //   83: lload 4
    //   85: ldc2_w 65
    //   88: ldiv
    //   89: lstore 8
    //   91: lload 8
    //   93: invokestatic 72	java/lang/Long:signum	(J)I
    //   96: pop
    //   97: lload 8
    //   99: ldc2_w 73
    //   102: ladd
    //   103: lstore 10
    //   105: lload 10
    //   107: bipush 24
    //   109: lshr
    //   110: l2i
    //   111: i2b
    //   112: istore 12
    //   114: aload_2
    //   115: bipush 40
    //   117: iload 12
    //   119: i2b
    //   120: bastore
    //   121: aload_2
    //   122: bipush 41
    //   124: lload 10
    //   126: bipush 16
    //   128: lshr
    //   129: l2i
    //   130: i2b
    //   131: i2b
    //   132: bastore
    //   133: aload_2
    //   134: bipush 42
    //   136: lload 10
    //   138: bipush 8
    //   140: lshr
    //   141: l2i
    //   142: i2b
    //   143: i2b
    //   144: bastore
    //   145: aload_2
    //   146: bipush 43
    //   148: lload 10
    //   150: iconst_0
    //   151: lshr
    //   152: l2i
    //   153: i2b
    //   154: i2b
    //   155: bastore
    //   156: lload 4
    //   158: lload 8
    //   160: ldc2_w 65
    //   163: lmul
    //   164: lsub
    //   165: ldc2_w 75
    //   168: lmul
    //   169: ldc2_w 65
    //   172: ldiv
    //   173: lstore 8
    //   175: aload_2
    //   176: bipush 44
    //   178: lload 8
    //   180: bipush 24
    //   182: lshr
    //   183: l2i
    //   184: i2b
    //   185: i2b
    //   186: bastore
    //   187: aload_2
    //   188: bipush 45
    //   190: lload 8
    //   192: bipush 16
    //   194: lshr
    //   195: l2i
    //   196: i2b
    //   197: i2b
    //   198: bastore
    //   199: aload_2
    //   200: bipush 46
    //   202: lload 8
    //   204: bipush 8
    //   206: lshr
    //   207: l2i
    //   208: i2b
    //   209: i2b
    //   210: bastore
    //   211: aload_2
    //   212: bipush 47
    //   214: invokestatic 82	java/lang/Math:random	()D
    //   217: ldc2_w 83
    //   220: dmul
    //   221: d2i
    //   222: i2b
    //   223: i2b
    //   224: bastore
    //   225: aload_0
    //   226: aload_3
    //   227: invokevirtual 88	java/net/DatagramSocket:send	(Ljava/net/DatagramPacket;)V
    //   230: new 45	java/net/DatagramPacket
    //   233: astore_1
    //   234: aload_1
    //   235: aload_2
    //   236: bipush 48
    //   238: invokespecial 91	java/net/DatagramPacket:<init>	([BI)V
    //   241: aload_0
    //   242: aload_1
    //   243: invokevirtual 94	java/net/DatagramSocket:receive	(Ljava/net/DatagramPacket;)V
    //   246: invokestatic 58	android/os/SystemClock:elapsedRealtime	()J
    //   249: lstore 8
    //   251: lload 8
    //   253: lload 6
    //   255: lsub
    //   256: lload 4
    //   258: ladd
    //   259: lstore 6
    //   261: aload_2
    //   262: iconst_0
    //   263: baload
    //   264: istore 12
    //   266: iload 12
    //   268: bipush 6
    //   270: ishr
    //   271: iconst_3
    //   272: iand
    //   273: i2b
    //   274: istore 13
    //   276: iload 12
    //   278: bipush 7
    //   280: iand
    //   281: i2b
    //   282: istore 14
    //   284: aload_2
    //   285: iconst_1
    //   286: baload
    //   287: istore 12
    //   289: aload_2
    //   290: bipush 24
    //   292: invokestatic 97	v5/x:d	([BI)J
    //   295: lstore 4
    //   297: aload_2
    //   298: bipush 32
    //   300: invokestatic 97	v5/x:d	([BI)J
    //   303: lstore 10
    //   305: aload_2
    //   306: bipush 40
    //   308: invokestatic 97	v5/x:d	([BI)J
    //   311: lstore 15
    //   313: iload 13
    //   315: iload 14
    //   317: iload 12
    //   319: sipush 255
    //   322: iand
    //   323: lload 15
    //   325: invokestatic 100	v5/x:b	(BBIJ)V
    //   328: lload 15
    //   330: lload 6
    //   332: lsub
    //   333: lload 10
    //   335: lload 4
    //   337: lsub
    //   338: ladd
    //   339: ldc2_w 101
    //   342: ldiv
    //   343: lstore 4
    //   345: aload_0
    //   346: invokevirtual 105	java/net/DatagramSocket:close	()V
    //   349: lload 6
    //   351: lload 4
    //   353: ladd
    //   354: lload 8
    //   356: lsub
    //   357: lreturn
    //   358: astore_2
    //   359: aload_0
    //   360: invokevirtual 105	java/net/DatagramSocket:close	()V
    //   363: goto +9 -> 372
    //   366: astore_0
    //   367: aload_2
    //   368: aload_0
    //   369: invokevirtual 111	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   372: aload_2
    //   373: athrow
    //   374: astore_2
    //   375: aload_0
    //   376: monitorexit
    //   377: aload_2
    //   378: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   3	357	0	localObject1	Object
    //   366	10	0	localThrowable	Throwable
    //   13	230	1	localObject2	Object
    //   33	273	2	arrayOfByte	byte[]
    //   358	15	2	localObject3	Object
    //   374	4	2	localObject4	Object
    //   37	190	3	localDatagramPacket	java.net.DatagramPacket
    //   57	295	4	l1	long
    //   62	288	6	l2	long
    //   89	266	8	l3	long
    //   103	231	10	l4	long
    //   112	211	12	i	int
    //   274	40	13	b1	byte
    //   282	34	14	b2	byte
    //   311	18	15	l5	long
    // Exception table:
    //   from	to	target	type
    //   22	48	358	finally
    //   54	64	358	finally
    //   71	80	358	finally
    //   83	91	358	finally
    //   156	175	358	finally
    //   211	225	358	finally
    //   225	251	358	finally
    //   289	345	358	finally
    //   359	363	366	finally
    //   6	8	374	finally
    //   375	377	374	finally
  }
  
  public static void b(byte paramByte1, byte paramByte2, int paramInt, long paramLong)
  {
    if (paramByte1 != 3)
    {
      if ((paramByte2 != 4) && (paramByte2 != 5)) {
        throw new IOException(f.h("SNTP: Untrusted mode: ", paramByte2));
      }
      if ((paramInt != 0) && (paramInt <= 15))
      {
        if (paramLong != 0L) {
          return;
        }
        throw new IOException("SNTP: Zero transmitTime");
      }
      throw new IOException(f.h("SNTP: Untrusted stratum: ", paramInt));
    }
    throw new IOException("SNTP: Unsynchronized server");
  }
  
  public static long c(byte[] paramArrayOfByte, int paramInt)
  {
    int i = paramArrayOfByte[paramInt];
    int j = paramArrayOfByte[(paramInt + 1)];
    int k = paramArrayOfByte[(paramInt + 2)];
    int m = paramArrayOfByte[(paramInt + 3)];
    paramInt = i;
    if ((i & 0x80) == 128) {
      paramInt = (i & 0x7F) + 128;
    }
    i = j;
    if ((j & 0x80) == 128) {
      i = (j & 0x7F) + 128;
    }
    j = k;
    if ((k & 0x80) == 128) {
      j = (k & 0x7F) + 128;
    }
    k = m;
    if ((m & 0x80) == 128) {
      k = (m & 0x7F) + 128;
    }
    return (paramInt << 24) + (i << 16) + (j << 8) + k;
  }
  
  public static long d(byte[] paramArrayOfByte, int paramInt)
  {
    long l1 = c(paramArrayOfByte, paramInt);
    long l2 = c(paramArrayOfByte, paramInt + 4);
    if ((l1 == 0L) && (l2 == 0L)) {
      return 0L;
    }
    return l2 * 1000L / 4294967296L + (l1 - 2208988800L) * 1000L;
  }
  
  public static abstract interface a {}
  
  public static final class b
    implements d0.a<d0.d>
  {
    public final x.a a;
    
    public b(DashMediaSource.a parama)
    {
      a = parama;
    }
    
    public final void k(d0.d paramd, long paramLong1, long paramLong2, boolean paramBoolean) {}
    
    public final void p(d0.d arg1, long paramLong1, long paramLong2)
    {
      if (a != null) {
        synchronized (x.b)
        {
          boolean bool = x.c;
          Object localObject1;
          if (!bool)
          {
            localObject1 = a;
            ??? = new IOException(new ConcurrentModificationException());
            localObject1 = a;
            localObject1.getClass();
            m.d("DashMediaSource", "Failed to resolve time offset.", ???);
            ((DashMediaSource)localObject1).A(true);
          }
          else
          {
            localObject1 = a).a;
            try
            {
              if (x.c) {
                paramLong1 = x.d;
              } else {
                paramLong1 = -9223372036854775807L;
              }
              T = paramLong1;
              ((DashMediaSource)localObject1).A(true);
            }
            finally {}
          }
        }
      }
    }
    
    public final d0.b u(d0.d paramd, long paramLong1, long paramLong2, IOException paramIOException, int paramInt)
    {
      paramd = a;
      if (paramd != null)
      {
        paramd = a;
        paramd.getClass();
        m.d("DashMediaSource", "Failed to resolve time offset.", paramIOException);
        paramd.A(true);
      }
      return d0.e;
    }
  }
  
  public static final class c
    implements d0.d
  {
    public final void a()
    {
      Object localObject2;
      synchronized (x.a)
      {
        localObject2 = x.b;
        for (;;)
        {
          try
          {
            if (x.c) {
              return;
            }
            l = x.a();
          }
          finally
          {
            long l;
            Object localObject4;
            continue;
          }
          try
          {
            x.d = l;
            x.c = true;
            return;
          }
          finally {}
        }
        throw ((Throwable)localObject4);
      }
    }
    
    public final void b() {}
  }
}

/* Location:
 * Qualified Name:     v5.x
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */