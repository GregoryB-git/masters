package e7;

import android.os.BaseBundle;
import android.os.Bundle;
import b.z;
import b1.v;
import f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import p2.m0;

public final class x0
{
  public static final AtomicReference<String[]> b = new AtomicReference();
  public static final AtomicReference<String[]> c = new AtomicReference();
  public static final AtomicReference<String[]> d = new AtomicReference();
  public final v a;
  
  public x0(v paramv)
  {
    a = paramv;
  }
  
  public static String d(String paramString, String[] paramArrayOfString1, String[] paramArrayOfString2, AtomicReference<String[]> paramAtomicReference)
  {
    m6.j.i(paramAtomicReference);
    int i = paramArrayOfString1.length;
    int j = paramArrayOfString2.length;
    int k = 0;
    boolean bool;
    if (i == j) {
      bool = true;
    } else {
      bool = false;
    }
    m6.j.b(bool);
    while (k < paramArrayOfString1.length)
    {
      if (Objects.equals(paramString, paramArrayOfString1[k])) {
        try
        {
          Object localObject = (String[])paramAtomicReference.get();
          paramString = (String)localObject;
          if (localObject == null)
          {
            paramString = new String[paramArrayOfString2.length];
            paramAtomicReference.set(paramString);
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
        }
        finally {}
      }
      k++;
    }
    return paramString;
  }
  
  public final String a(Bundle paramBundle)
  {
    if (paramBundle == null) {
      return null;
    }
    if (!a.m()) {
      return paramBundle.toString();
    }
    StringBuilder localStringBuilder = f.l("Bundle[{");
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
  
  public final String b(f0 paramf0)
  {
    if (!a.m()) {
      return paramf0.toString();
    }
    StringBuilder localStringBuilder = f.l("origin=");
    localStringBuilder.append(c);
    localStringBuilder.append(",name=");
    localStringBuilder.append(c(a));
    localStringBuilder.append(",params=");
    paramf0 = b;
    if (paramf0 == null) {
      paramf0 = null;
    } else if (!a.m()) {
      paramf0 = paramf0.toString();
    } else {
      paramf0 = a(paramf0.E());
    }
    localStringBuilder.append(paramf0);
    return localStringBuilder.toString();
  }
  
  public final String c(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    if (!a.m()) {
      return paramString;
    }
    return d(paramString, b.a0.d, b.a0.b, b);
  }
  
  public final String e(Object[] paramArrayOfObject)
  {
    if (paramArrayOfObject == null) {
      return "[]";
    }
    StringBuilder localStringBuilder = f.l("[");
    int i = paramArrayOfObject.length;
    for (int j = 0; j < i; j++)
    {
      Object localObject = paramArrayOfObject[j];
      if ((localObject instanceof Bundle)) {
        localObject = a((Bundle)localObject);
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
    if (!a.m()) {
      return paramString;
    }
    return d(paramString, z.b, z.a, c);
  }
  
  public final String g(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    if (!a.m()) {
      return paramString;
    }
    if (paramString.startsWith("_exp_")) {
      return a0.j.k("experiment_id", "(", paramString, ")");
    }
    return d(paramString, m0.b, m0.a, d);
  }
}

/* Location:
 * Qualified Name:     e7.x0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */