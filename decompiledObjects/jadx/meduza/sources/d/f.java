package d;

/* loaded from: classes.dex */
public final class f extends c<Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f3311a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e.a f3312b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f3313c;

    public f(g gVar, String str, e.a aVar) {
        this.f3313c = gVar;
        this.f3311a = str;
        this.f3312b = aVar;
    }

    public final void a(Object obj) {
        Integer num = (Integer) this.f3313c.f3315b.get(this.f3311a);
        if (num != null) {
            this.f3313c.f3317d.add(this.f3311a);
            try {
                this.f3313c.b(num.intValue(), this.f3312b, obj);
                return;
            } catch (Exception e10) {
                this.f3313c.f3317d.remove(this.f3311a);
                throw e10;
            }
        }
        StringBuilder l10 = defpackage.f.l("Attempting to launch an unregistered ActivityResultLauncher with contract ");
        l10.append(this.f3312b);
        l10.append(" and input ");
        l10.append(obj);
        l10.append(". You must ensure the ActivityResultLauncher is registered before calling launch().");
        throw new IllegalStateException(l10.toString());
    }

    public final void b() {
        this.f3313c.f(this.f3311a);
    }
}
