/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.graphics.Color
 *  android.text.Layout
 *  android.text.Layout$Alignment
 *  android.text.Spannable
 *  android.text.SpannableStringBuilder
 *  android.text.SpannedString
 *  android.text.TextUtils
 *  android.text.style.AbsoluteSizeSpan
 *  android.text.style.BackgroundColorSpan
 *  android.text.style.ForegroundColorSpan
 *  android.text.style.RelativeSizeSpan
 *  android.text.style.StrikethroughSpan
 *  android.text.style.StyleSpan
 *  android.text.style.TypefaceSpan
 *  android.text.style.UnderlineSpan
 *  java.lang.CharSequence
 *  java.lang.Comparable
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayDeque
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.Comparator
 *  java.util.HashMap
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Set
 *  java.util.regex.Matcher
 *  java.util.regex.Pattern
 */
package k1;

import android.graphics.Color;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import f0.a;
import g0.M;
import g0.o;
import g0.z;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
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
import k1.f;
import k1.h;

public abstract class e {
    public static final Pattern a = Pattern.compile((String)"^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");
    public static final Pattern b = Pattern.compile((String)"(\\S+?):(\\S+)");
    public static final Map c;
    public static final Map d;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put((Object)"white", (Object)Color.rgb((int)255, (int)255, (int)255));
        hashMap.put((Object)"lime", (Object)Color.rgb((int)0, (int)255, (int)0));
        hashMap.put((Object)"cyan", (Object)Color.rgb((int)0, (int)255, (int)255));
        hashMap.put((Object)"red", (Object)Color.rgb((int)255, (int)0, (int)0));
        hashMap.put((Object)"yellow", (Object)Color.rgb((int)255, (int)255, (int)0));
        hashMap.put((Object)"magenta", (Object)Color.rgb((int)255, (int)0, (int)255));
        hashMap.put((Object)"blue", (Object)Color.rgb((int)0, (int)0, (int)255));
        hashMap.put((Object)"black", (Object)Color.rgb((int)0, (int)0, (int)0));
        c = Collections.unmodifiableMap((Map)hashMap);
        hashMap = new HashMap();
        hashMap.put((Object)"bg_white", (Object)Color.rgb((int)255, (int)255, (int)255));
        hashMap.put((Object)"bg_lime", (Object)Color.rgb((int)0, (int)255, (int)0));
        hashMap.put((Object)"bg_cyan", (Object)Color.rgb((int)0, (int)255, (int)255));
        hashMap.put((Object)"bg_red", (Object)Color.rgb((int)255, (int)0, (int)0));
        hashMap.put((Object)"bg_yellow", (Object)Color.rgb((int)255, (int)255, (int)0));
        hashMap.put((Object)"bg_magenta", (Object)Color.rgb((int)255, (int)0, (int)255));
        hashMap.put((Object)"bg_blue", (Object)Color.rgb((int)0, (int)0, (int)255));
        hashMap.put((Object)"bg_black", (Object)Color.rgb((int)0, (int)0, (int)0));
        d = Collections.unmodifiableMap((Map)hashMap);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void a(SpannableStringBuilder spannableStringBuilder, Set object, int n8, int n9) {
        Iterator iterator = object.iterator();
        while (iterator.hasNext()) {
            Map map = c;
            object = (String)iterator.next();
            if (map.containsKey(object)) {
                object = new ForegroundColorSpan(((Integer)map.get(object)).intValue());
            } else {
                map = d;
                if (!map.containsKey(object)) continue;
                object = new BackgroundColorSpan(((Integer)map.get(object)).intValue());
            }
            spannableStringBuilder.setSpan(object, n8, n9, 33);
        }
        return;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void b(String string2, SpannableStringBuilder spannableStringBuilder) {
        char c8;
        string2.hashCode();
        int n8 = string2.hashCode();
        int n9 = -1;
        switch (n8) {
            default: {
                break;
            }
            case 3374865: {
                if (!string2.equals((Object)"nbsp")) break;
                n9 = 3;
                break;
            }
            case 96708: {
                if (!string2.equals((Object)"amp")) break;
                n9 = 2;
                break;
            }
            case 3464: {
                if (!string2.equals((Object)"lt")) break;
                n9 = 1;
                break;
            }
            case 3309: {
                if (!string2.equals((Object)"gt")) break;
                n9 = 0;
            }
        }
        switch (n9) {
            default: {
                spannableStringBuilder = new StringBuilder();
                spannableStringBuilder.append("ignoring unsupported entity: '&");
                spannableStringBuilder.append(string2);
                spannableStringBuilder.append(";'");
                o.h("WebvttCueParser", spannableStringBuilder.toString());
                return;
            }
            case 3: {
                c8 = ' ';
                break;
            }
            case 2: {
                c8 = '&';
                break;
            }
            case 1: {
                c8 = '<';
                break;
            }
            case 0: {
                c8 = '>';
            }
        }
        spannableStringBuilder.append(c8);
    }

    public static void c(SpannableStringBuilder spannableStringBuilder, String string2, c object, List list, List list2) {
        int n8 = e.i(list2, string2, (c)object);
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.addAll((Collection)list);
        Collections.sort((List)arrayList, (Comparator)c);
        int n9 = object.b;
        int n10 = 0;
        for (int i8 = 0; i8 < arrayList.size(); ++i8) {
            if (!"rt".equals((Object)b.c((b)((b)arrayList.get((int)i8))).a)) continue;
            object = (b)arrayList.get(i8);
            int n11 = e.g(e.i(list2, string2, ((b)object).a), n8, 1);
            int n12 = b.c((b)object).b - n10;
            int n13 = ((b)object).b - n10;
            object = spannableStringBuilder.subSequence(n12, n13);
            spannableStringBuilder.delete(n12, n13);
            spannableStringBuilder.setSpan((Object)new f0.e(object.toString(), n11), n9, n12, 33);
            n10 += object.length();
            n9 = n12;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static void d(String var0, c var1_1, List var2_2, SpannableStringBuilder var3_3, List var4_4) {
        var7_5 = var1_1.b;
        var8_6 = var3_3.length();
        var10_7 = var1_1.a;
        var10_7.hashCode();
        var9_8 = var10_7.hashCode();
        var6_9 = 0;
        var5_10 = -1;
        switch (var9_8) {
            default: {
                break;
            }
            case 3511770: {
                if (!var10_7.equals((Object)"ruby")) break;
                var5_10 = 7;
                break;
            }
            case 3314158: {
                if (!var10_7.equals((Object)"lang")) break;
                var5_10 = 6;
                break;
            }
            case 118: {
                if (!var10_7.equals((Object)"v")) break;
                var5_10 = 5;
                break;
            }
            case 117: {
                if (!var10_7.equals((Object)"u")) break;
                var5_10 = 4;
                break;
            }
            case 105: {
                if (!var10_7.equals((Object)"i")) break;
                var5_10 = 3;
                break;
            }
            case 99: {
                if (!var10_7.equals((Object)"c")) break;
                var5_10 = 2;
                break;
            }
            case 98: {
                if (!var10_7.equals((Object)"b")) break;
                var5_10 = 1;
                break;
            }
            case 0: {
                if (!var10_7.equals((Object)"")) break;
                var5_10 = 0;
            }
        }
        switch (var5_10) {
            default: {
                return;
            }
            case 7: {
                e.c(var3_3, var0, var1_1, var2_2, var4_4);
                break;
            }
            case 4: {
                var2_2 = new UnderlineSpan();
                ** GOTO lbl59
            }
            case 3: {
                var2_2 = new StyleSpan(2);
                ** GOTO lbl59
            }
            case 2: {
                e.a(var3_3, var1_1.d, var7_5, var8_6);
                break;
            }
            case 1: {
                var2_2 = new StyleSpan(1);
lbl59: // 3 sources:
                var3_3.setSpan((Object)var2_2, var7_5, var8_6, 33);
                break;
            }
            case 0: 
            case 5: 
            case 6: 
        }
        var0 = e.h(var4_4, var0, var1_1);
        var5_10 = var6_9;
        while (var5_10 < var0.size()) {
            e.e(var3_3, ((d)var0.get((int)var5_10)).p, var7_5, var8_6);
            ++var5_10;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void e(SpannableStringBuilder spannableStringBuilder, k1.c c8, int n8, int n9) {
        block10 : {
            AbsoluteSizeSpan absoluteSizeSpan;
            block11 : {
                block8 : {
                    block9 : {
                        int n10;
                        if (c8 == null) {
                            return;
                        }
                        if (c8.i() != -1) {
                            f0.f.b((Spannable)spannableStringBuilder, (Object)new StyleSpan(c8.i()), n8, n9, 33);
                        }
                        if (c8.l()) {
                            spannableStringBuilder.setSpan((Object)new StrikethroughSpan(), n8, n9, 33);
                        }
                        if (c8.m()) {
                            spannableStringBuilder.setSpan((Object)new UnderlineSpan(), n8, n9, 33);
                        }
                        if (c8.k()) {
                            f0.f.b((Spannable)spannableStringBuilder, (Object)new ForegroundColorSpan(c8.c()), n8, n9, 33);
                        }
                        if (c8.j()) {
                            f0.f.b((Spannable)spannableStringBuilder, (Object)new BackgroundColorSpan(c8.a()), n8, n9, 33);
                        }
                        if (c8.d() != null) {
                            f0.f.b((Spannable)spannableStringBuilder, (Object)new TypefaceSpan(c8.d()), n8, n9, 33);
                        }
                        if ((n10 = c8.f()) == 1) break block8;
                        if (n10 == 2) break block9;
                        if (n10 != 3) break block10;
                        absoluteSizeSpan = new RelativeSizeSpan(c8.e() / 100.0f);
                        break block11;
                    }
                    absoluteSizeSpan = new RelativeSizeSpan(c8.e());
                    break block11;
                }
                absoluteSizeSpan = new AbsoluteSizeSpan((int)c8.e(), true);
            }
            f0.f.b((Spannable)spannableStringBuilder, (Object)absoluteSizeSpan, n8, n9, 33);
        }
        if (c8.b()) {
            spannableStringBuilder.setSpan((Object)new f0.d(), n8, n9, 33);
        }
    }

    public static int f(String string2, int n8) {
        if ((n8 = string2.indexOf(62, n8)) == -1) {
            return string2.length();
        }
        return n8 + 1;
    }

    public static int g(int n8, int n9, int n10) {
        if (n8 != -1) {
            return n8;
        }
        if (n9 != -1) {
            return n9;
        }
        if (n10 != -1) {
            return n10;
        }
        throw new IllegalArgumentException();
    }

    public static List h(List list, String string2, c c8) {
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < list.size(); ++i8) {
            k1.c c9 = (k1.c)list.get(i8);
            int n8 = c9.h(string2, c8.a, c8.d, c8.c);
            if (n8 <= 0) continue;
            arrayList.add((Object)new d(n8, c9));
        }
        Collections.sort((List)arrayList);
        return arrayList;
    }

    public static int i(List list, String object, c c8) {
        list = e.h(list, (String)object, c8);
        for (int i8 = 0; i8 < list.size(); ++i8) {
            object = ((d)list.get((int)i8)).p;
            if (object.g() == -1) continue;
            return object.g();
        }
        return -1;
    }

    public static String j(String string2) {
        string2 = string2.trim();
        g0.a.a(string2.isEmpty() ^ true);
        return M.c1(string2, "[ \\.]")[0];
    }

    public static boolean k(String string2) {
        string2.hashCode();
        int n8 = string2.hashCode();
        int n9 = -1;
        switch (n8) {
            default: {
                break;
            }
            case 3511770: {
                if (!string2.equals((Object)"ruby")) break;
                n9 = 7;
                break;
            }
            case 3314158: {
                if (!string2.equals((Object)"lang")) break;
                n9 = 6;
                break;
            }
            case 3650: {
                if (!string2.equals((Object)"rt")) break;
                n9 = 5;
                break;
            }
            case 118: {
                if (!string2.equals((Object)"v")) break;
                n9 = 4;
                break;
            }
            case 117: {
                if (!string2.equals((Object)"u")) break;
                n9 = 3;
                break;
            }
            case 105: {
                if (!string2.equals((Object)"i")) break;
                n9 = 2;
                break;
            }
            case 99: {
                if (!string2.equals((Object)"c")) break;
                n9 = 1;
                break;
            }
            case 98: {
                if (!string2.equals((Object)"b")) break;
                n9 = 0;
            }
        }
        switch (n9) {
            default: {
                return false;
            }
            case 0: 
            case 1: 
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 6: 
            case 7: 
        }
        return true;
    }

    public static a l(CharSequence charSequence) {
        e e8 = new e();
        e8.c = charSequence;
        return e8.g().a();
    }

    public static k1.d m(z z8, List list) {
        String string2 = z8.r();
        if (string2 == null) {
            return null;
        }
        Pattern pattern = a;
        Object object = pattern.matcher((CharSequence)string2);
        if (object.matches()) {
            return e.n(null, (Matcher)object, z8, list);
        }
        object = z8.r();
        if (object == null) {
            return null;
        }
        if ((pattern = pattern.matcher((CharSequence)object)).matches()) {
            return e.n(string2.trim(), (Matcher)pattern, z8, list);
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static k1.d n(String string2, Matcher matcher, z z8, List list) {
        e e8 = new e();
        try {
            e8.a = h.d((String)g0.a.e(matcher.group(1)));
            e8.b = h.d((String)g0.a.e(matcher.group(2)));
        }
        catch (NumberFormatException numberFormatException) {}
        e.p((String)g0.a.e(matcher.group(3)), e8);
        matcher = new StringBuilder();
        do {
            String string3;
            if (TextUtils.isEmpty((CharSequence)(string3 = z8.r()))) {
                e8.c = e.q(string2, matcher.toString(), list);
                return e8.a();
            }
            if (matcher.length() > 0) {
                matcher.append("\n");
            }
            matcher.append(string3.trim());
        } while (true);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Skipping cue with bad header: ");
        stringBuilder.append(matcher.group());
        o.h("WebvttCueParser", stringBuilder.toString());
        return null;
    }

    public static a.b o(String string2) {
        e e8 = new e();
        e.p(string2, e8);
        return e8.g();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void p(String string2, e e8) {
        string2 = b.matcher((CharSequence)string2);
        while (string2.find()) {
            String string3 = (String)g0.a.e(string2.group(1));
            String string4 = (String)g0.a.e(string2.group(2));
            try {
                if ("line".equals((Object)string3)) {
                    e.s(string4, e8);
                    continue;
                }
                if ("align".equals((Object)string3)) {
                    e8.d = e.v(string4);
                    continue;
                }
                if ("position".equals((Object)string3)) {
                    e.u(string4, e8);
                    continue;
                }
                if ("size".equals((Object)string3)) {
                    e8.j = h.c(string4);
                    continue;
                }
                if ("vertical".equals((Object)string3)) {
                    e8.k = e.w(string4);
                    continue;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unknown cue setting ");
                stringBuilder.append(string3);
                stringBuilder.append(":");
                stringBuilder.append(string4);
                o.h("WebvttCueParser", stringBuilder.toString());
                continue;
            }
            catch (NumberFormatException numberFormatException) {}
            string3 = new StringBuilder();
            string3.append("Skipping bad cue setting: ");
            string3.append(string2.group());
            o.h("WebvttCueParser", string3.toString());
        }
        return;
    }

    public static SpannedString q(String string2, String string3, List list) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int n8 = 0;
        block0 : while (n8 < string3.length()) {
            int n9;
            int n10;
            char c8 = string3.charAt(n8);
            if (c8 != '&') {
                if (c8 != '<') {
                    spannableStringBuilder.append(c8);
                    ++n8;
                    continue;
                }
                n9 = n8 + 1;
                if (n9 >= string3.length()) {
                    n8 = n9;
                    continue;
                }
                n10 = string3.charAt(n9);
                int n11 = 1;
                n10 = n10 == 47 ? 1 : 0;
                int n12 = e.f(string3, n9);
                int n13 = n12 - 2;
                n9 = string3.charAt(n13) == '/' ? 1 : 0;
                if (n10 != 0) {
                    n11 = 2;
                }
                if (n9 == 0) {
                    n13 = n12 - 1;
                }
                Object object = string3.substring(n8 + n11, n13);
                if (object.trim().isEmpty()) {
                    n8 = n12;
                    continue;
                }
                String string4 = e.j((String)object);
                if (!e.k(string4)) {
                    n8 = n12;
                    continue;
                }
                if (n10 != 0) {
                    do {
                        if (arrayDeque.isEmpty()) {
                            n8 = n12;
                            continue block0;
                        }
                        object = (c)arrayDeque.pop();
                        e.d(string2, (c)object, (List)arrayList, spannableStringBuilder, list);
                        if (!arrayDeque.isEmpty()) {
                            arrayList.add((Object)new b((c)object, spannableStringBuilder.length(), null));
                            continue;
                        }
                        arrayList.clear();
                    } while (!object.a.equals((Object)string4));
                    n8 = n12;
                    continue;
                }
                n8 = n12;
                if (n9 != 0) continue;
                arrayDeque.push((Object)c.a((String)object, spannableStringBuilder.length()));
                n8 = n12;
                continue;
            }
            n10 = n8 + 1;
            n8 = string3.indexOf(59, n10);
            n9 = string3.indexOf(32, n10);
            if (n8 == -1) {
                n8 = n9;
            } else if (n9 != -1) {
                n8 = Math.min((int)n8, (int)n9);
            }
            if (n8 != -1) {
                e.b(string3.substring(n10, n8), spannableStringBuilder);
                if (n8 == n9) {
                    spannableStringBuilder.append((CharSequence)" ");
                }
                ++n8;
                continue;
            }
            spannableStringBuilder.append(c8);
            n8 = n10;
        }
        while (!arrayDeque.isEmpty()) {
            e.d(string2, (c)arrayDeque.pop(), (List)arrayList, spannableStringBuilder, list);
        }
        e.d(string2, c.b(), Collections.emptyList(), spannableStringBuilder, list);
        return SpannedString.valueOf((CharSequence)spannableStringBuilder);
    }

    public static int r(String string2) {
        string2.hashCode();
        int n8 = string2.hashCode();
        int n9 = -1;
        switch (n8) {
            default: {
                break;
            }
            case 109757538: {
                if (!string2.equals((Object)"start")) break;
                n9 = 3;
                break;
            }
            case 100571: {
                if (!string2.equals((Object)"end")) break;
                n9 = 2;
                break;
            }
            case -1074341483: {
                if (!string2.equals((Object)"middle")) break;
                n9 = 1;
                break;
            }
            case -1364013995: {
                if (!string2.equals((Object)"center")) break;
                n9 = 0;
            }
        }
        switch (n9) {
            default: {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Invalid anchor value: ");
                stringBuilder.append(string2);
                o.h("WebvttCueParser", stringBuilder.toString());
                return Integer.MIN_VALUE;
            }
            case 3: {
                return 0;
            }
            case 2: {
                return 2;
            }
            case 0: 
            case 1: 
        }
        return 1;
    }

    public static void s(String string2, e e8) {
        int n8 = string2.indexOf(44);
        String string3 = string2;
        if (n8 != -1) {
            e8.g = e.r(string2.substring(n8 + 1));
            string3 = string2.substring(0, n8);
        }
        if (string3.endsWith("%")) {
            e8.e = h.c(string3);
            e8.f = 0;
            return;
        }
        e8.e = Integer.parseInt((String)string3);
        e8.f = 1;
    }

    public static int t(String string2) {
        string2.hashCode();
        int n8 = string2.hashCode();
        int n9 = -1;
        switch (n8) {
            default: {
                break;
            }
            case 109757538: {
                if (!string2.equals((Object)"start")) break;
                n9 = 5;
                break;
            }
            case 100571: {
                if (!string2.equals((Object)"end")) break;
                n9 = 4;
                break;
            }
            case -1074341483: {
                if (!string2.equals((Object)"middle")) break;
                n9 = 3;
                break;
            }
            case -1276788989: {
                if (!string2.equals((Object)"line-right")) break;
                n9 = 2;
                break;
            }
            case -1364013995: {
                if (!string2.equals((Object)"center")) break;
                n9 = 1;
                break;
            }
            case -1842484672: {
                if (!string2.equals((Object)"line-left")) break;
                n9 = 0;
            }
        }
        switch (n9) {
            default: {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Invalid anchor value: ");
                stringBuilder.append(string2);
                o.h("WebvttCueParser", stringBuilder.toString());
                return Integer.MIN_VALUE;
            }
            case 2: 
            case 4: {
                return 2;
            }
            case 1: 
            case 3: {
                return 1;
            }
            case 0: 
            case 5: 
        }
        return 0;
    }

    public static void u(String string2, e e8) {
        int n8 = string2.indexOf(44);
        String string3 = string2;
        if (n8 != -1) {
            e8.i = e.t(string2.substring(n8 + 1));
            string3 = string2.substring(0, n8);
        }
        e8.h = h.c(string3);
    }

    public static int v(String string2) {
        string2.hashCode();
        int n8 = string2.hashCode();
        int n9 = -1;
        switch (n8) {
            default: {
                break;
            }
            case 109757538: {
                if (!string2.equals((Object)"start")) break;
                n9 = 5;
                break;
            }
            case 108511772: {
                if (!string2.equals((Object)"right")) break;
                n9 = 4;
                break;
            }
            case 3317767: {
                if (!string2.equals((Object)"left")) break;
                n9 = 3;
                break;
            }
            case 100571: {
                if (!string2.equals((Object)"end")) break;
                n9 = 2;
                break;
            }
            case -1074341483: {
                if (!string2.equals((Object)"middle")) break;
                n9 = 1;
                break;
            }
            case -1364013995: {
                if (!string2.equals((Object)"center")) break;
                n9 = 0;
            }
        }
        switch (n9) {
            default: {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Invalid alignment value: ");
                stringBuilder.append(string2);
                o.h("WebvttCueParser", stringBuilder.toString());
                return 2;
            }
            case 5: {
                return 1;
            }
            case 4: {
                return 5;
            }
            case 3: {
                return 4;
            }
            case 2: {
                return 3;
            }
            case 0: 
            case 1: 
        }
        return 2;
    }

    public static int w(String string2) {
        string2.hashCode();
        if (!string2.equals((Object)"lr")) {
            if (!string2.equals((Object)"rl")) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Invalid 'vertical' value: ");
                stringBuilder.append(string2);
                o.h("WebvttCueParser", stringBuilder.toString());
                return Integer.MIN_VALUE;
            }
            return 1;
        }
        return 2;
    }

    public static class b {
        public static final Comparator c = new f();
        public final c a;
        public final int b;

        public b(c c8, int n8) {
            this.a = c8;
            this.b = n8;
        }

        public /* synthetic */ b(c c8, int n8,  a8) {
            this(c8, n8);
        }

        public static /* synthetic */ int a(b b8, b b9) {
            return b.e(b8, b9);
        }

        public static /* synthetic */ int e(b b8, b b9) {
            return Integer.compare((int)b8.a.b, (int)b9.a.b);
        }
    }

    public static final class c {
        public final String a;
        public final int b;
        public final String c;
        public final Set d;

        public c(String string2, int n8, String string3, Set set) {
            this.b = n8;
            this.a = string2;
            this.c = string3;
            this.d = set;
        }

        public static c a(String string2, int n8) {
            Object object = string2.trim();
            boolean bl = object.isEmpty();
            int n9 = 1;
            g0.a.a(bl ^ true);
            int n10 = object.indexOf(" ");
            if (n10 == -1) {
                string2 = "";
            } else {
                string2 = object.substring(n10).trim();
                object = object.substring(0, n10);
            }
            object = M.b1((String)object, "\\.");
            String string3 = object[0];
            HashSet hashSet = new HashSet();
            while (n9 < object.length) {
                hashSet.add(object[n9]);
                ++n9;
            }
            return new c(string3, n8, string2, (Set)hashSet);
        }

        public static c b() {
            return new c("", 0, "", Collections.emptySet());
        }
    }

    public static final class d
    implements Comparable {
        public final int o;
        public final k1.c p;

        public d(int n8, k1.c c8) {
            this.o = n8;
            this.p = c8;
        }

        public int c(d d8) {
            return Integer.compare((int)this.o, (int)d8.o);
        }
    }

    public static final class e {
        public long a = 0L;
        public long b = 0L;
        public CharSequence c;
        public int d = 2;
        public float e = -3.4028235E38f;
        public int f = 1;
        public int g = 0;
        public float h = -3.4028235E38f;
        public int i = Integer.MIN_VALUE;
        public float j = 1.0f;
        public int k = Integer.MIN_VALUE;

        public static float b(float f8, int n8) {
            float f9 = f8 FCMPL -3.4028235E38f;
            if (f9 != false && n8 == 0 && (f8 < 0.0f || f8 > 1.0f)) {
                return 1.0f;
            }
            if (f9 != false) {
                return f8;
            }
            if (n8 == 0) {
                return 1.0f;
            }
            return -3.4028235E38f;
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        public static Layout.Alignment c(int n8) {
            if (n8 == 1) return Layout.Alignment.ALIGN_NORMAL;
            if (n8 == 2) return Layout.Alignment.ALIGN_CENTER;
            if (n8 == 3) return Layout.Alignment.ALIGN_OPPOSITE;
            if (n8 == 4) return Layout.Alignment.ALIGN_NORMAL;
            if (n8 == 5) return Layout.Alignment.ALIGN_OPPOSITE;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unknown textAlignment: ");
            stringBuilder.append(n8);
            o.h("WebvttCueParser", stringBuilder.toString());
            return null;
        }

        public static float d(int n8, float f8) {
            if (n8 != 0) {
                if (n8 != 1) {
                    if (n8 == 2) {
                        return f8;
                    }
                    throw new IllegalStateException(String.valueOf((int)n8));
                }
                if (f8 <= 0.5f) {
                    return f8 * 2.0f;
                }
                return (1.0f - f8) * 2.0f;
            }
            return 1.0f - f8;
        }

        public static float e(int n8) {
            if (n8 != 4) {
                if (n8 != 5) {
                    return 0.5f;
                }
                return 1.0f;
            }
            return 0.0f;
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        public static int f(int n8) {
            if (n8 == 1) return 0;
            if (n8 == 3) return 2;
            if (n8 == 4) return 0;
            if (n8 == 5) return 2;
            return 1;
        }

        public k1.d a() {
            return new k1.d(this.g().a(), this.a, this.b);
        }

        public a.b g() {
            float f8 = this.h;
            if (f8 == -3.4028235E38f) {
                f8 = e.e(this.d);
            }
            int n8 = this.i;
            if (n8 == Integer.MIN_VALUE) {
                n8 = e.f(this.d);
            }
            a.b b8 = new a.b().p(e.c(this.d)).h(e.b(this.e, this.f), this.f).i(this.g).k(f8).l(n8).n(Math.min((float)this.j, (float)e.d(n8, f8))).r(this.k);
            CharSequence charSequence = this.c;
            if (charSequence != null) {
                b8.o(charSequence);
            }
            return b8;
        }
    }

}

