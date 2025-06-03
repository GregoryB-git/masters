package B1;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class m implements SensorEventListener {

    /* renamed from: b, reason: collision with root package name */
    public static final a f729b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public b f730a;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    public interface b {
        void a();
    }

    public final void a(b bVar) {
        if (T1.a.d(this)) {
            return;
        }
        try {
            this.f730a = bVar;
        } catch (Throwable th) {
            T1.a.b(th, this);
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i7) {
        if (T1.a.d(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(sensor, "sensor");
        } catch (Throwable th) {
            T1.a.b(th, this);
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent event) {
        if (T1.a.d(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(event, "event");
            b bVar = this.f730a;
            if (bVar == null) {
                return;
            }
            float[] fArr = event.values;
            double d7 = fArr[0] / 9.80665f;
            double d8 = fArr[1] / 9.80665f;
            double d9 = fArr[2] / 9.80665f;
            if (Math.sqrt((d7 * d7) + (d8 * d8) + (d9 * d9)) > 2.3d) {
                bVar.a();
            }
        } catch (Throwable th) {
            T1.a.b(th, this);
        }
    }
}
