package m0;

import android.media.AudioDeviceInfo;
import d0.C;
import d0.b;
import d0.e;
import d0.q;
import g0.c;
import java.nio.ByteBuffer;
import l0.y1;

public abstract interface z
{
  public abstract void A(c paramc);
  
  public abstract void B();
  
  public abstract void C(d paramd);
  
  public abstract boolean a(q paramq);
  
  public abstract void b();
  
  public abstract boolean c();
  
  public abstract void d(boolean paramBoolean);
  
  public abstract void e();
  
  public abstract void f(AudioDeviceInfo paramAudioDeviceInfo);
  
  public abstract void flush();
  
  public abstract void g();
  
  public abstract C h();
  
  public abstract boolean i();
  
  public abstract void j();
  
  public abstract void k(C paramC);
  
  public abstract void l(float paramFloat);
  
  public abstract void m(e parame);
  
  public abstract void n(int paramInt);
  
  public abstract int o(q paramq);
  
  public abstract void p();
  
  public abstract void q(int paramInt1, int paramInt2);
  
  public abstract k r(q paramq);
  
  public abstract void release();
  
  public abstract void s(b paramb);
  
  public abstract void t(y1 paramy1);
  
  public abstract boolean u(ByteBuffer paramByteBuffer, long paramLong, int paramInt);
  
  public abstract void v(int paramInt);
  
  public abstract long w(boolean paramBoolean);
  
  public abstract void x();
  
  public abstract void y(long paramLong);
  
  public abstract void z(q paramq, int paramInt, int[] paramArrayOfInt);
  
  public static final class a
  {
    public final int a;
    public final int b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final int f;
    
    public a(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean1, boolean paramBoolean2, int paramInt4)
    {
      a = paramInt1;
      b = paramInt2;
      c = paramInt3;
      d = paramBoolean1;
      e = paramBoolean2;
      f = paramInt4;
    }
  }
  
  public static final class b
    extends Exception
  {
    public final q o;
    
    public b(String paramString, q paramq)
    {
      super();
      o = paramq;
    }
    
    public b(Throwable paramThrowable, q paramq)
    {
      super();
      o = paramq;
    }
  }
  
  public static final class c
    extends Exception
  {
    public final int o;
    public final boolean p;
    public final q q;
    
    public c(int paramInt1, int paramInt2, int paramInt3, int paramInt4, q paramq, boolean paramBoolean, Exception paramException)
    {
      super(paramException);
      o = paramInt1;
      p = paramBoolean;
      q = paramq;
    }
  }
  
  public static abstract interface d
  {
    public abstract void a(z.a parama);
    
    public abstract void b(long paramLong);
    
    public abstract void c(boolean paramBoolean);
    
    public abstract void d(Exception paramException);
    
    public abstract void e(z.a parama);
    
    public abstract void f();
    
    public abstract void g();
    
    public abstract void h();
    
    public abstract void i();
    
    public abstract void j();
    
    public abstract void k(int paramInt, long paramLong1, long paramLong2);
  }
  
  public static final class e
    extends Exception
  {
    public final long o;
    public final long p;
    
    public e(long paramLong1, long paramLong2)
    {
      super();
      o = paramLong1;
      p = paramLong2;
    }
  }
  
  public static final class f
    extends Exception
  {
    public final int o;
    public final boolean p;
    public final q q;
    
    public f(int paramInt, q paramq, boolean paramBoolean)
    {
      super();
      p = paramBoolean;
      o = paramInt;
      q = paramq;
    }
  }
}

/* Location:
 * Qualified Name:     m0.z
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */