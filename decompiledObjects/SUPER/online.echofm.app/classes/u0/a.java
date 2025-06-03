package u0;

import T0.h;
import V0.c;
import d0.q;

public abstract interface a
{
  public static final a a = new a();
  
  public abstract boolean a(q paramq);
  
  public abstract O0.a b(q paramq);
  
  public class a
    implements a
  {
    public boolean a(q paramq)
    {
      paramq = n;
      boolean bool;
      if ((!"application/id3".equals(paramq)) && (!"application/x-emsg".equals(paramq)) && (!"application/x-scte35".equals(paramq)) && (!"application/x-icy".equals(paramq)) && (!"application/vnd.dvb.ait".equals(paramq))) {
        bool = false;
      } else {
        bool = true;
      }
      return bool;
    }
    
    public O0.a b(q paramq)
    {
      paramq = n;
      if (paramq != null)
      {
        int i = paramq.hashCode();
        int j = -1;
        switch (i)
        {
        default: 
          break;
        case 1652648887: 
          if (paramq.equals("application/x-scte35")) {
            j = 4;
          }
          break;
        case 1154383568: 
          if (paramq.equals("application/x-emsg")) {
            j = 3;
          }
          break;
        case -1248341703: 
          if (paramq.equals("application/id3")) {
            j = 2;
          }
          break;
        case -1348231605: 
          if (paramq.equals("application/x-icy")) {
            j = 1;
          }
          break;
        case -1354451219: 
          if (paramq.equals("application/vnd.dvb.ait")) {
            j = 0;
          }
          break;
        }
        switch (j)
        {
        default: 
          break;
        case 4: 
          return new c();
        case 3: 
          return new Q0.b();
        case 2: 
          return new h();
        case 1: 
          return new S0.a();
        case 0: 
          return new P0.b();
        }
      }
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Attempted to create decoder for unsupported MIME type: ");
      localStringBuilder.append(paramq);
      throw new IllegalArgumentException(localStringBuilder.toString());
    }
  }
}

/* Location:
 * Qualified Name:     u0.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */