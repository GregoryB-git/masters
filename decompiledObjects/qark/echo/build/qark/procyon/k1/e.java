// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package k1;

import android.text.Layout$Alignment;
import java.util.HashSet;
import java.util.ArrayDeque;
import android.text.SpannedString;
import android.text.TextUtils;
import java.util.regex.Matcher;
import g0.z;
import g0.M;
import g0.a;
import f0.d;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.TypefaceSpan;
import android.text.style.StrikethroughSpan;
import android.text.Spannable;
import f0.f;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.Comparator;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import g0.o;
import java.util.Iterator;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import java.util.Set;
import android.text.SpannableStringBuilder;
import java.util.Collections;
import android.graphics.Color;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public abstract class e
{
    public static final Pattern a;
    public static final Pattern b;
    public static final Map c;
    public static final Map d;
    
    static {
        a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");
        b = Pattern.compile("(\\S+?):(\\S+)");
        final HashMap<String, Integer> m = new HashMap<String, Integer>();
        m.put("white", Color.rgb(255, 255, 255));
        m.put("lime", Color.rgb(0, 255, 0));
        m.put("cyan", Color.rgb(0, 255, 255));
        m.put("red", Color.rgb(255, 0, 0));
        m.put("yellow", Color.rgb(255, 255, 0));
        m.put("magenta", Color.rgb(255, 0, 255));
        m.put("blue", Color.rgb(0, 0, 255));
        m.put("black", Color.rgb(0, 0, 0));
        c = Collections.unmodifiableMap((Map<?, ?>)m);
        final HashMap<String, Integer> i = new HashMap<String, Integer>();
        i.put("bg_white", Color.rgb(255, 255, 255));
        i.put("bg_lime", Color.rgb(0, 255, 0));
        i.put("bg_cyan", Color.rgb(0, 255, 255));
        i.put("bg_red", Color.rgb(255, 0, 0));
        i.put("bg_yellow", Color.rgb(255, 255, 0));
        i.put("bg_magenta", Color.rgb(255, 0, 255));
        i.put("bg_blue", Color.rgb(0, 0, 255));
        i.put("bg_black", Color.rgb(0, 0, 0));
        d = Collections.unmodifiableMap((Map<?, ?>)i);
    }
    
    public static void a(final SpannableStringBuilder spannableStringBuilder, final Set set, final int n, final int n2) {
        for (final String s : set) {
            final Map c = e.c;
            Object o;
            if (c.containsKey(s)) {
                o = new ForegroundColorSpan((int)c.get(s));
            }
            else {
                final Map d = e.d;
                if (!d.containsKey(s)) {
                    continue;
                }
                o = new BackgroundColorSpan((int)d.get(s));
            }
            spannableStringBuilder.setSpan(o, n, n2, 33);
        }
    }
    
    public static void b(final String str, final SpannableStringBuilder spannableStringBuilder) {
        str.hashCode();
        final int hashCode = str.hashCode();
        int n = -1;
        switch (hashCode) {
            case 3374865: {
                if (!str.equals("nbsp")) {
                    break;
                }
                n = 3;
                break;
            }
            case 96708: {
                if (!str.equals("amp")) {
                    break;
                }
                n = 2;
                break;
            }
            case 3464: {
                if (!str.equals("lt")) {
                    break;
                }
                n = 1;
                break;
            }
            case 3309: {
                if (!str.equals("gt")) {
                    break;
                }
                n = 0;
                break;
            }
        }
        char c = '\0';
        switch (n) {
            default: {
                final StringBuilder sb = new StringBuilder();
                sb.append("ignoring unsupported entity: '&");
                sb.append(str);
                sb.append(";'");
                o.h("WebvttCueParser", sb.toString());
                return;
            }
            case 3: {
                c = ' ';
                break;
            }
            case 2: {
                c = '&';
                break;
            }
            case 1: {
                c = '<';
                break;
            }
            case 0: {
                c = '>';
                break;
            }
        }
        spannableStringBuilder.append(c);
    }
    
    public static void c(final SpannableStringBuilder spannableStringBuilder, final String s, final c c, final List list, final List list2) {
        final int i = i(list2, s, c);
        final ArrayList list3 = new ArrayList<b>(list.size());
        list3.addAll((Collection<?>)list);
        Collections.sort((List<Object>)list3, k1.e.b.b());
        int b = c.b;
        int j = 0;
        int n = 0;
        while (j < list3.size()) {
            if ("rt".equals(k1.e.b.c((b)list3.get(j)).a)) {
                final b b2 = list3.get(j);
                final int g = g(i(list2, s, k1.e.b.c(b2)), i, 1);
                final int n2 = k1.e.b.c(b2).b - n;
                final int n3 = k1.e.b.d(b2) - n;
                final CharSequence subSequence = spannableStringBuilder.subSequence(n2, n3);
                spannableStringBuilder.delete(n2, n3);
                spannableStringBuilder.setSpan((Object)new e(subSequence.toString(), g), b, n2, 33);
                n += subSequence.length();
                b = n2;
            }
            ++j;
        }
    }
    
    public static void d(final String s, final c c, final List list, final SpannableStringBuilder spannableStringBuilder, final List list2) {
        final int b = c.b;
        final int length = spannableStringBuilder.length();
        final String a = c.a;
        a.hashCode();
        final int hashCode = a.hashCode();
        final int n = 0;
        int n2 = -1;
        switch (hashCode) {
            case 3511770: {
                if (!a.equals("ruby")) {
                    break;
                }
                n2 = 7;
                break;
            }
            case 3314158: {
                if (!a.equals("lang")) {
                    break;
                }
                n2 = 6;
                break;
            }
            case 118: {
                if (!a.equals("v")) {
                    break;
                }
                n2 = 5;
                break;
            }
            case 117: {
                if (!a.equals("u")) {
                    break;
                }
                n2 = 4;
                break;
            }
            case 105: {
                if (!a.equals("i")) {
                    break;
                }
                n2 = 3;
                break;
            }
            case 99: {
                if (!a.equals("c")) {
                    break;
                }
                n2 = 2;
                break;
            }
            case 98: {
                if (!a.equals("b")) {
                    break;
                }
                n2 = 1;
                break;
            }
            case 0: {
                if (!a.equals("")) {
                    break;
                }
                n2 = 0;
                break;
            }
        }
        while (true) {
            Object o = null;
            switch (n2) {
                default: {
                    return;
                }
                case 4: {
                    o = new UnderlineSpan();
                    break;
                }
                case 3: {
                    o = new StyleSpan(2);
                    break;
                }
                case 1: {
                    o = new StyleSpan(1);
                    break;
                }
                case 0:
                case 5:
                case 6: {
                    final List h = h(list2, s, c);
                    for (int i = n; i < h.size(); ++i) {
                        e(spannableStringBuilder, h.get(i).p, b, length);
                    }
                    return;
                }
                case 7: {
                    c(spannableStringBuilder, s, c, list, list2);
                    continue;
                }
                case 2: {
                    a(spannableStringBuilder, c.d, b, length);
                    continue;
                }
            }
            spannableStringBuilder.setSpan(o, b, length, 33);
            continue;
        }
    }
    
    public static void e(final SpannableStringBuilder spannableStringBuilder, final k1.c c, final int n, final int n2) {
        if (c == null) {
            return;
        }
        if (c.i() != -1) {
            f.b((Spannable)spannableStringBuilder, new StyleSpan(c.i()), n, n2, 33);
        }
        if (c.l()) {
            spannableStringBuilder.setSpan((Object)new StrikethroughSpan(), n, n2, 33);
        }
        if (c.m()) {
            spannableStringBuilder.setSpan((Object)new UnderlineSpan(), n, n2, 33);
        }
        if (c.k()) {
            f.b((Spannable)spannableStringBuilder, new ForegroundColorSpan(c.c()), n, n2, 33);
        }
        if (c.j()) {
            f.b((Spannable)spannableStringBuilder, new BackgroundColorSpan(c.a()), n, n2, 33);
        }
        if (c.d() != null) {
            f.b((Spannable)spannableStringBuilder, new TypefaceSpan(c.d()), n, n2, 33);
        }
        final int f = c.f();
        Label_0245: {
            Object o;
            if (f != 1) {
                if (f != 2) {
                    if (f != 3) {
                        break Label_0245;
                    }
                    o = new RelativeSizeSpan(c.e() / 100.0f);
                }
                else {
                    o = new RelativeSizeSpan(c.e());
                }
            }
            else {
                o = new AbsoluteSizeSpan((int)c.e(), true);
            }
            f0.f.b((Spannable)spannableStringBuilder, o, n, n2, 33);
        }
        if (c.b()) {
            spannableStringBuilder.setSpan((Object)new f0.d(), n, n2, 33);
        }
    }
    
    public static int f(final String s, int index) {
        index = s.indexOf(62, index);
        if (index == -1) {
            return s.length();
        }
        return index + 1;
    }
    
    public static int g(final int n, final int n2, final int n3) {
        if (n != -1) {
            return n;
        }
        if (n2 != -1) {
            return n2;
        }
        if (n3 != -1) {
            return n3;
        }
        throw new IllegalArgumentException();
    }
    
    public static List h(final List list, final String s, final c c) {
        final ArrayList<d> list2 = (ArrayList<d>)new ArrayList<Comparable>();
        for (int i = 0; i < list.size(); ++i) {
            final k1.c c2 = list.get(i);
            final int h = c2.h(s, c.a, c.d, c.c);
            if (h > 0) {
                list2.add(new d(h, c2));
            }
        }
        Collections.sort((List<Comparable>)list2);
        return list2;
    }
    
    public static int i(List h, final String s, final c c) {
        h = h(h, s, c);
        for (int i = 0; i < h.size(); ++i) {
            final k1.c p3 = h.get(i).p;
            if (p3.g() != -1) {
                return p3.g();
            }
        }
        return -1;
    }
    
    public static String j(String trim) {
        trim = trim.trim();
        g0.a.a(trim.isEmpty() ^ true);
        return M.c1(trim, "[ \\.]")[0];
    }
    
    public static boolean k(final String s) {
        s.hashCode();
        final int hashCode = s.hashCode();
        int n = -1;
        switch (hashCode) {
            case 3511770: {
                if (!s.equals("ruby")) {
                    break;
                }
                n = 7;
                break;
            }
            case 3314158: {
                if (!s.equals("lang")) {
                    break;
                }
                n = 6;
                break;
            }
            case 3650: {
                if (!s.equals("rt")) {
                    break;
                }
                n = 5;
                break;
            }
            case 118: {
                if (!s.equals("v")) {
                    break;
                }
                n = 4;
                break;
            }
            case 117: {
                if (!s.equals("u")) {
                    break;
                }
                n = 3;
                break;
            }
            case 105: {
                if (!s.equals("i")) {
                    break;
                }
                n = 2;
                break;
            }
            case 99: {
                if (!s.equals("c")) {
                    break;
                }
                n = 1;
                break;
            }
            case 98: {
                if (!s.equals("b")) {
                    break;
                }
                n = 0;
                break;
            }
        }
        switch (n) {
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
            case 7: {
                return true;
            }
        }
    }
    
    public static f0.a l(final CharSequence c) {
        final e e = new e();
        e.c = c;
        return e.g().a();
    }
    
    public static k1.d m(final z z, final List list) {
        final String r = z.r();
        if (r == null) {
            return null;
        }
        final Pattern a = e.a;
        final Matcher matcher = a.matcher(r);
        if (matcher.matches()) {
            return n(null, matcher, z, list);
        }
        final String r2 = z.r();
        if (r2 == null) {
            return null;
        }
        final Matcher matcher2 = a.matcher(r2);
        if (matcher2.matches()) {
            return n(r.trim(), matcher2, z, list);
        }
        return null;
    }
    
    public static k1.d n(final String s, Matcher matcher, final z z, final List list) {
        final e e = new e();
        while (true) {
            try {
                e.a = h.d((String)g0.a.e(matcher.group(1)));
                e.b = h.d((String)g0.a.e(matcher.group(2)));
                p((String)g0.a.e(matcher.group(3)), e);
                matcher = (Matcher)new StringBuilder();
                while (true) {
                    final String r = z.r();
                    if (TextUtils.isEmpty((CharSequence)r)) {
                        break;
                    }
                    if (((StringBuilder)matcher).length() > 0) {
                        ((StringBuilder)matcher).append("\n");
                    }
                    ((StringBuilder)matcher).append(r.trim());
                }
                e.c = (CharSequence)q(s, ((StringBuilder)matcher).toString(), list);
                return e.a();
                final StringBuilder sb = new StringBuilder();
                sb.append("Skipping cue with bad header: ");
                sb.append(matcher.group());
                o.h("WebvttCueParser", sb.toString());
                return null;
            }
            catch (NumberFormatException ex) {
                continue;
            }
            break;
        }
    }
    
    public static f0.a.b o(final String s) {
        final e e = new e();
        p(s, e);
        return e.g();
    }
    
    public static void p(String matcher, final e e) {
        matcher = (String)e.b.matcher(matcher);
    Label_0192_Outer:
        while (true) {
            if (((Matcher)matcher).find()) {
                final String s = (String)g0.a.e(((Matcher)matcher).group(1));
                final String str = (String)g0.a.e(((Matcher)matcher).group(2));
                while (true) {
                    try {
                        if ("line".equals(s)) {
                            s(str, e);
                            continue Label_0192_Outer;
                        }
                        if ("align".equals(s)) {
                            e.d = v(str);
                            continue Label_0192_Outer;
                        }
                        if ("position".equals(s)) {
                            u(str, e);
                            continue Label_0192_Outer;
                        }
                        if ("size".equals(s)) {
                            e.j = h.c(str);
                            continue Label_0192_Outer;
                        }
                        if ("vertical".equals(s)) {
                            e.k = w(str);
                            continue Label_0192_Outer;
                        }
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Unknown cue setting ");
                        sb.append(s);
                        sb.append(":");
                        sb.append(str);
                        o.h("WebvttCueParser", sb.toString());
                        continue Label_0192_Outer;
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append("Skipping bad cue setting: ");
                        sb2.append(((Matcher)matcher).group());
                        o.h("WebvttCueParser", sb2.toString());
                        continue Label_0192_Outer;
                    }
                    catch (NumberFormatException ex) {}
                    continue;
                }
            }
        }
    }
    
    public static SpannedString q(final String s, final String s2, final List list) {
        final SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        final ArrayDeque<c> arrayDeque = new ArrayDeque<c>();
        final ArrayList<b> list2 = new ArrayList<b>();
        int i = 0;
        while (i < s2.length()) {
            final char char1 = s2.charAt(i);
            if (char1 != '&') {
                if (char1 != '<') {
                    spannableStringBuilder.append(char1);
                    ++i;
                }
                else {
                    final int index = i + 1;
                    if (index >= s2.length()) {
                        i = index;
                    }
                    else {
                        final char char2 = s2.charAt(index);
                        int n = 1;
                        final boolean b = char2 == '/';
                        final int f = f(s2, index);
                        int n2 = f - 2;
                        final boolean b2 = s2.charAt(n2) == '/';
                        if (b) {
                            n = 2;
                        }
                        if (!b2) {
                            n2 = f - 1;
                        }
                        final String substring = s2.substring(i + n, n2);
                        if (substring.trim().isEmpty()) {
                            i = f;
                        }
                        else {
                            final String j = j(substring);
                            if (!k(j)) {
                                i = f;
                            }
                            else if (b) {
                                while (!arrayDeque.isEmpty()) {
                                    final c c = arrayDeque.pop();
                                    d(s, c, list2, spannableStringBuilder, list);
                                    if (!arrayDeque.isEmpty()) {
                                        list2.add(new b(c, spannableStringBuilder.length(), null));
                                    }
                                    else {
                                        list2.clear();
                                    }
                                    if (c.a.equals(j)) {
                                        i = f;
                                        continue Label_0229;
                                    }
                                }
                                i = f;
                            }
                            else {
                                i = f;
                                if (b2) {
                                    continue;
                                }
                                arrayDeque.push(k1.e.c.a(substring, spannableStringBuilder.length()));
                                i = f;
                            }
                        }
                    }
                    Label_0229:;
                }
            }
            else {
                final int beginIndex = i + 1;
                int n3 = s2.indexOf(59, beginIndex);
                final int index2 = s2.indexOf(32, beginIndex);
                if (n3 == -1) {
                    n3 = index2;
                }
                else if (index2 != -1) {
                    n3 = Math.min(n3, index2);
                }
                if (n3 != -1) {
                    b(s2.substring(beginIndex, n3), spannableStringBuilder);
                    if (n3 == index2) {
                        spannableStringBuilder.append((CharSequence)" ");
                    }
                    i = n3 + 1;
                }
                else {
                    spannableStringBuilder.append(char1);
                    i = beginIndex;
                }
            }
        }
        while (!arrayDeque.isEmpty()) {
            d(s, arrayDeque.pop(), list2, spannableStringBuilder, list);
        }
        d(s, k1.e.c.b(), Collections.emptyList(), spannableStringBuilder, list);
        return SpannedString.valueOf((CharSequence)spannableStringBuilder);
    }
    
    public static int r(final String str) {
        str.hashCode();
        final int hashCode = str.hashCode();
        int n = -1;
        switch (hashCode) {
            case 109757538: {
                if (!str.equals("start")) {
                    break;
                }
                n = 3;
                break;
            }
            case 100571: {
                if (!str.equals("end")) {
                    break;
                }
                n = 2;
                break;
            }
            case -1074341483: {
                if (!str.equals("middle")) {
                    break;
                }
                n = 1;
                break;
            }
            case -1364013995: {
                if (!str.equals("center")) {
                    break;
                }
                n = 0;
                break;
            }
        }
        switch (n) {
            default: {
                final StringBuilder sb = new StringBuilder();
                sb.append("Invalid anchor value: ");
                sb.append(str);
                o.h("WebvttCueParser", sb.toString());
                return Integer.MIN_VALUE;
            }
            case 3: {
                return 0;
            }
            case 2: {
                return 2;
            }
            case 0:
            case 1: {
                return 1;
            }
        }
    }
    
    public static void s(final String s, final e e) {
        final int index = s.indexOf(44);
        String substring = s;
        if (index != -1) {
            e.g = r(s.substring(index + 1));
            substring = s.substring(0, index);
        }
        if (substring.endsWith("%")) {
            e.e = h.c(substring);
            e.f = 0;
            return;
        }
        e.e = (float)Integer.parseInt(substring);
        e.f = 1;
    }
    
    public static int t(final String str) {
        str.hashCode();
        final int hashCode = str.hashCode();
        int n = -1;
        switch (hashCode) {
            case 109757538: {
                if (!str.equals("start")) {
                    break;
                }
                n = 5;
                break;
            }
            case 100571: {
                if (!str.equals("end")) {
                    break;
                }
                n = 4;
                break;
            }
            case -1074341483: {
                if (!str.equals("middle")) {
                    break;
                }
                n = 3;
                break;
            }
            case -1276788989: {
                if (!str.equals("line-right")) {
                    break;
                }
                n = 2;
                break;
            }
            case -1364013995: {
                if (!str.equals("center")) {
                    break;
                }
                n = 1;
                break;
            }
            case -1842484672: {
                if (!str.equals("line-left")) {
                    break;
                }
                n = 0;
                break;
            }
        }
        switch (n) {
            default: {
                final StringBuilder sb = new StringBuilder();
                sb.append("Invalid anchor value: ");
                sb.append(str);
                o.h("WebvttCueParser", sb.toString());
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
            case 5: {
                return 0;
            }
        }
    }
    
    public static void u(final String s, final e e) {
        final int index = s.indexOf(44);
        String substring = s;
        if (index != -1) {
            e.i = t(s.substring(index + 1));
            substring = s.substring(0, index);
        }
        e.h = h.c(substring);
    }
    
    public static int v(final String str) {
        str.hashCode();
        final int hashCode = str.hashCode();
        int n = -1;
        switch (hashCode) {
            case 109757538: {
                if (!str.equals("start")) {
                    break;
                }
                n = 5;
                break;
            }
            case 108511772: {
                if (!str.equals("right")) {
                    break;
                }
                n = 4;
                break;
            }
            case 3317767: {
                if (!str.equals("left")) {
                    break;
                }
                n = 3;
                break;
            }
            case 100571: {
                if (!str.equals("end")) {
                    break;
                }
                n = 2;
                break;
            }
            case -1074341483: {
                if (!str.equals("middle")) {
                    break;
                }
                n = 1;
                break;
            }
            case -1364013995: {
                if (!str.equals("center")) {
                    break;
                }
                n = 0;
                break;
            }
        }
        switch (n) {
            default: {
                final StringBuilder sb = new StringBuilder();
                sb.append("Invalid alignment value: ");
                sb.append(str);
                o.h("WebvttCueParser", sb.toString());
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
            case 1: {
                return 2;
            }
        }
    }
    
    public static int w(final String str) {
        str.hashCode();
        if (str.equals("lr")) {
            return 2;
        }
        if (!str.equals("rl")) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Invalid 'vertical' value: ");
            sb.append(str);
            o.h("WebvttCueParser", sb.toString());
            return Integer.MIN_VALUE;
        }
        return 1;
    }
    
    public static class b
    {
        public static final Comparator c;
        public final c a;
        public final int b;
        
        static {
            c = new k1.f();
        }
        
        public b(final c a, final int b) {
            this.a = a;
            this.b = b;
        }
        
        public static /* synthetic */ Comparator b() {
            return b.c;
        }
        
        public static /* synthetic */ c c(final b b) {
            return b.a;
        }
        
        public static /* synthetic */ int d(final b b) {
            return b.b;
        }
    }
    
    public static final class c
    {
        public final String a;
        public final int b;
        public final String c;
        public final Set d;
        
        public c(final String a, final int b, final String c, final Set d) {
            this.b = b;
            this.a = a;
            this.c = c;
            this.d = d;
        }
        
        public static c a(String trim, final int n) {
            String s = trim.trim();
            final boolean empty = s.isEmpty();
            int i = 1;
            g0.a.a(empty ^ true);
            final int index = s.indexOf(" ");
            if (index == -1) {
                trim = "";
            }
            else {
                trim = s.substring(index).trim();
                s = s.substring(0, index);
            }
            final String[] b1 = M.b1(s, "\\.");
            final String s2 = b1[0];
            final HashSet<String> set = new HashSet<String>();
            while (i < b1.length) {
                set.add(b1[i]);
                ++i;
            }
            return new c(s2, n, trim, set);
        }
        
        public static c b() {
            return new c("", 0, "", Collections.emptySet());
        }
    }
    
    public static final class d implements Comparable
    {
        public final int o;
        public final k1.c p;
        
        public d(final int o, final k1.c p2) {
            this.o = o;
            this.p = p2;
        }
        
        public int c(final d d) {
            return Integer.compare(this.o, d.o);
        }
    }
    
    public static final class e
    {
        public long a;
        public long b;
        public CharSequence c;
        public int d;
        public float e;
        public int f;
        public int g;
        public float h;
        public int i;
        public float j;
        public int k;
        
        public e() {
            this.a = 0L;
            this.b = 0L;
            this.d = 2;
            this.e = -3.4028235E38f;
            this.f = 1;
            this.g = 0;
            this.h = -3.4028235E38f;
            this.i = Integer.MIN_VALUE;
            this.j = 1.0f;
            this.k = Integer.MIN_VALUE;
        }
        
        public static float b(final float n, final int n2) {
            final float n3 = fcmpl(n, -3.4028235E38f);
            if (n3 != 0 && n2 == 0 && (n < 0.0f || n > 1.0f)) {
                return 1.0f;
            }
            if (n3 != 0) {
                return n;
            }
            if (n2 == 0) {
                return 1.0f;
            }
            return -3.4028235E38f;
        }
        
        public static Layout$Alignment c(final int i) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            return Layout$Alignment.ALIGN_NORMAL;
                        }
                        if (i != 5) {
                            final StringBuilder sb = new StringBuilder();
                            sb.append("Unknown textAlignment: ");
                            sb.append(i);
                            o.h("WebvttCueParser", sb.toString());
                            return null;
                        }
                    }
                    return Layout$Alignment.ALIGN_OPPOSITE;
                }
                return Layout$Alignment.ALIGN_CENTER;
            }
            return Layout$Alignment.ALIGN_NORMAL;
        }
        
        public static float d(final int i, final float n) {
            if (i == 0) {
                return 1.0f - n;
            }
            if (i != 1) {
                if (i == 2) {
                    return n;
                }
                throw new IllegalStateException(String.valueOf(i));
            }
            else {
                if (n <= 0.5f) {
                    return n * 2.0f;
                }
                return (1.0f - n) * 2.0f;
            }
        }
        
        public static float e(final int n) {
            if (n == 4) {
                return 0.0f;
            }
            if (n != 5) {
                return 0.5f;
            }
            return 1.0f;
        }
        
        public static int f(final int n) {
            if (n != 1) {
                if (n != 3) {
                    if (n == 4) {
                        return 0;
                    }
                    if (n != 5) {
                        return 1;
                    }
                }
                return 2;
            }
            return 0;
        }
        
        public k1.d a() {
            return new k1.d(this.g().a(), this.a, this.b);
        }
        
        public f0.a.b g() {
            float n = this.h;
            if (n == -3.4028235E38f) {
                n = e(this.d);
            }
            int n2 = this.i;
            if (n2 == Integer.MIN_VALUE) {
                n2 = f(this.d);
            }
            final f0.a.b r = new f0.a.b().p(c(this.d)).h(b(this.e, this.f), this.f).i(this.g).k(n).l(n2).n(Math.min(this.j, d(n2, n))).r(this.k);
            final CharSequence c = this.c;
            if (c != null) {
                r.o(c);
            }
            return r;
        }
    }
}
