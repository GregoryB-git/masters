package u5;

import android.R;
import android.content.Context;
import android.graphics.Matrix;
import android.os.Build;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.Map;

/* renamed from: u5.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2016c {

    /* renamed from: f, reason: collision with root package name */
    public static final Matrix f19898f = new Matrix();

    /* renamed from: a, reason: collision with root package name */
    public final FlutterRenderer f19899a;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f19901c;

    /* renamed from: e, reason: collision with root package name */
    public int f19903e;

    /* renamed from: d, reason: collision with root package name */
    public final Map f19902d = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final N f19900b = N.a();

    public C2016c(FlutterRenderer flutterRenderer, boolean z7) {
        this.f19899a = flutterRenderer;
        this.f19901c = z7;
    }

    public final void a(MotionEvent motionEvent, int i7, int i8, int i9, Matrix matrix, ByteBuffer byteBuffer) {
        b(motionEvent, i7, i8, i9, matrix, byteBuffer, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x015c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(android.view.MotionEvent r26, int r27, int r28, int r29, android.graphics.Matrix r30, java.nio.ByteBuffer r31, android.content.Context r32) {
        /*
            Method dump skipped, instructions count: 547
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u5.C2016c.b(android.view.MotionEvent, int, int, int, android.graphics.Matrix, java.nio.ByteBuffer, android.content.Context):void");
    }

    public final float c(Context context) {
        float scaledHorizontalScrollFactor;
        if (Build.VERSION.SDK_INT < 26) {
            return i(context);
        }
        scaledHorizontalScrollFactor = ViewConfiguration.get(context).getScaledHorizontalScrollFactor();
        return scaledHorizontalScrollFactor;
    }

    public final int d(int i7) {
        if (i7 == 0) {
            return 4;
        }
        if (i7 == 1) {
            return 6;
        }
        if (i7 == 5) {
            return 4;
        }
        if (i7 == 6) {
            return 6;
        }
        if (i7 == 2) {
            return 5;
        }
        if (i7 == 7) {
            return 3;
        }
        if (i7 == 3) {
            return 0;
        }
        return i7 == 8 ? 3 : -1;
    }

    public final int e(int i7) {
        if (i7 == 4) {
            return 7;
        }
        if (i7 == 5) {
            return 8;
        }
        return (i7 == 6 || i7 == 0) ? 9 : -1;
    }

    public final int f(int i7) {
        if (i7 == 1) {
            return 0;
        }
        if (i7 == 2) {
            return 2;
        }
        if (i7 != 3) {
            return i7 != 4 ? 5 : 3;
        }
        return 1;
    }

    public final float g(Context context) {
        return Build.VERSION.SDK_INT >= 26 ? h(context) : i(context);
    }

    public final float h(Context context) {
        float scaledVerticalScrollFactor;
        scaledVerticalScrollFactor = ViewConfiguration.get(context).getScaledVerticalScrollFactor();
        return scaledVerticalScrollFactor;
    }

    public final int i(Context context) {
        if (this.f19903e == 0) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                return 48;
            }
            this.f19903e = (int) typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f19903e;
    }

    public boolean j(MotionEvent motionEvent, Context context) {
        boolean isFromSource = motionEvent.isFromSource(2);
        boolean z7 = motionEvent.getActionMasked() == 7 || motionEvent.getActionMasked() == 8;
        if (!isFromSource || !z7) {
            return false;
        }
        int d7 = d(motionEvent.getActionMasked());
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(motionEvent.getPointerCount() * 288);
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        b(motionEvent, motionEvent.getActionIndex(), d7, 0, f19898f, allocateDirect, context);
        if (allocateDirect.position() % 288 != 0) {
            throw new AssertionError("Packet position is not on field boundary.");
        }
        this.f19899a.g(allocateDirect, allocateDirect.position());
        return true;
    }

    public boolean k(MotionEvent motionEvent) {
        return l(motionEvent, f19898f);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean l(android.view.MotionEvent r13, android.graphics.Matrix r14) {
        /*
            r12 = this;
            int r0 = r13.getPointerCount()
            int r1 = r0 * 288
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocateDirect(r1)
            java.nio.ByteOrder r2 = java.nio.ByteOrder.LITTLE_ENDIAN
            r1.order(r2)
            int r2 = r13.getActionMasked()
            int r3 = r13.getActionMasked()
            int r9 = r12.d(r3)
            r3 = 0
            r10 = 1
            if (r2 == 0) goto L25
            r4 = 5
            if (r2 != r4) goto L23
            goto L25
        L23:
            r4 = r3
            goto L26
        L25:
            r4 = r10
        L26:
            if (r4 != 0) goto L2f
            if (r2 == r10) goto L2d
            r5 = 6
            if (r2 != r5) goto L2f
        L2d:
            r2 = r10
            goto L30
        L2f:
            r2 = r3
        L30:
            if (r4 == 0) goto L40
        L32:
            int r4 = r13.getActionIndex()
            r6 = 0
            r2 = r12
            r3 = r13
            r5 = r9
            r7 = r14
            r8 = r1
            r2.a(r3, r4, r5, r6, r7, r8)
            goto L6d
        L40:
            r11 = r3
            if (r2 == 0) goto L5e
        L43:
            if (r11 >= r0) goto L32
            int r2 = r13.getActionIndex()
            if (r11 == r2) goto L5b
            int r2 = r13.getToolType(r11)
            if (r2 != r10) goto L5b
            r5 = 5
            r6 = 1
            r2 = r12
            r3 = r13
            r4 = r11
            r7 = r14
            r8 = r1
            r2.a(r3, r4, r5, r6, r7, r8)
        L5b:
            int r11 = r11 + 1
            goto L43
        L5e:
            if (r11 >= r0) goto L6d
            r6 = 0
            r2 = r12
            r3 = r13
            r4 = r11
            r5 = r9
            r7 = r14
            r8 = r1
            r2.a(r3, r4, r5, r6, r7, r8)
            int r11 = r11 + 1
            goto L5e
        L6d:
            int r13 = r1.position()
            int r13 = r13 % 288
            if (r13 != 0) goto L7f
            io.flutter.embedding.engine.renderer.FlutterRenderer r13 = r12.f19899a
            int r14 = r1.position()
            r13.g(r1, r14)
            return r10
        L7f:
            java.lang.AssertionError r13 = new java.lang.AssertionError
            java.lang.String r14 = "Packet position is not on field boundary"
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: u5.C2016c.l(android.view.MotionEvent, android.graphics.Matrix):boolean");
    }
}
