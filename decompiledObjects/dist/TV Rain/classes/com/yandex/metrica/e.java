package com.yandex.metrica;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.ob.A2;
import java.util.AbstractMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class e
  extends ReporterConfig
{
  @Nullable
  public final Integer a;
  @Nullable
  public final Integer b;
  public final Map<String, String> c;
  
  private e(ReporterConfig paramReporterConfig)
  {
    super(paramReporterConfig);
    if ((paramReporterConfig instanceof e))
    {
      paramReporterConfig = (e)paramReporterConfig;
      a = a;
      b = b;
      c = c;
    }
    else
    {
      a = null;
      b = null;
      c = null;
    }
  }
  
  public e(@NonNull a parama)
  {
    super(a);
    b = b;
    a = c;
    parama = d;
    if (parama == null) {
      parama = null;
    } else {
      parama = A2.e(parama);
    }
    c = parama;
  }
  
  public static a a(@NonNull e parame)
  {
    a locala = new a(apiKey);
    int i;
    if (A2.a(sessionTimeout))
    {
      i = sessionTimeout.intValue();
      a.withSessionTimeout(i);
    }
    if ((A2.a(logs)) && (logs.booleanValue())) {
      a.withLogs();
    }
    if (A2.a(statisticsSending))
    {
      boolean bool = statisticsSending.booleanValue();
      a.withStatisticsSending(bool);
    }
    if (A2.a(maxReportsInDatabaseCount))
    {
      i = maxReportsInDatabaseCount.intValue();
      a.withMaxReportsInDatabaseCount(i);
    }
    if (A2.a(a)) {
      c = Integer.valueOf(a.intValue());
    }
    if (A2.a(b)) {
      b = Integer.valueOf(b.intValue());
    }
    if (A2.a(c))
    {
      Iterator localIterator = c.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Object localObject = (Map.Entry)localIterator.next();
        String str = (String)((Map.Entry)localObject).getKey();
        localObject = (String)((Map.Entry)localObject).getValue();
        d.put(str, localObject);
      }
    }
    if (A2.a(userProfileID))
    {
      parame = userProfileID;
      a.withUserProfileID(parame);
    }
    return locala;
  }
  
  public static a a(@NonNull String paramString)
  {
    return new a(paramString);
  }
  
  public static e a(@NonNull ReporterConfig paramReporterConfig)
  {
    return new e(paramReporterConfig);
  }
  
  public static class a
  {
    public ReporterConfig.Builder a;
    public Integer b;
    public Integer c;
    public LinkedHashMap<String, String> d = new LinkedHashMap();
    
    public a(String paramString)
    {
      a = ReporterConfig.newConfigBuilder(paramString);
    }
    
    @NonNull
    public a a(int paramInt)
    {
      a.withMaxReportsInDatabaseCount(paramInt);
      return this;
    }
    
    @NonNull
    public e a()
    {
      return new e(this);
    }
  }
}

/* Location:
 * Qualified Name:     com.yandex.metrica.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */