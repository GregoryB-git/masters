package u;

import java.lang.ref.Reference;

public class c$d$a
  extends a
{
  public c$d$a(c.d paramd) {}
  
  public String u()
  {
    c.a locala = (c.a)v.o.get();
    if (locala == null) {
      return "Completer object has been garbage collected, future will fail soon";
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("tag=[");
    localStringBuilder.append(a);
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     u.c.d.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */