package N4;

import com.google.protobuf.L;
import com.google.protobuf.r.a;
import java.util.Map;

public final class m$b
  extends r.a
  implements L
{
  public m$b()
  {
    super(m.T());
  }
  
  public b D(Iterable paramIterable)
  {
    y();
    m.a0((m)p, paramIterable);
    return this;
  }
  
  public b E(Iterable paramIterable)
  {
    y();
    m.X((m)p, paramIterable);
    return this;
  }
  
  public b F(k paramk)
  {
    y();
    m.Z((m)p, paramk);
    return this;
  }
  
  public b G(m paramm)
  {
    y();
    m.W((m)p, paramm);
    return this;
  }
  
  public b H(Map paramMap)
  {
    y();
    m.V((m)p).putAll(paramMap);
    return this;
  }
  
  public b I(Map paramMap)
  {
    y();
    m.Y((m)p).putAll(paramMap);
    return this;
  }
  
  public b J(String paramString, long paramLong)
  {
    paramString.getClass();
    y();
    m.V((m)p).put(paramString, Long.valueOf(paramLong));
    return this;
  }
  
  public b K(String paramString1, String paramString2)
  {
    paramString1.getClass();
    paramString2.getClass();
    y();
    m.Y((m)p).put(paramString1, paramString2);
    return this;
  }
  
  public b L(long paramLong)
  {
    y();
    m.b0((m)p, paramLong);
    return this;
  }
  
  public b M(long paramLong)
  {
    y();
    m.c0((m)p, paramLong);
    return this;
  }
  
  public b N(String paramString)
  {
    y();
    m.U((m)p, paramString);
    return this;
  }
}

/* Location:
 * Qualified Name:     N4.m.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */