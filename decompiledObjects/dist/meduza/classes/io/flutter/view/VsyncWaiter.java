package io.flutter.view;

import android.hardware.display.DisplayManager;
import android.hardware.display.DisplayManager.DisplayListener;
import android.view.Choreographer;
import android.view.Choreographer.FrameCallback;
import android.view.Display;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.FlutterJNI.AsyncWaitForVsyncDelegate;
import java.util.Objects;

public class VsyncWaiter
{
  private static VsyncWaiter instance;
  private static DisplayListener listener;
  private final FlutterJNI.AsyncWaitForVsyncDelegate asyncWaitForVsyncDelegate = new FlutterJNI.AsyncWaitForVsyncDelegate()
  {
    private Choreographer.FrameCallback obtainFrameCallback(long paramAnonymousLong)
    {
      if (VsyncWaiter.access$200(VsyncWaiter.this) != null)
      {
        VsyncWaiter.FrameCallback.access$302(VsyncWaiter.access$200(VsyncWaiter.this), paramAnonymousLong);
        VsyncWaiter.FrameCallback localFrameCallback = VsyncWaiter.access$200(VsyncWaiter.this);
        VsyncWaiter.access$202(VsyncWaiter.this, null);
        return localFrameCallback;
      }
      return new VsyncWaiter.FrameCallback(VsyncWaiter.this, paramAnonymousLong);
    }
    
    public void asyncWaitForVsync(long paramAnonymousLong)
    {
      Choreographer.getInstance().postFrameCallback(obtainFrameCallback(paramAnonymousLong));
    }
  };
  private FlutterJNI flutterJNI;
  private FrameCallback frameCallback = new FrameCallback(0L);
  private long refreshPeriodNanos = -1L;
  
  private VsyncWaiter(FlutterJNI paramFlutterJNI)
  {
    flutterJNI = paramFlutterJNI;
  }
  
  public static VsyncWaiter getInstance(float paramFloat, FlutterJNI paramFlutterJNI)
  {
    if (instance == null) {
      instance = new VsyncWaiter(paramFlutterJNI);
    }
    paramFlutterJNI.setRefreshRateFPS(paramFloat);
    paramFlutterJNI = instance;
    refreshPeriodNanos = ((1.0E9D / paramFloat));
    return paramFlutterJNI;
  }
  
  public static VsyncWaiter getInstance(DisplayManager paramDisplayManager, FlutterJNI paramFlutterJNI)
  {
    if (instance == null) {
      instance = new VsyncWaiter(paramFlutterJNI);
    }
    if (listener == null)
    {
      Object localObject = instance;
      Objects.requireNonNull(localObject);
      localObject = new DisplayListener((VsyncWaiter)localObject, paramDisplayManager);
      listener = (DisplayListener)localObject;
      ((DisplayListener)localObject).register();
    }
    if (instancerefreshPeriodNanos == -1L)
    {
      float f = paramDisplayManager.getDisplay(0).getRefreshRate();
      instancerefreshPeriodNanos = ((1.0E9D / f));
      paramFlutterJNI.setRefreshRateFPS(f);
    }
    return instance;
  }
  
  public static void reset()
  {
    instance = null;
    listener = null;
  }
  
  public void init()
  {
    flutterJNI.setAsyncWaitForVsyncDelegate(asyncWaitForVsyncDelegate);
  }
  
  public class DisplayListener
    implements DisplayManager.DisplayListener
  {
    private DisplayManager displayManager;
    
    public DisplayListener(DisplayManager paramDisplayManager)
    {
      displayManager = paramDisplayManager;
    }
    
    public void onDisplayAdded(int paramInt) {}
    
    public void onDisplayChanged(int paramInt)
    {
      if (paramInt == 0)
      {
        float f = displayManager.getDisplay(0).getRefreshRate();
        VsyncWaiter.access$002(VsyncWaiter.this, (1.0E9D / f));
        VsyncWaiter.access$100(VsyncWaiter.this).setRefreshRateFPS(f);
      }
    }
    
    public void onDisplayRemoved(int paramInt) {}
    
    public void register()
    {
      displayManager.registerDisplayListener(this, null);
    }
  }
  
  public class FrameCallback
    implements Choreographer.FrameCallback
  {
    private long cookie;
    
    public FrameCallback(long paramLong)
    {
      cookie = paramLong;
    }
    
    public void doFrame(long paramLong)
    {
      paramLong = System.nanoTime() - paramLong;
      if (paramLong < 0L) {
        paramLong = 0L;
      }
      VsyncWaiter.access$100(VsyncWaiter.this).onVsync(paramLong, VsyncWaiter.access$000(VsyncWaiter.this), cookie);
      VsyncWaiter.access$202(VsyncWaiter.this, this);
    }
  }
}

/* Location:
 * Qualified Name:     io.flutter.view.VsyncWaiter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */