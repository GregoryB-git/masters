package ka;

import java.util.ArrayList;
import java.util.List;
import ma.a;
import ma.a0.a;
import ma.a0.d;
import ma.b1;
import ma.e1;
import ma.f1;
import ma.t0;
import ma.w;
import ma.w.a;
import ma.w.b;
import ma.w.f;
import ma.x;

public final class z
  extends w<z, a>
  implements t0
{
  private static final z DEFAULT_INSTANCE;
  public static final int END_AT_FIELD_NUMBER = 8;
  public static final int FROM_FIELD_NUMBER = 2;
  public static final int LIMIT_FIELD_NUMBER = 5;
  public static final int OFFSET_FIELD_NUMBER = 6;
  public static final int ORDER_BY_FIELD_NUMBER = 4;
  private static volatile b1<z> PARSER;
  public static final int SELECT_FIELD_NUMBER = 1;
  public static final int START_AT_FIELD_NUMBER = 7;
  public static final int WHERE_FIELD_NUMBER = 3;
  private int bitField0_;
  private j endAt_;
  private a0.d<b> from_;
  private x limit_;
  private int offset_;
  private a0.d<h> orderBy_;
  private i select_;
  private j startAt_;
  private g where_;
  
  static
  {
    z localz = new z();
    DEFAULT_INSTANCE = localz;
    w.D(z.class, localz);
  }
  
  public z()
  {
    e1 locale1 = e1.d;
    from_ = locale1;
    orderBy_ = locale1;
  }
  
  public static void G(z paramz, b paramb)
  {
    paramz.getClass();
    a0.d locald = from_;
    if (!locald.g()) {
      from_ = w.A(locald);
    }
    from_.add(paramb);
  }
  
  public static void H(z paramz, g paramg)
  {
    paramz.getClass();
    paramg.getClass();
    where_ = paramg;
    bitField0_ |= 0x2;
  }
  
  public static void I(z paramz, h paramh)
  {
    paramz.getClass();
    a0.d locald = orderBy_;
    if (!locald.g()) {
      orderBy_ = w.A(locald);
    }
    orderBy_.add(paramh);
  }
  
  public static void J(z paramz, j paramj)
  {
    paramz.getClass();
    startAt_ = paramj;
    bitField0_ |= 0x4;
  }
  
  public static void K(z paramz, j paramj)
  {
    paramz.getClass();
    endAt_ = paramj;
    bitField0_ |= 0x8;
  }
  
  public static void L(z paramz, x paramx)
  {
    paramz.getClass();
    limit_ = paramx;
    bitField0_ |= 0x10;
  }
  
  public static z M()
  {
    return DEFAULT_INSTANCE;
  }
  
  public static a Z()
  {
    return (a)DEFAULT_INSTANCE.s();
  }
  
  public final j N()
  {
    j localj1 = endAt_;
    j localj2 = localj1;
    if (localj1 == null) {
      localj2 = j.J();
    }
    return localj2;
  }
  
  public final b O()
  {
    return (b)from_.get(0);
  }
  
  public final int P()
  {
    return from_.size();
  }
  
  public final x Q()
  {
    x localx1 = limit_;
    x localx2 = localx1;
    if (localx1 == null) {
      localx2 = x.H();
    }
    return localx2;
  }
  
  public final h R(int paramInt)
  {
    return (h)orderBy_.get(paramInt);
  }
  
  public final int S()
  {
    return orderBy_.size();
  }
  
  public final j T()
  {
    j localj1 = startAt_;
    j localj2 = localj1;
    if (localj1 == null) {
      localj2 = j.J();
    }
    return localj2;
  }
  
  public final g U()
  {
    g localg1 = where_;
    g localg2 = localg1;
    if (localg1 == null) {
      localg2 = g.K();
    }
    return localg2;
  }
  
  public final boolean V()
  {
    boolean bool;
    if ((bitField0_ & 0x8) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean W()
  {
    boolean bool;
    if ((bitField0_ & 0x10) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean X()
  {
    boolean bool;
    if ((bitField0_ & 0x4) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean Y()
  {
    boolean bool;
    if ((bitField0_ & 0x2) != 0) {
      bool = true;
    } else {
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
      return new z();
    case 2: 
      return new f1(DEFAULT_INSTANCE, "\000\b\000\001\001\b\b\000\002\000\001ဉ\000\002\033\003ဉ\001\004\033\005ဉ\004\006\004\007ဉ\002\bဉ\003", new Object[] { "bitField0_", "select_", "from_", b.class, "where_", "orderBy_", h.class, "limit_", "offset_", "startAt_", "endAt_" });
    case 1: 
      return null;
    }
    return Byte.valueOf((byte)1);
  }
  
  public static final class a
    extends w.a<z, a>
    implements t0
  {
    public a()
    {
      super();
    }
  }
  
  public static final class b
    extends w<b, a>
    implements t0
  {
    public static final int ALL_DESCENDANTS_FIELD_NUMBER = 3;
    public static final int COLLECTION_ID_FIELD_NUMBER = 2;
    private static final b DEFAULT_INSTANCE;
    private static volatile b1<b> PARSER;
    private boolean allDescendants_;
    private String collectionId_ = "";
    
    static
    {
      b localb = new b();
      DEFAULT_INSTANCE = localb;
      w.D(b.class, localb);
    }
    
    public static void G(b paramb, String paramString)
    {
      paramb.getClass();
      paramString.getClass();
      collectionId_ = paramString;
    }
    
    public static void H(b paramb)
    {
      allDescendants_ = true;
    }
    
    public static a K()
    {
      return (a)DEFAULT_INSTANCE.s();
    }
    
    public final boolean I()
    {
      return allDescendants_;
    }
    
    public final String J()
    {
      return collectionId_;
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
        return new b();
      case 2: 
        return new f1(DEFAULT_INSTANCE, "\000\002\000\000\002\003\002\000\000\000\002Ȉ\003\007", new Object[] { "collectionId_", "allDescendants_" });
      case 1: 
        return null;
      }
      return Byte.valueOf((byte)1);
    }
    
    public static final class a
      extends w.a<z.b, a>
      implements t0
    {
      public a()
      {
        super();
      }
    }
  }
  
  public static final class c
    extends w<c, a>
    implements t0
  {
    private static final c DEFAULT_INSTANCE;
    public static final int FILTERS_FIELD_NUMBER = 2;
    public static final int OP_FIELD_NUMBER = 1;
    private static volatile b1<c> PARSER;
    private a0.d<z.g> filters_ = e1.d;
    private int op_;
    
    static
    {
      c localc = new c();
      DEFAULT_INSTANCE = localc;
      w.D(c.class, localc);
    }
    
    public static void G(c paramc, b paramb)
    {
      paramc.getClass();
      op_ = paramb.a();
    }
    
    public static void H(c paramc, ArrayList paramArrayList)
    {
      a0.d locald = filters_;
      if (!locald.g()) {
        filters_ = w.A(locald);
      }
      a.k(paramArrayList, filters_);
    }
    
    public static c I()
    {
      return DEFAULT_INSTANCE;
    }
    
    public static a L()
    {
      return (a)DEFAULT_INSTANCE.s();
    }
    
    public final a0.d J()
    {
      return filters_;
    }
    
    public final b K()
    {
      int i = op_;
      b localb1;
      if (i != 0)
      {
        if (i != 1)
        {
          if (i != 2) {
            localb1 = null;
          } else {
            localb1 = b.d;
          }
        }
        else {
          localb1 = b.c;
        }
      }
      else {
        localb1 = b.b;
      }
      b localb2 = localb1;
      if (localb1 == null) {
        localb2 = b.e;
      }
      return localb2;
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
        return new c();
      case 2: 
        return new f1(DEFAULT_INSTANCE, "\000\002\000\000\001\002\002\000\001\000\001\f\002\033", new Object[] { "op_", "filters_", z.g.class });
      case 1: 
        return null;
      }
      return Byte.valueOf((byte)1);
    }
    
    public static final class a
      extends w.a<z.c, a>
      implements t0
    {
      public a()
      {
        super();
      }
    }
    
    public static enum b
      implements a0.a
    {
      public final int a;
      
      static
      {
        b localb1 = new b("OPERATOR_UNSPECIFIED", 0, 0);
        b = localb1;
        b localb2 = new b("AND", 1, 1);
        c = localb2;
        b localb3 = new b("OR", 2, 2);
        d = localb3;
        b localb4 = new b("UNRECOGNIZED", 3, -1);
        e = localb4;
        f = new b[] { localb1, localb2, localb3, localb4 };
      }
      
      public b(int paramInt)
      {
        a = paramInt;
      }
      
      public final int a()
      {
        if (this != e) {
          return a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
      }
    }
  }
  
  public static enum d
    implements a0.a
  {
    public final int a;
    
    static
    {
      d locald1 = new d("DIRECTION_UNSPECIFIED", 0, 0);
      b = locald1;
      d locald2 = new d("ASCENDING", 1, 1);
      c = locald2;
      d locald3 = new d("DESCENDING", 2, 2);
      d = locald3;
      d locald4 = new d("UNRECOGNIZED", 3, -1);
      e = locald4;
      f = new d[] { locald1, locald2, locald3, locald4 };
    }
    
    public d(int paramInt)
    {
      a = paramInt;
    }
    
    public final int a()
    {
      if (this != e) {
        return a;
      }
      throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
  }
  
  public static final class e
    extends w<e, a>
    implements t0
  {
    private static final e DEFAULT_INSTANCE;
    public static final int FIELD_FIELD_NUMBER = 1;
    public static final int OP_FIELD_NUMBER = 2;
    private static volatile b1<e> PARSER;
    public static final int VALUE_FIELD_NUMBER = 3;
    private int bitField0_;
    private z.f field_;
    private int op_;
    private d0 value_;
    
    static
    {
      e locale = new e();
      DEFAULT_INSTANCE = locale;
      w.D(e.class, locale);
    }
    
    public static void G(e parame, z.f paramf)
    {
      parame.getClass();
      field_ = paramf;
      bitField0_ |= 0x1;
    }
    
    public static void H(e parame, b paramb)
    {
      parame.getClass();
      op_ = paramb.a();
    }
    
    public static void I(e parame, d0 paramd0)
    {
      parame.getClass();
      paramd0.getClass();
      value_ = paramd0;
      bitField0_ |= 0x2;
    }
    
    public static e J()
    {
      return DEFAULT_INSTANCE;
    }
    
    public static a N()
    {
      return (a)DEFAULT_INSTANCE.s();
    }
    
    public final z.f K()
    {
      z.f localf1 = field_;
      z.f localf2 = localf1;
      if (localf1 == null) {
        localf2 = z.f.H();
      }
      return localf2;
    }
    
    public final b L()
    {
      b localb1 = b.f(op_);
      b localb2 = localb1;
      if (localb1 == null) {
        localb2 = b.u;
      }
      return localb2;
    }
    
    public final d0 M()
    {
      d0 locald01 = value_;
      d0 locald02 = locald01;
      if (locald01 == null) {
        locald02 = d0.U();
      }
      return locald02;
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
        return new e();
      case 2: 
        return new f1(DEFAULT_INSTANCE, "\000\003\000\001\001\003\003\000\000\000\001ဉ\000\002\f\003ဉ\001", new Object[] { "bitField0_", "field_", "op_", "value_" });
      case 1: 
        return null;
      }
      return Byte.valueOf((byte)1);
    }
    
    public static final class a
      extends w.a<z.e, a>
      implements t0
    {
      public a()
      {
        super();
      }
    }
    
    public static enum b
      implements a0.a
    {
      public final int a;
      
      static
      {
        b localb1 = new b("OPERATOR_UNSPECIFIED", 0, 0);
        b = localb1;
        b localb2 = new b("LESS_THAN", 1, 1);
        c = localb2;
        b localb3 = new b("LESS_THAN_OR_EQUAL", 2, 2);
        d = localb3;
        b localb4 = new b("GREATER_THAN", 3, 3);
        e = localb4;
        b localb5 = new b("GREATER_THAN_OR_EQUAL", 4, 4);
        f = localb5;
        b localb6 = new b("EQUAL", 5, 5);
        o = localb6;
        b localb7 = new b("NOT_EQUAL", 6, 6);
        p = localb7;
        b localb8 = new b("ARRAY_CONTAINS", 7, 7);
        q = localb8;
        b localb9 = new b("IN", 8, 8);
        r = localb9;
        b localb10 = new b("ARRAY_CONTAINS_ANY", 9, 9);
        s = localb10;
        b localb11 = new b("NOT_IN", 10, 10);
        t = localb11;
        b localb12 = new b("UNRECOGNIZED", 11, -1);
        u = localb12;
        v = new b[] { localb1, localb2, localb3, localb4, localb5, localb6, localb7, localb8, localb9, localb10, localb11, localb12 };
      }
      
      public b(int paramInt)
      {
        a = paramInt;
      }
      
      public static b f(int paramInt)
      {
        switch (paramInt)
        {
        default: 
          return null;
        case 10: 
          return t;
        case 9: 
          return s;
        case 8: 
          return r;
        case 7: 
          return q;
        case 6: 
          return p;
        case 5: 
          return o;
        case 4: 
          return f;
        case 3: 
          return e;
        case 2: 
          return d;
        case 1: 
          return c;
        }
        return b;
      }
      
      public final int a()
      {
        if (this != u) {
          return a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
      }
    }
  }
  
  public static final class f
    extends w<f, a>
    implements t0
  {
    private static final f DEFAULT_INSTANCE;
    public static final int FIELD_PATH_FIELD_NUMBER = 2;
    private static volatile b1<f> PARSER;
    private String fieldPath_ = "";
    
    static
    {
      f localf = new f();
      DEFAULT_INSTANCE = localf;
      w.D(f.class, localf);
    }
    
    public static void G(f paramf, String paramString)
    {
      paramf.getClass();
      paramString.getClass();
      fieldPath_ = paramString;
    }
    
    public static f H()
    {
      return DEFAULT_INSTANCE;
    }
    
    public static a J()
    {
      return (a)DEFAULT_INSTANCE.s();
    }
    
    public final String I()
    {
      return fieldPath_;
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
        return new f();
      case 2: 
        return new f1(DEFAULT_INSTANCE, "\000\001\000\000\002\002\001\000\000\000\002Ȉ", new Object[] { "fieldPath_" });
      case 1: 
        return null;
      }
      return Byte.valueOf((byte)1);
    }
    
    public static final class a
      extends w.a<z.f, a>
      implements t0
    {
      public a()
      {
        super();
      }
    }
  }
  
  public static final class g
    extends w<g, a>
    implements t0
  {
    public static final int COMPOSITE_FILTER_FIELD_NUMBER = 1;
    private static final g DEFAULT_INSTANCE;
    public static final int FIELD_FILTER_FIELD_NUMBER = 2;
    private static volatile b1<g> PARSER;
    public static final int UNARY_FILTER_FIELD_NUMBER = 3;
    private int filterTypeCase_ = 0;
    private Object filterType_;
    
    static
    {
      g localg = new g();
      DEFAULT_INSTANCE = localg;
      w.D(g.class, localg);
    }
    
    public static void F(g paramg, z.e parame)
    {
      paramg.getClass();
      filterType_ = parame;
      filterTypeCase_ = 2;
    }
    
    public static void G(g paramg, z.j paramj)
    {
      paramg.getClass();
      filterType_ = paramj;
      filterTypeCase_ = 3;
    }
    
    public static void I(g paramg, z.c paramc)
    {
      paramg.getClass();
      filterType_ = paramc;
      filterTypeCase_ = 1;
    }
    
    public static g K()
    {
      return DEFAULT_INSTANCE;
    }
    
    public static a O()
    {
      return (a)DEFAULT_INSTANCE.s();
    }
    
    public final z.c J()
    {
      if (filterTypeCase_ == 1) {
        return (z.c)filterType_;
      }
      return z.c.I();
    }
    
    public final z.e L()
    {
      if (filterTypeCase_ == 2) {
        return (z.e)filterType_;
      }
      return z.e.J();
    }
    
    public final b M()
    {
      int i = filterTypeCase_;
      b localb;
      if (i != 0)
      {
        if (i != 1)
        {
          if (i != 2)
          {
            if (i != 3) {
              localb = null;
            } else {
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
        localb = b.d;
      }
      return localb;
    }
    
    public final z.j N()
    {
      if (filterTypeCase_ == 3) {
        return (z.j)filterType_;
      }
      return z.j.I();
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
        return new g();
      case 2: 
        return new f1(DEFAULT_INSTANCE, "\000\003\001\000\001\003\003\000\000\000\001<\000\002<\000\003<\000", new Object[] { "filterType_", "filterTypeCase_", z.c.class, z.e.class, z.j.class });
      case 1: 
        return null;
      }
      return Byte.valueOf((byte)1);
    }
    
    public static final class a
      extends w.a<z.g, a>
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
        b localb1 = new b("COMPOSITE_FILTER", 0);
        a = localb1;
        b localb2 = new b("FIELD_FILTER", 1);
        b = localb2;
        b localb3 = new b("UNARY_FILTER", 2);
        c = localb3;
        b localb4 = new b("FILTERTYPE_NOT_SET", 3);
        d = localb4;
        e = new b[] { localb1, localb2, localb3, localb4 };
      }
    }
  }
  
  public static final class h
    extends w<h, a>
    implements t0
  {
    private static final h DEFAULT_INSTANCE;
    public static final int DIRECTION_FIELD_NUMBER = 2;
    public static final int FIELD_FIELD_NUMBER = 1;
    private static volatile b1<h> PARSER;
    private int bitField0_;
    private int direction_;
    private z.f field_;
    
    static
    {
      h localh = new h();
      DEFAULT_INSTANCE = localh;
      w.D(h.class, localh);
    }
    
    public static void G(h paramh, z.f paramf)
    {
      paramh.getClass();
      field_ = paramf;
      bitField0_ |= 0x1;
    }
    
    public static void H(h paramh, z.d paramd)
    {
      paramh.getClass();
      direction_ = paramd.a();
    }
    
    public static a K()
    {
      return (a)DEFAULT_INSTANCE.s();
    }
    
    public final z.d I()
    {
      int i = direction_;
      z.d locald1;
      if (i != 0)
      {
        if (i != 1)
        {
          if (i != 2) {
            locald1 = null;
          } else {
            locald1 = z.d.d;
          }
        }
        else {
          locald1 = z.d.c;
        }
      }
      else {
        locald1 = z.d.b;
      }
      z.d locald2 = locald1;
      if (locald1 == null) {
        locald2 = z.d.e;
      }
      return locald2;
    }
    
    public final z.f J()
    {
      z.f localf1 = field_;
      z.f localf2 = localf1;
      if (localf1 == null) {
        localf2 = z.f.H();
      }
      return localf2;
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
        return new h();
      case 2: 
        return new f1(DEFAULT_INSTANCE, "\000\002\000\001\001\002\002\000\000\000\001ဉ\000\002\f", new Object[] { "bitField0_", "field_", "direction_" });
      case 1: 
        return null;
      }
      return Byte.valueOf((byte)1);
    }
    
    public static final class a
      extends w.a<z.h, a>
      implements t0
    {
      public a()
      {
        super();
      }
    }
  }
  
  public static final class i
    extends w<i, a>
    implements t0
  {
    private static final i DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 2;
    private static volatile b1<i> PARSER;
    private a0.d<z.f> fields_ = e1.d;
    
    static
    {
      i locali = new i();
      DEFAULT_INSTANCE = locali;
      w.D(i.class, locali);
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
        return new i();
      case 2: 
        return new f1(DEFAULT_INSTANCE, "\000\001\000\000\002\002\001\000\001\000\002\033", new Object[] { "fields_", z.f.class });
      case 1: 
        return null;
      }
      return Byte.valueOf((byte)1);
    }
    
    public static final class a
      extends w.a<z.i, a>
      implements t0
    {
      public a()
      {
        super();
      }
    }
  }
  
  public static final class j
    extends w<j, a>
    implements t0
  {
    private static final j DEFAULT_INSTANCE;
    public static final int FIELD_FIELD_NUMBER = 2;
    public static final int OP_FIELD_NUMBER = 1;
    private static volatile b1<j> PARSER;
    private int op_;
    private int operandTypeCase_ = 0;
    private Object operandType_;
    
    static
    {
      j localj = new j();
      DEFAULT_INSTANCE = localj;
      w.D(j.class, localj);
    }
    
    public static void G(j paramj, b paramb)
    {
      paramj.getClass();
      op_ = paramb.a();
    }
    
    public static void H(j paramj, z.f paramf)
    {
      paramj.getClass();
      operandType_ = paramf;
      operandTypeCase_ = 2;
    }
    
    public static j I()
    {
      return DEFAULT_INSTANCE;
    }
    
    public static a L()
    {
      return (a)DEFAULT_INSTANCE.s();
    }
    
    public final z.f J()
    {
      if (operandTypeCase_ == 2) {
        return (z.f)operandType_;
      }
      return z.f.H();
    }
    
    public final b K()
    {
      b localb1 = b.f(op_);
      b localb2 = localb1;
      if (localb1 == null) {
        localb2 = b.o;
      }
      return localb2;
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
        return new j();
      case 2: 
        return new f1(DEFAULT_INSTANCE, "\000\002\001\000\001\002\002\000\000\000\001\f\002<\000", new Object[] { "operandType_", "operandTypeCase_", "op_", z.f.class });
      case 1: 
        return null;
      }
      return Byte.valueOf((byte)1);
    }
    
    public static final class a
      extends w.a<z.j, a>
      implements t0
    {
      public a()
      {
        super();
      }
    }
    
    public static enum b
      implements a0.a
    {
      public final int a;
      
      static
      {
        b localb1 = new b("OPERATOR_UNSPECIFIED", 0, 0);
        b = localb1;
        b localb2 = new b("IS_NAN", 1, 2);
        c = localb2;
        b localb3 = new b("IS_NULL", 2, 3);
        d = localb3;
        b localb4 = new b("IS_NOT_NAN", 3, 4);
        e = localb4;
        b localb5 = new b("IS_NOT_NULL", 4, 5);
        f = localb5;
        b localb6 = new b("UNRECOGNIZED", 5, -1);
        o = localb6;
        p = new b[] { localb1, localb2, localb3, localb4, localb5, localb6 };
      }
      
      public b(int paramInt)
      {
        a = paramInt;
      }
      
      public static b f(int paramInt)
      {
        if (paramInt != 0)
        {
          if (paramInt != 2)
          {
            if (paramInt != 3)
            {
              if (paramInt != 4)
              {
                if (paramInt != 5) {
                  return null;
                }
                return f;
              }
              return e;
            }
            return d;
          }
          return c;
        }
        return b;
      }
      
      public final int a()
      {
        if (this != o) {
          return a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
      }
    }
  }
}

/* Location:
 * Qualified Name:     ka.z
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */