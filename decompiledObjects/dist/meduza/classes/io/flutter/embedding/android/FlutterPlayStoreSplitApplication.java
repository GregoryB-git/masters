package io.flutter.embedding.android;

import com.google.android.play.core.splitcompat.SplitCompatApplication;
import io.flutter.FlutterInjector;
import io.flutter.FlutterInjector.Builder;
import io.flutter.embedding.engine.deferredcomponents.PlayStoreDeferredComponentManager;

public class FlutterPlayStoreSplitApplication
  extends SplitCompatApplication
{
  public void onCreate()
  {
    super.onCreate();
    PlayStoreDeferredComponentManager localPlayStoreDeferredComponentManager = new PlayStoreDeferredComponentManager(this, null);
    FlutterInjector.setInstance(new FlutterInjector.Builder().setDeferredComponentManager(localPlayStoreDeferredComponentManager).build());
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.android.FlutterPlayStoreSplitApplication
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */