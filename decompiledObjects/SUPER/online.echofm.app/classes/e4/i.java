package e4;

import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;
import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;

public class i
{
  public BlockingQueue a;
  public final Random b = new Random();
  public volatile boolean c = false;
  public boolean d = false;
  public c e;
  public WritableByteChannel f;
  public final Thread g = c.j().newThread(new a());
  
  public i(c paramc, String paramString, int paramInt)
  {
    b localb = c.i();
    Thread localThread = d();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramString);
    localStringBuilder.append("Writer-");
    localStringBuilder.append(paramInt);
    localb.a(localThread, localStringBuilder.toString());
    e = paramc;
    a = new LinkedBlockingQueue();
  }
  
  public final ByteBuffer b(byte paramByte, boolean paramBoolean, byte[] paramArrayOfByte)
  {
    if (paramBoolean) {
      b1 = 6;
    } else {
      b1 = 2;
    }
    byte b2 = paramArrayOfByte.length;
    byte b3 = 126;
    if (b2 >= 126) {
      if (b2 <= 65535) {
        b1 += 2;
      } else {
        b1 += 8;
      }
    }
    ByteBuffer localByteBuffer = ByteBuffer.allocate(paramArrayOfByte.length + b1);
    localByteBuffer.put((byte)(paramByte | 0xFFFFFF80));
    byte b1 = 0;
    if (b2 < 126)
    {
      paramByte = b2;
      if (paramBoolean) {
        paramByte = b2 | 0x80;
      }
      localByteBuffer.put((byte)paramByte);
    }
    else if (b2 <= 65535)
    {
      paramByte = b3;
      if (paramBoolean) {
        paramByte = 254;
      }
      localByteBuffer.put((byte)paramByte);
      localByteBuffer.putShort((short)b2);
    }
    else
    {
      if (paramBoolean) {
        paramByte = 255;
      } else {
        paramByte = Byte.MAX_VALUE;
      }
      localByteBuffer.put((byte)paramByte);
      localByteBuffer.putInt(0);
      localByteBuffer.putInt(b2);
    }
    if (paramBoolean)
    {
      byte[] arrayOfByte = c();
      localByteBuffer.put(arrayOfByte);
      for (paramByte = b1; paramByte < paramArrayOfByte.length; paramByte++) {
        localByteBuffer.put((byte)(paramArrayOfByte[paramByte] ^ arrayOfByte[(paramByte % 4)]));
      }
    }
    localByteBuffer.flip();
    return localByteBuffer;
  }
  
  public final byte[] c()
  {
    byte[] arrayOfByte = new byte[4];
    b.nextBytes(arrayOfByte);
    return arrayOfByte;
  }
  
  public Thread d()
  {
    return g;
  }
  
  public final void e(e parame)
  {
    e.k(parame);
  }
  
  /* Error */
  public final void f()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 31	e4/i:c	Z
    //   4: ifne +20 -> 24
    //   7: invokestatic 135	java/lang/Thread:interrupted	()Z
    //   10: ifne +14 -> 24
    //   13: aload_0
    //   14: invokevirtual 137	e4/i:j	()V
    //   17: goto -17 -> 0
    //   20: astore_1
    //   21: goto +28 -> 49
    //   24: iconst_0
    //   25: istore_2
    //   26: iload_2
    //   27: aload_0
    //   28: getfield 85	e4/i:a	Ljava/util/concurrent/BlockingQueue;
    //   31: invokeinterface 143 1 0
    //   36: if_icmpge +27 -> 63
    //   39: aload_0
    //   40: invokevirtual 137	e4/i:j	()V
    //   43: iinc 2 1
    //   46: goto -20 -> 26
    //   49: aload_0
    //   50: new 145	e4/e
    //   53: dup
    //   54: ldc -109
    //   56: aload_1
    //   57: invokespecial 150	e4/e:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   60: invokevirtual 152	e4/i:e	(Le4/e;)V
    //   63: return
    //   64: astore_1
    //   65: goto -2 -> 63
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	68	0	this	i
    //   20	37	1	localIOException	java.io.IOException
    //   64	1	1	localInterruptedException	InterruptedException
    //   25	19	2	i	int
    // Exception table:
    //   from	to	target	type
    //   0	17	20	java/io/IOException
    //   26	43	20	java/io/IOException
    //   0	17	64	java/lang/InterruptedException
    //   26	43	64	java/lang/InterruptedException
  }
  
  public void g(byte paramByte, boolean paramBoolean, byte[] paramArrayOfByte)
  {
    label74:
    try
    {
      paramArrayOfByte = b(paramByte, paramBoolean, paramArrayOfByte);
      if ((c) && ((d) || (paramByte != 8)))
      {
        paramArrayOfByte = new e4/e;
        paramArrayOfByte.<init>("Shouldn't be sending");
        throw paramArrayOfByte;
      }
    }
    finally
    {
      break label74;
      if (paramByte == 8) {
        d = true;
      }
      a.add(paramArrayOfByte);
      return;
    }
  }
  
  public void h(OutputStream paramOutputStream)
  {
    f = Channels.newChannel(paramOutputStream);
  }
  
  public void i()
  {
    c = true;
  }
  
  public final void j()
  {
    ByteBuffer localByteBuffer = (ByteBuffer)a.take();
    f.write(localByteBuffer);
  }
  
  public class a
    implements Runnable
  {
    public a() {}
    
    public void run()
    {
      i.a(i.this);
    }
  }
}

/* Location:
 * Qualified Name:     e4.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */