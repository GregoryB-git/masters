package k8;

import dc.a;
import ec.j;
import f;

public final class d
  extends j
  implements a<String>
{
  public static final d a = new d();
  
  public d()
  {
    super(0);
  }
  
  public final Object invoke()
  {
    StringBuilder localStringBuilder = f.l("Must be called on a background thread, was called on ");
    i.d.getClass();
    localStringBuilder.append(i.a.b());
    localStringBuilder.append('.');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     k8.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */