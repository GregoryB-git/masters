package j8;

import java.io.File;
import m8.f0;

/* loaded from: classes.dex */
public final class b extends u {

    /* renamed from: a, reason: collision with root package name */
    public final f0 f8556a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8557b;

    /* renamed from: c, reason: collision with root package name */
    public final File f8558c;

    public b(m8.b bVar, String str, File file) {
        this.f8556a = bVar;
        if (str == null) {
            throw new NullPointerException("Null sessionId");
        }
        this.f8557b = str;
        if (file == null) {
            throw new NullPointerException("Null reportFile");
        }
        this.f8558c = file;
    }

    @Override // j8.u
    public final f0 a() {
        return this.f8556a;
    }

    @Override // j8.u
    public final File b() {
        return this.f8558c;
    }

    @Override // j8.u
    public final String c() {
        return this.f8557b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.f8556a.equals(uVar.a()) && this.f8557b.equals(uVar.c()) && this.f8558c.equals(uVar.b());
    }

    public final int hashCode() {
        return ((((this.f8556a.hashCode() ^ 1000003) * 1000003) ^ this.f8557b.hashCode()) * 1000003) ^ this.f8558c.hashCode();
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("CrashlyticsReportWithSessionId{report=");
        l10.append(this.f8556a);
        l10.append(", sessionId=");
        l10.append(this.f8557b);
        l10.append(", reportFile=");
        l10.append(this.f8558c);
        l10.append("}");
        return l10.toString();
    }
}
