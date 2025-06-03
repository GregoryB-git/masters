package a0;

import android.os.Build.VERSION;
import android.os.LocaleList;
import c0.a;
import java.util.Locale;

public final class i
{
  public static final i b = a(new Locale[0]);
  public final l a;
  
  public i(l paraml)
  {
    a = paraml;
  }
  
  public static i a(Locale... paramVarArgs)
  {
    if (Build.VERSION.SDK_INT >= 24) {
      return new i(new m(b.a(paramVarArgs)));
    }
    return new i(new k(paramVarArgs));
  }
  
  public static i b(String paramString)
  {
    if ((paramString != null) && (!paramString.isEmpty()))
    {
      String[] arrayOfString = paramString.split(",", -1);
      int i = arrayOfString.length;
      paramString = new Locale[i];
      for (int j = 0; j < i; j++) {
        paramString[j] = a.a(arrayOfString[j]);
      }
      return a(paramString);
    }
    return b;
  }
  
  public final Locale c(int paramInt)
  {
    return a.get(paramInt);
  }
  
  public final boolean d()
  {
    return a.isEmpty();
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool;
    if (((paramObject instanceof i)) && (a.equals(a))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final int hashCode()
  {
    return a.hashCode();
  }
  
  public final String toString()
  {
    return a.toString();
  }
  
  public static final class a
  {
    public static final Locale[] a = { new Locale("en", "XA"), new Locale("ar", "XB") };
    
    public static Locale a(String paramString)
    {
      return Locale.forLanguageTag(paramString);
    }
    
    public static boolean b(Locale paramLocale1, Locale paramLocale2)
    {
      boolean bool1 = paramLocale1.equals(paramLocale2);
      boolean bool2 = true;
      if (bool1) {
        return true;
      }
      if (!paramLocale1.getLanguage().equals(paramLocale2.getLanguage())) {
        return false;
      }
      Object localObject = a;
      int i = localObject.length;
      for (int j = 0; j < i; j++) {
        if (localObject[j].equals(paramLocale1))
        {
          j = 1;
          break label77;
        }
      }
      j = 0;
      label77:
      if (j == 0)
      {
        localObject = a;
        i = localObject.length;
        for (j = 0; j < i; j++) {
          if (localObject[j].equals(paramLocale2))
          {
            j = 1;
            break label129;
          }
        }
        j = 0;
        label129:
        if (j == 0)
        {
          localObject = a.a(paramLocale1);
          if (((String)localObject).isEmpty())
          {
            paramLocale1 = paramLocale1.getCountry();
            bool1 = bool2;
            if (!paramLocale1.isEmpty()) {
              if (paramLocale1.equals(paramLocale2.getCountry())) {
                bool1 = bool2;
              } else {
                bool1 = false;
              }
            }
            return bool1;
          }
          return ((String)localObject).equals(a.a(paramLocale2));
        }
      }
      return false;
    }
  }
  
  public static final class b
  {
    public static LocaleList a(Locale... paramVarArgs)
    {
      return new LocaleList(paramVarArgs);
    }
    
    public static LocaleList b()
    {
      return LocaleList.getAdjustedDefault();
    }
    
    public static LocaleList c()
    {
      return LocaleList.getDefault();
    }
  }
}

/* Location:
 * Qualified Name:     a0.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */