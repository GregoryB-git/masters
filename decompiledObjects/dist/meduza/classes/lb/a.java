package lb;

import eb.j0;
import eb.t;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import ma.b1;
import ma.k;
import ma.k.b;
import ma.s0;

public final class a
  extends InputStream
  implements t, j0
{
  public s0 a;
  public final b1<?> b;
  public ByteArrayInputStream c;
  
  public a(s0 params0, b1<?> paramb1)
  {
    a = params0;
    b = paramb1;
  }
  
  public final int available()
  {
    Object localObject = a;
    if (localObject != null) {
      return ((s0)localObject).d();
    }
    localObject = c;
    if (localObject != null) {
      return ((ByteArrayInputStream)localObject).available();
    }
    return 0;
  }
  
  public final int f(OutputStream paramOutputStream)
  {
    Object localObject1 = a;
    int i = 0;
    if (localObject1 != null)
    {
      i = ((s0)localObject1).d();
      a.g(paramOutputStream);
      a = null;
    }
    else
    {
      localObject1 = c;
      if (localObject1 != null)
      {
        Object localObject2 = b.a;
        x6.b.y(paramOutputStream, "outputStream cannot be null!");
        localObject2 = new byte[' '];
        for (long l = 0L;; l += i)
        {
          i = ((InputStream)localObject1).read((byte[])localObject2);
          if (i == -1)
          {
            i = (int)l;
            c = null;
            break;
          }
          paramOutputStream.write((byte[])localObject2, 0, i);
        }
      }
    }
    return i;
  }
  
  public final int read()
  {
    if (a != null)
    {
      c = new ByteArrayInputStream(a.j());
      a = null;
    }
    ByteArrayInputStream localByteArrayInputStream = c;
    if (localByteArrayInputStream != null) {
      return localByteArrayInputStream.read();
    }
    return -1;
  }
  
  public final int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    Object localObject = a;
    if (localObject != null)
    {
      int i = ((s0)localObject).d();
      if (i == 0)
      {
        a = null;
        c = null;
        return -1;
      }
      if (paramInt2 >= i)
      {
        localObject = k.c;
        paramArrayOfByte = new k.b(paramArrayOfByte, paramInt1, i);
        a.i(paramArrayOfByte);
        if (paramArrayOfByte.p0() == 0)
        {
          a = null;
          c = null;
          return i;
        }
        throw new IllegalStateException("Did not write as much data as expected.");
      }
      c = new ByteArrayInputStream(a.j());
      a = null;
    }
    localObject = c;
    if (localObject != null) {
      return ((ByteArrayInputStream)localObject).read(paramArrayOfByte, paramInt1, paramInt2);
    }
    return -1;
  }
}

/* Location:
 * Qualified Name:     lb.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */