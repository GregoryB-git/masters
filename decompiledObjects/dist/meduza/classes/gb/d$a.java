package gb;

import x6.b;

public abstract class d$a
  implements g.d, i2.a
{
  public a0 a;
  public final Object b = new Object();
  public final r3 c;
  public final i2 d;
  public int e;
  public boolean f;
  public boolean g;
  
  public d$a(int paramInt, l3 paraml3, r3 paramr3)
  {
    b.y(paramr3, "transportTracer");
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
      b.I(f, "onStreamAllocated was not called, but it seems the stream is active");
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

/* Location:
 * Qualified Name:     gb.d.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */