/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  android.graphics.Matrix
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.util.DisplayMetrics
 *  android.util.TypedValue
 *  android.view.InputDevice
 *  android.view.InputDevice$MotionRange
 *  android.view.MotionEvent
 *  android.view.ViewConfiguration
 *  java.lang.AssertionError
 *  java.lang.Object
 *  java.nio.ByteBuffer
 *  java.nio.ByteOrder
 *  java.util.HashMap
 *  java.util.Map
 */
package u5;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.InputDevice;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.Map;
import u5.N;
import u5.a;
import u5.b;

public class c {
    public static final Matrix f = new Matrix();
    public final FlutterRenderer a;
    public final N b;
    public final boolean c;
    public final Map d = new HashMap();
    public int e;

    public c(FlutterRenderer flutterRenderer, boolean bl) {
        this.a = flutterRenderer;
        this.b = N.a();
        this.c = bl;
    }

    public final void a(MotionEvent motionEvent, int n8, int n9, int n10, Matrix matrix, ByteBuffer byteBuffer) {
        this.b(motionEvent, n8, n9, n10, matrix, byteBuffer, null);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void b(MotionEvent arrf, int n8, int n9, int n10, Matrix motionRange, ByteBuffer byteBuffer, Context context) {
        double d8;
        long l8;
        boolean bl;
        int n11;
        long l9;
        double d9;
        if (n9 == -1) {
            return;
        }
        int n12 = arrf.getPointerId(n8);
        int n13 = this.f(arrf.getToolType(n8));
        float f8 = arrf.getX(n8);
        float f9 = arrf.getY(n8);
        float[] arrf2 = new float[]{f8, f9};
        motionRange.mapPoints(arrf2);
        if (n13 == 1) {
            l9 = l8 = (long)(arrf.getButtonState() & 31);
            if (l8 == 0L) {
                l9 = l8;
                if (arrf.getSource() == 8194) {
                    l9 = l8;
                    if (n9 == 4) {
                        this.d.put((Object)n12, (Object)arrf2);
                        l9 = l8;
                    }
                }
            }
        } else {
            l9 = n13 == 2 ? (long)(arrf.getButtonState() >> 4 & 15) : 0L;
        }
        if (bl = this.d.containsKey((Object)n12)) {
            n11 = this.e(n9);
            if (n11 == -1) {
                return;
            }
        } else {
            n11 = -1;
        }
        l8 = this.c ? this.b.c((MotionEvent)arrf).d() : 0L;
        int n14 = arrf.getActionMasked() == 8 ? 1 : 0;
        long l10 = arrf.getEventTime();
        byteBuffer.putLong(l8);
        byteBuffer.putLong(l10 * 1000L);
        if (bl) {
            byteBuffer.putLong((long)n11);
            l8 = 4L;
        } else {
            byteBuffer.putLong((long)n9);
            l8 = n13;
        }
        byteBuffer.putLong(l8);
        byteBuffer.putLong((long)n14);
        byteBuffer.putLong((long)n12);
        byteBuffer.putLong(0L);
        if (bl) {
            motionRange = (InputDevice.MotionRange)this.d.get((Object)n12);
            byteBuffer.putDouble((double)motionRange[0]);
            byteBuffer.putDouble((double)motionRange[1]);
        } else {
            byteBuffer.putDouble((double)arrf2[0]);
            byteBuffer.putDouble((double)arrf2[1]);
        }
        byteBuffer.putDouble(0.0);
        byteBuffer.putDouble(0.0);
        byteBuffer.putLong(l9);
        byteBuffer.putLong(0L);
        byteBuffer.putLong(0L);
        byteBuffer.putDouble((double)arrf.getPressure(n8));
        if (arrf.getDevice() != null && (motionRange = arrf.getDevice().getMotionRange(2)) != null) {
            d8 = motionRange.getMin();
            d9 = motionRange.getMax();
        } else {
            d8 = 0.0;
            d9 = 1.0;
        }
        byteBuffer.putDouble(d8);
        byteBuffer.putDouble(d9);
        if (n13 == 2) {
            byteBuffer.putDouble((double)arrf.getAxisValue(24, n8));
        } else {
            byteBuffer.putDouble(0.0);
        }
        byteBuffer.putDouble(0.0);
        byteBuffer.putDouble((double)arrf.getSize(n8));
        byteBuffer.putDouble((double)arrf.getToolMajor(n8));
        byteBuffer.putDouble((double)arrf.getToolMinor(n8));
        byteBuffer.putDouble(0.0);
        byteBuffer.putDouble(0.0);
        byteBuffer.putDouble((double)arrf.getAxisValue(8, n8));
        if (n13 == 2) {
            byteBuffer.putDouble((double)arrf.getAxisValue(25, n8));
        } else {
            byteBuffer.putDouble(0.0);
        }
        byteBuffer.putLong((long)n10);
        if (n14 == 1) {
            if (context != null) {
                d9 = this.c(context);
                d8 = this.g(context);
            } else {
                d9 = 48.0;
                d8 = 48.0;
            }
            double d10 = - arrf.getAxisValue(10, n8);
            double d11 = - arrf.getAxisValue(9, n8);
            byteBuffer.putDouble(d9 * d10);
            byteBuffer.putDouble(d8 * d11);
        } else {
            byteBuffer.putDouble(0.0);
            byteBuffer.putDouble(0.0);
        }
        if (bl) {
            arrf = (float[])this.d.get((Object)n12);
            byteBuffer.putDouble((double)(arrf2[0] - arrf[0]));
            byteBuffer.putDouble((double)(arrf2[1] - arrf[1]));
        } else {
            byteBuffer.putDouble(0.0);
            byteBuffer.putDouble(0.0);
        }
        byteBuffer.putDouble(0.0);
        byteBuffer.putDouble(0.0);
        byteBuffer.putDouble(1.0);
        byteBuffer.putDouble(0.0);
        byteBuffer.putLong(0L);
        if (bl && n11 == 9) {
            this.d.remove((Object)n12);
        }
    }

    public final float c(Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return b.a(ViewConfiguration.get((Context)context));
        }
        return this.i(context);
    }

    public final int d(int n8) {
        if (n8 == 0) {
            return 4;
        }
        if (n8 == 1) {
            return 6;
        }
        if (n8 == 5) {
            return 4;
        }
        if (n8 == 6) {
            return 6;
        }
        if (n8 == 2) {
            return 5;
        }
        if (n8 == 7) {
            return 3;
        }
        if (n8 == 3) {
            return 0;
        }
        if (n8 == 8) {
            return 3;
        }
        return -1;
    }

    public final int e(int n8) {
        if (n8 == 4) {
            return 7;
        }
        if (n8 == 5) {
            return 8;
        }
        if (n8 != 6 && n8 != 0) {
            return -1;
        }
        return 9;
    }

    public final int f(int n8) {
        if (n8 != 1) {
            if (n8 != 2) {
                if (n8 != 3) {
                    if (n8 != 4) {
                        return 5;
                    }
                    return 3;
                }
                return 1;
            }
            return 2;
        }
        return 0;
    }

    public final float g(Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.h(context);
        }
        return this.i(context);
    }

    public final float h(Context context) {
        return a.a(ViewConfiguration.get((Context)context));
    }

    public final int i(Context context) {
        if (this.e == 0) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                return 48;
            }
            this.e = (int)typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.e;
    }

    public boolean j(MotionEvent motionEvent, Context context) {
        boolean bl = motionEvent.isFromSource(2);
        int n8 = motionEvent.getActionMasked() != 7 && motionEvent.getActionMasked() != 8 ? 0 : 1;
        if (bl && n8 != 0) {
            n8 = this.d(motionEvent.getActionMasked());
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect((int)(motionEvent.getPointerCount() * 288));
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            this.b(motionEvent, motionEvent.getActionIndex(), n8, 0, f, byteBuffer, context);
            if (byteBuffer.position() % 288 == 0) {
                this.a.g(byteBuffer, byteBuffer.position());
                return true;
            }
            throw new AssertionError((Object)"Packet position is not on field boundary.");
        }
        return false;
    }

    public boolean k(MotionEvent motionEvent) {
        return this.l(motionEvent, f);
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean l(MotionEvent motionEvent, Matrix matrix) {
        ByteBuffer byteBuffer;
        block6 : {
            int n8;
            int n9;
            int n10;
            block5 : {
                block4 : {
                    n10 = motionEvent.getPointerCount();
                    byteBuffer = ByteBuffer.allocateDirect((int)(n10 * 288));
                    byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                    int n11 = motionEvent.getActionMasked();
                    n9 = this.d(motionEvent.getActionMasked());
                    n8 = n11 != 0 && n11 != 5 ? 0 : 1;
                    n11 = n8 == 0 && (n11 == 1 || n11 == 6) ? 1 : 0;
                    if (n8 != 0) break block4;
                    int n12 = 0;
                    if (n11 != 0) {
                        for (n8 = n12; n8 < n10; ++n8) {
                            if (n8 == motionEvent.getActionIndex() || motionEvent.getToolType(n8) != 1) continue;
                            this.a(motionEvent, n8, 5, 1, matrix, byteBuffer);
                        }
                    }
                    break block5;
                }
                this.a(motionEvent, motionEvent.getActionIndex(), n9, 0, matrix, byteBuffer);
                break block6;
            }
            for (n8 = 0; n8 < n10; ++n8) {
                this.a(motionEvent, n8, n9, 0, matrix, byteBuffer);
            }
        }
        if (byteBuffer.position() % 288 == 0) {
            this.a.g(byteBuffer, byteBuffer.position());
            return true;
        }
        throw new AssertionError((Object)"Packet position is not on field boundary");
    }
}

