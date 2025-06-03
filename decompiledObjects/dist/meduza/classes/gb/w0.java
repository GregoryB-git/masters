package gb;

import f;
import java.io.Closeable;
import java.util.zip.CRC32;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import java.util.zip.ZipException;
import x6.b;

public final class w0
  implements Closeable
{
  public final w a = new w();
  public final CRC32 b = new CRC32();
  public final a c = new a();
  public final byte[] d = new byte['Ȁ'];
  public int e;
  public int f;
  public Inflater o;
  public int p = 1;
  public boolean q = false;
  public int r;
  public int s;
  public long t;
  public int u = 0;
  public int v = 0;
  public boolean w = true;
  
  public final void close()
  {
    if (!q)
    {
      q = true;
      a.close();
      Inflater localInflater = o;
      if (localInflater != null)
      {
        localInflater.end();
        o = null;
      }
    }
  }
  
  public final int f(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    boolean bool1 = q;
    boolean bool2 = true;
    b.I(bool1 ^ true, "GzipInflatingBuffer is closed");
    int i = 0;
    for (;;)
    {
      bool1 = true;
      for (;;)
      {
        if (!bool1) {
          break label974;
        }
        int j = paramInt2 - i;
        if (j <= 0) {
          break label974;
        }
        int k = q0.g.c(p);
        int m = 4;
        int n = 8;
        int i1 = 9;
        label436:
        Object localObject;
        switch (k)
        {
        default: 
          paramArrayOfByte = f.l("Invalid state: ");
          paramArrayOfByte.append(g.n(p));
          throw new AssertionError(paramArrayOfByte.toString());
        case 9: 
          bool1 = g();
          break;
        case 8: 
          if (o != null) {
            bool1 = true;
          } else {
            bool1 = false;
          }
          b.I(bool1, "inflater is null");
          if (e == f) {
            bool1 = true;
          } else {
            bool1 = false;
          }
          b.I(bool1, "inflaterInput has unconsumed bytes");
          i1 = Math.min(a.c, 512);
          if (i1 != 0)
          {
            e = 0;
            f = i1;
            a.U(d, 0, i1);
            o.setInput(d, e, i1);
            p = 8;
          }
          break;
        case 7: 
          m = paramInt1 + i;
          if (o != null) {
            bool1 = true;
          } else {
            bool1 = false;
          }
          b.I(bool1, "inflater is null");
          try
          {
            k = o.getTotalIn();
            n = o.inflate(paramArrayOfByte, m, j);
            j = o.getTotalIn() - k;
            u += j;
            v += j;
            e += j;
            b.update(paramArrayOfByte, m, n);
            if (o.finished())
            {
              t = (o.getBytesWritten() & 0xFFFFFFFF);
              i1 = 10;
            }
            else
            {
              if (!o.needsInput()) {
                break label436;
              }
            }
            p = i1;
            i1 = i + n;
            i = i1;
            if (p != 10) {
              break;
            }
            bool1 = g();
            i = i1;
          }
          catch (DataFormatException localDataFormatException)
          {
            paramArrayOfByte = f.l("Inflater data format exception: ");
            paramArrayOfByte.append(localDataFormatException.getMessage());
            throw new DataFormatException(paramArrayOfByte.toString());
          }
        case 6: 
          localObject = o;
          if (localObject == null) {
            o = new Inflater(true);
          } else {
            ((Inflater)localObject).reset();
          }
          b.reset();
          m = f;
          i1 = e;
          m -= i1;
          if (m > 0)
          {
            o.setInput(d, i1, m);
            i1 = n;
          }
          else
          {
            i1 = 9;
          }
          p = i1;
          break;
        case 5: 
          if ((r & 0x2) == 2)
          {
            if (c.d() < 2) {
              break label896;
            }
            if (((int)b.getValue() & 0xFFFF) != c.c()) {}
          }
          else
          {
            p = 7;
            break;
          }
          throw new ZipException("Corrupt GZIP header");
        case 4: 
          if ((r & 0x10) == 16)
          {
            localObject = c;
            while (((a)localObject).d() > 0) {
              if (((a)localObject).b() == 0)
              {
                i1 = 1;
                break label709;
              }
            }
            i1 = 0;
            if (i1 == 0) {}
          }
          else
          {
            p = 6;
          }
          break;
        case 3: 
          if ((r & 0x8) == 8)
          {
            localObject = c;
            while (((a)localObject).d() > 0) {
              if (((a)localObject).b() == 0)
              {
                i1 = 1;
                break label772;
              }
            }
            i1 = 0;
            if (i1 == 0) {}
          }
          else
          {
            p = 5;
          }
          break;
        case 2: 
          n = c.d();
          i1 = s;
          if (n >= i1)
          {
            a.a(c, i1);
            p = 4;
          }
          break;
        case 1: 
          if ((r & 0x4) != 4)
          {
            i1 = m;
          }
          else
          {
            if (c.d() < 2) {
              break label896;
            }
            s = c.c();
            i1 = 3;
          }
          p = i1;
          break;
        case 0: 
          label709:
          label772:
          if (c.d() >= 10) {
            break label902;
          }
          label896:
          bool1 = false;
        }
      }
      label902:
      if (c.c() != 35615) {
        break label964;
      }
      if (c.b() != 8) {
        break;
      }
      r = c.b();
      a.a(c, 6);
      p = 2;
    }
    throw new ZipException("Unsupported compression method");
    label964:
    throw new ZipException("Not in GZIP format");
    label974:
    boolean bool3 = bool2;
    if (bool1) {
      if ((p == 1) && (c.d() < 10)) {
        bool3 = bool2;
      } else {
        bool3 = false;
      }
    }
    w = bool3;
    return i;
  }
  
  public final boolean g()
  {
    if ((o != null) && (c.d() <= 18))
    {
      o.end();
      o = null;
    }
    if (c.d() < 8) {
      return false;
    }
    long l1 = b.getValue();
    a locala = c;
    if (l1 == (locala.c() | locala.c() << 16))
    {
      l1 = t;
      locala = c;
      long l2 = locala.c();
      if (l1 == (locala.c() << 16 | l2))
      {
        b.reset();
        p = 1;
        return true;
      }
    }
    throw new ZipException("Corrupt GZIP trailer");
  }
  
  public final class a
  {
    public a() {}
    
    public static void a(a parama, int paramInt)
    {
      Object localObject = w0.this;
      int i = f - e;
      if (i > 0)
      {
        i = Math.min(i, paramInt);
        localObject = w0.this;
        b.update(d, e, i);
        localObject = w0.this;
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
          a.U((byte[])localObject, 0, k);
          b.update((byte[])localObject, 0, k);
          j += k;
        }
      }
      parama = w0.this;
      u += paramInt;
    }
    
    public final int b()
    {
      w0 localw0 = w0.this;
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
      b.update(i);
      localw0 = w0.this;
      u += 1;
      return i;
    }
    
    public final int c()
    {
      return b() | b() << 8;
    }
    
    public final int d()
    {
      w0 localw0 = w0.this;
      return f - e + a.c;
    }
  }
}

/* Location:
 * Qualified Name:     gb.w0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */