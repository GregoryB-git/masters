package com.google.firebase.analytics.connector.internal;

import B3.c;
import B3.c.b;
import B3.r;
import O4.h;
import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import n4.d;
import s3.e;
import w3.a;
import x3.b;

@Keep
public class AnalyticsConnectorRegistrar
  implements ComponentRegistrar
{
  @SuppressLint({"MissingPermission"})
  @Keep
  @NonNull
  public List<c> getComponents()
  {
    return Arrays.asList(new c[] { c.e(a.class).b(r.k(e.class)).b(r.k(Context.class)).b(r.k(d.class)).f(b.a).e().d(), h.b("fire-analytics", "21.5.0") });
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.analytics.connector.internal.AnalyticsConnectorRegistrar
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */