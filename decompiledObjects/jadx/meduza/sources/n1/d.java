package n1;

import defpackage.g;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f11192a = {112, 114, 111, 0};

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f11193b = {112, 114, 109, 0};

    public static byte[] a(b[] bVarArr, byte[] bArr) {
        int i10 = 0;
        int i11 = 0;
        for (b bVar : bVarArr) {
            i11 += (((((bVar.f11188g * 2) + 8) - 1) & (-8)) / 8) + (bVar.f11187e * 2) + b(bArr, bVar.f11183a, bVar.f11184b).getBytes(StandardCharsets.UTF_8).length + 16 + bVar.f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i11);
        if (Arrays.equals(bArr, e.f11196c)) {
            int length = bVarArr.length;
            while (i10 < length) {
                b bVar2 = bVarArr[i10];
                l(byteArrayOutputStream, bVar2, b(bArr, bVar2.f11183a, bVar2.f11184b));
                n(byteArrayOutputStream, bVar2);
                k(byteArrayOutputStream, bVar2);
                m(byteArrayOutputStream, bVar2);
                i10++;
            }
        } else {
            for (b bVar3 : bVarArr) {
                l(byteArrayOutputStream, bVar3, b(bArr, bVar3.f11183a, bVar3.f11184b));
            }
            int length2 = bVarArr.length;
            while (i10 < length2) {
                b bVar4 = bVarArr[i10];
                n(byteArrayOutputStream, bVar4);
                k(byteArrayOutputStream, bVar4);
                m(byteArrayOutputStream, bVar4);
                i10++;
            }
        }
        if (byteArrayOutputStream.size() == i11) {
            return byteArrayOutputStream.toByteArray();
        }
        StringBuilder l10 = defpackage.f.l("The bytes saved do not match expectation. actual=");
        l10.append(byteArrayOutputStream.size());
        l10.append(" expected=");
        l10.append(i11);
        throw new IllegalStateException(l10.toString());
    }

    public static String b(byte[] bArr, String str, String str2) {
        byte[] bArr2 = e.f11198e;
        String str3 = (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, e.f11197d)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(str3)) {
                return str2.replace(":", "!");
            }
            if (":".equals(str3)) {
                str2 = str2.replace("!", ":");
            }
            return str2;
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (!str2.contains("!") && !str2.contains(":")) {
            if (str2.endsWith(".apk")) {
                return str2;
            }
            return g.f(defpackage.f.l(str), (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, e.f11197d)) ? ":" : "!", str2);
        }
        if ("!".equals(str3)) {
            return str2.replace(":", "!");
        }
        if (":".equals(str3)) {
            str2 = str2.replace("!", ":");
        }
        return str2;
    }

    public static int c(int i10, int i11, int i12) {
        if (i10 == 1) {
            throw new IllegalStateException("HOT methods are not stored in the bitmap");
        }
        if (i10 == 2) {
            return i11;
        }
        if (i10 == 4) {
            return i11 + i12;
        }
        throw new IllegalStateException(defpackage.f.h("Unexpected flag: ", i10));
    }

    public static int[] d(ByteArrayInputStream byteArrayInputStream, int i10) {
        int[] iArr = new int[i10];
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += x6.b.m0(byteArrayInputStream);
            iArr[i12] = i11;
        }
        return iArr;
    }

    public static b[] e(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, b[] bVarArr) {
        byte[] bArr3 = e.f;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, e.f11199g)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int m02 = x6.b.m0(fileInputStream);
            byte[] k02 = x6.b.k0(fileInputStream, (int) x6.b.l0(fileInputStream, 4), (int) x6.b.l0(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(k02);
            try {
                b[] g10 = g(byteArrayInputStream, bArr2, m02, bVarArr);
                byteArrayInputStream.close();
                return g10;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(e.f11194a, bArr2)) {
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (!Arrays.equals(bArr, bArr3)) {
            throw new IllegalStateException("Unsupported meta version");
        }
        int l02 = (int) x6.b.l0(fileInputStream, 1);
        byte[] k03 = x6.b.k0(fileInputStream, (int) x6.b.l0(fileInputStream, 4), (int) x6.b.l0(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(k03);
        try {
            b[] f = f(byteArrayInputStream2, l02, bVarArr);
            byteArrayInputStream2.close();
            return f;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static b[] f(ByteArrayInputStream byteArrayInputStream, int i10, b[] bVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new b[0];
        }
        if (i10 != bVarArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i10];
        int[] iArr = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            int m02 = x6.b.m0(byteArrayInputStream);
            iArr[i11] = x6.b.m0(byteArrayInputStream);
            strArr[i11] = new String(x6.b.j0(byteArrayInputStream, m02), StandardCharsets.UTF_8);
        }
        for (int i12 = 0; i12 < i10; i12++) {
            b bVar = bVarArr[i12];
            if (!bVar.f11184b.equals(strArr[i12])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i13 = iArr[i12];
            bVar.f11187e = i13;
            bVar.f11189h = d(byteArrayInputStream, i13);
        }
        return bVarArr;
    }

    public static b[] g(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i10, b[] bVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new b[0];
        }
        if (i10 != bVarArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i11 = 0; i11 < i10; i11++) {
            x6.b.m0(byteArrayInputStream);
            String str = new String(x6.b.j0(byteArrayInputStream, x6.b.m0(byteArrayInputStream)), StandardCharsets.UTF_8);
            long l02 = x6.b.l0(byteArrayInputStream, 4);
            int m02 = x6.b.m0(byteArrayInputStream);
            b bVar = null;
            if (bVarArr.length > 0) {
                int indexOf = str.indexOf("!");
                if (indexOf < 0) {
                    indexOf = str.indexOf(":");
                }
                String substring = indexOf > 0 ? str.substring(indexOf + 1) : str;
                int i12 = 0;
                while (true) {
                    if (i12 >= bVarArr.length) {
                        break;
                    }
                    if (bVarArr[i12].f11184b.equals(substring)) {
                        bVar = bVarArr[i12];
                        break;
                    }
                    i12++;
                }
            }
            if (bVar == null) {
                throw new IllegalStateException(g.d("Missing profile key: ", str));
            }
            bVar.f11186d = l02;
            int[] d10 = d(byteArrayInputStream, m02);
            if (Arrays.equals(bArr, e.f11198e)) {
                bVar.f11187e = m02;
                bVar.f11189h = d10;
            }
        }
        return bVarArr;
    }

    public static b[] h(FileInputStream fileInputStream, byte[] bArr, String str) {
        if (!Arrays.equals(bArr, e.f11195b)) {
            throw new IllegalStateException("Unsupported version");
        }
        int l02 = (int) x6.b.l0(fileInputStream, 1);
        byte[] k02 = x6.b.k0(fileInputStream, (int) x6.b.l0(fileInputStream, 4), (int) x6.b.l0(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(k02);
        try {
            b[] i10 = i(byteArrayInputStream, str, l02);
            byteArrayInputStream.close();
            return i10;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static b[] i(ByteArrayInputStream byteArrayInputStream, String str, int i10) {
        if (byteArrayInputStream.available() == 0) {
            return new b[0];
        }
        b[] bVarArr = new b[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            int m02 = x6.b.m0(byteArrayInputStream);
            int m03 = x6.b.m0(byteArrayInputStream);
            bVarArr[i11] = new b(str, new String(x6.b.j0(byteArrayInputStream, m02), StandardCharsets.UTF_8), x6.b.l0(byteArrayInputStream, 4), m03, (int) x6.b.l0(byteArrayInputStream, 4), (int) x6.b.l0(byteArrayInputStream, 4), new int[m03], new TreeMap());
        }
        for (int i12 = 0; i12 < i10; i12++) {
            b bVar = bVarArr[i12];
            int available = byteArrayInputStream.available() - bVar.f;
            int i13 = 0;
            while (byteArrayInputStream.available() > available) {
                i13 += x6.b.m0(byteArrayInputStream);
                bVar.f11190i.put(Integer.valueOf(i13), 1);
                for (int m04 = x6.b.m0(byteArrayInputStream); m04 > 0; m04--) {
                    x6.b.m0(byteArrayInputStream);
                    int l02 = (int) x6.b.l0(byteArrayInputStream, 1);
                    if (l02 != 6 && l02 != 7) {
                        while (l02 > 0) {
                            x6.b.l0(byteArrayInputStream, 1);
                            for (int l03 = (int) x6.b.l0(byteArrayInputStream, 1); l03 > 0; l03--) {
                                x6.b.m0(byteArrayInputStream);
                            }
                            l02--;
                        }
                    }
                }
            }
            if (byteArrayInputStream.available() != available) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            bVar.f11189h = d(byteArrayInputStream, bVar.f11187e);
            BitSet valueOf = BitSet.valueOf(x6.b.j0(byteArrayInputStream, ((((bVar.f11188g * 2) + 8) - 1) & (-8)) / 8));
            int i14 = 0;
            while (true) {
                int i15 = bVar.f11188g;
                if (i14 < i15) {
                    int i16 = valueOf.get(c(2, i14, i15)) ? 2 : 0;
                    if (valueOf.get(c(4, i14, i15))) {
                        i16 |= 4;
                    }
                    if (i16 != 0) {
                        Integer num = bVar.f11190i.get(Integer.valueOf(i14));
                        if (num == null) {
                            num = 0;
                        }
                        bVar.f11190i.put(Integer.valueOf(i14), Integer.valueOf(num.intValue() | i16));
                    }
                    i14++;
                }
            }
        }
        return bVarArr;
    }

    public static boolean j(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, b[] bVarArr) {
        ArrayList arrayList;
        int length;
        int i10 = 0;
        if (!Arrays.equals(bArr, e.f11194a)) {
            byte[] bArr2 = e.f11195b;
            if (Arrays.equals(bArr, bArr2)) {
                byte[] a10 = a(bVarArr, bArr2);
                x6.b.C0(byteArrayOutputStream, bVarArr.length, 1);
                x6.b.C0(byteArrayOutputStream, a10.length, 4);
                byte[] M = x6.b.M(a10);
                x6.b.C0(byteArrayOutputStream, M.length, 4);
                byteArrayOutputStream.write(M);
                return true;
            }
            if (Arrays.equals(bArr, e.f11197d)) {
                x6.b.C0(byteArrayOutputStream, bVarArr.length, 1);
                for (b bVar : bVarArr) {
                    int size = bVar.f11190i.size() * 4;
                    String b10 = b(e.f11197d, bVar.f11183a, bVar.f11184b);
                    x6.b.D0(byteArrayOutputStream, b10.getBytes(StandardCharsets.UTF_8).length);
                    x6.b.D0(byteArrayOutputStream, bVar.f11189h.length);
                    x6.b.C0(byteArrayOutputStream, size, 4);
                    x6.b.C0(byteArrayOutputStream, bVar.f11185c, 4);
                    byteArrayOutputStream.write(b10.getBytes(StandardCharsets.UTF_8));
                    Iterator<Integer> it = bVar.f11190i.keySet().iterator();
                    while (it.hasNext()) {
                        x6.b.D0(byteArrayOutputStream, it.next().intValue());
                        x6.b.D0(byteArrayOutputStream, 0);
                    }
                    for (int i11 : bVar.f11189h) {
                        x6.b.D0(byteArrayOutputStream, i11);
                    }
                }
                return true;
            }
            byte[] bArr3 = e.f11196c;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] a11 = a(bVarArr, bArr3);
                x6.b.C0(byteArrayOutputStream, bVarArr.length, 1);
                x6.b.C0(byteArrayOutputStream, a11.length, 4);
                byte[] M2 = x6.b.M(a11);
                x6.b.C0(byteArrayOutputStream, M2.length, 4);
                byteArrayOutputStream.write(M2);
                return true;
            }
            if (!Arrays.equals(bArr, e.f11198e)) {
                return false;
            }
            x6.b.D0(byteArrayOutputStream, bVarArr.length);
            for (b bVar2 : bVarArr) {
                String b11 = b(e.f11198e, bVar2.f11183a, bVar2.f11184b);
                x6.b.D0(byteArrayOutputStream, b11.getBytes(StandardCharsets.UTF_8).length);
                x6.b.D0(byteArrayOutputStream, bVar2.f11190i.size());
                x6.b.D0(byteArrayOutputStream, bVar2.f11189h.length);
                x6.b.C0(byteArrayOutputStream, bVar2.f11185c, 4);
                byteArrayOutputStream.write(b11.getBytes(StandardCharsets.UTF_8));
                Iterator<Integer> it2 = bVar2.f11190i.keySet().iterator();
                while (it2.hasNext()) {
                    x6.b.D0(byteArrayOutputStream, it2.next().intValue());
                }
                for (int i12 : bVar2.f11189h) {
                    x6.b.D0(byteArrayOutputStream, i12);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            x6.b.D0(byteArrayOutputStream2, bVarArr.length);
            int i13 = 2;
            int i14 = 2;
            for (b bVar3 : bVarArr) {
                x6.b.C0(byteArrayOutputStream2, bVar3.f11185c, 4);
                x6.b.C0(byteArrayOutputStream2, bVar3.f11186d, 4);
                x6.b.C0(byteArrayOutputStream2, bVar3.f11188g, 4);
                String b12 = b(e.f11194a, bVar3.f11183a, bVar3.f11184b);
                int length2 = b12.getBytes(StandardCharsets.UTF_8).length;
                x6.b.D0(byteArrayOutputStream2, length2);
                i14 = i14 + 4 + 4 + 4 + 2 + (length2 * 1);
                byteArrayOutputStream2.write(b12.getBytes(StandardCharsets.UTF_8));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i14 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i14 + ", does not match actual size " + byteArray.length);
            }
            f fVar = new f(1, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList2.add(fVar);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i15 = 0;
            for (int i16 = 0; i16 < bVarArr.length; i16++) {
                try {
                    b bVar4 = bVarArr[i16];
                    x6.b.D0(byteArrayOutputStream3, i16);
                    x6.b.D0(byteArrayOutputStream3, bVar4.f11187e);
                    i15 = i15 + 2 + 2 + (bVar4.f11187e * 2);
                    k(byteArrayOutputStream3, bVar4);
                } finally {
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i15 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i15 + ", does not match actual size " + byteArray2.length);
            }
            f fVar2 = new f(3, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList2.add(fVar2);
            byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i17 = 0;
            int i18 = 0;
            while (i17 < bVarArr.length) {
                try {
                    b bVar5 = bVarArr[i17];
                    Iterator<Map.Entry<Integer, Integer>> it3 = bVar5.f11190i.entrySet().iterator();
                    int i19 = i10;
                    while (it3.hasNext()) {
                        i19 |= it3.next().getValue().intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    try {
                        m(byteArrayOutputStream4, bVar5);
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        byteArrayOutputStream4.close();
                        byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            n(byteArrayOutputStream4, bVar5);
                            byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            x6.b.D0(byteArrayOutputStream3, i17);
                            int length3 = byteArray3.length + i13 + byteArray4.length;
                            int i20 = i18 + 2 + 4;
                            ArrayList arrayList4 = arrayList3;
                            x6.b.C0(byteArrayOutputStream3, length3, 4);
                            x6.b.D0(byteArrayOutputStream3, i19);
                            byteArrayOutputStream3.write(byteArray3);
                            byteArrayOutputStream3.write(byteArray4);
                            i18 = i20 + length3;
                            i17++;
                            arrayList3 = arrayList4;
                            i10 = 0;
                            i13 = 2;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            }
            ArrayList arrayList5 = arrayList3;
            byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
            if (i18 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i18 + ", does not match actual size " + byteArray5.length);
            }
            f fVar3 = new f(4, byteArray5, true);
            byteArrayOutputStream3.close();
            arrayList2.add(fVar3);
            long j10 = 4;
            long size2 = j10 + j10 + 4 + (arrayList2.size() * 16);
            x6.b.C0(byteArrayOutputStream, arrayList2.size(), 4);
            int i21 = 0;
            while (i21 < arrayList2.size()) {
                f fVar4 = (f) arrayList2.get(i21);
                x6.b.C0(byteArrayOutputStream, defpackage.f.f(fVar4.f11200a), 4);
                x6.b.C0(byteArrayOutputStream, size2, 4);
                if (fVar4.f11202c) {
                    byte[] bArr4 = fVar4.f11201b;
                    long length4 = bArr4.length;
                    byte[] M3 = x6.b.M(bArr4);
                    arrayList = arrayList5;
                    arrayList.add(M3);
                    x6.b.C0(byteArrayOutputStream, M3.length, 4);
                    x6.b.C0(byteArrayOutputStream, length4, 4);
                    length = M3.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(fVar4.f11201b);
                    x6.b.C0(byteArrayOutputStream, fVar4.f11201b.length, 4);
                    x6.b.C0(byteArrayOutputStream, 0L, 4);
                    length = fVar4.f11201b.length;
                }
                size2 += length;
                i21++;
                arrayList5 = arrayList;
            }
            ArrayList arrayList6 = arrayList5;
            for (int i22 = 0; i22 < arrayList6.size(); i22++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(i22));
            }
            return true;
        } finally {
            try {
                byteArrayOutputStream2.close();
                throw th;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
    }

    public static void k(ByteArrayOutputStream byteArrayOutputStream, b bVar) {
        int i10 = 0;
        for (int i11 : bVar.f11189h) {
            Integer valueOf = Integer.valueOf(i11);
            x6.b.D0(byteArrayOutputStream, valueOf.intValue() - i10);
            i10 = valueOf.intValue();
        }
    }

    public static void l(ByteArrayOutputStream byteArrayOutputStream, b bVar, String str) {
        x6.b.D0(byteArrayOutputStream, str.getBytes(StandardCharsets.UTF_8).length);
        x6.b.D0(byteArrayOutputStream, bVar.f11187e);
        x6.b.C0(byteArrayOutputStream, bVar.f, 4);
        x6.b.C0(byteArrayOutputStream, bVar.f11185c, 4);
        x6.b.C0(byteArrayOutputStream, bVar.f11188g, 4);
        byteArrayOutputStream.write(str.getBytes(StandardCharsets.UTF_8));
    }

    public static void m(ByteArrayOutputStream byteArrayOutputStream, b bVar) {
        byte[] bArr = new byte[((((bVar.f11188g * 2) + 8) - 1) & (-8)) / 8];
        for (Map.Entry<Integer, Integer> entry : bVar.f11190i.entrySet()) {
            int intValue = entry.getKey().intValue();
            int intValue2 = entry.getValue().intValue();
            if ((intValue2 & 2) != 0) {
                int c10 = c(2, intValue, bVar.f11188g);
                int i10 = c10 / 8;
                bArr[i10] = (byte) ((1 << (c10 % 8)) | bArr[i10]);
            }
            if ((intValue2 & 4) != 0) {
                int c11 = c(4, intValue, bVar.f11188g);
                int i11 = c11 / 8;
                bArr[i11] = (byte) ((1 << (c11 % 8)) | bArr[i11]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void n(ByteArrayOutputStream byteArrayOutputStream, b bVar) {
        int i10 = 0;
        for (Map.Entry<Integer, Integer> entry : bVar.f11190i.entrySet()) {
            int intValue = entry.getKey().intValue();
            if ((entry.getValue().intValue() & 1) != 0) {
                x6.b.D0(byteArrayOutputStream, intValue - i10);
                x6.b.D0(byteArrayOutputStream, 0);
                i10 = intValue;
            }
        }
    }
}
