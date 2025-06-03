package l2;

import f2.p;
import f2.u;
import g2.m;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
import m2.x;
import n2.InterfaceC1707d;
import o2.b;

/* renamed from: l2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1600c implements InterfaceC1602e {

    /* renamed from: f, reason: collision with root package name */
    public static final Logger f17144f = Logger.getLogger(u.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final x f17145a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f17146b;

    /* renamed from: c, reason: collision with root package name */
    public final g2.e f17147c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC1707d f17148d;

    /* renamed from: e, reason: collision with root package name */
    public final o2.b f17149e;

    public C1600c(Executor executor, g2.e eVar, x xVar, InterfaceC1707d interfaceC1707d, o2.b bVar) {
        this.f17146b = executor;
        this.f17147c = eVar;
        this.f17145a = xVar;
        this.f17148d = interfaceC1707d;
        this.f17149e = bVar;
    }

    @Override // l2.InterfaceC1602e
    public void a(final p pVar, final f2.i iVar, final c2.h hVar) {
        this.f17146b.execute(new Runnable() { // from class: l2.a
            @Override // java.lang.Runnable
            public final void run() {
                C1600c.this.e(pVar, hVar, iVar);
            }
        });
    }

    public final /* synthetic */ Object d(p pVar, f2.i iVar) {
        this.f17148d.z(pVar, iVar);
        this.f17145a.a(pVar, 1);
        return null;
    }

    public final /* synthetic */ void e(final p pVar, c2.h hVar, f2.i iVar) {
        try {
            m a7 = this.f17147c.a(pVar.b());
            if (a7 == null) {
                String format = String.format("Transport backend '%s' is not registered", pVar.b());
                f17144f.warning(format);
                hVar.a(new IllegalArgumentException(format));
            } else {
                final f2.i a8 = a7.a(iVar);
                this.f17149e.a(new b.a() { // from class: l2.b
                    @Override // o2.b.a
                    public final Object e() {
                        Object d7;
                        d7 = C1600c.this.d(pVar, a8);
                        return d7;
                    }
                });
                hVar.a(null);
            }
        } catch (Exception e7) {
            f17144f.warning("Error scheduling event " + e7.getMessage());
            hVar.a(e7);
        }
    }
}
