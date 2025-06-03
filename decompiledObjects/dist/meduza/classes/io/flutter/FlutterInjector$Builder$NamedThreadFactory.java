package io.flutter;

import f;
import java.util.concurrent.ThreadFactory;

class FlutterInjector$Builder$NamedThreadFactory
  implements ThreadFactory
{
  private int threadId = 0;
  
  private FlutterInjector$Builder$NamedThreadFactory(FlutterInjector.Builder paramBuilder) {}
  
  public Thread newThread(Runnable paramRunnable)
  {
    paramRunnable = new Thread(paramRunnable);
    StringBuilder localStringBuilder = f.l("flutter-worker-");
    int i = threadId;
    threadId = (i + 1);
    localStringBuilder.append(i);
    paramRunnable.setName(localStringBuilder.toString());
    return paramRunnable;
  }
}

/* Location:
 * Qualified Name:     io.flutter.FlutterInjector.Builder.NamedThreadFactory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */