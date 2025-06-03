package t3;

import android.text.TextUtils;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import w3.a.c;

public class b
{
  public static final String[] g = { "experimentId", "experimentStartTime", "timeToLiveMillis", "triggerTimeoutMillis", "variantId" };
  public static final DateFormat h = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
  public final String a;
  public final String b;
  public final String c;
  public final Date d;
  public final long e;
  public final long f;
  
  public b(String paramString1, String paramString2, String paramString3, Date paramDate, long paramLong1, long paramLong2)
  {
    a = paramString1;
    b = paramString2;
    c = paramString3;
    d = paramDate;
    e = paramLong1;
    f = paramLong2;
  }
  
  public static b a(a.c paramc)
  {
    String str = d;
    if (str == null) {
      for (;;)
      {
        str = "";
      }
    }
    return new b(b, String.valueOf(c), str, new Date(m), e, j);
  }
  
  public static b b(Map paramMap)
  {
    g(paramMap);
    Date localDate;
    long l1;
    long l2;
    String str1;
    String str2;
    for (;;)
    {
      try
      {
        localDate = h.parse((String)paramMap.get("experimentStartTime"));
        l1 = Long.parseLong((String)paramMap.get("triggerTimeoutMillis"));
        l2 = Long.parseLong((String)paramMap.get("timeToLiveMillis"));
        str1 = (String)paramMap.get("experimentId");
        str2 = (String)paramMap.get("variantId");
        if (paramMap.containsKey("triggerEvent")) {
          paramMap = (String)paramMap.get("triggerEvent");
        }
      }
      catch (NumberFormatException paramMap)
      {
        break;
      }
      catch (ParseException paramMap)
      {
        break label149;
      }
      paramMap = "";
    }
    paramMap = new b(str1, str2, paramMap, localDate, l1, l2);
    return paramMap;
    throw new a("Could not process experiment: one of the durations could not be converted into a long.", paramMap);
    label149:
    throw new a("Could not process experiment: parsing experiment start time failed.", paramMap);
  }
  
  public static void g(Map paramMap)
  {
    ArrayList localArrayList = new ArrayList();
    for (String str : g) {
      if (!paramMap.containsKey(str)) {
        localArrayList.add(str);
      }
    }
    if (localArrayList.isEmpty()) {
      return;
    }
    throw new a(String.format("The following keys are missing from the experiment info map: %s", new Object[] { localArrayList }));
  }
  
  public String c()
  {
    return a;
  }
  
  public long d()
  {
    return d.getTime();
  }
  
  public String e()
  {
    return b;
  }
  
  public a.c f(String paramString)
  {
    a.c localc = new a.c();
    a = paramString;
    m = d();
    b = a;
    c = b;
    if (TextUtils.isEmpty(c)) {
      paramString = null;
    } else {
      paramString = c;
    }
    d = paramString;
    e = e;
    j = f;
    return localc;
  }
}

/* Location:
 * Qualified Name:     t3.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */