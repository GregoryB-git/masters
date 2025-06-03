package com.google.android.exoplayer2;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.audio.AudioProcessor;
import com.google.android.exoplayer2.audio.AudioRendererEventListener;
import com.google.android.exoplayer2.drm.DrmSessionManager;
import com.google.android.exoplayer2.drm.FrameworkMediaCrypto;
import com.google.android.exoplayer2.mediacodec.MediaCodecSelector;
import com.google.android.exoplayer2.metadata.MetadataOutput;
import com.google.android.exoplayer2.metadata.MetadataRenderer;
import com.google.android.exoplayer2.text.TextOutput;
import com.google.android.exoplayer2.text.TextRenderer;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.video.MediaCodecVideoRenderer;
import com.google.android.exoplayer2.video.VideoRendererEventListener;
import com.google.android.exoplayer2.video.spherical.CameraMotionRenderer;
import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;

public class DefaultRenderersFactory
  implements RenderersFactory
{
  public static final long DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS = 5000L;
  public static final int EXTENSION_RENDERER_MODE_OFF = 0;
  public static final int EXTENSION_RENDERER_MODE_ON = 1;
  public static final int EXTENSION_RENDERER_MODE_PREFER = 2;
  public static final int MAX_DROPPED_VIDEO_FRAME_COUNT_TO_NOTIFY = 50;
  private static final String TAG = "DefaultRenderersFactory";
  private final long allowedVideoJoiningTimeMs;
  private final Context context;
  @Nullable
  private final DrmSessionManager<FrameworkMediaCrypto> drmSessionManager;
  private final int extensionRendererMode;
  
  public DefaultRenderersFactory(Context paramContext)
  {
    this(paramContext, 0);
  }
  
  public DefaultRenderersFactory(Context paramContext, int paramInt)
  {
    this(paramContext, paramInt, 5000L);
  }
  
  public DefaultRenderersFactory(Context paramContext, int paramInt, long paramLong)
  {
    context = paramContext;
    extensionRendererMode = paramInt;
    allowedVideoJoiningTimeMs = paramLong;
    drmSessionManager = null;
  }
  
  @Deprecated
  public DefaultRenderersFactory(Context paramContext, @Nullable DrmSessionManager<FrameworkMediaCrypto> paramDrmSessionManager)
  {
    this(paramContext, paramDrmSessionManager, 0);
  }
  
  @Deprecated
  public DefaultRenderersFactory(Context paramContext, @Nullable DrmSessionManager<FrameworkMediaCrypto> paramDrmSessionManager, int paramInt)
  {
    this(paramContext, paramDrmSessionManager, paramInt, 5000L);
  }
  
  @Deprecated
  public DefaultRenderersFactory(Context paramContext, @Nullable DrmSessionManager<FrameworkMediaCrypto> paramDrmSessionManager, int paramInt, long paramLong)
  {
    context = paramContext;
    extensionRendererMode = paramInt;
    allowedVideoJoiningTimeMs = paramLong;
    drmSessionManager = paramDrmSessionManager;
  }
  
  public AudioProcessor[] buildAudioProcessors()
  {
    return new AudioProcessor[0];
  }
  
  /* Error */
  public void buildAudioRenderers(Context paramContext, @Nullable DrmSessionManager<FrameworkMediaCrypto> paramDrmSessionManager, AudioProcessor[] paramArrayOfAudioProcessor, Handler paramHandler, AudioRendererEventListener paramAudioRendererEventListener, int paramInt, ArrayList<Renderer> paramArrayList)
  {
    // Byte code:
    //   0: aload 7
    //   2: new 80	com/google/android/exoplayer2/audio/MediaCodecAudioRenderer
    //   5: dup
    //   6: aload_1
    //   7: getstatic 86	com/google/android/exoplayer2/mediacodec/MediaCodecSelector:DEFAULT	Lcom/google/android/exoplayer2/mediacodec/MediaCodecSelector;
    //   10: aload_2
    //   11: iconst_0
    //   12: aload 4
    //   14: aload 5
    //   16: aload_1
    //   17: invokestatic 92	com/google/android/exoplayer2/audio/AudioCapabilities:getCapabilities	(Landroid/content/Context;)Lcom/google/android/exoplayer2/audio/AudioCapabilities;
    //   20: aload_3
    //   21: invokespecial 95	com/google/android/exoplayer2/audio/MediaCodecAudioRenderer:<init>	(Landroid/content/Context;Lcom/google/android/exoplayer2/mediacodec/MediaCodecSelector;Lcom/google/android/exoplayer2/drm/DrmSessionManager;ZLandroid/os/Handler;Lcom/google/android/exoplayer2/audio/AudioRendererEventListener;Lcom/google/android/exoplayer2/audio/AudioCapabilities;[Lcom/google/android/exoplayer2/audio/AudioProcessor;)V
    //   24: invokevirtual 101	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   27: pop
    //   28: iload 6
    //   30: ifne +4 -> 34
    //   33: return
    //   34: aload 7
    //   36: invokevirtual 105	java/util/ArrayList:size	()I
    //   39: istore 8
    //   41: iload 8
    //   43: istore 9
    //   45: iload 6
    //   47: iconst_2
    //   48: if_icmpne +9 -> 57
    //   51: iload 8
    //   53: iconst_1
    //   54: isub
    //   55: istore 9
    //   57: ldc 107
    //   59: invokestatic 113	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   62: iconst_3
    //   63: anewarray 109	java/lang/Class
    //   66: dup
    //   67: iconst_0
    //   68: ldc 115
    //   70: aastore
    //   71: dup
    //   72: iconst_1
    //   73: ldc 117
    //   75: aastore
    //   76: dup
    //   77: iconst_2
    //   78: ldc 119
    //   80: aastore
    //   81: invokevirtual 123	java/lang/Class:getConstructor	([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    //   84: iconst_3
    //   85: anewarray 4	java/lang/Object
    //   88: dup
    //   89: iconst_0
    //   90: aload 4
    //   92: aastore
    //   93: dup
    //   94: iconst_1
    //   95: aload 5
    //   97: aastore
    //   98: dup
    //   99: iconst_2
    //   100: aload_3
    //   101: aastore
    //   102: invokevirtual 129	java/lang/reflect/Constructor:newInstance	([Ljava/lang/Object;)Ljava/lang/Object;
    //   105: checkcast 131	com/google/android/exoplayer2/Renderer
    //   108: astore_1
    //   109: iload 9
    //   111: iconst_1
    //   112: iadd
    //   113: istore 6
    //   115: aload 7
    //   117: iload 9
    //   119: aload_1
    //   120: invokevirtual 134	java/util/ArrayList:add	(ILjava/lang/Object;)V
    //   123: ldc 26
    //   125: ldc -120
    //   127: invokestatic 142	com/google/android/exoplayer2/util/Log:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   130: goto +27 -> 157
    //   133: astore_1
    //   134: iload 6
    //   136: istore 9
    //   138: goto +15 -> 153
    //   141: astore_1
    //   142: new 144	java/lang/RuntimeException
    //   145: dup
    //   146: ldc -110
    //   148: aload_1
    //   149: invokespecial 149	java/lang/RuntimeException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   152: athrow
    //   153: iload 9
    //   155: istore 6
    //   157: ldc -105
    //   159: invokestatic 113	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   162: iconst_3
    //   163: anewarray 109	java/lang/Class
    //   166: dup
    //   167: iconst_0
    //   168: ldc 115
    //   170: aastore
    //   171: dup
    //   172: iconst_1
    //   173: ldc 117
    //   175: aastore
    //   176: dup
    //   177: iconst_2
    //   178: ldc 119
    //   180: aastore
    //   181: invokevirtual 123	java/lang/Class:getConstructor	([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    //   184: iconst_3
    //   185: anewarray 4	java/lang/Object
    //   188: dup
    //   189: iconst_0
    //   190: aload 4
    //   192: aastore
    //   193: dup
    //   194: iconst_1
    //   195: aload 5
    //   197: aastore
    //   198: dup
    //   199: iconst_2
    //   200: aload_3
    //   201: aastore
    //   202: invokevirtual 129	java/lang/reflect/Constructor:newInstance	([Ljava/lang/Object;)Ljava/lang/Object;
    //   205: checkcast 131	com/google/android/exoplayer2/Renderer
    //   208: astore_1
    //   209: iload 6
    //   211: iconst_1
    //   212: iadd
    //   213: istore 9
    //   215: aload 7
    //   217: iload 6
    //   219: aload_1
    //   220: invokevirtual 134	java/util/ArrayList:add	(ILjava/lang/Object;)V
    //   223: ldc 26
    //   225: ldc -103
    //   227: invokestatic 142	com/google/android/exoplayer2/util/Log:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   230: goto +27 -> 257
    //   233: astore_1
    //   234: iload 9
    //   236: istore 6
    //   238: goto +15 -> 253
    //   241: astore_1
    //   242: new 144	java/lang/RuntimeException
    //   245: dup
    //   246: ldc -101
    //   248: aload_1
    //   249: invokespecial 149	java/lang/RuntimeException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   252: athrow
    //   253: iload 6
    //   255: istore 9
    //   257: aload 7
    //   259: iload 9
    //   261: ldc -99
    //   263: invokestatic 113	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   266: iconst_3
    //   267: anewarray 109	java/lang/Class
    //   270: dup
    //   271: iconst_0
    //   272: ldc 115
    //   274: aastore
    //   275: dup
    //   276: iconst_1
    //   277: ldc 117
    //   279: aastore
    //   280: dup
    //   281: iconst_2
    //   282: ldc 119
    //   284: aastore
    //   285: invokevirtual 123	java/lang/Class:getConstructor	([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    //   288: iconst_3
    //   289: anewarray 4	java/lang/Object
    //   292: dup
    //   293: iconst_0
    //   294: aload 4
    //   296: aastore
    //   297: dup
    //   298: iconst_1
    //   299: aload 5
    //   301: aastore
    //   302: dup
    //   303: iconst_2
    //   304: aload_3
    //   305: aastore
    //   306: invokevirtual 129	java/lang/reflect/Constructor:newInstance	([Ljava/lang/Object;)Ljava/lang/Object;
    //   309: checkcast 131	com/google/android/exoplayer2/Renderer
    //   312: invokevirtual 134	java/util/ArrayList:add	(ILjava/lang/Object;)V
    //   315: ldc 26
    //   317: ldc -97
    //   319: invokestatic 142	com/google/android/exoplayer2/util/Log:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   322: goto +15 -> 337
    //   325: astore_1
    //   326: new 144	java/lang/RuntimeException
    //   329: dup
    //   330: ldc -95
    //   332: aload_1
    //   333: invokespecial 149	java/lang/RuntimeException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   336: athrow
    //   337: return
    //   338: astore_1
    //   339: goto -186 -> 153
    //   342: astore_1
    //   343: goto -90 -> 253
    //   346: astore_1
    //   347: goto -10 -> 337
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	350	0	this	DefaultRenderersFactory
    //   0	350	1	paramContext	Context
    //   0	350	2	paramDrmSessionManager	DrmSessionManager<FrameworkMediaCrypto>
    //   0	350	3	paramArrayOfAudioProcessor	AudioProcessor[]
    //   0	350	4	paramHandler	Handler
    //   0	350	5	paramAudioRendererEventListener	AudioRendererEventListener
    //   0	350	6	paramInt	int
    //   0	350	7	paramArrayList	ArrayList<Renderer>
    //   39	16	8	i	int
    //   43	217	9	j	int
    // Exception table:
    //   from	to	target	type
    //   115	130	133	java/lang/ClassNotFoundException
    //   57	109	141	java/lang/Exception
    //   115	130	141	java/lang/Exception
    //   215	230	233	java/lang/ClassNotFoundException
    //   157	209	241	java/lang/Exception
    //   215	230	241	java/lang/Exception
    //   257	322	325	java/lang/Exception
    //   57	109	338	java/lang/ClassNotFoundException
    //   157	209	342	java/lang/ClassNotFoundException
    //   257	322	346	java/lang/ClassNotFoundException
  }
  
  public void buildCameraMotionRenderers(Context paramContext, int paramInt, ArrayList<Renderer> paramArrayList)
  {
    paramArrayList.add(new CameraMotionRenderer());
  }
  
  public void buildMetadataRenderers(Context paramContext, MetadataOutput paramMetadataOutput, Looper paramLooper, int paramInt, ArrayList<Renderer> paramArrayList)
  {
    paramArrayList.add(new MetadataRenderer(paramMetadataOutput, paramLooper));
  }
  
  public void buildMiscellaneousRenderers(Context paramContext, Handler paramHandler, int paramInt, ArrayList<Renderer> paramArrayList) {}
  
  public void buildTextRenderers(Context paramContext, TextOutput paramTextOutput, Looper paramLooper, int paramInt, ArrayList<Renderer> paramArrayList)
  {
    paramArrayList.add(new TextRenderer(paramTextOutput, paramLooper));
  }
  
  public void buildVideoRenderers(Context paramContext, @Nullable DrmSessionManager<FrameworkMediaCrypto> paramDrmSessionManager, long paramLong, Handler paramHandler, VideoRendererEventListener paramVideoRendererEventListener, int paramInt, ArrayList<Renderer> paramArrayList)
  {
    paramArrayList.add(new MediaCodecVideoRenderer(paramContext, MediaCodecSelector.DEFAULT, paramLong, paramDrmSessionManager, false, paramHandler, paramVideoRendererEventListener, 50));
    if (paramInt == 0) {
      return;
    }
    int i = paramArrayList.size();
    int j = i;
    if (paramInt == 2) {
      j = i - 1;
    }
    try
    {
      try
      {
        paramArrayList.add(j, (Renderer)Class.forName("com.google.android.exoplayer2.ext.vp9.LibvpxVideoRenderer").getConstructor(new Class[] { Boolean.TYPE, Long.TYPE, Handler.class, VideoRendererEventListener.class, Integer.TYPE }).newInstance(new Object[] { Boolean.TRUE, Long.valueOf(paramLong), paramHandler, paramVideoRendererEventListener, Integer.valueOf(50) }));
        Log.i("DefaultRenderersFactory", "Loaded LibvpxVideoRenderer.");
      }
      catch (Exception paramContext)
      {
        throw new RuntimeException("Error instantiating VP9 extension", paramContext);
      }
      return;
    }
    catch (ClassNotFoundException paramContext)
    {
      for (;;) {}
    }
  }
  
  public Renderer[] createRenderers(Handler paramHandler, VideoRendererEventListener paramVideoRendererEventListener, AudioRendererEventListener paramAudioRendererEventListener, TextOutput paramTextOutput, MetadataOutput paramMetadataOutput, @Nullable DrmSessionManager<FrameworkMediaCrypto> paramDrmSessionManager)
  {
    if (paramDrmSessionManager == null) {
      paramDrmSessionManager = drmSessionManager;
    }
    ArrayList localArrayList = new ArrayList();
    buildVideoRenderers(context, paramDrmSessionManager, allowedVideoJoiningTimeMs, paramHandler, paramVideoRendererEventListener, extensionRendererMode, localArrayList);
    buildAudioRenderers(context, paramDrmSessionManager, buildAudioProcessors(), paramHandler, paramAudioRendererEventListener, extensionRendererMode, localArrayList);
    buildTextRenderers(context, paramTextOutput, paramHandler.getLooper(), extensionRendererMode, localArrayList);
    buildMetadataRenderers(context, paramMetadataOutput, paramHandler.getLooper(), extensionRendererMode, localArrayList);
    buildCameraMotionRenderers(context, extensionRendererMode, localArrayList);
    buildMiscellaneousRenderers(context, paramHandler, extensionRendererMode, localArrayList);
    return (Renderer[])localArrayList.toArray(new Renderer[localArrayList.size()]);
  }
  
  @Documented
  @Retention(RetentionPolicy.SOURCE)
  public static @interface ExtensionRendererMode {}
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.DefaultRenderersFactory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */