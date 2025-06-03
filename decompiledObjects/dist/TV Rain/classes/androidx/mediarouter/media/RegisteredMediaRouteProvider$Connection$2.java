package androidx.mediarouter.media;

class RegisteredMediaRouteProvider$Connection$2
  implements Runnable
{
  public RegisteredMediaRouteProvider$Connection$2(RegisteredMediaRouteProvider.Connection paramConnection) {}
  
  public void run()
  {
    RegisteredMediaRouteProvider.Connection localConnection = this$1;
    this$0.onConnectionDied(localConnection);
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.media.RegisteredMediaRouteProvider.Connection.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */