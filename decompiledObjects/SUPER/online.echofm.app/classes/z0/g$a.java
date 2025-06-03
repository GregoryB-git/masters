package z0;

import c1.h;
import c1.l;
import d0.q;
import d1.a;
import d1.c;
import java.util.Objects;

public class g$a
  implements g
{
  public final h b = new h();
  
  public boolean a(q paramq)
  {
    String str = n;
    boolean bool;
    if ((!b.a(paramq)) && (!Objects.equals(str, "application/cea-608")) && (!Objects.equals(str, "application/x-mp4-cea-608")) && (!Objects.equals(str, "application/cea-708"))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public l b(q paramq)
  {
    Object localObject = n;
    if (localObject != null)
    {
      int i = ((String)localObject).hashCode();
      int j = -1;
      switch (i)
      {
      default: 
        break;
      case 1566016562: 
        if (((String)localObject).equals("application/cea-708")) {
          j = 2;
        }
        break;
      case 1566015601: 
        if (((String)localObject).equals("application/cea-608")) {
          j = 1;
        }
        break;
      case 930165504: 
        if (((String)localObject).equals("application/x-mp4-cea-608")) {
          j = 0;
        }
        break;
      }
      switch (j)
      {
      default: 
        break;
      case 2: 
        return new c(G, q);
      case 0: 
      case 1: 
        return new a((String)localObject, G, 16000L);
      }
    }
    if (b.a(paramq))
    {
      paramq = b.b(paramq);
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append(paramq.getClass().getSimpleName());
      ((StringBuilder)localObject).append("Decoder");
      return new b(((StringBuilder)localObject).toString(), paramq);
    }
    paramq = new StringBuilder();
    paramq.append("Attempted to create decoder for unsupported MIME type: ");
    paramq.append((String)localObject);
    throw new IllegalArgumentException(paramq.toString());
  }
}

/* Location:
 * Qualified Name:     z0.g.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */