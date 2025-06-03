package io.flutter.embedding.engine.plugins.service;

import android.app.Service;
import b1.k;

public abstract interface ServiceControlSurface
{
  public abstract void attachToService(Service paramService, k paramk, boolean paramBoolean);
  
  public abstract void detachFromService();
  
  public abstract void onMoveToBackground();
  
  public abstract void onMoveToForeground();
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.plugins.service.ServiceControlSurface
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */