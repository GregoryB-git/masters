package l3;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class k implements e {

    /* renamed from: a, reason: collision with root package name */
    public final a f9554a;

    /* renamed from: b, reason: collision with root package name */
    public final i f9555b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f9556c;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final Context f9557a;

        /* renamed from: b, reason: collision with root package name */
        public Map<String, String> f9558b = null;

        public a(Context context) {
            this.f9557a = context;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final l3.d a(java.lang.String r15) {
            /*
                Method dump skipped, instructions count: 242
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: l3.k.a.a(java.lang.String):l3.d");
        }
    }

    public k(Context context, i iVar) {
        a aVar = new a(context);
        this.f9556c = new HashMap();
        this.f9554a = aVar;
        this.f9555b = iVar;
    }

    @Override // l3.e
    public final synchronized m a(String str) {
        if (this.f9556c.containsKey(str)) {
            return (m) this.f9556c.get(str);
        }
        d a10 = this.f9554a.a(str);
        if (a10 == null) {
            return null;
        }
        i iVar = this.f9555b;
        m create = a10.create(new c(iVar.f9548a, iVar.f9549b, iVar.f9550c, str));
        this.f9556c.put(str, create);
        return create;
    }
}
