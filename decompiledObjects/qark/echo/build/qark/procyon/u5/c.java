// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package u5;

import android.view.InputEvent;
import java.nio.ByteOrder;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import android.os.Build$VERSION;
import android.view.InputDevice$MotionRange;
import android.content.Context;
import java.nio.ByteBuffer;
import android.view.MotionEvent;
import java.util.HashMap;
import java.util.Map;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import android.graphics.Matrix;

public class c
{
    public static final Matrix f;
    public final FlutterRenderer a;
    public final N b;
    public final boolean c;
    public final Map d;
    public int e;
    
    static {
        f = new Matrix();
    }
    
    public c(final FlutterRenderer a, final boolean c) {
        this.d = new HashMap();
        this.a = a;
        this.b = N.a();
        this.c = c;
    }
    
    public final void a(final MotionEvent motionEvent, final int n, final int n2, final int n3, final Matrix matrix, final ByteBuffer byteBuffer) {
        this.b(motionEvent, n, n2, n3, matrix, byteBuffer, null);
    }
    
    public final void b(final MotionEvent motionEvent, final int n, final int n2, final int n3, final Matrix matrix, final ByteBuffer byteBuffer, final Context context) {
        if (n2 == -1) {
            return;
        }
        final int pointerId = motionEvent.getPointerId(n);
        final int f = this.f(motionEvent.getToolType(n));
        final float[] array = { motionEvent.getX(n), motionEvent.getY(n) };
        matrix.mapPoints(array);
        long n5;
        if (f == 1) {
            final long n4 = n5 = (motionEvent.getButtonState() & 0x1F);
            if (n4 == 0L) {
                n5 = n4;
                if (motionEvent.getSource() == 8194) {
                    n5 = n4;
                    if (n2 == 4) {
                        this.d.put(pointerId, array);
                        n5 = n4;
                    }
                }
            }
        }
        else if (f == 2) {
            n5 = (motionEvent.getButtonState() >> 4 & 0xF);
        }
        else {
            n5 = 0L;
        }
        final boolean containsKey = this.d.containsKey(pointerId);
        int e;
        if (containsKey) {
            e = this.e(n2);
            if (e == -1) {
                return;
            }
        }
        else {
            e = -1;
        }
        long d;
        if (this.c) {
            d = this.b.c(motionEvent).d();
        }
        else {
            d = 0L;
        }
        final boolean b = motionEvent.getActionMasked() == 8;
        final long eventTime = motionEvent.getEventTime();
        byteBuffer.putLong(d);
        byteBuffer.putLong(eventTime * 1000L);
        long n6;
        if (containsKey) {
            byteBuffer.putLong(e);
            n6 = 4L;
        }
        else {
            byteBuffer.putLong(n2);
            n6 = f;
        }
        byteBuffer.putLong(n6);
        byteBuffer.putLong(b ? 1 : 0);
        byteBuffer.putLong(pointerId);
        byteBuffer.putLong(0L);
        if (containsKey) {
            final float[] array2 = this.d.get(pointerId);
            byteBuffer.putDouble(array2[0]);
            byteBuffer.putDouble(array2[1]);
        }
        else {
            byteBuffer.putDouble(array[0]);
            byteBuffer.putDouble(array[1]);
        }
        byteBuffer.putDouble(0.0);
        byteBuffer.putDouble(0.0);
        byteBuffer.putLong(n5);
        byteBuffer.putLong(0L);
        byteBuffer.putLong(0L);
        byteBuffer.putDouble(motionEvent.getPressure(n));
        double n7 = 0.0;
        double n8 = 0.0;
        Label_0514: {
            if (((InputEvent)motionEvent).getDevice() != null) {
                final InputDevice$MotionRange motionRange = ((InputEvent)motionEvent).getDevice().getMotionRange(2);
                if (motionRange != null) {
                    n7 = motionRange.getMin();
                    n8 = motionRange.getMax();
                    break Label_0514;
                }
            }
            n7 = 0.0;
            n8 = 1.0;
        }
        byteBuffer.putDouble(n7);
        byteBuffer.putDouble(n8);
        if (f == 2) {
            byteBuffer.putDouble(motionEvent.getAxisValue(24, n));
        }
        else {
            byteBuffer.putDouble(0.0);
        }
        byteBuffer.putDouble(0.0);
        byteBuffer.putDouble(motionEvent.getSize(n));
        byteBuffer.putDouble(motionEvent.getToolMajor(n));
        byteBuffer.putDouble(motionEvent.getToolMinor(n));
        byteBuffer.putDouble(0.0);
        byteBuffer.putDouble(0.0);
        byteBuffer.putDouble(motionEvent.getAxisValue(8, n));
        if (f == 2) {
            byteBuffer.putDouble(motionEvent.getAxisValue(25, n));
        }
        else {
            byteBuffer.putDouble(0.0);
        }
        byteBuffer.putLong(n3);
        if (b) {
            double n9;
            double n10;
            if (context != null) {
                n9 = this.c(context);
                n10 = this.g(context);
            }
            else {
                n9 = 48.0;
                n10 = 48.0;
            }
            final double n11 = -motionEvent.getAxisValue(10, n);
            final double n12 = -motionEvent.getAxisValue(9, n);
            byteBuffer.putDouble(n9 * n11);
            byteBuffer.putDouble(n10 * n12);
        }
        else {
            byteBuffer.putDouble(0.0);
            byteBuffer.putDouble(0.0);
        }
        if (containsKey) {
            final float[] array3 = this.d.get(pointerId);
            byteBuffer.putDouble(array[0] - array3[0]);
            byteBuffer.putDouble(array[1] - array3[1]);
        }
        else {
            byteBuffer.putDouble(0.0);
            byteBuffer.putDouble(0.0);
        }
        byteBuffer.putDouble(0.0);
        byteBuffer.putDouble(0.0);
        byteBuffer.putDouble(1.0);
        byteBuffer.putDouble(0.0);
        byteBuffer.putLong(0L);
        if (containsKey && e == 9) {
            this.d.remove(pointerId);
        }
    }
    
    public final float c(final Context context) {
        if (Build$VERSION.SDK_INT >= 26) {
            return u5.b.a(ViewConfiguration.get(context));
        }
        return (float)this.i(context);
    }
    
    public final int d(final int n) {
        if (n == 0) {
            return 4;
        }
        if (n == 1) {
            return 6;
        }
        if (n == 5) {
            return 4;
        }
        if (n == 6) {
            return 6;
        }
        if (n == 2) {
            return 5;
        }
        if (n == 7) {
            return 3;
        }
        if (n == 3) {
            return 0;
        }
        if (n == 8) {
            return 3;
        }
        return -1;
    }
    
    public final int e(final int n) {
        if (n == 4) {
            return 7;
        }
        if (n == 5) {
            return 8;
        }
        if (n != 6 && n != 0) {
            return -1;
        }
        return 9;
    }
    
    public final int f(final int n) {
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 2;
        }
        if (n == 3) {
            return 1;
        }
        if (n != 4) {
            return 5;
        }
        return 3;
    }
    
    public final float g(final Context context) {
        if (Build$VERSION.SDK_INT >= 26) {
            return this.h(context);
        }
        return (float)this.i(context);
    }
    
    public final float h(final Context context) {
        return u5.a.a(ViewConfiguration.get(context));
    }
    
    public final int i(final Context context) {
        if (this.e == 0) {
            final TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                return 48;
            }
            this.e = (int)typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.e;
    }
    
    public boolean j(final MotionEvent motionEvent, final Context context) {
        final boolean fromSource = ((InputEvent)motionEvent).isFromSource(2);
        final boolean b = motionEvent.getActionMasked() == 7 || motionEvent.getActionMasked() == 8;
        if (!fromSource || !b) {
            return false;
        }
        final int d = this.d(motionEvent.getActionMasked());
        final ByteBuffer allocateDirect = ByteBuffer.allocateDirect(motionEvent.getPointerCount() * 288);
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        this.b(motionEvent, motionEvent.getActionIndex(), d, 0, u5.c.f, allocateDirect, context);
        if (allocateDirect.position() % 288 == 0) {
            this.a.g(allocateDirect, allocateDirect.position());
            return true;
        }
        throw new AssertionError((Object)"Packet position is not on field boundary.");
    }
    
    public boolean k(final MotionEvent motionEvent) {
        return this.l(motionEvent, u5.c.f);
    }
    
    public boolean l(final MotionEvent motionEvent, final Matrix matrix) {
        final int pointerCount = motionEvent.getPointerCount();
        final ByteBuffer allocateDirect = ByteBuffer.allocateDirect(pointerCount * 288);
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        final int actionMasked = motionEvent.getActionMasked();
        final int d = this.d(motionEvent.getActionMasked());
        final boolean b = actionMasked == 0 || actionMasked == 5;
        final boolean b2 = !b && (actionMasked == 1 || actionMasked == 6);
        Label_0190: {
            if (!b) {
                int i = 0;
                final int n = 0;
                if (!b2) {
                    while (i < pointerCount) {
                        this.a(motionEvent, i, d, 0, matrix, allocateDirect);
                        ++i;
                    }
                    break Label_0190;
                }
                for (int j = n; j < pointerCount; ++j) {
                    if (j != motionEvent.getActionIndex() && motionEvent.getToolType(j) == 1) {
                        this.a(motionEvent, j, 5, 1, matrix, allocateDirect);
                    }
                }
            }
            this.a(motionEvent, motionEvent.getActionIndex(), d, 0, matrix, allocateDirect);
        }
        if (allocateDirect.position() % 288 == 0) {
            this.a.g(allocateDirect, allocateDirect.position());
            return true;
        }
        throw new AssertionError((Object)"Packet position is not on field boundary");
    }
}
