// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package g1;

import java.util.regex.Matcher;
import android.graphics.PointF;
import java.util.regex.Pattern;
import android.graphics.Color;
import a3.f;
import g0.o;
import g0.M;
import android.text.TextUtils;
import g0.a;

public final class c
{
    public final String a;
    public final int b;
    public final Integer c;
    public final Integer d;
    public final float e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final int j;
    
    public c(final String a, final int b, final Integer c, final Integer d, final float e, final boolean f, final boolean g, final boolean h, final boolean i, final int j) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
    }
    
    public static c b(final String str, final a a) {
        a.a(str.startsWith("Style:"));
        final String[] split = TextUtils.split(str.substring(6), ",");
        final int length = split.length;
        final int k = a.k;
        if (length != k) {
            o.h("SsaStyle", M.G("Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", k, split.length, str));
            return null;
        }
        String trim;
        int b;
        int e;
        int c;
        Integer h;
        int d;
        Integer h2;
        int e2;
        float i;
        boolean b2;
        boolean b3;
        int f;
        StringBuilder sb;
        final RuntimeException ex;
        boolean b4;
        int j;
        int h3;
        int g;
        int l;
        boolean b5;
        int g2;
        Label_0139_Outer:Label_0167_Outer:Label_0441_Outer:Label_0258_Outer:Label_0290_Outer:Label_0322_Outer:
        while (true) {
            while (true) {
            Label_0322:
                while (true) {
                    while (true) {
                        Label_0258:Label_0226_Outer:
                        while (true) {
                        Label_0226:
                            while (true) {
                            Label_0441:
                                while (true) {
                                    Label_0444: {
                                        while (true) {
                                            while (true) {
                                            Label_0435:
                                                while (true) {
                                                Label_0429:
                                                    while (true) {
                                                        Label_0424: {
                                                            while (true) {
                                                                try {
                                                                    trim = split[a.a].trim();
                                                                    b = a.b;
                                                                    if (b == -1) {
                                                                        break Label_0424;
                                                                    }
                                                                    e = e(split[b].trim());
                                                                    c = a.c;
                                                                    if (c == -1) {
                                                                        break Label_0429;
                                                                    }
                                                                    h = h(split[c].trim());
                                                                    d = a.d;
                                                                    if (d == -1) {
                                                                        break Label_0435;
                                                                    }
                                                                    h2 = h(split[d].trim());
                                                                    e2 = a.e;
                                                                    if (e2 != -1) {
                                                                        i = i(split[e2].trim());
                                                                        break Label_0441;
                                                                    }
                                                                    break Label_0444;
                                                                    // iftrue(Label_0450:, f == -1 || !f(split[f].trim()))
                                                                    // iftrue(Label_0468:, j == -1 || !f(split[j].trim()))
                                                                    // iftrue(Label_0462:, h3 == -1 || !f(split[h3].trim()))
                                                                    // iftrue(Label_0456:, g == -1 || !f(split[g].trim()))
                                                                    // iftrue(Label_0474:, l == -1)
                                                                    Block_15: {
                                                                        Block_14: {
                                                                            while (true) {
                                                                                b2 = true;
                                                                                break Label_0258;
                                                                                while (true) {
                                                                                    b3 = true;
                                                                                    break Label_0226;
                                                                                    f = a.f;
                                                                                    continue Label_0226_Outer;
                                                                                }
                                                                                sb = new StringBuilder();
                                                                                sb.append("Skipping malformed 'Style:' line: '");
                                                                                sb.append(str);
                                                                                sb.append("'");
                                                                                o.i("SsaStyle", sb.toString(), ex);
                                                                                return null;
                                                                                while (true) {
                                                                                    b4 = true;
                                                                                    j = a.i;
                                                                                    break Block_14;
                                                                                    h3 = a.h;
                                                                                    continue Label_0290_Outer;
                                                                                }
                                                                                g = a.g;
                                                                                continue Label_0258_Outer;
                                                                            }
                                                                            l = a.j;
                                                                            break Block_15;
                                                                            return new c(trim, e, h, h2, i, b3, b2, b4, b5, g2);
                                                                        }
                                                                        b5 = true;
                                                                        continue Label_0322;
                                                                    }
                                                                    g2 = g(split[l].trim());
                                                                    return new c(trim, e, h, h2, i, b3, b2, b4, b5, g2);
                                                                }
                                                                catch (RuntimeException ex) {
                                                                    continue Label_0290_Outer;
                                                                }
                                                                break;
                                                            }
                                                        }
                                                        e = -1;
                                                        continue Label_0139_Outer;
                                                    }
                                                    h = null;
                                                    continue Label_0167_Outer;
                                                }
                                                h2 = null;
                                                continue Label_0441_Outer;
                                            }
                                            continue Label_0290_Outer;
                                        }
                                    }
                                    i = -3.4028235E38f;
                                    continue Label_0441;
                                }
                                Label_0450: {
                                    b3 = false;
                                }
                                continue Label_0226;
                            }
                            Label_0456: {
                                b2 = false;
                            }
                            continue Label_0258;
                        }
                        Label_0462: {
                            b4 = false;
                        }
                        continue Label_0322_Outer;
                    }
                    Label_0468: {
                        b5 = false;
                    }
                    continue Label_0322;
                }
                Label_0474: {
                    g2 = -1;
                }
                continue;
            }
        }
    }
    
    public static boolean c(final int n) {
        switch (n) {
            default: {
                return false;
            }
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9: {
                return true;
            }
        }
    }
    
    public static boolean d(final int n) {
        return n == 1 || n == 3;
    }
    
    public static int e(final String str) {
        while (true) {
            try {
                final int int1 = Integer.parseInt(str.trim());
                if (c(int1)) {
                    return int1;
                }
                final StringBuilder sb = new StringBuilder();
                sb.append("Ignoring unknown alignment: ");
                sb.append(str);
                o.h("SsaStyle", sb.toString());
                return -1;
            }
            catch (NumberFormatException ex) {
                continue;
            }
            break;
        }
    }
    
    public static boolean f(final String s) {
        boolean b = false;
        try {
            final int int1 = Integer.parseInt(s);
            if (int1 == 1 || int1 == -1) {
                b = true;
            }
            return b;
        }
        catch (NumberFormatException ex) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Failed to parse boolean value: '");
            sb.append(s);
            sb.append("'");
            o.i("SsaStyle", sb.toString(), ex);
            return false;
        }
    }
    
    public static int g(final String str) {
        while (true) {
            try {
                final int int1 = Integer.parseInt(str.trim());
                if (d(int1)) {
                    return int1;
                }
                final StringBuilder sb = new StringBuilder();
                sb.append("Ignoring unknown BorderStyle: ");
                sb.append(str);
                o.h("SsaStyle", sb.toString());
                return -1;
            }
            catch (NumberFormatException ex) {
                continue;
            }
            break;
        }
    }
    
    public static Integer h(final String s) {
    Label_0033_Outer:
        while (true) {
            while (true) {
                long n = 0L;
                Label_0151: {
                    while (true) {
                        try {
                            if (s.startsWith("&H")) {
                                n = Long.parseLong(s.substring(2), 16);
                                break Label_0151;
                            }
                            n = Long.parseLong(s);
                            break Label_0151;
                            final StringBuilder sb = new StringBuilder();
                            sb.append("Failed to parse color expression: '");
                            sb.append(s);
                            sb.append("'");
                            final IllegalArgumentException ex;
                            o.i("SsaStyle", sb.toString(), ex);
                            return null;
                            final boolean b;
                            g0.a.a(b);
                            return Color.argb(f.d((n >> 24 & 0xFFL) ^ 0xFFL), f.d(n & 0xFFL), f.d(n >> 8 & 0xFFL), f.d(n >> 16 & 0xFFL));
                        }
                        catch (IllegalArgumentException ex) {
                            continue Label_0033_Outer;
                        }
                        break;
                    }
                }
                final boolean b = n <= 4294967295L;
                continue;
            }
        }
    }
    
    public static float i(final String s) {
        try {
            return Float.parseFloat(s);
        }
        catch (NumberFormatException ex) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Failed to parse font size: '");
            sb.append(s);
            sb.append("'");
            o.i("SsaStyle", sb.toString(), ex);
            return -3.4028235E38f;
        }
    }
    
    public static final class a
    {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        public final int h;
        public final int i;
        public final int j;
        public final int k;
        
        public a(final int a, final int b, final int c, final int d, final int e, final int f, final int g, final int h, final int i, final int j, final int k) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
            this.f = f;
            this.g = g;
            this.h = h;
            this.i = i;
            this.j = j;
            this.k = k;
        }
        
        public static a a(final String s) {
            final String[] split = TextUtils.split(s.substring(7), ",");
            final int n2;
            int n = n2 = -1;
            int n4;
            final int n3 = n4 = n2;
            int n6;
            int n5 = n6 = n4;
            int n8;
            int n7 = n8 = n6;
            int n10;
            int n9 = n10 = n8;
            final int n11 = 0;
            int n12 = n3;
            int n13 = n2;
            for (int i = n11; i < split.length; ++i) {
                final String e = W2.c.e(split[i].trim());
                e.hashCode();
                int n14 = 0;
                Label_0362: {
                    switch (e) {
                        case "outlinecolour": {
                            n14 = 9;
                            break Label_0362;
                        }
                        case "alignment": {
                            n14 = 8;
                            break Label_0362;
                        }
                        case "borderstyle": {
                            n14 = 7;
                            break Label_0362;
                        }
                        case "fontsize": {
                            n14 = 6;
                            break Label_0362;
                        }
                        case "name": {
                            n14 = 5;
                            break Label_0362;
                        }
                        case "bold": {
                            n14 = 4;
                            break Label_0362;
                        }
                        case "primarycolour": {
                            n14 = 3;
                            break Label_0362;
                        }
                        case "strikeout": {
                            n14 = 2;
                            break Label_0362;
                        }
                        case "underline": {
                            n14 = 1;
                            break Label_0362;
                        }
                        case "italic": {
                            n14 = 0;
                            break Label_0362;
                        }
                        default:
                            break;
                    }
                    n14 = -1;
                }
                switch (n14) {
                    case 9: {
                        n4 = i;
                        break;
                    }
                    case 8: {
                        n13 = i;
                        break;
                    }
                    case 7: {
                        n10 = i;
                        break;
                    }
                    case 6: {
                        n5 = i;
                        break;
                    }
                    case 5: {
                        n = i;
                        break;
                    }
                    case 4: {
                        n6 = i;
                        break;
                    }
                    case 3: {
                        n12 = i;
                        break;
                    }
                    case 2: {
                        n9 = i;
                        break;
                    }
                    case 1: {
                        n8 = i;
                        break;
                    }
                    case 0: {
                        n7 = i;
                        break;
                    }
                }
            }
            if (n != -1) {
                return new a(n, n13, n12, n4, n5, n6, n7, n8, n9, n10, split.length);
            }
            return null;
        }
    }
    
    public static final class b
    {
        public static final Pattern c;
        public static final Pattern d;
        public static final Pattern e;
        public static final Pattern f;
        public final int a;
        public final PointF b;
        
        static {
            c = Pattern.compile("\\{([^}]*)\\}");
            d = Pattern.compile(M.G("\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
            e = Pattern.compile(M.G("\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
            f = Pattern.compile("\\\\an(\\d+)");
        }
        
        public b(final int a, final PointF b) {
            this.a = a;
            this.b = b;
        }
        
        public static int a(final String input) {
            final Matcher matcher = b.f.matcher(input);
            if (matcher.find()) {
                return e((String)g0.a.e(matcher.group(1)));
            }
            return -1;
        }
        
        public static b b(final String p0) {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     3: aload_0        
            //     4: invokevirtual   java/util/regex/Pattern.matcher:(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
            //     7: astore          5
            //     9: aconst_null    
            //    10: astore_0       
            //    11: iconst_m1      
            //    12: istore_1       
            //    13: aload           5
            //    15: invokevirtual   java/util/regex/Matcher.find:()Z
            //    18: ifeq            72
            //    21: aload           5
            //    23: iconst_1       
            //    24: invokevirtual   java/util/regex/Matcher.group:(I)Ljava/lang/String;
            //    27: invokestatic    g0/a.e:(Ljava/lang/Object;)Ljava/lang/Object;
            //    30: checkcast       Ljava/lang/String;
            //    33: astore          6
            //    35: aload           6
            //    37: invokestatic    g1/c$b.c:(Ljava/lang/String;)Landroid/graphics/PointF;
            //    40: astore          4
            //    42: aload_0        
            //    43: astore_3       
            //    44: aload           4
            //    46: ifnull          52
            //    49: aload           4
            //    51: astore_3       
            //    52: aload           6
            //    54: invokestatic    g1/c$b.a:(Ljava/lang/String;)I
            //    57: istore_2       
            //    58: aload_3        
            //    59: astore_0       
            //    60: iload_2        
            //    61: iconst_m1      
            //    62: if_icmpeq       13
            //    65: iload_2        
            //    66: istore_1       
            //    67: aload_3        
            //    68: astore_0       
            //    69: goto            13
            //    72: new             Lg1/c$b;
            //    75: dup            
            //    76: iload_1        
            //    77: aload_0        
            //    78: invokespecial   g1/c$b.<init>:(ILandroid/graphics/PointF;)V
            //    81: areturn        
            //    82: astore_3       
            //    83: aload_0        
            //    84: astore_3       
            //    85: goto            52
            //    88: astore_0       
            //    89: aload_3        
            //    90: astore_0       
            //    91: goto            13
            //    Exceptions:
            //  Try           Handler
            //  Start  End    Start  End    Type                        
            //  -----  -----  -----  -----  ----------------------------
            //  35     42     82     88     Ljava/lang/RuntimeException;
            //  52     58     88     94     Ljava/lang/RuntimeException;
            // 
            // The error that occurred was:
            // 
            // java.lang.IllegalStateException: Expression is linked from several locations: Label_0052:
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
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:576)
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
        
        public static PointF c(String str) {
            final Matcher matcher = b.d.matcher(str);
            final Matcher matcher2 = b.e.matcher(str);
            final boolean find = matcher.find();
            final boolean find2 = matcher2.find();
            String s;
            if (find) {
                if (find2) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='");
                    sb.append(str);
                    sb.append("'");
                    o.f("SsaStyle.Overrides", sb.toString());
                }
                s = matcher.group(1);
                str = matcher.group(2);
            }
            else {
                if (!find2) {
                    return null;
                }
                s = matcher2.group(1);
                str = matcher2.group(2);
            }
            return new PointF(Float.parseFloat(((String)g0.a.e(s)).trim()), Float.parseFloat(((String)g0.a.e(str)).trim()));
        }
        
        public static String d(final String input) {
            return b.c.matcher(input).replaceAll("");
        }
    }
}
