// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package w;

import java.util.Iterator;
import java.lang.ref.WeakReference;
import android.view.FrameMetrics;
import android.view.Window;
import android.view.Window$OnFrameMetricsAvailableListener;
import java.util.ArrayList;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import android.app.Activity;
import android.os.Build$VERSION;

public class f
{
    public final b a;
    
    public f() {
        this(1);
    }
    
    public f(final int n) {
        if (Build$VERSION.SDK_INT >= 24) {
            this.a = (b)new a(n);
            return;
        }
        this.a = new b();
    }
    
    public void a(final Activity activity) {
        this.a.a(activity);
    }
    
    public SparseIntArray[] b() {
        return this.a.b();
    }
    
    public SparseIntArray[] c(final Activity activity) {
        return this.a.c(activity);
    }
    
    public SparseIntArray[] d() {
        return this.a.d();
    }
    
    public static class a extends b
    {
        public static HandlerThread e;
        public static Handler f;
        public int a;
        public SparseIntArray[] b;
        public final ArrayList c;
        public Window$OnFrameMetricsAvailableListener d;
        
        public a(final int a) {
            this.b = new SparseIntArray[9];
            this.c = new ArrayList();
            this.d = new Window$OnFrameMetricsAvailableListener() {
                public void onFrameMetricsAvailable(final Window window, final FrameMetrics frameMetrics, final int n) {
                    final a a = w.f.a.this;
                    if ((a.a & 0x1) != 0x0) {
                        a.e(a.b[0], frameMetrics.getMetric(8));
                    }
                    final a a2 = w.f.a.this;
                    if ((a2.a & 0x2) != 0x0) {
                        a2.e(a2.b[1], frameMetrics.getMetric(1));
                    }
                    final a a3 = w.f.a.this;
                    if ((a3.a & 0x4) != 0x0) {
                        a3.e(a3.b[2], frameMetrics.getMetric(3));
                    }
                    final a a4 = w.f.a.this;
                    if ((a4.a & 0x8) != 0x0) {
                        a4.e(a4.b[3], frameMetrics.getMetric(4));
                    }
                    final a a5 = w.f.a.this;
                    if ((a5.a & 0x10) != 0x0) {
                        a5.e(a5.b[4], frameMetrics.getMetric(5));
                    }
                    final a a6 = w.f.a.this;
                    if ((a6.a & 0x40) != 0x0) {
                        a6.e(a6.b[6], frameMetrics.getMetric(7));
                    }
                    final a a7 = w.f.a.this;
                    if ((a7.a & 0x20) != 0x0) {
                        a7.e(a7.b[5], frameMetrics.getMetric(6));
                    }
                    final a a8 = w.f.a.this;
                    if ((a8.a & 0x80) != 0x0) {
                        a8.e(a8.b[7], frameMetrics.getMetric(0));
                    }
                    final a a9 = w.f.a.this;
                    if ((a9.a & 0x100) != 0x0) {
                        a9.e(a9.b[8], frameMetrics.getMetric(2));
                    }
                }
            };
            this.a = a;
        }
        
        @Override
        public void a(final Activity referent) {
            if (w.f.a.e == null) {
                ((Thread)(w.f.a.e = new HandlerThread("FrameMetricsAggregator"))).start();
                w.f.a.f = new Handler(w.f.a.e.getLooper());
            }
            for (int i = 0; i <= 8; ++i) {
                final SparseIntArray[] b = this.b;
                if (b[i] == null && (this.a & 1 << i) != 0x0) {
                    b[i] = new SparseIntArray();
                }
            }
            referent.getWindow().addOnFrameMetricsAvailableListener(this.d, w.f.a.f);
            this.c.add(new WeakReference<Activity>(referent));
        }
        
        @Override
        public SparseIntArray[] b() {
            return this.b;
        }
        
        @Override
        public SparseIntArray[] c(final Activity activity) {
            for (final WeakReference o : this.c) {
                if (o.get() == activity) {
                    this.c.remove(o);
                    break;
                }
            }
            activity.getWindow().removeOnFrameMetricsAvailableListener(this.d);
            return this.b;
        }
        
        @Override
        public SparseIntArray[] d() {
            final SparseIntArray[] b = this.b;
            this.b = new SparseIntArray[9];
            return b;
        }
        
        public void e(final SparseIntArray sparseIntArray, final long n) {
            if (sparseIntArray != null) {
                final int n2 = (int)((500000L + n) / 1000000L);
                if (n >= 0L) {
                    sparseIntArray.put(n2, sparseIntArray.get(n2) + 1);
                }
            }
        }
    }
    
    public static class b
    {
        public void a(final Activity activity) {
        }
        
        public SparseIntArray[] b() {
            return null;
        }
        
        public SparseIntArray[] c(final Activity activity) {
            return null;
        }
        
        public SparseIntArray[] d() {
            return null;
        }
    }
}
