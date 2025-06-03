package p2;

/* loaded from: classes.dex */
public final class n extends q1.b {

    /* renamed from: c, reason: collision with root package name */
    public static final n f12905c = new n();

    public n() {
        super(8, 9);
    }

    @Override // q1.b
    public final void a(u1.c cVar) {
        cVar.m("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
    }
}
