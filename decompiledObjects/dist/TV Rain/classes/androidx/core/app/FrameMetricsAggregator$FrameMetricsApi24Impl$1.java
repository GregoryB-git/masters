package androidx.core.app;

import android.view.FrameMetrics;
import android.view.Window;
import android.view.Window.OnFrameMetricsAvailableListener;

class FrameMetricsAggregator$FrameMetricsApi24Impl$1
  implements Window.OnFrameMetricsAvailableListener
{
  public FrameMetricsAggregator$FrameMetricsApi24Impl$1(FrameMetricsAggregator.FrameMetricsApi24Impl paramFrameMetricsApi24Impl) {}
  
  public void onFrameMetricsAvailable(Window paramWindow, FrameMetrics paramFrameMetrics, int paramInt)
  {
    paramWindow = this$0;
    if ((mTrackingFlags & 0x1) != 0) {
      paramWindow.addDurationItem(mMetrics[0], paramFrameMetrics.getMetric(8));
    }
    paramWindow = this$0;
    if ((mTrackingFlags & 0x2) != 0) {
      paramWindow.addDurationItem(mMetrics[1], paramFrameMetrics.getMetric(1));
    }
    paramWindow = this$0;
    if ((mTrackingFlags & 0x4) != 0) {
      paramWindow.addDurationItem(mMetrics[2], paramFrameMetrics.getMetric(3));
    }
    paramWindow = this$0;
    if ((mTrackingFlags & 0x8) != 0) {
      paramWindow.addDurationItem(mMetrics[3], paramFrameMetrics.getMetric(4));
    }
    paramWindow = this$0;
    if ((mTrackingFlags & 0x10) != 0) {
      paramWindow.addDurationItem(mMetrics[4], paramFrameMetrics.getMetric(5));
    }
    paramWindow = this$0;
    if ((mTrackingFlags & 0x40) != 0) {
      paramWindow.addDurationItem(mMetrics[6], paramFrameMetrics.getMetric(7));
    }
    paramWindow = this$0;
    if ((mTrackingFlags & 0x20) != 0) {
      paramWindow.addDurationItem(mMetrics[5], paramFrameMetrics.getMetric(6));
    }
    paramWindow = this$0;
    if ((mTrackingFlags & 0x80) != 0) {
      paramWindow.addDurationItem(mMetrics[7], paramFrameMetrics.getMetric(0));
    }
    paramWindow = this$0;
    if ((mTrackingFlags & 0x100) != 0) {
      paramWindow.addDurationItem(mMetrics[8], paramFrameMetrics.getMetric(2));
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.app.FrameMetricsAggregator.FrameMetricsApi24Impl.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */