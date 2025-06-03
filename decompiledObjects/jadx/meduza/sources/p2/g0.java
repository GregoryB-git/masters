package p2;

/* loaded from: classes.dex */
public final class g0 extends q1.b {
    public g0() {
        super(17, 18);
    }

    @Override // q1.b
    public final void a(u1.c cVar) {
        cVar.m("ALTER TABLE `WorkSpec` ADD COLUMN `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807");
        cVar.m("ALTER TABLE `WorkSpec` ADD COLUMN `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0");
    }
}
