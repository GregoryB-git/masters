package s0;

import android.graphics.Bitmap;
import d0.A;
import d0.q;
import d0.z;
import g0.M;
import j0.i;
import j0.k;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import k0.Z0;

public final class a
  extends k
  implements c
{
  public final b o;
  
  public a(b paramb)
  {
    super(new i[1], new f[1]);
    o = paramb;
  }
  
  public static Bitmap B(byte[] paramArrayOfByte, int paramInt)
  {
    try
    {
      localObject = i0.c.a(paramArrayOfByte, paramInt, null);
      return (Bitmap)localObject;
    }
    catch (IOException paramArrayOfByte)
    {
      throw new d(paramArrayOfByte);
    }
    catch (A localA)
    {
      Object localObject = new StringBuilder();
      ((StringBuilder)localObject).append("Could not decode image data with BitmapFactory. (data.length = ");
      ((StringBuilder)localObject).append(paramArrayOfByte.length);
      ((StringBuilder)localObject).append(", input length = ");
      ((StringBuilder)localObject).append(paramInt);
      ((StringBuilder)localObject).append(")");
      throw new d(((StringBuilder)localObject).toString(), localA);
    }
  }
  
  public d A(Throwable paramThrowable)
  {
    return new d("Unexpected decode error", paramThrowable);
  }
  
  public d C(i parami, f paramf, boolean paramBoolean)
  {
    try
    {
      ByteBuffer localByteBuffer = (ByteBuffer)g0.a.e(r);
      g0.a.f(localByteBuffer.hasArray());
      if (localByteBuffer.arrayOffset() == 0) {
        paramBoolean = true;
      } else {
        paramBoolean = false;
      }
      g0.a.a(paramBoolean);
      s = o.a(localByteBuffer.array(), localByteBuffer.remaining());
      p = t;
      return null;
    }
    catch (d parami) {}
    return parami;
  }
  
  public i i()
  {
    return new i(1);
  }
  
  public f z()
  {
    return new a();
  }
  
  public class a
    extends f
  {
    public a() {}
    
    public void x()
    {
      a.y(a.this, this);
    }
  }
  
  public static abstract interface b
  {
    public abstract Bitmap a(byte[] paramArrayOfByte, int paramInt);
  }
  
  public static final class c
    implements c.a
  {
    public final a.b b = new b();
    
    public int a(q paramq)
    {
      String str = n;
      if ((str != null) && (z.p(str)))
      {
        if (M.y0(n)) {}
        for (int i = 4;; i = 1)
        {
          i = Z0.a(i);
          break;
        }
        return i;
      }
      return Z0.a(0);
    }
    
    public a d()
    {
      return new a(b, null);
    }
  }
}

/* Location:
 * Qualified Name:     s0.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */