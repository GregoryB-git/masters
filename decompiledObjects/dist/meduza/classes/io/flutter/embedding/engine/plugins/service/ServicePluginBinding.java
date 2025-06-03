package io.flutter.embedding.engine.plugins.service;

import android.app.Service;

public abstract interface ServicePluginBinding
{
  public abstract void addOnModeChangeListener(ServiceAware.OnModeChangeListener paramOnModeChangeListener);
  
  public abstract Object getLifecycle();
  
  public abstract Service getService();
  
  public abstract void removeOnModeChangeListener(ServiceAware.OnModeChangeListener paramOnModeChangeListener);
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.plugins.service.ServicePluginBinding
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */