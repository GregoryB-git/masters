package N4;

import com.google.protobuf.AbstractC1154t;

/* loaded from: classes.dex */
public enum d implements AbstractC1154t.a {
    APPLICATION_PROCESS_STATE_UNKNOWN(0),
    FOREGROUND(1),
    BACKGROUND(2),
    FOREGROUND_BACKGROUND(3);


    /* renamed from: t, reason: collision with root package name */
    public static final AbstractC1154t.b f3647t = new AbstractC1154t.b() { // from class: N4.d.a
    };

    /* renamed from: o, reason: collision with root package name */
    public final int f3649o;

    public static final class b implements AbstractC1154t.c {

        /* renamed from: a, reason: collision with root package name */
        public static final AbstractC1154t.c f3650a = new b();
    }

    d(int i7) {
        this.f3649o = i7;
    }

    public static AbstractC1154t.c c() {
        return b.f3650a;
    }

    @Override // com.google.protobuf.AbstractC1154t.a
    public final int g() {
        return this.f3649o;
    }
}
