package x3;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import v5.e0;

public abstract interface f
{
  public static final ByteBuffer a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());
  
  public abstract ByteBuffer a();
  
  public abstract void b(ByteBuffer paramByteBuffer);
  
  public abstract void c();
  
  public abstract boolean d();
  
  public abstract a e(a parama);
  
  public abstract void flush();
  
  public abstract boolean isActive();
  
  public abstract void reset();
  
  public static final class a
  {
    public static final a e = new a(-1, -1, -1);
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    
    public a(int paramInt1, int paramInt2, int paramInt3)
    {
      a = paramInt1;
      b = paramInt2;
      c = paramInt3;
      if (e0.F(paramInt3)) {
        paramInt1 = e0.w(paramInt3, paramInt2);
      } else {
        paramInt1 = -1;
      }
      d = paramInt1;
    }
    
    public final boolean equals(Object paramObject)
    {
      boolean bool = true;
      if (this == paramObject) {
        return true;
      }
      if (!(paramObject instanceof a)) {
        return false;
      }
      paramObject = (a)paramObject;
      if ((a != a) || (b != b) || (c != c)) {
        bool = false;
      }
      return bool;
    }
    
    public final int hashCode()
    {
      return Arrays.hashCode(new Object[] { Integer.valueOf(a), Integer.valueOf(b), Integer.valueOf(c) });
    }
    
    public final String toString()
    {
      StringBuilder localStringBuilder = f.l("AudioFormat[sampleRate=");
      localStringBuilder.append(a);
      localStringBuilder.append(", channelCount=");
      localStringBuilder.append(b);
      localStringBuilder.append(", encoding=");
      localStringBuilder.append(c);
      localStringBuilder.append(']');
      return localStringBuilder.toString();
    }
  }
  
  public static final class b
    extends Exception
  {
    public b(f.a parama)
    {
      super();
    }
  }
}

/* Location:
 * Qualified Name:     x3.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */