package okhttp3.internal.publicsuffix;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.internal.Util;

public final class PublicSuffixDatabase
{
  public static final byte[] e = { 42 };
  public static final String[] f = new String[0];
  public static final String[] g = { "*" };
  public static final PublicSuffixDatabase h = new PublicSuffixDatabase();
  public final AtomicBoolean a = new AtomicBoolean(false);
  public final CountDownLatch b = new CountDownLatch(1);
  public byte[] c;
  public byte[] d;
  
  public static String a(byte[] paramArrayOfByte, byte[][] paramArrayOfByte1, int paramInt)
  {
    int i = paramArrayOfByte.length;
    int j = 0;
    if (j < i)
    {
      for (int k = (j + i) / 2; (k > -1) && (paramArrayOfByte[k] != 10); k--) {}
      int m = k + 1;
      int n;
      for (k = 1;; k++)
      {
        n = m + k;
        if (paramArrayOfByte[n] == 10) {
          break;
        }
      }
      int i1 = n - m;
      int i2 = paramInt;
      int i3 = 0;
      k = i3;
      int i4 = k;
      label262:
      label290:
      label302:
      for (;;)
      {
        int i5;
        if (i3 != 0)
        {
          i5 = 46;
          i3 = 0;
        }
        else
        {
          i5 = paramArrayOfByte1[i2][k];
          i5 &= 0xFF;
        }
        i5 -= (paramArrayOfByte[(m + i4)] & 0xFF);
        if (i5 == 0)
        {
          i4++;
          k++;
          if (i4 != i1)
          {
            if (paramArrayOfByte1[i2].length != k) {
              break label302;
            }
            if (i2 != paramArrayOfByte1.length - 1) {
              break label290;
            }
          }
        }
        if (i5 >= 0)
        {
          if (i5 > 0) {
            break label262;
          }
          i3 = i1 - i4;
          k = paramArrayOfByte1[i2].length - k;
          for (;;)
          {
            i2++;
            if (i2 >= paramArrayOfByte1.length) {
              break;
            }
            k += paramArrayOfByte1[i2].length;
          }
          if (k >= i3) {}
        }
        else
        {
          i = m - 1;
          break;
        }
        if (k > i3)
        {
          j = n + 1;
          break;
        }
        return new String(paramArrayOfByte, m, i1, Util.i);
        i2++;
        k = -1;
        i3 = 1;
      }
    }
    paramArrayOfByte = null;
    return paramArrayOfByte;
  }
  
  /* Error */
  public final void b()
  {
    // Byte code:
    //   0: ldc 2
    //   2: ldc 62
    //   4: invokevirtual 68	java/lang/Class:getResourceAsStream	(Ljava/lang/String;)Ljava/io/InputStream;
    //   7: astore_1
    //   8: aload_1
    //   9: ifnonnull +4 -> 13
    //   12: return
    //   13: getstatic 73	xc/p:a	Ljava/util/logging/Logger;
    //   16: astore_2
    //   17: new 75	xc/s
    //   20: dup
    //   21: new 77	xc/m
    //   24: dup
    //   25: new 79	xc/o
    //   28: dup
    //   29: aload_1
    //   30: new 81	xc/z
    //   33: dup
    //   34: invokespecial 82	xc/z:<init>	()V
    //   37: invokespecial 85	xc/o:<init>	(Ljava/io/InputStream;Lxc/z;)V
    //   40: invokespecial 88	xc/m:<init>	(Lxc/y;)V
    //   43: invokespecial 89	xc/s:<init>	(Lxc/y;)V
    //   46: astore_1
    //   47: aload_1
    //   48: invokevirtual 93	xc/s:readInt	()I
    //   51: newarray <illegal type>
    //   53: astore_3
    //   54: aload_1
    //   55: aload_3
    //   56: invokevirtual 96	xc/s:g	([B)V
    //   59: aload_1
    //   60: invokevirtual 93	xc/s:readInt	()I
    //   63: newarray <illegal type>
    //   65: astore_2
    //   66: aload_1
    //   67: aload_2
    //   68: invokevirtual 96	xc/s:g	([B)V
    //   71: aload_1
    //   72: invokestatic 99	okhttp3/internal/Util:e	(Ljava/io/Closeable;)V
    //   75: aload_0
    //   76: monitorenter
    //   77: aload_0
    //   78: aload_3
    //   79: putfield 101	okhttp3/internal/publicsuffix/PublicSuffixDatabase:c	[B
    //   82: aload_0
    //   83: aload_2
    //   84: putfield 103	okhttp3/internal/publicsuffix/PublicSuffixDatabase:d	[B
    //   87: aload_0
    //   88: monitorexit
    //   89: aload_0
    //   90: getfield 50	okhttp3/internal/publicsuffix/PublicSuffixDatabase:b	Ljava/util/concurrent/CountDownLatch;
    //   93: invokevirtual 106	java/util/concurrent/CountDownLatch:countDown	()V
    //   96: return
    //   97: astore_1
    //   98: aload_0
    //   99: monitorexit
    //   100: aload_1
    //   101: athrow
    //   102: astore_2
    //   103: aload_1
    //   104: invokestatic 99	okhttp3/internal/Util:e	(Ljava/io/Closeable;)V
    //   107: aload_2
    //   108: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	109	0	this	PublicSuffixDatabase
    //   7	65	1	localObject1	Object
    //   97	7	1	localCloseable	java.io.Closeable
    //   16	68	2	localObject2	Object
    //   102	6	2	localObject3	Object
    //   53	26	3	arrayOfByte	byte[]
    // Exception table:
    //   from	to	target	type
    //   77	89	97	finally
    //   98	100	97	finally
    //   47	71	102	finally
  }
}

/* Location:
 * Qualified Name:     okhttp3.internal.publicsuffix.PublicSuffixDatabase
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */