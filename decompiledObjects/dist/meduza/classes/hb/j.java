package hb;

import c4.x;
import java.util.EnumMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import jb.a;
import x6.b;
import xc.f;
import xc.i;

public final class j
{
  public final Logger a;
  public final Level b;
  
  public j(Level paramLevel)
  {
    b.y(paramLevel, "level");
    b = paramLevel;
    b.y(localLogger, "logger");
    a = localLogger;
  }
  
  public static String h(f paramf)
  {
    long l = b;
    if (l <= 64L) {
      return paramf.l0().l();
    }
    int i = (int)Math.min(l, 64L);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramf.q0(i).l());
    localStringBuilder.append("...");
    return localStringBuilder.toString();
  }
  
  public final boolean a()
  {
    return a.isLoggable(b);
  }
  
  public final void b(int paramInt1, int paramInt2, f paramf, int paramInt3, boolean paramBoolean)
  {
    if (a())
    {
      Logger localLogger = a;
      Level localLevel = b;
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(a0.j.u(paramInt1));
      localStringBuilder.append(" DATA: streamId=");
      localStringBuilder.append(paramInt2);
      localStringBuilder.append(" endStream=");
      localStringBuilder.append(paramBoolean);
      localStringBuilder.append(" length=");
      localStringBuilder.append(paramInt3);
      localStringBuilder.append(" bytes=");
      localStringBuilder.append(h(paramf));
      localLogger.log(localLevel, localStringBuilder.toString());
    }
  }
  
  public final void c(int paramInt1, int paramInt2, a parama, i parami)
  {
    if (a())
    {
      Logger localLogger = a;
      Level localLevel = b;
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(a0.j.u(paramInt1));
      localStringBuilder.append(" GO_AWAY: lastStreamId=");
      localStringBuilder.append(paramInt2);
      localStringBuilder.append(" errorCode=");
      localStringBuilder.append(parama);
      localStringBuilder.append(" length=");
      localStringBuilder.append(parami.i());
      localStringBuilder.append(" bytes=");
      parama = new f();
      parama.z0(parami);
      localStringBuilder.append(h(parama));
      localLogger.log(localLevel, localStringBuilder.toString());
    }
  }
  
  public final void d(int paramInt, long paramLong)
  {
    if (a())
    {
      Logger localLogger = a;
      Level localLevel = b;
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(a0.j.u(paramInt));
      localStringBuilder.append(" PING: ack=false bytes=");
      localStringBuilder.append(paramLong);
      localLogger.log(localLevel, localStringBuilder.toString());
    }
  }
  
  public final void e(int paramInt1, int paramInt2, a parama)
  {
    if (a())
    {
      Logger localLogger = a;
      Level localLevel = b;
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(a0.j.u(paramInt1));
      localStringBuilder.append(" RST_STREAM: streamId=");
      localStringBuilder.append(paramInt2);
      localStringBuilder.append(" errorCode=");
      localStringBuilder.append(parama);
      localLogger.log(localLevel, localStringBuilder.toString());
    }
  }
  
  public final void f(int paramInt, x paramx)
  {
    if (a())
    {
      Logger localLogger = a;
      Level localLevel = b;
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(a0.j.u(paramInt));
      localStringBuilder.append(" SETTINGS: ack=false settings=");
      EnumMap localEnumMap = new EnumMap(a.class);
      for (a locala : a.values()) {
        if (paramx.a(a))
        {
          int j = a;
          localEnumMap.put(locala, Integer.valueOf(((int[])d)[j]));
        }
      }
      localStringBuilder.append(localEnumMap.toString());
      localLogger.log(localLevel, localStringBuilder.toString());
    }
  }
  
  public final void g(int paramInt1, int paramInt2, long paramLong)
  {
    if (a())
    {
      Logger localLogger = a;
      Level localLevel = b;
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(a0.j.u(paramInt1));
      localStringBuilder.append(" WINDOW_UPDATE: streamId=");
      localStringBuilder.append(paramInt2);
      localStringBuilder.append(" windowSizeIncrement=");
      localStringBuilder.append(paramLong);
      localLogger.log(localLevel, localStringBuilder.toString());
    }
  }
  
  public static enum a
  {
    public final int a;
    
    public a(int paramInt)
    {
      a = paramInt;
    }
  }
}

/* Location:
 * Qualified Name:     hb.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */