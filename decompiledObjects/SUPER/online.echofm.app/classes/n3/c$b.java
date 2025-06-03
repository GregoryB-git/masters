package n3;

import c3.k;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public final class c$b
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

/* Location:
 * Qualified Name:     n3.c.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */