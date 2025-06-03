package p2;

/* loaded from: classes.dex */
public final class i extends q1.b {

    /* renamed from: c, reason: collision with root package name */
    public static final i f12869c = new i();

    public i() {
        super(1, 2);
    }

    @Override // q1.b
    public final void a(u1.c cVar) {
        cVar.m("\n    CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id`\n    INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ");
        cVar.m("\n    INSERT INTO SystemIdInfo(work_spec_id, system_id)\n    SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo\n    ");
        cVar.m("DROP TABLE IF EXISTS alarmInfo");
        cVar.m("\n                INSERT OR IGNORE INTO worktag(tag, work_spec_id)\n                SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec\n                ");
    }
}
