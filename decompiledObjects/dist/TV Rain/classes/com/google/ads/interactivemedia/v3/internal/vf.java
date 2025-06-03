package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;

public final class vf
  extends to
{
  private final int a = 8000;
  private final byte[] b;
  private final DatagramPacket c;
  private Uri d;
  private DatagramSocket e;
  private MulticastSocket f;
  private InetAddress g;
  private InetSocketAddress h;
  private boolean i;
  private int j;
  
  public vf()
  {
    this(2000);
  }
  
  private vf(int paramInt)
  {
    this(2000, 8000);
  }
  
  private vf(int paramInt1, int paramInt2)
  {
    super(true);
    byte[] arrayOfByte = new byte[paramInt1];
    b = arrayOfByte;
    c = new DatagramPacket(arrayOfByte, 0, paramInt1);
  }
  
  public final int a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws ve
  {
    if (paramInt2 == 0) {
      return 0;
    }
    if (j == 0) {
      try
      {
        e.receive(c);
        k = c.getLength();
        j = k;
        a(k);
      }
      catch (IOException paramArrayOfByte)
      {
        throw new ve(paramArrayOfByte);
      }
    }
    int m = c.getLength();
    int k = j;
    paramInt2 = Math.min(k, paramInt2);
    System.arraycopy(b, m - k, paramArrayOfByte, paramInt1, paramInt2);
    j -= paramInt2;
    return paramInt2;
  }
  
  /* Error */
  public final long a(tx paramtx)
    throws ve
  {
    // Byte code:
    //   0: aload_1
    //   1: getfield 90	com/google/ads/interactivemedia/v3/internal/tx:a	Landroid/net/Uri;
    //   4: astore_2
    //   5: aload_0
    //   6: aload_2
    //   7: putfield 92	com/google/ads/interactivemedia/v3/internal/vf:d	Landroid/net/Uri;
    //   10: aload_2
    //   11: invokevirtual 98	android/net/Uri:getHost	()Ljava/lang/String;
    //   14: astore_2
    //   15: aload_0
    //   16: getfield 92	com/google/ads/interactivemedia/v3/internal/vf:d	Landroid/net/Uri;
    //   19: invokevirtual 101	android/net/Uri:getPort	()I
    //   22: istore_3
    //   23: aload_0
    //   24: aload_1
    //   25: invokevirtual 104	com/google/ads/interactivemedia/v3/internal/to:b	(Lcom/google/ads/interactivemedia/v3/internal/tx;)V
    //   28: aload_0
    //   29: aload_2
    //   30: invokestatic 110	java/net/InetAddress:getByName	(Ljava/lang/String;)Ljava/net/InetAddress;
    //   33: putfield 112	com/google/ads/interactivemedia/v3/internal/vf:g	Ljava/net/InetAddress;
    //   36: new 114	java/net/InetSocketAddress
    //   39: astore_2
    //   40: aload_2
    //   41: aload_0
    //   42: getfield 112	com/google/ads/interactivemedia/v3/internal/vf:g	Ljava/net/InetAddress;
    //   45: iload_3
    //   46: invokespecial 117	java/net/InetSocketAddress:<init>	(Ljava/net/InetAddress;I)V
    //   49: aload_0
    //   50: aload_2
    //   51: putfield 119	com/google/ads/interactivemedia/v3/internal/vf:h	Ljava/net/InetSocketAddress;
    //   54: aload_0
    //   55: getfield 112	com/google/ads/interactivemedia/v3/internal/vf:g	Ljava/net/InetAddress;
    //   58: invokevirtual 123	java/net/InetAddress:isMulticastAddress	()Z
    //   61: ifeq +39 -> 100
    //   64: new 125	java/net/MulticastSocket
    //   67: astore_2
    //   68: aload_2
    //   69: aload_0
    //   70: getfield 119	com/google/ads/interactivemedia/v3/internal/vf:h	Ljava/net/InetSocketAddress;
    //   73: invokespecial 128	java/net/MulticastSocket:<init>	(Ljava/net/SocketAddress;)V
    //   76: aload_0
    //   77: aload_2
    //   78: putfield 130	com/google/ads/interactivemedia/v3/internal/vf:f	Ljava/net/MulticastSocket;
    //   81: aload_2
    //   82: aload_0
    //   83: getfield 112	com/google/ads/interactivemedia/v3/internal/vf:g	Ljava/net/InetAddress;
    //   86: invokevirtual 134	java/net/MulticastSocket:joinGroup	(Ljava/net/InetAddress;)V
    //   89: aload_0
    //   90: aload_0
    //   91: getfield 130	com/google/ads/interactivemedia/v3/internal/vf:f	Ljava/net/MulticastSocket;
    //   94: putfield 55	com/google/ads/interactivemedia/v3/internal/vf:e	Ljava/net/DatagramSocket;
    //   97: goto +20 -> 117
    //   100: new 57	java/net/DatagramSocket
    //   103: astore_2
    //   104: aload_2
    //   105: aload_0
    //   106: getfield 119	com/google/ads/interactivemedia/v3/internal/vf:h	Ljava/net/InetSocketAddress;
    //   109: invokespecial 135	java/net/DatagramSocket:<init>	(Ljava/net/SocketAddress;)V
    //   112: aload_0
    //   113: aload_2
    //   114: putfield 55	com/google/ads/interactivemedia/v3/internal/vf:e	Ljava/net/DatagramSocket;
    //   117: aload_0
    //   118: getfield 55	com/google/ads/interactivemedia/v3/internal/vf:e	Ljava/net/DatagramSocket;
    //   121: aload_0
    //   122: getfield 37	com/google/ads/interactivemedia/v3/internal/vf:a	I
    //   125: invokevirtual 138	java/net/DatagramSocket:setSoTimeout	(I)V
    //   128: aload_0
    //   129: iconst_1
    //   130: putfield 140	com/google/ads/interactivemedia/v3/internal/vf:i	Z
    //   133: aload_0
    //   134: aload_1
    //   135: invokevirtual 142	com/google/ads/interactivemedia/v3/internal/to:c	(Lcom/google/ads/interactivemedia/v3/internal/tx;)V
    //   138: ldc2_w 143
    //   141: lreturn
    //   142: astore_1
    //   143: new 49	com/google/ads/interactivemedia/v3/internal/ve
    //   146: dup
    //   147: aload_1
    //   148: invokespecial 70	com/google/ads/interactivemedia/v3/internal/ve:<init>	(Ljava/io/IOException;)V
    //   151: athrow
    //   152: astore_1
    //   153: new 49	com/google/ads/interactivemedia/v3/internal/ve
    //   156: dup
    //   157: aload_1
    //   158: invokespecial 70	com/google/ads/interactivemedia/v3/internal/ve:<init>	(Ljava/io/IOException;)V
    //   161: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	162	0	this	vf
    //   0	162	1	paramtx	tx
    //   4	110	2	localObject	Object
    //   22	24	3	k	int
    // Exception table:
    //   from	to	target	type
    //   117	128	142	java/net/SocketException
    //   28	97	152	java/io/IOException
    //   100	117	152	java/io/IOException
  }
  
  public final Uri a()
  {
    return d;
  }
  
  public final void c()
  {
    d = null;
    Object localObject = f;
    if (localObject != null) {}
    try
    {
      ((MulticastSocket)localObject).leaveGroup(g);
      f = null;
      localObject = e;
      if (localObject != null)
      {
        ((DatagramSocket)localObject).close();
        e = null;
      }
      g = null;
      h = null;
      j = 0;
      if (i)
      {
        i = false;
        d();
      }
      return;
    }
    catch (IOException localIOException)
    {
      for (;;) {}
    }
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.vf
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */