package E4;

import com.google.firebase.perf.config.RemoteConfigManager;
import q5.b;

public final class f
  implements U5.a
{
  public final a a;
  
  public f(a parama)
  {
    a = parama;
  }
  
  public static f a(a parama)
  {
    return new f(parama);
  }
  
  public static RemoteConfigManager c(a parama)
  {
    return (RemoteConfigManager)b.c(parama.e(), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public RemoteConfigManager b()
  {
    return c(a);
  }
}

/* Location:
 * Qualified Name:     E4.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */