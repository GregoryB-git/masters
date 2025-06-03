package com.google.firebase.crashlytics;

import B3.c;
import W5.m;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
@Keep
public final class FirebaseCrashlyticsKtxRegistrar
  implements ComponentRegistrar
{
  @NotNull
  public static final a Companion = new a(null);
  
  @NotNull
  public List<c> getComponents()
  {
    return m.f();
  }
  
  public static final class a {}
}

/* Location:
 * Qualified Name:     com.google.firebase.crashlytics.FirebaseCrashlyticsKtxRegistrar
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */