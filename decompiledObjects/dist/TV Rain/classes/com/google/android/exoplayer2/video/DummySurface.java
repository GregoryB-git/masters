package com.google.android.exoplayer2.video;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.EGLSurfaceTexture;
import com.google.android.exoplayer2.util.Util;

@TargetApi(17)
public final class DummySurface
  extends Surface
{
  private static final String EXTENSION_PROTECTED_CONTENT = "EGL_EXT_protected_content";
  private static final String EXTENSION_SURFACELESS_CONTEXT = "EGL_KHR_surfaceless_context";
  private static final String TAG = "DummySurface";
  private static int secureMode;
  private static boolean secureModeInitialized;
  public final boolean secure;
  private final DummySurfaceThread thread;
  private boolean threadReleased;
  
  private DummySurface(DummySurfaceThread paramDummySurfaceThread, SurfaceTexture paramSurfaceTexture, boolean paramBoolean)
  {
    super(paramSurfaceTexture);
    thread = paramDummySurfaceThread;
    secure = paramBoolean;
  }
  
  private static void assertApiLevel17OrHigher()
  {
    if (Util.SDK_INT >= 17) {
      return;
    }
    throw new UnsupportedOperationException("Unsupported prior to API level 17");
  }
  
  @TargetApi(24)
  private static int getSecureModeV24(Context paramContext)
  {
    int i = Util.SDK_INT;
    if ((i < 26) && (("samsung".equals(Util.MANUFACTURER)) || ("XT1650".equals(Util.MODEL)))) {
      return 0;
    }
    if ((i < 26) && (!paramContext.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance"))) {
      return 0;
    }
    paramContext = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
    if (paramContext == null) {
      return 0;
    }
    if (!paramContext.contains("EGL_EXT_protected_content")) {
      return 0;
    }
    if (paramContext.contains("EGL_KHR_surfaceless_context")) {
      i = 1;
    } else {
      i = 2;
    }
    return i;
  }
  
  public static boolean isSecureSupported(Context paramContext)
  {
    try
    {
      boolean bool1 = secureModeInitialized;
      boolean bool2 = true;
      if (!bool1)
      {
        if (Util.SDK_INT < 24) {
          i = 0;
        } else {
          i = getSecureModeV24(paramContext);
        }
        secureMode = i;
        secureModeInitialized = true;
      }
      int i = secureMode;
      if (i == 0) {
        bool2 = false;
      }
      return bool2;
    }
    finally {}
  }
  
  public static DummySurface newInstanceV17(Context paramContext, boolean paramBoolean)
  {
    assertApiLevel17OrHigher();
    int i = 0;
    boolean bool;
    if ((paramBoolean) && (!isSecureSupported(paramContext))) {
      bool = false;
    } else {
      bool = true;
    }
    Assertions.checkState(bool);
    paramContext = new DummySurfaceThread();
    if (paramBoolean) {
      i = secureMode;
    }
    return paramContext.init(i);
  }
  
  public void release()
  {
    super.release();
    synchronized (thread)
    {
      if (!threadReleased)
      {
        thread.release();
        threadReleased = true;
      }
      return;
    }
  }
  
  public static class DummySurfaceThread
    extends HandlerThread
    implements Handler.Callback
  {
    private static final int MSG_INIT = 1;
    private static final int MSG_RELEASE = 2;
    private EGLSurfaceTexture eglSurfaceTexture;
    private Handler handler;
    @Nullable
    private Error initError;
    @Nullable
    private RuntimeException initException;
    @Nullable
    private DummySurface surface;
    
    public DummySurfaceThread()
    {
      super();
    }
    
    private void initInternal(int paramInt)
    {
      Assertions.checkNotNull(eglSurfaceTexture);
      eglSurfaceTexture.init(paramInt);
      SurfaceTexture localSurfaceTexture = eglSurfaceTexture.getSurfaceTexture();
      boolean bool;
      if (paramInt != 0) {
        bool = true;
      } else {
        bool = false;
      }
      surface = new DummySurface(this, localSurfaceTexture, bool, null);
    }
    
    private void releaseInternal()
    {
      Assertions.checkNotNull(eglSurfaceTexture);
      eglSurfaceTexture.release();
    }
    
    /* Error */
    public boolean handleMessage(Message paramMessage)
    {
      // Byte code:
      //   0: aload_1
      //   1: getfield 72	android/os/Message:what	I
      //   4: istore_2
      //   5: iload_2
      //   6: iconst_1
      //   7: if_icmpeq +44 -> 51
      //   10: iload_2
      //   11: iconst_2
      //   12: if_icmpeq +5 -> 17
      //   15: iconst_1
      //   16: ireturn
      //   17: aload_0
      //   18: invokespecial 74	com/google/android/exoplayer2/video/DummySurface$DummySurfaceThread:releaseInternal	()V
      //   21: aload_0
      //   22: invokevirtual 78	android/os/HandlerThread:quit	()Z
      //   25: pop
      //   26: goto +15 -> 41
      //   29: astore_1
      //   30: ldc 80
      //   32: ldc 82
      //   34: aload_1
      //   35: invokestatic 88	com/google/android/exoplayer2/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
      //   38: goto -17 -> 21
      //   41: iconst_1
      //   42: ireturn
      //   43: astore_1
      //   44: aload_0
      //   45: invokevirtual 78	android/os/HandlerThread:quit	()Z
      //   48: pop
      //   49: aload_1
      //   50: athrow
      //   51: aload_0
      //   52: aload_1
      //   53: getfield 91	android/os/Message:arg1	I
      //   56: invokespecial 93	com/google/android/exoplayer2/video/DummySurface$DummySurfaceThread:initInternal	(I)V
      //   59: aload_0
      //   60: monitorenter
      //   61: aload_0
      //   62: invokevirtual 98	java/lang/Object:notify	()V
      //   65: aload_0
      //   66: monitorexit
      //   67: goto +64 -> 131
      //   70: astore_1
      //   71: aload_0
      //   72: monitorexit
      //   73: aload_1
      //   74: athrow
      //   75: astore_1
      //   76: goto +62 -> 138
      //   79: astore_1
      //   80: ldc 80
      //   82: ldc 100
      //   84: aload_1
      //   85: invokestatic 88	com/google/android/exoplayer2/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
      //   88: aload_0
      //   89: aload_1
      //   90: putfield 102	com/google/android/exoplayer2/video/DummySurface$DummySurfaceThread:initError	Ljava/lang/Error;
      //   93: aload_0
      //   94: monitorenter
      //   95: aload_0
      //   96: invokevirtual 98	java/lang/Object:notify	()V
      //   99: aload_0
      //   100: monitorexit
      //   101: goto +30 -> 131
      //   104: astore_1
      //   105: aload_0
      //   106: monitorexit
      //   107: aload_1
      //   108: athrow
      //   109: astore_1
      //   110: ldc 80
      //   112: ldc 100
      //   114: aload_1
      //   115: invokestatic 88	com/google/android/exoplayer2/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
      //   118: aload_0
      //   119: aload_1
      //   120: putfield 104	com/google/android/exoplayer2/video/DummySurface$DummySurfaceThread:initException	Ljava/lang/RuntimeException;
      //   123: aload_0
      //   124: monitorenter
      //   125: aload_0
      //   126: invokevirtual 98	java/lang/Object:notify	()V
      //   129: aload_0
      //   130: monitorexit
      //   131: iconst_1
      //   132: ireturn
      //   133: astore_1
      //   134: aload_0
      //   135: monitorexit
      //   136: aload_1
      //   137: athrow
      //   138: aload_0
      //   139: monitorenter
      //   140: aload_0
      //   141: invokevirtual 98	java/lang/Object:notify	()V
      //   144: aload_0
      //   145: monitorexit
      //   146: aload_1
      //   147: athrow
      //   148: astore_1
      //   149: aload_0
      //   150: monitorexit
      //   151: aload_1
      //   152: athrow
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	153	0	this	DummySurfaceThread
      //   0	153	1	paramMessage	Message
      //   4	9	2	i	int
      // Exception table:
      //   from	to	target	type
      //   17	21	29	finally
      //   30	38	43	finally
      //   61	67	70	finally
      //   71	73	70	finally
      //   51	59	75	finally
      //   80	93	75	finally
      //   110	123	75	finally
      //   51	59	79	java/lang/Error
      //   95	101	104	finally
      //   105	107	104	finally
      //   51	59	109	java/lang/RuntimeException
      //   125	131	133	finally
      //   134	136	133	finally
      //   140	146	148	finally
      //   149	151	148	finally
    }
    
    public DummySurface init(int paramInt)
    {
      start();
      Object localObject1 = new Handler(getLooper(), this);
      handler = ((Handler)localObject1);
      eglSurfaceTexture = new EGLSurfaceTexture((Handler)localObject1);
      try
      {
        localObject1 = handler;
        int i = 0;
        ((Handler)localObject1).obtainMessage(1, paramInt, 0).sendToTarget();
        paramInt = i;
        while ((surface == null) && (initException == null))
        {
          localObject1 = initError;
          if (localObject1 != null) {
            break;
          }
          try
          {
            wait();
          }
          catch (InterruptedException localInterruptedException)
          {
            paramInt = 1;
          }
        }
        if (paramInt != 0) {
          Thread.currentThread().interrupt();
        }
        Object localObject2 = initException;
        if (localObject2 == null)
        {
          localObject2 = initError;
          if (localObject2 == null) {
            return (DummySurface)Assertions.checkNotNull(surface);
          }
          throw ((Throwable)localObject2);
        }
        throw ((Throwable)localObject2);
      }
      finally {}
    }
    
    public void release()
    {
      Assertions.checkNotNull(handler);
      handler.sendEmptyMessage(2);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.video.DummySurface
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */