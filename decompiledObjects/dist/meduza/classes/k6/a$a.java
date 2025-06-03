package k6;

import android.content.Context;
import android.os.Looper;
import l6.c;
import l6.j;
import m6.a;

public abstract class a$a<T extends a.f, O>
  extends a.e<T, O>
{
  @Deprecated
  public T buildClient(Context paramContext, Looper paramLooper, a parama, O paramO, e.a parama1, e.b paramb)
  {
    return buildClient(paramContext, paramLooper, parama, paramO, parama1, paramb);
  }
  
  public T buildClient(Context paramContext, Looper paramLooper, a parama, O paramO, c paramc, j paramj)
  {
    throw new UnsupportedOperationException("buildClient must be implemented");
  }
}

/* Location:
 * Qualified Name:     k6.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */