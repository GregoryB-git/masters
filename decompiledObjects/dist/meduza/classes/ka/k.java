package ka;

import java.util.Collections;
import java.util.Map;
import ma.b1;
import ma.f1;
import ma.l0;
import ma.m0;
import ma.n1;
import ma.t0;
import ma.v1;
import ma.w;
import ma.w.a;
import ma.w.b;
import ma.w.f;

public final class k
  extends w<k, a>
  implements t0
{
  public static final int CREATE_TIME_FIELD_NUMBER = 3;
  private static final k DEFAULT_INSTANCE;
  public static final int FIELDS_FIELD_NUMBER = 2;
  public static final int NAME_FIELD_NUMBER = 1;
  private static volatile b1<k> PARSER;
  public static final int UPDATE_TIME_FIELD_NUMBER = 4;
  private int bitField0_;
  private n1 createTime_;
  private m0<String, d0> fields_ = m0.b;
  private String name_ = "";
  private n1 updateTime_;
  
  static
  {
    k localk = new k();
    DEFAULT_INSTANCE = localk;
    w.D(k.class, localk);
  }
  
  public static void G(k paramk, String paramString)
  {
    paramk.getClass();
    paramString.getClass();
    name_ = paramString;
  }
  
  public static m0 H(k paramk)
  {
    m0 localm0 = fields_;
    if (!a) {
      fields_ = localm0.d();
    }
    return fields_;
  }
  
  public static void I(k paramk, n1 paramn1)
  {
    paramk.getClass();
    updateTime_ = paramn1;
    bitField0_ |= 0x2;
  }
  
  public static k J()
  {
    return DEFAULT_INSTANCE;
  }
  
  public static a N()
  {
    return (a)DEFAULT_INSTANCE.s();
  }
  
  public final Map<String, d0> K()
  {
    return Collections.unmodifiableMap(fields_);
  }
  
  public final String L()
  {
    return name_;
  }
  
  public final n1 M()
  {
    n1 localn11 = updateTime_;
    n1 localn12 = localn11;
    if (localn11 == null) {
      localn12 = n1.I();
    }
    return localn12;
  }
  
  public final Object t(w.f paramf)
  {
    switch (paramf.ordinal())
    {
    default: 
      throw new UnsupportedOperationException();
    case 6: 
      b1 localb1 = PARSER;
      paramf = localb1;
      if (localb1 == null) {
        try
        {
          localb1 = PARSER;
          paramf = localb1;
          if (localb1 == null)
          {
            paramf = new ma/w$b;
            paramf.<init>(DEFAULT_INSTANCE);
            PARSER = paramf;
          }
        }
        finally {}
      }
      return paramf;
    case 5: 
      return DEFAULT_INSTANCE;
    case 4: 
      return new a();
    case 3: 
      return new k();
    case 2: 
      paramf = b.a;
      return new f1(DEFAULT_INSTANCE, "\000\004\000\001\001\004\004\001\000\000\001Ȉ\0022\003ဉ\000\004ဉ\001", new Object[] { "bitField0_", "name_", "fields_", paramf, "createTime_", "updateTime_" });
    case 1: 
      return null;
    }
    return Byte.valueOf((byte)1);
  }
  
  public static final class a
    extends w.a<k, a>
    implements t0
  {
    public a()
    {
      super();
    }
  }
  
  public static final class b
  {
    public static final l0<String, d0> a = new l0(v1.c, v1.e, d0.U());
  }
}

/* Location:
 * Qualified Name:     ka.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */