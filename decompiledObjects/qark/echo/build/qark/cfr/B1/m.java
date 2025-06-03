/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.hardware.Sensor
 *  android.hardware.SensorEvent
 *  android.hardware.SensorEventListener
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Throwable
 */
package B1;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;

public final class m
implements SensorEventListener {
    public static final a b = new a(null);
    public b a;

    public final void a(b b8) {
        if (T1.a.d(this)) {
            return;
        }
        try {
            this.a = b8;
            return;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, this);
            return;
        }
    }

    public void onAccuracyChanged(Sensor sensor, int n8) {
        if (T1.a.d(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter((Object)sensor, "sensor");
            return;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, this);
            return;
        }
    }

    public void onSensorChanged(SensorEvent arrf) {
        Throwable throwable2;
        block8 : {
            block7 : {
                b b8;
                block6 : {
                    if (T1.a.d(this)) {
                        return;
                    }
                    try {
                        Intrinsics.checkNotNullParameter(arrf, "event");
                        b8 = this.a;
                        if (b8 != null) break block6;
                        return;
                    }
                    catch (Throwable throwable2) {}
                }
                arrf = arrf.values;
                float f8 = arrf[0];
                float f9 = arrf[1];
                float f10 = arrf[2];
                double d8 = f8 / 9.80665f;
                double d9 = f9 / 9.80665f;
                double d10 = f10 / 9.80665f;
                if (Math.sqrt((double)(d8 * d8 + d9 * d9 + d10 * d10)) > 2.3) {
                    b8.a();
                    return;
                }
                break block7;
                break block8;
            }
            return;
        }
        T1.a.b(throwable2, this);
    }

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(g g8) {
            this();
        }
    }

    public static interface b {
        public void a();
    }

}

