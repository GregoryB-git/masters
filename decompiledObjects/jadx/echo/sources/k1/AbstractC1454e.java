package k1;

import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import f0.C1280a;
import f0.C1284e;
import g0.AbstractC1297a;
import g0.M;
import g0.o;
import g0.z;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k1.AbstractC1454e;

/* renamed from: k1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1454e {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f16104a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f16105b = Pattern.compile("(\\S+?):(\\S+)");

    /* renamed from: c, reason: collision with root package name */
    public static final Map f16106c;

    /* renamed from: d, reason: collision with root package name */
    public static final Map f16107d;

    /* renamed from: k1.e$b */
    public static class b {

        /* renamed from: c, reason: collision with root package name */
        public static final Comparator f16108c = new Comparator() { // from class: k1.f
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int e7;
                e7 = AbstractC1454e.b.e((AbstractC1454e.b) obj, (AbstractC1454e.b) obj2);
                return e7;
            }
        };

        /* renamed from: a, reason: collision with root package name */
        public final c f16109a;

        /* renamed from: b, reason: collision with root package name */
        public final int f16110b;

        public b(c cVar, int i7) {
            this.f16109a = cVar;
            this.f16110b = i7;
        }

        public static /* synthetic */ int e(b bVar, b bVar2) {
            return Integer.compare(bVar.f16109a.f16112b, bVar2.f16109a.f16112b);
        }
    }

    /* renamed from: k1.e$c */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final String f16111a;

        /* renamed from: b, reason: collision with root package name */
        public final int f16112b;

        /* renamed from: c, reason: collision with root package name */
        public final String f16113c;

        /* renamed from: d, reason: collision with root package name */
        public final Set f16114d;

        public c(String str, int i7, String str2, Set set) {
            this.f16112b = i7;
            this.f16111a = str;
            this.f16113c = str2;
            this.f16114d = set;
        }

        public static c a(String str, int i7) {
            String str2;
            String trim = str.trim();
            AbstractC1297a.a(!trim.isEmpty());
            int indexOf = trim.indexOf(" ");
            if (indexOf == -1) {
                str2 = "";
            } else {
                String trim2 = trim.substring(indexOf).trim();
                trim = trim.substring(0, indexOf);
                str2 = trim2;
            }
            String[] b12 = M.b1(trim, "\\.");
            String str3 = b12[0];
            HashSet hashSet = new HashSet();
            for (int i8 = 1; i8 < b12.length; i8++) {
                hashSet.add(b12[i8]);
            }
            return new c(str3, i7, str2, hashSet);
        }

        public static c b() {
            return new c("", 0, "", Collections.emptySet());
        }
    }

    /* renamed from: k1.e$d */
    public static final class d implements Comparable {

        /* renamed from: o, reason: collision with root package name */
        public final int f16115o;

        /* renamed from: p, reason: collision with root package name */
        public final C1452c f16116p;

        public d(int i7, C1452c c1452c) {
            this.f16115o = i7;
            this.f16116p = c1452c;
        }

        @Override // java.lang.Comparable
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            return Integer.compare(this.f16115o, dVar.f16115o);
        }
    }

    /* renamed from: k1.e$e, reason: collision with other inner class name */
    public static final class C0226e {

        /* renamed from: c, reason: collision with root package name */
        public CharSequence f16119c;

        /* renamed from: a, reason: collision with root package name */
        public long f16117a = 0;

        /* renamed from: b, reason: collision with root package name */
        public long f16118b = 0;

        /* renamed from: d, reason: collision with root package name */
        public int f16120d = 2;

        /* renamed from: e, reason: collision with root package name */
        public float f16121e = -3.4028235E38f;

        /* renamed from: f, reason: collision with root package name */
        public int f16122f = 1;

        /* renamed from: g, reason: collision with root package name */
        public int f16123g = 0;

        /* renamed from: h, reason: collision with root package name */
        public float f16124h = -3.4028235E38f;

        /* renamed from: i, reason: collision with root package name */
        public int f16125i = Integer.MIN_VALUE;

        /* renamed from: j, reason: collision with root package name */
        public float f16126j = 1.0f;

        /* renamed from: k, reason: collision with root package name */
        public int f16127k = Integer.MIN_VALUE;

        public static float b(float f7, int i7) {
            if (f7 == -3.4028235E38f || i7 != 0 || (f7 >= 0.0f && f7 <= 1.0f)) {
                return f7 != -3.4028235E38f ? f7 : i7 == 0 ? 1.0f : -3.4028235E38f;
            }
            return 1.0f;
        }

        public static Layout.Alignment c(int i7) {
            if (i7 != 1) {
                if (i7 == 2) {
                    return Layout.Alignment.ALIGN_CENTER;
                }
                if (i7 != 3) {
                    if (i7 != 4) {
                        if (i7 != 5) {
                            o.h("WebvttCueParser", "Unknown textAlignment: " + i7);
                            return null;
                        }
                    }
                }
                return Layout.Alignment.ALIGN_OPPOSITE;
            }
            return Layout.Alignment.ALIGN_NORMAL;
        }

        public static float d(int i7, float f7) {
            if (i7 == 0) {
                return 1.0f - f7;
            }
            if (i7 == 1) {
                return f7 <= 0.5f ? f7 * 2.0f : (1.0f - f7) * 2.0f;
            }
            if (i7 == 2) {
                return f7;
            }
            throw new IllegalStateException(String.valueOf(i7));
        }

        public static float e(int i7) {
            if (i7 != 4) {
                return i7 != 5 ? 0.5f : 1.0f;
            }
            return 0.0f;
        }

        public static int f(int i7) {
            if (i7 == 1) {
                return 0;
            }
            if (i7 == 3) {
                return 2;
            }
            if (i7 != 4) {
                return i7 != 5 ? 1 : 2;
            }
            return 0;
        }

        public C1453d a() {
            return new C1453d(g().a(), this.f16117a, this.f16118b);
        }

        public C1280a.b g() {
            float f7 = this.f16124h;
            if (f7 == -3.4028235E38f) {
                f7 = e(this.f16120d);
            }
            int i7 = this.f16125i;
            if (i7 == Integer.MIN_VALUE) {
                i7 = f(this.f16120d);
            }
            C1280a.b r7 = new C1280a.b().p(c(this.f16120d)).h(b(this.f16121e, this.f16122f), this.f16122f).i(this.f16123g).k(f7).l(i7).n(Math.min(this.f16126j, d(i7, f7))).r(this.f16127k);
            CharSequence charSequence = this.f16119c;
            if (charSequence != null) {
                r7.o(charSequence);
            }
            return r7;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f16106c = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f16107d = Collections.unmodifiableMap(hashMap2);
    }

    public static void a(SpannableStringBuilder spannableStringBuilder, Set set, int i7, int i8) {
        Object foregroundColorSpan;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Map map = f16106c;
            if (map.containsKey(str)) {
                foregroundColorSpan = new ForegroundColorSpan(((Integer) map.get(str)).intValue());
            } else {
                Map map2 = f16107d;
                if (map2.containsKey(str)) {
                    foregroundColorSpan = new BackgroundColorSpan(((Integer) map2.get(str)).intValue());
                }
            }
            spannableStringBuilder.setSpan(foregroundColorSpan, i7, i8, 33);
        }
    }

    public static void b(String str, SpannableStringBuilder spannableStringBuilder) {
        char c7;
        str.hashCode();
        switch (str) {
            case "gt":
                c7 = '>';
                break;
            case "lt":
                c7 = '<';
                break;
            case "amp":
                c7 = '&';
                break;
            case "nbsp":
                c7 = ' ';
                break;
            default:
                o.h("WebvttCueParser", "ignoring unsupported entity: '&" + str + ";'");
                return;
        }
        spannableStringBuilder.append(c7);
    }

    public static void c(SpannableStringBuilder spannableStringBuilder, String str, c cVar, List list, List list2) {
        int i7 = i(list2, str, cVar);
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.addAll(list);
        Collections.sort(arrayList, b.f16108c);
        int i8 = cVar.f16112b;
        int i9 = 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if ("rt".equals(((b) arrayList.get(i10)).f16109a.f16111a)) {
                b bVar = (b) arrayList.get(i10);
                int g7 = g(i(list2, str, bVar.f16109a), i7, 1);
                int i11 = bVar.f16109a.f16112b - i9;
                int i12 = bVar.f16110b - i9;
                CharSequence subSequence = spannableStringBuilder.subSequence(i11, i12);
                spannableStringBuilder.delete(i11, i12);
                spannableStringBuilder.setSpan(new C1284e(subSequence.toString(), g7), i8, i11, 33);
                i9 += subSequence.length();
                i8 = i11;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009e A[LOOP:0: B:38:0x0098->B:40:0x009e, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void d(java.lang.String r8, k1.AbstractC1454e.c r9, java.util.List r10, android.text.SpannableStringBuilder r11, java.util.List r12) {
        /*
            int r0 = r9.f16112b
            int r1 = r11.length()
            java.lang.String r2 = r9.f16111a
            r2.hashCode()
            int r3 = r2.hashCode()
            r4 = 2
            r5 = 0
            r6 = 1
            r7 = -1
            switch(r3) {
                case 0: goto L65;
                case 98: goto L5a;
                case 99: goto L4f;
                case 105: goto L44;
                case 117: goto L39;
                case 118: goto L2e;
                case 3314158: goto L23;
                case 3511770: goto L18;
                default: goto L16;
            }
        L16:
            goto L6f
        L18:
            java.lang.String r3 = "ruby"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L21
            goto L6f
        L21:
            r7 = 7
            goto L6f
        L23:
            java.lang.String r3 = "lang"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L2c
            goto L6f
        L2c:
            r7 = 6
            goto L6f
        L2e:
            java.lang.String r3 = "v"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L37
            goto L6f
        L37:
            r7 = 5
            goto L6f
        L39:
            java.lang.String r3 = "u"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L42
            goto L6f
        L42:
            r7 = 4
            goto L6f
        L44:
            java.lang.String r3 = "i"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L4d
            goto L6f
        L4d:
            r7 = 3
            goto L6f
        L4f:
            java.lang.String r3 = "c"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L58
            goto L6f
        L58:
            r7 = r4
            goto L6f
        L5a:
            java.lang.String r3 = "b"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L63
            goto L6f
        L63:
            r7 = r6
            goto L6f
        L65:
            java.lang.String r3 = ""
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L6e
            goto L6f
        L6e:
            r7 = r5
        L6f:
            r2 = 33
            switch(r7) {
                case 0: goto L94;
                case 1: goto L8e;
                case 2: goto L88;
                case 3: goto L82;
                case 4: goto L79;
                case 5: goto L94;
                case 6: goto L94;
                case 7: goto L75;
                default: goto L74;
            }
        L74:
            return
        L75:
            c(r11, r8, r9, r10, r12)
            goto L94
        L79:
            android.text.style.UnderlineSpan r10 = new android.text.style.UnderlineSpan
            r10.<init>()
        L7e:
            r11.setSpan(r10, r0, r1, r2)
            goto L94
        L82:
            android.text.style.StyleSpan r10 = new android.text.style.StyleSpan
            r10.<init>(r4)
            goto L7e
        L88:
            java.util.Set r10 = r9.f16114d
            a(r11, r10, r0, r1)
            goto L94
        L8e:
            android.text.style.StyleSpan r10 = new android.text.style.StyleSpan
            r10.<init>(r6)
            goto L7e
        L94:
            java.util.List r8 = h(r12, r8, r9)
        L98:
            int r9 = r8.size()
            if (r5 >= r9) goto Lac
            java.lang.Object r9 = r8.get(r5)
            k1.e$d r9 = (k1.AbstractC1454e.d) r9
            k1.c r9 = r9.f16116p
            e(r11, r9, r0, r1)
            int r5 = r5 + 1
            goto L98
        Lac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.AbstractC1454e.d(java.lang.String, k1.e$c, java.util.List, android.text.SpannableStringBuilder, java.util.List):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void e(android.text.SpannableStringBuilder r4, k1.C1452c r5, int r6, int r7) {
        /*
            if (r5 != 0) goto L3
            return
        L3:
            int r0 = r5.i()
            r1 = -1
            r2 = 33
            if (r0 == r1) goto L18
            android.text.style.StyleSpan r0 = new android.text.style.StyleSpan
            int r1 = r5.i()
            r0.<init>(r1)
            f0.AbstractC1285f.b(r4, r0, r6, r7, r2)
        L18:
            boolean r0 = r5.l()
            if (r0 == 0) goto L26
            android.text.style.StrikethroughSpan r0 = new android.text.style.StrikethroughSpan
            r0.<init>()
            r4.setSpan(r0, r6, r7, r2)
        L26:
            boolean r0 = r5.m()
            if (r0 == 0) goto L34
            android.text.style.UnderlineSpan r0 = new android.text.style.UnderlineSpan
            r0.<init>()
            r4.setSpan(r0, r6, r7, r2)
        L34:
            boolean r0 = r5.k()
            if (r0 == 0) goto L46
            android.text.style.ForegroundColorSpan r0 = new android.text.style.ForegroundColorSpan
            int r1 = r5.c()
            r0.<init>(r1)
            f0.AbstractC1285f.b(r4, r0, r6, r7, r2)
        L46:
            boolean r0 = r5.j()
            if (r0 == 0) goto L58
            android.text.style.BackgroundColorSpan r0 = new android.text.style.BackgroundColorSpan
            int r1 = r5.a()
            r0.<init>(r1)
            f0.AbstractC1285f.b(r4, r0, r6, r7, r2)
        L58:
            java.lang.String r0 = r5.d()
            if (r0 == 0) goto L6a
            android.text.style.TypefaceSpan r0 = new android.text.style.TypefaceSpan
            java.lang.String r1 = r5.d()
            r0.<init>(r1)
            f0.AbstractC1285f.b(r4, r0, r6, r7, r2)
        L6a:
            int r0 = r5.f()
            r1 = 1
            if (r0 == r1) goto L92
            r1 = 2
            if (r0 == r1) goto L88
            r1 = 3
            if (r0 == r1) goto L78
            goto L9d
        L78:
            android.text.style.RelativeSizeSpan r0 = new android.text.style.RelativeSizeSpan
            float r1 = r5.e()
            r3 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 / r3
            r0.<init>(r1)
        L84:
            f0.AbstractC1285f.b(r4, r0, r6, r7, r2)
            goto L9d
        L88:
            android.text.style.RelativeSizeSpan r0 = new android.text.style.RelativeSizeSpan
            float r1 = r5.e()
            r0.<init>(r1)
            goto L84
        L92:
            android.text.style.AbsoluteSizeSpan r0 = new android.text.style.AbsoluteSizeSpan
            float r3 = r5.e()
            int r3 = (int) r3
            r0.<init>(r3, r1)
            goto L84
        L9d:
            boolean r5 = r5.b()
            if (r5 == 0) goto Lab
            f0.d r5 = new f0.d
            r5.<init>()
            r4.setSpan(r5, r6, r7, r2)
        Lab:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.AbstractC1454e.e(android.text.SpannableStringBuilder, k1.c, int, int):void");
    }

    public static int f(String str, int i7) {
        int indexOf = str.indexOf(62, i7);
        return indexOf == -1 ? str.length() : indexOf + 1;
    }

    public static int g(int i7, int i8, int i9) {
        if (i7 != -1) {
            return i7;
        }
        if (i8 != -1) {
            return i8;
        }
        if (i9 != -1) {
            return i9;
        }
        throw new IllegalArgumentException();
    }

    public static List h(List list, String str, c cVar) {
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < list.size(); i7++) {
            C1452c c1452c = (C1452c) list.get(i7);
            int h7 = c1452c.h(str, cVar.f16111a, cVar.f16114d, cVar.f16113c);
            if (h7 > 0) {
                arrayList.add(new d(h7, c1452c));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static int i(List list, String str, c cVar) {
        List h7 = h(list, str, cVar);
        for (int i7 = 0; i7 < h7.size(); i7++) {
            C1452c c1452c = ((d) h7.get(i7)).f16116p;
            if (c1452c.g() != -1) {
                return c1452c.g();
            }
        }
        return -1;
    }

    public static String j(String str) {
        String trim = str.trim();
        AbstractC1297a.a(!trim.isEmpty());
        return M.c1(trim, "[ \\.]")[0];
    }

    public static boolean k(String str) {
        str.hashCode();
        switch (str) {
            case "b":
            case "c":
            case "i":
            case "u":
            case "v":
            case "rt":
            case "lang":
            case "ruby":
                return true;
            default:
                return false;
        }
    }

    public static C1280a l(CharSequence charSequence) {
        C0226e c0226e = new C0226e();
        c0226e.f16119c = charSequence;
        return c0226e.g().a();
    }

    public static C1453d m(z zVar, List list) {
        String r7 = zVar.r();
        if (r7 == null) {
            return null;
        }
        Pattern pattern = f16104a;
        Matcher matcher = pattern.matcher(r7);
        if (matcher.matches()) {
            return n(null, matcher, zVar, list);
        }
        String r8 = zVar.r();
        if (r8 == null) {
            return null;
        }
        Matcher matcher2 = pattern.matcher(r8);
        if (matcher2.matches()) {
            return n(r7.trim(), matcher2, zVar, list);
        }
        return null;
    }

    public static C1453d n(String str, Matcher matcher, z zVar, List list) {
        C0226e c0226e = new C0226e();
        try {
            c0226e.f16117a = AbstractC1457h.d((String) AbstractC1297a.e(matcher.group(1)));
            c0226e.f16118b = AbstractC1457h.d((String) AbstractC1297a.e(matcher.group(2)));
            p((String) AbstractC1297a.e(matcher.group(3)), c0226e);
            StringBuilder sb = new StringBuilder();
            while (true) {
                String r7 = zVar.r();
                if (TextUtils.isEmpty(r7)) {
                    c0226e.f16119c = q(str, sb.toString(), list);
                    return c0226e.a();
                }
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(r7.trim());
            }
        } catch (NumberFormatException unused) {
            o.h("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    public static C1280a.b o(String str) {
        C0226e c0226e = new C0226e();
        p(str, c0226e);
        return c0226e.g();
    }

    public static void p(String str, C0226e c0226e) {
        Matcher matcher = f16105b.matcher(str);
        while (matcher.find()) {
            String str2 = (String) AbstractC1297a.e(matcher.group(1));
            String str3 = (String) AbstractC1297a.e(matcher.group(2));
            try {
                if ("line".equals(str2)) {
                    s(str3, c0226e);
                } else if ("align".equals(str2)) {
                    c0226e.f16120d = v(str3);
                } else if ("position".equals(str2)) {
                    u(str3, c0226e);
                } else if ("size".equals(str2)) {
                    c0226e.f16126j = AbstractC1457h.c(str3);
                } else if ("vertical".equals(str2)) {
                    c0226e.f16127k = w(str3);
                } else {
                    o.h("WebvttCueParser", "Unknown cue setting " + str2 + ":" + str3);
                }
            } catch (NumberFormatException unused) {
                o.h("WebvttCueParser", "Skipping bad cue setting: " + matcher.group());
            }
        }
    }

    public static SpannedString q(String str, String str2, List list) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i7 = 0;
        while (i7 < str2.length()) {
            char charAt = str2.charAt(i7);
            if (charAt == '&') {
                i7++;
                int indexOf = str2.indexOf(59, i7);
                int indexOf2 = str2.indexOf(32, i7);
                if (indexOf == -1) {
                    indexOf = indexOf2;
                } else if (indexOf2 != -1) {
                    indexOf = Math.min(indexOf, indexOf2);
                }
                if (indexOf != -1) {
                    b(str2.substring(i7, indexOf), spannableStringBuilder);
                    if (indexOf == indexOf2) {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    i7 = indexOf + 1;
                } else {
                    spannableStringBuilder.append(charAt);
                }
            } else if (charAt != '<') {
                spannableStringBuilder.append(charAt);
                i7++;
            } else {
                int i8 = i7 + 1;
                if (i8 < str2.length()) {
                    boolean z7 = str2.charAt(i8) == '/';
                    i8 = f(str2, i8);
                    int i9 = i8 - 2;
                    boolean z8 = str2.charAt(i9) == '/';
                    int i10 = i7 + (z7 ? 2 : 1);
                    if (!z8) {
                        i9 = i8 - 1;
                    }
                    String substring = str2.substring(i10, i9);
                    if (!substring.trim().isEmpty()) {
                        String j7 = j(substring);
                        if (k(j7)) {
                            if (z7) {
                                while (!arrayDeque.isEmpty()) {
                                    c cVar = (c) arrayDeque.pop();
                                    d(str, cVar, arrayList, spannableStringBuilder, list);
                                    if (arrayDeque.isEmpty()) {
                                        arrayList.clear();
                                    } else {
                                        arrayList.add(new b(cVar, spannableStringBuilder.length()));
                                    }
                                    if (cVar.f16111a.equals(j7)) {
                                        break;
                                    }
                                }
                            } else if (!z8) {
                                arrayDeque.push(c.a(substring, spannableStringBuilder.length()));
                            }
                        }
                    }
                }
                i7 = i8;
            }
        }
        while (!arrayDeque.isEmpty()) {
            d(str, (c) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
        }
        d(str, c.b(), Collections.emptyList(), spannableStringBuilder, list);
        return SpannedString.valueOf(spannableStringBuilder);
    }

    public static int r(String str) {
        str.hashCode();
        switch (str) {
            case "center":
            case "middle":
                return 1;
            case "end":
                return 2;
            case "start":
                return 0;
            default:
                o.h("WebvttCueParser", "Invalid anchor value: " + str);
                return Integer.MIN_VALUE;
        }
    }

    public static void s(String str, C0226e c0226e) {
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            c0226e.f16123g = r(str.substring(indexOf + 1));
            str = str.substring(0, indexOf);
        }
        if (str.endsWith("%")) {
            c0226e.f16121e = AbstractC1457h.c(str);
            c0226e.f16122f = 0;
        } else {
            c0226e.f16121e = Integer.parseInt(str);
            c0226e.f16122f = 1;
        }
    }

    public static int t(String str) {
        str.hashCode();
        switch (str) {
            case "line-left":
            case "start":
                return 0;
            case "center":
            case "middle":
                return 1;
            case "line-right":
            case "end":
                return 2;
            default:
                o.h("WebvttCueParser", "Invalid anchor value: " + str);
                return Integer.MIN_VALUE;
        }
    }

    public static void u(String str, C0226e c0226e) {
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            c0226e.f16125i = t(str.substring(indexOf + 1));
            str = str.substring(0, indexOf);
        }
        c0226e.f16124h = AbstractC1457h.c(str);
    }

    public static int v(String str) {
        str.hashCode();
        switch (str) {
            case "center":
            case "middle":
                return 2;
            case "end":
                return 3;
            case "left":
                return 4;
            case "right":
                return 5;
            case "start":
                return 1;
            default:
                o.h("WebvttCueParser", "Invalid alignment value: " + str);
                return 2;
        }
    }

    public static int w(String str) {
        str.hashCode();
        if (str.equals("lr")) {
            return 2;
        }
        if (str.equals("rl")) {
            return 1;
        }
        o.h("WebvttCueParser", "Invalid 'vertical' value: " + str);
        return Integer.MIN_VALUE;
    }
}
