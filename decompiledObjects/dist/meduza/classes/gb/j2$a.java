package gb;

import hb.o;
import java.io.OutputStream;
import java.util.ArrayList;

public final class j2$a
  extends OutputStream
{
  public final ArrayList a = new ArrayList();
  public s3 b;
  
  public j2$a(j2 paramj2) {}
  
  public final void write(int paramInt)
  {
    s3 locals3 = b;
    if ((locals3 != null) && (locals3.a() > 0))
    {
      b.c((byte)paramInt);
      return;
    }
    write(new byte[] { (byte)paramInt }, 0, 1);
  }
  
  public final void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    o localo;
    a locala;
    if (b == null)
    {
      localo = c.g.a(paramInt2);
      locala = this;
    }
    else
    {
      locala = this;
    }
    while (paramInt2 > 0)
    {
      int i = Math.min(paramInt2, b.a());
      if (i == 0)
      {
        i = Math.max(paramInt2, b.b() * 2);
        localo = c.g.a(i);
        b = localo;
        a.add(localo);
      }
      else
      {
        b.write(paramArrayOfByte, paramInt1, i);
        paramInt1 += i;
        paramInt2 -= i;
      }
    }
  }
}

/* Location:
 * Qualified Name:     gb.j2.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */