package c1;

import g0.a;
import j0.i;
import java.nio.Buffer;
import java.nio.ByteBuffer;

public abstract class j
  extends j0.k
  implements l
{
  public final String o;
  
  public j(String paramString)
  {
    super(new p[2], new q[2]);
    o = paramString;
    w(1024);
  }
  
  public final m A(Throwable paramThrowable)
  {
    return new m("Unexpected decode error", paramThrowable);
  }
  
  public abstract k B(byte[] paramArrayOfByte, int paramInt, boolean paramBoolean);
  
  public final m C(p paramp, q paramq, boolean paramBoolean)
  {
    try
    {
      Object localObject = (ByteBuffer)a.e(r);
      localObject = B(((ByteBuffer)localObject).array(), ((Buffer)localObject).limit(), paramBoolean);
      paramq.z(t, (k)localObject, x);
      r = false;
      return null;
    }
    catch (m paramp) {}
    return paramp;
  }
  
  public void d(long paramLong) {}
  
  public final p y()
  {
    return new p();
  }
  
  public final q z()
  {
    return new a();
  }
  
  public class a
    extends q
  {
    public a() {}
    
    public void x()
    {
      j.x(j.this, this);
    }
  }
}

/* Location:
 * Qualified Name:     c1.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */