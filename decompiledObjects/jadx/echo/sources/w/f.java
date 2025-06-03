package w;

import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import android.view.FrameMetrics;
import android.view.Window;
import android.view.Window$OnFrameMetricsAvailableListener;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final b f20203a;

    public static class a extends b {

        /* renamed from: e, reason: collision with root package name */
        public static HandlerThread f20204e;

        /* renamed from: f, reason: collision with root package name */
        public static Handler f20205f;

        /* renamed from: a, reason: collision with root package name */
        public int f20206a;

        /* renamed from: b, reason: collision with root package name */
        public SparseIntArray[] f20207b = new SparseIntArray[9];

        /* renamed from: c, reason: collision with root package name */
        public final ArrayList f20208c = new ArrayList();

        /* renamed from: d, reason: collision with root package name */
        public Window$OnFrameMetricsAvailableListener f20209d = new WindowOnFrameMetricsAvailableListenerC0284a();

        /* renamed from: w.f$a$a, reason: collision with other inner class name */
        public class WindowOnFrameMetricsAvailableListenerC0284a implements Window$OnFrameMetricsAvailableListener {
            public WindowOnFrameMetricsAvailableListenerC0284a() {
            }

            public void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i7) {
                a aVar = a.this;
                if ((aVar.f20206a & 1) != 0) {
                    aVar.e(aVar.f20207b[0], frameMetrics.getMetric(8));
                }
                a aVar2 = a.this;
                if ((aVar2.f20206a & 2) != 0) {
                    aVar2.e(aVar2.f20207b[1], frameMetrics.getMetric(1));
                }
                a aVar3 = a.this;
                if ((aVar3.f20206a & 4) != 0) {
                    aVar3.e(aVar3.f20207b[2], frameMetrics.getMetric(3));
                }
                a aVar4 = a.this;
                if ((aVar4.f20206a & 8) != 0) {
                    aVar4.e(aVar4.f20207b[3], frameMetrics.getMetric(4));
                }
                a aVar5 = a.this;
                if ((aVar5.f20206a & 16) != 0) {
                    aVar5.e(aVar5.f20207b[4], frameMetrics.getMetric(5));
                }
                a aVar6 = a.this;
                if ((aVar6.f20206a & 64) != 0) {
                    aVar6.e(aVar6.f20207b[6], frameMetrics.getMetric(7));
                }
                a aVar7 = a.this;
                if ((aVar7.f20206a & 32) != 0) {
                    aVar7.e(aVar7.f20207b[5], frameMetrics.getMetric(6));
                }
                a aVar8 = a.this;
                if ((aVar8.f20206a & 128) != 0) {
                    aVar8.e(aVar8.f20207b[7], frameMetrics.getMetric(0));
                }
                a aVar9 = a.this;
                if ((aVar9.f20206a & 256) != 0) {
                    aVar9.e(aVar9.f20207b[8], frameMetrics.getMetric(2));
                }
            }
        }

        public a(int i7) {
            this.f20206a = i7;
        }

        @Override // w.f.b
        public void a(Activity activity) {
            if (f20204e == null) {
                HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
                f20204e = handlerThread;
                handlerThread.start();
                f20205f = new Handler(f20204e.getLooper());
            }
            for (int i7 = 0; i7 <= 8; i7++) {
                SparseIntArray[] sparseIntArrayArr = this.f20207b;
                if (sparseIntArrayArr[i7] == null && (this.f20206a & (1 << i7)) != 0) {
                    sparseIntArrayArr[i7] = new SparseIntArray();
                }
            }
            activity.getWindow().addOnFrameMetricsAvailableListener(this.f20209d, f20205f);
            this.f20208c.add(new WeakReference(activity));
        }

        @Override // w.f.b
        public SparseIntArray[] b() {
            return this.f20207b;
        }

        @Override // w.f.b
        public SparseIntArray[] c(Activity activity) {
            Iterator it = this.f20208c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                WeakReference weakReference = (WeakReference) it.next();
                if (weakReference.get() == activity) {
                    this.f20208c.remove(weakReference);
                    break;
                }
            }
            activity.getWindow().removeOnFrameMetricsAvailableListener(this.f20209d);
            return this.f20207b;
        }

        @Override // w.f.b
        public SparseIntArray[] d() {
            SparseIntArray[] sparseIntArrayArr = this.f20207b;
            this.f20207b = new SparseIntArray[9];
            return sparseIntArrayArr;
        }

        public void e(SparseIntArray sparseIntArray, long j7) {
            if (sparseIntArray != null) {
                int i7 = (int) ((500000 + j7) / 1000000);
                if (j7 >= 0) {
                    sparseIntArray.put(i7, sparseIntArray.get(i7) + 1);
                }
            }
        }
    }

    public f() {
        this(1);
    }

    public void a(Activity activity) {
        this.f20203a.a(activity);
    }

    public SparseIntArray[] b() {
        return this.f20203a.b();
    }

    public SparseIntArray[] c(Activity activity) {
        return this.f20203a.c(activity);
    }

    public SparseIntArray[] d() {
        return this.f20203a.d();
    }

    public f(int i7) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f20203a = new a(i7);
        } else {
            this.f20203a = new b();
        }
    }

    public static class b {
        public SparseIntArray[] b() {
            return null;
        }

        public SparseIntArray[] c(Activity activity) {
            return null;
        }

        public SparseIntArray[] d() {
            return null;
        }

        public void a(Activity activity) {
        }
    }
}
