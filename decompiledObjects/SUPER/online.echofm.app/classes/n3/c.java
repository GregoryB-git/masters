package n3;

import c3.k;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public final class c
{
  public final a a;
  public final List b;
  public final Integer c;
  
  public c(a parama, List paramList, Integer paramInteger)
  {
    a = parama;
    b = paramList;
    c = paramInteger;
  }
  
  public static b a()
  {
    return new b();
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof c;
    boolean bool2 = false;
    if (!bool1) {
      return false;
    }
    paramObject = (c)paramObject;
    bool1 = bool2;
    if (a.equals(a))
    {
      bool1 = bool2;
      if (b.equals(b))
      {
        bool1 = bool2;
        if (Objects.equals(c, c)) {
          bool1 = true;
        }
      }
    }
    return bool1;
  }
  
  public int hashCode()
  {
    return Objects.hash(new Object[] { a, b });
  }
  
  public String toString()
  {
    return String.format("(annotations=%s, entries=%s, primaryKeyId=%s)", new Object[] { a, b, c });
  }
  
  public static final class b
  {
    public ArrayList a = new ArrayList();
    public a b = a.b;
    public Integer c = null;
    
    public b a(k paramk, int paramInt, String paramString1, String paramString2)
    {
      ArrayList localArrayList = a;
      if (localArrayList != null)
      {
        localArrayList.add(new c.c(paramk, paramInt, paramString1, paramString2, null));
        return this;
      }
      throw new IllegalStateException("addEntry cannot be called after build()");
    }
    
    public c b()
    {
      if (a != null)
      {
        Object localObject = c;
        if ((localObject != null) && (!c(((Integer)localObject).intValue()))) {
          throw new GeneralSecurityException("primary key ID is not present in entries");
        }
        localObject = new c(b, Collections.unmodifiableList(a), c, null);
        a = null;
        return (c)localObject;
      }
      throw new IllegalStateException("cannot call build() twice");
    }
    
    public final boolean c(int paramInt)
    {
      Iterator localIterator = a.iterator();
      while (localIterator.hasNext()) {
        if (((c.c)localIterator.next()).a() == paramInt) {
          return true;
        }
      }
      return false;
    }
    
    public b d(a parama)
    {
      if (a != null)
      {
        b = parama;
        return this;
      }
      throw new IllegalStateException("setAnnotations cannot be called after build()");
    }
    
    public b e(int paramInt)
    {
      if (a != null)
      {
        c = Integer.valueOf(paramInt);
        return this;
      }
      throw new IllegalStateException("setPrimaryKeyId cannot be called after build()");
    }
  }
  
  public static final class c
  {
    public final k a;
    public final int b;
    public final String c;
    public final String d;
    
    public c(k paramk, int paramInt, String paramString1, String paramString2)
    {
      a = paramk;
      b = paramInt;
      c = paramString1;
      d = paramString2;
    }
    
    public int a()
    {
      return b;
    }
    
    public boolean equals(Object paramObject)
    {
      boolean bool1 = paramObject instanceof c;
      boolean bool2 = false;
      if (!bool1) {
        return false;
      }
      paramObject = (c)paramObject;
      bool1 = bool2;
      if (a == a)
      {
        bool1 = bool2;
        if (b == b)
        {
          bool1 = bool2;
          if (c.equals(c))
          {
            bool1 = bool2;
            if (d.equals(d)) {
              bool1 = true;
            }
          }
        }
      }
      return bool1;
    }
    
    public int hashCode()
    {
      return Objects.hash(new Object[] { a, Integer.valueOf(b), c, d });
    }
    
    public String toString()
    {
      return String.format("(status=%s, keyId=%s, keyType='%s', keyPrefix='%s')", new Object[] { a, Integer.valueOf(b), c, d });
    }
  }
}

/* Location:
 * Qualified Name:     n3.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */