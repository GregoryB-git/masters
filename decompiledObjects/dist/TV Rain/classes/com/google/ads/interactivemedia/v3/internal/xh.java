package com.google.ads.interactivemedia.v3.internal;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

final class xh
  extends yn<java.util.Date>
{
  private final Class<? extends java.util.Date> a;
  private final List<DateFormat> b;
  
  public xh(Class<? extends java.util.Date> paramClass, int paramInt1, int paramInt2)
  {
    ArrayList localArrayList = new ArrayList();
    b = localArrayList;
    a = a(paramClass);
    paramClass = Locale.US;
    localArrayList.add(DateFormat.getDateTimeInstance(paramInt1, paramInt2, paramClass));
    if (!Locale.getDefault().equals(paramClass)) {
      localArrayList.add(DateFormat.getDateTimeInstance(paramInt1, paramInt2));
    }
    if (zp.b()) {
      localArrayList.add(rp.a(paramInt1, paramInt2));
    }
  }
  
  public xh(Class<? extends java.util.Date> paramClass, String paramString)
  {
    ArrayList localArrayList = new ArrayList();
    b = localArrayList;
    a = a(paramClass);
    paramClass = Locale.US;
    localArrayList.add(new SimpleDateFormat(paramString, paramClass));
    if (!Locale.getDefault().equals(paramClass)) {
      localArrayList.add(new SimpleDateFormat(paramString));
    }
  }
  
  private static Class<? extends java.util.Date> a(Class<? extends java.util.Date> paramClass)
  {
    if ((paramClass != java.util.Date.class) && (paramClass != java.sql.Date.class) && (paramClass != Timestamp.class))
    {
      StringBuilder localStringBuilder = new StringBuilder("Date type must be one of ");
      localStringBuilder.append(java.util.Date.class);
      localStringBuilder.append(", ");
      localStringBuilder.append(Timestamp.class);
      localStringBuilder.append(", or ");
      localStringBuilder.append(java.sql.Date.class);
      localStringBuilder.append(" but was ");
      localStringBuilder.append(paramClass);
      throw new IllegalArgumentException(localStringBuilder.toString());
    }
    return paramClass;
  }
  
  private final java.util.Date a(String paramString)
  {
    for (;;)
    {
      Object localObject1;
      Object localObject2;
      synchronized (b)
      {
        localObject1 = b.iterator();
        if (((Iterator)localObject1).hasNext()) {
          localObject2 = (DateFormat)((Iterator)localObject1).next();
        }
      }
      for (;;)
      {
        try
        {
          localObject2 = ((DateFormat)localObject2).parse(paramString);
          return (java.util.Date)localObject2;
        }
        catch (ParseException localParseException2) {}
        try
        {
          localObject1 = new java/text/ParsePosition;
          ((ParsePosition)localObject1).<init>(0);
          localObject1 = act.a(paramString, (ParsePosition)localObject1);
          return (java.util.Date)localObject1;
        }
        catch (ParseException localParseException1)
        {
          localObject1 = new com/google/ads/interactivemedia/v3/internal/yl;
          ((yl)localObject1).<init>(paramString, localParseException1);
          throw ((Throwable)localObject1);
        }
      }
      paramString = finally;
      throw paramString;
    }
  }
  
  public final String toString()
  {
    DateFormat localDateFormat = (DateFormat)b.get(0);
    if ((localDateFormat instanceof SimpleDateFormat))
    {
      localStringBuilder = new StringBuilder("DefaultDateTypeAdapter(");
      localStringBuilder.append(((SimpleDateFormat)localDateFormat).toPattern());
      localStringBuilder.append(')');
      return localStringBuilder.toString();
    }
    StringBuilder localStringBuilder = new StringBuilder("DefaultDateTypeAdapter(");
    localStringBuilder.append(localDateFormat.getClass().getSimpleName());
    localStringBuilder.append(')');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.xh
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */