package p2;

/* loaded from: classes.dex */
public final class e extends q1.b {

    /* renamed from: c, reason: collision with root package name */
    public static final e f12863c = new e();

    public e() {
        super(11, 12);
    }

    @Override // q1.b
    public final void a(u1.c cVar) {
        cVar.m("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
    }
}
