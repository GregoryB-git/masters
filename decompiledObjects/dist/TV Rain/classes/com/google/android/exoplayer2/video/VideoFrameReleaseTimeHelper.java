package com.google.android.exoplayer2.video;

import android.annotation.TargetApi;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.hardware.display.DisplayManager.DisplayListener;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.Choreographer.FrameCallback;
import android.view.Display;
import android.view.WindowManager;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Util;

@TargetApi(16)
public final class VideoFrameReleaseTimeHelper
{
  private static final long CHOREOGRAPHER_SAMPLE_DELAY_MILLIS = 500L;
  private static final long MAX_ALLOWED_DRIFT_NS = 20000000L;
  private static final int MIN_FRAMES_FOR_ADJUSTMENT = 6;
  private static final long VSYNC_OFFSET_PERCENTAGE = 80L;
  private long adjustedLastFrameTimeNs;
  private final DefaultDisplayListener displayListener;
  private long frameCount;
  private boolean haveSync;
  private long lastFramePresentationTimeUs;
  private long pendingAdjustedFrameTimeNs;
  private long syncFramePresentationTimeNs;
  private long syncUnadjustedReleaseTimeNs;
  private long vsyncDurationNs;
  private long vsyncOffsetNs;
  private final VSyncSampler vsyncSampler;
  private final WindowManager windowManager;
  
  public VideoFrameReleaseTimeHelper()
  {
    this(null);
  }
  
  public VideoFrameReleaseTimeHelper(@Nullable Context paramContext)
  {
    DefaultDisplayListener localDefaultDisplayListener = null;
    if (paramContext != null)
    {
      paramContext = paramContext.getApplicationContext();
      windowManager = ((WindowManager)paramContext.getSystemService("window"));
    }
    else
    {
      windowManager = null;
    }
    if (windowManager != null)
    {
      if (Util.SDK_INT >= 17) {
        localDefaultDisplayListener = maybeBuildDefaultDisplayListenerV17(paramContext);
      }
      displayListener = localDefaultDisplayListener;
      vsyncSampler = VSyncSampler.getInstance();
    }
    else
    {
      displayListener = null;
      vsyncSampler = null;
    }
    vsyncDurationNs = -9223372036854775807L;
    vsyncOffsetNs = -9223372036854775807L;
  }
  
  private static long closestVsync(long paramLong1, long paramLong2, long paramLong3)
  {
    paramLong2 = (paramLong1 - paramLong2) / paramLong3 * paramLong3 + paramLong2;
    long l;
    if (paramLong1 <= paramLong2)
    {
      l = paramLong2 - paramLong3;
      paramLong3 = paramLong2;
      paramLong2 = l;
    }
    else
    {
      l = paramLong2;
      paramLong3 += paramLong2;
      paramLong2 = l;
    }
    if (paramLong3 - paramLong1 < paramLong1 - paramLong2) {
      paramLong2 = paramLong3;
    }
    return paramLong2;
  }
  
