package I3;

import H3.AbstractC0387i;
import I3.e;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Locale;

/* loaded from: classes.dex */
public class f implements I3.a {

    /* renamed from: d, reason: collision with root package name */
    public static final Charset f2538d = Charset.forName("UTF-8");

    /* renamed from: a, reason: collision with root package name */
    public final File f2539a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2540b;

    /* renamed from: c, reason: collision with root package name */
    public e f2541c;

    public class a implements e.d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ byte[] f2542a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int[] f2543b;

        public a(byte[] bArr, int[] iArr) {
            this.f2542a = bArr;
            this.f2543b = iArr;
        }

        @Override // I3.e.d
        public void a(InputStream inputStream, int i7) {
            try {
                inputStream.read(this.f2542a, this.f2543b[0], i7);
                int[] iArr = this.f2543b;
                iArr[0] = iArr[0] + i7;
            } finally {
                inputStream.close();
            }
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final byte[] f2545a;

        /* renamed from: b, reason: collision with root package name */
        public final int f2546b;

        public b(byte[] bArr, int i7) {
            this.f2545a = bArr;
            this.f2546b = i7;
        }
    }

    public f(File file, int i7) {
        this.f2539a = file;
        this.f2540b = i7;
    }

    @Override // I3.a
    public void a() {
        AbstractC0387i.f(this.f2541c, "There was a problem closing the Crashlytics log file.");
        this.f2541c = null;
    }

    @Override // I3.a
    public String b() {
        byte[] c7 = c();
        if (c7 != null) {
            return new String(c7, f2538d);
        }
        return null;
    }

    @Override // I3.a
    public byte[] c() {
        b g7 = g();
        if (g7 == null) {
            return null;
        }
        int i7 = g7.f2546b;
        byte[] bArr = new byte[i7];
        System.arraycopy(g7.f2545a, 0, bArr, 0, i7);
        return bArr;
    }

    @Override // I3.a
    public void d() {
        a();
        this.f2539a.delete();
    }

    @Override // I3.a
    public void e(long j7, String str) {
        h();
        f(j7, str);
    }

    public final void f(long j7, String str) {
        if (this.f2541c == null) {
            return;
        }
        if (str == null) {
            str = "null";
        }
        try {
            int i7 = this.f2540b / 4;
            if (str.length() > i7) {
                str = "..." + str.substring(str.length() - i7);
            }
            this.f2541c.h(String.format(Locale.US, "%d %s%n", Long.valueOf(j7), str.replaceAll("\r", " ").replaceAll("\n", " ")).getBytes(f2538d));
            while (!this.f2541c.q() && this.f2541c.E() > this.f2540b) {
                this.f2541c.x();
            }
        } catch (IOException e7) {
            E3.f.f().e("There was a problem writing to the Crashlytics log.", e7);
        }
    }

    public final b g() {
        if (!this.f2539a.exists()) {
            return null;
        }
        h();
        e eVar = this.f2541c;
        if (eVar == null) {
            return null;
        }
        int[] iArr = {0};
        byte[] bArr = new byte[eVar.E()];
        try {
            this.f2541c.m(new a(bArr, iArr));
        } catch (IOException e7) {
            E3.f.f().e("A problem occurred while reading the Crashlytics log file.", e7);
        }
        return new b(bArr, iArr[0]);
    }

    public final void h() {
        if (this.f2541c == null) {
            try {
                this.f2541c = new e(this.f2539a);
            } catch (IOException e7) {
                E3.f.f().e("Could not open log file: " + this.f2539a, e7);
            }
        }
    }
}
