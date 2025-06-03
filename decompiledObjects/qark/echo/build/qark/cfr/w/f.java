/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Handler
 *  android.os.HandlerThread
 *  android.os.Looper
 *  android.util.SparseIntArray
 *  android.view.FrameMetrics
 *  android.view.Window
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.ref.WeakReference
 *  java.util.ArrayList
 */
package w;

import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.SparseIntArray;
import android.view.FrameMetrics;
import android.view.Window;
import android.view.Window$OnFrameMetricsAvailableListener;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class f {
    public final b a;

    public f() {
        this(1);
    }

    public f(int n8) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.a = new a(n8);
            return;
        }
        this.a = new b();
    }

    public void a(Activity activity) {
        this.a.a(activity);
    }

    public SparseIntArray[] b() {
        return this.a.b();
    }

    public SparseIntArray[] c(Activity activity) {
        return this.a.c(activity);
    }

    public SparseIntArray[] d() {
        return this.a.d();
    }

    public static class a
    extends b {
        public static HandlerThread e;
        public static Handler f;
        public int a;
        public SparseIntArray[] b = new SparseIntArray[9];
        public final ArrayList c = new ArrayList();
        public Window$OnFrameMetricsAvailableListener d;

        public a(int n8) {
            this.d = new Window$OnFrameMetricsAvailableListener(){

                public void onFrameMetricsAvailable(Window object, FrameMetrics frameMetrics, int n8) {
                    object = a.this;
                    if ((object.a & 1) != 0) {
                        object.e(object.b[0], frameMetrics.getMetric(8));
                    }
                    object = a.this;
                    if ((object.a & 2) != 0) {
                        object.e(object.b[1], frameMetrics.getMetric(1));
                    }
                    object = a.this;
                    if ((object.a & 4) != 0) {
                        object.e(object.b[2], frameMetrics.getMetric(3));
                    }
                    object = a.this;
                    if ((object.a & 8) != 0) {
                        object.e(object.b[3], frameMetrics.getMetric(4));
                    }
                    object = a.this;
                    if ((object.a & 16) != 0) {
                        object.e(object.b[4], frameMetrics.getMetric(5));
                    }
                    object = a.this;
                    if ((object.a & 64) != 0) {
                        object.e(object.b[6], frameMetrics.getMetric(7));
                    }
                    object = a.this;
                    if ((object.a & 32) != 0) {
                        object.e(object.b[5], frameMetrics.getMetric(6));
                    }
                    object = a.this;
                    if ((object.a & 128) != 0) {
                        object.e(object.b[7], frameMetrics.getMetric(0));
                    }
                    object = a.this;
                    if ((object.a & 256) != 0) {
                        object.e(object.b[8], frameMetrics.getMetric(2));
                    }
                }
            };
            this.a = n8;
        }

        @Override
        public void a(Activity activity) {
            SparseIntArray[] arrsparseIntArray;
            if (e == null) {
                arrsparseIntArray = new SparseIntArray[]("FrameMetricsAggregator");
                e = arrsparseIntArray;
                arrsparseIntArray.start();
                f = new Handler(e.getLooper());
            }
            for (int i8 = 0; i8 <= 8; ++i8) {
                arrsparseIntArray = this.b;
                if (arrsparseIntArray[i8] != null || (this.a & 1 << i8) == 0) continue;
                arrsparseIntArray[i8] = new SparseIntArray();
            }
            activity.getWindow().addOnFrameMetricsAvailableListener(this.d, f);
            this.c.add((Object)new WeakReference((Object)activity));
        }

        @Override
        public SparseIntArray[] b() {
            return this.b;
        }

        @Override
        public SparseIntArray[] c(Activity activity) {
            for (WeakReference weakReference : this.c) {
                if (weakReference.get() != activity) continue;
                this.c.remove((Object)weakReference);
                break;
            }
            activity.getWindow().removeOnFrameMetricsAvailableListener(this.d);
            return this.b;
        }

        @Override
        public SparseIntArray[] d() {
            SparseIntArray[] arrsparseIntArray = this.b;
            this.b = new SparseIntArray[9];
            return arrsparseIntArray;
        }

        public void e(SparseIntArray sparseIntArray, long l8) {
            if (sparseIntArray != null) {
                int n8 = (int)((500000L + l8) / 1000000L);
                if (l8 >= 0L) {
                    sparseIntArray.put(n8, sparseIntArray.get(n8) + 1);
                }
            }
        }

    }

    public static class b {
        public void a(Activity activity) {
        }

        public SparseIntArray[] b() {
            return null;
        }

        public SparseIntArray[] c(Activity activity) {
            return null;
        }

        public SparseIntArray[] d() {
            return null;
        }
    }

}

