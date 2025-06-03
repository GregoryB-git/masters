package m6;

import g;
import java.util.ArrayList;

public final class h$a
{
  public final ArrayList a;
  public final Object b;
  
  public final void a(Object paramObject, String paramString)
  {
    paramObject = g.e(paramString, "=", String.valueOf(paramObject));
    a.add(paramObject);
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(100);
    localStringBuilder.append(b.getClass().getSimpleName());
    localStringBuilder.append('{');
    int i = a.size();
    for (int j = 0; j < i; j++)
    {
      localStringBuilder.append((String)a.get(j));
      if (j < i - 1) {
        localStringBuilder.append(", ");
      }
    }
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     m6.h.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */