package ea;

import java.util.UUID;

/* loaded from: classes.dex */
public final /* synthetic */ class d0 extends ec.h implements dc.a<UUID> {

    /* renamed from: a, reason: collision with root package name */
    public static final d0 f4895a = new d0();

    public d0() {
        super(0, UUID.class, "randomUUID", "randomUUID()Ljava/util/UUID;", 0);
    }

    @Override // dc.a
    public final UUID invoke() {
        return UUID.randomUUID();
    }
}
