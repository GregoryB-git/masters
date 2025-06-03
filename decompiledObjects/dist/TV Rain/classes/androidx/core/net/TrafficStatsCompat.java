package androidx.core.net;

import android.net.TrafficStats;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.net.DatagramSocket;
import java.net.Socket;
import java.net.SocketException;

public final class TrafficStatsCompat
{
  @Deprecated
  public static void clearThreadStatsTag() {}
  
  @Deprecated
  public static int getThreadStatsTag()
  {
    return TrafficStats.getThreadStatsTag();
  }
  
  @Deprecated
  public static void incrementOperationCount(int paramInt)
  {
    TrafficStats.incrementOperationCount(paramInt);
  }
  
  @Deprecated
  public static void incrementOperationCount(int paramInt1, int paramInt2)
  {
    TrafficStats.incrementOperationCount(paramInt1, paramInt2);
  }
  
  @Deprecated
  public static void setThreadStatsTag(int paramInt)
  {
    TrafficStats.setThreadStatsTag(paramInt);
  }
  
  public static void tagDatagramSocket(@NonNull DatagramSocket paramDatagramSocket)
    throws SocketException
  {
    Api24Impl.tagDatagramSocket(paramDatagramSocket);
  }
  
  @Deprecated
  public static void tagSocket(Socket paramSocket)
    throws SocketException
  {
    TrafficStats.tagSocket(paramSocket);
  }
  
  public static void untagDatagramSocket(@NonNull DatagramSocket paramDatagramSocket)
    throws SocketException
  {
    Api24Impl.untagDatagramSocket(paramDatagramSocket);
  }
  
  @Deprecated
  public static void untagSocket(Socket paramSocket)
    throws SocketException
  {
    TrafficStats.untagSocket(paramSocket);
  }
  
  @RequiresApi(24)
  public static class Api24Impl
  {
    @DoNotInline
    public static void tagDatagramSocket(DatagramSocket paramDatagramSocket)
      throws SocketException
    {
      TrafficStats.tagDatagramSocket(paramDatagramSocket);
    }
    
    @DoNotInline
    public static void untagDatagramSocket(DatagramSocket paramDatagramSocket)
      throws SocketException
    {
      TrafficStats.untagDatagramSocket(paramDatagramSocket);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.net.TrafficStatsCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */