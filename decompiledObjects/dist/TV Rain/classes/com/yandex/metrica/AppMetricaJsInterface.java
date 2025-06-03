package com.yandex.metrica;

import android.webkit.JavascriptInterface;
import androidx.annotation.NonNull;
import com.yandex.metrica.impl.ob.Jf;

public class AppMetricaJsInterface
{
  @NonNull
  private final Jf a;
  
  public AppMetricaJsInterface(@NonNull Jf paramJf)
  {
    a = paramJf;
  }
  
  @JavascriptInterface
  public void reportEvent(String paramString1, String paramString2)
  {
    a.c(paramString1, paramString2);
  }
}

/* Location:
 * Qualified Name:     com.yandex.metrica.AppMetricaJsInterface
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */