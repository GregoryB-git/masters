package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import b.a0;

/* loaded from: classes.dex */
public final class AspectRatioFrameLayout extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final b f2700a;

    /* renamed from: b, reason: collision with root package name */
    public float f2701b;

    /* renamed from: c, reason: collision with root package name */
    public int f2702c;

    public interface a {
        void a();
    }

    public final class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public boolean f2703a;

        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f2703a = false;
            AspectRatioFrameLayout.this.getClass();
        }
    }

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2702c = 0;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, a0.W, 0, 0);
            try {
                this.f2702c = obtainStyledAttributes.getInt(0, 0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.f2700a = new b();
    }

    public int getResizeMode() {
        return this.f2702c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004f, code lost:
    
        if (r4 > 0.0f) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0054, code lost:
    
        if (r4 > 0.0f) goto L24;
     */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            super.onMeasure(r8, r9)
            float r8 = r7.f2701b
            r9 = 0
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 > 0) goto Lb
            return
        Lb:
            int r8 = r7.getMeasuredWidth()
            int r0 = r7.getMeasuredHeight()
            float r1 = (float) r8
            float r2 = (float) r0
            float r3 = r1 / r2
            float r4 = r7.f2701b
            float r4 = r4 / r3
            r3 = 1065353216(0x3f800000, float:1.0)
            float r4 = r4 - r3
            float r3 = java.lang.Math.abs(r4)
            r5 = 1008981770(0x3c23d70a, float:0.01)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r5 = 1
            if (r3 > 0) goto L40
            com.google.android.exoplayer2.ui.AspectRatioFrameLayout$b r8 = r7.f2700a
            r8.getClass()
            r8.getClass()
            r8.getClass()
            boolean r9 = r8.f2703a
            if (r9 != 0) goto L3f
            r8.f2703a = r5
            com.google.android.exoplayer2.ui.AspectRatioFrameLayout r9 = com.google.android.exoplayer2.ui.AspectRatioFrameLayout.this
            r9.post(r8)
        L3f:
            return
        L40:
            int r3 = r7.f2702c
            if (r3 == 0) goto L52
            if (r3 == r5) goto L56
            r6 = 2
            if (r3 == r6) goto L5b
            r6 = 4
            if (r3 == r6) goto L4d
            goto L5f
        L4d:
            int r9 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r9 <= 0) goto L56
            goto L5b
        L52:
            int r9 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r9 <= 0) goto L5b
        L56:
            float r9 = r7.f2701b
            float r1 = r1 / r9
            int r0 = (int) r1
            goto L5f
        L5b:
            float r8 = r7.f2701b
            float r2 = r2 * r8
            int r8 = (int) r2
        L5f:
            com.google.android.exoplayer2.ui.AspectRatioFrameLayout$b r9 = r7.f2700a
            r9.getClass()
            r9.getClass()
            r9.getClass()
            boolean r1 = r9.f2703a
            if (r1 != 0) goto L75
            r9.f2703a = r5
            com.google.android.exoplayer2.ui.AspectRatioFrameLayout r1 = com.google.android.exoplayer2.ui.AspectRatioFrameLayout.this
            r1.post(r9)
        L75:
            r9 = 1073741824(0x40000000, float:2.0)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r9)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r9)
            super.onMeasure(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.AspectRatioFrameLayout.onMeasure(int, int):void");
    }

    public void setAspectRatio(float f) {
        if (this.f2701b != f) {
            this.f2701b = f;
            requestLayout();
        }
    }

    public void setAspectRatioListener(a aVar) {
    }

    public void setResizeMode(int i10) {
        if (this.f2702c != i10) {
            this.f2702c = i10;
            requestLayout();
        }
    }
}
