package io.flutter.embedding.engine.plugins.service;

public abstract interface ServiceAware
{
  public abstract void onAttachedToService(ServicePluginBinding paramServicePluginBinding);
  
  public abstract void onDetachedFromService();
  
  public static abstract interface OnModeChangeListener
  {
    public abstract void onMoveToBackground();
    
    public abstract void onMoveToForeground();
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.plugins.service.ServiceAware
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */