package l;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;
import y.a;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final CompoundButton f9351a;

    /* renamed from: b, reason: collision with root package name */
    public ColorStateList f9352b = null;

    /* renamed from: c, reason: collision with root package name */
    public PorterDuff.Mode f9353c = null;

    /* renamed from: d, reason: collision with root package name */
    public boolean f9354d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f9355e = false;
    public boolean f;

    public i(CompoundButton compoundButton) {
        this.f9351a = compoundButton;
    }

    public final void a() {
        Drawable a10 = j0.c.a(this.f9351a);
        if (a10 != null) {
            if (this.f9354d || this.f9355e) {
                Drawable mutate = a10.mutate();
                if (this.f9354d) {
                    a.C0261a.h(mutate, this.f9352b);
                }
                if (this.f9355e) {
                    a.C0261a.i(mutate, this.f9353c);
                }
                if (mutate.isStateful()) {
                    mutate.setState(this.f9351a.getDrawableState());
                }
                this.f9351a.setButtonDrawable(mutate);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0058 A[Catch: all -> 0x007b, TryCatch #1 {all -> 0x007b, blocks: (B:3:0x001a, B:5:0x0021, B:8:0x0027, B:10:0x0038, B:12:0x003e, B:14:0x0044, B:15:0x0051, B:17:0x0058, B:18:0x0061, B:20:0x0068), top: B:2:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0068 A[Catch: all -> 0x007b, TRY_LEAVE, TryCatch #1 {all -> 0x007b, blocks: (B:3:0x001a, B:5:0x0021, B:8:0x0027, B:10:0x0038, B:12:0x003e, B:14:0x0044, B:15:0x0051, B:17:0x0058, B:18:0x0061, B:20:0x0068), top: B:2:0x001a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(android.util.AttributeSet r8, int r9) {
        /*
            r7 = this;
            android.widget.CompoundButton r0 = r7.f9351a
            android.content.Context r0 = r0.getContext()
            int[] r3 = b.a0.f1584z
            l.z0 r0 = l.z0.m(r0, r8, r3, r9)
            android.widget.CompoundButton r1 = r7.f9351a
            android.content.Context r2 = r1.getContext()
            android.content.res.TypedArray r5 = r0.f9519b
            r4 = r8
            r6 = r9
            e0.d0.g(r1, r2, r3, r4, r5, r6)
            r8 = 1
            boolean r9 = r0.l(r8)     // Catch: java.lang.Throwable -> L7b
            r1 = 0
            if (r9 == 0) goto L35
            int r9 = r0.i(r8, r1)     // Catch: java.lang.Throwable -> L7b
            if (r9 == 0) goto L35
            android.widget.CompoundButton r2 = r7.f9351a     // Catch: android.content.res.Resources.NotFoundException -> L35 java.lang.Throwable -> L7b
            android.content.Context r3 = r2.getContext()     // Catch: android.content.res.Resources.NotFoundException -> L35 java.lang.Throwable -> L7b
            android.graphics.drawable.Drawable r9 = x6.b.X(r3, r9)     // Catch: android.content.res.Resources.NotFoundException -> L35 java.lang.Throwable -> L7b
            r2.setButtonDrawable(r9)     // Catch: android.content.res.Resources.NotFoundException -> L35 java.lang.Throwable -> L7b
            goto L36
        L35:
            r8 = r1
        L36:
            if (r8 != 0) goto L51
            boolean r8 = r0.l(r1)     // Catch: java.lang.Throwable -> L7b
            if (r8 == 0) goto L51
            int r8 = r0.i(r1, r1)     // Catch: java.lang.Throwable -> L7b
            if (r8 == 0) goto L51
            android.widget.CompoundButton r9 = r7.f9351a     // Catch: java.lang.Throwable -> L7b
            android.content.Context r1 = r9.getContext()     // Catch: java.lang.Throwable -> L7b
            android.graphics.drawable.Drawable r8 = x6.b.X(r1, r8)     // Catch: java.lang.Throwable -> L7b
            r9.setButtonDrawable(r8)     // Catch: java.lang.Throwable -> L7b
        L51:
            r8 = 2
            boolean r9 = r0.l(r8)     // Catch: java.lang.Throwable -> L7b
            if (r9 == 0) goto L61
            android.widget.CompoundButton r9 = r7.f9351a     // Catch: java.lang.Throwable -> L7b
            android.content.res.ColorStateList r8 = r0.b(r8)     // Catch: java.lang.Throwable -> L7b
            j0.b.c(r9, r8)     // Catch: java.lang.Throwable -> L7b
        L61:
            r8 = 3
            boolean r9 = r0.l(r8)     // Catch: java.lang.Throwable -> L7b
            if (r9 == 0) goto L77
            android.widget.CompoundButton r9 = r7.f9351a     // Catch: java.lang.Throwable -> L7b
            r1 = -1
            int r8 = r0.h(r8, r1)     // Catch: java.lang.Throwable -> L7b
            r1 = 0
            android.graphics.PorterDuff$Mode r8 = l.i0.b(r8, r1)     // Catch: java.lang.Throwable -> L7b
            j0.b.d(r9, r8)     // Catch: java.lang.Throwable -> L7b
        L77:
            r0.n()
            return
        L7b:
            r8 = move-exception
            r0.n()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: l.i.b(android.util.AttributeSet, int):void");
    }
}
