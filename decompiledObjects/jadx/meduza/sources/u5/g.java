package u5;

import java.io.File;

/* loaded from: classes.dex */
public class g implements Comparable<g> {

    /* renamed from: a, reason: collision with root package name */
    public final String f15009a;

    /* renamed from: b, reason: collision with root package name */
    public final long f15010b;

    /* renamed from: c, reason: collision with root package name */
    public final long f15011c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f15012d;

    /* renamed from: e, reason: collision with root package name */
    public final File f15013e;
    public final long f;

    public g(String str, long j10, long j11, long j12, File file) {
        this.f15009a = str;
        this.f15010b = j10;
        this.f15011c = j11;
        this.f15012d = file != null;
        this.f15013e = file;
        this.f = j12;
    }

    @Override // java.lang.Comparable
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final int compareTo(g gVar) {
        if (!this.f15009a.equals(gVar.f15009a)) {
            return this.f15009a.compareTo(gVar.f15009a);
        }
        long j10 = this.f15010b - gVar.f15010b;
        if (j10 == 0) {
            return 0;
        }
        return j10 < 0 ? -1 : 1;
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("[");
        l10.append(this.f15010b);
        l10.append(", ");
        l10.append(this.f15011c);
        l10.append("]");
        return l10.toString();
    }
}
