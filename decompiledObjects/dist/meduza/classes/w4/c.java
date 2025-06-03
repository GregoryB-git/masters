package w4;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import p4.a.b;
import v5.c0;
import v5.t;
import v5.u;

public final class c
  extends e9.a
{
  public final u b = new u();
  public final t c = new t();
  public c0 d;
  
  public final p4.a i(p4.d paramd, ByteBuffer paramByteBuffer)
  {
    Object localObject = d;
    if (localObject != null) {
      l1 = q;
    }
    long l2;
    try
    {
      l2 = b;
      if (l1 == l2) {
        break label72;
      }
    }
    finally {}
    d = ((c0)localObject);
    ((c0)localObject).a(e - q);
    label72:
    paramd = paramByteBuffer.array();
    int i = paramByteBuffer.limit();
    b.E(paramd, i);
    c.j(paramd, i);
    c.m(39);
    long l1 = c.g(1);
    int j = 32;
    long l3 = l1 << 32 | c.g(32);
    c.m(20);
    int k = c.g(12);
    i = c.g(8);
    paramd = null;
    b.H(14);
    if (i != 0)
    {
      if (i != 255)
      {
        l1 = 128L;
        long l4;
        boolean bool1;
        boolean bool2;
        boolean bool3;
        boolean bool4;
        int m;
        boolean bool5;
        if (i != 4)
        {
          if (i != 5)
          {
            if (i == 6)
            {
              paramByteBuffer = b;
              paramd = d;
              l1 = g.a(l3, paramByteBuffer);
              paramd = new g(l1, paramd.b(l1));
            }
          }
          else
          {
            localObject = b;
            paramByteBuffer = d;
            l4 = ((u)localObject).w();
            if ((((u)localObject).v() & 0x80) != 0) {
              bool1 = true;
            } else {
              bool1 = false;
            }
            paramd = Collections.emptyList();
            boolean bool6;
            if (!bool1)
            {
              j = ((u)localObject).v();
              if ((j & 0x80) != 0) {
                bool2 = true;
              } else {
                bool2 = false;
              }
              if ((j & 0x40) != 0) {
                bool3 = true;
              } else {
                bool3 = false;
              }
              if ((j & 0x20) != 0) {
                i = 1;
              } else {
                i = 0;
              }
              if ((j & 0x10) != 0) {
                bool4 = true;
              } else {
                bool4 = false;
              }
              if ((bool3) && (!bool4)) {
                l1 = g.a(l3, (u)localObject);
              } else {
                l1 = -9223372036854775807L;
              }
              if (!bool3)
              {
                k = ((u)localObject).v();
                paramd = new ArrayList(k);
                for (j = 0; j < k; j++)
                {
                  m = ((u)localObject).v();
                  if (!bool4) {
                    l2 = g.a(l3, (u)localObject);
                  } else {
                    l2 = -9223372036854775807L;
                  }
                  paramd.add(new d.b(m, l2, paramByteBuffer.b(l2)));
                }
              }
              if (i != 0)
              {
                l2 = ((u)localObject).v();
                if ((l2 & 0x80) != 0L) {
                  bool5 = true;
                } else {
                  bool5 = false;
                }
                l2 = ((l2 & 1L) << 32 | ((u)localObject).w()) * 1000L / 90L;
              }
              else
              {
                bool5 = false;
                l2 = -9223372036854775807L;
              }
              k = ((u)localObject).A();
              j = ((u)localObject).v();
              i = ((u)localObject).v();
              bool6 = bool2;
              bool2 = bool3;
              bool3 = bool4;
            }
            else
            {
              l1 = -9223372036854775807L;
              bool6 = false;
              bool2 = false;
              bool3 = false;
              bool5 = false;
              l2 = -9223372036854775807L;
              k = 0;
              j = 0;
              i = 0;
            }
            paramd = new d(l4, bool1, bool6, bool2, bool3, l1, paramByteBuffer.b(l1), paramd, bool5, l2, k, j, i);
          }
        }
        else
        {
          localObject = b;
          i = ((u)localObject).v();
          paramByteBuffer = new ArrayList(i);
          for (k = 0; k < i; k++)
          {
            long l5 = ((u)localObject).w();
            if ((((u)localObject).v() & 0x80) != 0) {
              bool5 = true;
            } else {
              bool5 = false;
            }
            paramd = new ArrayList();
            int n;
            int i2;
            if (!bool5)
            {
              j = ((u)localObject).v();
              if ((j & 0x80) != 0) {
                bool3 = true;
              } else {
                bool3 = false;
              }
              if ((j & 0x40) != 0) {
                bool2 = true;
              } else {
                bool2 = false;
              }
              if ((j & 0x20) != 0) {
                j = 1;
              } else {
                j = 0;
              }
              if (bool2) {
                l1 = ((u)localObject).w();
              } else {
                l1 = -9223372036854775807L;
              }
              if (!bool2)
              {
                n = ((u)localObject).v();
                paramd = new ArrayList(n);
                for (m = 0; m < n; m++) {
                  paramd.add(new f.b(((u)localObject).v(), ((u)localObject).w()));
                }
              }
              if (j != 0)
              {
                l2 = ((u)localObject).v();
                if ((l2 & 0x80) != 0L) {
                  bool4 = true;
                } else {
                  bool4 = false;
                }
                l2 = ((l2 & 1L) << 32 | ((u)localObject).w()) * 1000L / 90L;
              }
              else
              {
                bool4 = false;
                l2 = -9223372036854775807L;
              }
              l3 = 128L;
              j = 32;
              m = ((u)localObject).A();
              n = ((u)localObject).v();
              int i1 = ((u)localObject).v();
              bool1 = bool3;
              bool3 = bool2;
              l4 = l1;
              l1 = l3;
              bool2 = bool1;
              i2 = m;
              m = i1;
            }
            else
            {
              bool2 = false;
              bool3 = false;
              l4 = -9223372036854775807L;
              bool4 = false;
              l2 = -9223372036854775807L;
              i2 = 0;
              n = 0;
              m = 0;
            }
            paramByteBuffer.add(new f.c(l5, bool5, bool2, bool3, paramd, l4, bool4, l2, i2, n, m));
          }
          paramd = new f(paramByteBuffer);
        }
      }
      else
      {
        paramd = b;
        l1 = paramd.w();
        i = k - 4;
        paramByteBuffer = new byte[i];
        paramd.d(paramByteBuffer, 0, i);
        paramd = new a(l1, paramByteBuffer, l3);
      }
    }
    else {
      paramd = new e();
    }
    if (paramd == null) {
      paramd = new p4.a(new a.b[0]);
    } else {
      paramd = new p4.a(new a.b[] { paramd });
    }
    return paramd;
  }
}

/* Location:
 * Qualified Name:     w4.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */