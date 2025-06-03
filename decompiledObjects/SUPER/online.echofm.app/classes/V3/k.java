package V3;

import Q3.d;
import Y3.m;
import d4.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class k
  implements Iterable, Comparable
{
  public static final k r = new k("");
  public final b[] o;
  public final int p;
  public final int q;
  
  public k(String paramString)
  {
    paramString = paramString.split("/", -1);
    int i = paramString.length;
    int j = 0;
    int m;
    for (int k = j; j < i; k = m)
    {
      m = k;
      if (paramString[j].length() > 0) {
        m = k + 1;
      }
      j++;
    }
    o = new b[k];
    i = paramString.length;
    j = 0;
    for (k = j; j < i; k = m)
    {
      String str = paramString[j];
      m = k;
      if (str.length() > 0)
      {
        o[k] = b.j(str);
        m = k + 1;
      }
      j++;
    }
    p = 0;
    q = o.length;
  }
  
  public k(List paramList)
  {
    o = new b[paramList.size()];
    Iterator localIterator = paramList.iterator();
    for (int i = 0; localIterator.hasNext(); i++)
    {
      String str = (String)localIterator.next();
      o[i] = b.j(str);
    }
    p = 0;
    q = paramList.size();
  }
  
  public k(b... paramVarArgs)
  {
    o = ((b[])Arrays.copyOf(paramVarArgs, paramVarArgs.length));
    p = 0;
    q = paramVarArgs.length;
    int i = paramVarArgs.length;
    for (int j = 0; j < i; j++)
    {
      boolean bool;
      if (paramVarArgs[j] != null) {
        bool = true;
      } else {
        bool = false;
      }
      m.g(bool, "Can't construct a path with a null value!");
    }
  }
  
  public k(b[] paramArrayOfb, int paramInt1, int paramInt2)
  {
    o = paramArrayOfb;
    p = paramInt1;
    q = paramInt2;
  }
  
  public static k Y()
  {
    return r;
  }
  
  public static k b0(k paramk1, k paramk2)
  {
    Object localObject = paramk1.Z();
    b localb = paramk2.Z();
    if (localObject == null) {
      return paramk2;
    }
    if (((b)localObject).equals(localb)) {
      return b0(paramk1.c0(), paramk2.c0());
    }
    localObject = new StringBuilder();
    ((StringBuilder)localObject).append("INTERNAL ERROR: ");
    ((StringBuilder)localObject).append(paramk2);
    ((StringBuilder)localObject).append(" is not contained in ");
    ((StringBuilder)localObject).append(paramk1);
    throw new d(((StringBuilder)localObject).toString());
  }
  
  public List S()
  {
    ArrayList localArrayList = new ArrayList(size());
    Iterator localIterator = iterator();
    while (localIterator.hasNext()) {
      localArrayList.add(((b)localIterator.next()).e());
    }
    return localArrayList;
  }
  
  public k T(k paramk)
  {
    int i = size() + paramk.size();
    b[] arrayOfb = new b[i];
    System.arraycopy(o, p, arrayOfb, 0, size());
    System.arraycopy(o, p, arrayOfb, size(), paramk.size());
    return new k(arrayOfb, 0, i);
  }
  
  public k U(b paramb)
  {
    int i = size();
    int j = i + 1;
    b[] arrayOfb = new b[j];
    System.arraycopy(o, p, arrayOfb, 0, i);
    arrayOfb[i] = paramb;
    return new k(arrayOfb, 0, j);
  }
  
  public int V(k paramk)
  {
    int i = p;
    int k;
    for (int j = p;; j++)
    {
      k = q;
      if ((i >= k) || (j >= q)) {
        break;
      }
      k = o[i].h(o[j]);
      if (k != 0) {
        return k;
      }
      i++;
    }
    if ((i == k) && (j == q)) {
      return 0;
    }
    if (i == k) {
      return -1;
    }
    return 1;
  }
  
  public boolean W(k paramk)
  {
    if (size() > paramk.size()) {
      return false;
    }
    int i = p;
    for (int j = p; i < q; j++)
    {
      if (!o[i].equals(o[j])) {
        return false;
      }
      i++;
    }
    return true;
  }
  
  public b X()
  {
    if (!isEmpty()) {
      return o[(q - 1)];
    }
    return null;
  }
  
  public b Z()
  {
    if (isEmpty()) {
      return null;
    }
    return o[p];
  }
  
  public k a0()
  {
    if (isEmpty()) {
      return null;
    }
    return new k(o, p, q - 1);
  }
  
  public k c0()
  {
    int i = p;
    int j = i;
    if (!isEmpty()) {
      j = i + 1;
    }
    return new k(o, j, q);
  }
  
  public String d0()
  {
    if (isEmpty()) {
      return "/";
    }
    StringBuilder localStringBuilder = new StringBuilder();
    for (int i = p; i < q; i++)
    {
      if (i > p) {
        localStringBuilder.append("/");
      }
      localStringBuilder.append(o[i].e());
    }
    return localStringBuilder.toString();
  }
  
  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof k)) {
      return false;
    }
    if (this == paramObject) {
      return true;
    }
    paramObject = (k)paramObject;
    if (size() != ((k)paramObject).size()) {
      return false;
    }
    int i = p;
    for (int j = p; (i < q) && (j < q); j++)
    {
      if (!o[i].equals(o[j])) {
        return false;
      }
      i++;
    }
    return true;
  }
  
  public int hashCode()
  {
    int i = p;
    int j = 0;
    while (i < q)
    {
      j = j * 37 + o[i].hashCode();
      i++;
    }
    return j;
  }
  
  public boolean isEmpty()
  {
    boolean bool;
    if (p >= q) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public Iterator iterator()
  {
    return new a();
  }
  
  public int size()
  {
    return q - p;
  }
  
  public String toString()
  {
    if (isEmpty()) {
      return "/";
    }
    StringBuilder localStringBuilder = new StringBuilder();
    for (int i = p; i < q; i++)
    {
      localStringBuilder.append("/");
      localStringBuilder.append(o[i].e());
    }
    return localStringBuilder.toString();
  }
  
  public class a
    implements Iterator
  {
    public int o = k.s(k.this);
    
    public a() {}
    
    public b b()
    {
      if (hasNext())
      {
        Object localObject = k.M(k.this);
        int i = o;
        localObject = localObject[i];
        o = (i + 1);
        return (b)localObject;
      }
      throw new NoSuchElementException("No more elements.");
    }
    
    public boolean hasNext()
    {
      boolean bool;
      if (o < k.D(k.this)) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public void remove()
    {
      throw new UnsupportedOperationException("Can't remove component from immutable Path!");
    }
  }
}

/* Location:
 * Qualified Name:     V3.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */