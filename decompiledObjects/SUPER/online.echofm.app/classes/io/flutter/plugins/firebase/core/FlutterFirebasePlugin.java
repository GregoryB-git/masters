package io.flutter.plugins.firebase.core;

import V2.j;
import androidx.annotation.Keep;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import s3.e;

@Keep
public abstract interface FlutterFirebasePlugin
{
  public static final ExecutorService cachedThreadPool = ;
  
  public abstract j didReinitializeFirebaseCore();
  
  public abstract j getPluginConstantsForFirebaseApp(e parame);
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.core.FlutterFirebasePlugin
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */