package V3;

import Q3.d;
import Q3.l;
import c4.d.a;
import s3.e;

public class g
  extends f
{
  public void I(A paramA)
  {
    d = paramA;
  }
  
  public void J(A paramA)
  {
    c = paramA;
  }
  
  public void K(e parame)
  {
    try
    {
      l = parame;
      return;
    }
    finally
    {
      parame = finally;
      throw parame;
    }
  }
  
  public void L(l paraml)
  {
    for (;;)
    {
      try
      {
        b();
        int i = a.a[paraml.ordinal()];
        if (i == 1) {
          break label117;
        }
        if (i == 2) {
          break label110;
        }
        if (i == 3) {
          break label103;
        }
        if (i == 4) {
          break label96;
        }
        if (i == 5)
        {
          paraml = d.a.s;
          this.i = paraml;
        }
      }
      finally
      {
        break;
      }
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localStringBuilder.append("Unknown log level: ");
      localStringBuilder.append(paraml);
      localIllegalArgumentException.<init>(localStringBuilder.toString());
      throw localIllegalArgumentException;
      label96:
      paraml = d.a.r;
      continue;
      label103:
      paraml = d.a.q;
      continue;
      label110:
      paraml = d.a.p;
      continue;
      label117:
      paraml = d.a.o;
    }
    return;
    throw paraml;
  }
  
  public void M(long paramLong)
  {
    d locald;
    label58:
    try
    {
      b();
      if (paramLong >= 1048576L) {
        if (paramLong <= 104857600L)
        {
          k = paramLong;
          return;
        }
      }
    }
    finally
    {
      break label58;
      locald = new Q3/d;
      locald.<init>("Firebase Database currently doesn't support a cache size larger than 100MB");
      throw locald;
      locald = new Q3/d;
      locald.<init>("The minimum cache size must be at least 1MB");
      throw locald;
    }
  }
  
  public void N(boolean paramBoolean)
  {
    try
    {
      b();
      j = paramBoolean;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void O(String paramString)
  {
    label41:
    try
    {
      b();
      if ((paramString != null) && (!paramString.isEmpty()))
      {
        f = paramString;
        return;
      }
    }
    finally
    {
      break label41;
      paramString = new java/lang/IllegalArgumentException;
      paramString.<init>("Session identifier is not allowed to be empty or null!");
      throw paramString;
    }
  }
}

/* Location:
 * Qualified Name:     V3.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */