package e9;

import com.google.android.gms.tasks.Task;
import eb.c;
import eb.t0;
import i9.a0;
import i9.b0;
import i9.f;
import i9.f0;
import i9.g0;
import i9.l1;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import n9.j;
import n9.l;
import z3.g;

public abstract class a
  implements p4.b
{
  public abstract void A();
  
  public abstract void B();
  
  public p4.a a(p4.d paramd)
  {
    ByteBuffer localByteBuffer = c;
    localByteBuffer.getClass();
    boolean bool;
    if ((localByteBuffer.position() == 0) && (localByteBuffer.hasArray()) && (localByteBuffer.arrayOffset() == 0)) {
      bool = true;
    } else {
      bool = false;
    }
    x6.b.q(bool);
    if (paramd.n()) {
      paramd = null;
    } else {
      paramd = i(paramd, localByteBuffer);
    }
    return paramd;
  }
  
  public abstract String b();
  
  public abstract p4.a i(p4.d paramd, ByteBuffer paramByteBuffer);
  
  public abstract i9.a j();
  
  public abstract i9.b k(e parame);
  
  public abstract i9.d l();
  
  public abstract f m(e parame);
  
  public abstract a0 n(e parame, f paramf);
  
  public abstract b0 o();
  
  public abstract f0 p();
  
  public abstract g0 q();
  
  public abstract l1 r();
  
  public abstract Task s();
  
  public abstract void t();
  
  public abstract boolean u();
  
  public abstract eb.e v(t0 paramt0, c paramc);
  
  public abstract void w();
  
  public abstract Object x(String paramString, l paraml);
  
  public abstract void y(String paramString, Runnable paramRunnable);
  
  public abstract void z(j paramj);
}

/* Location:
 * Qualified Name:     e9.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */