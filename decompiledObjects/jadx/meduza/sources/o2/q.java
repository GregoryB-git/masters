package o2;

import android.os.Build;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;
import o2.l;
import o2.o;
import sb.y;

/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public final UUID f11745a;

    /* renamed from: b, reason: collision with root package name */
    public final x2.s f11746b;

    /* renamed from: c, reason: collision with root package name */
    public final Set<String> f11747c;

    public static abstract class a<B extends a<B, ?>, W extends q> {

        /* renamed from: a, reason: collision with root package name */
        public boolean f11748a;

        /* renamed from: b, reason: collision with root package name */
        public UUID f11749b;

        /* renamed from: c, reason: collision with root package name */
        public x2.s f11750c;

        /* renamed from: d, reason: collision with root package name */
        public final LinkedHashSet f11751d;

        public a(Class<? extends androidx.work.d> cls) {
            UUID randomUUID = UUID.randomUUID();
            ec.i.d(randomUUID, "randomUUID()");
            this.f11749b = randomUUID;
            String uuid = this.f11749b.toString();
            ec.i.d(uuid, "id.toString()");
            this.f11750c = new x2.s(uuid, (o.b) null, cls.getName(), (String) null, (androidx.work.c) null, (androidx.work.c) null, 0L, 0L, 0L, (c) null, 0, 0, 0L, 0L, 0L, 0L, false, 0, 0, 0L, 0, 0, 8388602);
            String[] strArr = {cls.getName()};
            LinkedHashSet linkedHashSet = new LinkedHashSet(y.H0(1));
            for (int i10 = 0; i10 < 1; i10++) {
                linkedHashSet.add(strArr[i10]);
            }
            this.f11751d = linkedHashSet;
        }

        public final W a() {
            l b10 = b();
            c cVar = this.f11750c.f16838j;
            boolean z10 = (Build.VERSION.SDK_INT >= 24 && cVar.a()) || cVar.f11706d || cVar.f11704b || cVar.f11705c;
            x2.s sVar = this.f11750c;
            if (sVar.f16845q) {
                if (!(!z10)) {
                    throw new IllegalArgumentException("Expedited jobs only support network and storage constraints".toString());
                }
                if (!(sVar.f16835g <= 0)) {
                    throw new IllegalArgumentException("Expedited jobs cannot be delayed".toString());
                }
            }
            UUID randomUUID = UUID.randomUUID();
            ec.i.d(randomUUID, "randomUUID()");
            this.f11749b = randomUUID;
            String uuid = randomUUID.toString();
            ec.i.d(uuid, "id.toString()");
            x2.s sVar2 = this.f11750c;
            ec.i.e(sVar2, "other");
            this.f11750c = new x2.s(uuid, sVar2.f16831b, sVar2.f16832c, sVar2.f16833d, new androidx.work.c(sVar2.f16834e), new androidx.work.c(sVar2.f), sVar2.f16835g, sVar2.f16836h, sVar2.f16837i, new c(sVar2.f16838j), sVar2.f16839k, sVar2.f16840l, sVar2.f16841m, sVar2.f16842n, sVar2.f16843o, sVar2.f16844p, sVar2.f16845q, sVar2.f16846r, sVar2.f16847s, sVar2.f16848u, sVar2.f16849v, sVar2.f16850w, 524288);
            c();
            return b10;
        }

        public abstract l b();

        public abstract l.a c();
    }

    public q(UUID uuid, x2.s sVar, LinkedHashSet linkedHashSet) {
        ec.i.e(uuid, "id");
        ec.i.e(sVar, "workSpec");
        ec.i.e(linkedHashSet, "tags");
        this.f11745a = uuid;
        this.f11746b = sVar;
        this.f11747c = linkedHashSet;
    }
}
