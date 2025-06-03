package com.yandex.metrica;

import android.webkit.JavascriptInterface;
import androidx.annotation.NonNull;
import com.yandex.metrica.impl.ob.Jf;

public class AppMetricaInitializerJsInterface
{
  @NonNull
  private final Jf a;
  
  public AppMetricaInitializerJsInterface(@NonNull Jf paramJf)
  {
    a = paramJf;
  }
  
  @JavascriptInterface
  public void init(String paramString)
  {
    a.c(paramString);
  }
}

/* Location:
 * Qualified Name:     com.yandex.metrica.AppMetricaInitializerJsInterface
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */