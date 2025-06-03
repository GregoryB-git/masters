package gb;

import eb.e1;
import eb.h0;
import eb.h0.a;
import eb.s0;
import eb.s0.f;
import f;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Locale;
import n7.d;

public abstract class y0
  extends a.b
{
  public static final s0.f v = h0.a(":status", new a());
  public e1 r;
  public s0 s;
  public Charset t = d.c;
  public boolean u;
  
  public y0(int paramInt, l3 paraml3, r3 paramr3)
  {
    super(paramInt, paraml3, paramr3);
  }
  
  public static Charset k(s0 params0)
  {
    params0 = (String)params0.c(v0.i);
    if (params0 != null) {
      params0 = params0.split("charset=", 2);
    }
    try
    {
      params0 = Charset.forName(params0[(params0.length - 1)].trim());
      return params0;
    }
    catch (Exception params0)
    {
      for (;;) {}
    }
    return d.c;
  }
  
  public static e1 l(s0 params0)
  {
    Object localObject1 = (Integer)params0.c(v);
    if (localObject1 == null) {
      return e1.m.g("Missing HTTP status code");
    }
    params0 = (String)params0.c(v0.i);
    int i = 0;
    Object localObject2;
    if ((params0 != null) && (16 <= params0.length()))
    {
      localObject2 = params0.toLowerCase(Locale.US);
      if (((String)localObject2).startsWith("application/grpc")) {
        if (((String)localObject2).length() != 16)
        {
          int j = ((String)localObject2).charAt(16);
          if ((j != 43) && (j != 59)) {}
        }
        else
        {
          i = 1;
        }
      }
    }
    if (i == 0)
    {
      localObject2 = v0.f(((Integer)localObject1).intValue());
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append("invalid content-type: ");
      ((StringBuilder)localObject1).append(params0);
      return ((e1)localObject2).a(((StringBuilder)localObject1).toString());
    }
    return null;
  }
  
  public final class a
    implements h0.a<Integer>
  {
    public final byte[] a(Serializable paramSerializable)
    {
      paramSerializable = (Integer)paramSerializable;
      throw new UnsupportedOperationException();
    }
    
    public final Object b(byte[] paramArrayOfByte)
    {
      if (paramArrayOfByte.length >= 3)
      {
        int i = paramArrayOfByte[0];
        int j = paramArrayOfByte[1];
        return Integer.valueOf(paramArrayOfByte[2] - 48 + ((j - 48) * 10 + (i - 48) * 100));
      }
      StringBuilder localStringBuilder = f.l("Malformed status code ");
      localStringBuilder.append(new String(paramArrayOfByte, h0.a));
      throw new NumberFormatException(localStringBuilder.toString());
    }
  }
}

/* Location:
 * Qualified Name:     gb.y0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */