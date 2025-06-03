package a9;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f238a;

    public d(e eVar) {
        this.f238a = eVar;
    }

    public final String a(Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            b(obj, stringWriter);
        } catch (IOException unused) {
        }
        return stringWriter.toString();
    }

    public final void b(Object obj, Writer writer) {
        e eVar = this.f238a;
        f fVar = new f(writer, eVar.f242a, eVar.f243b, eVar.f244c, eVar.f245d);
        fVar.h(obj);
        fVar.j();
        fVar.f248b.flush();
    }
}
