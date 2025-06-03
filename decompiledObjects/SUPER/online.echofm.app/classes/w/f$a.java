package w;

import android.app.Activity;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import android.view.FrameMetrics;
import android.view.Window;
import android.view.Window.OnFrameMetricsAvailableListener;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

public class f$a
  extends f.b
{
  public static HandlerThread e;
  public static Handler f;
  public int a;
  public SparseIntArray[] b = new SparseIntArray[9];
  public final ArrayList c = new ArrayList();
  public Window.OnFrameMetricsAvailableListener d = new a();
  
  public f$a(int paramInt)
  {
    a = paramInt;
  }
  
  public void a(Activity paramActivity)
  {
    Object localObject;
    if (e == null)
    {
      localObject = new HandlerThread("FrameMetricsAggregator");
      e = (HandlerThread)localObject;
      ((Thread)localObject).start();
      f = new Handler(e.getLooper());
    }
    for (int i = 0; i <= 8; i++)
    {
      localObject = b;
      if ((localObject[i] == null) && ((a & 1 << i) != 0)) {
        localObject[i] = new SparseIntArray();
      }
    }
    paramActivity.getWindow().addOnFrameMetricsAvailableListener(d, f);
    c.add(new WeakReference(paramActivity));
  }
  
  public SparseIntArray[] b()
  {
    return b;
  }
  
  public SparseIntArray[] c(Activity paramActivity)
  {
    Iterator localIterator = c.iterator();
    while (localIterator.hasNext())
    {
      WeakReference localWeakReference = (WeakReference)localIterator.next();
      if (localWeakReference.get() == paramActivity) {
        c.remove(localWeakReference);
      }
    }
    paramActivity.getWindow().removeOnFrameMetricsAvailableListener(d);
    return b;
  }
  
  public SparseIntArray[] d()
  {
    SparseIntArray[] arrayOfSparseIntArray = b;
    b = new SparseIntArray[9];
    return arrayOfSparseIntArray;
  }
  
  public void e(SparseIntArray paramSparseIntArray, long paramLong)
  {
    if (paramSparseIntArray != null)
    {
      int i = (int)((500000L + paramLong) / 1000000L);
      if (paramLong >= 0L) {
        paramSparseIntArray.put(i, paramSparseIntArray.get(i) + 1);
      }
    }
  }
  
  public class a
    implements Window.OnFrameMetricsAvailableListener
  {
    public a() {}
    
    public void onFrameMetricsAvailable(Window paramWindow, FrameMetrics paramFrameMetrics, int paramInt)
    {
      paramWindow = f.a.this;
      if ((a & 0x1) != 0) {
        paramWindow.e(b[0], paramFrameMetrics.getMetric(8));
      }
      paramWindow = f.a.this;
      if ((a & 0x2) != 0) {
        paramWindow.e(b[1], paramFrameMetrics.getMetric(1));
      }
      paramWindow = f.a.this;
      if ((a & 0x4) != 0) {
        paramWindow.e(b[2], paramFrameMetrics.getMetric(3));
      }
      paramWindow = f.a.this;
      if ((a & 0x8) != 0) {
        paramWindow.e(b[3], paramFrameMetrics.getMetric(4));
      }
      paramWindow = f.a.this;
      if ((a & 0x10) != 0) {
        paramWindow.e(b[4], paramFrameMetrics.getMetric(5));
      }
      paramWindow = f.a.this;
      if ((a & 0x40) != 0) {
        paramWindow.e(b[6], paramFrameMetrics.getMetric(7));
      }
      paramWindow = f.a.this;
      if ((a & 0x20) != 0) {
        paramWindow.e(b[5], paramFrameMetrics.getMetric(6));
      }
      paramWindow = f.a.this;
      if ((a & 0x80) != 0) {
        paramWindow.e(b[7], paramFrameMetrics.getMetric(0));
      }
      paramWindow = f.a.this;
      if ((a & 0x100) != 0) {
        paramWindow.e(b[8], paramFrameMetrics.getMetric(2));
      }
    }
  }
}

/* Location:
 * Qualified Name:     w.f.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */