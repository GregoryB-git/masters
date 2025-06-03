package gb;

import java.util.zip.CRC32;

public final class w0$a
{
  public w0$a(w0 paramw0) {}
  
  public static void a(a parama, int paramInt)
  {
    Object localObject = a;
    int i = f - e;
    if (i > 0)
    {
      i = Math.min(i, paramInt);
      localObject = a;
      b.update(d, e, i);
      localObject = a;
      e += i;
      i = paramInt - i;
    }
    else
    {
      i = paramInt;
    }
    if (i > 0)
    {
      localObject = new byte['Ȁ'];
      int j = 0;
      while (j < i)
      {
        int k = Math.min(i - j, 512);
        a.a.U((byte[])localObject, 0, k);
        a.b.update((byte[])localObject, 0, k);
        j += k;
      }
    }
    parama = a;
    u += paramInt;
  }
  
  public final int b()
  {
    w0 localw0 = a;
    int i = f;
    int j = e;
    if (i - j > 0)
    {
      i = d[j] & 0xFF;
      e = (j + 1);
    }
    else
    {
      i = a.readUnsignedByte();
    }
    a.b.update(i);
    localw0 = a;
    u += 1;
    return i;
  }
  
  public final int c()
  {
    return b() | b() << 8;
  }
  
  public final int d()
  {
    w0 localw0 = a;
    return f - e + a.c;
  }
}

/* Location:
 * Qualified Name:     gb.w0.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */