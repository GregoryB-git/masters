package g;

import e0.q0;

/* loaded from: classes.dex */
public final class j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f5616a;

    public class a extends q0 {
        public a() {
            super(0);
        }

        @Override // e0.q0, e0.p0
        public final void b() {
            j.this.f5616a.D.setVisibility(0);
        }

        @Override // e0.p0
        public final void c() {
            j.this.f5616a.D.setAlpha(1.0f);
            j.this.f5616a.G.d(null);
            j.this.f5616a.G = null;
        }
    }

    public j(g gVar) {
        this.f5616a = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0050  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r4 = this;
            g.g r0 = r4.f5616a
            android.widget.PopupWindow r1 = r0.E
            androidx.appcompat.widget.ActionBarContextView r0 = r0.D
            r2 = 55
            r3 = 0
            r1.showAtLocation(r0, r2, r3, r3)
            g.g r0 = r4.f5616a
            e0.o0 r0 = r0.G
            if (r0 == 0) goto L15
            r0.b()
        L15:
            g.g r0 = r4.f5616a
            boolean r1 = r0.I
            if (r1 == 0) goto L29
            android.view.ViewGroup r0 = r0.J
            if (r0 == 0) goto L29
            java.util.WeakHashMap<android.view.View, e0.o0> r1 = e0.d0.f3766a
            boolean r0 = r0.isLaidOut()
            if (r0 == 0) goto L29
            r0 = 1
            goto L2a
        L29:
            r0 = r3
        L2a:
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L50
            g.g r0 = r4.f5616a
            androidx.appcompat.widget.ActionBarContextView r0 = r0.D
            r2 = 0
            r0.setAlpha(r2)
            g.g r0 = r4.f5616a
            androidx.appcompat.widget.ActionBarContextView r2 = r0.D
            e0.o0 r2 = e0.d0.a(r2)
            r2.a(r1)
            r0.G = r2
            g.g r0 = r4.f5616a
            e0.o0 r0 = r0.G
            g.j$a r1 = new g.j$a
            r1.<init>()
            r0.d(r1)
            goto L5e
        L50:
            g.g r0 = r4.f5616a
            androidx.appcompat.widget.ActionBarContextView r0 = r0.D
            r0.setAlpha(r1)
            g.g r0 = r4.f5616a
            androidx.appcompat.widget.ActionBarContextView r0 = r0.D
            r0.setVisibility(r3)
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g.j.run():void");
    }
}
