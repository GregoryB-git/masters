package X2;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

public class z
  extends x
  implements H
{
  private static final long serialVersionUID = 0L;
  public final transient y t;
  
  public z(w paramw, int paramInt, Comparator paramComparator)
  {
    super(paramw, paramInt);
    t = l(paramComparator);
  }
  
  public static y l(Comparator paramComparator)
  {
    if (paramComparator == null) {
      paramComparator = y.X();
    } else {
      paramComparator = A.j0(paramComparator);
    }
    return paramComparator;
  }
  
  public static z m(Collection paramCollection, Comparator paramComparator)
  {
    if (paramCollection.isEmpty()) {
      return n();
    }
    w.a locala = new w.a(paramCollection.size());
    Iterator localIterator = paramCollection.iterator();
    int i = 0;
    while (localIterator.hasNext())
    {
      Object localObject = (Map.Entry)localIterator.next();
      paramCollection = ((Map.Entry)localObject).getKey();
      localObject = p(paramComparator, (Collection)((Map.Entry)localObject).getValue());
      if (!((AbstractCollection)localObject).isEmpty())
      {
        locala.f(paramCollection, localObject);
        i += ((AbstractCollection)localObject).size();
      }
    }
    return new z(locala.c(), i, paramComparator);
  }
  
  public static z n()
  {
    return p.u;
  }
  
  public static y p(Comparator paramComparator, Collection paramCollection)
  {
    if (paramComparator == null) {
      paramComparator = y.T(paramCollection);
    } else {
      paramComparator = A.g0(paramComparator, paramCollection);
    }
    return paramComparator;
  }
  
  public static y.a q(Comparator paramComparator)
  {
    if (paramComparator == null) {
      paramComparator = new y.a();
    } else {
      paramComparator = new A.a(paramComparator);
    }
    return paramComparator;
  }
  
  private void readObject(ObjectInputStream paramObjectInputStream)
  {
    paramObjectInputStream.defaultReadObject();
    Comparator localComparator = (Comparator)paramObjectInputStream.readObject();
    int i = paramObjectInputStream.readInt();
    if (i >= 0)
    {
      w.a locala = w.a();
      int j = 0;
      int k = j;
      while (j < i)
      {
        Object localObject1 = paramObjectInputStream.readObject();
        Objects.requireNonNull(localObject1);
        int m = paramObjectInputStream.readInt();
        if (m > 0)
        {
          Object localObject2 = q(localComparator);
          for (int n = 0; n < m; n++)
          {
            Object localObject3 = paramObjectInputStream.readObject();
            Objects.requireNonNull(localObject3);
            ((y.a)localObject2).h(localObject3);
          }
          localObject2 = ((y.a)localObject2).l();
          if (((AbstractCollection)localObject2).size() == m)
          {
            locala.f(localObject1, localObject2);
            k += m;
            j++;
          }
          else
          {
            paramObjectInputStream = new StringBuilder();
            paramObjectInputStream.append("Duplicate key-value pairs exist for key ");
            paramObjectInputStream.append(localObject1);
            throw new InvalidObjectException(paramObjectInputStream.toString());
          }
        }
        else
        {
          paramObjectInputStream = new StringBuilder();
          paramObjectInputStream.append("Invalid value count ");
          paramObjectInputStream.append(m);
          throw new InvalidObjectException(paramObjectInputStream.toString());
        }
      }
      try
      {
        paramObjectInputStream = locala.c();
        x.c.a.b(this, paramObjectInputStream);
        x.c.b.a(this, k);
        b.a.b(this, l(localComparator));
        return;
      }
      catch (IllegalArgumentException paramObjectInputStream)
      {
        throw ((InvalidObjectException)new InvalidObjectException(paramObjectInputStream.getMessage()).initCause(paramObjectInputStream));
      }
    }
    paramObjectInputStream = new StringBuilder();
    paramObjectInputStream.append("Invalid key count ");
    paramObjectInputStream.append(i);
    throw new InvalidObjectException(paramObjectInputStream.toString());
  }
  
  private void writeObject(ObjectOutputStream paramObjectOutputStream)
  {
    paramObjectOutputStream.defaultWriteObject();
    paramObjectOutputStream.writeObject(o());
    Y.b(this, paramObjectOutputStream);
  }
  
  public Comparator o()
  {
    Object localObject = t;
    if ((localObject instanceof A)) {
      localObject = ((A)localObject).comparator();
    } else {
      localObject = null;
    }
    return (Comparator)localObject;
  }
  
  public static final class a
    extends x.b
  {
    public z a()
    {
      Set localSet = a.entrySet();
      Comparator localComparator = b;
      Object localObject = localSet;
      if (localComparator != null) {
        localObject = P.b(localComparator).e().c(localSet);
      }
      return z.m((Collection)localObject, c);
    }
  }
  
  public static final abstract class b
  {
    public static final Y.b a = Y.a(z.class, "emptySet");
  }
}

/* Location:
 * Qualified Name:     X2.z
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */