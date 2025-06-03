package com.google.firebase.ktx;

import B3.c;
import O4.h;
import W5.m;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
@Keep
public final class FirebaseCommonLegacyRegistrar
  implements ComponentRegistrar
{
  @NotNull
  public List<c> getComponents()
  {
    return m.b(h.b("fire-core-ktx", "20.4.2"));
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.ktx.FirebaseCommonLegacyRegistrar
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */