package p;

import android.os.LocaleList;
import java.util.Locale;

public final class o$b
{
  public static String a()
  {
    Object localObject = LocaleList.getAdjustedDefault();
    if (((LocaleList)localObject).size() > 0) {
      localObject = ((LocaleList)localObject).get(0).toLanguageTag();
    } else {
      localObject = null;
    }
    return (String)localObject;
  }
}

/* Location:
 * Qualified Name:     p.o.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */