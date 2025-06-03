package androidx.core.net;

import android.net.TrafficStats;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import java.net.DatagramSocket;
import java.net.SocketException;

@RequiresApi(24)
class TrafficStatsCompat$Api24Impl
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

/* Location:
 * Qualified Name:     androidx.core.net.TrafficStatsCompat.Api24Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */