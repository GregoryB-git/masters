package p2;

/* loaded from: classes.dex */
public final class l extends q1.b {

    /* renamed from: c, reason: collision with root package name */
    public static final l f12886c = new l();

    public l() {
        super(6, 7);
    }

    @Override // q1.b
    public final void a(u1.c cVar) {
        cVar.m("\n    CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress`\n    BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ");
    }
}
