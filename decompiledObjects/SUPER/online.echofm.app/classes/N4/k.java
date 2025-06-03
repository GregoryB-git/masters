package N4;

import com.google.protobuf.L;
import com.google.protobuf.T;
import com.google.protobuf.r;
import com.google.protobuf.r.a;
import com.google.protobuf.r.b;
import com.google.protobuf.r.c;
import com.google.protobuf.t.d;
import com.google.protobuf.t.e;
import com.google.protobuf.u;
import java.util.List;

public final class k
  extends r
  implements L
{
  private static final k DEFAULT_INSTANCE;
  private static volatile T PARSER;
  public static final int SESSION_ID_FIELD_NUMBER = 1;
  public static final int SESSION_VERBOSITY_FIELD_NUMBER = 2;
  private static final u sessionVerbosity_converter_ = new a();
  private int bitField0_;
  private String sessionId_ = "";
  private t.d sessionVerbosity_ = r.y();
  
  static
  {
    k localk = new k();
    DEFAULT_INSTANCE = localk;
    r.Q(k.class, localk);
  }
  
  public static c a0()
  {
    return (c)DEFAULT_INSTANCE.u();
  }
  
  private void b0(String paramString)
  {
    paramString.getClass();
    bitField0_ |= 0x1;
    sessionId_ = paramString;
  }
  
  public final void W(l paraml)
  {
    paraml.getClass();
    X();
    sessionVerbosity_.z(paraml.g());
  }
  
  public final void X()
  {
    t.d locald = sessionVerbosity_;
    if (!locald.p()) {
      sessionVerbosity_ = r.L(locald);
    }
  }
  
  public l Y(int paramInt)
  {
    l locall1 = l.c(sessionVerbosity_.F(paramInt));
    l locall2 = locall1;
    if (locall1 == null) {
      locall2 = l.p;
    }
    return locall2;
  }
  
  public int Z()
  {
    return sessionVerbosity_.size();
  }
  
  public final Object x(r.c paramc, Object paramObject1, Object paramObject2)
  {
    switch (b.a[paramc.ordinal()])
    {
    default: 
      throw new UnsupportedOperationException();
    case 7: 
      return null;
    case 6: 
      return Byte.valueOf((byte)1);
    case 5: 
      paramObject1 = PARSER;
      paramc = (r.c)paramObject1;
      if (paramObject1 == null)
      {
        try
        {
          paramObject1 = PARSER;
          paramc = (r.c)paramObject1;
          if (paramObject1 == null)
          {
            paramc = new com/google/protobuf/r$b;
            paramc.<init>(DEFAULT_INSTANCE);
            PARSER = paramc;
          }
        }
        finally
        {
          break label118;
        }
        break label123;
        throw paramc;
      }
      return paramc;
    case 4: 
      return DEFAULT_INSTANCE;
    case 3: 
      paramc = l.e();
      return r.O(DEFAULT_INSTANCE, "\001\002\000\001\001\002\002\000\001\000\001ဈ\000\002\036", new Object[] { "bitField0_", "sessionId_", "sessionVerbosity_", paramc });
    case 2: 
      label118:
      label123:
      return new c(null);
    }
    return new k();
  }
  
  public class a
    implements u
  {}
  
  public static final class c
    extends r.a
    implements L
  {
    public c()
    {
      super();
    }
    
    public c D(l paraml)
    {
      y();
      k.V((k)p, paraml);
      return this;
    }
    
    public c E(String paramString)
    {
      y();
      k.U((k)p, paramString);
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     N4.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */