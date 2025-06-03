package W3;

import Y3.m;
import a4.h;

/* loaded from: classes.dex */
public class e {

    /* renamed from: d, reason: collision with root package name */
    public static final e f6865d = new e(a.User, null, false);

    /* renamed from: e, reason: collision with root package name */
    public static final e f6866e = new e(a.Server, null, false);

    /* renamed from: a, reason: collision with root package name */
    public final a f6867a;

    /* renamed from: b, reason: collision with root package name */
    public final h f6868b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f6869c;

    public enum a {
        User,
        Server
    }

    public e(a aVar, h hVar, boolean z7) {
        this.f6867a = aVar;
        this.f6868b = hVar;
        this.f6869c = z7;
        m.f(!z7 || c());
    }

    public static e a(h hVar) {
        return new e(a.Server, hVar, true);
    }

    public h b() {
        return this.f6868b;
    }

    public boolean c() {
        return this.f6867a == a.Server;
    }

    public boolean d() {
        return this.f6867a == a.User;
    }

    public boolean e() {
        return this.f6869c;
    }

    public String toString() {
        return "OperationSource{source=" + this.f6867a + ", queryParams=" + this.f6868b + ", tagged=" + this.f6869c + '}';
    }
}
