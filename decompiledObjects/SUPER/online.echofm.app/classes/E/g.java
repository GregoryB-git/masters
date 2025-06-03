package E;

import android.os.Build.VERSION;
import android.os.LocaleList;
import java.util.Locale;

public final class g
{
  public static final g b = a(new Locale[0]);
  public final i a;
  
  public g(i parami)
  {
    a = parami;
  }
  
  public static g a(Locale... paramVarArgs)
  {
    if (Build.VERSION.SDK_INT >= 24) {
      return d(a.a(paramVarArgs));
    }
    return new g(new h(paramVarArgs));
  }
  
  public static Locale b(String paramString)
  {
    if (paramString.contains("-"))
    {
      localObject = paramString.split("-", -1);
      if (localObject.length > 2) {
        return new Locale(localObject[0], localObject[1], localObject[2]);
      }
      if (localObject.length > 1) {
        return new Locale(localObject[0], localObject[1]);
      }
      if (localObject.length == 1) {
        return new Locale(localObject[0]);
      }
    }
    else
    {
      if (!paramString.contains("_")) {
        break label194;
      }
      localObject = paramString.split("_", -1);
      if (localObject.length > 2) {
        return new Locale(localObject[0], localObject[1], localObject[2]);
      }
      if (localObject.length > 1) {
        return new Locale(localObject[0], localObject[1]);
      }
      if (localObject.length == 1) {
        return new Locale(localObject[0]);
      }
    }
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("Can not parse language tag: [");
    ((StringBuilder)localObject).append(paramString);
    ((StringBuilder)localObject).append("]");
    throw new IllegalArgumentException(((StringBuilder)localObject).toString());
    label194:
    return new Locale(paramString);
  }
  
  public static g d(LocaleList paramLocaleList)
  {
    return new g(new o(paramLocaleList));
  }
  
  public Locale c(int paramInt)
  {
    return a.get(paramInt);
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool;
    if (((paramObject instanceof g)) && (a.equals(a))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public int hashCode()
  {
    return a.hashCode();
  }
  
  public String toString()
  {
    return a.toString();
  }
  
  public static abstract class a
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
 * Qualified Name:     E.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */