package m5;

import android.graphics.Color;
import android.graphics.PointF;
import io.flutter.embedding.android.KeyboardMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import v5.e0;
import v5.m;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f10215a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10216b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f10217c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f10218d;

    /* renamed from: e, reason: collision with root package name */
    public final float f10219e;
    public final boolean f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f10220g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f10221h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f10222i;

    /* renamed from: j, reason: collision with root package name */
    public final int f10223j;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f10224a;

        /* renamed from: b, reason: collision with root package name */
        public final int f10225b;

        /* renamed from: c, reason: collision with root package name */
        public final int f10226c;

        /* renamed from: d, reason: collision with root package name */
        public final int f10227d;

        /* renamed from: e, reason: collision with root package name */
        public final int f10228e;
        public final int f;

        /* renamed from: g, reason: collision with root package name */
        public final int f10229g;

        /* renamed from: h, reason: collision with root package name */
        public final int f10230h;

        /* renamed from: i, reason: collision with root package name */
        public final int f10231i;

        /* renamed from: j, reason: collision with root package name */
        public final int f10232j;

        /* renamed from: k, reason: collision with root package name */
        public final int f10233k;

        public a(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20) {
            this.f10224a = i10;
            this.f10225b = i11;
            this.f10226c = i12;
            this.f10227d = i13;
            this.f10228e = i14;
            this.f = i15;
            this.f10229g = i16;
            this.f10230h = i17;
            this.f10231i = i18;
            this.f10232j = i19;
            this.f10233k = i20;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final Pattern f10234a = Pattern.compile("\\{([^}]*)\\}");

        /* renamed from: b, reason: collision with root package name */
        public static final Pattern f10235b = Pattern.compile(e0.m("\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* renamed from: c, reason: collision with root package name */
        public static final Pattern f10236c = Pattern.compile(e0.m("\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* renamed from: d, reason: collision with root package name */
        public static final Pattern f10237d = Pattern.compile("\\\\an(\\d+)");

        public static PointF a(String str) {
            String group;
            String group2;
            Matcher matcher = f10235b.matcher(str);
            Matcher matcher2 = f10236c.matcher(str);
            boolean find = matcher.find();
            boolean find2 = matcher2.find();
            if (find) {
                if (find2) {
                    m.e("SsaStyle.Overrides", "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + str + "'");
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
            group.getClass();
            float parseFloat = Float.parseFloat(group.trim());
            group2.getClass();
            return new PointF(parseFloat, Float.parseFloat(group2.trim()));
        }
    }

    public c(String str, int i10, Integer num, Integer num2, float f, boolean z10, boolean z11, boolean z12, boolean z13, int i11) {
        this.f10215a = str;
        this.f10216b = i10;
        this.f10217c = num;
        this.f10218d = num2;
        this.f10219e = f;
        this.f = z10;
        this.f10220g = z11;
        this.f10221h = z12;
        this.f10222i = z13;
        this.f10223j = i11;
    }

    public static int a(String str) {
        boolean z10;
        try {
            int parseInt = Integer.parseInt(str.trim());
            switch (parseInt) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    z10 = true;
                    break;
                default:
                    z10 = false;
                    break;
            }
            if (z10) {
                return parseInt;
            }
        } catch (NumberFormatException unused) {
        }
        m.f("SsaStyle", "Ignoring unknown alignment: " + str);
        return -1;
    }

    public static boolean b(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            return parseInt == 1 || parseInt == -1;
        } catch (NumberFormatException e10) {
            m.g("SsaStyle", "Failed to parse boolean value: '" + str + "'", e10);
            return false;
        }
    }

    public static Integer c(String str) {
        try {
            long parseLong = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            x6.b.q(parseLong <= KeyboardMap.kValueMask);
            return Integer.valueOf(Color.argb(r7.a.C(((parseLong >> 24) & 255) ^ 255), r7.a.C(parseLong & 255), r7.a.C((parseLong >> 8) & 255), r7.a.C((parseLong >> 16) & 255)));
        } catch (IllegalArgumentException e10) {
            m.g("SsaStyle", "Failed to parse color expression: '" + str + "'", e10);
            return null;
        }
    }
}
