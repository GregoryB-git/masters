package com.google.android.exoplayer2.video;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodec;
import android.media.MediaCodec.OnFrameRenderedListener;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.BaseRenderer;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.RendererConfiguration;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.DrmInitData.SchemeData;
import com.google.android.exoplayer2.drm.DrmSessionManager;
import com.google.android.exoplayer2.drm.FrameworkMediaCrypto;
import com.google.android.exoplayer2.mediacodec.MediaCodecInfo;
import com.google.android.exoplayer2.mediacodec.MediaCodecRenderer;
import com.google.android.exoplayer2.mediacodec.MediaCodecSelector;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException;
import com.google.android.exoplayer2.mediacodec.MediaFormatUtil;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.TraceUtil;
import com.google.android.exoplayer2.util.Util;
import java.nio.ByteBuffer;
import java.util.List;
import z2;

@TargetApi(16)
public class MediaCodecVideoRenderer
  extends MediaCodecRenderer
{
  private static final float INITIAL_FORMAT_MAX_INPUT_SIZE_SCALE_FACTOR = 1.5F;
  private static final String KEY_CROP_BOTTOM = "crop-bottom";
  private static final String KEY_CROP_LEFT = "crop-left";
  private static final String KEY_CROP_RIGHT = "crop-right";
  private static final String KEY_CROP_TOP = "crop-top";
  private static final int MAX_PENDING_OUTPUT_STREAM_OFFSET_COUNT = 10;
  private static final int[] STANDARD_LONG_EDGE_VIDEO_PX = { 1920, 1600, 1440, 1280, 960, 854, 640, 540, 480 };
  private static final String TAG = "MediaCodecVideoRenderer";
  private static boolean deviceNeedsSetOutputSurfaceWorkaround;
  private static boolean evaluatedDeviceNeedsSetOutputSurfaceWorkaround;
  private final long allowedJoiningTimeMs;
  private int buffersInCodecCount;
  private CodecMaxValues codecMaxValues;
  private boolean codecNeedsSetOutputSurfaceWorkaround;
  private int consecutiveDroppedFrameCount;
  private final Context context;
  private int currentHeight;
  private float currentPixelWidthHeightRatio;
  private int currentUnappliedRotationDegrees;
  private int currentWidth;
  private final boolean deviceNeedsAutoFrcWorkaround;
  private long droppedFrameAccumulationStartTimeMs;
  private int droppedFrames;
  private Surface dummySurface;
  private final VideoRendererEventListener.EventDispatcher eventDispatcher;
  @Nullable
  private VideoFrameMetadataListener frameMetadataListener;
  private final VideoFrameReleaseTimeHelper frameReleaseTimeHelper;
  private long initialPositionUs;
  private long joiningDeadlineMs;
  private long lastInputTimeUs;
  private long lastRenderTimeUs;
  private final int maxDroppedFramesToNotify;
  private long outputStreamOffsetUs;
  private int pendingOutputStreamOffsetCount;
  private final long[] pendingOutputStreamOffsetsUs;
  private final long[] pendingOutputStreamSwitchTimesUs;
  private float pendingPixelWidthHeightRatio;
  private int pendingRotationDegrees;
  private boolean renderedFirstFrame;
  private int reportedHeight;
  private float reportedPixelWidthHeightRatio;
  private int reportedUnappliedRotationDegrees;
  private int reportedWidth;
  private int scalingMode;
  private Surface surface;
  private boolean tunneling;
  private int tunnelingAudioSessionId;
  public OnFrameRenderedListenerV23 tunnelingOnFrameRenderedListener;
  
  public MediaCodecVideoRenderer(Context paramContext, MediaCodecSelector paramMediaCodecSelector)
  {
    this(paramContext, paramMediaCodecSelector, 0L);
  }
  
  public MediaCodecVideoRenderer(Context paramContext, MediaCodecSelector paramMediaCodecSelector, long paramLong)
  {
    this(paramContext, paramMediaCodecSelector, paramLong, null, null, -1);
  }
  
  public MediaCodecVideoRenderer(Context paramContext, MediaCodecSelector paramMediaCodecSelector, long paramLong, @Nullable Handler paramHandler, @Nullable VideoRendererEventListener paramVideoRendererEventListener, int paramInt)
  {
    this(paramContext, paramMediaCodecSelector, paramLong, null, false, paramHandler, paramVideoRendererEventListener, paramInt);
  }
  
  public MediaCodecVideoRenderer(Context paramContext, MediaCodecSelector paramMediaCodecSelector, long paramLong, @Nullable DrmSessionManager<FrameworkMediaCrypto> paramDrmSessionManager, boolean paramBoolean, @Nullable Handler paramHandler, @Nullable VideoRendererEventListener paramVideoRendererEventListener, int paramInt)
  {
    super(2, paramMediaCodecSelector, paramDrmSessionManager, paramBoolean, 30.0F);
    allowedJoiningTimeMs = paramLong;
    maxDroppedFramesToNotify = paramInt;
    paramContext = paramContext.getApplicationContext();
    context = paramContext;
    frameReleaseTimeHelper = new VideoFrameReleaseTimeHelper(paramContext);
    eventDispatcher = new VideoRendererEventListener.EventDispatcher(paramHandler, paramVideoRendererEventListener);
    deviceNeedsAutoFrcWorkaround = deviceNeedsAutoFrcWorkaround();
    pendingOutputStreamOffsetsUs = new long[10];
    pendingOutputStreamSwitchTimesUs = new long[10];
    outputStreamOffsetUs = -9223372036854775807L;
    lastInputTimeUs = -9223372036854775807L;
    joiningDeadlineMs = -9223372036854775807L;
    currentWidth = -1;
    currentHeight = -1;
    currentPixelWidthHeightRatio = -1.0F;
    pendingPixelWidthHeightRatio = -1.0F;
    scalingMode = 1;
    clearReportedVideoSize();
  }
  
  private void clearRenderedFirstFrame()
  {
    renderedFirstFrame = false;
    if ((Util.SDK_INT >= 23) && (tunneling))
    {
      MediaCodec localMediaCodec = getCodec();
      if (localMediaCodec != null) {
        tunnelingOnFrameRenderedListener = new OnFrameRenderedListenerV23(localMediaCodec, null);
      }
    }
  }
  
  private void clearReportedVideoSize()
  {
    reportedWidth = -1;
    reportedHeight = -1;
    reportedPixelWidthHeightRatio = -1.0F;
    reportedUnappliedRotationDegrees = -1;
  }
  
  @TargetApi(21)
  private static void configureTunnelingV21(MediaFormat paramMediaFormat, int paramInt)
  {
    paramMediaFormat.setFeatureEnabled("tunneled-playback", true);
    paramMediaFormat.setInteger("audio-session-id", paramInt);
  }
  
  private static boolean deviceNeedsAutoFrcWorkaround()
  {
    boolean bool;
    if ((Util.SDK_INT <= 22) && ("foster".equals(Util.DEVICE)) && ("NVIDIA".equals(Util.MANUFACTURER))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private static int getCodecMaxInputSize(MediaCodecInfo paramMediaCodecInfo, String paramString, int paramInt1, int paramInt2)
  {
    if ((paramInt1 != -1) && (paramInt2 != -1))
    {
      paramString.getClass();
      int i = paramString.hashCode();
      int j = 4;
      switch (i)
      {
      }
      do
      {
        do
        {
          do
          {
            do
            {
              do
              {
                do
                {
                  i = -1;
                  break;
                } while (!paramString.equals("video/x-vnd.on2.vp9"));
                i = 5;
                break;
              } while (!paramString.equals("video/x-vnd.on2.vp8"));
              i = 4;
              break;
            } while (!paramString.equals("video/avc"));
            i = 3;
            break;
          } while (!paramString.equals("video/mp4v-es"));
          i = 2;
          break;
        } while (!paramString.equals("video/hevc"));
        i = 1;
        break;
      } while (!paramString.equals("video/3gpp"));
      i = 0;
      switch (i)
      {
      default: 
        return -1;
      case 3: 
        paramString = Util.MODEL;
        if ((!"BRAVIA 4K 2015".equals(paramString)) && ((!"Amazon".equals(Util.MANUFACTURER)) || ((!"KFSOWI".equals(paramString)) && ((!"AFTS".equals(paramString)) || (!secure)))))
        {
          paramInt1 = Util.ceilDivide(paramInt1, 16);
          paramInt1 = Util.ceilDivide(paramInt2, 16) * paramInt1 * 16 * 16;
        }
        else
        {
          return -1;
        }
        break;
      case 1: 
      case 5: 
        paramInt2 = paramInt1 * paramInt2;
        paramInt1 = j;
        break;
      case 0: 
      case 2: 
      case 4: 
        paramInt1 *= paramInt2;
      }
      i = 2;
      paramInt2 = paramInt1;
      paramInt1 = i;
      return paramInt2 * 3 / (paramInt1 * 2);
    }
    return -1;
  }
  
  private static Point getCodecMaxSize(MediaCodecInfo paramMediaCodecInfo, Format paramFormat)
    throws MediaCodecUtil.DecoderQueryException
  {
    int i = height;
    int j = width;
    int k = 0;
    int m;
    if (i > j) {
      m = 1;
    } else {
      m = 0;
    }
    int n;
    if (m != 0) {
      n = i;
    } else {
      n = j;
    }
    if (m != 0) {
      i = j;
    }
    float f1 = i / n;
    int[] arrayOfInt = STANDARD_LONG_EDGE_VIDEO_PX;
    int i1 = arrayOfInt.length;
    for (j = k; j < i1; j++)
    {
      int i2 = arrayOfInt[j];
      int i3 = (int)(i2 * f1);
      if ((i2 <= n) || (i3 <= i)) {
        break;
      }
      if (Util.SDK_INT >= 21)
      {
        if (m != 0) {
          k = i3;
        } else {
          k = i2;
        }
        if (m != 0) {
          i3 = i2;
        }
        Point localPoint = paramMediaCodecInfo.alignVideoSizeV21(k, i3);
        float f2 = frameRate;
        if (paramMediaCodecInfo.isVideoSizeAndRateSupportedV21(x, y, f2)) {
          return localPoint;
        }
      }
      else
      {
        k = Util.ceilDivide(i2, 16) * 16;
        i3 = Util.ceilDivide(i3, 16) * 16;
        if (k * i3 <= MediaCodecUtil.maxH264DecodableFrameSize())
        {
          if (m != 0) {
            n = i3;
          } else {
            n = k;
          }
          if (m == 0) {
            k = i3;
          }
          return new Point(n, k);
        }
      }
    }
    return null;
  }
  
  private static int getMaxInputSize(MediaCodecInfo paramMediaCodecInfo, Format paramFormat)
  {
    if (maxInputSize != -1)
    {
      int i = initializationData.size();
      int j = 0;
      int k = 0;
      while (j < i)
      {
        k += ((byte[])initializationData.get(j)).length;
        j++;
      }
      return maxInputSize + k;
    }
    return getCodecMaxInputSize(paramMediaCodecInfo, sampleMimeType, width, height);
  }
  
  private static boolean isBufferLate(long paramLong)
  {
    boolean bool;
    if (paramLong < -30000L) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private static boolean isBufferVeryLate(long paramLong)
  {
    boolean bool;
    if (paramLong < -500000L) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private void maybeNotifyDroppedFrames()
  {
    if (droppedFrames > 0)
    {
      long l1 = SystemClock.elapsedRealtime();
      long l2 = droppedFrameAccumulationStartTimeMs;
      eventDispatcher.droppedFrames(droppedFrames, l1 - l2);
      droppedFrames = 0;
      droppedFrameAccumulationStartTimeMs = l1;
    }
  }
  
  private void maybeNotifyVideoSizeChanged()
  {
    int i = currentWidth;
    if (((i != -1) || (currentHeight != -1)) && ((reportedWidth != i) || (reportedHeight != currentHeight) || (reportedUnappliedRotationDegrees != currentUnappliedRotationDegrees) || (reportedPixelWidthHeightRatio != currentPixelWidthHeightRatio)))
    {
      eventDispatcher.videoSizeChanged(i, currentHeight, currentUnappliedRotationDegrees, currentPixelWidthHeightRatio);
      reportedWidth = currentWidth;
      reportedHeight = currentHeight;
      reportedUnappliedRotationDegrees = currentUnappliedRotationDegrees;
      reportedPixelWidthHeightRatio = currentPixelWidthHeightRatio;
    }
  }
  
  private void maybeRenotifyRenderedFirstFrame()
  {
    if (renderedFirstFrame) {
      eventDispatcher.renderedFirstFrame(surface);
    }
  }
  
  private void maybeRenotifyVideoSizeChanged()
  {
    int i = reportedWidth;
    if ((i != -1) || (reportedHeight != -1)) {
      eventDispatcher.videoSizeChanged(i, reportedHeight, reportedUnappliedRotationDegrees, reportedPixelWidthHeightRatio);
    }
  }
  
  private void notifyFrameMetadataListener(long paramLong1, long paramLong2, Format paramFormat)
  {
    VideoFrameMetadataListener localVideoFrameMetadataListener = frameMetadataListener;
    if (localVideoFrameMetadataListener != null) {
      localVideoFrameMetadataListener.onVideoFrameAboutToBeRendered(paramLong1, paramLong2, paramFormat);
    }
  }
  
  private void processOutputFormat(MediaCodec paramMediaCodec, int paramInt1, int paramInt2)
  {
    currentWidth = paramInt1;
    currentHeight = paramInt2;
    float f = pendingPixelWidthHeightRatio;
    currentPixelWidthHeightRatio = f;
    if (Util.SDK_INT >= 21)
    {
      int i = pendingRotationDegrees;
      if ((i == 90) || (i == 270))
      {
        currentWidth = paramInt2;
        currentHeight = paramInt1;
        currentPixelWidthHeightRatio = (1.0F / f);
      }
    }
    else
    {
      currentUnappliedRotationDegrees = pendingRotationDegrees;
    }
    paramMediaCodec.setVideoScalingMode(scalingMode);
  }
  
  private void setJoiningDeadlineMs()
  {
    long l;
    if (allowedJoiningTimeMs > 0L) {
      l = SystemClock.elapsedRealtime() + allowedJoiningTimeMs;
    } else {
      l = -9223372036854775807L;
    }
    joiningDeadlineMs = l;
  }
  
  @TargetApi(23)
  private static void setOutputSurfaceV23(MediaCodec paramMediaCodec, Surface paramSurface)
  {
    paramMediaCodec.setOutputSurface(paramSurface);
  }
  
  private void setSurface(Surface paramSurface)
    throws ExoPlaybackException
  {
    Object localObject = paramSurface;
    if (paramSurface == null)
    {
      localObject = dummySurface;
      if (localObject == null)
      {
        MediaCodecInfo localMediaCodecInfo = getCodecInfo();
        localObject = paramSurface;
        if (localMediaCodecInfo != null)
        {
          localObject = paramSurface;
          if (shouldUseDummySurface(localMediaCodecInfo))
          {
            localObject = DummySurface.newInstanceV17(context, secure);
            dummySurface = ((Surface)localObject);
          }
        }
      }
    }
    if (surface != localObject)
    {
      surface = ((Surface)localObject);
      int i = getState();
      if ((i == 1) || (i == 2))
      {
        paramSurface = getCodec();
        if ((Util.SDK_INT >= 23) && (paramSurface != null) && (localObject != null) && (!codecNeedsSetOutputSurfaceWorkaround))
        {
          setOutputSurfaceV23(paramSurface, (Surface)localObject);
        }
        else
        {
          releaseCodec();
          maybeInitCodec();
        }
      }
      if ((localObject != null) && (localObject != dummySurface))
      {
        maybeRenotifyVideoSizeChanged();
        clearRenderedFirstFrame();
        if (i == 2) {
          setJoiningDeadlineMs();
        }
      }
      else
      {
        clearReportedVideoSize();
        clearRenderedFirstFrame();
      }
    }
    else if ((localObject != null) && (localObject != dummySurface))
    {
      maybeRenotifyVideoSizeChanged();
      maybeRenotifyRenderedFirstFrame();
    }
  }
  
  private boolean shouldUseDummySurface(MediaCodecInfo paramMediaCodecInfo)
  {
    boolean bool;
    if ((Util.SDK_INT >= 23) && (!tunneling) && (!codecNeedsSetOutputSurfaceWorkaround(name)) && ((!secure) || (DummySurface.isSecureSupported(context)))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public int canKeepCodec(MediaCodec paramMediaCodec, MediaCodecInfo paramMediaCodecInfo, Format paramFormat1, Format paramFormat2)
  {
    int i = 1;
    if (paramMediaCodecInfo.isSeamlessAdaptationSupported(paramFormat1, paramFormat2, true))
    {
      int j = width;
      paramMediaCodec = codecMaxValues;
      if ((j <= width) && (height <= height) && (getMaxInputSize(paramMediaCodecInfo, paramFormat2) <= codecMaxValues.inputSize))
      {
        if (!paramFormat1.initializationDataEquals(paramFormat2)) {
          i = 3;
        }
        return i;
      }
    }
    return 0;
  }
  
  public boolean codecNeedsSetOutputSurfaceWorkaround(String paramString)
  {
    int i = Util.SDK_INT;
    int j = 27;
    int k = 0;
    if ((i < 27) && (!paramString.startsWith("OMX.google"))) {
      try
      {
        if (!evaluatedDeviceNeedsSetOutputSurfaceWorkaround)
        {
          paramString = Util.DEVICE;
          switch (paramString.hashCode())
          {
          default: 
            break;
          case 2048319463: 
            if (paramString.equals("HWVNS-H")) {
              j = 50;
            }
            break;
          case 2047252157: 
            if (paramString.equals("ELUGA_Prim")) {
              j = 25;
            }
            break;
          case 2047190025: 
            if (paramString.equals("ELUGA_Note")) {
              j = 24;
            }
            break;
          case 2030379515: 
            if (paramString.equals("HWCAM-H")) {
              j = 49;
            }
            break;
          case 2029784656: 
            if (paramString.equals("HWBLN-H")) {
              j = 48;
            }
            break;
          case 1977196784: 
            if (paramString.equals("Infinix-X572")) {
              j = 52;
            }
            break;
          case 1906253259: 
            if (paramString.equals("PB2-670M")) {
              j = 79;
            }
            break;
          case 1865889110: 
            if (paramString.equals("santoni")) {
              j = 95;
            }
            break;
          case 1709443163: 
            if (paramString.equals("iball8735_9806")) {
              j = 51;
            }
            break;
          case 1691543273: 
            if (paramString.equals("CPH1609")) {
              j = 17;
            }
            break;
          case 1522194893: 
            if (paramString.equals("woods_f")) {
              j = 111;
            }
            break;
          case 1349174697: 
            if (paramString.equals("htc_e56ml_dtul")) {
              j = 46;
            }
            break;
          case 1306947716: 
            if (!paramString.equals("EverStar_S")) {
              break;
            }
            break;
          case 1280332038: 
            if (paramString.equals("hwALE-H")) {
              j = 47;
            }
            break;
          case 1176899427: 
            if (paramString.equals("itel_S41")) {
              j = 54;
            }
            break;
          case 1150207623: 
            if (paramString.equals("LS-5017")) {
              j = 59;
            }
            break;
          case 1060579533: 
            if (paramString.equals("panell_d")) {
              j = 75;
            }
            break;
          case 958008161: 
            if (paramString.equals("j2xlteins")) {
              j = 55;
            }
            break;
          case 917340916: 
            if (paramString.equals("A7000plus")) {
              j = 7;
            }
            break;
          case 835649806: 
            if (paramString.equals("manning")) {
              j = 61;
            }
            break;
          case 794040393: 
            if (paramString.equals("GIONEE_WBL7519")) {
              j = 44;
            }
            break;
          case 794038622: 
            if (paramString.equals("GIONEE_WBL7365")) {
              j = 43;
            }
            break;
          case 793982701: 
            if (paramString.equals("GIONEE_WBL5708")) {
              j = 42;
            }
            break;
          case 507412548: 
            if (paramString.equals("QM16XE_U")) {
              j = 93;
            }
            break;
          case 407160593: 
            if (paramString.equals("Pixi5-10_4G")) {
              j = 85;
            }
            break;
          case 316246818: 
            if (paramString.equals("TB3-850M")) {
              j = 103;
            }
            break;
          case 316246811: 
            if (paramString.equals("TB3-850F")) {
              j = 102;
            }
            break;
          case 316215116: 
            if (paramString.equals("TB3-730X")) {
              j = 101;
            }
            break;
          case 316215098: 
            if (paramString.equals("TB3-730F")) {
              j = 100;
            }
            break;
          case 308517133: 
            if (paramString.equals("A7020a48")) {
              j = 9;
            }
            break;
          case 307593612: 
            if (paramString.equals("A7010a48")) {
              j = 8;
            }
            break;
          case 287431619: 
            if (paramString.equals("griffin")) {
              j = 45;
            }
            break;
          case 245388979: 
            if (paramString.equals("marino_f")) {
              j = 62;
            }
            break;
          case 182191441: 
            if (paramString.equals("CPY83_I00")) {
              j = 18;
            }
            break;
          case 165221241: 
            if (paramString.equals("A2016a40")) {
              j = 5;
            }
            break;
          case 102844228: 
            if (paramString.equals("le_x6")) {
              j = 58;
            }
            break;
          case 82882791: 
            if (paramString.equals("X3_HK")) {
              j = 113;
            }
            break;
          case 80963634: 
            if (paramString.equals("V23GB")) {
              j = 106;
            }
            break;
          case 76404911: 
            if (paramString.equals("Q4310")) {
              j = 91;
            }
            break;
          case 76404105: 
            if (paramString.equals("Q4260")) {
              j = 89;
            }
            break;
          case 76402249: 
            if (paramString.equals("PRO7S")) {
              j = 87;
            }
            break;
          case 66216390: 
            if (paramString.equals("F3311")) {
              j = 34;
            }
            break;
          case 66215433: 
            if (paramString.equals("F3215")) {
              j = 33;
            }
            break;
          case 66215431: 
            if (paramString.equals("F3213")) {
              j = 32;
            }
            break;
          case 66215429: 
            if (paramString.equals("F3211")) {
              j = 31;
            }
            break;
          case 66214473: 
            if (paramString.equals("F3116")) {
              j = 30;
            }
            break;
          case 66214470: 
            if (paramString.equals("F3113")) {
              j = 29;
            }
            break;
          case 66214468: 
            if (paramString.equals("F3111")) {
              j = 28;
            }
            break;
          case 65355429: 
            if (paramString.equals("E5643")) {
              j = 22;
            }
            break;
          case 61542055: 
            if (paramString.equals("A1601")) {
              j = 4;
            }
            break;
          case 55178625: 
            if (paramString.equals("Aura_Note_2")) {
              j = 11;
            }
            break;
          case 41325051: 
            if (paramString.equals("MEIZU_M5")) {
              j = 63;
            }
            break;
          case 3386211: 
            if (paramString.equals("p212")) {
              j = 72;
            }
            break;
          case 3351335: 
            if (paramString.equals("mido")) {
              j = 65;
            }
            break;
          case 2689555: 
            if (paramString.equals("XE2X")) {
              j = 114;
            }
            break;
          case 2464648: 
            if (paramString.equals("Q427")) {
              j = 90;
            }
            break;
          case 2463773: 
            if (paramString.equals("Q350")) {
              j = 88;
            }
            break;
          case 2436959: 
            if (paramString.equals("P681")) {
              j = 73;
            }
            break;
          case 1514185: 
            if (paramString.equals("1714")) {
              j = 2;
            }
            break;
          case 1514184: 
            if (paramString.equals("1713")) {
              j = 1;
            }
            break;
          case 1513190: 
            if (paramString.equals("1601")) {
              j = 0;
            }
            break;
          case 101481: 
            if (paramString.equals("flo")) {
              j = 35;
            }
            break;
          case 99329: 
            if (paramString.equals("deb")) {
              j = 21;
            }
            break;
          case 98848: 
            if (paramString.equals("cv3")) {
              j = 20;
            }
            break;
          case 98846: 
            if (paramString.equals("cv1")) {
              j = 19;
            }
            break;
          case 88274: 
            if (paramString.equals("Z80")) {
              j = 117;
            }
            break;
          case 80618: 
            if (paramString.equals("QX1")) {
              j = 94;
            }
            break;
          case 79305: 
            if (paramString.equals("PLE")) {
              j = 86;
            }
            break;
          case 78669: 
            if (paramString.equals("P85")) {
              j = 74;
            }
            break;
          case 76779: 
            if (paramString.equals("MX6")) {
              j = 66;
            }
            break;
          case 75739: 
            if (paramString.equals("M5c")) {
              j = 60;
            }
            break;
          case 73405: 
            if (paramString.equals("JGZ")) {
              j = 56;
            }
            break;
          case 3483: 
            if (paramString.equals("mh")) {
              j = 64;
            }
            break;
          case 2719: 
            if (paramString.equals("V5")) {
              j = 107;
            }
            break;
          case 2715: 
            if (paramString.equals("V1")) {
              j = 105;
            }
            break;
          case 2564: 
            if (paramString.equals("Q5")) {
              j = 92;
            }
            break;
          case 2126: 
            if (paramString.equals("C1")) {
              j = 14;
            }
            break;
          case -56598463: 
            if (paramString.equals("woods_fn")) {
              j = 112;
            }
            break;
          case -173639913: 
            if (paramString.equals("ELUGA_A3_Pro")) {
              j = 23;
            }
            break;
          case -277133239: 
            if (paramString.equals("Z12_PRO")) {
              j = 116;
            }
            break;
          case -282781963: 
            if (paramString.equals("BLACK-1X")) {
              j = 12;
            }
            break;
          case -290434366: 
            if (paramString.equals("taido_row")) {
              j = 99;
            }
            break;
          case -430914369: 
            if (paramString.equals("Pixi4-7_3G")) {
              j = 84;
            }
            break;
          case -521118391: 
            if (paramString.equals("GIONEE_GBL7360")) {
              j = 38;
            }
            break;
          case -575125681: 
            if (paramString.equals("GiONEE_CBL7513")) {
              j = 36;
            }
            break;
          case -782144577: 
            if (paramString.equals("OnePlus5T")) {
              j = 71;
            }
            break;
          case -788334647: 
            if (paramString.equals("whyred")) {
              j = 110;
            }
            break;
          case -794946968: 
            if (paramString.equals("watson")) {
              j = 109;
            }
            break;
          case -797483286: 
            if (paramString.equals("SVP-DTV15")) {
              j = 97;
            }
            break;
          case -821392978: 
            if (paramString.equals("A7000-a")) {
              j = 6;
            }
            break;
          case -842500323: 
            if (paramString.equals("nicklaus_f")) {
              j = 68;
            }
            break;
          case -879245230: 
            if (paramString.equals("tcl_eu")) {
              j = 104;
            }
            break;
          case -958336948: 
            if (paramString.equals("ELUGA_Ray_X")) {
              j = 26;
            }
            break;
          case -965403638: 
            if (paramString.equals("s905x018")) {
              j = 98;
            }
            break;
          case -993250464: 
            if (paramString.equals("A10-70F")) {
              j = 3;
            }
            break;
          case -1052835013: 
            if (paramString.equals("namath")) {
              j = 67;
            }
            break;
          case -1139198265: 
            if (paramString.equals("Slate_Pro")) {
              j = 96;
            }
            break;
          case -1180384755: 
            if (paramString.equals("iris60")) {
              j = 53;
            }
            break;
          case -1217592143: 
            if (paramString.equals("BRAVIA_ATV2")) {
              j = 13;
            }
            break;
          case -1320080169: 
            if (paramString.equals("GiONEE_GBL7319")) {
              j = 37;
            }
            break;
          case -1481772729: 
            if (paramString.equals("panell_dt")) {
              j = 78;
            }
            break;
          case -1481772730: 
            if (paramString.equals("panell_ds")) {
              j = 77;
            }
            break;
          case -1481772737: 
            if (paramString.equals("panell_dl")) {
              j = 76;
            }
            break;
          case -1554255044: 
            if (paramString.equals("vernee_M5")) {
              j = 108;
            }
            break;
          case -1615810839: 
            if (paramString.equals("Phantom6")) {
              j = 83;
            }
            break;
          case -1680025915: 
            if (paramString.equals("ComioS1")) {
              j = 15;
            }
            break;
          case -1696512866: 
            if (paramString.equals("XT1663")) {
              j = 115;
            }
            break;
          case -1931988508: 
            if (paramString.equals("AquaPowerM")) {
              j = 10;
            }
            break;
          case -1936688065: 
            if (paramString.equals("PGN611")) {
              j = 82;
            }
            break;
          case -1936688066: 
            if (paramString.equals("PGN610")) {
              j = 81;
            }
            break;
          case -1936688988: 
            if (paramString.equals("PGN528")) {
              j = 80;
            }
            break;
          case -1978990237: 
            if (paramString.equals("NX573J")) {
              j = 70;
            }
            break;
          case -1978993182: 
            if (paramString.equals("NX541J")) {
              j = 69;
            }
            break;
          case -2022874474: 
            if (paramString.equals("CP8676_I02")) {
              j = 16;
            }
            break;
          case -2097309513: 
            if (paramString.equals("K50a40")) {
              j = 57;
            }
            break;
          case -2144781160: 
            if (paramString.equals("GIONEE_SWW1631")) {
              j = 41;
            }
            break;
          case -2144781185: 
            if (paramString.equals("GIONEE_SWW1627")) {
              j = 40;
            }
            break;
          case -2144781245: 
            if (paramString.equals("GIONEE_SWW1609")) {
              j = 39;
            }
            break;
          }
          j = -1;
          switch (j)
          {
          default: 
            break;
          case 0: 
          case 1: 
          case 2: 
          case 3: 
          case 4: 
          case 5: 
          case 6: 
          case 7: 
          case 8: 
          case 9: 
          case 10: 
          case 11: 
          case 12: 
          case 13: 
          case 14: 
          case 15: 
          case 16: 
          case 17: 
          case 18: 
          case 19: 
          case 20: 
          case 21: 
          case 22: 
          case 23: 
          case 24: 
          case 25: 
          case 26: 
          case 27: 
          case 28: 
          case 29: 
          case 30: 
          case 31: 
          case 32: 
          case 33: 
          case 34: 
          case 35: 
          case 36: 
          case 37: 
          case 38: 
          case 39: 
          case 40: 
          case 41: 
          case 42: 
          case 43: 
          case 44: 
          case 45: 
          case 46: 
          case 47: 
          case 48: 
          case 49: 
          case 50: 
          case 51: 
          case 52: 
          case 53: 
          case 54: 
          case 55: 
          case 56: 
          case 57: 
          case 58: 
          case 59: 
          case 60: 
          case 61: 
          case 62: 
          case 63: 
          case 64: 
          case 65: 
          case 66: 
          case 67: 
          case 68: 
          case 69: 
          case 70: 
          case 71: 
          case 72: 
          case 73: 
          case 74: 
          case 75: 
          case 76: 
          case 77: 
          case 78: 
          case 79: 
          case 80: 
          case 81: 
          case 82: 
          case 83: 
          case 84: 
          case 85: 
          case 86: 
          case 87: 
          case 88: 
          case 89: 
          case 90: 
          case 91: 
          case 92: 
          case 93: 
          case 94: 
          case 95: 
          case 96: 
          case 97: 
          case 98: 
          case 99: 
          case 100: 
          case 101: 
          case 102: 
          case 103: 
          case 104: 
          case 105: 
          case 106: 
          case 107: 
          case 108: 
          case 109: 
          case 110: 
          case 111: 
          case 112: 
          case 113: 
          case 114: 
          case 115: 
          case 116: 
          case 117: 
            deviceNeedsSetOutputSurfaceWorkaround = true;
          }
          paramString = Util.MODEL;
          j = paramString.hashCode();
          if (j != 2006354)
          {
            if ((j == 2006367) && (paramString.equals("AFTN")))
            {
              j = 1;
              break label3438;
            }
          }
          else if (paramString.equals("AFTA"))
          {
            j = k;
            break label3438;
          }
          j = -1;
          label3438:
          if ((j == 0) || (j == 1)) {
            deviceNeedsSetOutputSurfaceWorkaround = true;
          }
          evaluatedDeviceNeedsSetOutputSurfaceWorkaround = true;
        }
        return deviceNeedsSetOutputSurfaceWorkaround;
      }
      finally {}
    }
    return false;
  }
  
  public void configureCodec(MediaCodecInfo paramMediaCodecInfo, MediaCodec paramMediaCodec, Format paramFormat, MediaCrypto paramMediaCrypto, float paramFloat)
    throws MediaCodecUtil.DecoderQueryException
  {
    CodecMaxValues localCodecMaxValues = getCodecMaxValues(paramMediaCodecInfo, paramFormat, getStreamFormats());
    codecMaxValues = localCodecMaxValues;
    paramFormat = getMediaFormat(paramFormat, localCodecMaxValues, paramFloat, deviceNeedsAutoFrcWorkaround, tunnelingAudioSessionId);
    if (surface == null)
    {
      Assertions.checkState(shouldUseDummySurface(paramMediaCodecInfo));
      if (dummySurface == null) {
        dummySurface = DummySurface.newInstanceV17(context, secure);
      }
      surface = dummySurface;
    }
    paramMediaCodec.configure(paramFormat, surface, paramMediaCrypto, 0);
    if ((Util.SDK_INT >= 23) && (tunneling)) {
      tunnelingOnFrameRenderedListener = new OnFrameRenderedListenerV23(paramMediaCodec, null);
    }
  }
  
  public void dropOutputBuffer(MediaCodec paramMediaCodec, int paramInt, long paramLong)
  {
    TraceUtil.beginSection("dropVideoBuffer");
    paramMediaCodec.releaseOutputBuffer(paramInt, false);
    TraceUtil.endSection();
    updateDroppedBufferCounters(1);
  }
  
  @CallSuper
  public void flushCodec()
    throws ExoPlaybackException
  {
    super.flushCodec();
    buffersInCodecCount = 0;
  }
  
  public CodecMaxValues getCodecMaxValues(MediaCodecInfo paramMediaCodecInfo, Format paramFormat, Format[] paramArrayOfFormat)
    throws MediaCodecUtil.DecoderQueryException
  {
    int i = width;
    int j = height;
    int k = getMaxInputSize(paramMediaCodecInfo, paramFormat);
    if (paramArrayOfFormat.length == 1)
    {
      m = k;
      if (k != -1)
      {
        n = getCodecMaxInputSize(paramMediaCodecInfo, sampleMimeType, width, height);
        m = k;
        if (n != -1) {
          m = Math.min((int)(k * 1.5F), n);
        }
      }
      return new CodecMaxValues(i, j, m);
    }
    int i1 = paramArrayOfFormat.length;
    int n = 0;
    int i2 = n;
    int m = j;
    while (n < i1)
    {
      Format localFormat = paramArrayOfFormat[n];
      int i3 = i;
      int i4 = m;
      i5 = k;
      j = i2;
      if (paramMediaCodecInfo.isSeamlessAdaptationSupported(paramFormat, localFormat, false))
      {
        i5 = width;
        if ((i5 != -1) && (height != -1)) {
          j = 0;
        } else {
          j = 1;
        }
        j = i2 | j;
        i3 = Math.max(i, i5);
        i4 = Math.max(m, height);
        i5 = Math.max(k, getMaxInputSize(paramMediaCodecInfo, localFormat));
      }
      n++;
      i = i3;
      m = i4;
      k = i5;
      i2 = j;
    }
    int i5 = i;
    j = m;
    n = k;
    if (i2 != 0)
    {
      paramArrayOfFormat = new StringBuilder();
      paramArrayOfFormat.append("Resolutions unknown. Codec max resolution: ");
      paramArrayOfFormat.append(i);
      paramArrayOfFormat.append("x");
      paramArrayOfFormat.append(m);
      Log.w("MediaCodecVideoRenderer", paramArrayOfFormat.toString());
      paramArrayOfFormat = getCodecMaxSize(paramMediaCodecInfo, paramFormat);
      i5 = i;
      j = m;
      n = k;
      if (paramArrayOfFormat != null)
      {
        i5 = Math.max(i, x);
        j = Math.max(m, y);
        n = Math.max(k, getCodecMaxInputSize(paramMediaCodecInfo, sampleMimeType, i5, j));
        paramMediaCodecInfo = new StringBuilder();
        paramMediaCodecInfo.append("Codec max resolution adjusted to: ");
        paramMediaCodecInfo.append(i5);
        paramMediaCodecInfo.append("x");
        paramMediaCodecInfo.append(j);
        Log.w("MediaCodecVideoRenderer", paramMediaCodecInfo.toString());
      }
    }
    return new CodecMaxValues(i5, j, n);
  }
  
  public boolean getCodecNeedsEosPropagation()
  {
    return tunneling;
  }
  
  public float getCodecOperatingRate(float paramFloat, Format paramFormat, Format[] paramArrayOfFormat)
  {
    int i = paramArrayOfFormat.length;
    float f1 = -1.0F;
    int j = 0;
    float f4;
    for (float f2 = -1.0F; j < i; f2 = f4)
    {
      float f3 = frameRate;
      f4 = f2;
      if (f3 != -1.0F) {
        f4 = Math.max(f2, f3);
      }
      j++;
    }
    if (f2 == -1.0F) {
      paramFloat = f1;
    } else {
      paramFloat = f2 * paramFloat;
    }
    return paramFloat;
  }
  
  @SuppressLint({"InlinedApi"})
  public MediaFormat getMediaFormat(Format paramFormat, CodecMaxValues paramCodecMaxValues, float paramFloat, boolean paramBoolean, int paramInt)
  {
    MediaFormat localMediaFormat = new MediaFormat();
    localMediaFormat.setString("mime", sampleMimeType);
    localMediaFormat.setInteger("width", width);
    localMediaFormat.setInteger("height", height);
    MediaFormatUtil.setCsdBuffers(localMediaFormat, initializationData);
    MediaFormatUtil.maybeSetFloat(localMediaFormat, "frame-rate", frameRate);
    MediaFormatUtil.maybeSetInteger(localMediaFormat, "rotation-degrees", rotationDegrees);
    MediaFormatUtil.maybeSetColorInfo(localMediaFormat, colorInfo);
    localMediaFormat.setInteger("max-width", width);
    localMediaFormat.setInteger("max-height", height);
    MediaFormatUtil.maybeSetInteger(localMediaFormat, "max-input-size", inputSize);
    if (Util.SDK_INT >= 23)
    {
      localMediaFormat.setInteger("priority", 0);
      if (paramFloat != -1.0F) {
        localMediaFormat.setFloat("operating-rate", paramFloat);
      }
    }
    if (paramBoolean) {
      localMediaFormat.setInteger("auto-frc", 0);
    }
    if (paramInt != 0) {
      configureTunnelingV21(localMediaFormat, paramInt);
    }
    return localMediaFormat;
  }
  
  public long getOutputStreamOffsetUs()
  {
    return outputStreamOffsetUs;
  }
  
  public void handleMessage(int paramInt, @Nullable Object paramObject)
    throws ExoPlaybackException
  {
    if (paramInt == 1)
    {
      setSurface((Surface)paramObject);
    }
    else if (paramInt == 4)
    {
      scalingMode = ((Integer)paramObject).intValue();
      paramObject = getCodec();
      if (paramObject != null) {
        ((MediaCodec)paramObject).setVideoScalingMode(scalingMode);
      }
    }
    else if (paramInt == 6)
    {
      frameMetadataListener = ((VideoFrameMetadataListener)paramObject);
    }
    else
    {
      super.handleMessage(paramInt, paramObject);
    }
  }
  
  public boolean isReady()
  {
    if (super.isReady()) {
      if (!renderedFirstFrame)
      {
        Surface localSurface = dummySurface;
        if (((localSurface == null) || (surface != localSurface)) && (getCodec() != null) && (!tunneling)) {}
      }
      else
      {
        joiningDeadlineMs = -9223372036854775807L;
        return true;
      }
    }
    if (joiningDeadlineMs == -9223372036854775807L) {
      return false;
    }
    if (SystemClock.elapsedRealtime() < joiningDeadlineMs) {
      return true;
    }
    joiningDeadlineMs = -9223372036854775807L;
    return false;
  }
  
  public boolean maybeDropBuffersToKeyframe(MediaCodec paramMediaCodec, int paramInt, long paramLong1, long paramLong2)
    throws ExoPlaybackException
  {
    paramInt = skipSource(paramLong2);
    if (paramInt == 0) {
      return false;
    }
    paramMediaCodec = decoderCounters;
    droppedToKeyframeCount += 1;
    updateDroppedBufferCounters(buffersInCodecCount + paramInt);
    flushCodec();
    return true;
  }
  
  public void maybeNotifyRenderedFirstFrame()
  {
    if (!renderedFirstFrame)
    {
      renderedFirstFrame = true;
      eventDispatcher.renderedFirstFrame(surface);
    }
  }
  
  public void onCodecInitialized(String paramString, long paramLong1, long paramLong2)
  {
    eventDispatcher.decoderInitialized(paramString, paramLong1, paramLong2);
    codecNeedsSetOutputSurfaceWorkaround = codecNeedsSetOutputSurfaceWorkaround(paramString);
  }
  
  public void onDisabled()
  {
    currentWidth = -1;
    currentHeight = -1;
    currentPixelWidthHeightRatio = -1.0F;
    pendingPixelWidthHeightRatio = -1.0F;
    outputStreamOffsetUs = -9223372036854775807L;
    lastInputTimeUs = -9223372036854775807L;
    pendingOutputStreamOffsetCount = 0;
    clearReportedVideoSize();
    clearRenderedFirstFrame();
    frameReleaseTimeHelper.disable();
    tunnelingOnFrameRenderedListener = null;
    tunneling = false;
    try
    {
      super.onDisabled();
      return;
    }
    finally
    {
      decoderCounters.ensureUpdated();
      eventDispatcher.disabled(decoderCounters);
    }
  }
  
  public void onEnabled(boolean paramBoolean)
    throws ExoPlaybackException
  {
    super.onEnabled(paramBoolean);
    int i = getConfigurationtunnelingAudioSessionId;
    tunnelingAudioSessionId = i;
    if (i != 0) {
      paramBoolean = true;
    } else {
      paramBoolean = false;
    }
    tunneling = paramBoolean;
    eventDispatcher.enabled(decoderCounters);
    frameReleaseTimeHelper.enable();
  }
  
  public void onInputFormatChanged(Format paramFormat)
    throws ExoPlaybackException
  {
    super.onInputFormatChanged(paramFormat);
    eventDispatcher.inputFormatChanged(paramFormat);
    pendingPixelWidthHeightRatio = pixelWidthHeightRatio;
    pendingRotationDegrees = rotationDegrees;
  }
  
  public void onOutputFormatChanged(MediaCodec paramMediaCodec, MediaFormat paramMediaFormat)
  {
    int i;
    if ((paramMediaFormat.containsKey("crop-right")) && (paramMediaFormat.containsKey("crop-left")) && (paramMediaFormat.containsKey("crop-bottom")) && (paramMediaFormat.containsKey("crop-top"))) {
      i = 1;
    } else {
      i = 0;
    }
    int j;
    if (i != 0) {
      j = paramMediaFormat.getInteger("crop-right") - paramMediaFormat.getInteger("crop-left") + 1;
    } else {
      j = paramMediaFormat.getInteger("width");
    }
    if (i != 0) {
      i = paramMediaFormat.getInteger("crop-bottom") - paramMediaFormat.getInteger("crop-top") + 1;
    } else {
      i = paramMediaFormat.getInteger("height");
    }
    processOutputFormat(paramMediaCodec, j, i);
  }
  
  public void onPositionReset(long paramLong, boolean paramBoolean)
    throws ExoPlaybackException
  {
    super.onPositionReset(paramLong, paramBoolean);
    clearRenderedFirstFrame();
    initialPositionUs = -9223372036854775807L;
    consecutiveDroppedFrameCount = 0;
    lastInputTimeUs = -9223372036854775807L;
    int i = pendingOutputStreamOffsetCount;
    if (i != 0)
    {
      outputStreamOffsetUs = pendingOutputStreamOffsetsUs[(i - 1)];
      pendingOutputStreamOffsetCount = 0;
    }
    if (paramBoolean) {
      setJoiningDeadlineMs();
    } else {
      joiningDeadlineMs = -9223372036854775807L;
    }
  }
  
  @CallSuper
  public void onProcessedOutputBuffer(long paramLong)
  {
    buffersInCodecCount -= 1;
    for (;;)
    {
      int i = pendingOutputStreamOffsetCount;
      if ((i == 0) || (paramLong < pendingOutputStreamSwitchTimesUs[0])) {
        break;
      }
      long[] arrayOfLong = pendingOutputStreamOffsetsUs;
      outputStreamOffsetUs = arrayOfLong[0];
      i--;
      pendingOutputStreamOffsetCount = i;
      System.arraycopy(arrayOfLong, 1, arrayOfLong, 0, i);
      arrayOfLong = pendingOutputStreamSwitchTimesUs;
      System.arraycopy(arrayOfLong, 1, arrayOfLong, 0, pendingOutputStreamOffsetCount);
    }
  }
  
  public void onProcessedTunneledBuffer(long paramLong)
  {
    Format localFormat = updateOutputFormatForTime(paramLong);
    if (localFormat != null) {
      processOutputFormat(getCodec(), width, height);
    }
    maybeNotifyVideoSizeChanged();
    maybeNotifyRenderedFirstFrame();
    onProcessedOutputBuffer(paramLong);
  }
  
  @CallSuper
  public void onQueueInputBuffer(DecoderInputBuffer paramDecoderInputBuffer)
  {
    buffersInCodecCount += 1;
    lastInputTimeUs = Math.max(timeUs, lastInputTimeUs);
    if ((Util.SDK_INT < 23) && (tunneling)) {
      onProcessedTunneledBuffer(timeUs);
    }
  }
  
  public void onStarted()
  {
    super.onStarted();
    droppedFrames = 0;
    droppedFrameAccumulationStartTimeMs = SystemClock.elapsedRealtime();
    lastRenderTimeUs = (SystemClock.elapsedRealtime() * 1000L);
  }
  
  public void onStopped()
  {
    joiningDeadlineMs = -9223372036854775807L;
    maybeNotifyDroppedFrames();
    super.onStopped();
  }
  
  public void onStreamChanged(Format[] paramArrayOfFormat, long paramLong)
    throws ExoPlaybackException
  {
    if (outputStreamOffsetUs == -9223372036854775807L)
    {
      outputStreamOffsetUs = paramLong;
    }
    else
    {
      int i = pendingOutputStreamOffsetCount;
      if (i == pendingOutputStreamOffsetsUs.length)
      {
        localObject = z2.t("Too many stream changes, so dropping offset: ");
        ((StringBuilder)localObject).append(pendingOutputStreamOffsetsUs[(pendingOutputStreamOffsetCount - 1)]);
        Log.w("MediaCodecVideoRenderer", ((StringBuilder)localObject).toString());
      }
      else
      {
        pendingOutputStreamOffsetCount = (i + 1);
      }
      Object localObject = pendingOutputStreamOffsetsUs;
      i = pendingOutputStreamOffsetCount;
      localObject[(i - 1)] = paramLong;
      pendingOutputStreamSwitchTimesUs[(i - 1)] = lastInputTimeUs;
    }
    super.onStreamChanged(paramArrayOfFormat, paramLong);
  }
  
  public boolean processOutputBuffer(long paramLong1, long paramLong2, MediaCodec paramMediaCodec, ByteBuffer paramByteBuffer, int paramInt1, int paramInt2, long paramLong3, boolean paramBoolean, Format paramFormat)
    throws ExoPlaybackException
  {
    if (initialPositionUs == -9223372036854775807L) {
      initialPositionUs = paramLong1;
    }
    long l1 = paramLong3 - outputStreamOffsetUs;
    if (paramBoolean)
    {
      skipOutputBuffer(paramMediaCodec, paramInt1, l1);
      return true;
    }
    long l2 = paramLong3 - paramLong1;
    if (surface == dummySurface)
    {
      if (isBufferLate(l2))
      {
        skipOutputBuffer(paramMediaCodec, paramInt1, l1);
        return true;
      }
      return false;
    }
    long l3 = SystemClock.elapsedRealtime() * 1000L;
    if (getState() == 2) {
      paramInt2 = 1;
    } else {
      paramInt2 = 0;
    }
    if ((renderedFirstFrame) && ((paramInt2 == 0) || (!shouldForceRenderOutputBuffer(l2, l3 - lastRenderTimeUs))))
    {
      if ((paramInt2 != 0) && (paramLong1 != initialPositionUs))
      {
        long l4 = System.nanoTime();
        paramLong3 = frameReleaseTimeHelper.adjustReleaseTime(paramLong3, (l2 - (l3 - paramLong2)) * 1000L + l4);
        l4 = (paramLong3 - l4) / 1000L;
        if ((shouldDropBuffersToKeyframe(l4, paramLong2)) && (maybeDropBuffersToKeyframe(paramMediaCodec, paramInt1, l1, paramLong1))) {
          return false;
        }
        if (shouldDropOutputBuffer(l4, paramLong2)) {
          dropOutputBuffer(paramMediaCodec, paramInt1, l1);
        }
        for (;;)
        {
          return true;
          if (Util.SDK_INT >= 21)
          {
            if (l4 >= 50000L) {
              break;
            }
            notifyFrameMetadataListener(l1, paramLong3, paramFormat);
            renderOutputBufferV21(paramMediaCodec, paramInt1, l1, paramLong3);
          }
          else
          {
            if (l4 >= 30000L) {
              break;
            }
            if (l4 > 11000L) {
              try
              {
                Thread.sleep((l4 - 10000L) / 1000L);
              }
              catch (InterruptedException paramMediaCodec)
              {
                Thread.currentThread().interrupt();
                return false;
              }
            }
            notifyFrameMetadataListener(l1, paramLong3, paramFormat);
            renderOutputBuffer(paramMediaCodec, paramInt1, l1);
          }
        }
      }
      return false;
    }
    paramLong1 = System.nanoTime();
    notifyFrameMetadataListener(l1, paramLong1, paramFormat);
    if (Util.SDK_INT >= 21) {
      renderOutputBufferV21(paramMediaCodec, paramInt1, l1, paramLong1);
    } else {
      renderOutputBuffer(paramMediaCodec, paramInt1, l1);
    }
    return true;
  }
  
  @CallSuper
  public void releaseCodec()
  {
    try
    {
      super.releaseCodec();
      buffersInCodecCount = 0;
      localSurface1 = dummySurface;
      if (localSurface1 != null)
      {
        if (surface == localSurface1) {
          surface = null;
        }
        localSurface1.release();
        dummySurface = null;
      }
      return;
    }
    finally
    {
      Surface localSurface1;
      buffersInCodecCount = 0;
      if (dummySurface != null)
      {
        localSurface1 = surface;
        Surface localSurface2 = dummySurface;
        if (localSurface1 == localSurface2) {
          surface = null;
        }
        localSurface2.release();
        dummySurface = null;
      }
    }
  }
  
  public void renderOutputBuffer(MediaCodec paramMediaCodec, int paramInt, long paramLong)
  {
    maybeNotifyVideoSizeChanged();
    TraceUtil.beginSection("releaseOutputBuffer");
    paramMediaCodec.releaseOutputBuffer(paramInt, true);
    TraceUtil.endSection();
    lastRenderTimeUs = (SystemClock.elapsedRealtime() * 1000L);
    paramMediaCodec = decoderCounters;
    renderedOutputBufferCount += 1;
    consecutiveDroppedFrameCount = 0;
    maybeNotifyRenderedFirstFrame();
  }
  
  @TargetApi(21)
  public void renderOutputBufferV21(MediaCodec paramMediaCodec, int paramInt, long paramLong1, long paramLong2)
  {
    maybeNotifyVideoSizeChanged();
    TraceUtil.beginSection("releaseOutputBuffer");
    paramMediaCodec.releaseOutputBuffer(paramInt, paramLong2);
    TraceUtil.endSection();
    lastRenderTimeUs = (SystemClock.elapsedRealtime() * 1000L);
    paramMediaCodec = decoderCounters;
    renderedOutputBufferCount += 1;
    consecutiveDroppedFrameCount = 0;
    maybeNotifyRenderedFirstFrame();
  }
  
  public boolean shouldDropBuffersToKeyframe(long paramLong1, long paramLong2)
  {
    return isBufferVeryLate(paramLong1);
  }
  
  public boolean shouldDropOutputBuffer(long paramLong1, long paramLong2)
  {
    return isBufferLate(paramLong1);
  }
  
  public boolean shouldForceRenderOutputBuffer(long paramLong1, long paramLong2)
  {
    boolean bool;
    if ((isBufferLate(paramLong1)) && (paramLong2 > 100000L)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean shouldInitCodec(MediaCodecInfo paramMediaCodecInfo)
  {
    boolean bool;
    if ((surface == null) && (!shouldUseDummySurface(paramMediaCodecInfo))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public void skipOutputBuffer(MediaCodec paramMediaCodec, int paramInt, long paramLong)
  {
    TraceUtil.beginSection("skipVideoBuffer");
    paramMediaCodec.releaseOutputBuffer(paramInt, false);
    TraceUtil.endSection();
    paramMediaCodec = decoderCounters;
    skippedOutputBufferCount += 1;
  }
  
  public int supportsFormat(MediaCodecSelector paramMediaCodecSelector, DrmSessionManager<FrameworkMediaCrypto> paramDrmSessionManager, Format paramFormat)
    throws MediaCodecUtil.DecoderQueryException
  {
    boolean bool1 = MimeTypes.isVideo(sampleMimeType);
    int i = 0;
    if (!bool1) {
      return 0;
    }
    DrmInitData localDrmInitData = drmInitData;
    int j;
    if (localDrmInitData != null)
    {
      j = 0;
      int k = j;
      for (;;)
      {
        n = k;
        if (j >= schemeDataCount) {
          break;
        }
        boolean bool2;
        k |= getrequiresSecureDecryption;
        j++;
      }
    }
    int n = 0;
    List localList = paramMediaCodecSelector.getDecoderInfos(sampleMimeType, n);
    bool1 = localList.isEmpty();
    int m = 2;
    if (bool1)
    {
      if ((n == 0) || (paramMediaCodecSelector.getDecoderInfos(sampleMimeType, false).isEmpty())) {
        m = 1;
      }
      return m;
    }
    if (!BaseRenderer.supportsFormatDrm(paramDrmSessionManager, localDrmInitData)) {
      return 2;
    }
    paramMediaCodecSelector = (MediaCodecInfo)localList.get(0);
    bool1 = paramMediaCodecSelector.isFormatSupported(paramFormat);
    if (paramMediaCodecSelector.isSeamlessAdaptationSupported(paramFormat)) {
      m = 16;
    } else {
      m = 8;
    }
    n = i;
    int i1;
    if (tunneling) {
      i1 = 32;
    }
    if (bool1) {
      j = 4;
    } else {
      j = 3;
    }
    return j | m | i1;
  }
  
  public void updateDroppedBufferCounters(int paramInt)
  {
    DecoderCounters localDecoderCounters = decoderCounters;
    droppedBufferCount += paramInt;
    droppedFrames += paramInt;
    paramInt = consecutiveDroppedFrameCount + paramInt;
    consecutiveDroppedFrameCount = paramInt;
    maxConsecutiveDroppedBufferCount = Math.max(paramInt, maxConsecutiveDroppedBufferCount);
    paramInt = maxDroppedFramesToNotify;
    if ((paramInt > 0) && (droppedFrames >= paramInt)) {
      maybeNotifyDroppedFrames();
    }
  }
  
  public static final class CodecMaxValues
  {
    public final int height;
    public final int inputSize;
    public final int width;
    
    public CodecMaxValues(int paramInt1, int paramInt2, int paramInt3)
    {
      width = paramInt1;
      height = paramInt2;
      inputSize = paramInt3;
    }
  }
  
  @TargetApi(23)
  public final class OnFrameRenderedListenerV23
    implements MediaCodec.OnFrameRenderedListener
  {
    private OnFrameRenderedListenerV23(MediaCodec paramMediaCodec)
    {
      paramMediaCodec.setOnFrameRenderedListener(this, new Handler());
    }
    
    public void onFrameRendered(@NonNull MediaCodec paramMediaCodec, long paramLong1, long paramLong2)
    {
      paramMediaCodec = MediaCodecVideoRenderer.this;
      if (this != tunnelingOnFrameRenderedListener) {
        return;
      }
      paramMediaCodec.onProcessedTunneledBuffer(paramLong1);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.video.MediaCodecVideoRenderer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */