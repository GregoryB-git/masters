package androidx.core.app;

import android.app.Activity;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import android.view.FrameMetrics;
import android.view.Window;
import android.view.Window.OnFrameMetricsAvailableListener;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

public class FrameMetricsAggregator
{
  public static final int ANIMATION_DURATION = 256;
  public static final int ANIMATION_INDEX = 8;
  public static final int COMMAND_DURATION = 32;
  public static final int COMMAND_INDEX = 5;
  public static final int DELAY_DURATION = 128;
  public static final int DELAY_INDEX = 7;
  public static final int DRAW_DURATION = 8;
  public static final int DRAW_INDEX = 3;
  public static final int EVERY_DURATION = 511;
  public static final int INPUT_DURATION = 2;
  public static final int INPUT_INDEX = 1;
  private static final int LAST_INDEX = 8;
  public static final int LAYOUT_MEASURE_DURATION = 4;
  public static final int LAYOUT_MEASURE_INDEX = 2;
  public static final int SWAP_DURATION = 64;
  public static final int SWAP_INDEX = 6;
  public static final int SYNC_DURATION = 16;
  public static final int SYNC_INDEX = 4;
  public static final int TOTAL_DURATION = 1;
  public static final int TOTAL_INDEX = 0;
  private final FrameMetricsBaseImpl mInstance;
  
  public FrameMetricsAggregator()
  {
    this(1);
  }
  
  public FrameMetricsAggregator(int paramInt)
  {
    mInstance = new FrameMetricsApi24Impl(paramInt);
  }
  
  public void add(@NonNull Activity paramActivity)
  {
    mInstance.add(paramActivity);
  }
  
  @Nullable
  public SparseIntArray[] getMetrics()
  {
    return mInstance.getMetrics();
  }
  
  @Nullable
  public SparseIntArray[] remove(@NonNull Activity paramActivity)
  {
    return mInstance.remove(paramActivity);
  }
  
  @Nullable
  public SparseIntArray[] reset()
  {
    return mInstance.reset();
  }
  
  @Nullable
  public SparseIntArray[] stop()
  {
    return mInstance.stop();
  }
  
  @RequiresApi(24)
  public static class FrameMetricsApi24Impl
    extends FrameMetricsAggregator.FrameMetricsBaseImpl
  {
    private static final int NANOS_PER_MS = 1000000;
    private static final int NANOS_ROUNDING_VALUE = 500000;
    private static Handler sHandler;
    private static HandlerThread sHandlerThread;
    private final ArrayList<WeakReference<Activity>> mActivities = new ArrayList();
    public Window.OnFrameMetricsAvailableListener mListener = new Window.OnFrameMetricsAvailableListener()
    {
      public void onFrameMetricsAvailable(Window paramAnonymousWindow, FrameMetrics paramAnonymousFrameMetrics, int paramAnonymousInt)
      {
        paramAnonymousWindow = FrameMetricsAggregator.FrameMetricsApi24Impl.this;
        if ((mTrackingFlags & 0x1) != 0) {
          paramAnonymousWindow.addDurationItem(mMetrics[0], paramAnonymousFrameMetrics.getMetric(8));
        }
        paramAnonymousWindow = FrameMetricsAggregator.FrameMetricsApi24Impl.this;
        if ((mTrackingFlags & 0x2) != 0) {
          paramAnonymousWindow.addDurationItem(mMetrics[1], paramAnonymousFrameMetrics.getMetric(1));
        }
        paramAnonymousWindow = FrameMetricsAggregator.FrameMetricsApi24Impl.this;
        if ((mTrackingFlags & 0x4) != 0) {
          paramAnonymousWindow.addDurationItem(mMetrics[2], paramAnonymousFrameMetrics.getMetric(3));
        }
        paramAnonymousWindow = FrameMetricsAggregator.FrameMetricsApi24Impl.this;
        if ((mTrackingFlags & 0x8) != 0) {
          paramAnonymousWindow.addDurationItem(mMetrics[3], paramAnonymousFrameMetrics.getMetric(4));
        }
        paramAnonymousWindow = FrameMetricsAggregator.FrameMetricsApi24Impl.this;
        if ((mTrackingFlags & 0x10) != 0) {
          paramAnonymousWindow.addDurationItem(mMetrics[4], paramAnonymousFrameMetrics.getMetric(5));
        }
        paramAnonymousWindow = FrameMetricsAggregator.FrameMetricsApi24Impl.this;
        if ((mTrackingFlags & 0x40) != 0) {
          paramAnonymousWindow.addDurationItem(mMetrics[6], paramAnonymousFrameMetrics.getMetric(7));
        }
        paramAnonymousWindow = FrameMetricsAggregator.FrameMetricsApi24Impl.this;
        if ((mTrackingFlags & 0x20) != 0) {
          paramAnonymousWindow.addDurationItem(mMetrics[5], paramAnonymousFrameMetrics.getMetric(6));
        }
        paramAnonymousWindow = FrameMetricsAggregator.FrameMetricsApi24Impl.this;
        if ((mTrackingFlags & 0x80) != 0) {
          paramAnonymousWindow.addDurationItem(mMetrics[7], paramAnonymousFrameMetrics.getMetric(0));
        }
        paramAnonymousWindow = FrameMetricsAggregator.FrameMetricsApi24Impl.this;
        if ((mTrackingFlags & 0x100) != 0) {
          paramAnonymousWindow.addDurationItem(mMetrics[8], paramAnonymousFrameMetrics.getMetric(2));
        }
      }
    };
    public SparseIntArray[] mMetrics = new SparseIntArray[9];
    public int mTrackingFlags;
    
    public FrameMetricsApi24Impl(int paramInt)
    {
      mTrackingFlags = paramInt;
    }
    
    public void add(Activity paramActivity)
    {
      Object localObject;
      if (sHandlerThread == null)
      {
        localObject = new HandlerThread("FrameMetricsAggregator");
        sHandlerThread = (HandlerThread)localObject;
        ((Thread)localObject).start();
        sHandler = new Handler(sHandlerThread.getLooper());
      }
      for (int i = 0; i <= 8; i++)
      {
        localObject = mMetrics;
        if ((localObject[i] == null) && ((mTrackingFlags & 1 << i) != 0)) {
          localObject[i] = new SparseIntArray();
        }
      }
      paramActivity.getWindow().addOnFrameMetricsAvailableListener(mListener, sHandler);
      mActivities.add(new WeakReference(paramActivity));
    }
    
    public void addDurationItem(SparseIntArray paramSparseIntArray, long paramLong)
    {
      if (paramSparseIntArray != null)
      {
        int i = (int)((500000L + paramLong) / 1000000L);
        if (paramLong >= 0L) {
          paramSparseIntArray.put(i, paramSparseIntArray.get(i) + 1);
        }
      }
    }
    
    public SparseIntArray[] getMetrics()
    {
      return mMetrics;
    }
    
    public SparseIntArray[] remove(Activity paramActivity)
    {
      Iterator localIterator = mActivities.iterator();
      while (localIterator.hasNext())
      {
        WeakReference localWeakReference = (WeakReference)localIterator.next();
        if (localWeakReference.get() == paramActivity) {
          mActivities.remove(localWeakReference);
        }
      }
      paramActivity.getWindow().removeOnFrameMetricsAvailableListener(mListener);
      return mMetrics;
    }
    
    public SparseIntArray[] reset()
    {
      SparseIntArray[] arrayOfSparseIntArray = mMetrics;
      mMetrics = new SparseIntArray[9];
      return arrayOfSparseIntArray;
    }
    
    public SparseIntArray[] stop()
    {
      for (int i = mActivities.size() - 1; i >= 0; i--)
      {
        WeakReference localWeakReference = (WeakReference)mActivities.get(i);
        Activity localActivity = (Activity)localWeakReference.get();
        if (localWeakReference.get() != null)
        {
          localActivity.getWindow().removeOnFrameMetricsAvailableListener(mListener);
          mActivities.remove(i);
        }
      }
      return mMetrics;
    }
  }
  
  public static class FrameMetricsBaseImpl
  {
    public void add(Activity paramActivity) {}
    
    public SparseIntArray[] getMetrics()
    {
      return null;
    }
    
    public SparseIntArray[] remove(Activity paramActivity)
    {
      return null;
    }
    
    public SparseIntArray[] reset()
    {
      return null;
    }
    
    public SparseIntArray[] stop()
    {
      return null;
    }
  }
  
  @Retention(RetentionPolicy.SOURCE)
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public static @interface MetricType {}
}

/* Location:
 * Qualified Name:     androidx.core.app.FrameMetricsAggregator
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */