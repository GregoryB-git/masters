package p2;

/* loaded from: classes.dex */
public final class m extends q1.b {

    /* renamed from: c, reason: collision with root package name */
    public static final m f12888c = new m();

    public m() {
        super(7, 8);
    }

    @Override // q1.b
    public final void a(u1.c cVar) {
        cVar.m("\n    CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec`(`period_start_time`)\n    ");
    }
}
