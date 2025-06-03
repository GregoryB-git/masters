package p2;

/* loaded from: classes.dex */
public final class f extends q1.b {

    /* renamed from: c, reason: collision with root package name */
    public static final f f12866c = new f();

    public f() {
        super(12, 13);
    }

    @Override // q1.b
    public final void a(u1.c cVar) {
        cVar.m("UPDATE workspec SET required_network_type = 0 WHERE required_network_type IS NULL ");
        cVar.m("UPDATE workspec SET content_uri_triggers = x'' WHERE content_uri_triggers is NULL");
    }
}
