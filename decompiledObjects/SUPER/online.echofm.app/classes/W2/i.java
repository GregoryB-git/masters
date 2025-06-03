package W2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

public abstract class i
{
  public static b a(Object paramObject)
  {
    return new b(paramObject.getClass().getSimpleName(), null);
  }
  
  public static final class b
  {
    public final String a;
    public final a b;
    public a c;
    public boolean d;
    public boolean e;
    
    public b(String paramString)
    {
      a locala = new a();
      b = locala;
      c = locala;
      d = false;
      e = false;
      a = ((String)m.j(paramString));
    }
    
    public static boolean d(Object paramObject)
    {
      boolean bool1 = paramObject instanceof CharSequence;
      boolean bool2 = false;
      boolean bool3 = false;
      if (bool1)
      {
        if (((CharSequence)paramObject).length() == 0) {
          bool3 = true;
        }
        return bool3;
      }
      if ((paramObject instanceof Collection)) {
        return ((Collection)paramObject).isEmpty();
      }
      if ((paramObject instanceof Map)) {
        return ((Map)paramObject).isEmpty();
      }
      if ((paramObject instanceof l)) {
        return ((l)paramObject).c() ^ true;
      }
      bool3 = bool2;
      if (paramObject.getClass().isArray())
      {
        bool3 = bool2;
        if (Array.getLength(paramObject) == 0) {
          bool3 = true;
        }
      }
      return bool3;
    }
    
    public final a a()
    {
      a locala = new a();
      c.c = locala;
      c = locala;
      return locala;
    }
    
    public final b b(Object paramObject)
    {
      ab = paramObject;
      return this;
    }
    
    public b c(Object paramObject)
    {
      return b(paramObject);
    }
    
    public String toString()
    {
      boolean bool1 = d;
      boolean bool2 = e;
      StringBuilder localStringBuilder = new StringBuilder(32);
      localStringBuilder.append(a);
      localStringBuilder.append('{');
      a locala = b.c;
      Object localObject3;
      for (Object localObject1 = ""; locala != null; localObject1 = localObject3)
      {
        Object localObject2 = b;
        if (localObject2 == null)
        {
          localObject3 = localObject1;
          if (bool1) {
            break label185;
          }
        }
        else if (bool2)
        {
          localObject3 = localObject1;
          if (d(localObject2)) {
            break label185;
          }
        }
        localStringBuilder.append((String)localObject1);
        localObject1 = a;
        if (localObject1 != null)
        {
          localStringBuilder.append((String)localObject1);
          localStringBuilder.append('=');
        }
        if ((localObject2 != null) && (localObject2.getClass().isArray()))
        {
          localObject1 = Arrays.deepToString(new Object[] { localObject2 });
          localStringBuilder.append((CharSequence)localObject1, 1, ((String)localObject1).length() - 1);
        }
        else
        {
          localStringBuilder.append(localObject2);
        }
        localObject3 = ", ";
        label185:
        locala = c;
      }
      localStringBuilder.append('}');
      return localStringBuilder.toString();
    }
    
    public static class a
    {
      public String a;
      public Object b;
      public a c;
    }
  }
}

/* Location:
 * Qualified Name:     W2.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */