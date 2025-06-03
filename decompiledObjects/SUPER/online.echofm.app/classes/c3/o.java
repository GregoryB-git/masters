package c3;

import com.google.crypto.tink.shaded.protobuf.x.a;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;
import p3.A;
import p3.C;
import p3.C.b;
import p3.C.c;
import p3.C.c.a;
import p3.I;
import p3.y;
import p3.z;

public final class o
{
  public final C.b a;
  
  public o(C.b paramb)
  {
    a = paramb;
  }
  
  public static o i()
  {
    return new o(C.d0());
  }
  
  public static o j(n paramn)
  {
    return new o((C.b)paramn.h().T());
  }
  
  public o a(l paraml)
  {
    try
    {
      b(paraml.b(), false);
      return this;
    }
    finally
    {
      paraml = finally;
      throw paraml;
    }
  }
  
  public int b(A paramA, boolean paramBoolean)
  {
    try
    {
      paramA = f(paramA);
      a.y(paramA);
      if (paramBoolean) {
        a.C(paramA.a0());
      }
    }
    finally
    {
      break label49;
    }
    int i = paramA.a0();
    return i;
    label49:
    throw paramA;
  }
  
  public final C.c c(y paramy, I paramI)
  {
    label62:
    try
    {
      int i = g();
      if (paramI != I.p)
      {
        paramy = (C.c)C.c.e0().y(paramy).z(i).B(z.q).A(paramI).n();
        return paramy;
      }
    }
    finally
    {
      break label62;
      paramy = new java/security/GeneralSecurityException;
      paramy.<init>("unknown output prefix type");
      throw paramy;
    }
  }
  
  public n d()
  {
    try
    {
      n localn = n.e((C)a.n());
      return localn;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final boolean e(int paramInt)
  {
    label54:
    try
    {
      Iterator localIterator = a.B().iterator();
      int i;
      do
      {
        if (!localIterator.hasNext()) {
          break;
        }
        i = ((C.c)localIterator.next()).a0();
      } while (i != paramInt);
      return true;
    }
    finally
    {
      break label54;
      return false;
    }
  }
  
  public final C.c f(A paramA)
  {
    try
    {
      paramA = c(x.k(paramA), paramA.Z());
      return paramA;
    }
    finally
    {
      paramA = finally;
      throw paramA;
    }
  }
  
  /* Error */
  public final int g()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: invokestatic 163	k3/t:c	()I
    //   5: istore_1
    //   6: aload_0
    //   7: iload_1
    //   8: invokevirtual 165	c3/o:e	(I)Z
    //   11: istore_2
    //   12: iload_2
    //   13: ifeq +10 -> 23
    //   16: goto -14 -> 2
    //   19: astore_3
    //   20: goto +7 -> 27
    //   23: aload_0
    //   24: monitorexit
    //   25: iload_1
    //   26: ireturn
    //   27: aload_0
    //   28: monitorexit
    //   29: aload_3
    //   30: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	31	0	this	o
    //   5	21	1	i	int
    //   11	2	2	bool	boolean
    //   19	11	3	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	12	19	finally
  }
  
  public o h(int paramInt)
  {
    int i = 0;
    Object localObject2;
    try
    {
      if (i < a.A())
      {
        C.c localc = a.z(i);
        if (localc.a0() == paramInt) {
          if (localc.c0().equals(z.q))
          {
            a.C(paramInt);
            return this;
          }
        }
      }
    }
    finally
    {
      for (;;)
      {
        break;
        localObject2 = new java/security/GeneralSecurityException;
        Object localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        ((StringBuilder)localObject3).append("cannot set key as primary because it's not enabled: ");
        ((StringBuilder)localObject3).append(paramInt);
        ((GeneralSecurityException)localObject2).<init>(((StringBuilder)localObject3).toString());
        throw ((Throwable)localObject2);
        i++;
        continue;
        localObject3 = new java/security/GeneralSecurityException;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        ((StringBuilder)localObject2).append("key not found: ");
        ((StringBuilder)localObject2).append(paramInt);
        ((GeneralSecurityException)localObject3).<init>(((StringBuilder)localObject2).toString());
        throw ((Throwable)localObject3);
      }
    }
  }
}

/* Location:
 * Qualified Name:     c3.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */