// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package A;

import android.util.Log;
import android.graphics.Path;
import java.util.ArrayList;

public abstract class g
{
    public static void a(final ArrayList list, final char c, final float[] array) {
        list.add(new b(c, array));
    }
    
    public static boolean b(final b[] array, final b[] array2) {
        if (array == null) {
            return false;
        }
        if (array2 == null) {
            return false;
        }
        if (array.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array.length; ++i) {
            final b b = array[i];
            final char a = b.a;
            final b b2 = array2[i];
            if (a != b2.a) {
                return false;
            }
            if (b.b.length != b2.b.length) {
                return false;
            }
        }
        return true;
    }
    
    public static float[] c(final float[] array, final int n, int a) {
        if (n > a) {
            throw new IllegalArgumentException();
        }
        final int length = array.length;
        if (n >= 0 && n <= length) {
            a -= n;
            final int min = Math.min(a, length - n);
            final float[] array2 = new float[a];
            System.arraycopy(array, n, array2, 0, min);
            return array2;
        }
        throw new ArrayIndexOutOfBoundsException();
    }
    
    public static b[] d(final String s) {
        if (s == null) {
            return null;
        }
        final ArrayList list = new ArrayList();
        int i = 1;
        int n = 0;
        while (i < s.length()) {
            final int j = i(s, i);
            final String trim = s.substring(n, j).trim();
            if (trim.length() > 0) {
                a(list, trim.charAt(0), h(trim));
            }
            n = j;
            i = j + 1;
        }
        if (i - n == 1 && n < s.length()) {
            a(list, s.charAt(n), new float[0]);
        }
        return list.toArray(new b[list.size()]);
    }
    
