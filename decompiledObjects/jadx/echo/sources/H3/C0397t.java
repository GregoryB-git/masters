package H3;

import java.io.File;
import java.io.IOException;

/* renamed from: H3.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0397t {

    /* renamed from: a, reason: collision with root package name */
    public final String f2367a;

    /* renamed from: b, reason: collision with root package name */
    public final M3.g f2368b;

    public C0397t(String str, M3.g gVar) {
        this.f2367a = str;
        this.f2368b = gVar;
    }

    public boolean a() {
        try {
            return b().createNewFile();
        } catch (IOException e7) {
            E3.f.f().e("Error creating marker: " + this.f2367a, e7);
            return false;
        }
    }

    public final File b() {
        return this.f2368b.e(this.f2367a);
    }

    public boolean c() {
        return b().exists();
    }

    public boolean d() {
        return b().delete();
    }
}
