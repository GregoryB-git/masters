package M4;

import F4.a;
import android.os.BaseBundle;
import android.os.Bundle;

public final class f
{
  public static final a b = ;
  public final Bundle a;
  
  public f()
  {
    this(new Bundle());
  }
  
  public f(Bundle paramBundle)
  {
    a = ((Bundle)paramBundle.clone());
  }
  
  public boolean a(String paramString)
  {
    boolean bool;
    if ((paramString != null) && (a.containsKey(paramString))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public g b(String paramString)
  {
    if (!a(paramString)) {
      return g.a();
    }
    try
    {
      g localg = g.b((Boolean)a.get(paramString));
      return localg;
    }
    catch (ClassCastException localClassCastException)
    {
      b.b("Metadata key %s contains type other than boolean: %s", new Object[] { paramString, localClassCastException.getMessage() });
    }
    return g.a();
  }
  
  public g c(String paramString)
  {
    if (!a(paramString)) {
      return g.a();
    }
    Object localObject = a.get(paramString);
    if (localObject == null) {
      return g.a();
    }
    if ((localObject instanceof Float)) {
      return g.e(Double.valueOf(((Float)localObject).doubleValue()));
    }
    if ((localObject instanceof Double)) {
      return g.e((Double)localObject);
    }
    b.b("Metadata key %s contains type other than double: %s", new Object[] { paramString });
    return g.a();
  }
  
  public final g d(String paramString)
  {
    if (!a(paramString)) {
      return g.a();
    }
    try
    {
      g localg = g.b((Integer)a.get(paramString));
      return localg;
    }
    catch (ClassCastException localClassCastException)
    {
      b.b("Metadata key %s contains type other than int: %s", new Object[] { paramString, localClassCastException.getMessage() });
    }
    return g.a();
  }
  
  public g e(String paramString)
  {
    paramString = d(paramString);
    if (paramString.d()) {
      return g.e(Long.valueOf(((Integer)paramString.c()).intValue()));
    }
    return g.a();
  }
}

/* Location:
 * Qualified Name:     M4.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */