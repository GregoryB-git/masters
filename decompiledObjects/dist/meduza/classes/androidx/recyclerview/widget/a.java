package androidx.recyclerview.widget;

import d0.c;
import java.util.ArrayList;

public final class a
  implements g.a
{
  public c a = new c(30);
  public final ArrayList<a> b = new ArrayList();
  public final ArrayList<a> c = new ArrayList();
  
  public a(l paraml)
  {
    new g(this);
  }
  
  public final int a(int paramInt1, int paramInt2)
  {
    int i = c.size();
    while (paramInt2 < i)
    {
      a locala = (a)c.get(paramInt2);
      locala.getClass();
      locala.getClass();
      paramInt2++;
    }
    return paramInt1;
  }
  
  public final void b(ArrayList paramArrayList)
  {
    int i = paramArrayList.size();
    for (int j = 0; j < i; j++)
    {
      a locala = (a)paramArrayList.get(j);
      a = null;
      a.c(locala);
    }
    paramArrayList.clear();
  }
  
  public static final class a
  {
    public Object a;
    
    public final boolean equals(Object paramObject)
    {
      if (this == paramObject) {
        return true;
      }
      if (!(paramObject instanceof a)) {
        return false;
      }
      Object localObject = (a)paramObject;
      localObject.getClass();
      localObject.getClass();
      localObject.getClass();
      paramObject = a;
      localObject = a;
      if (paramObject != null)
      {
        if (!paramObject.equals(localObject)) {
          return false;
        }
      }
      else if (localObject != null) {
        return false;
      }
      return true;
    }
    
    public final int hashCode()
    {
      return (0 * 31 + 0) * 31 + 0;
    }
    
    public final String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
      localStringBuilder.append("[");
      localStringBuilder.append("??");
      localStringBuilder.append(",s:");
      localStringBuilder.append(0);
      localStringBuilder.append("c:");
      localStringBuilder.append(0);
      localStringBuilder.append(",p:");
      localStringBuilder.append(a);
      localStringBuilder.append("]");
      return localStringBuilder.toString();
    }
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */