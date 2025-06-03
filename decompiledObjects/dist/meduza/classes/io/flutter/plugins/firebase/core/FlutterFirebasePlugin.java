package io.flutter.plugins.firebase.core;

import com.google.android.gms.tasks.Task;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import u7.f;

public abstract interface FlutterFirebasePlugin
{
  public static final ExecutorService cachedThreadPool = ;
  
  public abstract Task<Void> didReinitializeFirebaseCore();
  
  public abstract Task<Map<String, Object>> getPluginConstantsForFirebaseApp(f paramf);
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.core.FlutterFirebasePlugin
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */