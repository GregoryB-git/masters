package s5;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.media.session.MediaSessionCompat;
import io.meduza.meduza.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import u.n;
import u.q;
import u.u;
import v3.e1;
import v3.f1;
import v3.j0;
import v3.m;
import v3.o0;
import v3.p0;
import v3.r1;
import v3.s1;
import v5.e0;
import w5.o;

/* loaded from: classes.dex */
public final class c {
    public static int G;
    public boolean A;
    public int B;
    public int C;
    public int D;
    public boolean E;
    public String F;

    /* renamed from: a, reason: collision with root package name */
    public final Context f14174a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14175b;

    /* renamed from: c, reason: collision with root package name */
    public final int f14176c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0219c f14177d;

    /* renamed from: e, reason: collision with root package name */
    public final Handler f14178e;
    public final u f;

    /* renamed from: g, reason: collision with root package name */
    public final IntentFilter f14179g;

    /* renamed from: h, reason: collision with root package name */
    public final f f14180h;

    /* renamed from: i, reason: collision with root package name */
    public final d f14181i;

    /* renamed from: j, reason: collision with root package name */
    public final HashMap f14182j;

    /* renamed from: k, reason: collision with root package name */
    public final Map<String, n> f14183k;

    /* renamed from: l, reason: collision with root package name */
    public final PendingIntent f14184l;

    /* renamed from: m, reason: collision with root package name */
    public final int f14185m;

    /* renamed from: n, reason: collision with root package name */
    public q f14186n;

    /* renamed from: o, reason: collision with root package name */
    public ArrayList f14187o;

    /* renamed from: p, reason: collision with root package name */
    public f1 f14188p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f14189q;

    /* renamed from: r, reason: collision with root package name */
    public int f14190r;

    /* renamed from: s, reason: collision with root package name */
    public MediaSessionCompat.Token f14191s;
    public boolean t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f14192u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f14193v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f14194w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f14195x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f14196y;

    /* renamed from: z, reason: collision with root package name */
    public int f14197z;

    public final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f14198a;

        public a(int i10) {
            this.f14198a = i10;
        }
    }

    public interface b {
        void a();

        List b();
    }

    /* renamed from: s5.c$c, reason: collision with other inner class name */
    public interface InterfaceC0219c {
        CharSequence a(f1 f1Var);

        Bitmap b(f1 f1Var, a aVar);

        void c();

        PendingIntent d(f1 f1Var);

        CharSequence e(f1 f1Var);
    }

    public class d extends BroadcastReceiver {
        public d() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            c cVar = c.this;
            f1 f1Var = cVar.f14188p;
            if (f1Var != null && cVar.f14189q && intent.getIntExtra("INSTANCE_ID", cVar.f14185m) == c.this.f14185m) {
                String action = intent.getAction();
                if ("com.google.android.exoplayer.play".equals(action)) {
                    if (f1Var.d() == 1) {
                        f1Var.a();
                    } else if (f1Var.d() == 4) {
                        f1Var.w(f1Var.F());
                    }
                    f1Var.b();
                    return;
                }
                if ("com.google.android.exoplayer.pause".equals(action)) {
                    f1Var.pause();
                    return;
                }
                if ("com.google.android.exoplayer.prev".equals(action)) {
                    f1Var.t();
                    return;
                }
                if ("com.google.android.exoplayer.rewind".equals(action)) {
                    f1Var.O();
                    return;
                }
                if ("com.google.android.exoplayer.ffwd".equals(action)) {
                    f1Var.N();
                    return;
                }
                if ("com.google.android.exoplayer.next".equals(action)) {
                    f1Var.M();
                    return;
                }
                if ("com.google.android.exoplayer.stop".equals(action)) {
                    f1Var.o(true);
                } else if ("com.google.android.exoplayer.dismiss".equals(action)) {
                    c.this.d(true);
                } else if (action != null) {
                    c.this.getClass();
                }
            }
        }
    }

    public interface e {
        void a();

        void b();
    }

    public class f implements f1.c {
        public f() {
        }

        @Override // v3.f1.c
        public final /* synthetic */ void D(boolean z10) {
        }

        @Override // v3.f1.c
        public final /* synthetic */ void F(f1.a aVar) {
        }

        @Override // v3.f1.c
        public final /* synthetic */ void G(int i10, f1.d dVar, f1.d dVar2) {
        }

        @Override // v3.f1.c
        public final /* synthetic */ void I(boolean z10) {
        }

        @Override // v3.f1.c
        public final /* synthetic */ void K(int i10, boolean z10) {
        }

        @Override // v3.f1.c
        public final /* synthetic */ void L(float f) {
        }

        @Override // v3.f1.c
        public final /* synthetic */ void N(int i10) {
        }

        @Override // v3.f1.c
        public final /* synthetic */ void R(p0 p0Var) {
        }

        @Override // v3.f1.c
        public final /* synthetic */ void T(boolean z10) {
        }

        @Override // v3.f1.c
        public final /* synthetic */ void W(int i10, boolean z10) {
        }

        @Override // v3.f1.c
        public final /* synthetic */ void X(v3.n nVar) {
        }

        @Override // v3.f1.c
        public final /* synthetic */ void Y(r1 r1Var, int i10) {
        }

        @Override // v3.f1.c
        public final /* synthetic */ void Z(s1 s1Var) {
        }

        @Override // v3.f1.c
        public final /* synthetic */ void a0(v3.n nVar) {
        }

        @Override // v3.f1.c
        public final /* synthetic */ void b(o oVar) {
        }

        @Override // v3.f1.c
        public final /* synthetic */ void b0(int i10, boolean z10) {
        }

        @Override // v3.f1.c
        public final /* synthetic */ void c0(e1 e1Var) {
        }

        @Override // v3.f1.c
        public final /* synthetic */ void d(int i10) {
        }

        @Override // v3.f1.c
        public final /* synthetic */ void d0(x3.d dVar) {
        }

        @Override // v3.f1.c
        public final void e0(f1 f1Var, f1.b bVar) {
            if (bVar.a(4, 5, 7, 0, 12, 11, 8, 9, 14)) {
                c cVar = c.this;
                if (cVar.f14178e.hasMessages(0)) {
                    return;
                }
                cVar.f14178e.sendEmptyMessage(0);
            }
        }

        @Override // v3.f1.c
        public final /* synthetic */ void f() {
        }

        @Override // v3.f1.c
        public final /* synthetic */ void j(h5.c cVar) {
        }

        @Override // v3.f1.c
        public final /* synthetic */ void k0(o0 o0Var, int i10) {
        }

        @Override // v3.f1.c
        public final /* synthetic */ void l0(m mVar) {
        }

        @Override // v3.f1.c
        public final /* synthetic */ void m() {
        }

        @Override // v3.f1.c
        public final /* synthetic */ void m0(int i10, int i11) {
        }

        @Override // v3.f1.c
        public final /* synthetic */ void o(boolean z10) {
        }

        @Override // v3.f1.c
        public final /* synthetic */ void p0(boolean z10) {
        }

        @Override // v3.f1.c
        public final /* synthetic */ void q(int i10) {
        }

        @Override // v3.f1.c
        public final /* synthetic */ void r(List list) {
        }

        @Override // v3.f1.c
        public final /* synthetic */ void w(p4.a aVar) {
        }

        @Override // v3.f1.c
        public final /* synthetic */ void x(int i10) {
        }
    }

    public c(Context context, String str, int i10, InterfaceC0219c interfaceC0219c, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        Context applicationContext = context.getApplicationContext();
        this.f14174a = applicationContext;
        this.f14175b = str;
        this.f14176c = i10;
        this.f14177d = interfaceC0219c;
        this.B = i11;
        this.F = null;
        int i19 = G;
        G = i19 + 1;
        this.f14185m = i19;
        Looper mainLooper = Looper.getMainLooper();
        s5.b bVar = new s5.b(this, 0);
        int i20 = e0.f15881a;
        this.f14178e = new Handler(mainLooper, bVar);
        this.f = new u(applicationContext);
        this.f14180h = new f();
        this.f14181i = new d();
        this.f14179g = new IntentFilter();
        this.t = true;
        this.f14192u = true;
        this.f14195x = true;
        this.f14193v = true;
        this.f14194w = true;
        this.A = true;
        this.E = true;
        this.D = -1;
        this.f14197z = 1;
        this.C = 1;
        HashMap hashMap = new HashMap();
        hashMap.put("com.google.android.exoplayer.play", new n(i12, applicationContext.getString(R.string.exo_controls_play_description), a(applicationContext, "com.google.android.exoplayer.play", i19)));
        hashMap.put("com.google.android.exoplayer.pause", new n(i13, applicationContext.getString(R.string.exo_controls_pause_description), a(applicationContext, "com.google.android.exoplayer.pause", i19)));
        hashMap.put("com.google.android.exoplayer.stop", new n(i14, applicationContext.getString(R.string.exo_controls_stop_description), a(applicationContext, "com.google.android.exoplayer.stop", i19)));
        hashMap.put("com.google.android.exoplayer.rewind", new n(i15, applicationContext.getString(R.string.exo_controls_rewind_description), a(applicationContext, "com.google.android.exoplayer.rewind", i19)));
        hashMap.put("com.google.android.exoplayer.ffwd", new n(i16, applicationContext.getString(R.string.exo_controls_fastforward_description), a(applicationContext, "com.google.android.exoplayer.ffwd", i19)));
        hashMap.put("com.google.android.exoplayer.prev", new n(i17, applicationContext.getString(R.string.exo_controls_previous_description), a(applicationContext, "com.google.android.exoplayer.prev", i19)));
        hashMap.put("com.google.android.exoplayer.next", new n(i18, applicationContext.getString(R.string.exo_controls_next_description), a(applicationContext, "com.google.android.exoplayer.next", i19)));
        this.f14182j = hashMap;
        Iterator it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            this.f14179g.addAction((String) it.next());
        }
        Map<String, n> emptyMap = Collections.emptyMap();
        this.f14183k = emptyMap;
        Iterator<String> it2 = emptyMap.keySet().iterator();
        while (it2.hasNext()) {
            this.f14179g.addAction(it2.next());
        }
        this.f14184l = a(applicationContext, "com.google.android.exoplayer.dismiss", this.f14185m);
        this.f14179g.addAction("com.google.android.exoplayer.dismiss");
    }

    public static PendingIntent a(Context context, String str, int i10) {
        Intent intent = new Intent(str).setPackage(context.getPackageName());
        intent.putExtra("INSTANCE_ID", i10);
        return PendingIntent.getBroadcast(context, i10, intent, e0.f15881a >= 23 ? 201326592 : 134217728);
    }

    public final void b(j0 j0Var) {
        boolean z10 = true;
        x6.b.H(Looper.myLooper() == Looper.getMainLooper());
        if (j0Var != null && j0Var.K() != Looper.getMainLooper()) {
            z10 = false;
        }
        x6.b.q(z10);
        f1 f1Var = this.f14188p;
        if (f1Var == j0Var) {
            return;
        }
        if (f1Var != null) {
            f1Var.h(this.f14180h);
            if (j0Var == null) {
                d(false);
            }
        }
        this.f14188p = j0Var;
        if (j0Var != null) {
            j0Var.s(this.f14180h);
            if (this.f14178e.hasMessages(0)) {
                return;
            }
            this.f14178e.sendEmptyMessage(0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(v3.f1 r17, android.graphics.Bitmap r18) {
        /*
            Method dump skipped, instructions count: 543
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s5.c.c(v3.f1, android.graphics.Bitmap):void");
    }

    public final void d(boolean z10) {
        if (this.f14189q) {
            this.f14189q = false;
            this.f14178e.removeMessages(0);
            u uVar = this.f;
            uVar.f14855b.cancel(null, this.f14176c);
            this.f14174a.unregisterReceiver(this.f14181i);
        }
    }
}
