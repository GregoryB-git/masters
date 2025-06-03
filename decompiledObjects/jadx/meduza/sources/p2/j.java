package p2;

/* loaded from: classes.dex */
public final class j extends q1.b {

    /* renamed from: c, reason: collision with root package name */
    public static final j f12872c = new j();

    public j() {
        super(3, 4);
    }

    @Override // q1.b
    public final void a(u1.c cVar) {
        cVar.m("\n    UPDATE workspec SET schedule_requested_at = 0\n    WHERE state NOT IN (2, 3, 5)\n        AND schedule_requested_at = -1\n        AND interval_duration <> 0\n    ");
    }
}
