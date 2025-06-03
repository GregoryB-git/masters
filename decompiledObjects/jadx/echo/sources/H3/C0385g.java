package H3;

import J3.B;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;

/* renamed from: H3.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0385g implements F {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f2260a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2261b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2262c;

    public C0385g(String str, String str2, byte[] bArr) {
        this.f2261b = str;
        this.f2262c = str2;
        this.f2260a = bArr;
    }

    public final byte[] a() {
        if (b()) {
            return null;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                try {
                    gZIPOutputStream.write(this.f2260a);
                    gZIPOutputStream.finish();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    gZIPOutputStream.close();
                    byteArrayOutputStream.close();
                    return byteArray;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    public final boolean b() {
        byte[] bArr = this.f2260a;
        return bArr == null || bArr.length == 0;
    }

    @Override // H3.F
    public InputStream i() {
        if (b()) {
            return null;
        }
        return new ByteArrayInputStream(this.f2260a);
    }

    @Override // H3.F
    public String j() {
        return this.f2262c;
    }

    @Override // H3.F
    public B.d.b k() {
        byte[] a7 = a();
        if (a7 == null) {
            return null;
        }
        return B.d.b.a().b(a7).c(this.f2261b).a();
    }
}
