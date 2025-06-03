package w5;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import v5.e0;
import v5.g;
import v5.j;
import x6.b;

public final class h
  extends Surface
{
  public static int d;
  public static boolean e;
  public final boolean a;
  public final a b;
  public boolean c;
  
  public h(a parama, SurfaceTexture paramSurfaceTexture, boolean paramBoolean)
  {
    super(paramSurfaceTexture);
    b = parama;
    a = paramBoolean;
  }
  
  public static int a(Context paramContext)
  {
    int i = e0.a;
    int j = 0;
    if ((i >= 24) && ((i >= 26) || ((!"samsung".equals(e0.c)) && (!"XT1650".equals(e0.d)))) && ((i >= 26) || (paramContext.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance"))))
    {
      paramContext = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
      if ((paramContext != null) && (paramContext.contains("EGL_EXT_protected_content")))
      {
        k = 1;
        break label98;
      }
    }
    int k = 0;
    label98:
    if (k != 0)
    {
      if (i < 17)
      {
        k = j;
      }
      else
      {
        paramContext = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
        k = j;
        if (paramContext != null)
        {
          k = j;
          if (paramContext.contains("EGL_KHR_surfaceless_context")) {
            k = 1;
          }
        }
      }
      if (k != 0) {
        return 1;
      }
      return 2;
    }
    return 0;
  }
  
  public static h b(Context paramContext, boolean paramBoolean)
  {
    int i = 0;
    int j;
    if (paramBoolean) {
      try
      {
        if (!e)
        {
          d = a(paramContext);
          e = true;
        }
        j = d;
        if (j != 0) {
          j = 1;
        } else {
          j = 0;
        }
        if (j == 0) {
          bool = false;
        }
      }
      finally {}
    }
    boolean bool = true;
    b.H(bool);
    paramContext = new a();
    if (paramBoolean) {
      j = d;
    } else {
      j = 0;
    }
    paramContext.start();
    Object localObject1 = new Handler(paramContext.getLooper(), paramContext);
    b = ((Handler)localObject1);
    a = new g((Handler)localObject1);
    try
    {
      b.obtainMessage(1, j, 0).sendToTarget();
      j = i;
      while ((e == null) && (d == null))
      {
        localObject1 = c;
        if (localObject1 != null) {
          break;
        }
        try
        {
          paramContext.wait();
        }
        catch (InterruptedException localInterruptedException)
        {
          j = 1;
        }
      }
      if (j != 0) {
        Thread.currentThread().interrupt();
      }
      Object localObject2 = d;
      if (localObject2 == null)
      {
        localObject2 = c;
        if (localObject2 == null)
        {
          paramContext = e;
          paramContext.getClass();
          return paramContext;
        }
        throw ((Throwable)localObject2);
      }
      throw ((Throwable)localObject2);
    }
    finally {}
  }
  
  public final void release()
  {
    super.release();
    synchronized (b)
    {
      if (!c)
      {
        a locala2 = b;
        b.getClass();
        b.sendEmptyMessage(2);
        c = true;
      }
      return;
    }
  }
  
  public static final class a
    extends HandlerThread
    implements Handler.Callback
  {
    public g a;
    public Handler b;
    public Error c;
    public RuntimeException d;
    public h e;
    
    public a()
    {
      super();
    }
    
    public final void a(int paramInt)
    {
      a.getClass();
      g localg = a;
      localg.getClass();
      boolean bool1 = false;
      Object localObject1 = EGL14.eglGetDisplay(0);
      if (localObject1 != null) {
        bool2 = true;
      } else {
        bool2 = false;
      }
      j.b("eglGetDisplay failed", bool2);
      Object localObject2 = new int[2];
      j.b("eglInitialize failed", EGL14.eglInitialize((EGLDisplay)localObject1, (int[])localObject2, 0, (int[])localObject2, 1));
      c = ((EGLDisplay)localObject1);
      localObject2 = new EGLConfig[1];
      Object localObject3 = new int[1];
      boolean bool3 = EGL14.eglChooseConfig((EGLDisplay)localObject1, g.o, 0, (EGLConfig[])localObject2, 0, 1, (int[])localObject3, 0);
      if ((bool3) && (localObject3[0] > 0) && (localObject2[0] != null)) {
        bool2 = true;
      } else {
        bool2 = false;
      }
      j.b(e0.m("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", new Object[] { Boolean.valueOf(bool3), Integer.valueOf(localObject3[0]), localObject2[0] }), bool2);
      localObject2 = localObject2[0];
      localObject3 = c;
      if (paramInt == 0)
      {
        localObject1 = new int[3];
        Object tmp193_191 = localObject1;
        tmp193_191[0] = '゘';
        Object tmp199_193 = tmp193_191;
        tmp199_193[1] = 2;
        Object tmp203_199 = tmp199_193;
        tmp203_199[2] = '〸';
        tmp203_199;
      }
      else
      {
        localObject1 = new int[5];
        Object tmp220_218 = localObject1;
        tmp220_218[0] = '゘';
        Object tmp226_220 = tmp220_218;
        tmp226_220[1] = 2;
        Object tmp230_226 = tmp226_220;
        tmp230_226[2] = '㋀';
        Object tmp236_230 = tmp230_226;
        tmp236_230[3] = 1;
        Object tmp240_236 = tmp236_230;
        tmp240_236[4] = '〸';
        tmp240_236;
      }
      localObject3 = EGL14.eglCreateContext((EGLDisplay)localObject3, (EGLConfig)localObject2, EGL14.EGL_NO_CONTEXT, (int[])localObject1, 0);
      if (localObject3 != null) {
        bool2 = true;
      } else {
        bool2 = false;
      }
      j.b("eglCreateContext failed", bool2);
      d = ((EGLContext)localObject3);
      EGLDisplay localEGLDisplay = c;
      if (paramInt == 1)
      {
        localObject1 = EGL14.EGL_NO_SURFACE;
      }
      else
      {
        if (paramInt == 2)
        {
          localObject1 = new int[7];
          Object tmp321_319 = localObject1;
          tmp321_319[0] = 'し';
          Object tmp327_321 = tmp321_319;
          tmp327_321[1] = 1;
          Object tmp331_327 = tmp327_321;
          tmp331_327[2] = 'ざ';
          Object tmp337_331 = tmp331_327;
          tmp337_331[3] = 1;
          Object tmp341_337 = tmp337_331;
          tmp341_337[4] = '㋀';
          Object tmp347_341 = tmp341_337;
          tmp347_341[5] = 1;
          Object tmp351_347 = tmp347_341;
          tmp351_347[6] = '〸';
          tmp351_347;
        }
        else
        {
          localObject1 = new int[5];
          Object tmp369_367 = localObject1;
          tmp369_367[0] = 'し';
          Object tmp375_369 = tmp369_367;
          tmp375_369[1] = 1;
          Object tmp379_375 = tmp375_369;
          tmp379_375[2] = 'ざ';
          Object tmp385_379 = tmp379_375;
          tmp385_379[3] = 1;
          Object tmp389_385 = tmp385_379;
          tmp389_385[4] = '〸';
          tmp389_385;
        }
        localObject1 = EGL14.eglCreatePbufferSurface(localEGLDisplay, (EGLConfig)localObject2, (int[])localObject1, 0);
        if (localObject1 != null) {
          bool2 = true;
        } else {
          bool2 = false;
        }
        j.b("eglCreatePbufferSurface failed", bool2);
      }
      j.b("eglMakeCurrent failed", EGL14.eglMakeCurrent(localEGLDisplay, (EGLSurface)localObject1, (EGLSurface)localObject1, (EGLContext)localObject3));
      e = ((EGLSurface)localObject1);
      GLES20.glGenTextures(1, b, 0);
      j.a();
      localObject1 = new SurfaceTexture(b[0]);
      f = ((SurfaceTexture)localObject1);
      ((SurfaceTexture)localObject1).setOnFrameAvailableListener(localg);
      localObject1 = a.f;
      localObject1.getClass();
      boolean bool2 = bool1;
      if (paramInt != 0) {
        bool2 = true;
      }
      e = new h(this, (SurfaceTexture)localObject1, bool2);
    }
    
    public final void b()
    {
      a.getClass();
      g localg = a;
      a.removeCallbacks(localg);
      try
      {
        Object localObject1 = f;
        if (localObject1 != null)
        {
          ((SurfaceTexture)localObject1).release();
          GLES20.glDeleteTextures(1, b, 0);
        }
        return;
      }
      finally
      {
        Object localObject3 = c;
        if ((localObject3 != null) && (!((EGLDisplay)localObject3).equals(EGL14.EGL_NO_DISPLAY)))
        {
          EGLDisplay localEGLDisplay = c;
          localObject3 = EGL14.EGL_NO_SURFACE;
          EGL14.eglMakeCurrent(localEGLDisplay, (EGLSurface)localObject3, (EGLSurface)localObject3, EGL14.EGL_NO_CONTEXT);
        }
        localObject3 = e;
        if ((localObject3 != null) && (!((EGLSurface)localObject3).equals(EGL14.EGL_NO_SURFACE))) {
          EGL14.eglDestroySurface(c, e);
        }
        localObject3 = d;
        if (localObject3 != null) {
          EGL14.eglDestroyContext(c, (EGLContext)localObject3);
        }
        if (e0.a >= 19) {
          EGL14.eglReleaseThread();
        }
        localObject3 = c;
        if ((localObject3 != null) && (!((EGLDisplay)localObject3).equals(EGL14.EGL_NO_DISPLAY))) {
          EGL14.eglTerminate(c);
        }
        c = null;
        d = null;
        e = null;
        f = null;
      }
    }
    
    /* Error */
    public final boolean handleMessage(Message paramMessage)
    {
      // Byte code:
      //   0: aload_1
      //   1: getfield 203	android/os/Message:what	I
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
      //   18: invokevirtual 205	w5/h$a:b	()V
      //   21: aload_0
      //   22: invokevirtual 208	android/os/HandlerThread:quit	()Z
      //   25: pop
      //   26: goto +15 -> 41
      //   29: astore_1
      //   30: ldc -46
      //   32: ldc -44
      //   34: aload_1
      //   35: invokestatic 217	v5/m:d	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
      //   38: goto -17 -> 21
      //   41: iconst_1
      //   42: ireturn
      //   43: astore_1
      //   44: aload_0
      //   45: invokevirtual 208	android/os/HandlerThread:quit	()Z
      //   48: pop
      //   49: aload_1
      //   50: athrow
      //   51: aload_0
      //   52: aload_1
      //   53: getfield 220	android/os/Message:arg1	I
      //   56: invokevirtual 222	w5/h$a:a	(I)V
      //   59: aload_0
      //   60: monitorenter
      //   61: aload_0
      //   62: invokevirtual 225	java/lang/Object:notify	()V
      //   65: aload_0
      //   66: monitorexit
      //   67: goto +103 -> 170
      //   70: astore_1
      //   71: aload_0
      //   72: monitorexit
      //   73: aload_1
      //   74: athrow
      //   75: astore_1
      //   76: goto +101 -> 177
      //   79: astore_1
      //   80: ldc -46
      //   82: ldc -29
      //   84: aload_1
      //   85: invokestatic 217	v5/m:d	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
      //   88: aload_0
      //   89: aload_1
      //   90: putfield 229	w5/h$a:c	Ljava/lang/Error;
      //   93: aload_0
      //   94: monitorenter
      //   95: aload_0
      //   96: invokevirtual 225	java/lang/Object:notify	()V
      //   99: aload_0
      //   100: monitorexit
      //   101: goto +69 -> 170
      //   104: astore_1
      //   105: aload_0
      //   106: monitorexit
      //   107: aload_1
      //   108: athrow
      //   109: astore_3
      //   110: ldc -46
      //   112: ldc -29
      //   114: aload_3
      //   115: invokestatic 217	v5/m:d	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
      //   118: new 231	java/lang/IllegalStateException
      //   121: astore_1
      //   122: aload_1
      //   123: aload_3
      //   124: invokespecial 234	java/lang/IllegalStateException:<init>	(Ljava/lang/Throwable;)V
      //   127: aload_0
      //   128: aload_1
      //   129: putfield 236	w5/h$a:d	Ljava/lang/RuntimeException;
      //   132: aload_0
      //   133: monitorenter
      //   134: aload_0
      //   135: invokevirtual 225	java/lang/Object:notify	()V
      //   138: aload_0
      //   139: monitorexit
      //   140: goto +30 -> 170
      //   143: astore_1
      //   144: aload_0
      //   145: monitorexit
      //   146: aload_1
      //   147: athrow
      //   148: astore_1
      //   149: ldc -46
      //   151: ldc -29
      //   153: aload_1
      //   154: invokestatic 217	v5/m:d	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
      //   157: aload_0
      //   158: aload_1
      //   159: putfield 236	w5/h$a:d	Ljava/lang/RuntimeException;
      //   162: aload_0
      //   163: monitorenter
      //   164: aload_0
      //   165: invokevirtual 225	java/lang/Object:notify	()V
      //   168: aload_0
      //   169: monitorexit
      //   170: iconst_1
      //   171: ireturn
      //   172: astore_1
      //   173: aload_0
      //   174: monitorexit
      //   175: aload_1
      //   176: athrow
      //   177: aload_0
      //   178: monitorenter
      //   179: aload_0
      //   180: invokevirtual 225	java/lang/Object:notify	()V
      //   183: aload_0
      //   184: monitorexit
      //   185: aload_1
      //   186: athrow
      //   187: astore_1
      //   188: aload_0
      //   189: monitorexit
      //   190: aload_1
      //   191: athrow
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	192	0	this	a
      //   0	192	1	paramMessage	Message
      //   4	9	2	i	int
      //   109	15	3	locala	v5.j.a
      // Exception table:
      //   from	to	target	type
      //   17	21	29	finally
      //   30	38	43	finally
      //   61	67	70	finally
      //   71	73	70	finally
      //   51	59	75	finally
      //   80	93	75	finally
      //   110	132	75	finally
      //   149	162	75	finally
      //   51	59	79	java/lang/Error
      //   95	101	104	finally
      //   105	107	104	finally
      //   51	59	109	v5/j$a
      //   134	140	143	finally
      //   144	146	143	finally
      //   51	59	148	java/lang/RuntimeException
      //   164	170	172	finally
      //   173	175	172	finally
      //   179	185	187	finally
      //   188	190	187	finally
    }
  }
}

/* Location:
 * Qualified Name:     w5.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */