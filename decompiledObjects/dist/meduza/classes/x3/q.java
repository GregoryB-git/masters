package x3;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public abstract class q
  implements f
{
  public f.a b;
  public f.a c;
  public f.a d;
  public f.a e;
  public ByteBuffer f;
  public ByteBuffer g;
  public boolean h;
  
  public q()
  {
    Object localObject = f.a;
    f = ((ByteBuffer)localObject);
    g = ((ByteBuffer)localObject);
    localObject = f.a.e;
    d = ((f.a)localObject);
    e = ((f.a)localObject);
    b = ((f.a)localObject);
    c = ((f.a)localObject);
  }
  
  public ByteBuffer a()
  {
    ByteBuffer localByteBuffer = g;
    g = f.a;
    return localByteBuffer;
  }
  
  public final void c()
  {
    h = true;
    h();
  }
  
  public boolean d()
  {
    boolean bool;
    if ((h) && (g == f.a)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final f.a e(f.a parama)
  {
    d = parama;
    e = f(parama);
    if (isActive()) {
      parama = e;
    } else {
      parama = f.a.e;
    }
    return parama;
  }
  
  public abstract f.a f(f.a parama);
  
  public final void flush()
  {
    g = f.a;
    h = false;
    b = d;
    c = e;
    g();
  }
  
  public void g() {}
  
  public void h() {}
  
  public void i() {}
  
  public boolean isActive()
  {
    boolean bool;
    if (e != f.a.e) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final ByteBuffer j(int paramInt)
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
  
  public final void reset()
  {
    flush();
    f = f.a;
    f.a locala = f.a.e;
    d = locala;
    e = locala;
    b = locala;
    c = locala;
    i();
  }
}

/* Location:
 * Qualified Name:     x3.q
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */