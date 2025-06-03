package p4;

import v3.i0;

public abstract interface c
{
  public static final a a = new a();
  
  public abstract boolean a(i0 parami0);
  
  public abstract e9.a b(i0 parami0);
  
  public final class a
    implements c
  {
    public final boolean a(i0 parami0)
    {
      parami0 = t;
      boolean bool;
      if ((!"application/id3".equals(parami0)) && (!"application/x-emsg".equals(parami0)) && (!"application/x-scte35".equals(parami0)) && (!"application/x-icy".equals(parami0)) && (!"application/vnd.dvb.ait".equals(parami0))) {
        bool = false;
      } else {
        bool = true;
      }
      return bool;
    }
    
    public final e9.a b(i0 parami0)
    {
      parami0 = t;
      if (parami0 != null)
      {
        parami0.hashCode();
        int i = -1;
        switch (parami0.hashCode())
        {
        default: 
          break;
        case 1652648887: 
          if (parami0.equals("application/x-scte35")) {
            i = 4;
          }
          break;
        case 1154383568: 
          if (parami0.equals("application/x-emsg")) {
            i = 3;
          }
          break;
        case -1248341703: 
          if (parami0.equals("application/id3")) {
            i = 2;
          }
          break;
        case -1348231605: 
          if (parami0.equals("application/x-icy")) {
            i = 1;
          }
          break;
        case -1354451219: 
          if (parami0.equals("application/vnd.dvb.ait")) {
            i = 0;
          }
          break;
        }
        switch (i)
        {
        default: 
          break;
        case 4: 
          return new w4.c();
        case 3: 
          return new r4.b();
        case 2: 
          return new u4.g(null);
        case 1: 
          return new t4.a();
        case 0: 
          return new q4.b();
        }
      }
      throw new IllegalArgumentException(g.d("Attempted to create decoder for unsupported MIME type: ", parami0));
    }
  }
}

/* Location:
 * Qualified Name:     p4.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */