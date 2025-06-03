package H3;

import java.io.File;

/* renamed from: H3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0380b extends AbstractC0399v {

    /* renamed from: a, reason: collision with root package name */
    public final J3.B f2248a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2249b;

    /* renamed from: c, reason: collision with root package name */
    public final File f2250c;

    public C0380b(J3.B b7, String str, File file) {
        if (b7 == null) {
            throw new NullPointerException("Null report");
        }
        this.f2248a = b7;
        if (str == null) {
            throw new NullPointerException("Null sessionId");
        }
        this.f2249b = str;
        if (file == null) {
            throw new NullPointerException("Null reportFile");
        }
        this.f2250c = file;
    }

    @Override // H3.AbstractC0399v
    public J3.B b() {
        return this.f2248a;
    }

    @Override // H3.AbstractC0399v
    public File c() {
        return this.f2250c;
    }

    @Override // H3.AbstractC0399v
    public String d() {
        return this.f2249b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0399v)) {
            return false;
        }
        AbstractC0399v abstractC0399v = (AbstractC0399v) obj;
        return this.f2248a.equals(abstractC0399v.b()) && this.f2249b.equals(abstractC0399v.d()) && this.f2250c.equals(abstractC0399v.c());
    }

    public int hashCode() {
        return ((((this.f2248a.hashCode() ^ 1000003) * 1000003) ^ this.f2249b.hashCode()) * 1000003) ^ this.f2250c.hashCode();
    }

    public String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f2248a + ", sessionId=" + this.f2249b + ", reportFile=" + this.f2250c + "}";
    }
}
