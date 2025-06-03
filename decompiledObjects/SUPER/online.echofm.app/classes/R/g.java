package R;

import androidx.datastore.preferences.protobuf.P;
import androidx.datastore.preferences.protobuf.X;
import androidx.datastore.preferences.protobuf.a;
import androidx.datastore.preferences.protobuf.w;
import androidx.datastore.preferences.protobuf.w.a;
import androidx.datastore.preferences.protobuf.w.b;
import androidx.datastore.preferences.protobuf.w.d;
import androidx.datastore.preferences.protobuf.y.b;
import java.util.List;

public final class g
  extends w
  implements P
{
  private static final g DEFAULT_INSTANCE;
  private static volatile X PARSER;
  public static final int STRINGS_FIELD_NUMBER = 1;
  private y.b strings_ = w.t();
  
  static
  {
    g localg = new g();
    DEFAULT_INSTANCE = localg;
    w.F(g.class, localg);
  }
  
  public static g L()
  {
    return DEFAULT_INSTANCE;
  }
  
  public static a N()
  {
    return (a)DEFAULT_INSTANCE.p();
  }
  
  public final void J(Iterable paramIterable)
  {
    K();
    a.e(paramIterable, strings_);
  }
  
  public final void K()
  {
    if (!strings_.p()) {
      strings_ = w.A(strings_);
    }
  }
  
  public List M()
  {
    return strings_;
  }
  
  public final Object s(w.d paramd, Object paramObject1, Object paramObject2)
  {
    switch (e.a[paramd.ordinal()])
    {
    default: 
      throw new UnsupportedOperationException();
    case 7: 
      return null;
    case 6: 
      return Byte.valueOf((byte)1);
    case 5: 
      paramObject1 = PARSER;
      paramd = (w.d)paramObject1;
      if (paramObject1 == null)
      {
        try
        {
          paramObject1 = PARSER;
          paramd = (w.d)paramObject1;
          if (paramObject1 == null)
          {
            paramd = new androidx/datastore/preferences/protobuf/w$b;
            paramd.<init>(DEFAULT_INSTANCE);
            PARSER = paramd;
          }
        }
        finally
        {
          break label118;
        }
        break label123;
        throw paramd;
      }
      return paramd;
    case 4: 
      return DEFAULT_INSTANCE;
    case 3: 
      return w.C(DEFAULT_INSTANCE, "\001\001\000\000\001\001\001\000\001\000\001\032", new Object[] { "strings_" });
    case 2: 
      label118:
      label123:
      return new a(null);
    }
    return new g();
  }
  
  public static final class a
    extends w.a
    implements P
  {
    public a()
    {
      super();
    }
    
    public a A(Iterable paramIterable)
    {
      v();
      g.I((g)p, paramIterable);
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     R.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */