package a0;

import f;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;

public final class k
  implements l
{
  public static final Locale[] c = new Locale[0];
  public final Locale[] a;
  public final String b;
  
  static
  {
    new Locale("en", "XA");
    new Locale("ar", "XB");
    String[] arrayOfString = "en-Latn".split("-", -1);
    if (arrayOfString.length > 2)
    {
      new Locale(arrayOfString[0], arrayOfString[1], arrayOfString[2]);
    }
    else if (arrayOfString.length > 1)
    {
      new Locale(arrayOfString[0], arrayOfString[1]);
    }
    else
    {
      if (arrayOfString.length != 1) {
        break label107;
      }
      new Locale(arrayOfString[0]);
    }
    return;
    label107:
    throw new IllegalArgumentException("Can not parse language tag: [en-Latn]");
  }
  
  public k(Locale... paramVarArgs)
  {
    if (paramVarArgs.length == 0)
    {
      a = c;
      paramVarArgs = "";
    }
    else
    {
      ArrayList localArrayList = new ArrayList();
      HashSet localHashSet = new HashSet();
      StringBuilder localStringBuilder = new StringBuilder();
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
            localStringBuilder.append(localLocale.getLanguage());
            String str = localLocale.getCountry();
            if ((str != null) && (!str.isEmpty()))
            {
              localStringBuilder.append('-');
              localStringBuilder.append(localLocale.getCountry());
            }
            if (i < paramVarArgs.length - 1) {
              localStringBuilder.append(',');
            }
            localHashSet.add(localLocale);
          }
          i++;
        }
        else
        {
          throw new NullPointerException(j.h("list[", i, "] is null"));
        }
      }
      a = ((Locale[])localArrayList.toArray(new Locale[0]));
      paramVarArgs = localStringBuilder.toString();
    }
    b = paramVarArgs;
  }
  
  public final String a()
  {
    return b;
  }
  
  public final Object b()
  {
    return null;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof k)) {
      return false;
    }
    paramObject = a;
    if (a.length != paramObject.length) {
      return false;
    }
    for (int i = 0;; i++)
    {
      Locale[] arrayOfLocale = a;
      if (i >= arrayOfLocale.length) {
        break;
      }
      if (!arrayOfLocale[i].equals(paramObject[i])) {
        return false;
      }
    }
    return true;
  }
  
  public final Locale get(int paramInt)
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
  
  public final int hashCode()
  {
    Locale[] arrayOfLocale = a;
    int i = arrayOfLocale.length;
    int j = 1;
    for (int k = 0; k < i; k++) {
      j = j * 31 + arrayOfLocale[k].hashCode();
    }
    return j;
  }
  
  public final boolean isEmpty()
  {
    boolean bool;
    if (a.length == 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final int size()
  {
    return a.length;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("[");
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
 * Qualified Name:     a0.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */