package io.flutter.embedding.engine.plugins.lifecycle;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.lifecycle.d;

@Keep
public class HiddenLifecycleReference
{
  @NonNull
  private final d lifecycle;
  
  public HiddenLifecycleReference(@NonNull d paramd)
  {
    lifecycle = paramd;
  }
  
  @NonNull
  public d getLifecycle()
  {
    return lifecycle;
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.plugins.lifecycle.HiddenLifecycleReference
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */