package com.yandex.metrica;

import androidx.annotation.NonNull;
import java.util.LinkedHashMap;

public class e$a
{
  public ReporterConfig.Builder a;
  public Integer b;
  public Integer c;
  public LinkedHashMap<String, String> d = new LinkedHashMap();
  
  public e$a(String paramString)
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

/* Location:
 * Qualified Name:     com.yandex.metrica.e.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */