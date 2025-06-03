package androidx.mediarouter.media;

abstract interface RegisteredMediaRouteProvider$ControllerConnection
{
  public abstract void attachConnection(RegisteredMediaRouteProvider.Connection paramConnection);
  
  public abstract void detachConnection();
  
  public abstract int getControllerId();
}

/* Location:
 * Qualified Name:     androidx.mediarouter.media.RegisteredMediaRouteProvider.ControllerConnection
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */