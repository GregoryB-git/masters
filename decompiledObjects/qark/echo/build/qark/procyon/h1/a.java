// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package h1;

import java.util.Iterator;
import java.util.List;
import X2.v;
import android.text.Spanned;
import android.text.Html;
import android.text.TextUtils;
import g0.o;
import g0.g;
import c1.s;
import c1.k;
import java.util.regex.Matcher;
import W2.e;
import java.nio.charset.Charset;
import g0.z;
import java.util.ArrayList;
import java.util.regex.Pattern;
import c1.t;

public final class a implements t
{
    public static final Pattern d;
    public static final Pattern e;
    public final StringBuilder a;
    public final ArrayList b;
    public final z c;
    
    static {
        d = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");
        e = Pattern.compile("\\{\\\\.*?\\}");
    }
    
    public a() {
        this.a = new StringBuilder();
        this.b = new ArrayList();
        this.c = new z();
    }
    
    private Charset f(final z z) {
        final Charset o = z.O();
        if (o != null) {
            return o;
        }
        return W2.e.c;
    }
    
    public static float g(final int n) {
        if (n == 0) {
            return 0.08f;
        }
        if (n == 1) {
            return 0.5f;
        }
        if (n == 2) {
            return 0.92f;
        }
        throw new IllegalArgumentException();
    }
    
    public static long h(final Matcher matcher, final int n) {
        final String group = matcher.group(n + 1);
        long n2;
        if (group != null) {
            n2 = Long.parseLong(group) * 3600000L;
        }
        else {
            n2 = 0L;
        }
        final long n3 = n2 + Long.parseLong((String)g0.a.e(matcher.group(n + 2))) * 60000L + Long.parseLong((String)g0.a.e(matcher.group(n + 3))) * 1000L;
        final String group2 = matcher.group(n + 4);
        long n4 = n3;
        if (group2 != null) {
            n4 = n3 + Long.parseLong(group2);
        }
        return n4 * 1000L;
    }
    
    @Override
    public void c(byte[] iterator, int i, final int n, final b b, final g g) {
        Object o = g;
        final Object o2 = "SubripParser";
        this.c.R(iterator, i + n);
        this.c.T(i);
        final Charset f = this.f(this.c);
        List<Object> list;
        if (b.a != -9223372036854775807L && b.b) {
            list = new ArrayList<Object>();
            iterator = (byte[])o2;
        }
        else {
            list = null;
            iterator = (byte[])o2;
        }
    Label_0078:
        while (true) {
            while (true) {
                Object o3 = this.c.s(f);
                Label_0133: {
                    if (o3 == null) {
                        break Label_0133;
                    }
                    if (((String)o3).length() == 0) {
                        continue;
                    }
                    Matcher matcher;
                    long h;
                    long h2;
                    long a;
                    StringBuilder sb;
                    StringBuilder sb2;
                    Label_0461_Outer:Label_0470_Outer:
                    while (true) {
                        while (true) {
                            try {
                                Integer.parseInt((String)o3);
                                o3 = this.c.s(f);
                                if (o3 == null) {
                                    g0.o.h((String)(Object)iterator, "Unexpected end");
                                    if (list != null) {
                                        iterator = (byte[])(Object)list.iterator();
                                        while (((Iterator)(Object)iterator).hasNext()) {
                                            ((g)o).accept(((Iterator<c1.e>)(Object)iterator).next());
                                        }
                                    }
                                    return;
                                }
                                matcher = h1.a.d.matcher((CharSequence)o3);
                                if (matcher.matches()) {
                                    h = h(matcher, 1);
                                    h2 = h(matcher, 6);
                                    o = this.a;
                                    i = 0;
                                    ((StringBuilder)o).setLength(0);
                                    this.b.clear();
                                    for (o = this.c.s(f); !TextUtils.isEmpty((CharSequence)o); o = this.c.s(f)) {
                                        if (this.a.length() > 0) {
                                            this.a.append("<br>");
                                        }
                                        this.a.append(this.i((String)o, this.b));
                                    }
                                    o3 = Html.fromHtml(this.a.toString());
                                    while (true) {
                                        while (i < this.b.size()) {
                                            o = this.b.get(i);
                                            if (((String)o).matches("\\{\\\\an[1-9]\\}")) {
                                                a = b.a;
                                                if (a != -9223372036854775807L && h < a) {
                                                    if (list != null) {
                                                        list.add(new c1.e(v.Z(this.e((Spanned)o3, (String)o)), h, h2 - h));
                                                    }
                                                }
                                                else {
                                                    g.accept(new c1.e(v.Z(this.e((Spanned)o3, (String)o)), h, h2 - h));
                                                }
                                                o = g;
                                                continue Label_0078;
                                            }
                                            ++i;
                                        }
                                        o = null;
                                        continue Label_0461_Outer;
                                    }
                                }
                                sb = new StringBuilder();
                                sb.append("Skipping invalid timing: ");
                                sb.append((String)o3);
                                o3 = sb.toString();
                                while (true) {
                                    g0.o.h((String)(Object)iterator, (String)o3);
                                    break;
                                    sb2 = new StringBuilder();
                                    sb2.append("Skipping invalid index: ");
                                    sb2.append((String)o3);
                                    o3 = sb2.toString();
                                    continue Label_0470_Outer;
                                }
                            }
                            catch (NumberFormatException ex) {}
                            continue;
                        }
                    }
                }
            }
            break;
        }
    }
    
    @Override
    public int d() {
        return 1;
    }
    
    public final f0.a e(final Spanned spanned, final String s) {
        final f0.a.b o = new f0.a.b().o((CharSequence)spanned);
        if (s == null) {
            return o.a();
        }
        int n = 0;
        Label_0251: {
            switch (s.hashCode()) {
                case -685620462: {
                    if (s.equals("{\\an9}")) {
                        n = 5;
                        break Label_0251;
                    }
                    break;
                }
                case -685620493: {
                    if (s.equals("{\\an8}")) {
                        n = 8;
                        break Label_0251;
                    }
                    break;
                }
                case -685620524: {
                    if (s.equals("{\\an7}")) {
                        n = 2;
                        break Label_0251;
                    }
                    break;
                }
                case -685620555: {
                    if (s.equals("{\\an6}")) {
                        n = 4;
                        break Label_0251;
                    }
                    break;
                }
                case -685620586: {
                    if (s.equals("{\\an5}")) {
                        n = 7;
                        break Label_0251;
                    }
                    break;
                }
                case -685620617: {
                    if (s.equals("{\\an4}")) {
                        n = 1;
                        break Label_0251;
                    }
                    break;
                }
                case -685620648: {
                    if (s.equals("{\\an3}")) {
                        n = 3;
                        break Label_0251;
                    }
                    break;
                }
                case -685620679: {
                    if (s.equals("{\\an2}")) {
                        n = 6;
                        break Label_0251;
                    }
                    break;
                }
                case -685620710: {
                    if (s.equals("{\\an1}")) {
                        n = 0;
                        break Label_0251;
                    }
                    break;
                }
            }
            n = -1;
        }
        if (n != 0 && n != 1 && n != 2) {
            if (n != 3 && n != 4 && n != 5) {
                o.l(1);
            }
            else {
                o.l(2);
            }
        }
        else {
            o.l(0);
        }
        int n2 = 0;
        Label_0535: {
            switch (s.hashCode()) {
                case -685620462: {
                    if (s.equals("{\\an9}")) {
                        n2 = 5;
                        break Label_0535;
                    }
                    break;
                }
                case -685620493: {
                    if (s.equals("{\\an8}")) {
                        n2 = 4;
                        break Label_0535;
                    }
                    break;
                }
                case -685620524: {
                    if (s.equals("{\\an7}")) {
                        n2 = 3;
                        break Label_0535;
                    }
                    break;
                }
                case -685620555: {
                    if (s.equals("{\\an6}")) {
                        n2 = 8;
                        break Label_0535;
                    }
                    break;
                }
                case -685620586: {
                    if (s.equals("{\\an5}")) {
                        n2 = 7;
                        break Label_0535;
                    }
                    break;
                }
                case -685620617: {
                    if (s.equals("{\\an4}")) {
                        n2 = 6;
                        break Label_0535;
                    }
                    break;
                }
                case -685620648: {
                    if (s.equals("{\\an3}")) {
                        n2 = 2;
                        break Label_0535;
                    }
                    break;
                }
                case -685620679: {
                    if (s.equals("{\\an2}")) {
                        n2 = 1;
                        break Label_0535;
                    }
                    break;
                }
                case -685620710: {
                    if (s.equals("{\\an1}")) {
                        n2 = 0;
                        break Label_0535;
                    }
                    break;
                }
            }
            n2 = -1;
        }
        if (n2 != 0 && n2 != 1 && n2 != 2) {
            if (n2 != 3 && n2 != 4 && n2 != 5) {
                o.i(1);
            }
            else {
                o.i(0);
            }
        }
        else {
            o.i(2);
        }
        return o.k(g(o.d())).h(g(o.c()), 0).a();
    }
    
    public final String i(final String s, final ArrayList list) {
        final String trim = s.trim();
        final StringBuilder sb = new StringBuilder(trim);
        final Matcher matcher = h1.a.e.matcher(trim);
        int n = 0;
        while (matcher.find()) {
            final String group = matcher.group();
            list.add(group);
            final int start = matcher.start() - n;
            final int length = group.length();
            sb.replace(start, start + length, "");
            n += length;
        }
        return sb.toString();
    }
}
