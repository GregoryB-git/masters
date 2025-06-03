package k8;

import dc.a;
import ec.j;

public final class f
  extends j
  implements a<String>
{
  public static final f a = new f();
  
  public f()
  {
    super(0);
  }
  
  public final Object invoke()
  {
    StringBuilder localStringBuilder = f.l("Must be called on a blocking thread, was called on ");
    i.d.getClass();
    localStringBuilder.append(i.a.b());
    localStringBuilder.append('.');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     k8.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */