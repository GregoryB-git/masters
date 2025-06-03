package a9;

import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements y8.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f237a;

    @Override // y8.a
    public final void a(Object obj, y8.e eVar) {
        switch (this.f237a) {
            case 0:
                StringBuilder l10 = defpackage.f.l("Couldn't find encoder for type ");
                l10.append(obj.getClass().getCanonicalName());
                throw new y8.b(l10.toString());
            default:
                Map.Entry entry = (Map.Entry) obj;
                y8.e eVar2 = eVar;
                eVar2.e(b9.e.f2149g, entry.getKey());
                eVar2.e(b9.e.f2150h, entry.getValue());
                return;
        }
    }
}
