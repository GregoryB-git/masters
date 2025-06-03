package h;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.StateSet;
import h.b;

/* loaded from: classes.dex */
public class d extends b {

    /* renamed from: v, reason: collision with root package name */
    public a f7055v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f7056w;

    public static class a extends b.c {
        public int[][] H;

        public a(a aVar, d dVar, Resources resources) {
            super(aVar, dVar, resources);
            if (aVar != null) {
                this.H = aVar.H;
            } else {
                this.H = new int[this.f7035g.length][];
            }
        }

        @Override // h.b.c
        public void e() {
            int[][] iArr = this.H;
            int[][] iArr2 = new int[iArr.length][];
            for (int length = iArr.length - 1; length >= 0; length--) {
                int[] iArr3 = this.H[length];
                iArr2[length] = iArr3 != null ? (int[]) iArr3.clone() : null;
            }
            this.H = iArr2;
        }

        public final int f(int[] iArr) {
            int[][] iArr2 = this.H;
            int i10 = this.f7036h;
            for (int i11 = 0; i11 < i10; i11++) {
                if (StateSet.stateSetMatches(iArr2[i11], iArr)) {
                    return i11;
                }
            }
            return -1;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new d(this, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new d(this, resources);
        }
    }

    public d() {
    }

    public d(a aVar, Resources resources) {
        e(new a(aVar, this, resources));
        onStateChange(getState());
    }

    @Override // h.b, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    @Override // h.b
    public void e(b.c cVar) {
        this.f7018a = cVar;
        int i10 = this.f7023o;
        if (i10 >= 0) {
            Drawable d10 = cVar.d(i10);
            this.f7020c = d10;
            if (d10 != null) {
                c(d10);
            }
        }
        this.f7021d = null;
        if (cVar instanceof a) {
            this.f7055v = (a) cVar;
        }
    }

    @Override // h.b
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public a b() {
        return new a(this.f7055v, this, null);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // h.b, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f7056w) {
            super.mutate();
            this.f7055v.e();
            this.f7056w = true;
        }
        return this;
    }

    @Override // h.b, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        int f = this.f7055v.f(iArr);
        if (f < 0) {
            f = this.f7055v.f(StateSet.WILD_CARD);
        }
        return d(f) || onStateChange;
    }
}
