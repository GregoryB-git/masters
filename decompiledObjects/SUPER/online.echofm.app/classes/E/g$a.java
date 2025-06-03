package E;

import android.os.LocaleList;
import java.util.Locale;

public abstract class g$a
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

/* Location:
 * Qualified Name:     E.g.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */