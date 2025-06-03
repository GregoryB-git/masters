package io.flutter.embedding.android;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.Matrix;
import android.os.Build.VERSION;
import android.util.TypedValue;
import android.view.InputDevice;
import android.view.InputDevice.MotionRange;
import android.view.InputEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.google.android.gms.internal.base.a;
import d2.e;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import java.lang.annotation.Annotation;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.Map;

public class AndroidTouchProcessor
{
  public static final int BYTES_PER_FIELD = 8;
  public static final int DEFAULT_HORIZONTAL_SCROLL_FACTOR = 48;
  public static final int DEFAULT_VERTICAL_SCROLL_FACTOR = 48;
  private static final Matrix IDENTITY_TRANSFORM = new Matrix();
  private static final int IMPLICIT_VIEW_ID = 0;
  public static final int POINTER_DATA_FIELD_COUNT = 36;
  private static final int POINTER_DATA_FLAG_BATCHED = 1;
  private static final String TAG = "AndroidTouchProcessor";
  private int cachedVerticalScrollFactor;
  private final MotionEventTracker motionEventTracker;
  private final Map<Integer, float[]> ongoingPans = new HashMap();
  private final FlutterRenderer renderer;
  private final boolean trackMotionEvents;
  
  public AndroidTouchProcessor(FlutterRenderer paramFlutterRenderer, boolean paramBoolean)
  {
    renderer = paramFlutterRenderer;
    motionEventTracker = MotionEventTracker.getInstance();
    trackMotionEvents = paramBoolean;
  }
  
  private void addPointerForIndex(MotionEvent paramMotionEvent, int paramInt1, int paramInt2, int paramInt3, Matrix paramMatrix, ByteBuffer paramByteBuffer)
  {
    addPointerForIndex(paramMotionEvent, paramInt1, paramInt2, paramInt3, paramMatrix, paramByteBuffer, null);
  }
  
  private void addPointerForIndex(MotionEvent paramMotionEvent, int paramInt1, int paramInt2, int paramInt3, Matrix paramMatrix, ByteBuffer paramByteBuffer, Context paramContext)
  {
    int i = -1;
    if (paramInt2 == -1) {
      return;
    }
    int j = paramMotionEvent.getPointerId(paramInt1);
    int k = getPointerDeviceTypeForToolType(paramMotionEvent.getToolType(paramInt1));
    float[] arrayOfFloat = new float[2];
    arrayOfFloat[0] = paramMotionEvent.getX(paramInt1);
    arrayOfFloat[1] = paramMotionEvent.getY(paramInt1);
    paramMatrix.mapPoints(arrayOfFloat);
    long l1;
    long l2;
    if (k == 1)
    {
      l1 = paramMotionEvent.getButtonState() & 0x1F;
      l2 = l1;
      if (l1 == 0L)
      {
        l2 = l1;
        if (paramMotionEvent.getSource() == 8194)
        {
          l2 = l1;
          if (paramInt2 == 4)
          {
            ongoingPans.put(Integer.valueOf(j), arrayOfFloat);
            l2 = l1;
          }
        }
      }
    }
    else if (k == 2)
    {
      l2 = paramMotionEvent.getButtonState() >> 4 & 0xF;
    }
    else
    {
      l2 = 0L;
    }
    boolean bool = ongoingPans.containsKey(Integer.valueOf(j));
    if (bool)
    {
      i = getPointerChangeForPanZoom(paramInt2);
      if (i == -1) {
        return;
      }
    }
    if (trackMotionEvents) {
      l1 = motionEventTracker.track(paramMotionEvent).getId();
    } else {
      l1 = 0L;
    }
    int m;
    if (paramMotionEvent.getActionMasked() == 8) {
      m = 1;
    } else {
      m = 0;
    }
    long l3 = paramMotionEvent.getEventTime();
    paramByteBuffer.putLong(l1);
    paramByteBuffer.putLong(l3 * 1000L);
    if (bool)
    {
      paramByteBuffer.putLong(i);
      l1 = 4L;
    }
    else
    {
      paramByteBuffer.putLong(paramInt2);
      l1 = k;
    }
    paramByteBuffer.putLong(l1);
    paramByteBuffer.putLong(m);
    paramByteBuffer.putLong(j);
    paramByteBuffer.putLong(0L);
    if (bool)
    {
      paramMatrix = (float[])ongoingPans.get(Integer.valueOf(j));
      paramByteBuffer.putDouble(paramMatrix[0]);
      d1 = paramMatrix[1];
    }
    else
    {
      paramByteBuffer.putDouble(arrayOfFloat[0]);
      d1 = arrayOfFloat[1];
    }
    paramByteBuffer.putDouble(d1);
    paramByteBuffer.putDouble(0.0D);
    paramByteBuffer.putDouble(0.0D);
    paramByteBuffer.putLong(l2);
    paramByteBuffer.putLong(0L);
    paramByteBuffer.putLong(0L);
    paramByteBuffer.putDouble(paramMotionEvent.getPressure(paramInt1));
    if (paramMotionEvent.getDevice() != null)
    {
      paramMatrix = paramMotionEvent.getDevice().getMotionRange(2);
      if (paramMatrix != null)
      {
        d1 = paramMatrix.getMin();
        d2 = paramMatrix.getMax();
        break label494;
      }
    }
    double d2 = 1.0D;
    double d1 = 0.0D;
    label494:
    paramByteBuffer.putDouble(d1);
    paramByteBuffer.putDouble(d2);
    if (k == 2) {
      paramByteBuffer.putDouble(paramMotionEvent.getAxisValue(24, paramInt1));
    } else {
      paramByteBuffer.putDouble(0.0D);
    }
    paramByteBuffer.putDouble(0.0D);
    paramByteBuffer.putDouble(paramMotionEvent.getSize(paramInt1));
    paramByteBuffer.putDouble(paramMotionEvent.getToolMajor(paramInt1));
    paramByteBuffer.putDouble(paramMotionEvent.getToolMinor(paramInt1));
    paramByteBuffer.putDouble(0.0D);
    paramByteBuffer.putDouble(0.0D);
    paramByteBuffer.putDouble(paramMotionEvent.getAxisValue(8, paramInt1));
    if (k == 2) {
      paramByteBuffer.putDouble(paramMotionEvent.getAxisValue(25, paramInt1));
    } else {
      paramByteBuffer.putDouble(0.0D);
    }
    paramByteBuffer.putLong(paramInt3);
    if (m == 1)
    {
      d1 = 48.0D;
      if (paramContext != null)
      {
        d1 = getHorizontalScrollFactor(paramContext);
        d2 = getVerticalScrollFactor(paramContext);
      }
      else
      {
        d2 = 48.0D;
      }
      double d3 = -paramMotionEvent.getAxisValue(10, paramInt1);
      double d4 = -paramMotionEvent.getAxisValue(9, paramInt1);
      paramByteBuffer.putDouble(d1 * d3);
      paramByteBuffer.putDouble(d2 * d4);
    }
    else
    {
      paramByteBuffer.putDouble(0.0D);
      paramByteBuffer.putDouble(0.0D);
    }
    if (bool)
    {
      paramMotionEvent = (float[])ongoingPans.get(Integer.valueOf(j));
      paramByteBuffer.putDouble(arrayOfFloat[0] - paramMotionEvent[0]);
      paramByteBuffer.putDouble(arrayOfFloat[1] - paramMotionEvent[1]);
    }
    else
    {
      paramByteBuffer.putDouble(0.0D);
      paramByteBuffer.putDouble(0.0D);
    }
    paramByteBuffer.putDouble(0.0D);
    paramByteBuffer.putDouble(0.0D);
    paramByteBuffer.putDouble(1.0D);
    paramByteBuffer.putDouble(0.0D);
    paramByteBuffer.putLong(0L);
    if ((bool) && (i == 9)) {
      ongoingPans.remove(Integer.valueOf(j));
    }
  }
  
  private float getHorizontalScrollFactor(Context paramContext)
  {
    if (Build.VERSION.SDK_INT >= 26) {
      return a.a(ViewConfiguration.get(paramContext));
    }
    return getVerticalScrollFactorPre26(paramContext);
  }
  
  private int getPointerChangeForAction(int paramInt)
  {
    if (paramInt == 0) {
      return 4;
    }
    if (paramInt == 1) {
      return 6;
    }
    if (paramInt == 5) {
      return 4;
    }
    if (paramInt == 6) {
      return 6;
    }
    if (paramInt == 2) {
      return 5;
    }
    if (paramInt == 7) {
      return 3;
    }
    if (paramInt == 3) {
      return 0;
    }
    if (paramInt == 8) {
      return 3;
    }
    return -1;
  }
  
  private int getPointerChangeForPanZoom(int paramInt)
  {
    if (paramInt == 4) {
      return 7;
    }
    if (paramInt == 5) {
      return 8;
    }
    if ((paramInt != 6) && (paramInt != 0)) {
      return -1;
    }
    return 9;
  }
  
  private int getPointerDeviceTypeForToolType(int paramInt)
  {
    if (paramInt != 1)
    {
      if (paramInt != 2)
      {
        if (paramInt != 3)
        {
          if (paramInt != 4) {
            return 5;
          }
          return 3;
        }
        return 1;
      }
      return 2;
    }
    return 0;
  }
  
  private float getVerticalScrollFactor(Context paramContext)
  {
    if (Build.VERSION.SDK_INT >= 26) {
      return getVerticalScrollFactorAbove26(paramContext);
    }
    return getVerticalScrollFactorPre26(paramContext);
  }
  
  private float getVerticalScrollFactorAbove26(Context paramContext)
  {
    return e.a(ViewConfiguration.get(paramContext));
  }
  
  private int getVerticalScrollFactorPre26(Context paramContext)
  {
    if (cachedVerticalScrollFactor == 0)
    {
      TypedValue localTypedValue = new TypedValue();
      if (!paramContext.getTheme().resolveAttribute(16842829, localTypedValue, true)) {
        return 48;
      }
      cachedVerticalScrollFactor = ((int)localTypedValue.getDimension(paramContext.getResources().getDisplayMetrics()));
    }
    return cachedVerticalScrollFactor;
  }
  
  public boolean onGenericMotionEvent(MotionEvent paramMotionEvent, Context paramContext)
  {
    boolean bool = paramMotionEvent.isFromSource(2);
    int i;
    if ((paramMotionEvent.getActionMasked() != 7) && (paramMotionEvent.getActionMasked() != 8)) {
      i = 0;
    } else {
      i = 1;
    }
    if ((bool) && (i != 0))
    {
      i = getPointerChangeForAction(paramMotionEvent.getActionMasked());
      ByteBuffer localByteBuffer = ByteBuffer.allocateDirect(paramMotionEvent.getPointerCount() * 36 * 8);
      localByteBuffer.order(ByteOrder.LITTLE_ENDIAN);
      addPointerForIndex(paramMotionEvent, paramMotionEvent.getActionIndex(), i, 0, IDENTITY_TRANSFORM, localByteBuffer, paramContext);
      if (localByteBuffer.position() % 288 == 0)
      {
        renderer.dispatchPointerDataPacket(localByteBuffer, localByteBuffer.position());
        return true;
      }
      throw new AssertionError("Packet position is not on field boundary.");
    }
    return false;
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    return onTouchEvent(paramMotionEvent, IDENTITY_TRANSFORM);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent, Matrix paramMatrix)
  {
    int i = paramMotionEvent.getActionMasked();
    int j = getPointerChangeForAction(paramMotionEvent.getActionMasked());
    if ((i != 0) && (i != 5)) {
      k = 0;
    } else {
      k = 1;
    }
    if ((k == 0) && ((i == 1) || (i == 6))) {
      i = 1;
    } else {
      i = 0;
    }
    int m = getPointerDeviceTypeForToolType(paramMotionEvent.getToolType(paramMotionEvent.getActionIndex()));
    if ((i != 0) && (m == 0)) {
      m = 1;
    } else {
      m = 0;
    }
    int n = paramMotionEvent.getPointerCount();
    ByteBuffer localByteBuffer = ByteBuffer.allocateDirect((n + m) * 36 * 8);
    localByteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    if (k != 0) {
      i = paramMotionEvent.getActionIndex();
    }
    for (int k = j;; k = 2)
    {
      addPointerForIndex(paramMotionEvent, i, k, 0, paramMatrix, localByteBuffer);
      break label262;
      if (i == 0) {
        break;
      }
      for (k = 0; k < n; k++) {
        if ((k != paramMotionEvent.getActionIndex()) && (paramMotionEvent.getToolType(k) == 1)) {
          addPointerForIndex(paramMotionEvent, k, 5, 1, paramMatrix, localByteBuffer);
        }
      }
      addPointerForIndex(paramMotionEvent, paramMotionEvent.getActionIndex(), j, 0, paramMatrix, localByteBuffer);
      if (m == 0) {
        break label262;
      }
      i = paramMotionEvent.getActionIndex();
    }
    for (k = 0; k < n; k++) {
      addPointerForIndex(paramMotionEvent, k, j, 0, paramMatrix, localByteBuffer);
    }
    label262:
    if (localByteBuffer.position() % 288 == 0)
    {
      renderer.dispatchPointerDataPacket(localByteBuffer, localByteBuffer.position());
      return true;
    }
    throw new AssertionError("Packet position is not on field boundary");
  }
  
  public static @interface PointerChange
  {
    public static final int ADD = 1;
    public static final int CANCEL = 0;
    public static final int DOWN = 4;
    public static final int HOVER = 3;
    public static final int MOVE = 5;
    public static final int PAN_ZOOM_END = 9;
    public static final int PAN_ZOOM_START = 7;
    public static final int PAN_ZOOM_UPDATE = 8;
    public static final int REMOVE = 2;
    public static final int UP = 6;
  }
  
  public static @interface PointerDeviceKind
  {
    public static final int INVERTED_STYLUS = 3;
    public static final int MOUSE = 1;
    public static final int STYLUS = 2;
    public static final int TOUCH = 0;
    public static final int TRACKPAD = 4;
    public static final int UNKNOWN = 5;
  }
  
  public static @interface PointerSignalKind
  {
    public static final int NONE = 0;
    public static final int SCALE = 3;
    public static final int SCROLL = 1;
    public static final int SCROLL_INERTIA_CANCEL = 2;
    public static final int UNKNOWN = 4;
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.android.AndroidTouchProcessor
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */