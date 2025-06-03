package io.flutter.embedding.engine.systemchannels;

 enum LifecycleChannel$AppLifecycleState
{
  static
  {
    INACTIVE = new AppLifecycleState("INACTIVE", 2);
    HIDDEN = new AppLifecycleState("HIDDEN", 3);
    PAUSED = new AppLifecycleState("PAUSED", 4);
  }
  
  private LifecycleChannel$AppLifecycleState() {}
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.systemchannels.LifecycleChannel.AppLifecycleState
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */