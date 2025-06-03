package h;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.res.Resources;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import h.b;
import h.d;
import r.i;

/* loaded from: classes.dex */
public final class a extends h.d {
    public int A;
    public boolean B;

    /* renamed from: x, reason: collision with root package name */
    public b f7007x;

    /* renamed from: y, reason: collision with root package name */
    public f f7008y;

    /* renamed from: z, reason: collision with root package name */
    public int f7009z;

    /* renamed from: h.a$a, reason: collision with other inner class name */
    public static class C0103a extends f {

        /* renamed from: a, reason: collision with root package name */
        public final Animatable f7010a;

        public C0103a(Animatable animatable) {
            this.f7010a = animatable;
        }

        @Override // h.a.f
        public final void c() {
            this.f7010a.start();
        }

        @Override // h.a.f
        public final void d() {
            this.f7010a.stop();
        }
    }

    public static class b extends d.a {
        public r.e<Long> I;
        public i<Integer> J;

        public b(b bVar, a aVar, Resources resources) {
            super(bVar, aVar, resources);
            i<Integer> iVar;
            if (bVar != null) {
                this.I = bVar.I;
                iVar = bVar.J;
            } else {
                this.I = new r.e<>();
                iVar = new i<>();
            }
            this.J = iVar;
        }

        @Override // h.d.a, h.b.c
        public final void e() {
            this.I = this.I.clone();
            this.J = this.J.clone();
        }

        @Override // h.d.a, android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            return new a(this, null);
        }

        @Override // h.d.a, android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            return new a(this, resources);
        }
    }

    public static class c extends f {

        /* renamed from: a, reason: collision with root package name */
        public final a2.b f7011a;

        public c(a2.b bVar) {
            this.f7011a = bVar;
        }

        @Override // h.a.f
        public final void c() {
            this.f7011a.start();
        }

        @Override // h.a.f
        public final void d() {
            this.f7011a.stop();
        }
    }

    public static class d extends f {

        /* renamed from: a, reason: collision with root package name */
        public final ObjectAnimator f7012a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f7013b;

        public d(AnimationDrawable animationDrawable, boolean z10, boolean z11) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i10 = z10 ? numberOfFrames - 1 : 0;
            int i11 = z10 ? 0 : numberOfFrames - 1;
            e eVar = new e(animationDrawable, z10);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i10, i11);
            i.a.a(ofInt, true);
            ofInt.setDuration(eVar.f7016c);
            ofInt.setInterpolator(eVar);
            this.f7013b = z11;
            this.f7012a = ofInt;
        }

        @Override // h.a.f
        public final boolean a() {
            return this.f7013b;
        }

        @Override // h.a.f
        public final void b() {
            this.f7012a.reverse();
        }

        @Override // h.a.f
        public final void c() {
            this.f7012a.start();
        }

        @Override // h.a.f
        public final void d() {
            this.f7012a.cancel();
        }
    }

    public static class e implements TimeInterpolator {

        /* renamed from: a, reason: collision with root package name */
        public int[] f7014a;

        /* renamed from: b, reason: collision with root package name */
        public int f7015b;

        /* renamed from: c, reason: collision with root package name */
        public int f7016c;

        public e(AnimationDrawable animationDrawable, boolean z10) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f7015b = numberOfFrames;
            int[] iArr = this.f7014a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.f7014a = new int[numberOfFrames];
            }
            int[] iArr2 = this.f7014a;
            int i10 = 0;
            for (int i11 = 0; i11 < numberOfFrames; i11++) {
                int duration = animationDrawable.getDuration(z10 ? (numberOfFrames - i11) - 1 : i11);
                iArr2[i11] = duration;
                i10 += duration;
            }
            this.f7016c = i10;
        }

        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            int i10 = (int) ((f * this.f7016c) + 0.5f);
            int i11 = this.f7015b;
            int[] iArr = this.f7014a;
            int i12 = 0;
            while (i12 < i11) {
                int i13 = iArr[i12];
                if (i10 < i13) {
                    break;
                }
                i10 -= i13;
                i12++;
            }
            return (i12 / i11) + (i12 < i11 ? i10 / this.f7016c : 0.0f);
        }
    }

    public static abstract class f {
        public boolean a() {
            return false;
        }

        public void b() {
        }

        public abstract void c();

        public abstract void d();
    }

    public a() {
        this(null, null);
    }

    public a(b bVar, Resources resources) {
        this.f7009z = -1;
        this.A = -1;
        e(new b(bVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x026d, code lost:
    
        r4.onStateChange(r4.getState());
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0274, code lost:
    
        return r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static h.a g(android.content.Context r23, android.content.res.Resources.Theme r24, android.content.res.Resources r25, android.util.AttributeSet r26, android.content.res.XmlResourceParser r27) {
        /*
            Method dump skipped, instructions count: 659
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h.a.g(android.content.Context, android.content.res.Resources$Theme, android.content.res.Resources, android.util.AttributeSet, android.content.res.XmlResourceParser):h.a");
    }

    @Override // h.d, h.b
    public final b.c b() {
        return new b(this.f7007x, this, null);
    }

    @Override // h.d, h.b
    public final void e(b.c cVar) {
        super.e(cVar);
        if (cVar instanceof b) {
            this.f7007x = (b) cVar;
        }
    }

    @Override // h.d
    /* renamed from: f */
    public final d.a b() {
        return new b(this.f7007x, this, null);
    }

    @Override // h.b, android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        super.jumpToCurrentState();
        f fVar = this.f7008y;
        if (fVar != null) {
            fVar.d();
            this.f7008y = null;
            d(this.f7009z);
            this.f7009z = -1;
            this.A = -1;
        }
    }

    @Override // h.d, h.b, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.B) {
            super.mutate();
            this.f7007x.e();
            this.B = true;
        }
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0107, code lost:
    
        if (d(r1) == false) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    @Override // h.d, h.b, android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onStateChange(int[] r15) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h.a.onStateChange(int[]):boolean");
    }

    @Override // h.b, android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        f fVar = this.f7008y;
        if (fVar != null && (visible || z11)) {
            if (z10) {
                fVar.c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }
}
