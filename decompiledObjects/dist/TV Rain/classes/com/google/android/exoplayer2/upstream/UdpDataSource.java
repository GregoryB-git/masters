package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;

public final class UdpDataSource
  extends BaseDataSource
{
  public static final int DEFAULT_MAX_PACKET_SIZE = 2000;
  public static final int DEFAULT_SOCKET_TIMEOUT_MILLIS = 8000;
  @Nullable
  private InetAddress address;
  @Nullable
  private MulticastSocket multicastSocket;
  private boolean opened;
  private final DatagramPacket packet;
  private final byte[] packetBuffer;
  private int packetRemaining;
  @Nullable
  private DatagramSocket socket;
  @Nullable
  private InetSocketAddress socketAddress;
  private final int socketTimeoutMillis;
  @Nullable
  private Uri uri;
  
  public UdpDataSource()
  {
    this(2000);
  }
  
  public UdpDataSource(int paramInt)
  {
    this(paramInt, 8000);
  }
  
  public UdpDataSource(int paramInt1, int paramInt2)
  {
    super(true);
    socketTimeoutMillis = paramInt2;
    byte[] arrayOfByte = new byte[paramInt1];
    packetBuffer = arrayOfByte;
    packet = new DatagramPacket(arrayOfByte, 0, paramInt1);
  }
  
  @Deprecated
  public UdpDataSource(@Nullable TransferListener paramTransferListener)
  {
    this(paramTransferListener, 2000);
  }
  
  @Deprecated
  public UdpDataSource(@Nullable TransferListener paramTransferListener, int paramInt)
  {
    this(paramTransferListener, paramInt, 8000);
  }
  
  @Deprecated
  public UdpDataSource(@Nullable TransferListener paramTransferListener, int paramInt1, int paramInt2)
  {
    this(paramInt1, paramInt2);
    if (paramTransferListener != null) {
      addTransferListener(paramTransferListener);
    }
  }
  
  public void close()
  {
    uri = null;
    Object localObject = multicastSocket;
    if (localObject != null) {}
    try
    {
      ((MulticastSocket)localObject).leaveGroup(address);
      multicastSocket = null;
      localObject = socket;
      if (localObject != null)
      {
        ((DatagramSocket)localObject).close();
        socket = null;
      }
      address = null;
      socketAddress = null;
      packetRemaining = 0;
      if (opened)
      {
        opened = false;
        transferEnded();
      }
      return;
    }
    catch (IOException localIOException)
    {
      for (;;) {}
    }
  }
  
  @Nullable
  public Uri getUri()
  {
    return uri;
  }
  
  /* Error */
  public long open(DataSpec paramDataSpec)
    throws UdpDataSource.UdpDataSourceException
  {
    // Byte code:
    //   0: aload_1
    //   1: getfield 107	com/google/android/exoplayer2/upstream/DataSpec:uri	Landroid/net/Uri;
    //   4: astore_2
    //   5: aload_0
    //   6: aload_2
    //   7: putfield 72	com/google/android/exoplayer2/upstream/UdpDataSource:uri	Landroid/net/Uri;
    //   10: aload_2
    //   11: invokevirtual 113	android/net/Uri:getHost	()Ljava/lang/String;
    //   14: astore_2
    //   15: aload_0
    //   16: getfield 72	com/google/android/exoplayer2/upstream/UdpDataSource:uri	Landroid/net/Uri;
    //   19: invokevirtual 117	android/net/Uri:getPort	()I
    //   22: istore_3
    //   23: aload_0
    //   24: aload_1
    //   25: invokevirtual 121	com/google/android/exoplayer2/upstream/BaseDataSource:transferInitializing	(Lcom/google/android/exoplayer2/upstream/DataSpec;)V
    //   28: aload_0
    //   29: aload_2
    //   30: invokestatic 127	java/net/InetAddress:getByName	(Ljava/lang/String;)Ljava/net/InetAddress;
    //   33: putfield 76	com/google/android/exoplayer2/upstream/UdpDataSource:address	Ljava/net/InetAddress;
    //   36: new 129	java/net/InetSocketAddress
    //   39: astore_2
    //   40: aload_2
    //   41: aload_0
    //   42: getfield 76	com/google/android/exoplayer2/upstream/UdpDataSource:address	Ljava/net/InetAddress;
    //   45: iload_3
    //   46: invokespecial 132	java/net/InetSocketAddress:<init>	(Ljava/net/InetAddress;I)V
    //   49: aload_0
    //   50: aload_2
    //   51: putfield 90	com/google/android/exoplayer2/upstream/UdpDataSource:socketAddress	Ljava/net/InetSocketAddress;
    //   54: aload_0
    //   55: getfield 76	com/google/android/exoplayer2/upstream/UdpDataSource:address	Ljava/net/InetAddress;
    //   58: invokevirtual 136	java/net/InetAddress:isMulticastAddress	()Z
    //   61: ifeq +39 -> 100
    //   64: new 78	java/net/MulticastSocket
    //   67: astore_2
    //   68: aload_2
    //   69: aload_0
    //   70: getfield 90	com/google/android/exoplayer2/upstream/UdpDataSource:socketAddress	Ljava/net/InetSocketAddress;
    //   73: invokespecial 139	java/net/MulticastSocket:<init>	(Ljava/net/SocketAddress;)V
    //   76: aload_0
    //   77: aload_2
    //   78: putfield 74	com/google/android/exoplayer2/upstream/UdpDataSource:multicastSocket	Ljava/net/MulticastSocket;
    //   81: aload_2
    //   82: aload_0
    //   83: getfield 76	com/google/android/exoplayer2/upstream/UdpDataSource:address	Ljava/net/InetAddress;
    //   86: invokevirtual 142	java/net/MulticastSocket:joinGroup	(Ljava/net/InetAddress;)V
    //   89: aload_0
    //   90: aload_0
    //   91: getfield 74	com/google/android/exoplayer2/upstream/UdpDataSource:multicastSocket	Ljava/net/MulticastSocket;
    //   94: putfield 84	com/google/android/exoplayer2/upstream/UdpDataSource:socket	Ljava/net/DatagramSocket;
    //   97: goto +20 -> 117
    //   100: new 86	java/net/DatagramSocket
    //   103: astore_2
    //   104: aload_2
    //   105: aload_0
    //   106: getfield 90	com/google/android/exoplayer2/upstream/UdpDataSource:socketAddress	Ljava/net/InetSocketAddress;
    //   109: invokespecial 143	java/net/DatagramSocket:<init>	(Ljava/net/SocketAddress;)V
    //   112: aload_0
    //   113: aload_2
    //   114: putfield 84	com/google/android/exoplayer2/upstream/UdpDataSource:socket	Ljava/net/DatagramSocket;
    //   117: aload_0
    //   118: getfield 84	com/google/android/exoplayer2/upstream/UdpDataSource:socket	Ljava/net/DatagramSocket;
    //   121: aload_0
    //   122: getfield 45	com/google/android/exoplayer2/upstream/UdpDataSource:socketTimeoutMillis	I
    //   125: invokevirtual 146	java/net/DatagramSocket:setSoTimeout	(I)V
    //   128: aload_0
    //   129: iconst_1
    //   130: putfield 94	com/google/android/exoplayer2/upstream/UdpDataSource:opened	Z
    //   133: aload_0
    //   134: aload_1
    //   135: invokevirtual 149	com/google/android/exoplayer2/upstream/BaseDataSource:transferStarted	(Lcom/google/android/exoplayer2/upstream/DataSpec;)V
    //   138: ldc2_w 150
    //   141: lreturn
    //   142: astore_1
    //   143: new 6	com/google/android/exoplayer2/upstream/UdpDataSource$UdpDataSourceException
    //   146: dup
    //   147: aload_1
    //   148: invokespecial 154	com/google/android/exoplayer2/upstream/UdpDataSource$UdpDataSourceException:<init>	(Ljava/io/IOException;)V
    //   151: athrow
    //   152: astore_1
    //   153: new 6	com/google/android/exoplayer2/upstream/UdpDataSource$UdpDataSourceException
    //   156: dup
    //   157: aload_1
    //   158: invokespecial 154	com/google/android/exoplayer2/upstream/UdpDataSource$UdpDataSourceException:<init>	(Ljava/io/IOException;)V
    //   161: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	162	0	this	UdpDataSource
    //   0	162	1	paramDataSpec	DataSpec
    //   4	110	2	localObject	Object
    //   22	24	3	i	int
    // Exception table:
    //   from	to	target	type
    //   117	128	142	java/net/SocketException
    //   28	97	152	java/io/IOException
    //   100	117	152	java/io/IOException
  }
  
  public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws UdpDataSource.UdpDataSourceException
  {
    if (paramInt2 == 0) {
      return 0;
    }
    if (packetRemaining == 0) {
      try
      {
        socket.receive(packet);
        i = packet.getLength();
        packetRemaining = i;
        bytesTransferred(i);
      }
      catch (IOException paramArrayOfByte)
      {
        throw new UdpDataSourceException(paramArrayOfByte);
      }
    }
    int i = packet.getLength();
    int j = packetRemaining;
    paramInt2 = Math.min(j, paramInt2);
    System.arraycopy(packetBuffer, i - j, paramArrayOfByte, paramInt1, paramInt2);
    packetRemaining -= paramInt2;
    return paramInt2;
  }
  
  public static final class UdpDataSourceException
    extends IOException
  {
    public UdpDataSourceException(IOException paramIOException)
    {
      super();
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.upstream.UdpDataSource
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */