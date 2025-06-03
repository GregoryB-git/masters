package e7;

import g;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public final class z
  extends d3
{
  public long d;
  public String e;
  
  public z(j2 paramj2)
  {
    super(paramj2);
  }
  
  public final boolean o()
  {
    Object localObject1 = Calendar.getInstance();
    Object localObject2 = TimeUnit.MINUTES;
    int i = ((Calendar)localObject1).get(15);
    d = ((TimeUnit)localObject2).convert(((Calendar)localObject1).get(16) + i, TimeUnit.MILLISECONDS);
    localObject1 = Locale.getDefault();
    String str = ((Locale)localObject1).getLanguage();
    localObject2 = Locale.ENGLISH;
    e = g.e(str.toLowerCase((Locale)localObject2), "-", ((Locale)localObject1).getCountry().toLowerCase((Locale)localObject2));
    return false;
  }
  
  public final long p()
  {
    m();
    return d;
  }
  
  public final String q()
  {
    m();
    return e;
  }
}

/* Location:
 * Qualified Name:     e7.z
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */