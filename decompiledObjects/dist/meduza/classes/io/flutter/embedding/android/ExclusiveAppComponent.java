package io.flutter.embedding.android;

public abstract interface ExclusiveAppComponent<T>
{
  public abstract void detachFromFlutterEngine();
  
  public abstract T getAppComponent();
}

/* Location:
 * Qualified Name:     io.flutter.embedding.android.ExclusiveAppComponent
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */