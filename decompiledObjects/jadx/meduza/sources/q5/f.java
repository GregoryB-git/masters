package q5;

import android.graphics.Color;
import android.text.TextUtils;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import v5.m;
import v5.u;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f13302a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f13303b = Pattern.compile("(\\S+?):(\\S+)");

    /* renamed from: c, reason: collision with root package name */
    public static final Map<String, Integer> f13304c;

    /* renamed from: d, reason: collision with root package name */
    public static final Map<String, Integer> f13305d;

    public static class a {

        /* renamed from: c, reason: collision with root package name */
        public static final b0.d f13306c = new b0.d(2);

        /* renamed from: a, reason: collision with root package name */
        public final b f13307a;

        /* renamed from: b, reason: collision with root package name */
        public final int f13308b;

        public a(b bVar, int i10) {
            this.f13307a = bVar;
            this.f13308b = i10;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f13309a;

        /* renamed from: b, reason: collision with root package name */
        public final int f13310b;

        /* renamed from: c, reason: collision with root package name */
        public final String f13311c;

        /* renamed from: d, reason: collision with root package name */
        public final Set<String> f13312d;

        public b(String str, int i10, String str2, Set<String> set) {
            this.f13310b = i10;
            this.f13309a = str;
            this.f13311c = str2;
            this.f13312d = set;
        }
    }

    public static final class c implements Comparable<c> {

        /* renamed from: a, reason: collision with root package name */
        public final int f13313a;

        /* renamed from: b, reason: collision with root package name */
        public final q5.d f13314b;

        public c(int i10, q5.d dVar) {
            this.f13313a = i10;
            this.f13314b = dVar;
        }

        @Override // java.lang.Comparable
        public final int compareTo(c cVar) {
            return Integer.compare(this.f13313a, cVar.f13313a);
        }
    }

    public static final class d {

        /* renamed from: c, reason: collision with root package name */
        public CharSequence f13317c;

        /* renamed from: a, reason: collision with root package name */
        public long f13315a = 0;

        /* renamed from: b, reason: collision with root package name */
        public long f13316b = 0;

        /* renamed from: d, reason: collision with root package name */
        public int f13318d = 2;

        /* renamed from: e, reason: collision with root package name */
        public float f13319e = -3.4028235E38f;
        public int f = 1;

        /* renamed from: g, reason: collision with root package name */
        public int f13320g = 0;

        /* renamed from: h, reason: collision with root package name */
        public float f13321h = -3.4028235E38f;

        /* renamed from: i, reason: collision with root package name */
        public int f13322i = Integer.MIN_VALUE;

        /* renamed from: j, reason: collision with root package name */
        public float f13323j = 1.0f;

        /* renamed from: k, reason: collision with root package name */
        public int f13324k = Integer.MIN_VALUE;

        /* JADX WARN: Code restructure failed: missing block: B:52:0x0070, code lost:
        
            if (r7 == 0) goto L43;
         */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0083  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00ae  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x009e  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x006e  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0070  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final h5.a.C0105a a() {
            /*
                Method dump skipped, instructions count: 177
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: q5.f.d.a():h5.a$a");
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
        f13304c = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f13305d = Collections.unmodifiableMap(hashMap2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x025c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x016e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(android.text.SpannableStringBuilder r19, q5.f.b r20, java.lang.String r21, java.util.List r22, java.util.List r23) {
        /*
            Method dump skipped, instructions count: 630
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q5.f.a(android.text.SpannableStringBuilder, q5.f$b, java.lang.String, java.util.List, java.util.List):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ArrayList b(List list, String str, b bVar) {
        int size;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            q5.d dVar = (q5.d) list.get(i10);
            String str2 = bVar.f13309a;
            Set<String> set = bVar.f13312d;
            String str3 = bVar.f13311c;
            if (dVar.f13283a.isEmpty() && dVar.f13284b.isEmpty() && dVar.f13285c.isEmpty() && dVar.f13286d.isEmpty()) {
                size = TextUtils.isEmpty(str2);
            } else {
                int a10 = q5.d.a(dVar.f13286d, q5.d.a(dVar.f13284b, q5.d.a(dVar.f13283a, 0, 1073741824, str), 2, str2), 4, str3);
                size = (a10 == -1 || !set.containsAll(dVar.f13285c)) ? 0 : a10 + (dVar.f13285c.size() * 4);
            }
            if (size > 0) {
                arrayList.add(new c(size, dVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static int c(List<q5.d> list, String str, b bVar) {
        ArrayList b10 = b(list, str, bVar);
        for (int i10 = 0; i10 < b10.size(); i10++) {
            int i11 = ((c) b10.get(i10)).f13314b.f13297p;
            if (i11 != -1) {
                return i11;
            }
        }
        return -1;
    }

    public static e d(String str, Matcher matcher, u uVar, ArrayList arrayList) {
        d dVar = new d();
        try {
            String group = matcher.group(1);
            group.getClass();
            dVar.f13315a = h.c(group);
            String group2 = matcher.group(2);
            group2.getClass();
            dVar.f13316b = h.c(group2);
            String group3 = matcher.group(3);
            group3.getClass();
            e(group3, dVar);
            StringBuilder sb2 = new StringBuilder();
            while (true) {
                String g10 = uVar.g();
                if (TextUtils.isEmpty(g10)) {
                    dVar.f13317c = f(str, sb2.toString(), arrayList);
                    return new e(dVar.a().a(), dVar.f13315a, dVar.f13316b);
                }
                if (sb2.length() > 0) {
                    sb2.append("\n");
                }
                sb2.append(g10.trim());
            }
        } catch (NumberFormatException unused) {
            StringBuilder l10 = defpackage.f.l("Skipping cue with bad header: ");
            l10.append(matcher.group());
            m.f("WebvttCueParser", l10.toString());
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void e(String str, d dVar) {
        Matcher matcher = f13303b.matcher(str);
        while (matcher.find()) {
            int i10 = 1;
            String group = matcher.group(1);
            group.getClass();
            String group2 = matcher.group(2);
            group2.getClass();
            try {
                if (Constants.LINE.equals(group)) {
                    g(group2, dVar);
                } else if ("align".equals(group)) {
                    group2.hashCode();
                    switch (group2) {
                        case "center":
                        case "middle":
                            i10 = 2;
                            break;
                        case "end":
                            i10 = 3;
                            break;
                        case "left":
                            i10 = 4;
                            break;
                        case "right":
                            i10 = 5;
                            break;
                        case "start":
                            break;
                        default:
                            m.f("WebvttCueParser", "Invalid alignment value: " + group2);
                            i10 = 2;
                            break;
                    }
                    dVar.f13318d = i10;
                } else if ("position".equals(group)) {
                    h(group2, dVar);
                } else if ("size".equals(group)) {
                    dVar.f13323j = h.b(group2);
                } else if ("vertical".equals(group)) {
                    if (group2.equals("lr")) {
                        i10 = 2;
                    } else if (!group2.equals("rl")) {
                        m.f("WebvttCueParser", "Invalid 'vertical' value: " + group2);
                        i10 = Integer.MIN_VALUE;
                    }
                    dVar.f13324k = i10;
                } else {
                    m.f("WebvttCueParser", "Unknown cue setting " + group + ":" + group2);
                }
            } catch (NumberFormatException unused) {
                StringBuilder l10 = defpackage.f.l("Skipping bad cue setting: ");
                l10.append(matcher.group());
                m.f("WebvttCueParser", l10.toString());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0128  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.text.SpannedString f(java.lang.String r17, java.lang.String r18, java.util.List<q5.d> r19) {
        /*
            Method dump skipped, instructions count: 652
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q5.f.f(java.lang.String, java.lang.String, java.util.List):android.text.SpannedString");
    }

    public static void g(String str, d dVar) {
        String substring;
        int i10;
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            substring = str.substring(indexOf + 1);
            substring.getClass();
            i10 = 2;
            switch (substring) {
                case "center":
                case "middle":
                    i10 = 1;
                    break;
                case "end":
                    break;
                case "start":
                    i10 = 0;
                    break;
                default:
                    m.f("WebvttCueParser", "Invalid anchor value: " + substring);
                    i10 = Integer.MIN_VALUE;
                    break;
            }
            dVar.f13320g = i10;
            str = str.substring(0, indexOf);
        }
        if (str.endsWith("%")) {
            dVar.f13319e = h.b(str);
            dVar.f = 0;
        } else {
            dVar.f13319e = Integer.parseInt(str);
            dVar.f = 1;
        }
    }

    public static void h(String str, d dVar) {
        String substring;
        int i10;
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            substring = str.substring(indexOf + 1);
            substring.getClass();
            i10 = 2;
            switch (substring) {
                case "line-left":
                case "start":
                    i10 = 0;
                    break;
                case "center":
                case "middle":
                    i10 = 1;
                    break;
                case "line-right":
                case "end":
                    break;
                default:
                    m.f("WebvttCueParser", "Invalid anchor value: " + substring);
                    i10 = Integer.MIN_VALUE;
                    break;
            }
            dVar.f13322i = i10;
            str = str.substring(0, indexOf);
        }
        dVar.f13321h = h.b(str);
    }
}
