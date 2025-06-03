package R2;

import A2.n;
import android.os.BaseBundle;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

public final class X1
{
  public static final AtomicReference b = new AtomicReference();
  public static final AtomicReference c = new AtomicReference();
  public static final AtomicReference d = new AtomicReference();
  public final W1 a;
  
  public X1(W1 paramW1)
  {
    a = paramW1;
  }
  
  public static String d(String paramString, String[] paramArrayOfString1, String[] paramArrayOfString2, AtomicReference paramAtomicReference)
  {
    n.i(paramArrayOfString1);
    n.i(paramArrayOfString2);
    n.i(paramAtomicReference);
    int i = paramArrayOfString1.length;
    int j = paramArrayOfString2.length;
    int k = 0;
    boolean bool;
    if (i == j) {
      bool = true;
    } else {
      bool = false;
    }
    n.a(bool);
    while (k < paramArrayOfString1.length)
    {
      Object localObject = paramArrayOfString1[k];
      if ((paramString != localObject) && ((paramString == null) || (!paramString.equals(localObject))))
      {
        k++;
      }
      else
      {
        try
        {
          localObject = (String[])paramAtomicReference.get();
          paramString = (String)localObject;
          if (localObject == null)
          {
            paramString = new String[paramArrayOfString2.length];
            paramAtomicReference.set(paramString);
          }
        }
        finally
        {
          break label196;
        }
        if (paramString[k] == null)
        {
          localObject = new java/lang/StringBuilder;
          ((StringBuilder)localObject).<init>();
          ((StringBuilder)localObject).append(paramArrayOfString2[k]);
          ((StringBuilder)localObject).append("(");
          ((StringBuilder)localObject).append(paramArrayOfString1[k]);
          ((StringBuilder)localObject).append(")");
          paramString[k] = ((StringBuilder)localObject).toString();
        }
        paramString = paramString[k];
        return paramString;
        label196:
        throw paramString;
      }
    }
    return paramString;
  }
  
  public final String a(I paramI)
  {
    Object localObject = null;
    if (paramI == null) {
      return null;
    }
    if (!a.a()) {
      return paramI.toString();
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("origin=");
    localStringBuilder.append(q);
    localStringBuilder.append(",name=");
    localStringBuilder.append(c(o));
    localStringBuilder.append(",params=");
    paramI = p;
    if (paramI == null) {
      paramI = (I)localObject;
    } else if (!a.a()) {
      paramI = paramI.toString();
    } else {
      paramI = b(paramI.g());
    }
    localStringBuilder.append(paramI);
    return localStringBuilder.toString();
  }
  
  public final String b(Bundle paramBundle)
  {
    if (paramBundle == null) {
      return null;
    }
    if (!a.a()) {
      return paramBundle.toString();
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Bundle[{");
    Iterator localIterator = paramBundle.keySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (String)localIterator.next();
      if (localStringBuilder.length() != 8) {
        localStringBuilder.append(", ");
      }
      localStringBuilder.append(f((String)localObject));
      localStringBuilder.append("=");
      localObject = paramBundle.get((String)localObject);
      if ((localObject instanceof Bundle)) {
        localObject = e(new Object[] { localObject });
      } else if ((localObject instanceof Object[])) {
        localObject = e((Object[])localObject);
      } else if ((localObject instanceof ArrayList)) {
        localObject = e(((ArrayList)localObject).toArray());
      } else {
        localObject = String.valueOf(localObject);
      }
      localStringBuilder.append((String)localObject);
    }
    localStringBuilder.append("}]");
    return localStringBuilder.toString();
  }
  
  public final String c(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    if (!a.a()) {
      return paramString;
    }
    return d(paramString, r3.c, r3.a, b);
  }
  
  public final String e(Object[] paramArrayOfObject)
  {
    if (paramArrayOfObject == null) {
      return "[]";
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("[");
    int i = paramArrayOfObject.length;
    for (int j = 0; j < i; j++)
    {
      Object localObject = paramArrayOfObject[j];
      if ((localObject instanceof Bundle)) {
        localObject = b((Bundle)localObject);
      } else {
        localObject = String.valueOf(localObject);
      }
      if (localObject != null)
      {
        if (localStringBuilder.length() != 1) {
          localStringBuilder.append(", ");
        }
        localStringBuilder.append((String)localObject);
      }
    }
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
  
  public final String f(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    if (!a.a()) {
      return paramString;
    }
    return d(paramString, t3.b, t3.a, c);
  }
  
  public final String g(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    if (!a.a()) {
      return paramString;
    }
    if (paramString.startsWith("_exp_"))
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("experiment_id");
      localStringBuilder.append("(");
      localStringBuilder.append(paramString);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
    return d(paramString, s3.b, s3.a, d);
  }
}

/* Location:
 * Qualified Name:     R2.X1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */