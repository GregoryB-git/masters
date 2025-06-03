package x3;

import android.media.AudioAttributes;
import v5.e0;

/* loaded from: classes.dex */
public final class d implements v3.g {

    /* renamed from: o, reason: collision with root package name */
    public static final d f16947o = new d(0, 0, 1, 1, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f16948a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16949b;

    /* renamed from: c, reason: collision with root package name */
    public final int f16950c;

    /* renamed from: d, reason: collision with root package name */
    public final int f16951d;

    /* renamed from: e, reason: collision with root package name */
    public final int f16952e;
    public c f;

    public static final class a {
        public static void a(AudioAttributes.Builder builder, int i10) {
            builder.setAllowedCapturePolicy(i10);
        }
    }

    public static final class b {
        public static void a(AudioAttributes.Builder builder, int i10) {
            builder.setSpatializationBehavior(i10);
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final AudioAttributes f16953a;

        public c(d dVar) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(dVar.f16948a).setFlags(dVar.f16949b).setUsage(dVar.f16950c);
            int i10 = e0.f15881a;
            if (i10 >= 29) {
                a.a(usage, dVar.f16951d);
            }
            if (i10 >= 32) {
                b.a(usage, dVar.f16952e);
            }
            this.f16953a = usage.build();
        }
    }

    static {
        e0.E(0);
        e0.E(1);
        e0.E(2);
        e0.E(3);
        e0.E(4);
    }

    public d(int i10, int i11, int i12, int i13, int i14) {
        this.f16948a = i10;
        this.f16949b = i11;
        this.f16950c = i12;
        this.f16951d = i13;
        this.f16952e = i14;
    }

    public final c a() {
        if (this.f == null) {
            this.f = new c(this);
        }
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return this.f16948a == dVar.f16948a && this.f16949b == dVar.f16949b && this.f16950c == dVar.f16950c && this.f16951d == dVar.f16951d && this.f16952e == dVar.f16952e;
    }

    public final int hashCode() {
        return ((((((((527 + this.f16948a) * 31) + this.f16949b) * 31) + this.f16950c) * 31) + this.f16951d) * 31) + this.f16952e;
    }
}
