package x3;

import android.media.AudioDeviceInfo;
import f;
import java.nio.ByteBuffer;
import v3.e1;
import v3.i0;
import w3.a0;

public abstract interface m
{
  public abstract boolean a(i0 parami0);
  
  public abstract void b();
  
  public abstract void c(e1 parame1);
  
  public abstract boolean d();
  
  public abstract void e(i0 parami0, int[] paramArrayOfInt);
  
  public abstract e1 f();
  
  public abstract void flush();
  
  public abstract void g();
  
  public abstract boolean h();
  
  public abstract void i(int paramInt);
  
  public abstract void j(p paramp);
  
  public abstract boolean k(long paramLong, ByteBuffer paramByteBuffer, int paramInt);
  
  public abstract long l(boolean paramBoolean);
  
  public abstract void m();
  
  public abstract void n();
  
  public abstract void o(float paramFloat);
  
  public abstract void p(a0 parama0);
  
  public abstract void pause();
  
  public abstract void q();
  
  public abstract void r();
  
  public abstract void reset();
  
  public abstract void s(d paramd);
  
  public abstract void setPreferredDevice(AudioDeviceInfo paramAudioDeviceInfo);
  
  public abstract void t(boolean paramBoolean);
  
  public abstract int u(i0 parami0);
  
  public static final class a
    extends Exception
  {
    public final i0 a;
    
    public a(String paramString, i0 parami0)
    {
      super();
      a = parami0;
    }
    
    public a(f.b paramb, i0 parami0)
    {
      super();
      a = parami0;
    }
  }
  
  public static final class b
    extends Exception
  {
    public final int a;
    public final boolean b;
    
    public b(int paramInt1, int paramInt2, int paramInt3, int paramInt4, i0 parami0, boolean paramBoolean, RuntimeException paramRuntimeException)
    {
      super(paramRuntimeException);
      a = paramInt1;
      b = paramBoolean;
    }
  }
  
  public static abstract interface c {}
  
  public static final class d
    extends Exception
  {
    public d(long paramLong1, long paramLong2)
    {
      super();
    }
  }
  
  public static final class e
    extends Exception
  {
    public final int a;
    public final boolean b;
    public final i0 c;
    
    public e(int paramInt, i0 parami0, boolean paramBoolean)
    {
      super();
      b = paramBoolean;
      a = paramInt;
      c = parami0;
    }
  }
}

/* Location:
 * Qualified Name:     x3.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */