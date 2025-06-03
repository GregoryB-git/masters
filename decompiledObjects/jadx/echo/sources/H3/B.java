package H3;

import J3.B;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes.dex */
public class B implements F {

    /* renamed from: a, reason: collision with root package name */
    public final File f2213a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2214b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2215c;

    public B(String str, String str2, File file) {
        this.f2214b = str;
        this.f2215c = str2;
        this.f2213a = file;
    }

    private byte[] a() {
        byte[] bArr = new byte[8192];
        try {
            InputStream i7 = i();
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                    if (i7 == null) {
                        gZIPOutputStream.close();
                        byteArrayOutputStream.close();
                        if (i7 != null) {
                            i7.close();
                        }
                        return null;
                    }
                    while (true) {
                        try {
                            int read = i7.read(bArr);
                            if (read <= 0) {
                                gZIPOutputStream.finish();
                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                gZIPOutputStream.close();
                                byteArrayOutputStream.close();
                                i7.close();
                                return byteArray;
                            }
                            gZIPOutputStream.write(bArr, 0, read);
                        } finally {
                        }
                    }
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // H3.F
    public InputStream i() {
        if (this.f2213a.exists() && this.f2213a.isFile()) {
            try {
                return new FileInputStream(this.f2213a);
            } catch (FileNotFoundException unused) {
            }
        }
        return null;
    }

    @Override // H3.F
    public String j() {
        return this.f2215c;
    }

    @Override // H3.F
    public B.d.b k() {
        byte[] a7 = a();
        if (a7 != null) {
            return B.d.b.a().b(a7).c(this.f2214b).a();
        }
        return null;
    }
}