    public static Path e(final String str) {
        final Path path = new Path();
        final b[] d = d(str);
        if (d != null) {
            try {
                b.e(d, path);
                return path;
            }
            catch (RuntimeException cause) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Error in parsing ");
                sb.append(str);
                throw new RuntimeException(sb.toString(), cause);
            }
        }
        return null;
    }
    
    public static b[] f(final b[] array) {
        if (array == null) {
            return null;
        }
        final b[] array2 = new b[array.length];
        for (int i = 0; i < array.length; ++i) {
            array2[i] = new b(array[i]);
        }
        return array2;
    }
    
    public static void g(final String s, final int n, final a a) {
        a.b = false;
        int i = n;
        final boolean b = false;
        int n2;
        boolean b2 = (n2 = (b ? 1 : 0)) != 0;
        int n3 = b ? 1 : 0;
        while (i < s.length()) {
            final char char1 = s.charAt(i);
            Label_0137: {
                Label_0109: {
                    if (char1 != ' ') {
                        if (char1 != 'E' && char1 != 'e') {
                            Label_0130: {
                                switch (char1) {
                                    default: {
                                        break Label_0130;
                                    }
                                    case 46: {
                                        if (n2 == 0) {
                                            n3 = 0;
                                            n2 = 1;
                                            break Label_0137;
                                        }
                                        break;
                                    }
                                    case 44: {
                                        break Label_0109;
                                    }
                                    case 45: {
                                        if (i != n && n3 == 0) {
                                            break;
                                        }
                                        break Label_0130;
                                    }
                                }
                                a.b = true;
                                break Label_0109;
                            }
                            n3 = 0;
                            break Label_0137;
                        }
                        n3 = 1;
                        break Label_0137;
                    }
                }
                n3 = 0;
                b2 = true;
            }
            if (b2) {
                break;
            }
            ++i;
        }
        a.a = i;
    }
    
    public static float[] h(final String str) {
        Label_0174: {
            if (str.charAt(0) == 'z' || str.charAt(0) == 'Z') {
                break Label_0174;
            }
            while (true) {
                while (true) {
                    int a2 = 0;
                    int n2 = 0;
                    Label_0183: {
                        while (true) {
                            try {
                                final float[] array = new float[str.length()];
                                final a a = new a();
                                final int length = str.length();
                                int i = 1;
                                int n = 0;
                                while (i < length) {
                                    g(str, i, a);
                                    a2 = a.a;
                                    n2 = n;
                                    if (i < a2) {
                                        array[n] = Float.parseFloat(str.substring(i, a2));
                                        n2 = n + 1;
                                    }
                                    if (!a.b) {
                                        break Label_0183;
                                    }
                                    i = a2;
                                    n = n2;
                                }
                                return c(array, 0, n);
                                return new float[0];
                                final StringBuilder sb = new StringBuilder();
                                sb.append("error in parsing \"");
                                sb.append(str);
                                sb.append("\"");
                                final NumberFormatException cause;
                                throw new RuntimeException(sb.toString(), cause);
                            }
                            catch (NumberFormatException ex) {}
                            final NumberFormatException ex;
                            final NumberFormatException cause = ex;
                            continue;
                        }
                    }
                    int i = a2 + 1;
                    int n = n2;
                    continue;
                }
            }
        }
    }
    
    public static int i(final String s, int i) {
        while (i < s.length()) {
            final char char1 = s.charAt(i);
            if (((char1 - 'A') * (char1 - 'Z') <= 0 || (char1 - 'a') * (char1 - 'z') <= 0) && char1 != 'e' && char1 != 'E') {
                return i;
            }
            ++i;
        }
        return i;
    }
    
    public static void j(final b[] array, final b[] array2) {
        for (int i = 0; i < array2.length; ++i) {
            array[i].a = array2[i].a;
            int n = 0;
            while (true) {
                final float[] b = array2[i].b;
                if (n >= b.length) {
                    break;
                }
                array[i].b[n] = b[n];
                ++n;
            }
        }
    }
    
    public static class a
    {
        public int a;
        public boolean b;
    }
    
    public static class b
    {
        public char a;
        public float[] b;
        
        public b(final char a, final float[] b) {
            this.a = a;
            this.b = b;
        }
        
        public b(final b b) {
            this.a = b.a;
            final float[] b2 = b.b;
            this.b = g.c(b2, 0, b2.length);
        }
        
        public static void a(final Path path, final float[] array, final char c, final char c2, final float[] array2) {
            final float n = array[0];
            final float n2 = array[1];
            final float n3 = array[2];
            final float n4 = array[3];
            final float n5 = array[4];
            final float n6 = array[5];
            float n7 = n;
            float n8 = n2;
            float n9 = n3;
            float n10 = n4;
            int n11 = 0;
            Label_0343: {
                switch (c2) {
                    case 'Z':
                    case 'z': {
                        path.close();
                        path.moveTo(n5, n6);
                        n7 = (n9 = n5);
                        n8 = (n10 = n6);
                    }
                    default: {
                        n10 = n4;
                        n9 = n3;
                        n8 = n2;
                        n7 = n;
                    }
                    case 'L':
                    case 'M':
                    case 'T':
                    case 'l':
                    case 'm':
                    case 't': {
                        n11 = 2;
                        break Label_0343;
                    }
                    case 'Q':
                    case 'S':
                    case 'q':
                    case 's': {
                        n11 = 4;
                        n7 = n;
                        n8 = n2;
                        n9 = n3;
                        n10 = n4;
                        break Label_0343;
                    }
                    case 'H':
                    case 'V':
                    case 'h':
                    case 'v': {
                        n11 = 1;
                        n7 = n;
                        n8 = n2;
                        n9 = n3;
                        n10 = n4;
                        break Label_0343;
                    }
                    case 'C':
                    case 'c': {
                        n11 = 6;
                        break;
                    }
                    case 'A':
                    case 'a': {
                        n11 = 7;
                        break;
                    }
                }
                n7 = n;
                n8 = n2;
                n9 = n3;
                n10 = n4;
            }
            final int n12 = 0;
            char c3 = c;
            float n13 = n6;
            float n14 = n5;
            float n25;
        Label_0496_Outer:
            for (int i = n12; i < array2.length; i += n11, c3 = c2, n13 = n25) {
                if (c2 != 'A') {
                    if (c2 == 'C') {
                        final int n15 = i;
                        final float n16 = array2[n15];
                        final float n17 = array2[n15 + 1];
                        final int n18 = n15 + 2;
                        final float n19 = array2[n18];
                        final int n20 = n15 + 3;
                        final float n21 = array2[n20];
                        final int n22 = n15 + 4;
                        final float n23 = array2[n22];
                        final int n24 = n15 + 5;
                        path.cubicTo(n16, n17, n19, n21, n23, array2[n24]);
                        n7 = array2[n22];
                        n8 = array2[n24];
                        n9 = array2[n18];
                        n10 = array2[n20];
                        n25 = n13;
                        continue;
                    }
                    if (c2 == 'H') {
                        final int n26 = i;
                        path.lineTo(array2[n26], n8);
                        n7 = array2[n26];
                        n25 = n13;
                        continue;
                    }
                    if (c2 == 'Q') {
                        final int n27 = i;
                        final float n28 = array2[n27];
                        final int n29 = n27 + 1;
                        final float n30 = array2[n29];
                        final int n31 = n27 + 2;
                        final float n32 = array2[n31];
                        final int n33 = n27 + 3;
                        path.quadTo(n28, n30, n32, array2[n33]);
                        n9 = array2[n27];
                        n10 = array2[n29];
                        n7 = array2[n31];
                        n8 = array2[n33];
                        n25 = n13;
                        continue;
                    }
                    if (c2 == 'V') {
                        final int n34 = i;
                        path.lineTo(n7, array2[n34]);
                        n8 = array2[n34];
                        n25 = n13;
                        continue;
                    }
                    if (c2 != 'a') {
                        while (true) {
                            float n45 = 0.0f;
                            float n48 = 0.0f;
                            float n64 = 0.0f;
                            Label_0786: {
                                float n46 = 0.0f;
                                float n47 = 0.0f;
                                Label_0775: {
                                    if (c2 == 'c') {
                                        final float n35 = array2[i];
                                        final float n36 = array2[i + 1];
                                        final int n37 = i + 2;
                                        final float n38 = array2[n37];
                                        final int n39 = i + 3;
                                        final float n40 = array2[n39];
                                        final int n41 = i + 4;
                                        final float n42 = array2[n41];
                                        final int n43 = i + 5;
                                        path.rCubicTo(n35, n36, n38, n40, n42, array2[n43]);
                                        final float n44 = array2[n37] + n7;
                                        n45 = array2[n39] + n8;
                                        n46 = n7 + array2[n41];
                                        n47 = array2[n43];
                                        n48 = n44;
                                        break Label_0775;
                                    }
                                    if (c2 != 'h') {
                                        if (c2 == 'q') {
                                            final float n49 = array2[i];
                                            final int n50 = i + 1;
                                            final float n51 = array2[n50];
                                            final int n52 = i + 2;
                                            final float n53 = array2[n52];
                                            final int n54 = i + 3;
                                            path.rQuadTo(n49, n51, n53, array2[n54]);
                                            final float n55 = array2[i] + n7;
                                            n45 = array2[n50] + n8;
                                            n46 = n7 + array2[n52];
                                            n47 = array2[n54];
                                            n48 = n55;
                                            break Label_0775;
                                        }
                                        float n71 = 0.0f;
                                        Label_0901: {
                                            if (c2 != 'v') {
                                                if (c2 != 'L') {
                                                    if (c2 != 'M') {
                                                        if (c2 == 'S') {
                                                            while (true) {
                                                                Label_1061: {
                                                                    if (c3 == 'c' || c3 == 's' || c3 == 'C') {
                                                                        break Label_1061;
                                                                    }
                                                                    final float n56 = n8;
                                                                    final float n57 = n7;
                                                                    if (c3 == 'S') {
                                                                        break Label_1061;
                                                                    }
                                                                    final float n58 = array2[i];
                                                                    final int n59 = i + 1;
                                                                    final float n60 = array2[n59];
                                                                    final int n61 = i + 2;
                                                                    final float n62 = array2[n61];
                                                                    final int n63 = i + 3;
                                                                    path.cubicTo(n57, n56, n58, n60, n62, array2[n63]);
                                                                    n48 = array2[i];
                                                                    n45 = array2[n59];
                                                                    n64 = array2[n61];
                                                                    n8 = array2[n63];
                                                                    break Label_0786;
                                                                }
                                                                final float n57 = n7 * 2.0f - n9;
                                                                final float n56 = n8 * 2.0f - n10;
                                                                continue Label_0496_Outer;
                                                            }
                                                        }
                                                        if (c2 == 'T') {
                                                            float n65 = 0.0f;
                                                            float n66 = 0.0f;
                                                            Label_0965: {
                                                                if (c3 != 'q' && c3 != 't' && c3 != 'Q') {
                                                                    n65 = n8;
                                                                    n66 = n7;
                                                                    if (c3 != 'T') {
                                                                        break Label_0965;
                                                                    }
                                                                }
                                                                n66 = n7 * 2.0f - n9;
                                                                n65 = n8 * 2.0f - n10;
                                                            }
                                                            final float n67 = array2[i];
                                                            final int n68 = i + 1;
                                                            path.quadTo(n66, n65, n67, array2[n68]);
                                                            n7 = array2[i];
                                                            n8 = array2[n68];
                                                            n10 = n65;
                                                            n9 = n66;
                                                            n25 = n13;
                                                            continue Label_0496_Outer;
                                                        }
                                                        if (c2 == 'l') {
                                                            final float n69 = array2[i];
                                                            final int n70 = i + 1;
                                                            path.rLineTo(n69, array2[n70]);
                                                            n7 += array2[i];
                                                            n71 = array2[n70];
                                                            break Label_0901;
                                                        }
                                                        if (c2 != 'm') {
                                                            if (c2 == 's') {
                                                                float n72;
                                                                float n73;
                                                                if (c3 != 'c' && c3 != 's' && c3 != 'C' && c3 != 'S') {
                                                                    n72 = 0.0f;
                                                                    n73 = 0.0f;
                                                                }
                                                                else {
                                                                    n73 = n8 - n10;
                                                                    n72 = n7 - n9;
                                                                }
                                                                final float n74 = array2[i];
                                                                final int n75 = i + 1;
                                                                final float n76 = array2[n75];
                                                                final int n77 = i + 2;
                                                                final float n78 = array2[n77];
                                                                final int n79 = i + 3;
                                                                path.rCubicTo(n72, n73, n74, n76, n78, array2[n79]);
                                                                final float n80 = array2[i] + n7;
                                                                n45 = array2[n75] + n8;
                                                                n46 = n7 + array2[n77];
                                                                n47 = array2[n79];
                                                                n48 = n80;
                                                                break Label_0775;
                                                            }
                                                            if (c2 != 't') {
                                                                break Label_0496;
                                                            }
                                                            float n81;
                                                            float n82;
                                                            if (c3 != 'q' && c3 != 't' && c3 != 'Q' && c3 != 'T') {
                                                                n81 = 0.0f;
                                                                n82 = 0.0f;
                                                            }
                                                            else {
                                                                n82 = n7 - n9;
                                                                n81 = n8 - n10;
                                                            }
                                                            final float n83 = array2[i];
                                                            final int n84 = i + 1;
                                                            path.rQuadTo(n82, n81, n83, array2[n84]);
                                                            final float n85 = n7 + array2[i];
                                                            final float n86 = n8 + array2[n84];
                                                            n10 = n81 + n8;
                                                            n9 = n82 + n7;
                                                            n8 = n86;
                                                            n7 = n85;
                                                            break Label_0496;
                                                        }
                                                        else {
                                                            final float n87 = array2[i];
                                                            n7 += n87;
                                                            final float n88 = array2[i + 1];
                                                            n8 += n88;
                                                            if (i > 0) {
                                                                path.rLineTo(n87, n88);
                                                                break Label_0496;
                                                            }
                                                            path.rMoveTo(n87, n88);
                                                        }
                                                    }
                                                    else {
                                                        n7 = array2[i];
                                                        n8 = array2[i + 1];
                                                        if (i > 0) {
                                                            path.lineTo(n7, n8);
                                                            break Label_0496;
                                                        }
                                                        path.moveTo(n7, n8);
                                                    }
                                                    n25 = n8;
                                                    n14 = n7;
                                                    continue Label_0496_Outer;
                                                }
                                                final float n89 = array2[i];
                                                final int n90 = i + 1;
                                                path.lineTo(n89, array2[n90]);
                                                n7 = array2[i];
                                                n8 = array2[n90];
                                                break Label_0496;
                                            }
                                            else {
                                                path.rLineTo(0.0f, array2[i]);
                                                n71 = array2[i];
                                            }
                                        }
                                        n8 += n71;
                                    }
                                    else {
                                        path.rLineTo(array2[i], 0.0f);
                                        n7 += array2[i];
                                    }
                                    n25 = n13;
                                    continue Label_0496_Outer;
                                }
                                n8 += n47;
                                n64 = n46;
                            }
                            n10 = n45;
                            n9 = n48;
                            n7 = n64;
                            continue;
                        }
                    }
                    final int n91 = i + 5;
                    final float n92 = array2[n91];
                    final int n93 = i + 6;
                    c(path, n7, n8, n92 + n7, array2[n93] + n8, array2[i], array2[i + 1], array2[i + 2], array2[i + 3] != 0.0f, array2[i + 4] != 0.0f);
                    n7 += array2[n91];
                    n8 += array2[n93];
                }
                else {
                    final int n94 = i;
                    final int n95 = n94 + 5;
                    final float n96 = array2[n95];
                    final int n97 = n94 + 6;
                    c(path, n7, n8, n96, array2[n97], array2[n94], array2[n94 + 1], array2[n94 + 2], array2[n94 + 3] != 0.0f, array2[n94 + 4] != 0.0f);
                    n7 = array2[n95];
                    n8 = array2[n97];
                }
                n10 = n8;
                n9 = n7;
                n25 = n13;
            }
            array[0] = n7;
            array[1] = n8;
            array[2] = n9;
            array[3] = n10;
            array[4] = n14;
            array[5] = n13;
        }
        
        public static void b(final Path path, final double n, final double n2, final double n3, double n4, double n5, double n6, double n7, double n8, double n9) {
            final int n10 = (int)Math.ceil(Math.abs(n9 * 4.0 / 3.141592653589793));
            final double cos = Math.cos(n7);
            final double sin = Math.sin(n7);
            final double cos2 = Math.cos(n8);
            final double sin2 = Math.sin(n8);
            n7 = -n3;
            final double n11 = n7 * cos;
            final double n12 = n4 * sin;
            n7 *= sin;
            final double n13 = n4 * cos;
            final double n14 = n9 / n10;
            double n15 = sin2 * n7 + cos2 * n13;
            double n16 = n11 * sin2 - n12 * cos2;
            int i = 0;
            double n17 = n8;
            n9 = n6;
            n4 = n7;
            n8 = n5;
            n7 = n14;
            n6 = sin;
            n5 = cos;
            while (i < n10) {
                final double n18 = n17 + n7;
                final double sin3 = Math.sin(n18);
                final double cos3 = Math.cos(n18);
                final double n19 = n + n3 * n5 * cos3 - n12 * sin3;
                final double n20 = n2 + n3 * n6 * cos3 + n13 * sin3;
                final double n21 = n11 * sin3 - n12 * cos3;
                final double n22 = sin3 * n4 + cos3 * n13;
                final double a = n18 - n17;
                final double tan = Math.tan(a / 2.0);
                final double n23 = Math.sin(a) * (Math.sqrt(tan * 3.0 * tan + 4.0) - 1.0) / 3.0;
                path.rLineTo(0.0f, 0.0f);
                path.cubicTo((float)(n8 + n16 * n23), (float)(n9 + n15 * n23), (float)(n19 - n23 * n21), (float)(n20 - n23 * n22), (float)n19, (float)n20);
                ++i;
                n8 = n19;
                n17 = n18;
                n15 = n22;
                n16 = n21;
                n9 = n20;
            }
        }
        
        public static void c(final Path path, final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7, final boolean b, final boolean b2) {
            final double radians = Math.toRadians(n7);
            final double cos = Math.cos(radians);
            final double sin = Math.sin(radians);
            final double n8 = n;
            final double n9 = n2;
            final double n10 = n5;
            final double n11 = (n8 * cos + n9 * sin) / n10;
            final double n12 = -n;
            final double n13 = n6;
            final double n14 = (n12 * sin + n9 * cos) / n13;
            final double n15 = n3;
            final double n16 = n4;
            final double n17 = (n15 * cos + n16 * sin) / n10;
            final double n18 = (-n3 * sin + n16 * cos) / n13;
            final double n19 = n11 - n17;
            final double n20 = n14 - n18;
            final double n21 = (n11 + n17) / 2.0;
            final double n22 = (n14 + n18) / 2.0;
            final double n23 = n19 * n19 + n20 * n20;
            if (n23 == 0.0) {
                Log.w("PathParser", " Points are coincident");
                return;
            }
            final double a = 1.0 / n23 - 0.25;
            if (a < 0.0) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Points are too far apart ");
                sb.append(n23);
                Log.w("PathParser", sb.toString());
                final float n24 = (float)(Math.sqrt(n23) / 1.99999);
                c(path, n, n2, n3, n4, n5 * n24, n6 * n24, n7, b, b2);
                return;
            }
            final double sqrt = Math.sqrt(a);
            final double n25 = n19 * sqrt;
            final double n26 = sqrt * n20;
            double n27;
            double n28;
            if (b == b2) {
                n27 = n21 - n26;
                n28 = n22 + n25;
            }
            else {
                n27 = n21 + n26;
                n28 = n22 - n25;
            }
            final double atan2 = Math.atan2(n14 - n28, n11 - n27);
            final double n29 = Math.atan2(n18 - n28, n17 - n27) - atan2;
            final double n30 = dcmpl(n29, 0.0);
            final boolean b3 = n30 >= 0;
            double n31 = n29;
            if (b2 != b3) {
                if (n30 > 0) {
                    n31 = n29 - 6.283185307179586;
                }
                else {
                    n31 = n29 + 6.283185307179586;
                }
            }
            final double n32 = n27 * n10;
            final double n33 = n28 * n13;
            b(path, n32 * cos - n33 * sin, n32 * sin + n33 * cos, n10, n13, n8, n9, radians, atan2, n31);
        }
        
        public static void e(final b[] array, final Path path) {
            final float[] array2 = new float[6];
            char a = 'm';
            for (int i = 0; i < array.length; ++i) {
                final b b = array[i];
                a(path, array2, a, b.a, b.b);
                a = array[i].a;
            }
        }
        
        public void d(final b b, final b b2, final float n) {
            this.a = b.a;
            int n2 = 0;
            while (true) {
                final float[] b3 = b.b;
                if (n2 >= b3.length) {
                    break;
                }
                this.b[n2] = b3[n2] * (1.0f - n) + b2.b[n2] * n;
                ++n2;
            }
        }
    }
}
