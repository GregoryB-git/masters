package i0;

import android.net.Uri;
import g0.a;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketAddress;
import java.net.SocketTimeoutException;

public final class z
  extends b
{
  public final int e;
  public final byte[] f;
  public final DatagramPacket g;
  public Uri h;
  public DatagramSocket i;
  public MulticastSocket j;
  public InetAddress k;
  public boolean l;
  public int m;
  
  public z()
  {
    this(2000);
  }
  
  public z(int paramInt)
  {
    this(paramInt, 8000);
  }
  
  public z(int paramInt1, int paramInt2)
  {
    super(true);
    e = paramInt2;
    byte[] arrayOfByte = new byte[paramInt1];
    f = arrayOfByte;
    g = new DatagramPacket(arrayOfByte, 0, paramInt1);
  }
  
  public void close()
  {
    h = null;
    Object localObject = j;
    if (localObject != null) {}
    try
    {
      ((MulticastSocket)localObject).leaveGroup((InetAddress)a.e(k));
      j = null;
      localObject = i;
      if (localObject != null)
      {
        ((DatagramSocket)localObject).close();
        i = null;
      }
      k = null;
      m = 0;
      if (l)
      {
        l = false;
        r();
      }
      return;
    }
    catch (IOException localIOException)
    {
      for (;;) {}
    }
  }
  
  public long e(k paramk)
  {
    Object localObject1 = a;
    h = ((Uri)localObject1);
    localObject1 = (String)a.e(((Uri)localObject1).getHost());
    int n = h.getPort();
    s(paramk);
    try
    {
      k = InetAddress.getByName((String)localObject1);
      localObject1 = new java/net/InetSocketAddress;
      ((InetSocketAddress)localObject1).<init>(k, n);
      if (k.isMulticastAddress())
      {
        localObject2 = new java/net/MulticastSocket;
        ((MulticastSocket)localObject2).<init>((SocketAddress)localObject1);
        j = ((MulticastSocket)localObject2);
        ((MulticastSocket)localObject2).joinGroup(k);
        i = j;
      }
    }
    catch (IOException paramk)
    {
      break label152;
    }
    catch (SecurityException paramk)
    {
      break label164;
    }
    Object localObject2 = new java/net/DatagramSocket;
    ((DatagramSocket)localObject2).<init>((SocketAddress)localObject1);
    i = ((DatagramSocket)localObject2);
    i.setSoTimeout(e);
    l = true;
    t(paramk);
    return -1L;
    label152:
    throw new a(paramk, 2001);
    label164:
    throw new a(paramk, 2006);
  }
  
  public Uri k()
  {
    return h;
  }
  
  public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (paramInt2 == 0) {
      return 0;
    }
    if (m == 0)
    {
      try
      {
        ((DatagramSocket)a.e(i)).receive(g);
        n = g.getLength();
        m = n;
        q(n);
      }
      catch (IOException paramArrayOfByte) {}catch (SocketTimeoutException paramArrayOfByte)
      {
        break label74;
      }
      throw new a(paramArrayOfByte, 2001);
      label74:
      throw new a(paramArrayOfByte, 2002);
    }
    int i1 = g.getLength();
    int n = m;
    paramInt2 = Math.min(n, paramInt2);
    System.arraycopy(f, i1 - n, paramArrayOfByte, paramInt1, paramInt2);
    m -= paramInt2;
    return paramInt2;
  }
  
  public static final class a
    extends h
  {
    public a(Throwable paramThrowable, int paramInt)
    {
      super(paramInt);
    }
  }
}

/* Location:
 * Qualified Name:     i0.z
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */