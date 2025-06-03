package w;

import android.view.FrameMetrics;
import android.view.Window;
import android.view.Window.OnFrameMetricsAvailableListener;

public class f$a$a
  implements Window.OnFrameMetricsAvailableListener
{
  public f$a$a(f.a parama) {}
  
  public void onFrameMetricsAvailable(Window paramWindow, FrameMetrics paramFrameMetrics, int paramInt)
  {
    paramWindow = a;
    if ((a & 0x1) != 0) {
      paramWindow.e(b[0], paramFrameMetrics.getMetric(8));
    }
    paramWindow = a;
    if ((a & 0x2) != 0) {
      paramWindow.e(b[1], paramFrameMetrics.getMetric(1));
    }
    paramWindow = a;
    if ((a & 0x4) != 0) {
      paramWindow.e(b[2], paramFrameMetrics.getMetric(3));
    }
    paramWindow = a;
    if ((a & 0x8) != 0) {
      paramWindow.e(b[3], paramFrameMetrics.getMetric(4));
    }
    paramWindow = a;
    if ((a & 0x10) != 0) {
      paramWindow.e(b[4], paramFrameMetrics.getMetric(5));
    }
    paramWindow = a;
    if ((a & 0x40) != 0) {
      paramWindow.e(b[6], paramFrameMetrics.getMetric(7));
    }
    paramWindow = a;
    if ((a & 0x20) != 0) {
      paramWindow.e(b[5], paramFrameMetrics.getMetric(6));
    }
    paramWindow = a;
    if ((a & 0x80) != 0) {
      paramWindow.e(b[7], paramFrameMetrics.getMetric(0));
    }
    paramWindow = a;
    if ((a & 0x100) != 0) {
      paramWindow.e(b[8], paramFrameMetrics.getMetric(2));
    }
  }
}

/* Location:
 * Qualified Name:     w.f.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */