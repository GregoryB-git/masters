package ka;

import java.util.List;
import ma.a0.d;
import ma.b1;
import ma.e1;
import ma.f1;
import ma.t0;
import ma.w;
import ma.w.a;
import ma.w.b;
import ma.w.f;

public final class e0
  extends w<e0, a>
  implements t0
{
  public static final int CURRENT_DOCUMENT_FIELD_NUMBER = 4;
  private static final e0 DEFAULT_INSTANCE;
  public static final int DELETE_FIELD_NUMBER = 2;
  private static volatile b1<e0> PARSER;
  public static final int TRANSFORM_FIELD_NUMBER = 6;
  public static final int UPDATE_FIELD_NUMBER = 1;
  public static final int UPDATE_MASK_FIELD_NUMBER = 3;
  public static final int UPDATE_TRANSFORMS_FIELD_NUMBER = 7;
  public static final int VERIFY_FIELD_NUMBER = 5;
  private int bitField0_;
  private v currentDocument_;
  private int operationCase_ = 0;
  private Object operation_;
  private n updateMask_;
  private a0.d<p.b> updateTransforms_ = e1.d;
  
  static
  {
    e0 locale0 = new e0();
    DEFAULT_INSTANCE = locale0;
    w.D(e0.class, locale0);
  }
  
  public static void G(e0 parame0, n paramn)
  {
    parame0.getClass();
    updateMask_ = paramn;
    bitField0_ |= 0x1;
  }
  
  public static void H(e0 parame0, p.b paramb)
  {
    parame0.getClass();
    paramb.getClass();
    a0.d locald = updateTransforms_;
    if (!locald.g()) {
      updateTransforms_ = w.A(locald);
    }
    updateTransforms_.add(paramb);
  }
  
  public static void I(e0 parame0, k paramk)
  {
    parame0.getClass();
    operation_ = paramk;
    operationCase_ = 1;
  }
  
  public static void J(e0 parame0, v paramv)
  {
    parame0.getClass();
    currentDocument_ = paramv;
    bitField0_ |= 0x2;
  }
  
  public static void K(e0 parame0, String paramString)
  {
    parame0.getClass();
    paramString.getClass();
    operationCase_ = 2;
    operation_ = paramString;
  }
  
  public static void L(e0 parame0, String paramString)
  {
    parame0.getClass();
    paramString.getClass();
    operationCase_ = 5;
    operation_ = paramString;
  }
  
  public static a Y()
  {
    return (a)DEFAULT_INSTANCE.s();
  }
  
  public static a Z(e0 parame0)
  {
    w.a locala = DEFAULT_INSTANCE.s();
    locala.n(parame0);
    return (a)locala;
  }
  
  public static e0 a0(byte[] paramArrayOfByte)
  {
    return (e0)w.B(DEFAULT_INSTANCE, paramArrayOfByte);
  }
  
  public final v M()
  {
    v localv1 = currentDocument_;
    v localv2 = localv1;
    if (localv1 == null) {
      localv2 = v.J();
    }
    return localv2;
  }
  
  public final String N()
  {
    String str;
    if (operationCase_ == 2) {
      str = (String)operation_;
    } else {
      str = "";
    }
    return str;
  }
  
  public final b O()
  {
    int i = operationCase_;
    b localb;
    if (i != 0)
    {
      if (i != 1)
      {
        if (i != 2)
        {
          if (i != 5)
          {
            if (i != 6) {
              localb = null;
            } else {
              localb = b.d;
            }
          }
          else {
            localb = b.c;
          }
        }
        else {
          localb = b.b;
        }
      }
      else {
        localb = b.a;
      }
    }
    else {
      localb = b.e;
    }
    return localb;
  }
  
  public final p P()
  {
    if (operationCase_ == 6) {
      return (p)operation_;
    }
    return p.G();
  }
  
  public final k Q()
  {
    if (operationCase_ == 1) {
      return (k)operation_;
    }
    return k.J();
  }
  
  public final n R()
  {
    n localn1 = updateMask_;
    n localn2 = localn1;
    if (localn1 == null) {
      localn2 = n.H();
    }
    return localn2;
  }
  
  public final a0.d S()
  {
    return updateTransforms_;
  }
  
  public final String T()
  {
    String str;
    if (operationCase_ == 5) {
      str = (String)operation_;
    } else {
      str = "";
    }
    return str;
  }
  
  public final boolean U()
  {
    boolean bool;
    if ((bitField0_ & 0x2) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean V()
  {
    boolean bool;
    if (operationCase_ == 6) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean W()
  {
    int i = operationCase_;
    boolean bool = true;
    if (i != 1) {
      bool = false;
    }
    return bool;
  }
  
  public final boolean X()
  {
    int i = bitField0_;
    boolean bool = true;
    if ((i & 0x1) == 0) {
      bool = false;
    }
    return bool;
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
      return new e0();
    case 2: 
      return new f1(DEFAULT_INSTANCE, "\000\007\001\001\001\007\007\000\001\000\001<\000\002Ȼ\000\003ဉ\000\004ဉ\001\005Ȼ\000\006<\000\007\033", new Object[] { "operation_", "operationCase_", "bitField0_", k.class, "updateMask_", "currentDocument_", p.class, "updateTransforms_", p.b.class });
    case 1: 
      return null;
    }
    return Byte.valueOf((byte)1);
  }
  
  public static final class a
    extends w.a<e0, a>
    implements t0
  {
    public a()
    {
      super();
    }
  }
  
  public static enum b
  {
    static
    {
      b localb1 = new b("UPDATE", 0);
      a = localb1;
      b localb2 = new b("DELETE", 1);
      b = localb2;
      b localb3 = new b("VERIFY", 2);
      c = localb3;
      b localb4 = new b("TRANSFORM", 3);
      d = localb4;
      b localb5 = new b("OPERATION_NOT_SET", 4);
      e = localb5;
      f = new b[] { localb1, localb2, localb3, localb4, localb5 };
    }
  }
}

/* Location:
 * Qualified Name:     ka.e0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */