package t5;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketAddress;
import java.net.SocketTimeoutException;

public final class m0
  extends f
{
  public final int e = 8000;
  public final byte[] f;
  public final DatagramPacket g;
  public Uri h;
  public DatagramSocket i;
  public MulticastSocket j;
  public InetAddress k;
  public boolean l;
  public int m;
  
  public m0()
  {
    super(true);
    byte[] arrayOfByte = new byte['ߐ'];
    f = arrayOfByte;
    g = new DatagramPacket(arrayOfByte, 0, 2000);
  }
  
  public final long a(n paramn)
  {
    Object localObject1 = a;
    h = ((Uri)localObject1);
    localObject1 = ((Uri)localObject1).getHost();
    localObject1.getClass();
    int n = h.getPort();
    q(paramn);
    try
    {
      k = InetAddress.getByName((String)localObject1);
      localObject1 = new java/net/InetSocketAddress;
      ((InetSocketAddress)localObject1).<init>(k, n);
      Object localObject2;
      if (k.isMulticastAddress())
      {
        localObject2 = new java/net/MulticastSocket;
        ((MulticastSocket)localObject2).<init>((SocketAddress)localObject1);
        j = ((MulticastSocket)localObject2);
        ((MulticastSocket)localObject2).joinGroup(k);
        i = j;
      }
      else
      {
        localObject2 = new java/net/DatagramSocket;
        ((DatagramSocket)localObject2).<init>((SocketAddress)localObject1);
        i = ((DatagramSocket)localObject2);
      }
      i.setSoTimeout(e);
      l = true;
      r(paramn);
      return -1L;
    }
    catch (IOException paramn)
    {
      throw new a(2001, paramn);
    }
    catch (SecurityException paramn)
    {
      throw new a(2006, paramn);
    }
  }
  
  public final void close()
  {
    h = null;
    MulticastSocket localMulticastSocket = j;
    if (localMulticastSocket != null) {}
    try
    {
      Object localObject = k;
      localObject.getClass();
      localMulticastSocket.leaveGroup((InetAddress)localObject);
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
        p();
      }
      return;
    }
    catch (IOException localIOException)
    {
      for (;;) {}
    }
  }
  
  public final Uri l()
  {
    return h;
  }
  
  public final int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (paramInt2 == 0) {
      return 0;
    }
    if (m == 0) {
      try
      {
        DatagramSocket localDatagramSocket = i;
        localDatagramSocket.getClass();
        localDatagramSocket.receive(g);
        n = g.getLength();
        m = n;
        o(n);
      }
      catch (IOException paramArrayOfByte)
      {
        throw new a(2001, paramArrayOfByte);
      }
      catch (SocketTimeoutException paramArrayOfByte)
      {
        throw new a(2002, paramArrayOfByte);
      }
    }
    int i1 = g.getLength();
    int n = m;
    paramInt2 = Math.min(n, paramInt2);
    System.arraycopy(f, i1 - n, paramArrayOfByte, paramInt1, paramInt2);
    m -= paramInt2;
    return paramInt2;
  }
  
  public static final class a
    extends l
  {
    public a(int paramInt, Exception paramException)
    {
      super(paramException);
    }
  }
}

/* Location:
 * Qualified Name:     t5.m0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */