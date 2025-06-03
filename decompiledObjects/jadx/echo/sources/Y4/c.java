package Y4;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public enum c {
    Cp437(new int[]{0, 2}, new String[0]),
    ISO8859_1(new int[]{1, 3}, "ISO-8859-1"),
    ISO8859_2(4, "ISO-8859-2"),
    ISO8859_3(5, "ISO-8859-3"),
    ISO8859_4(6, "ISO-8859-4"),
    ISO8859_5(7, "ISO-8859-5"),
    ISO8859_6(8, "ISO-8859-6"),
    ISO8859_7(9, "ISO-8859-7"),
    ISO8859_8(10, "ISO-8859-8"),
    ISO8859_9(11, "ISO-8859-9"),
    ISO8859_10(12, "ISO-8859-10"),
    ISO8859_11(13, "ISO-8859-11"),
    ISO8859_13(15, "ISO-8859-13"),
    ISO8859_14(16, "ISO-8859-14"),
    ISO8859_15(17, "ISO-8859-15"),
    ISO8859_16(18, "ISO-8859-16"),
    SJIS(20, "Shift_JIS"),
    Cp1250(21, "windows-1250"),
    Cp1251(22, "windows-1251"),
    Cp1252(23, "windows-1252"),
    Cp1256(24, "windows-1256"),
    UnicodeBigUnmarked(25, "UTF-16BE", "UnicodeBig"),
    UTF8(26, "UTF-8"),
    ASCII(new int[]{27, 170}, "US-ASCII"),
    Big5(28),
    GB18030(29, "GB2312", "EUC_CN", "GBK"),
    EUC_KR(30, "EUC-KR");


    /* renamed from: R, reason: collision with root package name */
    public static final Map f7593R = new HashMap();

    /* renamed from: S, reason: collision with root package name */
    public static final Map f7594S = new HashMap();

    /* renamed from: o, reason: collision with root package name */
    public final int[] f7606o;

    /* renamed from: p, reason: collision with root package name */
    public final String[] f7607p;

    static {
        for (c cVar : values()) {
            for (int i7 : cVar.f7606o) {
                f7593R.put(Integer.valueOf(i7), cVar);
            }
            f7594S.put(cVar.name(), cVar);
            for (String str : cVar.f7607p) {
                f7594S.put(str, cVar);
            }
        }
    }

    c(int i7) {
        this(new int[]{i7}, new String[0]);
    }

    public static c c(String str) {
        return (c) f7594S.get(str);
    }

    public int e() {
        return this.f7606o[0];
    }

    c(int i7, String... strArr) {
        this.f7606o = new int[]{i7};
        this.f7607p = strArr;
    }

    c(int[] iArr, String... strArr) {
        this.f7606o = iArr;
        this.f7607p = strArr;
    }
}