  private boolean isDriftTooLarge(long paramLong1, long paramLong2)
  {
    long l = syncFramePresentationTimeNs;
    boolean bool;
    if (Math.abs(paramLong2 - syncUnadjustedReleaseTimeNs - (paramLong1 - l)) > 20000000L) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  @TargetApi(17)
  private DefaultDisplayListener maybeBuildDefaultDisplayListenerV17(Context paramContext)
  {
    paramContext = (DisplayManager)paramContext.getSystemService("display");
    if (paramContext == null) {
      paramContext = null;
    } else {
      paramContext = new DefaultDisplayListener(paramContext);
    }
    return paramContext;
  }
  
  private void updateDefaultDisplayRefreshRateParams()
  {
    Display localDisplay = windowManager.getDefaultDisplay();
    if (localDisplay != null)
    {
      long l = (1.0E9D / localDisplay.getRefreshRate());
      vsyncDurationNs = l;
      vsyncOffsetNs = (l * 80L / 100L);
    }
  }
  
  public long adjustReleaseTime(long paramLong1, long paramLong2)
  {
    long l1 = 1000L * paramLong1;
    if (haveSync)
    {
      if (paramLong1 != lastFramePresentationTimeUs)
      {
        frameCount += 1L;
        adjustedLastFrameTimeNs = pendingAdjustedFrameTimeNs;
      }
      l2 = frameCount;
      if (l2 >= 6L)
      {
        l2 = (l1 - syncFramePresentationTimeNs) / l2;
        l3 = adjustedLastFrameTimeNs + l2;
        if (isDriftTooLarge(l3, paramLong2))
        {
          haveSync = false;
        }
        else
        {
          l2 = syncUnadjustedReleaseTimeNs + l3 - syncFramePresentationTimeNs;
          break label134;
        }
      }
      else if (isDriftTooLarge(l1, paramLong2))
      {
        haveSync = false;
      }
    }
    long l2 = paramLong2;
    long l3 = l1;
    label134:
    if (!haveSync)
    {
      syncFramePresentationTimeNs = l1;
      syncUnadjustedReleaseTimeNs = paramLong2;
      frameCount = 0L;
      haveSync = true;
    }
    lastFramePresentationTimeUs = paramLong1;
    pendingAdjustedFrameTimeNs = l3;
    VSyncSampler localVSyncSampler = vsyncSampler;
    if ((localVSyncSampler != null) && (vsyncDurationNs != -9223372036854775807L))
    {
      paramLong1 = sampledVsyncTimeNs;
      if (paramLong1 == -9223372036854775807L) {
        return l2;
      }
      return closestVsync(l2, paramLong1, vsyncDurationNs) - vsyncOffsetNs;
    }
    return l2;
  }
  
  public void disable()
  {
    if (windowManager != null)
    {
      DefaultDisplayListener localDefaultDisplayListener = displayListener;
      if (localDefaultDisplayListener != null) {
        localDefaultDisplayListener.unregister();
      }
      vsyncSampler.removeObserver();
    }
  }
  
  public void enable()
  {
    haveSync = false;
    if (windowManager != null)
    {
      vsyncSampler.addObserver();
      DefaultDisplayListener localDefaultDisplayListener = displayListener;
      if (localDefaultDisplayListener != null) {
        localDefaultDisplayListener.register();
      }
      updateDefaultDisplayRefreshRateParams();
    }
  }
  
  @TargetApi(17)
  public final class DefaultDisplayListener
    implements DisplayManager.DisplayListener
  {
    private final DisplayManager displayManager;
    
    public DefaultDisplayListener(DisplayManager paramDisplayManager)
    {
      displayManager = paramDisplayManager;
    }
    
    public void onDisplayAdded(int paramInt) {}
    
    public void onDisplayChanged(int paramInt)
    {
      if (paramInt == 0) {
        VideoFrameReleaseTimeHelper.access$000(VideoFrameReleaseTimeHelper.this);
      }
    }
    
    public void onDisplayRemoved(int paramInt) {}
    
    public void register()
    {
      displayManager.registerDisplayListener(this, null);
    }
    
    public void unregister()
    {
      displayManager.unregisterDisplayListener(this);
    }
  }
  
  public static final class VSyncSampler
    implements Choreographer.FrameCallback, Handler.Callback
  {
    private static final int CREATE_CHOREOGRAPHER = 0;
    private static final VSyncSampler INSTANCE = new VSyncSampler();
    private static final int MSG_ADD_OBSERVER = 1;
    private static final int MSG_REMOVE_OBSERVER = 2;
    private Choreographer choreographer;
    private final HandlerThread choreographerOwnerThread;
    private final Handler handler;
    private int observerCount;
    public volatile long sampledVsyncTimeNs = -9223372036854775807L;
    
    private VSyncSampler()
    {
      Object localObject = new HandlerThread("ChoreographerOwner:Handler");
      choreographerOwnerThread = ((HandlerThread)localObject);
      ((Thread)localObject).start();
      localObject = Util.createHandler(((HandlerThread)localObject).getLooper(), this);
      handler = ((Handler)localObject);
      ((Handler)localObject).sendEmptyMessage(0);
    }
    
    private void addObserverInternal()
    {
      int i = observerCount + 1;
      observerCount = i;
      if (i == 1) {
        choreographer.postFrameCallback(this);
      }
    }
    
    private void createChoreographerInstanceInternal()
    {
      choreographer = Choreographer.getInstance();
    }
    
    public static VSyncSampler getInstance()
    {
      return INSTANCE;
    }
    
    private void removeObserverInternal()
    {
      int i = observerCount - 1;
      observerCount = i;
      if (i == 0)
      {
        choreographer.removeFrameCallback(this);
        sampledVsyncTimeNs = -9223372036854775807L;
      }
    }
    
    public void addObserver()
    {
      handler.sendEmptyMessage(1);
    }
    
    public void doFrame(long paramLong)
    {
      sampledVsyncTimeNs = paramLong;
      choreographer.postFrameCallbackDelayed(this, 500L);
    }
    
    public boolean handleMessage(Message paramMessage)
    {
      int i = what;
      if (i != 0)
      {
        if (i != 1)
        {
          if (i != 2) {
            return false;
          }
          removeObserverInternal();
          return true;
        }
        addObserverInternal();
        return true;
      }
      createChoreographerInstanceInternal();
      return true;
    }
    
    public void removeObserver()
    {
      handler.sendEmptyMessage(2);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.video.VideoFrameReleaseTimeHelper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */