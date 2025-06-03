package g1;

import a3.f;
import android.graphics.Color;
import android.graphics.PointF;
import android.text.TextUtils;
import com.android.installreferrer.api.InstallReferrerClient;
import g0.AbstractC1297a;
import g0.M;
import g0.o;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: g1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1313c {

    /* renamed from: a, reason: collision with root package name */
    public final String f14363a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14364b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f14365c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f14366d;

    /* renamed from: e, reason: collision with root package name */
    public final float f14367e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f14368f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f14369g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f14370h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f14371i;

    /* renamed from: j, reason: collision with root package name */
    public final int f14372j;

    /* renamed from: g1.c$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f14373a;

        /* renamed from: b, reason: collision with root package name */
        public final int f14374b;

        /* renamed from: c, reason: collision with root package name */
        public final int f14375c;

        /* renamed from: d, reason: collision with root package name */
        public final int f14376d;

        /* renamed from: e, reason: collision with root package name */
        public final int f14377e;

        /* renamed from: f, reason: collision with root package name */
        public final int f14378f;

        /* renamed from: g, reason: collision with root package name */
        public final int f14379g;

        /* renamed from: h, reason: collision with root package name */
        public final int f14380h;

        /* renamed from: i, reason: collision with root package name */
        public final int f14381i;

        /* renamed from: j, reason: collision with root package name */
        public final int f14382j;

        /* renamed from: k, reason: collision with root package name */
        public final int f14383k;

        public a(int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            this.f14373a = i7;
            this.f14374b = i8;
            this.f14375c = i9;
            this.f14376d = i10;
            this.f14377e = i11;
            this.f14378f = i12;
            this.f14379g = i13;
            this.f14380h = i14;
            this.f14381i = i15;
            this.f14382j = i16;
            this.f14383k = i17;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        public static a a(String str) {
            char c7;
            String[] split = TextUtils.split(str.substring(7), ",");
            int i7 = -1;
            int i8 = -1;
            int i9 = -1;
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int i15 = -1;
            int i16 = -1;
            for (int i17 = 0; i17 < split.length; i17++) {
                String e7 = W2.c.e(split[i17].trim());
                e7.hashCode();
                switch (e7.hashCode()) {
                    case -1178781136:
                        if (e7.equals("italic")) {
                            c7 = 0;
                            break;
                        }
                        c7 = 65535;
                        break;
                    case -1026963764:
                        if (e7.equals("underline")) {
                            c7 = 1;
                            break;
                        }
                        c7 = 65535;
                        break;
                    case -192095652:
                        if (e7.equals("strikeout")) {
                            c7 = 2;
                            break;
                        }
                        c7 = 65535;
                        break;
                    case -70925746:
                        if (e7.equals("primarycolour")) {
                            c7 = 3;
                            break;
                        }
                        c7 = 65535;
                        break;
                    case 3029637:
                        if (e7.equals("bold")) {
                            c7 = 4;
                            break;
                        }
                        c7 = 65535;
                        break;
                    case 3373707:
                        if (e7.equals("name")) {
                            c7 = 5;
                            break;
                        }
                        c7 = 65535;
                        break;
                    case 366554320:
                        if (e7.equals("fontsize")) {
                            c7 = 6;
                            break;
                        }
                        c7 = 65535;
                        break;
                    case 767321349:
                        if (e7.equals("borderstyle")) {
                            c7 = 7;
                            break;
                        }
                        c7 = 65535;
                        break;
                    case 1767875043:
                        if (e7.equals("alignment")) {
                            c7 = '\b';
                            break;
                        }
                        c7 = 65535;
                        break;
                    case 1988365454:
                        if (e7.equals("outlinecolour")) {
                            c7 = '\t';
                            break;
                        }
                        c7 = 65535;
                        break;
                    default:
                        c7 = 65535;
                        break;
                }
                switch (c7) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        i13 = i17;
                        break;
                    case 1:
                        i14 = i17;
                        break;
                    case 2:
                        i15 = i17;
                        break;
                    case 3:
                        i9 = i17;
                        break;
                    case 4:
                        i12 = i17;
                        break;
                    case 5:
                        i7 = i17;
                        break;
                    case 6:
                        i11 = i17;
                        break;
                    case 7:
                        i16 = i17;
                        break;
                    case '\b':
                        i8 = i17;
                        break;
                    case '\t':
                        i10 = i17;
                        break;
                }
            }
            if (i7 != -1) {
                return new a(i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, split.length);
            }
            return null;
        }
    }

    /* renamed from: g1.c$b */
    public static final class b {

        /* renamed from: c, reason: collision with root package name */
        public static final Pattern f14384c = Pattern.compile("\\{([^}]*)\\}");

        /* renamed from: d, reason: collision with root package name */
        public static final Pattern f14385d = Pattern.compile(M.G("\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* renamed from: e, reason: collision with root package name */
        public static final Pattern f14386e = Pattern.compile(M.G("\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* renamed from: f, reason: collision with root package name */
        public static final Pattern f14387f = Pattern.compile("\\\\an(\\d+)");

        /* renamed from: a, reason: collision with root package name */
        public final int f14388a;

        /* renamed from: b, reason: collision with root package name */
        public final PointF f14389b;

        public b(int i7, PointF pointF) {
            this.f14388a = i7;
            this.f14389b = pointF;
        }

        public static int a(String str) {
            Matcher matcher = f14387f.matcher(str);
            if (matcher.find()) {
                return C1313c.e((String) AbstractC1297a.e(matcher.group(1)));
            }
            return -1;
        }

        public static b b(String str) {
            Matcher matcher = f14384c.matcher(str);
            PointF pointF = null;
            int i7 = -1;
            while (matcher.find()) {
                String str2 = (String) AbstractC1297a.e(matcher.group(1));
                try {
                    PointF c7 = c(str2);
                    if (c7 != null) {
                        pointF = c7;
                    }
                } catch (RuntimeException unused) {
                }
                try {
                    int a7 = a(str2);
                    if (a7 != -1) {
                        i7 = a7;
                    }
                } catch (RuntimeException unused2) {
                }
            }
            return new b(i7, pointF);
        }

        public static PointF c(String str) {
            String group;
            String group2;
            Matcher matcher = f14385d.matcher(str);
            Matcher matcher2 = f14386e.matcher(str);
            boolean find = matcher.find();
            boolean find2 = matcher2.find();
            if (find) {
                if (find2) {
                    o.f("SsaStyle.Overrides", "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + str + "'");
                }
                group = matcher.group(1);
                group2 = matcher.group(2);
            } else {
                if (!find2) {
                    return null;
                }
                group = matcher2.group(1);
                group2 = matcher2.group(2);
            }
            return new PointF(Float.parseFloat(((String) AbstractC1297a.e(group)).trim()), Float.parseFloat(((String) AbstractC1297a.e(group2)).trim()));
        }

        public static String d(String str) {
            return f14384c.matcher(str).replaceAll("");
        }
    }

    public C1313c(String str, int i7, Integer num, Integer num2, float f7, boolean z7, boolean z8, boolean z9, boolean z10, int i8) {
        this.f14363a = str;
        this.f14364b = i7;
        this.f14365c = num;
        this.f14366d = num2;
        this.f14367e = f7;
        this.f14368f = z7;
        this.f14369g = z8;
        this.f14370h = z9;
        this.f14371i = z10;
        this.f14372j = i8;
    }

    public static C1313c b(String str, a aVar) {
        AbstractC1297a.a(str.startsWith("Style:"));
        String[] split = TextUtils.split(str.substring(6), ",");
        int length = split.length;
        int i7 = aVar.f14383k;
        if (length != i7) {
            o.h("SsaStyle", M.G("Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", Integer.valueOf(i7), Integer.valueOf(split.length), str));
            return null;
        }
        try {
            String trim = split[aVar.f14373a].trim();
            int i8 = aVar.f14374b;
            int e7 = i8 != -1 ? e(split[i8].trim()) : -1;
            int i9 = aVar.f14375c;
            Integer h7 = i9 != -1 ? h(split[i9].trim()) : null;
            int i10 = aVar.f14376d;
            Integer h8 = i10 != -1 ? h(split[i10].trim()) : null;
            int i11 = aVar.f14377e;
            float i12 = i11 != -1 ? i(split[i11].trim()) : -3.4028235E38f;
            int i13 = aVar.f14378f;
            boolean z7 = i13 != -1 && f(split[i13].trim());
            int i14 = aVar.f14379g;
            boolean z8 = i14 != -1 && f(split[i14].trim());
            int i15 = aVar.f14380h;
            boolean z9 = i15 != -1 && f(split[i15].trim());
            int i16 = aVar.f14381i;
            boolean z10 = i16 != -1 && f(split[i16].trim());
            int i17 = aVar.f14382j;
            return new C1313c(trim, e7, h7, h8, i12, z7, z8, z9, z10, i17 != -1 ? g(split[i17].trim()) : -1);
        } catch (RuntimeException e8) {
            o.i("SsaStyle", "Skipping malformed 'Style:' line: '" + str + "'", e8);
            return null;
        }
    }

    public static boolean c(int i7) {
        switch (i7) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return true;
            default:
                return false;
        }
    }

    public static boolean d(int i7) {
        return i7 == 1 || i7 == 3;
    }

    public static int e(String str) {
        try {
            int parseInt = Integer.parseInt(str.trim());
            if (c(parseInt)) {
                return parseInt;
            }
        } catch (NumberFormatException unused) {
        }
        o.h("SsaStyle", "Ignoring unknown alignment: " + str);
        return -1;
    }

    public static boolean f(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            return parseInt == 1 || parseInt == -1;
        } catch (NumberFormatException e7) {
            o.i("SsaStyle", "Failed to parse boolean value: '" + str + "'", e7);
            return false;
        }
    }

    public static int g(String str) {
        try {
            int parseInt = Integer.parseInt(str.trim());
            if (d(parseInt)) {
                return parseInt;
            }
        } catch (NumberFormatException unused) {
        }
        o.h("SsaStyle", "Ignoring unknown BorderStyle: " + str);
        return -1;
    }

    public static Integer h(String str) {
        try {
            long parseLong = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            AbstractC1297a.a(parseLong <= 4294967295L);
            return Integer.valueOf(Color.argb(f.d(((parseLong >> 24) & 255) ^ 255), f.d(parseLong & 255), f.d((parseLong >> 8) & 255), f.d((parseLong >> 16) & 255)));
        } catch (IllegalArgumentException e7) {
            o.i("SsaStyle", "Failed to parse color expression: '" + str + "'", e7);
            return null;
        }
    }

    public static float i(String str) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException e7) {
            o.i("SsaStyle", "Failed to parse font size: '" + str + "'", e7);
            return -3.4028235E38f;
        }
    }
}
