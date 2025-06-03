package okhttp3;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class CacheControl {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f12160a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f12161b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12162c;

    /* renamed from: d, reason: collision with root package name */
    public final int f12163d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f12164e;
    public final boolean f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f12165g;

    /* renamed from: h, reason: collision with root package name */
    public final int f12166h;

    /* renamed from: i, reason: collision with root package name */
    public final int f12167i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f12168j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f12169k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f12170l;

    /* renamed from: m, reason: collision with root package name */
    public String f12171m;

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public boolean f12172a;

        /* renamed from: b, reason: collision with root package name */
        public int f12173b = -1;

        /* renamed from: c, reason: collision with root package name */
        public int f12174c = -1;

        /* renamed from: d, reason: collision with root package name */
        public int f12175d = -1;

        /* renamed from: e, reason: collision with root package name */
        public boolean f12176e;
    }

    static {
        Builder builder = new Builder();
        builder.f12172a = true;
        new CacheControl(builder);
        Builder builder2 = new Builder();
        builder2.f12176e = true;
        long seconds = TimeUnit.SECONDS.toSeconds(Integer.MAX_VALUE);
        builder2.f12174c = seconds <= 2147483647L ? (int) seconds : Integer.MAX_VALUE;
        new CacheControl(builder2);
    }

    public CacheControl(Builder builder) {
        this.f12160a = builder.f12172a;
        this.f12161b = false;
        this.f12162c = builder.f12173b;
        this.f12163d = -1;
        this.f12164e = false;
        this.f = false;
        this.f12165g = false;
        this.f12166h = builder.f12174c;
        this.f12167i = builder.f12175d;
        this.f12168j = builder.f12176e;
        this.f12169k = false;
        this.f12170l = false;
    }

    public CacheControl(boolean z10, boolean z11, int i10, int i11, boolean z12, boolean z13, boolean z14, int i12, int i13, boolean z15, boolean z16, boolean z17, String str) {
        this.f12160a = z10;
        this.f12161b = z11;
        this.f12162c = i10;
        this.f12163d = i11;
        this.f12164e = z12;
        this.f = z13;
        this.f12165g = z14;
        this.f12166h = i12;
        this.f12167i = i13;
        this.f12168j = z15;
        this.f12169k = z16;
        this.f12170l = z17;
        this.f12171m = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static okhttp3.CacheControl a(okhttp3.Headers r22) {
        /*
            Method dump skipped, instructions count: 351
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.CacheControl.a(okhttp3.Headers):okhttp3.CacheControl");
    }

    public final String toString() {
        String str = this.f12171m;
        if (str == null) {
            StringBuilder sb2 = new StringBuilder();
            if (this.f12160a) {
                sb2.append("no-cache, ");
            }
            if (this.f12161b) {
                sb2.append("no-store, ");
            }
            if (this.f12162c != -1) {
                sb2.append("max-age=");
                sb2.append(this.f12162c);
                sb2.append(", ");
            }
            if (this.f12163d != -1) {
                sb2.append("s-maxage=");
                sb2.append(this.f12163d);
                sb2.append(", ");
            }
            if (this.f12164e) {
                sb2.append("private, ");
            }
            if (this.f) {
                sb2.append("public, ");
            }
            if (this.f12165g) {
                sb2.append("must-revalidate, ");
            }
            if (this.f12166h != -1) {
                sb2.append("max-stale=");
                sb2.append(this.f12166h);
                sb2.append(", ");
            }
            if (this.f12167i != -1) {
                sb2.append("min-fresh=");
                sb2.append(this.f12167i);
                sb2.append(", ");
            }
            if (this.f12168j) {
                sb2.append("only-if-cached, ");
            }
            if (this.f12169k) {
                sb2.append("no-transform, ");
            }
            if (this.f12170l) {
                sb2.append("immutable, ");
            }
            if (sb2.length() == 0) {
                str = "";
            } else {
                sb2.delete(sb2.length() - 2, sb2.length());
                str = sb2.toString();
            }
            this.f12171m = str;
        }
        return str;
    }
}
