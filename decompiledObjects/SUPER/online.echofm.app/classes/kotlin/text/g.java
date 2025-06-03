package kotlin.text;

import W5.a;
import W5.m;
import java.util.Iterator;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import kotlin.jvm.internal.Intrinsics;
import n6.b;

public final class g
  implements f
{
  public final Matcher a;
  public final CharSequence b;
  public final e c;
  
  public g(Matcher paramMatcher, CharSequence paramCharSequence)
  {
    a = paramMatcher;
    b = paramCharSequence;
    c = new a(this);
  }
  
  public e a()
  {
    return c;
  }
  
  public final MatchResult c()
  {
    return a;
  }
  
  public static final class a
    extends a
    implements e
  {
    public a(g paramg) {}
    
    public int a()
    {
      return g.b(o).groupCount() + 1;
    }
    
    public d get(int paramInt)
    {
      l6.c localc = h.b(g.b(o), paramInt);
      Object localObject;
      if (localc.q().intValue() >= 0)
      {
        localObject = g.b(o).group(paramInt);
        Intrinsics.checkNotNullExpressionValue(localObject, "group(...)");
        localObject = new d((String)localObject, localc);
      }
      else
      {
        localObject = null;
      }
      return (d)localObject;
    }
    
    public boolean isEmpty()
    {
      return false;
    }
    
    public Iterator iterator()
    {
      return n6.c.d(m.n(m.g(this)), new a(this)).iterator();
    }
    
    public static final class a
      extends kotlin.jvm.internal.l
      implements g6.l
    {
      public a(g.a parama)
      {
        super();
      }
      
      public final d a(int paramInt)
      {
        return o.get(paramInt);
      }
    }
  }
}

/* Location:
 * Qualified Name:     kotlin.text.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */