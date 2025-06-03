package C0;

import B0.n;
import B0.n.b;
import B0.n.c;
import B0.n.e;
import java.io.IOException;
import java.util.Arrays;
import java.util.ConcurrentModificationException;

public abstract class a
{
  public static final Object a = new Object();
  public static final Object b = new Object();
  public static boolean c = false;
  public static long d = 0L;
  public static String e = "time.android.com";
  
  public static void g(byte paramByte1, byte paramByte2, int paramInt, long paramLong)
  {
    if (paramByte1 != 3)
    {
      if ((paramByte2 != 4) && (paramByte2 != 5))
      {
        localStringBuilder = new StringBuilder();
        localStringBuilder.append("SNTP: Untrusted mode: ");
        localStringBuilder.append(paramByte2);
        throw new IOException(localStringBuilder.toString());
      }
      if ((paramInt != 0) && (paramInt <= 15))
      {
        if (paramLong != 0L) {
          return;
        }
        throw new IOException("SNTP: Zero transmitTime");
      }
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("SNTP: Untrusted stratum: ");
      localStringBuilder.append(paramInt);
      throw new IOException(localStringBuilder.toString());
    }
    throw new IOException("SNTP: Unsynchronized server");
  }
  
  public static long h()
  {
    synchronized (b)
    {
      if (c) {
        l = d;
      }
    }
    long l = -9223372036854775807L;
    return l;
    throw ((Throwable)localObject2);
  }
  
  public static String i()
  {
    synchronized (b)
    {
      String str = e;
      return str;
    }
  }
  
  public static void j(n paramn, b paramb)
  {
    if (k())
    {
      if (paramb != null) {
        paramb.a();
      }
      return;
    }
    n localn = paramn;
    if (paramn == null) {
      localn = new n("SntpClient");
    }
    localn.n(new d(null), new c(paramb), 1);
  }
  
  public static boolean k()
  {
    synchronized (b)
    {
      boolean bool = c;
      return bool;
    }
  }
  
  /* Error */
  public static long l()
  {
    // Byte code:
    //   0: invokestatic 108	C0/a:i	()Ljava/lang/String;
    //   3: invokestatic 114	java/net/InetAddress:getByName	(Ljava/lang/String;)Ljava/net/InetAddress;
    //   6: astore_0
    //   7: new 116	java/net/DatagramSocket
    //   10: dup
    //   11: invokespecial 117	java/net/DatagramSocket:<init>	()V
    //   14: astore_1
    //   15: aload_1
    //   16: sipush 10000
    //   19: invokevirtual 121	java/net/DatagramSocket:setSoTimeout	(I)V
    //   22: bipush 48
    //   24: newarray <illegal type>
    //   26: astore_2
    //   27: new 123	java/net/DatagramPacket
    //   30: astore_3
    //   31: aload_3
    //   32: aload_2
    //   33: bipush 48
    //   35: aload_0
    //   36: bipush 123
    //   38: invokespecial 126	java/net/DatagramPacket:<init>	([BILjava/net/InetAddress;I)V
    //   41: aload_2
    //   42: iconst_0
    //   43: bipush 27
    //   45: i2b
    //   46: bastore
    //   47: invokestatic 131	java/lang/System:currentTimeMillis	()J
    //   50: lstore 4
    //   52: invokestatic 136	android/os/SystemClock:elapsedRealtime	()J
    //   55: lstore 6
    //   57: aload_2
    //   58: bipush 40
    //   60: lload 4
    //   62: invokestatic 140	C0/a:o	([BIJ)V
    //   65: aload_1
    //   66: aload_3
    //   67: invokevirtual 144	java/net/DatagramSocket:send	(Ljava/net/DatagramPacket;)V
    //   70: new 123	java/net/DatagramPacket
    //   73: astore_3
    //   74: aload_3
    //   75: aload_2
    //   76: bipush 48
    //   78: invokespecial 147	java/net/DatagramPacket:<init>	([BI)V
    //   81: aload_1
    //   82: aload_3
    //   83: invokevirtual 150	java/net/DatagramSocket:receive	(Ljava/net/DatagramPacket;)V
    //   86: invokestatic 136	android/os/SystemClock:elapsedRealtime	()J
    //   89: lstore 8
    //   91: lload 4
    //   93: lload 8
    //   95: lload 6
    //   97: lsub
    //   98: ladd
    //   99: lstore 4
    //   101: aload_2
    //   102: iconst_0
    //   103: baload
    //   104: istore 10
    //   106: iload 10
    //   108: bipush 6
    //   110: ishr
    //   111: iconst_3
    //   112: iand
    //   113: i2b
    //   114: istore 11
    //   116: iload 10
    //   118: bipush 7
    //   120: iand
    //   121: i2b
    //   122: istore 12
    //   124: aload_2
    //   125: iconst_1
    //   126: baload
    //   127: istore 10
    //   129: aload_2
    //   130: bipush 24
    //   132: invokestatic 153	C0/a:n	([BI)J
    //   135: lstore 13
    //   137: aload_2
    //   138: bipush 32
    //   140: invokestatic 153	C0/a:n	([BI)J
    //   143: lstore 15
    //   145: aload_2
    //   146: bipush 40
    //   148: invokestatic 153	C0/a:n	([BI)J
    //   151: lstore 6
    //   153: iload 11
    //   155: iload 12
    //   157: iload 10
    //   159: sipush 255
    //   162: iand
    //   163: lload 6
    //   165: invokestatic 155	C0/a:g	(BBIJ)V
    //   168: lload 15
    //   170: lload 13
    //   172: lsub
    //   173: lload 6
    //   175: lload 4
    //   177: lsub
    //   178: ladd
    //   179: ldc2_w 156
    //   182: ldiv
    //   183: lstore 6
    //   185: aload_1
    //   186: invokevirtual 160	java/net/DatagramSocket:close	()V
    //   189: lload 4
    //   191: lload 6
    //   193: ladd
    //   194: lload 8
    //   196: lsub
    //   197: lreturn
    //   198: astore_2
    //   199: aload_1
    //   200: invokevirtual 160	java/net/DatagramSocket:close	()V
    //   203: goto +9 -> 212
    //   206: astore_1
    //   207: aload_2
    //   208: aload_1
    //   209: invokevirtual 166	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   212: aload_2
    //   213: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   6	30	0	localInetAddress	java.net.InetAddress
    //   14	186	1	localDatagramSocket	java.net.DatagramSocket
    //   206	3	1	localThrowable	Throwable
    //   26	120	2	arrayOfByte	byte[]
    //   198	15	2	localObject	Object
    //   30	53	3	localDatagramPacket	java.net.DatagramPacket
    //   50	140	4	l1	long
    //   55	137	6	l2	long
    //   89	106	8	l3	long
    //   104	59	10	i	int
    //   114	40	11	b1	byte
    //   122	34	12	b2	byte
    //   135	36	13	l4	long
    //   143	26	15	l5	long
    // Exception table:
    //   from	to	target	type
    //   15	41	198	finally
    //   47	91	198	finally
    //   129	185	198	finally
    //   199	203	206	finally
  }
  
  public static long m(byte[] paramArrayOfByte, int paramInt)
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
  
  public static long n(byte[] paramArrayOfByte, int paramInt)
  {
    long l1 = m(paramArrayOfByte, paramInt);
    long l2 = m(paramArrayOfByte, paramInt + 4);
    if ((l1 == 0L) && (l2 == 0L)) {
      return 0L;
    }
    return (l1 - 2208988800L) * 1000L + l2 * 1000L / 4294967296L;
  }
  
  public static void o(byte[] paramArrayOfByte, int paramInt, long paramLong)
  {
    if (paramLong == 0L)
    {
      Arrays.fill(paramArrayOfByte, paramInt, paramInt + 8, (byte)0);
      return;
    }
    long l1 = paramLong / 1000L;
    long l2 = l1 + 2208988800L;
    paramArrayOfByte[paramInt] = ((byte)(byte)(int)(l2 >> 24));
    paramArrayOfByte[(paramInt + 1)] = ((byte)(byte)(int)(l2 >> 16));
    paramArrayOfByte[(paramInt + 2)] = ((byte)(byte)(int)(l2 >> 8));
    paramArrayOfByte[(paramInt + 3)] = ((byte)(byte)(int)l2);
    paramLong = (paramLong - l1 * 1000L) * 4294967296L / 1000L;
    paramArrayOfByte[(paramInt + 4)] = ((byte)(byte)(int)(paramLong >> 24));
    paramArrayOfByte[(paramInt + 5)] = ((byte)(byte)(int)(paramLong >> 16));
    paramArrayOfByte[(paramInt + 6)] = ((byte)(byte)(int)(paramLong >> 8));
    paramArrayOfByte[(paramInt + 7)] = ((byte)(byte)(int)(Math.random() * 255.0D));
  }
  
  public static abstract interface b
  {
    public abstract void a();
    
    public abstract void b(IOException paramIOException);
  }
  
  public static final class c
    implements n.b
  {
    public final a.b o;
    
    public c(a.b paramb)
    {
      o = paramb;
    }
    
    public void o(n.e parame, long paramLong1, long paramLong2)
    {
      if (o != null) {
        if (!a.k()) {
          o.b(new IOException(new ConcurrentModificationException()));
        } else {
          o.a();
        }
      }
    }
    
    public n.c r(n.e parame, long paramLong1, long paramLong2, IOException paramIOException, int paramInt)
    {
      parame = o;
      if (parame != null) {
        parame.b(paramIOException);
      }
      return n.f;
    }
    
    public void t(n.e parame, long paramLong1, long paramLong2, boolean paramBoolean) {}
  }
  
  public static final class d
    implements n.e
  {
    /* Error */
    public void b()
    {
      // Byte code:
      //   0: invokestatic 21	C0/a:a	()Ljava/lang/Object;
      //   3: astore_1
      //   4: aload_1
      //   5: monitorenter
      //   6: invokestatic 23	C0/a:b	()Ljava/lang/Object;
      //   9: astore_2
      //   10: aload_2
      //   11: monitorenter
      //   12: invokestatic 27	C0/a:c	()Z
      //   15: ifeq +16 -> 31
      //   18: aload_2
      //   19: monitorexit
      //   20: aload_1
      //   21: monitorexit
      //   22: return
      //   23: astore_2
      //   24: goto +45 -> 69
      //   27: astore_3
      //   28: goto +37 -> 65
      //   31: aload_2
      //   32: monitorexit
      //   33: invokestatic 31	C0/a:e	()J
      //   36: lstore 4
      //   38: invokestatic 23	C0/a:b	()Ljava/lang/Object;
      //   41: astore_2
      //   42: aload_2
      //   43: monitorenter
      //   44: lload 4
      //   46: invokestatic 35	C0/a:f	(J)J
      //   49: pop2
      //   50: iconst_1
      //   51: invokestatic 38	C0/a:d	(Z)Z
      //   54: pop
      //   55: aload_2
      //   56: monitorexit
      //   57: aload_1
      //   58: monitorexit
      //   59: return
      //   60: astore_3
      //   61: aload_2
      //   62: monitorexit
      //   63: aload_3
      //   64: athrow
      //   65: aload_2
      //   66: monitorexit
      //   67: aload_3
      //   68: athrow
      //   69: aload_1
      //   70: monitorexit
      //   71: aload_2
      //   72: athrow
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	73	0	this	d
      //   3	67	1	localObject1	Object
      //   23	9	2	localObject3	Object
      //   27	1	3	localObject5	Object
      //   60	8	3	localObject6	Object
      //   36	9	4	l	long
      // Exception table:
      //   from	to	target	type
      //   6	12	23	finally
      //   20	22	23	finally
      //   33	44	23	finally
      //   57	59	23	finally
      //   63	65	23	finally
      //   67	69	23	finally
      //   69	71	23	finally
      //   12	20	27	finally
      //   31	33	27	finally
      //   65	67	27	finally
      //   44	57	60	finally
      //   61	63	60	finally
    }
    
    public void c() {}
  }
}

/* Location:
 * Qualified Name:     C0.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */