package io.flutter.embedding.engine.plugins.activity;

public abstract interface ActivityAware
{
  public abstract void onAttachedToActivity(ActivityPluginBinding paramActivityPluginBinding);
  
  public abstract void onDetachedFromActivity();
  
  public abstract void onDetachedFromActivityForConfigChanges();
  
  public abstract void onReattachedToActivityForConfigChanges(ActivityPluginBinding paramActivityPluginBinding);
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.plugins.activity.ActivityAware
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */