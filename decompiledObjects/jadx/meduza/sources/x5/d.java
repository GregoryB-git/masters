package x5;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;

/* loaded from: classes.dex */
public final class d implements SensorEventListener {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f17125a = new float[16];

    /* renamed from: b, reason: collision with root package name */
    public final float[] f17126b = new float[16];

    /* renamed from: c, reason: collision with root package name */
    public final float[] f17127c = new float[16];

    /* renamed from: d, reason: collision with root package name */
    public final float[] f17128d = new float[3];

    /* renamed from: e, reason: collision with root package name */
    public final Display f17129e;
    public final a[] f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f17130g;

    public interface a {
        void a(float[] fArr, float f);
    }

    public d(Display display, a... aVarArr) {
        this.f17129e = display;
        this.f = aVarArr;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        SensorManager.getRotationMatrixFromVector(this.f17125a, sensorEvent.values);
        float[] fArr = this.f17125a;
        int rotation = this.f17129e.getRotation();
        if (rotation != 0) {
            int i10 = 130;
            int i11 = 129;
            if (rotation == 1) {
                i10 = 2;
            } else if (rotation == 2) {
                i11 = 130;
                i10 = 129;
            } else {
                if (rotation != 3) {
                    throw new IllegalStateException();
                }
                i11 = 1;
            }
            float[] fArr2 = this.f17126b;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            SensorManager.remapCoordinateSystem(this.f17126b, i10, i11, fArr);
        }
        SensorManager.remapCoordinateSystem(this.f17125a, 1, 131, this.f17126b);
        SensorManager.getOrientation(this.f17126b, this.f17128d);
        float f = this.f17128d[2];
        Matrix.rotateM(this.f17125a, 0, 90.0f, 1.0f, 0.0f, 0.0f);
        float[] fArr3 = this.f17125a;
        if (!this.f17130g) {
            c.a(this.f17127c, fArr3);
            this.f17130g = true;
        }
        float[] fArr4 = this.f17126b;
        System.arraycopy(fArr3, 0, fArr4, 0, fArr4.length);
        Matrix.multiplyMM(fArr3, 0, this.f17126b, 0, this.f17127c, 0);
        float[] fArr5 = this.f17125a;
        for (a aVar : this.f) {
            aVar.a(fArr5, f);
        }
    }
}
