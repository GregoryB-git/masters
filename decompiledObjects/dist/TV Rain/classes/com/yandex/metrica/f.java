package com.yandex.metrica;

import android.app.Application;
import android.content.Context;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.ob.D2;
import com.yandex.metrica.impl.ob.Hf;
import com.yandex.metrica.impl.ob.Jf;
import com.yandex.metrica.impl.ob.P;
import com.yandex.metrica.impl.ob.R2;
import com.yandex.metrica.impl.ob.a0;
import com.yandex.metrica.impl.ob.o2;
import com.yandex.metrica.impl.ob.q;
import com.yandex.metrica.impl.ob.q.c;

public class f
{
  @NonNull
  private final Hf a;
  @NonNull
  private final D2 b;
  @NonNull
  private final q c;
  @NonNull
  private final o2 d;
  @NonNull
  private final a0 e;
  
  public f(@NonNull Hf paramHf, @NonNull D2 paramD2)
  {
    this(paramHf, paramD2, P.g().b(), P.g().k(), P.g().e());
  }
  
  @VisibleForTesting
  public f(@NonNull Hf paramHf, @NonNull D2 paramD2, @NonNull q paramq, @NonNull o2 paramo2, @NonNull a0 parama0)
  {
    a = paramHf;
    b = paramD2;
    c = paramq;
    d = paramo2;
    e = parama0;
  }
  
  @NonNull
  public q.c a(@NonNull Application paramApplication)
  {
    c.a(paramApplication);
    return d.a();
  }
  
  public void a(@NonNull Context paramContext)
  {
    e.a(paramContext);
  }
  
  public void a(@NonNull Context paramContext, @NonNull YandexMetricaConfig paramYandexMetricaConfig)
  {
    i locali = (i)paramYandexMetricaConfig;
    e.a(paramContext);
    Boolean localBoolean1 = sessionsAutoTrackingEnabled;
    Boolean localBoolean2 = Boolean.TRUE;
    paramYandexMetricaConfig = localBoolean1;
    if (localBoolean1 == null) {
      paramYandexMetricaConfig = localBoolean2;
    }
    if (paramYandexMetricaConfig.booleanValue()) {
      d.a();
    }
    a.getClass();
    R2.a(paramContext).b(locali);
  }
  
  public void a(@NonNull WebView paramWebView, @NonNull Jf paramJf)
  {
    b.a(paramWebView, paramJf);
  }
  
  public void b(@NonNull Context paramContext)
  {
    e.a(paramContext);
  }
  
  public void c(@NonNull Context paramContext)
  {
    e.a(paramContext);
  }
}

/* Location:
 * Qualified Name:     com.yandex.metrica.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */