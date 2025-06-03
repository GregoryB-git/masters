package com.google.firebase.firestore;

import d9.n;
import f;
import java.util.Objects;

public abstract class a
{
  public final n a;
  public final String b;
  public final String c;
  
  public a(n paramn, String paramString)
  {
    a = paramn;
    b = paramString;
    paramString = f.l(paramString);
    if (paramn == null)
    {
      paramn = "";
    }
    else
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("_");
      localStringBuilder.append(paramn);
      paramn = localStringBuilder.toString();
    }
    paramString.append(paramn);
    c = paramString.toString();
  }
  
  public final String a()
  {
    Object localObject = a;
    if (localObject == null) {
      localObject = "";
    } else {
      localObject = ((n)localObject).toString();
    }
    return (String)localObject;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    boolean bool2 = true;
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof a)) {
      return false;
    }
    paramObject = (a)paramObject;
    n localn = a;
    if ((localn != null) && (a != null))
    {
      if ((!b.equals(b)) || (!a().equals(((a)paramObject).a()))) {
        bool2 = false;
      }
      return bool2;
    }
    if ((localn == null) && (a == null)) {
      bool2 = bool1;
    } else {
      bool2 = false;
    }
    return bool2;
  }
  
  public final int hashCode()
  {
    return Objects.hash(new Object[] { b, a() });
  }
  
  public static final class a
    extends a
  {
    public a(n paramn)
    {
      super("average");
    }
  }
  
  public static final class b
    extends a
  {
    public b()
    {
      super("count");
    }
  }
  
  public static final class c
    extends a
  {
    public c(n paramn)
    {
      super("sum");
    }
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.firestore.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */