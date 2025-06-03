package eb;

import hb.g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class r0
{
  public static final Logger c = Logger.getLogger(r0.class.getName());
  public static r0 d;
  public final LinkedHashSet<p0> a = new LinkedHashSet();
  public List<p0> b = Collections.emptyList();
  
  public static List<Class<?>> a()
  {
    ArrayList localArrayList = new ArrayList();
    try
    {
      localArrayList.add(g.class);
    }
    catch (ClassNotFoundException localClassNotFoundException1)
    {
      c.log(Level.FINE, "Unable to find OkHttpChannelProvider", localClassNotFoundException1);
    }
    try
    {
      localArrayList.add(Class.forName("io.grpc.netty.NettyChannelProvider"));
    }
    catch (ClassNotFoundException localClassNotFoundException2)
    {
      c.log(Level.FINE, "Unable to find NettyChannelProvider", localClassNotFoundException2);
    }
    try
    {
      localArrayList.add(Class.forName("io.grpc.netty.UdsNettyChannelProvider"));
    }
    catch (ClassNotFoundException localClassNotFoundException3)
    {
      c.log(Level.FINE, "Unable to find UdsNettyChannelProvider", localClassNotFoundException3);
    }
    return Collections.unmodifiableList(localArrayList);
  }
  
  public static final class a
    implements d1.a<p0>
  {
    public final boolean a(Object paramObject)
    {
      return ((p0)paramObject).b();
    }
    
    public final int b(Object paramObject)
    {
      return ((p0)paramObject).c();
    }
  }
}

/* Location:
 * Qualified Name:     eb.r0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */