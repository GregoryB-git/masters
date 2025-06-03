// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package F1;

import android.os.BaseBundle;
import O1.r;
import O1.v;
import kotlin.text.Regex;
import kotlin.text.i;
import java.util.Locale;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;
import android.os.Build$VERSION;
import x1.B;
import android.os.Build;
import O1.P;
import kotlin.jvm.internal.Intrinsics;
import android.os.Bundle;
import T1.a;
import org.json.JSONArray;

public final class b
{
    public static final b a;
    public static boolean b;
    public static JSONArray c;
    public static String[] d;
    
    static {
        a = new b();
        F1.b.d = new String[] { "event", "_locale", "_appVersion", "_deviceOS", "_platform", "_deviceModel", "_nativeAppID", "_nativeAppShortVersion", "_timezone", "_carrier", "_deviceOSTypeName", "_deviceOSVersion", "_remainingDiskGB" };
    }
    
    public static final void a() {
        if (T1.a.d(b.class)) {
            return;
        }
        Label_0031: {
            try {
                F1.b.a.g();
                if (F1.b.c != null) {
                    F1.b.b = true;
                    return;
                }
            }
            finally {
                break Label_0031;
            }
            return;
        }
        final Throwable t;
        T1.a.b(t, b.class);
    }
    
    public static final void b(final Bundle bundle, String s) {
        if (T1.a.d(b.class)) {
            return;
        }
    Label_0217_Outer:
        while (true) {
            while (true) {
            Label_0289:
                while (true) {
                    try {
                        Intrinsics.checkNotNullParameter(bundle, "params");
                        Intrinsics.checkNotNullParameter(s, "event");
                        ((BaseBundle)bundle).putString("event", s);
                        final StringBuilder sb = new StringBuilder();
                        final P a = P.a;
                        s = (String)a.I();
                        final String s2 = "";
                        if (s == null || (s = ((Locale)s).getLanguage()) == null) {
                            s = "";
                        }
                        sb.append(s);
                        sb.append('_');
                        s = (String)a.I();
                        if (s != null) {
                            if ((s = ((Locale)s).getCountry()) != null) {
                                sb.append(s);
                                ((BaseBundle)bundle).putString("_locale", sb.toString());
                                if ((s = a.P()) == null) {
                                    s = "";
                                }
                                ((BaseBundle)bundle).putString("_appVersion", s);
                                ((BaseBundle)bundle).putString("_deviceOS", "ANDROID");
                                ((BaseBundle)bundle).putString("_platform", "mobile");
                                if ((s = Build.MODEL) == null) {
                                    s = "";
                                }
                                ((BaseBundle)bundle).putString("_deviceModel", s);
                                ((BaseBundle)bundle).putString("_nativeAppID", B.m());
                                s = a.P();
                                if (s == null) {
                                    s = s2;
                                    ((BaseBundle)bundle).putString("_nativeAppShortVersion", s);
                                    ((BaseBundle)bundle).putString("_timezone", a.D());
                                    ((BaseBundle)bundle).putString("_carrier", a.y());
                                    ((BaseBundle)bundle).putString("_deviceOSTypeName", "ANDROID");
                                    ((BaseBundle)bundle).putString("_deviceOSVersion", Build$VERSION.RELEASE);
                                    ((BaseBundle)bundle).putLong("_remainingDiskGB", a.w());
                                    return;
                                }
                                break Label_0289;
                            }
                        }
                    }
                    finally {
                        T1.a.b((Throwable)bundle, b.class);
                        return;
                    }
                    s = "";
                    continue Label_0217_Outer;
                }
                continue;
            }
        }
    }
    
    public static final String c(final JSONObject jsonObject) {
        if (T1.a.d(b.class)) {
            return null;
        }
        Label_0048: {
            try {
                Intrinsics.checkNotNullParameter(jsonObject, "logic");
                final Iterator keys = jsonObject.keys();
                if (keys.hasNext()) {
                    return keys.next();
                }
            }
            finally {
                break Label_0048;
            }
            return null;
        }
        final Throwable t;
        T1.a.b(t, b.class);
        return null;
    }
    
    public static final String d(Bundle bundle) {
        if (T1.a.d(b.class)) {
            return null;
        }
    Label_0086_Outer:
        while (true) {
            while (true) {
                int n2 = 0;
                while (true) {
                    int length = 0;
                    Label_0232: {
                        while (true) {
                            try {
                                Object o = F1.b.c;
                                if (o != null) {
                                    if (o == null) {
                                        o = null;
                                    }
                                    else {
                                        o = ((JSONArray)o).length();
                                    }
                                    if (o != null) {
                                        if ((int)o == 0) {
                                            return "[]";
                                        }
                                    }
                                    o = F1.b.c;
                                    if (o == null) {
                                        throw new NullPointerException("null cannot be cast to non-null type org.json.JSONArray");
                                    }
                                    final ArrayList<Long> list = new ArrayList<Long>();
                                    length = ((JSONArray)o).length();
                                    if (length <= 0) {
                                        final String string = new JSONArray((Collection)list).toString();
                                        Intrinsics.checkNotNullExpressionValue(string, "JSONArray(res).toString()");
                                        return string;
                                    }
                                    final int n = 0;
                                    n2 = n + 1;
                                    final String optString = ((JSONArray)o).optString(n);
                                    if (optString == null) {
                                        break Label_0232;
                                    }
                                    final JSONObject jsonObject = new JSONObject(optString);
                                    final long optLong = jsonObject.optLong("id");
                                    if (optLong == 0L) {
                                        break Label_0232;
                                    }
                                    final String optString2 = jsonObject.optString("rule");
                                    if (optString2 == null) {
                                        break Label_0232;
                                    }
                                    if (f(optString2, bundle)) {
                                        list.add(optLong);
                                    }
                                    break Label_0232;
                                }
                                return "[]";
                                T1.a.b((Throwable)bundle, b.class);
                                return null;
                            }
                            finally {}
                            final Bundle bundle2;
                            bundle = bundle2;
                            continue;
                        }
                    }
                    if (n2 >= length) {
                        continue Label_0086_Outer;
                    }
                    break;
                }
                final int n = n2;
                continue;
            }
        }
    }
    
    public static final ArrayList e(final JSONArray jsonArray) {
        if (T1.a.d(b.class)) {
            return null;
        }
        if (jsonArray == null) {
            return null;
        }
        Label_0074: {
            ArrayList<String> list;
            try {
                list = new ArrayList<String>();
                final int length = jsonArray.length();
                if (length > 0) {
                    int n = 0;
                    while (true) {
                        final int n2 = n + 1;
                        list.add(jsonArray.get(n).toString());
                        if (n2 >= length) {
                            break;
                        }
                        n = n2;
                    }
                    return list;
                }
            }
            finally {
                break Label_0074;
            }
            return list;
        }
        final Throwable t;
        T1.a.b(t, b.class);
        return null;
    }
    
    public static final boolean f(String c, final Bundle bundle) {
        if (T1.a.d(b.class)) {
            return false;
        }
        if (c == null) {
            return false;
        }
        if (bundle == null) {
            return false;
        }
        while (true) {
            while (true) {
                int n = 0;
                int n3 = 0;
                Label_0270: {
                    while (true) {
                        try {
                            final JSONObject jsonObject = new JSONObject(c);
                            c = c(jsonObject);
                            if (c == null) {
                                return false;
                            }
                            final Object value = jsonObject.get(c);
                            final int hashCode = c.hashCode();
                            if (hashCode != 3555) {
                                if (hashCode != 96727) {
                                    if (hashCode == 109267) {
                                        if (c.equals("not")) {
                                            return f(value.toString(), bundle) ^ true;
                                        }
                                    }
                                }
                                else if (c.equals("and")) {
                                    final JSONArray jsonArray = (JSONArray)value;
                                    if (jsonArray == null) {
                                        return false;
                                    }
                                    n = jsonArray.length();
                                    if (n <= 0) {
                                        return true;
                                    }
                                    final int n2 = 0;
                                    n3 = n2 + 1;
                                    if (!f(jsonArray.get(n2).toString(), bundle)) {
                                        return false;
                                    }
                                    break Label_0270;
                                }
                            }
                            else if (c.equals("or")) {
                                final JSONArray jsonArray2 = (JSONArray)value;
                                if (jsonArray2 == null) {
                                    return false;
                                }
                                n = jsonArray2.length();
                                if (n <= 0) {
                                    return false;
                                }
                                int n4 = 0;
                                while (true) {
                                    n3 = n4 + 1;
                                    if (f(jsonArray2.get(n4).toString(), bundle)) {
                                        return true;
                                    }
                                    if (n3 >= n) {
                                        return false;
                                    }
                                    n4 = n3;
                                }
                            }
                            final JSONObject jsonObject2 = (JSONObject)value;
                            return jsonObject2 != null && j(c, jsonObject2, bundle);
                            JSONArray jsonArray = null;
                            T1.a.b((Throwable)jsonArray, b.class);
                            return false;
                        }
                        finally {}
                        final JSONArray jsonArray3;
                        final JSONArray jsonArray = jsonArray3;
                        continue;
                    }
                }
                if (n3 >= n) {
                    return true;
                }
                final int n2 = n3;
                continue;
            }
        }
    }
    
    public static final void h(final Bundle p0, final String p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: invokestatic    T1/a.d:(Ljava/lang/Object;)Z
        //     5: ifeq            9
        //     8: return         
        //     9: aload_1        
        //    10: ldc             "event"
        //    12: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    15: getstatic       F1/b.b:Z
        //    18: istore_2       
        //    19: iload_2        
        //    20: ifeq            63
        //    23: aload_0        
        //    24: ifnonnull       28
        //    27: return         
        //    28: aload_0        
        //    29: aload_1        
        //    30: invokestatic    F1/b.b:(Landroid/os/Bundle;Ljava/lang/String;)V
        //    33: aload_0        
        //    34: ldc_w           "_audiencePropertyIds"
        //    37: aload_0        
        //    38: invokestatic    F1/b.d:(Landroid/os/Bundle;)Ljava/lang/String;
        //    41: invokevirtual   android/os/BaseBundle.putString:(Ljava/lang/String;Ljava/lang/String;)V
        //    44: aload_0        
        //    45: ldc_w           "cs_maca"
        //    48: ldc_w           "1"
        //    51: invokevirtual   android/os/BaseBundle.putString:(Ljava/lang/String;Ljava/lang/String;)V
        //    54: aload_0        
        //    55: invokestatic    F1/b.i:(Landroid/os/Bundle;)V
        //    58: return         
        //    59: astore_0       
        //    60: goto            64
        //    63: return         
        //    64: aload_0        
        //    65: ldc             LF1/b;.class
        //    67: invokestatic    T1/a.b:(Ljava/lang/Throwable;Ljava/lang/Object;)V
        //    70: return         
        //    71: astore_0       
        //    72: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  9      19     59     63     Any
        //  28     58     71     73     Ljava/lang/Exception;
        //  28     58     59     63     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0028:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2596)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static final void i(final Bundle bundle) {
        if (T1.a.d(b.class)) {
            return;
        }
        Label_0052: {
            try {
                Intrinsics.checkNotNullParameter(bundle, "params");
                final String[] d = F1.b.d;
                final int length = d.length;
                int i = 0;
                while (i < length) {
                    final String s = d[i];
                    ++i;
                    bundle.remove(s);
                }
            }
            finally {
                break Label_0052;
            }
            return;
        }
        final Throwable t;
        T1.a.b(t, b.class);
    }
    
    public static final boolean j(String s, final JSONObject jsonObject, final Bundle bundle) {
        if (T1.a.d(b.class)) {
            return false;
        }
        final String s2;
        Label_1694: {
            String c;
            String string;
            ArrayList e;
            try {
                Intrinsics.checkNotNullParameter(s, "variable");
                Intrinsics.checkNotNullParameter(jsonObject, "values");
                c = c(jsonObject);
                if (c == null) {
                    return false;
                }
                string = jsonObject.get(c).toString();
                e = e(jsonObject.optJSONArray(c));
                final boolean a = Intrinsics.a(c, "exists");
                final Object o = null;
                if (a) {
                    Object value;
                    if (bundle == null) {
                        value = o;
                    }
                    else {
                        value = ((BaseBundle)bundle).containsKey(s);
                    }
                    return Intrinsics.a(value, Boolean.parseBoolean(string));
                }
            }
            finally {
                break Label_1694;
            }
            Object value2;
            if (bundle == null) {
                value2 = null;
            }
            else {
                final String lowerCase = s2.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.Strin\u2026.toLowerCase(Locale.ROOT)");
                value2 = ((BaseBundle)bundle).get(lowerCase);
            }
            Object o2 = value2;
            if (value2 == null) {
                Object value3;
                if (bundle == null) {
                    value3 = null;
                }
                else {
                    value3 = ((BaseBundle)bundle).get(s2);
                }
                o2 = value3;
                if (value3 == null) {
                    return false;
                }
            }
            Label_1747: {
                Label_1740: {
                    Label_1733: {
                        Label_1726: {
                            Label_1075: {
                                Label_1018: {
                                    Label_0989: {
                                        Label_0956: {
                                            switch (c.hashCode()) {
                                                default: {
                                                    return false;
                                                }
                                                case 1961112862: {
                                                    if (!c.equals("i_starts_with")) {
                                                        return false;
                                                    }
                                                    final String string2 = o2.toString();
                                                    if (string2 == null) {
                                                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                                                    }
                                                    final Locale root = Locale.ROOT;
                                                    final String lowerCase2 = string2.toLowerCase(root);
                                                    Intrinsics.checkNotNullExpressionValue(lowerCase2, "(this as java.lang.Strin\u2026.toLowerCase(Locale.ROOT)");
                                                    if (string != null) {
                                                        s = string.toLowerCase(root);
                                                        Intrinsics.checkNotNullExpressionValue(s, "(this as java.lang.Strin\u2026.toLowerCase(Locale.ROOT)");
                                                        return i.s(lowerCase2, s, false, 2, null);
                                                    }
                                                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                                                }
                                                case 1918401035: {
                                                    if (!c.equals("not_contains")) {
                                                        return false;
                                                    }
                                                    if (!i.v(o2.toString(), string, false, 2, null)) {
                                                        return true;
                                                    }
                                                    return false;
                                                }
                                                case 1091487233: {
                                                    if (!c.equals("i_is_not_any")) {
                                                        return false;
                                                    }
                                                    break Label_1726;
                                                }
                                                case 363990325: {
                                                    if (!c.equals("i_contains")) {
                                                        return false;
                                                    }
                                                    final String string3 = o2.toString();
                                                    if (string3 == null) {
                                                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                                                    }
                                                    final Locale root2 = Locale.ROOT;
                                                    final String lowerCase3 = string3.toLowerCase(root2);
                                                    Intrinsics.checkNotNullExpressionValue(lowerCase3, "(this as java.lang.Strin\u2026.toLowerCase(Locale.ROOT)");
                                                    if (string != null) {
                                                        s = string.toLowerCase(root2);
                                                        Intrinsics.checkNotNullExpressionValue(s, "(this as java.lang.Strin\u2026.toLowerCase(Locale.ROOT)");
                                                        return i.v(lowerCase3, s, false, 2, null);
                                                    }
                                                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                                                }
                                                case 127966857: {
                                                    if (!c.equals("i_str_in")) {
                                                        return false;
                                                    }
                                                    break Label_1733;
                                                }
                                                case 127966736: {
                                                    if (!c.equals("i_str_eq")) {
                                                        return false;
                                                    }
                                                    final String string4 = o2.toString();
                                                    if (string4 == null) {
                                                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                                                    }
                                                    final Locale root3 = Locale.ROOT;
                                                    final String lowerCase4 = string4.toLowerCase(root3);
                                                    Intrinsics.checkNotNullExpressionValue(lowerCase4, "(this as java.lang.Strin\u2026.toLowerCase(Locale.ROOT)");
                                                    if (string != null) {
                                                        s = string.toLowerCase(root3);
                                                        Intrinsics.checkNotNullExpressionValue(s, "(this as java.lang.Strin\u2026.toLowerCase(Locale.ROOT)");
                                                        return Intrinsics.a(lowerCase4, s);
                                                    }
                                                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                                                }
                                                case 108954: {
                                                    if (!c.equals("neq")) {
                                                        return false;
                                                    }
                                                    break Label_0989;
                                                }
                                                case 107485: {
                                                    if (!c.equals("lte")) {
                                                        return false;
                                                    }
                                                    break Label_0956;
                                                }
                                                case 102680: {
                                                    if (!c.equals("gte")) {
                                                        return false;
                                                    }
                                                    break;
                                                }
                                                case 3511: {
                                                    if (!c.equals("ne")) {
                                                        return false;
                                                    }
                                                    break Label_0989;
                                                }
                                                case 3464: {
                                                    if (!c.equals("lt")) {
                                                        return false;
                                                    }
                                                    break Label_1075;
                                                }
                                                case 3449: {
                                                    if (!c.equals("le")) {
                                                        return false;
                                                    }
                                                    break Label_0956;
                                                }
                                                case 3365: {
                                                    if (!c.equals("in")) {
                                                        return false;
                                                    }
                                                    break Label_1747;
                                                }
                                                case 3309: {
                                                    if (!c.equals("gt")) {
                                                        return false;
                                                    }
                                                    break Label_1018;
                                                }
                                                case 3294: {
                                                    if (!c.equals("ge")) {
                                                        return false;
                                                    }
                                                    break;
                                                }
                                                case 3244: {
                                                    if (!c.equals("eq")) {
                                                        return false;
                                                    }
                                                    return Intrinsics.a(o2.toString(), string);
                                                }
                                                case 1983: {
                                                    if (!c.equals(">=")) {
                                                        return false;
                                                    }
                                                    break;
                                                }
                                                case 1952: {
                                                    if (!c.equals("==")) {
                                                        return false;
                                                    }
                                                    return Intrinsics.a(o2.toString(), string);
                                                }
                                                case 1921: {
                                                    if (!c.equals("<=")) {
                                                        return false;
                                                    }
                                                    break Label_0956;
                                                }
                                                case 1084: {
                                                    if (!c.equals("!=")) {
                                                        return false;
                                                    }
                                                    break Label_0989;
                                                }
                                                case 62: {
                                                    if (!c.equals(">")) {
                                                        return false;
                                                    }
                                                    break Label_1018;
                                                }
                                                case 61: {
                                                    if (!c.equals("=")) {
                                                        return false;
                                                    }
                                                    return Intrinsics.a(o2.toString(), string);
                                                }
                                                case 60: {
                                                    if (!c.equals("<")) {
                                                        return false;
                                                    }
                                                    break Label_1075;
                                                }
                                                case -92753547: {
                                                    if (!c.equals("i_str_not_in")) {
                                                        return false;
                                                    }
                                                    break Label_1726;
                                                }
                                                case -159812115: {
                                                    if (!c.equals("i_is_any")) {
                                                        return false;
                                                    }
                                                    break Label_1733;
                                                }
                                                case -327990090: {
                                                    if (!c.equals("i_str_neq")) {
                                                        return false;
                                                    }
                                                    final String string5 = o2.toString();
                                                    if (string5 == null) {
                                                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                                                    }
                                                    final Locale root4 = Locale.ROOT;
                                                    final String lowerCase5 = string5.toLowerCase(root4);
                                                    Intrinsics.checkNotNullExpressionValue(lowerCase5, "(this as java.lang.Strin\u2026.toLowerCase(Locale.ROOT)");
                                                    if (string == null) {
                                                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                                                    }
                                                    s = string.toLowerCase(root4);
                                                    Intrinsics.checkNotNullExpressionValue(s, "(this as java.lang.Strin\u2026.toLowerCase(Locale.ROOT)");
                                                    if (!Intrinsics.a(lowerCase5, s)) {
                                                        return true;
                                                    }
                                                    return false;
                                                }
                                                case -567445985: {
                                                    return c.equals("contains") && i.v(o2.toString(), string, false, 2, null);
                                                }
                                                case -665609109: {
                                                    if (!c.equals("is_not_any")) {
                                                        return false;
                                                    }
                                                    break Label_1740;
                                                }
                                                case -966353971: {
                                                    return c.equals("regex_match") && new Regex(string).b(o2.toString());
                                                }
                                                case -969266188: {
                                                    return c.equals("starts_with") && i.s(o2.toString(), string, false, 2, null);
                                                }
                                                case -1039699439: {
                                                    if (!c.equals("not_in")) {
                                                        return false;
                                                    }
                                                    break Label_1740;
                                                }
                                                case -1179774633: {
                                                    if (!c.equals("is_any")) {
                                                        return false;
                                                    }
                                                    break Label_1747;
                                                }
                                                case -1729128927: {
                                                    if (!c.equals("i_not_contains")) {
                                                        return false;
                                                    }
                                                    final String string6 = o2.toString();
                                                    if (string6 == null) {
                                                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                                                    }
                                                    final Locale root5 = Locale.ROOT;
                                                    final String lowerCase6 = string6.toLowerCase(root5);
                                                    Intrinsics.checkNotNullExpressionValue(lowerCase6, "(this as java.lang.Strin\u2026.toLowerCase(Locale.ROOT)");
                                                    if (string == null) {
                                                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                                                    }
                                                    s = string.toLowerCase(root5);
                                                    Intrinsics.checkNotNullExpressionValue(s, "(this as java.lang.Strin\u2026.toLowerCase(Locale.ROOT)");
                                                    if (!i.v(lowerCase6, s, false, 2, null)) {
                                                        return true;
                                                    }
                                                    return false;
                                                }
                                            }
                                            if (Double.parseDouble(o2.toString()) >= Double.parseDouble(string)) {
                                                return true;
                                            }
                                            return false;
                                        }
                                        if (Double.parseDouble(o2.toString()) <= Double.parseDouble(string)) {
                                            return true;
                                        }
                                        return false;
                                    }
                                    if (!Intrinsics.a(o2.toString(), string)) {
                                        return true;
                                    }
                                    return false;
                                }
                                if (Double.parseDouble(o2.toString()) > Double.parseDouble(string)) {
                                    return true;
                                }
                                return false;
                            }
                            if (Double.parseDouble(o2.toString()) < Double.parseDouble(string)) {
                                return true;
                            }
                            return false;
                        }
                        if (e == null) {
                            return false;
                        }
                        if (e.isEmpty()) {
                            return true;
                        }
                        for (final String s3 : e) {
                            if (s3 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                            }
                            final Locale root6 = Locale.ROOT;
                            final String lowerCase7 = s3.toLowerCase(root6);
                            Intrinsics.checkNotNullExpressionValue(lowerCase7, "(this as java.lang.Strin\u2026.toLowerCase(Locale.ROOT)");
                            final String string7 = o2.toString();
                            if (string7 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                            }
                            final String lowerCase8 = string7.toLowerCase(root6);
                            Intrinsics.checkNotNullExpressionValue(lowerCase8, "(this as java.lang.Strin\u2026.toLowerCase(Locale.ROOT)");
                            if (!(Intrinsics.a(lowerCase7, lowerCase8) ^ true)) {
                                return false;
                            }
                        }
                        return true;
                    }
                    if (e == null) {
                        return false;
                    }
                    if (e.isEmpty()) {
                        return false;
                    }
                    for (final String s4 : e) {
                        if (s4 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                        }
                        final Locale root7 = Locale.ROOT;
                        final String lowerCase9 = s4.toLowerCase(root7);
                        Intrinsics.checkNotNullExpressionValue(lowerCase9, "(this as java.lang.Strin\u2026.toLowerCase(Locale.ROOT)");
                        final String string8 = o2.toString();
                        if (string8 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                        }
                        final String lowerCase10 = string8.toLowerCase(root7);
                        Intrinsics.checkNotNullExpressionValue(lowerCase10, "(this as java.lang.Strin\u2026.toLowerCase(Locale.ROOT)");
                        if (Intrinsics.a(lowerCase9, lowerCase10)) {
                            return true;
                        }
                    }
                    return false;
                }
                if (e == null) {
                    return false;
                }
                s = o2.toString();
                return e.contains(s);
            }
            if (e == null) {
                return false;
            }
            s = o2.toString();
            return e.contains(s);
        }
        T1.a.b((Throwable)s2, b.class);
        return false;
    }
    
    public final void g() {
        if (T1.a.d(this)) {
            return;
        }
        try {
            final v a = v.a;
            final r q = v.q(B.m(), false);
            if (q == null) {
                return;
            }
            F1.b.c = q.f();
        }
        finally {
            final Throwable t;
            T1.a.b(t, this);
        }
    }
}
