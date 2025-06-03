package c3;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public abstract class s
{
  public static final CopyOnWriteArrayList a = new CopyOnWriteArrayList();
  
  public static r a(String paramString)
  {
    Iterator localIterator = a.iterator();
    while (localIterator.hasNext())
    {
      localObject = (r)localIterator.next();
      if (((r)localObject).b(paramString)) {
        return (r)localObject;
      }
    }
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("No KMS client does support: ");
    ((StringBuilder)localObject).append(paramString);
    throw new GeneralSecurityException(((StringBuilder)localObject).toString());
  }
}

/* Location:
 * Qualified Name:     c3.s
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */