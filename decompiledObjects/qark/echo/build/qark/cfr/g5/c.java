/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 */
package g5;

public final class c {
    public static final int[] e = new int[]{31892, 34236, 39577, 42195, 48118, 51042, 55367, 58893, 63784, 68472, 70749, 76311, 79154, 84390, 87683, 92361, 96236, 102084, 102881, 110507, 110734, 117786, 119615, 126325, 127568, 133589, 136944, 141498, 145311, 150283, 152622, 158308, 161089, 167017};
    public static final c[] f = c.a();
    public final int a;
    public final int[] b;
    public final b[] c;
    public final int d;

    public /* varargs */ c(int n8, int[] arrn, b ... object) {
        this.a = n8;
        this.b = arrn;
        this.c = object;
        int n9 = object[0].b();
        arrn = object[0].a();
        int n10 = arrn.length;
        int n11 = 0;
        for (n8 = 0; n8 < n10; ++n8) {
            object = arrn[n8];
            n11 += object.a() * (object.b() + n9);
        }
        this.d = n11;
    }

    public static c[] a() {
        Object object = new b(7, new a(1, 19));
        Object object2 = new b(10, new a(1, 16));
        Object object3 = new b(13, new a(1, 13));
        Object object4 = new b(17, new a(1, 9));
        object = new c(1, new int[0], new b[]{object, object2, object3, object4});
        object2 = new b(10, new a(1, 34));
        object3 = new b(16, new a(1, 28));
        object4 = new b(22, new a(1, 22));
        Object object5 = new b(28, new a(1, 16));
        object2 = new c(2, new int[]{6, 18}, new b[]{object2, object3, object4, object5});
        object3 = new b(15, new a(1, 55));
        object4 = new b(26, new a(1, 44));
        object5 = new b(18, new a(2, 17));
        Object object6 = new b(22, new a(2, 13));
        object3 = new c(3, new int[]{6, 22}, new b[]{object3, object4, object5, object6});
        object4 = new b(20, new a(1, 80));
        object5 = new b(18, new a(2, 32));
        object6 = new b(26, new a(2, 24));
        Object object7 = new b(16, new a(4, 9));
        object4 = new c(4, new int[]{6, 26}, new b[]{object4, object5, object6, object7});
        object5 = new b(26, new a(1, 108));
        object6 = new b(24, new a(2, 43));
        object7 = new b(18, new a(2, 15), new a(2, 16));
        Object object8 = new b(22, new a(2, 11), new a(2, 12));
        object5 = new c(5, new int[]{6, 30}, new b[]{object5, object6, object7, object8});
        object6 = new b(18, new a(2, 68));
        object7 = new b(16, new a(4, 27));
        object8 = new b(24, new a(4, 19));
        Object object9 = new b(28, new a(4, 15));
        object6 = new c(6, new int[]{6, 34}, new b[]{object6, object7, object8, object9});
        object7 = new b(20, new a(2, 78));
        object8 = new b(18, new a(4, 31));
        object9 = new b(18, new a(2, 14), new a(4, 15));
        Object object10 = new b(26, new a(4, 13), new a(1, 14));
        object7 = new c(7, new int[]{6, 22, 38}, new b[]{object7, object8, object9, object10});
        object8 = new b(24, new a(2, 97));
        object9 = new b(22, new a(2, 38), new a(2, 39));
        object10 = new b(22, new a(4, 18), new a(2, 19));
        Object object11 = new b(26, new a(4, 14), new a(2, 15));
        object8 = new c(8, new int[]{6, 24, 42}, new b[]{object8, object9, object10, object11});
        object9 = new b(30, new a(2, 116));
        object10 = new b(22, new a(3, 36), new a(2, 37));
        object11 = new b(20, new a(4, 16), new a(4, 17));
        Object object12 = new b(24, new a(4, 12), new a(4, 13));
        object9 = new c(9, new int[]{6, 26, 46}, new b[]{object9, object10, object11, object12});
        object10 = new b(18, new a(2, 68), new a(2, 69));
        object11 = new b(26, new a(4, 43), new a(1, 44));
        object12 = new b(24, new a(6, 19), new a(2, 20));
        Object object13 = new b(28, new a(6, 15), new a(2, 16));
        object10 = new c(10, new int[]{6, 28, 50}, new b[]{object10, object11, object12, object13});
        object11 = new b(20, new a(4, 81));
        object12 = new b(30, new a(1, 50), new a(4, 51));
        object13 = new b(28, new a(4, 22), new a(4, 23));
        Object object14 = new b(24, new a(3, 12), new a(8, 13));
        object11 = new c(11, new int[]{6, 30, 54}, new b[]{object11, object12, object13, object14});
        object12 = new b(24, new a(2, 92), new a(2, 93));
        object13 = new b(22, new a(6, 36), new a(2, 37));
        object14 = new b(26, new a(4, 20), new a(6, 21));
        Object object15 = new b(28, new a(7, 14), new a(4, 15));
        object12 = new c(12, new int[]{6, 32, 58}, new b[]{object12, object13, object14, object15});
        object13 = new b(26, new a(4, 107));
        object14 = new b(22, new a(8, 37), new a(1, 38));
        object15 = new b(24, new a(8, 20), new a(4, 21));
        Object object16 = new b(22, new a(12, 11), new a(4, 12));
        object13 = new c(13, new int[]{6, 34, 62}, new b[]{object13, object14, object15, object16});
        object14 = new b(30, new a(3, 115), new a(1, 116));
        object15 = new b(24, new a(4, 40), new a(5, 41));
        object16 = new b(20, new a(11, 16), new a(5, 17));
        Object object17 = new b(24, new a(11, 12), new a(5, 13));
        object14 = new c(14, new int[]{6, 26, 46, 66}, new b[]{object14, object15, object16, object17});
        object15 = new b(22, new a(5, 87), new a(1, 88));
        object16 = new b(24, new a(5, 41), new a(5, 42));
        object17 = new b(30, new a(5, 24), new a(7, 25));
        Object object18 = new b(24, new a(11, 12), new a(7, 13));
        object15 = new c(15, new int[]{6, 26, 48, 70}, new b[]{object15, object16, object17, object18});
        object16 = new b(24, new a(5, 98), new a(1, 99));
        object17 = new b(28, new a(7, 45), new a(3, 46));
        object18 = new b(24, new a(15, 19), new a(2, 20));
        Object object19 = new b(30, new a(3, 15), new a(13, 16));
        object16 = new c(16, new int[]{6, 26, 50, 74}, new b[]{object16, object17, object18, object19});
        object17 = new b(28, new a(1, 107), new a(5, 108));
        object18 = new b(28, new a(10, 46), new a(1, 47));
        object19 = new b(28, new a(1, 22), new a(15, 23));
        Object object20 = new b(28, new a(2, 14), new a(17, 15));
        object17 = new c(17, new int[]{6, 30, 54, 78}, new b[]{object17, object18, object19, object20});
        object18 = new b(30, new a(5, 120), new a(1, 121));
        object19 = new b(26, new a(9, 43), new a(4, 44));
        object20 = new b(28, new a(17, 22), new a(1, 23));
        Object object21 = new b(28, new a(2, 14), new a(19, 15));
        object18 = new c(18, new int[]{6, 30, 56, 82}, new b[]{object18, object19, object20, object21});
        object19 = new b(28, new a(3, 113), new a(4, 114));
        object20 = new b(26, new a(3, 44), new a(11, 45));
        object21 = new b(26, new a(17, 21), new a(4, 22));
        Object object22 = new b(26, new a(9, 13), new a(16, 14));
        object19 = new c(19, new int[]{6, 30, 58, 86}, new b[]{object19, object20, object21, object22});
        object20 = new b(28, new a(3, 107), new a(5, 108));
        object21 = new b(26, new a(3, 41), new a(13, 42));
        object22 = new b(30, new a(15, 24), new a(5, 25));
        Object object23 = new b(28, new a(15, 15), new a(10, 16));
        object20 = new c(20, new int[]{6, 34, 62, 90}, new b[]{object20, object21, object22, object23});
        object21 = new b(28, new a(4, 116), new a(4, 117));
        object22 = new b(26, new a(17, 42));
        object23 = new b(28, new a(17, 22), new a(6, 23));
        Object object24 = new b(30, new a(19, 16), new a(6, 17));
        object21 = new c(21, new int[]{6, 28, 50, 72, 94}, new b[]{object21, object22, object23, object24});
        object22 = new b(28, new a(2, 111), new a(7, 112));
        object23 = new b(28, new a(17, 46));
        object24 = new b(30, new a(7, 24), new a(16, 25));
        Object object25 = new b(24, new a(34, 13));
        object22 = new c(22, new int[]{6, 26, 50, 74, 98}, new b[]{object22, object23, object24, object25});
        object23 = new b(30, new a(4, 121), new a(5, 122));
        object24 = new b(28, new a(4, 47), new a(14, 48));
        object25 = new b(30, new a(11, 24), new a(14, 25));
        Object object26 = new b(30, new a(16, 15), new a(14, 16));
        object23 = new c(23, new int[]{6, 30, 54, 78, 102}, new b[]{object23, object24, object25, object26});
        object24 = new b(30, new a(6, 117), new a(4, 118));
        object25 = new b(28, new a(6, 45), new a(14, 46));
        object26 = new b(30, new a(11, 24), new a(16, 25));
        Object object27 = new b(30, new a(30, 16), new a(2, 17));
        object24 = new c(24, new int[]{6, 28, 54, 80, 106}, new b[]{object24, object25, object26, object27});
        object25 = new b(26, new a(8, 106), new a(4, 107));
        object26 = new b(28, new a(8, 47), new a(13, 48));
        object27 = new b(30, new a(7, 24), new a(22, 25));
        Object object28 = new b(30, new a(22, 15), new a(13, 16));
        object25 = new c(25, new int[]{6, 32, 58, 84, 110}, new b[]{object25, object26, object27, object28});
        object26 = new b(28, new a(10, 114), new a(2, 115));
        object27 = new b(28, new a(19, 46), new a(4, 47));
        object28 = new b(28, new a(28, 22), new a(6, 23));
        Object object29 = new b(30, new a(33, 16), new a(4, 17));
        object26 = new c(26, new int[]{6, 30, 58, 86, 114}, new b[]{object26, object27, object28, object29});
        object27 = new b(30, new a(8, 122), new a(4, 123));
        object28 = new b(28, new a(22, 45), new a(3, 46));
        object29 = new b(30, new a(8, 23), new a(26, 24));
        Object object30 = new b(30, new a(12, 15), new a(28, 16));
        object27 = new c(27, new int[]{6, 34, 62, 90, 118}, new b[]{object27, object28, object29, object30});
        object28 = new b(30, new a(3, 117), new a(10, 118));
        object29 = new b(28, new a(3, 45), new a(23, 46));
        object30 = new b(30, new a(4, 24), new a(31, 25));
        Object object31 = new b(30, new a(11, 15), new a(31, 16));
        object28 = new c(28, new int[]{6, 26, 50, 74, 98, 122}, new b[]{object28, object29, object30, object31});
        object29 = new b(30, new a(7, 116), new a(7, 117));
        object30 = new b(28, new a(21, 45), new a(7, 46));
        object31 = new b(30, new a(1, 23), new a(37, 24));
        Object object32 = new b(30, new a(19, 15), new a(26, 16));
        object29 = new c(29, new int[]{6, 30, 54, 78, 102, 126}, new b[]{object29, object30, object31, object32});
        object30 = new b(30, new a(5, 115), new a(10, 116));
        object31 = new b(28, new a(19, 47), new a(10, 48));
        object32 = new b(30, new a(15, 24), new a(25, 25));
        Object object33 = new b(30, new a(23, 15), new a(25, 16));
        object30 = new c(30, new int[]{6, 26, 52, 78, 104, 130}, new b[]{object30, object31, object32, object33});
        object31 = new b(30, new a(13, 115), new a(3, 116));
        object32 = new b(28, new a(2, 46), new a(29, 47));
        object33 = new b(30, new a(42, 24), new a(1, 25));
        Object object34 = new b(30, new a(23, 15), new a(28, 16));
        object31 = new c(31, new int[]{6, 30, 56, 82, 108, 134}, new b[]{object31, object32, object33, object34});
        object32 = new b(30, new a(17, 115));
        object33 = new b(28, new a(10, 46), new a(23, 47));
        object34 = new b(30, new a(10, 24), new a(35, 25));
        Object object35 = new b(30, new a(19, 15), new a(35, 16));
        object32 = new c(32, new int[]{6, 34, 60, 86, 112, 138}, new b[]{object32, object33, object34, object35});
        object33 = new b(30, new a(17, 115), new a(1, 116));
        object34 = new b(28, new a(14, 46), new a(21, 47));
        object35 = new b(30, new a(29, 24), new a(19, 25));
        Object object36 = new b(30, new a(11, 15), new a(46, 16));
        object33 = new c(33, new int[]{6, 30, 58, 86, 114, 142}, new b[]{object33, object34, object35, object36});
        object34 = new b(30, new a(13, 115), new a(6, 116));
        object35 = new b(28, new a(14, 46), new a(23, 47));
        object36 = new b(30, new a(44, 24), new a(7, 25));
        Object object37 = new b(30, new a(59, 16), new a(1, 17));
        object34 = new c(34, new int[]{6, 34, 62, 90, 118, 146}, new b[]{object34, object35, object36, object37});
        object35 = new b(30, new a(12, 121), new a(7, 122));
        object36 = new b(28, new a(12, 47), new a(26, 48));
        object37 = new b(30, new a(39, 24), new a(14, 25));
        Object object38 = new b(30, new a(22, 15), new a(41, 16));
        object35 = new c(35, new int[]{6, 30, 54, 78, 102, 126, 150}, new b[]{object35, object36, object37, object38});
        object36 = new b(30, new a(6, 121), new a(14, 122));
        object37 = new b(28, new a(6, 47), new a(34, 48));
        object38 = new b(30, new a(46, 24), new a(10, 25));
        Object object39 = new b(30, new a(2, 15), new a(64, 16));
        object36 = new c(36, new int[]{6, 24, 50, 76, 102, 128, 154}, new b[]{object36, object37, object38, object39});
        object37 = new b(30, new a(17, 122), new a(4, 123));
        object38 = new b(28, new a(29, 46), new a(14, 47));
        object39 = new b(30, new a(49, 24), new a(10, 25));
        b b8 = new b(30, new a(24, 15), new a(46, 16));
        object37 = new c(37, new int[]{6, 28, 54, 80, 106, 132, 158}, new b[]{object37, object38, object39, b8});
        object38 = new b(30, new a(4, 122), new a(18, 123));
        object39 = new b(28, new a(13, 46), new a(32, 47));
        b8 = new b(30, new a(48, 24), new a(14, 25));
        b b9 = new b(30, new a(42, 15), new a(32, 16));
        object38 = new c(38, new int[]{6, 32, 58, 84, 110, 136, 162}, new b[]{object38, object39, b8, b9});
        object39 = new b(30, new a(20, 117), new a(4, 118));
        b8 = new b(28, new a(40, 47), new a(7, 48));
        b9 = new b(30, new a(43, 24), new a(22, 25));
        b b10 = new b(30, new a(10, 15), new a(67, 16));
        object39 = new c(39, new int[]{6, 26, 54, 82, 110, 138, 166}, new b[]{object39, b8, b9, b10});
        b8 = new b(30, new a(19, 118), new a(6, 119));
        b9 = new b(28, new a(18, 47), new a(31, 48));
        b10 = new b(30, new a(34, 24), new a(34, 25));
        b b11 = new b(30, new a(20, 15), new a(61, 16));
        return new c[]{object, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11, object12, object13, object14, object15, object16, object17, object18, object19, object20, object21, object22, object23, object24, object25, object26, object27, object28, object29, object30, object31, object32, object33, object34, object35, object36, object37, object38, object39, new c(40, new int[]{6, 30, 58, 86, 114, 142, 170}, b8, b9, b10, b11)};
    }

    public static c e(int n8) {
        if (n8 > 0 && n8 <= 40) {
            return f[n8 - 1];
        }
        throw new IllegalArgumentException();
    }

    public int b() {
        return this.a * 4 + 17;
    }

    public b c(g5.a a8) {
        return this.c[a8.ordinal()];
    }

    public int d() {
        return this.d;
    }

    public int f() {
        return this.a;
    }

    public String toString() {
        return String.valueOf((int)this.a);
    }

    public static final class a {
        public final int a;
        public final int b;

        public a(int n8, int n9) {
            this.a = n8;
            this.b = n9;
        }

        public int a() {
            return this.a;
        }

        public int b() {
            return this.b;
        }
    }

    public static final class b {
        public final int a;
        public final a[] b;

        public /* varargs */ b(int n8, a ... arra) {
            this.a = n8;
            this.b = arra;
        }

        public a[] a() {
            return this.b;
        }

        public int b() {
            return this.a;
        }

        public int c() {
            a[] arra = this.b;
            int n8 = arra.length;
            int n9 = 0;
            for (int i8 = 0; i8 < n8; ++i8) {
                n9 += arra[i8].a();
            }
            return n9;
        }

        public int d() {
            return this.a * this.c();
        }
    }

}

