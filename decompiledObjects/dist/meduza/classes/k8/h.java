package k8;

import dc.a;
import ec.j;
import f;

public final class h
  extends j
  implements a<String>
{
  public static final h a = new h();
  
  public h()
  {
    super(0);
  }
  
  public final Object invoke()
  {
    StringBuilder localStringBuilder = f.l("Must not be called on a main thread, was called on ");
    i.d.getClass();
    localStringBuilder.append(i.a.b());
    localStringBuilder.append('.');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     k8.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */