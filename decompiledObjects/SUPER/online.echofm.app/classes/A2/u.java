package A2;

import android.os.BaseBundle;
import android.os.Bundle;
import y2.a.d;

public class u
  implements a.d
{
  public static final u b = a().a();
  public final String a;
  
  public static a a()
  {
    return new a(null);
  }
  
  public final Bundle b()
  {
    Bundle localBundle = new Bundle();
    String str = a;
    if (str != null) {
      localBundle.putString("api", str);
    }
    return localBundle;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof u)) {
      return false;
    }
    paramObject = (u)paramObject;
    return m.a(a, a);
  }
  
  public final int hashCode()
  {
    return m.b(new Object[] { a });
  }
  
  public static class a
  {
    public String a;
    
    public u a()
    {
      return new u(a, null);
    }
  }
}

/* Location:
 * Qualified Name:     A2.u
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */