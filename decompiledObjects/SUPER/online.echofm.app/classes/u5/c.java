package u5;

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
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.Map;

public class c
{
  public static final Matrix f = new Matrix();
  public final FlutterRenderer a;
  public final N b;
  public final boolean c;
  public final Map d = new HashMap();
  public int e;
  
  public c(FlutterRenderer paramFlutterRenderer, boolean paramBoolean)
  {
    a = paramFlutterRenderer;
    b = N.a();
    c = paramBoolean;
  }
  
  public final void a(MotionEvent paramMotionEvent, int paramInt1, int paramInt2, int paramInt3, Matrix paramMatrix, ByteBuffer paramByteBuffer)
  {
    b(paramMotionEvent, paramInt1, paramInt2, paramInt3, paramMatrix, paramByteBuffer, null);
  }
  
  public final void b(MotionEvent paramMotionEvent, int paramInt1, int paramInt2, int paramInt3, Matrix paramMatrix, ByteBuffer paramByteBuffer, Context paramContext)
  {
    if (paramInt2 == -1) {
      return;
    }
    int i = paramMotionEvent.getPointerId(paramInt1);
    int j = f(paramMotionEvent.getToolType(paramInt1));
    float f1 = paramMotionEvent.getX(paramInt1);
    float f2 = paramMotionEvent.getY(paramInt1);
    float[] arrayOfFloat = new float[2];
    arrayOfFloat[0] = f1;
    arrayOfFloat[1] = f2;
    paramMatrix.mapPoints(arrayOfFloat);
    long l2;
    if (j == 1)
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
            d.put(Integer.valueOf(i), arrayOfFloat);
            l2 = l1;
          }
        }
      }
    }
    else if (j == 2)
    {
      l2 = paramMotionEvent.getButtonState() >> 4 & 0xF;
    }
    else
    {
      l2 = 0L;
    }
    boolean bool = d.containsKey(Integer.valueOf(i));
    int k;
    if (bool)
    {
      k = e(paramInt2);
      if (k == -1) {
        return;
      }
    }
    else
    {
      k = -1;
    }
    if (c) {
      l1 = b.c(paramMotionEvent).d();
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
    if (bool) {
      paramByteBuffer.putLong(k);
    }
    for (long l1 = 4L;; l1 = j)
    {
      paramByteBuffer.putLong(l1);
      break;
      paramByteBuffer.putLong(paramInt2);
    }
    paramByteBuffer.putLong(m);
    paramByteBuffer.putLong(i);
    paramByteBuffer.putLong(0L);
    if (bool)
    {
      paramMatrix = (float[])d.get(Integer.valueOf(i));
      paramByteBuffer.putDouble(paramMatrix[0]);
      paramByteBuffer.putDouble(paramMatrix[1]);
    }
    else
    {
      paramByteBuffer.putDouble(arrayOfFloat[0]);
      paramByteBuffer.putDouble(arrayOfFloat[1]);
    }
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
        break label514;
      }
    }
    for (;;)
    {
      break;
    }
    double d1 = 0.0D;
    double d2 = 1.0D;
    label514:
    paramByteBuffer.putDouble(d1);
    paramByteBuffer.putDouble(d2);
    if (j == 2) {
      paramByteBuffer.putDouble(paramMotionEvent.getAxisValue(24, paramInt1));
    }
    for (;;)
    {
      paramByteBuffer.putDouble(0.0D);
      break;
      paramByteBuffer.putDouble(0.0D);
    }
    paramByteBuffer.putDouble(paramMotionEvent.getSize(paramInt1));
    paramByteBuffer.putDouble(paramMotionEvent.getToolMajor(paramInt1));
    paramByteBuffer.putDouble(paramMotionEvent.getToolMinor(paramInt1));
    paramByteBuffer.putDouble(0.0D);
    paramByteBuffer.putDouble(0.0D);
    paramByteBuffer.putDouble(paramMotionEvent.getAxisValue(8, paramInt1));
    if (j == 2) {
      paramByteBuffer.putDouble(paramMotionEvent.getAxisValue(25, paramInt1));
    }
    for (;;)
    {
      break;
      paramByteBuffer.putDouble(0.0D);
    }
    paramByteBuffer.putLong(paramInt3);
    if (m == 1)
    {
      if (paramContext != null)
      {
        d2 = c(paramContext);
        d1 = g(paramContext);
      }
      else
      {
        d2 = 48.0D;
        d1 = 48.0D;
      }
      double d3 = -paramMotionEvent.getAxisValue(10, paramInt1);
      double d4 = -paramMotionEvent.getAxisValue(9, paramInt1);
      paramByteBuffer.putDouble(d2 * d3);
      paramByteBuffer.putDouble(d1 * d4);
    }
    else
    {
      paramByteBuffer.putDouble(0.0D);
      paramByteBuffer.putDouble(0.0D);
    }
    if (bool)
    {
      paramMotionEvent = (float[])d.get(Integer.valueOf(i));
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
    if ((bool) && (k == 9)) {
      d.remove(Integer.valueOf(i));
    }
  }
  
  public final float c(Context paramContext)
  {
    if (Build.VERSION.SDK_INT >= 26) {
      return b.a(ViewConfiguration.get(paramContext));
    }
    return i(paramContext);
  }
  
  public final int d(int paramInt)
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
  
  public final int e(int paramInt)
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
  
  public final int f(int paramInt)
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
  
  public final float g(Context paramContext)
  {
    if (Build.VERSION.SDK_INT >= 26) {
      return h(paramContext);
    }
    return i(paramContext);
  }
  
  public final float h(Context paramContext)
  {
    return a.a(ViewConfiguration.get(paramContext));
  }
  
  public final int i(Context paramContext)
  {
    if (e == 0)
    {
      TypedValue localTypedValue = new TypedValue();
      if (!paramContext.getTheme().resolveAttribute(16842829, localTypedValue, true)) {
        return 48;
      }
      e = ((int)localTypedValue.getDimension(paramContext.getResources().getDisplayMetrics()));
    }
    return e;
  }
  
  public boolean j(MotionEvent paramMotionEvent, Context paramContext)
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
      i = d(paramMotionEvent.getActionMasked());
      ByteBuffer localByteBuffer = ByteBuffer.allocateDirect(paramMotionEvent.getPointerCount() * 288);
      localByteBuffer.order(ByteOrder.LITTLE_ENDIAN);
      b(paramMotionEvent, paramMotionEvent.getActionIndex(), i, 0, f, localByteBuffer, paramContext);
      if (localByteBuffer.position() % 288 == 0)
      {
        a.g(localByteBuffer, localByteBuffer.position());
        return true;
      }
      throw new AssertionError("Packet position is not on field boundary.");
    }
    return false;
  }
  
  public boolean k(MotionEvent paramMotionEvent)
  {
    return l(paramMotionEvent, f);
  }
  
  public boolean l(MotionEvent paramMotionEvent, Matrix paramMatrix)
  {
    int i = paramMotionEvent.getPointerCount();
    ByteBuffer localByteBuffer = ByteBuffer.allocateDirect(i * 288);
    localByteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    int j = paramMotionEvent.getActionMasked();
    int k = d(paramMotionEvent.getActionMasked());
    int m;
    if ((j != 0) && (j != 5)) {
      m = 0;
    } else {
      m = 1;
    }
    if ((m == 0) && ((j == 1) || (j == 6))) {
      j = 1;
    } else {
      j = 0;
    }
    if (m != 0) {}
    for (;;)
    {
      a(paramMotionEvent, paramMotionEvent.getActionIndex(), k, 0, paramMatrix, localByteBuffer);
      break label196;
      m = 0;
      int n = 0;
      if (j == 0) {
        break;
      }
      for (m = n; m < i; m++) {
        if ((m != paramMotionEvent.getActionIndex()) && (paramMotionEvent.getToolType(m) == 1)) {
          a(paramMotionEvent, m, 5, 1, paramMatrix, localByteBuffer);
        }
      }
    }
    while (m < i)
    {
      a(paramMotionEvent, m, k, 0, paramMatrix, localByteBuffer);
      m++;
    }
    label196:
    if (localByteBuffer.position() % 288 == 0)
    {
      a.g(localByteBuffer, localByteBuffer.position());
      return true;
    }
    throw new AssertionError("Packet position is not on field boundary");
  }
}

/* Location:
 * Qualified Name:     u5.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */