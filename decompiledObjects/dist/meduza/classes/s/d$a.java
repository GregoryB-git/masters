package s;

import f;
import java.lang.ref.Reference;

public final class d$a
  extends a<T>
{
  public d$a(d paramd) {}
  
  public final String n()
  {
    b localb = (b)p.a.get();
    if (localb == null) {
      return "Completer object has been garbage collected, future will fail soon";
    }
    StringBuilder localStringBuilder = f.l("tag=[");
    localStringBuilder.append(a);
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     s.d.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */