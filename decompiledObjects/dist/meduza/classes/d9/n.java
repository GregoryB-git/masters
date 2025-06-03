package d9;

import f;
import g;
import j9.e;
import j9.l;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import x6.b;

public final class n
{
  public static final Pattern b = Pattern.compile("[~*/\\[\\]]");
  public static final n c = new n(l.b);
  public final l a;
  
  public n(l paraml)
  {
    a = paraml;
  }
  
  public n(List<String> paramList)
  {
    if (paramList.isEmpty()) {
      paramList = l.c;
    } else {
      paramList = new l(paramList);
    }
    a = paramList;
  }
  
  public static n a(String paramString)
  {
    if (paramString != null)
    {
      b.p("Use FieldPath.of() for field names containing '~*/[]'.", b.matcher(paramString).find() ^ true, new Object[0]);
      try
      {
        n localn = b(paramString.split("\\.", -1));
        return localn;
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        throw new IllegalArgumentException(g.e("Invalid field path (", paramString, "). Paths must not be empty, begin with '.', end with '.', or contain '..'"));
      }
    }
    throw new NullPointerException("Provided field path must not be null.");
  }
  
  public static n b(String... paramVarArgs)
  {
    boolean bool;
    if (paramVarArgs.length > 0) {
      bool = true;
    } else {
      bool = false;
    }
    b.p("Invalid field path. Provided path must not be empty.", bool, new Object[0]);
    int i = 0;
    while (i < paramVarArgs.length)
    {
      Object localObject = paramVarArgs[i];
      if ((localObject != null) && (!((String)localObject).isEmpty())) {
        bool = true;
      } else {
        bool = false;
      }
      localObject = f.l("Invalid field name at argument ");
      i++;
      ((StringBuilder)localObject).append(i);
      ((StringBuilder)localObject).append(". Field names must not be null or empty.");
      b.p(((StringBuilder)localObject).toString(), bool, new Object[0]);
    }
    return new n(Arrays.asList(paramVarArgs));
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (n.class == paramObject.getClass()))
    {
      paramObject = (n)paramObject;
      return a.equals(a);
    }
    return false;
  }
  
  public final int hashCode()
  {
    return a.hashCode();
  }
  
  public final String toString()
  {
    return a.h();
  }
}

/* Location:
 * Qualified Name:     d9.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */