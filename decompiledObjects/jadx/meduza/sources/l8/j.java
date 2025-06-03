package l8;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Locale;

/* loaded from: classes.dex */
public final class j implements d {

    /* renamed from: d, reason: collision with root package name */
    public static final Charset f9781d = Charset.forName("UTF-8");

    /* renamed from: a, reason: collision with root package name */
    public final File f9782a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9783b = 65536;

    /* renamed from: c, reason: collision with root package name */
    public i f9784c;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final byte[] f9785a;

        /* renamed from: b, reason: collision with root package name */
        public final int f9786b;

        public a(byte[] bArr, int i10) {
            this.f9785a = bArr;
            this.f9786b = i10;
        }
    }

    public j(File file) {
        this.f9782a = file;
    }

    @Override // l8.d
    public final void a() {
        j8.g.b(this.f9784c, "There was a problem closing the Crashlytics log file.");
        this.f9784c = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006e  */
    @Override // l8.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String b() {
        /*
            r10 = this;
            java.io.File r0 = r10.f9782a
            boolean r0 = r0.exists()
            r1 = 0
            r2 = 0
            if (r0 != 0) goto Lb
            goto L12
        Lb:
            r10.d()
            l8.i r0 = r10.f9784c
            if (r0 != 0) goto L14
        L12:
            r4 = r2
            goto L6a
        L14:
            r3 = 1
            int[] r3 = new int[r3]
            r3[r1] = r1
            int r0 = r0.b0()
            byte[] r0 = new byte[r0]
            l8.i r4 = r10.f9784c     // Catch: java.io.IOException -> L5b
            monitor-enter(r4)     // Catch: java.io.IOException -> L5b
            l8.i$a r5 = r4.f9773d     // Catch: java.lang.Throwable -> L58
            int r5 = r5.f9776a     // Catch: java.lang.Throwable -> L58
            r6 = r1
        L27:
            int r7 = r4.f9772c     // Catch: java.lang.Throwable -> L58
            if (r6 >= r7) goto L56
            l8.i$a r5 = r4.C(r5)     // Catch: java.lang.Throwable -> L58
            l8.i$b r7 = new l8.i$b     // Catch: java.lang.Throwable -> L58
            r7.<init>(r5)     // Catch: java.lang.Throwable -> L58
            int r8 = r5.f9777b     // Catch: java.lang.Throwable -> L58
            r9 = r3[r1]     // Catch: java.lang.Throwable -> L51
            r7.read(r0, r9, r8)     // Catch: java.lang.Throwable -> L51
            r9 = r3[r1]     // Catch: java.lang.Throwable -> L51
            int r9 = r9 + r8
            r3[r1] = r9     // Catch: java.lang.Throwable -> L51
            r7.close()     // Catch: java.lang.Throwable -> L58
            int r7 = r5.f9776a     // Catch: java.lang.Throwable -> L58
            int r7 = r7 + 4
            int r5 = r5.f9777b     // Catch: java.lang.Throwable -> L58
            int r7 = r7 + r5
            int r5 = r4.c0(r7)     // Catch: java.lang.Throwable -> L58
            int r6 = r6 + 1
            goto L27
        L51:
            r5 = move-exception
            r7.close()     // Catch: java.lang.Throwable -> L58
            throw r5     // Catch: java.lang.Throwable -> L58
        L56:
            monitor-exit(r4)     // Catch: java.io.IOException -> L5b
            goto L63
        L58:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.io.IOException -> L5b
            throw r5     // Catch: java.io.IOException -> L5b
        L5b:
            r4 = move-exception
            java.lang.String r5 = "FirebaseCrashlytics"
            java.lang.String r6 = "A problem occurred while reading the Crashlytics log file."
            android.util.Log.e(r5, r6, r4)
        L63:
            l8.j$a r4 = new l8.j$a
            r3 = r3[r1]
            r4.<init>(r0, r3)
        L6a:
            if (r4 != 0) goto L6e
            r3 = r2
            goto L77
        L6e:
            int r0 = r4.f9786b
            byte[] r3 = new byte[r0]
            byte[] r4 = r4.f9785a
            java.lang.System.arraycopy(r4, r1, r3, r1, r0)
        L77:
            if (r3 == 0) goto L80
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r0 = l8.j.f9781d
            r2.<init>(r3, r0)
        L80:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: l8.j.b():java.lang.String");
    }

    @Override // l8.d
    public final void c(String str, long j10) {
        boolean z10;
        d();
        if (this.f9784c == null) {
            return;
        }
        if (str == null) {
            str = "null";
        }
        try {
            int i10 = this.f9783b / 4;
            if (str.length() > i10) {
                str = "..." + str.substring(str.length() - i10);
            }
            this.f9784c.f(String.format(Locale.US, "%d %s%n", Long.valueOf(j10), str.replaceAll("\r", " ").replaceAll("\n", " ")).getBytes(f9781d));
            while (true) {
                i iVar = this.f9784c;
                synchronized (iVar) {
                    z10 = iVar.f9772c == 0;
                }
                if (z10 || this.f9784c.b0() <= this.f9783b) {
                    return;
                } else {
                    this.f9784c.I();
                }
            }
        } catch (IOException e10) {
            Log.e("FirebaseCrashlytics", "There was a problem writing to the Crashlytics log.", e10);
        }
    }

    public final void d() {
        if (this.f9784c == null) {
            try {
                this.f9784c = new i(this.f9782a);
            } catch (IOException e10) {
                StringBuilder l10 = defpackage.f.l("Could not open log file: ");
                l10.append(this.f9782a);
                Log.e("FirebaseCrashlytics", l10.toString(), e10);
            }
        }
    }
}
