package androidx.core.net;

import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.SocketImpl;

class DatagramSocketWrapper
  extends Socket
{
  public DatagramSocketWrapper(DatagramSocket paramDatagramSocket, FileDescriptor paramFileDescriptor)
    throws SocketException
  {
    super(new DatagramSocketImplWrapper(paramDatagramSocket, paramFileDescriptor));
  }
  
  public static class DatagramSocketImplWrapper
    extends SocketImpl
  {
    public DatagramSocketImplWrapper(DatagramSocket paramDatagramSocket, FileDescriptor paramFileDescriptor)
    {
      localport = paramDatagramSocket.getLocalPort();
      fd = paramFileDescriptor;
    }
    
    public void accept(SocketImpl paramSocketImpl)
      throws IOException
    {
      throw new UnsupportedOperationException();
    }
    
    public int available()
      throws IOException
    {
      throw new UnsupportedOperationException();
    }
    
    public void bind(InetAddress paramInetAddress, int paramInt)
      throws IOException
    {
      throw new UnsupportedOperationException();
    }
    
    public void close()
      throws IOException
    {
      throw new UnsupportedOperationException();
    }
    
    public void connect(String paramString, int paramInt)
      throws IOException
    {
      throw new UnsupportedOperationException();
    }
    
    public void connect(InetAddress paramInetAddress, int paramInt)
      throws IOException
    {
      throw new UnsupportedOperationException();
    }
    
    public void connect(SocketAddress paramSocketAddress, int paramInt)
      throws IOException
    {
      throw new UnsupportedOperationException();
    }
    
    public void create(boolean paramBoolean)
      throws IOException
    {
      throw new UnsupportedOperationException();
    }
    
    public InputStream getInputStream()
      throws IOException
    {
      throw new UnsupportedOperationException();
    }
    
    public Object getOption(int paramInt)
      throws SocketException
    {
      throw new UnsupportedOperationException();
    }
    
    public OutputStream getOutputStream()
      throws IOException
    {
      throw new UnsupportedOperationException();
    }
    
    public void listen(int paramInt)
      throws IOException
    {
      throw new UnsupportedOperationException();
    }
    
    public void sendUrgentData(int paramInt)
      throws IOException
    {
      throw new UnsupportedOperationException();
    }
    
    public void setOption(int paramInt, Object paramObject)
      throws SocketException
    {
      throw new UnsupportedOperationException();
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.net.DatagramSocketWrapper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */