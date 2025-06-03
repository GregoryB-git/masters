package n7;

import java.util.Arrays;

public final class g
{
  public static a a(Class<?> paramClass)
  {
    return new a(paramClass.getSimpleName());
  }
  
  public static a b(Object paramObject)
  {
    return new a(paramObject.getClass().getSimpleName());
  }
  
  public static final class a
  {
    public final String a;
    public final b b;
    public b c;
    public boolean d;
    
    public a(String paramString)
    {
      b localb = new b();
      b = localb;
      c = localb;
      d = false;
      a = paramString;
    }
    
    public final void a(Object paramObject, String paramString)
    {
      b localb = new b();
      c.c = localb;
      c = localb;
      b = paramObject;
      a = paramString;
    }
    
    public final void b(String paramString, long paramLong)
    {
      d(String.valueOf(paramLong), paramString);
    }
    
    public final void c(String paramString, boolean paramBoolean)
    {
      d(String.valueOf(paramBoolean), paramString);
    }
    
    public final void d(String paramString1, String paramString2)
    {
      a locala = new a();
      c.c = locala;
      c = locala;
      b = paramString1;
      a = paramString2;
    }
    
    public final String toString()
    {
      boolean bool = d;
      StringBuilder localStringBuilder = new StringBuilder(32);
      localStringBuilder.append(a);
      localStringBuilder.append('{');
      b localb = b.c;
      Object localObject3;
      for (Object localObject1 = ""; localb != null; localObject1 = localObject3)
      {
        Object localObject2 = b;
        if ((!(localb instanceof a)) && (localObject2 == null))
        {
          localObject3 = localObject1;
          if (bool) {}
        }
        else
        {
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
        }
        localb = c;
      }
      localStringBuilder.append('}');
      return localStringBuilder.toString();
    }
    
    public static final class a
      extends g.a.b
    {}
    
    public static class b
    {
      public String a;
      public Object b;
      public b c;
    }
  }
}

/* Location:
 * Qualified Name:     n7.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */