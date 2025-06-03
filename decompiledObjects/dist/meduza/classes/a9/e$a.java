package a9;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import y8.f;
import y8.g;

public final class e$a
  implements f<Date>
{
  public static final SimpleDateFormat a;
  
  static
  {
    SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
    a = localSimpleDateFormat;
    localSimpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
  }
  
  public final void a(Object paramObject1, Object paramObject2)
  {
    paramObject1 = (Date)paramObject1;
    ((g)paramObject2).f(a.format((Date)paramObject1));
  }
}

/* Location:
 * Qualified Name:     a9.e.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */