package R;

import androidx.datastore.preferences.protobuf.H;
import androidx.datastore.preferences.protobuf.I;
import androidx.datastore.preferences.protobuf.P;
import androidx.datastore.preferences.protobuf.X;
import androidx.datastore.preferences.protobuf.r0.b;
import androidx.datastore.preferences.protobuf.w;
import androidx.datastore.preferences.protobuf.w.a;
import androidx.datastore.preferences.protobuf.w.b;
import androidx.datastore.preferences.protobuf.w.d;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;

public final class f
  extends w
  implements P
{
  private static final f DEFAULT_INSTANCE;
  private static volatile X PARSER;
  public static final int PREFERENCES_FIELD_NUMBER = 1;
  private I preferences_ = I.f();
  
  static
  {
    f localf = new f();
    DEFAULT_INSTANCE = localf;
    w.F(f.class, localf);
  }
  
  public static a N()
  {
    return (a)DEFAULT_INSTANCE.p();
  }
  
  public static f O(InputStream paramInputStream)
  {
    return (f)w.D(DEFAULT_INSTANCE, paramInputStream);
  }
  
  public final Map J()
  {
    return L();
  }
  
  public Map K()
  {
    return Collections.unmodifiableMap(M());
  }
  
  public final I L()
  {
    if (!preferences_.n()) {
      preferences_ = preferences_.s();
    }
    return preferences_;
  }
  
  public final I M()
  {
    return preferences_;
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
      paramd = b.a;
      return w.C(DEFAULT_INSTANCE, "\001\001\000\000\001\001\001\001\000\000\0012", new Object[] { "preferences_", paramd });
    case 2: 
      label118:
      label123:
      return new a(null);
    }
    return new f();
  }
  
  public static final class a
    extends w.a
    implements P
  {
    public a()
    {
      super();
    }
    
    public a A(String paramString, h paramh)
    {
      paramString.getClass();
      paramh.getClass();
      v();
      f.I((f)p).put(paramString, paramh);
      return this;
    }
  }
  
  public static final abstract class b
  {
    public static final H a = H.d(r0.b.y, "", r0.b.A, h.Q());
  }
}

/* Location:
 * Qualified Name:     R.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */