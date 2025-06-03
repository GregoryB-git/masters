/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.text.Html
 *  android.text.Spanned
 *  android.text.TextUtils
 *  java.lang.CharSequence
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.nio.charset.Charset
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.List
 *  java.util.regex.Matcher
 *  java.util.regex.Pattern
 */
package h1;

import X2.v;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import c1.e;
import c1.k;
import c1.s;
import c1.t;
import f0.a;
import g0.g;
import g0.o;
import g0.z;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class a
implements t {
    public static final Pattern d = Pattern.compile((String)"\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");
    public static final Pattern e = Pattern.compile((String)"\\{\\\\.*?\\}");
    public final StringBuilder a = new StringBuilder();
    public final ArrayList b = new ArrayList();
    public final z c = new z();

    private Charset f(z z8) {
        if ((z8 = z8.O()) != null) {
            return z8;
        }
        return W2.e.c;
    }

    public static float g(int n8) {
        if (n8 != 0) {
            if (n8 != 1) {
                if (n8 == 2) {
                    return 0.92f;
                }
                throw new IllegalArgumentException();
            }
            return 0.5f;
        }
        return 0.08f;
    }

    public static long h(Matcher object, int n8) {
        String string2 = object.group(n8 + 1);
        long l8 = string2 != null ? Long.parseLong((String)string2) * 3600000L : 0L;
        long l9 = l8 + Long.parseLong((String)((String)g0.a.e(object.group(n8 + 2)))) * 60000L + Long.parseLong((String)((String)g0.a.e(object.group(n8 + 3)))) * 1000L;
        object = object.group(n8 + 4);
        l8 = l9;
        if (object != null) {
            l8 = l9 + Long.parseLong((String)object);
        }
        return l8 * 1000L;
    }

    @Override
    public /* synthetic */ k a(byte[] arrby, int n8, int n9) {
        return s.a(this, arrby, n8, n9);
    }

    @Override
    public /* synthetic */ void b() {
        s.b(this);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void c(byte[] object, int n8, int n9, t.b b8, g g8) {
        ArrayList arrayList;
        Object object2 = g8;
        String string2 = "SubripParser";
        this.c.R((byte[])object, n8 + n9);
        this.c.T(n8);
        Charset charset = this.f(this.c);
        if (b8.a != -9223372036854775807L && b8.b) {
            arrayList = new ArrayList();
            object = string2;
        } else {
            arrayList = null;
            object = string2;
        }
        while ((string2 = this.c.s(charset)) != null) {
            long l8;
            long l9;
            block15 : {
                block17 : {
                    block18 : {
                        StringBuilder stringBuilder;
                        block16 : {
                            if (string2.length() == 0) continue;
                            try {
                                Integer.parseInt((String)string2);
                            }
                            catch (NumberFormatException numberFormatException) {}
                            string2 = this.c.s(charset);
                            if (string2 == null) {
                                o.h((String)object, "Unexpected end");
                                break;
                            }
                            stringBuilder = d.matcher((CharSequence)string2);
                            if (!stringBuilder.matches()) break block16;
                            l8 = a.h((Matcher)stringBuilder, 1);
                            l9 = a.h((Matcher)stringBuilder, 6);
                            object2 = this.a;
                            n8 = 0;
                            object2.setLength(0);
                            this.b.clear();
                            object2 = this.c.s(charset);
                            while (!TextUtils.isEmpty((CharSequence)object2)) {
                                if (this.a.length() > 0) {
                                    this.a.append("<br>");
                                }
                                this.a.append(this.i((String)object2, this.b));
                                object2 = this.c.s(charset);
                            }
                            string2 = Html.fromHtml((String)this.a.toString());
                            break block17;
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("Skipping invalid timing: ");
                        stringBuilder.append(string2);
                        string2 = stringBuilder.toString();
                        break block18;
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("Skipping invalid index: ");
                        stringBuilder.append(string2);
                        string2 = stringBuilder.toString();
                    }
                    o.h((String)object, string2);
                    continue;
                }
                while (n8 < this.b.size()) {
                    object2 = (String)this.b.get(n8);
                    if (!object2.matches("\\{\\\\an[1-9]\\}")) {
                        ++n8;
                        continue;
                    }
                    break block15;
                }
                object2 = null;
            }
            long l10 = b8.a;
            if (l10 != -9223372036854775807L && l8 < l10) {
                if (arrayList != null) {
                    arrayList.add((Object)new e(v.Z(this.e((Spanned)string2, (String)object2)), l8, l9 - l8));
                }
            } else {
                g8.accept(new e(v.Z(this.e((Spanned)string2, (String)object2)), l8, l9 - l8));
            }
            object2 = g8;
        }
        if (arrayList != null) {
            object = arrayList.iterator();
            while (object.hasNext()) {
                object2.accept((e)object.next());
            }
        }
    }

    @Override
    public int d() {
        return 1;
    }

    public final f0.a e(Spanned object, String string2) {
        int n8;
        block32 : {
            block31 : {
                object = new a.b().o((CharSequence)object);
                if (string2 == null) {
                    return object.a();
                }
                switch (string2.hashCode()) {
                    default: {
                        break;
                    }
                    case -685620462: {
                        if (!string2.equals((Object)"{\\an9}")) break;
                        n8 = 5;
                        break block31;
                    }
                    case -685620493: {
                        if (!string2.equals((Object)"{\\an8}")) break;
                        n8 = 8;
                        break block31;
                    }
                    case -685620524: {
                        if (!string2.equals((Object)"{\\an7}")) break;
                        n8 = 2;
                        break block31;
                    }
                    case -685620555: {
                        if (!string2.equals((Object)"{\\an6}")) break;
                        n8 = 4;
                        break block31;
                    }
                    case -685620586: {
                        if (!string2.equals((Object)"{\\an5}")) break;
                        n8 = 7;
                        break block31;
                    }
                    case -685620617: {
                        if (!string2.equals((Object)"{\\an4}")) break;
                        n8 = 1;
                        break block31;
                    }
                    case -685620648: {
                        if (!string2.equals((Object)"{\\an3}")) break;
                        n8 = 3;
                        break block31;
                    }
                    case -685620679: {
                        if (!string2.equals((Object)"{\\an2}")) break;
                        n8 = 6;
                        break block31;
                    }
                    case -685620710: {
                        if (!string2.equals((Object)"{\\an1}")) break;
                        n8 = 0;
                        break block31;
                    }
                }
                n8 = -1;
            }
            if (n8 != 0 && n8 != 1 && n8 != 2) {
                if (n8 != 3 && n8 != 4 && n8 != 5) {
                    object.l(1);
                } else {
                    object.l(2);
                }
            } else {
                object.l(0);
            }
            switch (string2.hashCode()) {
                default: {
                    break;
                }
                case -685620462: {
                    if (!string2.equals((Object)"{\\an9}")) break;
                    n8 = 5;
                    break block32;
                }
                case -685620493: {
                    if (!string2.equals((Object)"{\\an8}")) break;
                    n8 = 4;
                    break block32;
                }
                case -685620524: {
                    if (!string2.equals((Object)"{\\an7}")) break;
                    n8 = 3;
                    break block32;
                }
                case -685620555: {
                    if (!string2.equals((Object)"{\\an6}")) break;
                    n8 = 8;
                    break block32;
                }
                case -685620586: {
                    if (!string2.equals((Object)"{\\an5}")) break;
                    n8 = 7;
                    break block32;
                }
                case -685620617: {
                    if (!string2.equals((Object)"{\\an4}")) break;
                    n8 = 6;
                    break block32;
                }
                case -685620648: {
                    if (!string2.equals((Object)"{\\an3}")) break;
                    n8 = 2;
                    break block32;
                }
                case -685620679: {
                    if (!string2.equals((Object)"{\\an2}")) break;
                    n8 = 1;
                    break block32;
                }
                case -685620710: {
                    if (!string2.equals((Object)"{\\an1}")) break;
                    n8 = 0;
                    break block32;
                }
            }
            n8 = -1;
        }
        if (n8 != 0 && n8 != 1 && n8 != 2) {
            if (n8 != 3 && n8 != 4 && n8 != 5) {
                object.i(1);
            } else {
                object.i(0);
            }
        } else {
            object.i(2);
        }
        return object.k(a.g(object.d())).h(a.g(object.c()), 0).a();
    }

    public final String i(String string2, ArrayList arrayList) {
        String string3 = string2.trim();
        string2 = new StringBuilder(string3);
        string3 = e.matcher((CharSequence)string3);
        int n8 = 0;
        while (string3.find()) {
            String string4 = string3.group();
            arrayList.add((Object)string4);
            int n9 = string3.start() - n8;
            int n10 = string4.length();
            string2.replace(n9, n9 + n10, "");
            n8 += n10;
        }
        return string2.toString();
    }
}

