package b4;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import v3.e1;
import v3.f1;
import v3.h0;
import v3.m;
import v3.n;
import v3.o0;
import v3.p0;
import v3.r1;
import v3.s1;
import v5.e0;
import w5.o;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: l, reason: collision with root package name */
    public static final MediaMetadataCompat f1823l;

    /* renamed from: a, reason: collision with root package name */
    public final MediaSessionCompat f1824a;

    /* renamed from: b, reason: collision with root package name */
    public final Looper f1825b;

    /* renamed from: c, reason: collision with root package name */
    public final b f1826c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList<InterfaceC0030a> f1827d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList<InterfaceC0030a> f1828e;
    public c[] f;

    /* renamed from: g, reason: collision with root package name */
    public Map<String, c> f1829g;

    /* renamed from: h, reason: collision with root package name */
    public d f1830h;

    /* renamed from: i, reason: collision with root package name */
    public f1 f1831i;

    /* renamed from: j, reason: collision with root package name */
    public long f1832j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1833k;

    /* renamed from: b4.a$a, reason: collision with other inner class name */
    public interface InterfaceC0030a {
        boolean a();
    }

    public class b extends MediaSessionCompat.a implements f1.c {
        public int f;

        /* renamed from: o, reason: collision with root package name */
        public int f1834o;

        public b() {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.a
        public final void A0(int i10) {
            if (a.a(a.this, 2097152L)) {
                boolean z10 = true;
                if (i10 != 1 && i10 != 2) {
                    z10 = false;
                }
                a.this.f1831i.n(z10);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.a
        public final void B0() {
            a.this.getClass();
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.a
        public final void C0() {
            a.this.getClass();
        }

        @Override // v3.f1.c
        public final /* synthetic */ void D(boolean z10) {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.a
        public final void D0(long j10) {
            a.this.getClass();
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.a
        public final void E(MediaDescriptionCompat mediaDescriptionCompat) {
            a.this.getClass();
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.a
        public final void E0() {
            if (a.a(a.this, 1L)) {
                a.this.f1831i.stop();
                a aVar = a.this;
                if (aVar.f1833k) {
                    aVar.f1831i.l();
                }
            }
        }

        @Override // v3.f1.c
        public final /* synthetic */ void F(f1.a aVar) {
        }

        @Override // v3.f1.c
        public final /* synthetic */ void G(int i10, f1.d dVar, f1.d dVar2) {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.a
        public final void H(MediaDescriptionCompat mediaDescriptionCompat, int i10) {
            a.this.getClass();
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

        @Override // android.support.v4.media.session.MediaSessionCompat.a
        public final void M(String str, Bundle bundle, ResultReceiver resultReceiver) {
            if (a.this.f1831i != null) {
                for (int i10 = 0; i10 < a.this.f1827d.size(); i10++) {
                    InterfaceC0030a interfaceC0030a = a.this.f1827d.get(i10);
                    f1 f1Var = a.this.f1831i;
                    if (interfaceC0030a.a()) {
                        return;
                    }
                }
                for (int i11 = 0; i11 < a.this.f1828e.size(); i11++) {
                    InterfaceC0030a interfaceC0030a2 = a.this.f1828e.get(i11);
                    f1 f1Var2 = a.this.f1831i;
                    if (interfaceC0030a2.a()) {
                        return;
                    }
                }
            }
        }

        @Override // v3.f1.c
        public final /* synthetic */ void N(int i10) {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.a
        public final void O(String str, Bundle bundle) {
            a aVar = a.this;
            if (aVar.f1831i == null || !aVar.f1829g.containsKey(str)) {
                return;
            }
            c cVar = a.this.f1829g.get(str);
            f1 f1Var = a.this.f1831i;
            cVar.a();
            a.this.c();
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.a
        public final void P() {
            if (a.a(a.this, 64L)) {
                a.this.f1831i.N();
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.a
        public final boolean Q(Intent intent) {
            a.this.getClass();
            return super.Q(intent);
        }

        @Override // v3.f1.c
        public final /* synthetic */ void R(p0 p0Var) {
        }

        @Override // v3.f1.c
        public final /* synthetic */ void T(boolean z10) {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.a
        public final void U() {
            if (a.a(a.this, 2L)) {
                a.this.f1831i.pause();
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.a
        public final void V() {
            if (a.a(a.this, 4L)) {
                if (a.this.f1831i.d() == 1) {
                    a.this.getClass();
                    a.this.f1831i.a();
                } else if (a.this.f1831i.d() == 4) {
                    f1 f1Var = a.this.f1831i;
                    f1Var.j(f1Var.F(), -9223372036854775807L);
                }
                f1 f1Var2 = a.this.f1831i;
                f1Var2.getClass();
                f1Var2.b();
            }
        }

        @Override // v3.f1.c
        public final /* synthetic */ void W(int i10, boolean z10) {
        }

        @Override // v3.f1.c
        public final /* synthetic */ void X(n nVar) {
        }

        @Override // v3.f1.c
        public final /* synthetic */ void Y(r1 r1Var, int i10) {
        }

        @Override // v3.f1.c
        public final /* synthetic */ void Z(s1 s1Var) {
        }

        @Override // v3.f1.c
        public final /* synthetic */ void a0(n nVar) {
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
            boolean z10;
            boolean z11;
            boolean z12 = true;
            if (bVar.f15343a.f15905a.get(11)) {
                if (this.f != f1Var.F()) {
                    a.this.getClass();
                    z10 = true;
                } else {
                    z10 = false;
                }
                z11 = true;
            } else {
                z10 = false;
                z11 = false;
            }
            if (bVar.f15343a.f15905a.get(0)) {
                int o10 = f1Var.J().o();
                int F = f1Var.F();
                a.this.getClass();
                if (this.f1834o != o10 || this.f != F) {
                    z11 = true;
                }
                this.f1834o = o10;
                z10 = true;
            }
            this.f = f1Var.F();
            if (bVar.a(4, 5, 7, 8, 12)) {
                z11 = true;
            }
            if (bVar.a(9)) {
                a.this.getClass();
            } else {
                z12 = z11;
            }
            if (z12) {
                a.this.c();
            }
            if (z10) {
                a.this.b();
            }
        }

        @Override // v3.f1.c
        public final /* synthetic */ void f() {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.a
        public final void f0(String str, Bundle bundle) {
            a.this.getClass();
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.a
        public final void h0(String str, Bundle bundle) {
            a.this.getClass();
        }

        @Override // v3.f1.c
        public final /* synthetic */ void j(h5.c cVar) {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.a
        public final void j0(Uri uri, Bundle bundle) {
            a.this.getClass();
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

        @Override // android.support.v4.media.session.MediaSessionCompat.a
        public final void n0() {
            a.this.getClass();
        }

        @Override // v3.f1.c
        public final /* synthetic */ void o(boolean z10) {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.a
        public final void o0(String str, Bundle bundle) {
            a.this.getClass();
        }

        @Override // v3.f1.c
        public final /* synthetic */ void p0(boolean z10) {
        }

        @Override // v3.f1.c
        public final /* synthetic */ void q(int i10) {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.a
        public final void q0(String str, Bundle bundle) {
            a.this.getClass();
        }

        @Override // v3.f1.c
        public final /* synthetic */ void r(List list) {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.a
        public final void r0(Uri uri, Bundle bundle) {
            a.this.getClass();
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.a
        public final void s0(MediaDescriptionCompat mediaDescriptionCompat) {
            a.this.getClass();
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.a
        public final void t0() {
            if (a.a(a.this, 8L)) {
                a.this.f1831i.O();
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.a
        public final void u0(long j10) {
            if (a.a(a.this, 256L)) {
                f1 f1Var = a.this.f1831i;
                f1Var.j(f1Var.F(), j10);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.a
        public final void v0(boolean z10) {
            a.this.getClass();
        }

        @Override // v3.f1.c
        public final /* synthetic */ void w(p4.a aVar) {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.a
        public final void w0(float f) {
            if (!a.a(a.this, 4194304L) || f <= 0.0f) {
                return;
            }
            f1 f1Var = a.this.f1831i;
            f1Var.c(new e1(f, f1Var.f().f15328b));
        }

        @Override // v3.f1.c
        public final /* synthetic */ void x(int i10) {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.a
        public final void x0(RatingCompat ratingCompat) {
            a.this.getClass();
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.a
        public final void y0(RatingCompat ratingCompat, Bundle bundle) {
            a.this.getClass();
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.a
        public final void z0(int i10) {
            if (a.a(a.this, 262144L)) {
                int i11 = 2;
                if (i10 == 1) {
                    i11 = 1;
                } else if (i10 != 2 && i10 != 3) {
                    i11 = 0;
                }
                a.this.f1831i.u(i11);
            }
        }
    }

    public interface c {
        void a();

        PlaybackStateCompat.CustomAction b();
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final MediaControllerCompat f1836a;

        /* renamed from: b, reason: collision with root package name */
        public final String f1837b = "";

        public d(MediaControllerCompat mediaControllerCompat) {
            this.f1836a = mediaControllerCompat;
        }
    }

    static {
        h0.a("goog.exo.mediasession");
        f1823l = new MediaMetadataCompat(new Bundle());
    }

    public a(MediaSessionCompat mediaSessionCompat) {
        this.f1824a = mediaSessionCompat;
        int i10 = e0.f15881a;
        Looper myLooper = Looper.myLooper();
        myLooper = myLooper == null ? Looper.getMainLooper() : myLooper;
        this.f1825b = myLooper;
        b bVar = new b();
        this.f1826c = bVar;
        this.f1827d = new ArrayList<>();
        this.f1828e = new ArrayList<>();
        this.f = new c[0];
        this.f1829g = Collections.emptyMap();
        this.f1830h = new d(mediaSessionCompat.f484b);
        this.f1832j = 2360143L;
        mediaSessionCompat.f483a.f501a.setFlags(3);
        mediaSessionCompat.f(bVar, new Handler(myLooper));
        this.f1833k = true;
    }

    public static boolean a(a aVar, long j10) {
        return (aVar.f1831i == null || (j10 & aVar.f1832j) == 0) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 566
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b4.a.b():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x008d, code lost:
    
        if (r6 != false) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c() {
        /*
            Method dump skipped, instructions count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b4.a.c():void");
    }
}
