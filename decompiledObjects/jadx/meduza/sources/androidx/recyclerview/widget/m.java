package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class m extends e0.a {

    /* renamed from: d, reason: collision with root package name */
    public final RecyclerView f1359d;

    /* renamed from: e, reason: collision with root package name */
    public final a f1360e;

    public static class a extends e0.a {

        /* renamed from: d, reason: collision with root package name */
        public final m f1361d;

        /* renamed from: e, reason: collision with root package name */
        public WeakHashMap f1362e = new WeakHashMap();

        public a(m mVar) {
            this.f1361d = mVar;
        }

        @Override // e0.a
        public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
            e0.a aVar = (e0.a) this.f1362e.get(view);
            return aVar != null ? aVar.a(view, accessibilityEvent) : super.a(view, accessibilityEvent);
        }

        @Override // e0.a
        public final f0.c b(View view) {
            e0.a aVar = (e0.a) this.f1362e.get(view);
            return aVar != null ? aVar.b(view) : super.b(view);
        }

        @Override // e0.a
        public final void c(View view, AccessibilityEvent accessibilityEvent) {
            e0.a aVar = (e0.a) this.f1362e.get(view);
            if (aVar != null) {
                aVar.c(view, accessibilityEvent);
            } else {
                super.c(view, accessibilityEvent);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
        
            if ((r0.f1177c.f1295b.size() > 0) != false) goto L11;
         */
        @Override // e0.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void d(android.view.View r5, f0.b r6) {
            /*
                r4 = this;
                androidx.recyclerview.widget.m r0 = r4.f1361d
                androidx.recyclerview.widget.RecyclerView r0 = r0.f1359d
                boolean r1 = r0.f1205y
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L1d
                boolean r1 = r0.F
                if (r1 != 0) goto L1d
                androidx.recyclerview.widget.a r0 = r0.f1177c
                java.util.ArrayList<androidx.recyclerview.widget.a$a> r0 = r0.f1295b
                int r0 = r0.size()
                if (r0 <= 0) goto L1a
                r0 = r3
                goto L1b
            L1a:
                r0 = r2
            L1b:
                if (r0 == 0) goto L1e
            L1d:
                r2 = r3
            L1e:
                if (r2 != 0) goto L46
                androidx.recyclerview.widget.m r0 = r4.f1361d
                androidx.recyclerview.widget.RecyclerView r0 = r0.f1359d
                androidx.recyclerview.widget.RecyclerView$j r0 = r0.getLayoutManager()
                if (r0 == 0) goto L46
                androidx.recyclerview.widget.m r0 = r4.f1361d
                androidx.recyclerview.widget.RecyclerView r0 = r0.f1359d
                androidx.recyclerview.widget.RecyclerView$j r0 = r0.getLayoutManager()
                r0.getClass()
                androidx.recyclerview.widget.RecyclerView.p(r5)
                java.util.WeakHashMap r0 = r4.f1362e
                java.lang.Object r0 = r0.get(r5)
                e0.a r0 = (e0.a) r0
                if (r0 == 0) goto L46
                r0.d(r5, r6)
                goto L4d
            L46:
                android.view.View$AccessibilityDelegate r0 = r4.f3748a
                android.view.accessibility.AccessibilityNodeInfo r6 = r6.f5279a
                r0.onInitializeAccessibilityNodeInfo(r5, r6)
            L4d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.m.a.d(android.view.View, f0.b):void");
        }

        @Override // e0.a
        public final void e(View view, AccessibilityEvent accessibilityEvent) {
            e0.a aVar = (e0.a) this.f1362e.get(view);
            if (aVar != null) {
                aVar.e(view, accessibilityEvent);
            } else {
                super.e(view, accessibilityEvent);
            }
        }

        @Override // e0.a
        public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            e0.a aVar = (e0.a) this.f1362e.get(viewGroup);
            return aVar != null ? aVar.f(viewGroup, view, accessibilityEvent) : super.f(viewGroup, view, accessibilityEvent);
        }

        @Override // e0.a
        public final boolean g(View view, int i10, Bundle bundle) {
            boolean z10;
            RecyclerView recyclerView = this.f1361d.f1359d;
            if (recyclerView.f1205y && !recyclerView.F) {
                if (!(recyclerView.f1177c.f1295b.size() > 0)) {
                    z10 = false;
                    if (!z10 || this.f1361d.f1359d.getLayoutManager() == null) {
                        return super.g(view, i10, bundle);
                    }
                    e0.a aVar = (e0.a) this.f1362e.get(view);
                    if (aVar != null) {
                        if (aVar.g(view, i10, bundle)) {
                            return true;
                        }
                    } else if (super.g(view, i10, bundle)) {
                        return true;
                    }
                    RecyclerView.p pVar = this.f1361d.f1359d.getLayoutManager().f1214b.f1173a;
                    return false;
                }
            }
            z10 = true;
            if (z10) {
            }
            return super.g(view, i10, bundle);
        }

        @Override // e0.a
        public final void h(View view, int i10) {
            e0.a aVar = (e0.a) this.f1362e.get(view);
            if (aVar != null) {
                aVar.h(view, i10);
            } else {
                super.h(view, i10);
            }
        }

        @Override // e0.a
        public final void i(View view, AccessibilityEvent accessibilityEvent) {
            e0.a aVar = (e0.a) this.f1362e.get(view);
            if (aVar != null) {
                aVar.i(view, accessibilityEvent);
            } else {
                super.i(view, accessibilityEvent);
            }
        }
    }

    public m(RecyclerView recyclerView) {
        this.f1359d = recyclerView;
        a aVar = this.f1360e;
        this.f1360e = aVar == null ? new a(this) : aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        if ((r0.f1177c.f1295b.size() > 0) != false) goto L13;
     */
    @Override // e0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(android.view.View r5, android.view.accessibility.AccessibilityEvent r6) {
        /*
            r4 = this;
            super.c(r5, r6)
            boolean r0 = r5 instanceof androidx.recyclerview.widget.RecyclerView
            if (r0 == 0) goto L34
            androidx.recyclerview.widget.RecyclerView r0 = r4.f1359d
            boolean r1 = r0.f1205y
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L22
            boolean r1 = r0.F
            if (r1 != 0) goto L22
            androidx.recyclerview.widget.a r0 = r0.f1177c
            java.util.ArrayList<androidx.recyclerview.widget.a$a> r0 = r0.f1295b
            int r0 = r0.size()
            if (r0 <= 0) goto L1f
            r0 = r3
            goto L20
        L1f:
            r0 = r2
        L20:
            if (r0 == 0) goto L23
        L22:
            r2 = r3
        L23:
            if (r2 != 0) goto L34
            androidx.recyclerview.widget.RecyclerView r5 = (androidx.recyclerview.widget.RecyclerView) r5
            androidx.recyclerview.widget.RecyclerView$j r0 = r5.getLayoutManager()
            if (r0 == 0) goto L34
            androidx.recyclerview.widget.RecyclerView$j r5 = r5.getLayoutManager()
            r5.C(r6)
        L34:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.m.c(android.view.View, android.view.accessibility.AccessibilityEvent):void");
    }

    @Override // e0.a
    public final void d(View view, f0.b bVar) {
        boolean z10;
        this.f3748a.onInitializeAccessibilityNodeInfo(view, bVar.f5279a);
        RecyclerView recyclerView = this.f1359d;
        if (recyclerView.f1205y && !recyclerView.F) {
            if (!(recyclerView.f1177c.f1295b.size() > 0)) {
                z10 = false;
                if (!z10 || this.f1359d.getLayoutManager() == null) {
                }
                RecyclerView.j layoutManager = this.f1359d.getLayoutManager();
                RecyclerView recyclerView2 = layoutManager.f1214b;
                RecyclerView.p pVar = recyclerView2.f1173a;
                RecyclerView.s sVar = recyclerView2.f1186i0;
                if (recyclerView2.canScrollVertically(-1) || layoutManager.f1214b.canScrollHorizontally(-1)) {
                    bVar.f5279a.addAction(8192);
                    bVar.f5279a.setScrollable(true);
                }
                if (layoutManager.f1214b.canScrollVertically(1) || layoutManager.f1214b.canScrollHorizontally(1)) {
                    bVar.f5279a.addAction(4096);
                    bVar.f5279a.setScrollable(true);
                }
                bVar.f5279a.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(layoutManager.y(pVar, sVar), layoutManager.q(pVar, sVar), false, 0));
                return;
            }
        }
        z10 = true;
        if (z10) {
        }
    }

    @Override // e0.a
    public final boolean g(View view, int i10, Bundle bundle) {
        boolean z10;
        int v10;
        int t;
        if (super.g(view, i10, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.f1359d;
        if (recyclerView.f1205y && !recyclerView.F) {
            if (!(recyclerView.f1177c.f1295b.size() > 0)) {
                z10 = false;
                if (!z10 || this.f1359d.getLayoutManager() == null) {
                    return false;
                }
                RecyclerView.j layoutManager = this.f1359d.getLayoutManager();
                RecyclerView recyclerView2 = layoutManager.f1214b;
                RecyclerView.p pVar = recyclerView2.f1173a;
                if (i10 == 4096) {
                    v10 = recyclerView2.canScrollVertically(1) ? (layoutManager.f1218g - layoutManager.v()) - layoutManager.s() : 0;
                    if (layoutManager.f1214b.canScrollHorizontally(1)) {
                        t = (layoutManager.f - layoutManager.t()) - layoutManager.u();
                    }
                    t = 0;
                } else if (i10 != 8192) {
                    t = 0;
                    v10 = 0;
                } else {
                    v10 = recyclerView2.canScrollVertically(-1) ? -((layoutManager.f1218g - layoutManager.v()) - layoutManager.s()) : 0;
                    if (layoutManager.f1214b.canScrollHorizontally(-1)) {
                        t = -((layoutManager.f - layoutManager.t()) - layoutManager.u());
                    }
                    t = 0;
                }
                if (v10 == 0 && t == 0) {
                    return false;
                }
                layoutManager.f1214b.x(t, v10, true);
                return true;
            }
        }
        z10 = true;
        if (z10) {
        }
        return false;
    }
}
