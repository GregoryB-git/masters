package l4;

import j4.f;
import j4.g;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public final class d$b
  implements f
{
  public static final DateFormat a;
  
  static
  {
    SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
    a = localSimpleDateFormat;
    localSimpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
  }
  
  public void b(Date paramDate, g paramg)
  {
    paramg.d(a.format(paramDate));
  }
}

/* Location:
 * Qualified Name:     l4.d.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */