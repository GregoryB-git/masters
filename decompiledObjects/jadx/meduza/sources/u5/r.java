package u5;

import java.io.File;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class r extends g {

    /* renamed from: o, reason: collision with root package name */
    public static final Pattern f15068o = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);

    /* renamed from: p, reason: collision with root package name */
    public static final Pattern f15069p = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);

    /* renamed from: q, reason: collision with root package name */
    public static final Pattern f15070q = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);

    public r(String str, long j10, long j11, long j12, File file) {
        super(str, j10, j11, j12, file);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d0, code lost:
    
        if (r16.renameTo(r1) == false) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static u5.r g(java.io.File r16, long r17, long r19, u5.j r21) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u5.r.g(java.io.File, long, long, u5.j):u5.r");
    }

    public static File h(File file, int i10, long j10, long j11) {
        return new File(file, i10 + "." + j10 + "." + j11 + ".v3.exo");
    }
}
