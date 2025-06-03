package p2;

/* loaded from: classes.dex */
public final class k extends q1.b {

    /* renamed from: c, reason: collision with root package name */
    public static final k f12873c = new k();

    public k() {
        super(4, 5);
    }

    @Override // q1.b
    public final void a(u1.c cVar) {
        cVar.m("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
        cVar.m("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
    }
}
