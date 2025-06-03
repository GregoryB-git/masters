package N4;

import com.google.protobuf.AbstractC1154t;

/* loaded from: classes.dex */
public enum l implements AbstractC1154t.a {
    SESSION_VERBOSITY_NONE(0),
    GAUGES_AND_SYSTEM_EVENTS(1);


    /* renamed from: r, reason: collision with root package name */
    public static final AbstractC1154t.b f3680r = new AbstractC1154t.b() { // from class: N4.l.a
    };

    /* renamed from: o, reason: collision with root package name */
    public final int f3682o;

    public static final class b implements AbstractC1154t.c {

        /* renamed from: a, reason: collision with root package name */
        public static final AbstractC1154t.c f3683a = new b();
    }

    l(int i7) {
        this.f3682o = i7;
    }

    public static l c(int i7) {
        if (i7 == 0) {
            return SESSION_VERBOSITY_NONE;
        }
        if (i7 != 1) {
            return null;
        }
        return GAUGES_AND_SYSTEM_EVENTS;
    }

    public static AbstractC1154t.c e() {
        return b.f3683a;
    }

    @Override // com.google.protobuf.AbstractC1154t.a
    public final int g() {
        return this.f3682o;
    }
}
