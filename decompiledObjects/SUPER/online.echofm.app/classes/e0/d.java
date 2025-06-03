package e0;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public abstract class d
  implements b
{
  public b.a b;
  public b.a c;
  public b.a d;
  public b.a e;
  public ByteBuffer f;
  public ByteBuffer g;
  public boolean h;
  
  public d()
  {
    Object localObject = b.a;
    f = ((ByteBuffer)localObject);
    g = ((ByteBuffer)localObject);
    localObject = b.a.e;
    d = ((b.a)localObject);
    e = ((b.a)localObject);
    b = ((b.a)localObject);
    c = ((b.a)localObject);
  }
  
  public boolean a()
  {
    boolean bool;
    if (e != b.a.e) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final void b()
  {
    flush();
    f = b.a;
    b.a locala = b.a.e;
    d = locala;
    e = locala;
    b = locala;
    c = locala;
    l();
  }
  
  public boolean c()
  {
    boolean bool;
    if ((h) && (g == b.a)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public ByteBuffer d()
  {
    ByteBuffer localByteBuffer = g;
    g = b.a;
    return localByteBuffer;
  }
  
  public final void e()
  {
    h = true;
    k();
  }
  
  public final void flush()
  {
    g = b.a;
    h = false;
    b = d;
    c = e;
    j();
  }
  
  public final b.a g(b.a parama)
  {
    d = parama;
    e = i(parama);
    if (a()) {
      parama = e;
    } else {
      parama = b.a.e;
    }
    return parama;
  }
  
  public final boolean h()
  {
    return g.hasRemaining();
  }
  
  public abstract b.a i(b.a parama);
  
  public void j() {}
  
  public void k() {}
  
  public void l() {}
  
  public final ByteBuffer m(int paramInt)
  {
    if (f.capacity() < paramInt) {
      f = ByteBuffer.allocateDirect(paramInt).order(ByteOrder.nativeOrder());
    } else {
      f.clear();
    }
    ByteBuffer localByteBuffer = f;
    g = localByteBuffer;
    return localByteBuffer;
  }
}

/* Location:
 * Qualified Name:     e0.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */