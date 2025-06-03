package gb;

import eb.l;
import hb.h.b;
import java.io.InputStream;

public abstract class d
  implements m3
{
  public final void a(l paraml)
  {
    t0 localt0 = b;
    x6.b.y(paraml, "compressor");
    localt0.a(paraml);
  }
  
  public final void d(InputStream paramInputStream)
  {
    x6.b.y(paramInputStream, "message");
    try
    {
      if (!b.isClosed()) {
        b.b(paramInputStream);
      }
      return;
    }
    finally
    {
      v0.b(paramInputStream);
    }
  }
  
  public final void e()
  {
    a locala = q();
    i2 locali2 = d;
    a = locala;
    a = locali2;
  }
  
  public final void f(int paramInt)
  {
    a locala = q();
    locala.getClass();
    pb.b.b();
    c localc = new c(locala, paramInt);
    ((h.b)locala).f(localc);
  }
  
  public final void flush()
  {
    a locala = (a)this;
    if (!b.isClosed()) {
      b.flush();
    }
  }
  
  public abstract a q();
  
  public static abstract class a
    implements g.d, i2.a
  {
    public a0 a;
    public final Object b = new Object();
    public final r3 c;
    public final i2 d;
    public int e;
    public boolean f;
    public boolean g;
    
    public a(int paramInt, l3 paraml3, r3 paramr3)
    {
      x6.b.y(paramr3, "transportTracer");
      c = paramr3;
      paraml3 = new i2(this, paramInt, paraml3, paramr3);
      d = paraml3;
      a = paraml3;
    }
    
    public final void a(n3.a parama)
    {
      j.a(parama);
    }
    
    public final void b(int paramInt)
    {
      synchronized (b)
      {
        x6.b.I(f, "onStreamAllocated was not called, but it seems the stream is active");
        int i = e;
        int j = 0;
        int k;
        if (i < 32768) {
          k = 1;
        } else {
          k = 0;
        }
        paramInt = i - paramInt;
        e = paramInt;
        if (paramInt < 32768) {
          paramInt = 1;
        } else {
          paramInt = 0;
        }
        if ((k == 0) && (paramInt != 0)) {
          paramInt = 1;
        } else {
          paramInt = 0;
        }
        if (paramInt != 0) {
          synchronized (b)
          {
            Object localObject2 = b;
            paramInt = j;
            try
            {
              if (f)
              {
                paramInt = j;
                if (e < 32768)
                {
                  paramInt = j;
                  if (!g) {
                    paramInt = 1;
                  }
                }
              }
              if (paramInt != 0) {
                j.c();
              }
            }
            finally {}
          }
        }
        return;
      }
    }
  }
}

/* Location:
 * Qualified Name:     gb.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */