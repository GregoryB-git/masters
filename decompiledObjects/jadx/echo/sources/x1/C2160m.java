package x1;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: x1.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2160m extends C2162o {

    /* renamed from: r, reason: collision with root package name */
    public static final a f21105r = new a(null);
    public static final long serialVersionUID = 1;

    /* renamed from: p, reason: collision with root package name */
    public final int f21106p;

    /* renamed from: q, reason: collision with root package name */
    public final String f21107q;

    /* renamed from: x1.m$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    public C2160m(String str, int i7, String str2) {
        super(str);
        this.f21106p = i7;
        this.f21107q = str2;
    }

    @Override // x1.C2162o, java.lang.Throwable
    public String toString() {
        String str = "{FacebookDialogException: errorCode: " + this.f21106p + ", message: " + getMessage() + ", url: " + this.f21107q + "}";
        Intrinsics.checkNotNullExpressionValue(str, "StringBuilder()\n        .append(\"{FacebookDialogException: \")\n        .append(\"errorCode: \")\n        .append(errorCode)\n        .append(\", message: \")\n        .append(message)\n        .append(\", url: \")\n        .append(failingUrl)\n        .append(\"}\")\n        .toString()");
        return str;
    }
}
