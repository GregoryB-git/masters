package d;

import e.a;
import java.util.ArrayList;
import java.util.HashMap;

public final class f
  extends c<Object>
{
  public f(g paramg, String paramString, a parama) {}
  
  public final void a(Object paramObject)
  {
    Object localObject = (Integer)c.b.get(a);
    if (localObject != null)
    {
      c.d.add(a);
      try
      {
        c.b(((Integer)localObject).intValue(), b, paramObject);
        return;
      }
      catch (Exception paramObject)
      {
        c.d.remove(a);
        throw ((Throwable)paramObject);
      }
    }
    localObject = f.l("Attempting to launch an unregistered ActivityResultLauncher with contract ");
    ((StringBuilder)localObject).append(b);
    ((StringBuilder)localObject).append(" and input ");
    ((StringBuilder)localObject).append(paramObject);
    ((StringBuilder)localObject).append(". You must ensure the ActivityResultLauncher is registered before calling launch().");
    throw new IllegalStateException(((StringBuilder)localObject).toString());
  }
  
  public final void b()
  {
    c.f(a);
  }
}

/* Location:
 * Qualified Name:     d.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */