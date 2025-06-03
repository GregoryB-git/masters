package p4;

import a0.j;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import l3.l;
import v3.d0.b;
import v3.i0;
import v5.e0;
import z3.g;

public final class f
  extends v3.f
  implements Handler.Callback
{
  public boolean A;
  public long B;
  public a C;
  public long D;
  public final c u;
  public final e v;
  public final Handler w;
  public final d x;
  public b y;
  public boolean z;
  
  public f(d0.b paramb, Looper paramLooper)
  {
    super(5);
    v = paramb;
    if (paramLooper == null)
    {
      paramb = null;
    }
    else
    {
      int i = e0.a;
      paramb = new Handler(paramLooper, this);
    }
    w = paramb;
    u = locala;
    x = new d();
    D = -9223372036854775807L;
  }
  
  public final void B()
  {
    C = null;
    y = null;
    D = -9223372036854775807L;
  }
  
  public final void D(long paramLong, boolean paramBoolean)
  {
    C = null;
    z = false;
    A = false;
  }
  
  public final void H(i0[] paramArrayOfi0, long paramLong1, long paramLong2)
  {
    y = u.b(paramArrayOfi0[0]);
    paramArrayOfi0 = C;
    if (paramArrayOfi0 != null)
    {
      long l = b;
      paramLong1 = D + l - paramLong2;
      if (l != paramLong1) {
        paramArrayOfi0 = new a(paramLong1, a);
      }
      C = paramArrayOfi0;
    }
    D = paramLong2;
  }
  
  public final void J(a parama, ArrayList paramArrayList)
  {
    for (int i = 0;; i++)
    {
      Object localObject = a;
      if (i >= localObject.length) {
        break;
      }
      localObject = localObject[i].n();
      if ((localObject != null) && (u.a((i0)localObject)))
      {
        e9.a locala = u.b((i0)localObject);
        byte[] arrayOfByte = a[i].B();
        arrayOfByte.getClass();
        x.o();
        x.q(arrayOfByte.length);
        localObject = x.c;
        int j = e0.a;
        ((ByteBuffer)localObject).put(arrayOfByte);
        x.r();
        localObject = locala.a(x);
        if (localObject != null) {
          J((a)localObject, paramArrayList);
        }
      }
      else
      {
        paramArrayList.add(a[i]);
      }
    }
  }
  
  public final long K(long paramLong)
  {
    boolean bool1 = true;
    boolean bool2;
    if (paramLong != -9223372036854775807L) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    x6.b.H(bool2);
    if (D != -9223372036854775807L) {
      bool2 = bool1;
    } else {
      bool2 = false;
    }
    x6.b.H(bool2);
    return paramLong - D;
  }
  
  public final int a(i0 parami0)
  {
    if (u.a(parami0))
    {
      int i;
      if (O == 0) {
        i = 4;
      } else {
        i = 2;
      }
      return j.b(i, 0, 0);
    }
    return j.b(0, 0, 0);
  }
  
  public final boolean b()
  {
    return true;
  }
  
  public final boolean d()
  {
    return A;
  }
  
  public final String getName()
  {
    return "MetadataRenderer";
  }
  
  public final boolean handleMessage(Message paramMessage)
  {
    if (what == 0)
    {
      paramMessage = (a)obj;
      v.w(paramMessage);
      return true;
    }
    throw new IllegalStateException();
  }
  
  public final void p(long paramLong1, long paramLong2)
  {
    int i = 1;
    while (i != 0)
    {
      int j;
      Object localObject2;
      if ((!z) && (C == null))
      {
        x.o();
        localObject1 = b;
        a = null;
        b = null;
        j = I((l)localObject1, x, 0);
        if (j == -4)
        {
          if (x.m(4))
          {
            z = true;
          }
          else
          {
            localObject1 = x;
            q = B;
            ((g)localObject1).r();
            localObject1 = y;
            j = e0.a;
            localObject2 = ((b)localObject1).a(x);
            if (localObject2 != null)
            {
              localObject1 = new ArrayList(a.length);
              J((a)localObject2, (ArrayList)localObject1);
              if (!((ArrayList)localObject1).isEmpty()) {
                C = new a(K(x.e), (a.b[])((ArrayList)localObject1).toArray(new a.b[0]));
              }
            }
          }
        }
        else if (j == -5)
        {
          localObject1 = (i0)b;
          localObject1.getClass();
          B = x;
        }
      }
      Object localObject1 = C;
      if ((localObject1 != null) && (b <= K(paramLong1)))
      {
        localObject1 = C;
        localObject2 = w;
        if (localObject2 != null) {
          ((Handler)localObject2).obtainMessage(0, localObject1).sendToTarget();
        } else {
          v.w((a)localObject1);
        }
        C = null;
        j = 1;
      }
      else
      {
        j = 0;
      }
      i = j;
      if (z)
      {
        i = j;
        if (C == null)
        {
          A = true;
          i = j;
        }
      }
    }
  }
}

/* Location:
 * Qualified Name:     p4.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */