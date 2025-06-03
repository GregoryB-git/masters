// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package B1;

import android.hardware.SensorEvent;
import kotlin.jvm.internal.Intrinsics;
import android.hardware.Sensor;
import T1.a;
import kotlin.jvm.internal.g;
import android.hardware.SensorEventListener;

public final class m implements SensorEventListener
{
    public static final a b;
    public b a;
    
    static {
        b = new a(null);
    }
    
    public final void a(final b a) {
        if (a.d(this)) {
            return;
        }
        try {
            this.a = a;
        }
        finally {
            final Throwable t;
            a.b(t, this);
        }
    }
    
    public void onAccuracyChanged(final Sensor sensor, final int n) {
        if (T1.a.d(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(sensor, "sensor");
        }
        finally {
            final Throwable t;
            T1.a.b(t, this);
        }
    }
    
    public void onSensorChanged(final SensorEvent sensorEvent) {
        if (T1.a.d(this)) {
            return;
        }
        Label_0107: {
            try {
                Intrinsics.checkNotNullParameter(sensorEvent, "event");
                final b a = this.a;
                if (a == null) {
                    return;
                }
                final float[] values = sensorEvent.values;
                final float n = values[0];
                final float n2 = values[1];
                final float n3 = values[2];
                final double n4 = n / 9.80665f;
                final double n5 = n2 / 9.80665f;
                final double n6 = n3 / 9.80665f;
                if (Math.sqrt(n4 * n4 + n5 * n5 + n6 * n6) > 2.3) {
                    a.a();
                    return;
                }
            }
            finally {
                break Label_0107;
            }
            return;
        }
        final Throwable t;
        T1.a.b(t, this);
    }
    
    public static final class a
    {
    }
    
    public interface b
    {
        void a();
    }
}
