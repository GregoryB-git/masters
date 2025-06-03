package E;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;

public final class h
  implements i
{
  public static final Locale[] c = new Locale[0];
  public static final Locale d = new Locale("en", "XA");
  public static final Locale e = new Locale("ar", "XB");
  public static final Locale f = g.b("en-Latn");
  public final Locale[] a;
  public final String b;
  
  public h(Locale... paramVarArgs)
  {
    if (paramVarArgs.length == 0) {
      a = c;
    }
    StringBuilder localStringBuilder;
    for (paramVarArgs = "";; paramVarArgs = localStringBuilder.toString())
    {
      b = paramVarArgs;
      break;
      ArrayList localArrayList = new ArrayList();
      HashSet localHashSet = new HashSet();
      localStringBuilder = new StringBuilder();
      int i = 0;
      while (i < paramVarArgs.length)
      {
        Locale localLocale = paramVarArgs[i];
        if (localLocale != null)
        {
          if (!localHashSet.contains(localLocale))
          {
            localLocale = (Locale)localLocale.clone();
            localArrayList.add(localLocale);
            b(localStringBuilder, localLocale);
            if (i < paramVarArgs.length - 1) {
              localStringBuilder.append(',');
            }
            localHashSet.add(localLocale);
          }
          i++;
        }
        else
        {
          paramVarArgs = new StringBuilder();
          paramVarArgs.append("list[");
          paramVarArgs.append(i);
          paramVarArgs.append("] is null");
          throw new NullPointerException(paramVarArgs.toString());
        }
      }
      a = ((Locale[])localArrayList.toArray(new Locale[0]));
    }
  }
  
  public static void b(StringBuilder paramStringBuilder, Locale paramLocale)
  {
    paramStringBuilder.append(paramLocale.getLanguage());
    String str = paramLocale.getCountry();
    if ((str != null) && (!str.isEmpty()))
    {
      paramStringBuilder.append('-');
      paramStringBuilder.append(paramLocale.getCountry());
    }
  }
  
  public Object a()
  {
    return null;
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof h)) {
      return false;
    }
    Locale[] arrayOfLocale = a;
    if (a.length != arrayOfLocale.length) {
      return false;
    }
    for (int i = 0;; i++)
    {
      paramObject = a;
      if (i >= paramObject.length) {
        break;
      }
      if (!paramObject[i].equals(arrayOfLocale[i])) {
        return false;
      }
    }
    return true;
  }
  
  public Locale get(int paramInt)
  {
    if (paramInt >= 0)
    {
      localObject = a;
      if (paramInt < localObject.length) {
        return localObject[paramInt];
      }
    }
    Object localObject = null;
    return (Locale)localObject;
  }
  
  public int hashCode()
  {
    Locale[] arrayOfLocale = a;
    int i = arrayOfLocale.length;
    int j = 1;
    for (int k = 0; k < i; k++) {
      j = j * 31 + arrayOfLocale[k].hashCode();
    }
    return j;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("[");
    for (int i = 0;; i++)
    {
      Locale[] arrayOfLocale = a;
      if (i >= arrayOfLocale.length) {
        break;
      }
      localStringBuilder.append(arrayOfLocale[i]);
      if (i < a.length - 1) {
        localStringBuilder.append(',');
      }
    }
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     E.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */