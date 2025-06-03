// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package e1;

import java.util.ArrayList;
import android.graphics.Bitmap$Config;
import X2.v;
import c1.e;
import g0.g;
import c1.s;
import c1.k;
import g0.o;
import android.util.SparseArray;
import g0.M;
import g0.y;
import android.graphics.PathEffect;
import android.graphics.Xfermode;
import android.graphics.PorterDuffXfermode;
import android.graphics.PorterDuff$Mode;
import android.graphics.Paint$Style;
import g0.z;
import java.util.List;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import c1.t;

public final class a implements t
{
    public static final byte[] h;
    public static final byte[] i;
    public static final byte[] j;
    public final Paint a;
    public final Paint b;
    public final Canvas c;
    public final b d;
    public final a e;
    public final h f;
    public Bitmap g;
    
    static {
        h = new byte[] { 0, 7, 8, 15 };
        i = new byte[] { 0, 119, -120, -1 };
        j = new byte[] { 0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1 };
    }
    
    public a(final List list) {
        final z z = new z(list.get(0));
        final int m = z.M();
        final int i = z.M();
        final Paint a = new Paint();
        (this.a = a).setStyle(Paint$Style.FILL_AND_STROKE);
        a.setXfermode((Xfermode)new PorterDuffXfermode(PorterDuff$Mode.SRC));
        a.setPathEffect((PathEffect)null);
        final Paint b = new Paint();
        (this.b = b).setStyle(Paint$Style.FILL);
        b.setXfermode((Xfermode)new PorterDuffXfermode(PorterDuff$Mode.DST_OVER));
        b.setPathEffect((PathEffect)null);
        this.c = new Canvas();
        this.d = new b(719, 575, 0, 719, 0, 575);
        this.e = new a(0, f(), g(), h());
        this.f = new h(m, i);
    }
    
    public static byte[] e(final int n, final int n2, final y y) {
        final byte[] array = new byte[n];
        for (int i = 0; i < n; ++i) {
            array[i] = (byte)y.h(n2);
        }
        return array;
    }
    
    public static int[] f() {
        return new int[] { 0, -1, -16777216, -8421505 };
    }
    
    public static int[] g() {
        final int[] array = new int[16];
        array[0] = 0;
        for (int i = 1; i < 16; ++i) {
            if (i < 8) {
                int n;
                if ((i & 0x1) != 0x0) {
                    n = 255;
                }
                else {
                    n = 0;
                }
                int n2;
                if ((i & 0x2) != 0x0) {
                    n2 = 255;
                }
                else {
                    n2 = 0;
                }
                int n3;
                if ((i & 0x4) != 0x0) {
                    n3 = 255;
                }
                else {
                    n3 = 0;
                }
                array[i] = i(255, n, n2, n3);
            }
            else {
                int n4 = 127;
                int n5;
                if ((i & 0x1) != 0x0) {
                    n5 = 127;
                }
                else {
                    n5 = 0;
                }
                int n6;
                if ((i & 0x2) != 0x0) {
                    n6 = 127;
                }
                else {
                    n6 = 0;
                }
                if ((i & 0x4) == 0x0) {
                    n4 = 0;
                }
                array[i] = i(255, n5, n6, n4);
            }
        }
        return array;
    }
    
    public static int[] h() {
        final int[] array = new int[256];
        array[0] = 0;
        for (int i = 0; i < 256; ++i) {
            int n = 255;
            if (i < 8) {
                int n2;
                if ((i & 0x1) != 0x0) {
                    n2 = 255;
                }
                else {
                    n2 = 0;
                }
                int n3;
                if ((i & 0x2) != 0x0) {
                    n3 = 255;
                }
                else {
                    n3 = 0;
                }
                if ((i & 0x4) == 0x0) {
                    n = 0;
                }
                array[i] = i(63, n2, n3, n);
            }
            else {
                final int n4 = i & 0x88;
                int n5 = 170;
                int n6 = 85;
                if (n4 != 0) {
                    if (n4 != 8) {
                        int n7 = 43;
                        if (n4 != 128) {
                            if (n4 == 136) {
                                int n8;
                                if ((i & 0x1) != 0x0) {
                                    n8 = 43;
                                }
                                else {
                                    n8 = 0;
                                }
                                int n9;
                                if ((i & 0x10) != 0x0) {
                                    n9 = 85;
                                }
                                else {
                                    n9 = 0;
                                }
                                int n10;
                                if ((i & 0x2) != 0x0) {
                                    n10 = 43;
                                }
                                else {
                                    n10 = 0;
                                }
                                int n11;
                                if ((i & 0x20) != 0x0) {
                                    n11 = 85;
                                }
                                else {
                                    n11 = 0;
                                }
                                if ((i & 0x4) == 0x0) {
                                    n7 = 0;
                                }
                                if ((i & 0x40) == 0x0) {
                                    n6 = 0;
                                }
                                array[i] = i(255, n8 + n9, n10 + n11, n7 + n6);
                            }
                        }
                        else {
                            int n12;
                            if ((i & 0x1) != 0x0) {
                                n12 = 43;
                            }
                            else {
                                n12 = 0;
                            }
                            int n13;
                            if ((i & 0x10) != 0x0) {
                                n13 = 85;
                            }
                            else {
                                n13 = 0;
                            }
                            int n14;
                            if ((i & 0x2) != 0x0) {
                                n14 = 43;
                            }
                            else {
                                n14 = 0;
                            }
                            int n15;
                            if ((i & 0x20) != 0x0) {
                                n15 = 85;
                            }
                            else {
                                n15 = 0;
                            }
                            if ((i & 0x4) == 0x0) {
                                n7 = 0;
                            }
                            if ((i & 0x40) == 0x0) {
                                n6 = 0;
                            }
                            array[i] = i(255, n12 + 127 + n13, n14 + 127 + n15, n7 + 127 + n6);
                        }
                    }
                    else {
                        int n16;
                        if ((i & 0x1) != 0x0) {
                            n16 = 85;
                        }
                        else {
                            n16 = 0;
                        }
                        int n17;
                        if ((i & 0x10) != 0x0) {
                            n17 = 170;
                        }
                        else {
                            n17 = 0;
                        }
                        int n18;
                        if ((i & 0x2) != 0x0) {
                            n18 = 85;
                        }
                        else {
                            n18 = 0;
                        }
                        int n19;
                        if ((i & 0x20) != 0x0) {
                            n19 = 170;
                        }
                        else {
                            n19 = 0;
                        }
                        if ((i & 0x4) == 0x0) {
                            n6 = 0;
                        }
                        if ((i & 0x40) == 0x0) {
                            n5 = 0;
                        }
                        array[i] = i(127, n16 + n17, n18 + n19, n6 + n5);
                    }
                }
                else {
                    int n20;
                    if ((i & 0x1) != 0x0) {
                        n20 = 85;
                    }
                    else {
                        n20 = 0;
                    }
                    int n21;
                    if ((i & 0x10) != 0x0) {
                        n21 = 170;
                    }
                    else {
                        n21 = 0;
                    }
                    int n22;
                    if ((i & 0x2) != 0x0) {
                        n22 = 85;
                    }
                    else {
                        n22 = 0;
                    }
                    int n23;
                    if ((i & 0x20) != 0x0) {
                        n23 = 170;
                    }
                    else {
                        n23 = 0;
                    }
                    if ((i & 0x4) == 0x0) {
                        n6 = 0;
                    }
                    if ((i & 0x40) == 0x0) {
                        n5 = 0;
                    }
                    array[i] = i(255, n20 + n21, n22 + n23, n6 + n5);
                }
            }
        }
        return array;
    }
    
    public static int i(final int n, final int n2, final int n3, final int n4) {
        return n << 24 | n2 << 16 | n3 << 8 | n4;
    }
    
    public static int j(final y y, final int[] array, final byte[] array2, int n, final int n2, final Paint paint, final Canvas canvas) {
        final int n3 = 0;
        int n4 = n;
        n = n3;
        while (true) {
            final int h = y.h(2);
            int n5 = 0;
            int n6 = 0;
            Label_0175: {
                if (h != 0) {
                    n5 = n;
                    n6 = 1;
                    n = h;
                }
                else {
                    int n7 = 0;
                    Label_0049: {
                        if (!y.g()) {
                            Label_0087: {
                                if (!y.g()) {
                                    final int h2 = y.h(2);
                                    if (h2 != 0) {
                                        if (h2 == 1) {
                                            n6 = 2;
                                            break Label_0087;
                                        }
                                        if (h2 == 2) {
                                            n7 = y.h(4) + 12;
                                            break Label_0049;
                                        }
                                        if (h2 == 3) {
                                            n7 = y.h(8) + 29;
                                            break Label_0049;
                                        }
                                        n5 = n;
                                    }
                                    else {
                                        n5 = 1;
                                    }
                                    n = (n6 = 0);
                                    break Label_0175;
                                }
                                n6 = 1;
                            }
                            n5 = n;
                            n = 0;
                            break Label_0175;
                        }
                        n7 = y.h(3) + 3;
                    }
                    final int h3 = y.h(2);
                    final int n8 = n;
                    final int n9 = n7;
                    n = h3;
                    n5 = n8;
                    n6 = n9;
                }
            }
            if (n6 != 0 && paint != null) {
                int n10 = n;
                if (array2 != null) {
                    n10 = array2[n];
                }
                paint.setColor(array[n10]);
                canvas.drawRect((float)n4, (float)n2, (float)(n4 + n6), (float)(n2 + 1), paint);
            }
            n4 += n6;
            if (n5 != 0) {
                break;
            }
            n = n5;
        }
        return n4;
    }
    
    public static int k(final y y, final int[] array, final byte[] array2, int n, final int n2, final Paint paint, final Canvas canvas) {
        final int n3 = 0;
        int n4 = n;
        n = n3;
        while (true) {
            final int h = y.h(4);
            int n5 = 0;
            int n6 = 0;
            Label_0196: {
                if (h != 0) {
                    n5 = n;
                    n6 = 1;
                    n = h;
                }
                else {
                    Label_0069: {
                        Label_0058: {
                            if (y.g()) {
                                int n7;
                                if (!y.g()) {
                                    n7 = y.h(2) + 4;
                                }
                                else {
                                    final int h2 = y.h(2);
                                    if (h2 == 0) {
                                        n6 = 1;
                                        break Label_0058;
                                    }
                                    if (h2 == 1) {
                                        n6 = 2;
                                        break Label_0058;
                                    }
                                    if (h2 != 2) {
                                        if (h2 != 3) {
                                            n5 = n;
                                            break Label_0069;
                                        }
                                        n7 = y.h(8) + 25;
                                    }
                                    else {
                                        n7 = y.h(4) + 9;
                                    }
                                }
                                final int h3 = y.h(4);
                                final int n8 = n;
                                final int n9 = n7;
                                n = h3;
                                n5 = n8;
                                n6 = n9;
                                break Label_0196;
                            }
                            final int h4 = y.h(3);
                            if (h4 == 0) {
                                n5 = 1;
                                break Label_0069;
                            }
                            n6 = h4 + 2;
                        }
                        n5 = n;
                        n = 0;
                        break Label_0196;
                    }
                    n = (n6 = 0);
                }
            }
            if (n6 != 0 && paint != null) {
                int n10 = n;
                if (array2 != null) {
                    n10 = array2[n];
                }
                paint.setColor(array[n10]);
                canvas.drawRect((float)n4, (float)n2, (float)(n4 + n6), (float)(n2 + 1), paint);
            }
            n4 += n6;
            if (n5 != 0) {
                break;
            }
            n = n5;
        }
        return n4;
    }
    
    public static int l(final y y, final int[] array, final byte[] array2, int n, final int n2, final Paint paint, final Canvas canvas) {
        final int n3 = 0;
        int n4 = n;
        n = n3;
        while (true) {
            final int h = y.h(8);
            int n5;
            int n6;
            if (h != 0) {
                n5 = n;
                n6 = 1;
                n = h;
            }
            else if (!y.g()) {
                n6 = y.h(7);
                if (n6 != 0) {
                    n5 = n;
                    n = 0;
                }
                else {
                    n5 = 1;
                    n = (n6 = 0);
                }
            }
            else {
                n6 = y.h(7);
                final int h2 = y.h(8);
                n5 = n;
                n = h2;
            }
            if (n6 != 0 && paint != null) {
                int n7 = n;
                if (array2 != null) {
                    n7 = array2[n];
                }
                paint.setColor(array[n7]);
                canvas.drawRect((float)n4, (float)n2, (float)(n4 + n6), (float)(n2 + 1), paint);
            }
            n4 += n6;
            if (n5 != 0) {
                break;
            }
            n = n5;
        }
        return n4;
    }
    
    public static void m(byte[] array, final int[] array2, final int n, final int n2, int n3, final Paint paint, final Canvas canvas) {
        final y y = new y(array);
        byte[] e = null;
        byte[] e3;
        byte[] e2 = e3 = e;
        int n4 = n3;
        n3 = n2;
        while (y.b() != 0) {
            final int h = y.h(8);
            if (h != 240) {
                switch (h) {
                    default: {
                        switch (h) {
                            default: {
                                continue;
                            }
                            case 34: {
                                e2 = e(16, 8, y);
                                continue;
                            }
                            case 33: {
                                e = e(4, 8, y);
                                continue;
                            }
                            case 32: {
                                e3 = e(4, 4, y);
                                continue;
                            }
                        }
                        break;
                    }
                    case 18: {
                        n3 = l(y, array2, null, n3, n4, paint, canvas);
                        continue;
                    }
                    case 17: {
                        if (n == 3) {
                            if (e2 == null) {
                                array = a.j;
                            }
                            else {
                                array = e2;
                            }
                        }
                        else {
                            array = null;
                        }
                        n3 = k(y, array2, array, n3, n4, paint, canvas);
                        break;
                    }
                    case 16: {
                        if (n == 3) {
                            if (e == null) {
                                array = a.i;
                            }
                            else {
                                array = e;
                            }
                        }
                        else if (n == 2) {
                            if (e3 == null) {
                                array = a.h;
                            }
                            else {
                                array = e3;
                            }
                        }
                        else {
                            array = null;
                        }
                        n3 = j(y, array2, array, n3, n4, paint, canvas);
                        break;
                    }
                }
                y.c();
            }
            else {
                n4 += 2;
                n3 = n2;
            }
        }
    }
    
    public static void n(final c c, final a a, final int n, final int n2, final int n3, final Paint paint, final Canvas canvas) {
        int[] array;
        if (n == 3) {
            array = a.d;
        }
        else if (n == 2) {
            array = a.c;
        }
        else {
            array = a.b;
        }
        m(c.c, array, n, n2, n3, paint, canvas);
        m(c.d, array, n, n2, n3 + 1, paint, canvas);
    }
    
    public static a p(final y y, int i) {
        final int h = y.h(8);
        y.r(8);
        i -= 2;
        final int[] f = f();
        final int[] g = g();
        final int[] h2 = h();
        while (i > 0) {
            final int h3 = y.h(8);
            final int h4 = y.h(8);
            int[] array;
            if ((h4 & 0x80) != 0x0) {
                array = f;
            }
            else if ((h4 & 0x40) != 0x0) {
                array = g;
            }
            else {
                array = h2;
            }
            int h5;
            int h6;
            int h7;
            int h8;
            if ((h4 & 0x1) != 0x0) {
                h5 = y.h(8);
                h6 = y.h(8);
                h7 = y.h(8);
                h8 = y.h(8);
                i -= 6;
            }
            else {
                final int h9 = y.h(6);
                final int h10 = y.h(4);
                h7 = y.h(4) << 4;
                final int h11 = y.h(2);
                i -= 4;
                h8 = h11 << 6;
                h5 = h9 << 2;
                h6 = h10 << 4;
            }
            if (h5 == 0) {
                h8 = 255;
                h6 = 0;
                h7 = 0;
            }
            final byte b = (byte)(255 - (h8 & 0xFF));
            final double n = h5;
            final double n2 = h6 - 128;
            final int n3 = (int)(n + 1.402 * n2);
            final double n4 = h7 - 128;
            array[h3] = i(b, M.p(n3, 0, 255), M.p((int)(n - 0.34414 * n4 - n2 * 0.71414), 0, 255), M.p((int)(n + n4 * 1.772), 0, 255));
        }
        return new a(h, f, g, h2);
    }
    
    public static b q(final y y) {
        y.r(4);
        final boolean g = y.g();
        y.r(3);
        final int h = y.h(16);
        final int h2 = y.h(16);
        int h3;
        int h5;
        int h6;
        int n;
        if (g) {
            h3 = y.h(16);
            final int h4 = y.h(16);
            h5 = y.h(16);
            h6 = y.h(16);
            n = h4;
        }
        else {
            h5 = 0;
            n = h;
            h6 = h2;
            h3 = h5;
        }
        return new b(h, h2, h3, n, h5, h6);
    }
    
    public static c r(final y y) {
        final int h = y.h(16);
        y.r(4);
        final int h2 = y.h(2);
        final boolean g = y.g();
        y.r(1);
        byte[] f = M.f;
        byte[] array;
        if (h2 == 1) {
            y.r(y.h(8) * 16);
            array = f;
        }
        else {
            array = f;
            if (h2 == 0) {
                final int h3 = y.h(16);
                final int h4 = y.h(16);
                if (h3 > 0) {
                    f = new byte[h3];
                    y.k(f, 0, h3);
                }
                array = f;
                if (h4 > 0) {
                    final byte[] array2 = new byte[h4];
                    y.k(array2, 0, h4);
                    final byte[] array3 = array2;
                    return new c(h, g, f, array3);
                }
            }
        }
        final byte[] array3 = array;
        f = array;
        return new c(h, g, f, array3);
    }
    
    public static d s(final y y, int i) {
        final int h = y.h(8);
        final int h2 = y.h(4);
        final int h3 = y.h(2);
        y.r(2);
        i -= 2;
        final SparseArray sparseArray = new SparseArray();
        while (i > 0) {
            final int h4 = y.h(8);
            y.r(8);
            final int h5 = y.h(16);
            final int h6 = y.h(16);
            i -= 6;
            sparseArray.put(h4, (Object)new e(h5, h6));
        }
        return new d(h, h2, h3, sparseArray);
    }
    
    public static f t(final y y, int i) {
        final int h = y.h(8);
        y.r(4);
        final boolean g = y.g();
        y.r(3);
        final int h2 = y.h(16);
        final int h3 = y.h(16);
        final int h4 = y.h(3);
        final int h5 = y.h(3);
        int n = 2;
        y.r(2);
        final int h6 = y.h(8);
        final int h7 = y.h(8);
        final int h8 = y.h(4);
        final int h9 = y.h(2);
        y.r(2);
        i -= 10;
        final SparseArray sparseArray = new SparseArray();
        while (i > 0) {
            final int h10 = y.h(16);
            final int h11 = y.h(n);
            final int h12 = y.h(n);
            final int h13 = y.h(12);
            y.r(4);
            final int h14 = y.h(12);
            int h15 = 0;
            int n2 = 0;
            Label_0218: {
                if (h11 != 1) {
                    if (h11 != 2) {
                        n2 = (h15 = 0);
                        i -= 6;
                        break Label_0218;
                    }
                }
                final int h16 = y.h(8);
                h15 = y.h(8);
                final int n3 = i - 8;
                i = (n2 = h16);
                i = n3;
            }
            sparseArray.put(h10, (Object)new g(h11, h12, h13, h14, n2, h15));
            n = 2;
        }
        return new f(h, g, h2, h3, h4, h5, h6, h7, h8, h9, sparseArray);
    }
    
    public static void u(final y y, final h h) {
        final int h2 = y.h(8);
        final int h3 = y.h(16);
        final int h4 = y.h(16);
        final int d = y.d();
        if (h4 * 8 > y.b()) {
            o.h("DvbParser", "Data field length exceeds limit");
            y.r(y.b());
            return;
        }
        Label_0415: {
            int n = 0;
            SparseArray sparseArray = null;
            a a = null;
            switch (h2) {
                default: {
                    break Label_0415;
                }
                case 20: {
                    if (h3 == h.a) {
                        h.h = q(y);
                    }
                    break Label_0415;
                }
                case 19: {
                    SparseArray e;
                    c c;
                    if (h3 == h.a) {
                        final c r = r(y);
                        e = h.e;
                        c = r;
                    }
                    else {
                        if (h3 != h.b) {
                            break Label_0415;
                        }
                        final c r2 = r(y);
                        final SparseArray g = h.g;
                        c = r2;
                        e = g;
                    }
                    n = c.a;
                    sparseArray = e;
                    a = (a)c;
                    break;
                }
                case 18: {
                    SparseArray sparseArray2;
                    if (h3 == h.a) {
                        a = p(y, h4);
                        sparseArray2 = h.d;
                    }
                    else {
                        if (h3 != h.b) {
                            break Label_0415;
                        }
                        a = p(y, h4);
                        sparseArray2 = h.f;
                    }
                    n = a.a;
                    sparseArray = sparseArray2;
                    break;
                }
                case 17: {
                    final d i = h.i;
                    if (h3 == h.a && i != null) {
                        final f t = t(y, h4);
                        if (i.c == 0) {
                            final f f = (f)h.c.get(t.a);
                            if (f != null) {
                                t.a(f);
                            }
                        }
                        h.c.put(t.a, (Object)t);
                    }
                    break Label_0415;
                }
                case 16: {
                    if (h3 != h.a) {
                        break Label_0415;
                    }
                    final d j = h.i;
                    final d s = s(y, h4);
                    if (s.c != 0) {
                        h.i = s;
                        h.c.clear();
                        h.d.clear();
                        h.e.clear();
                        break Label_0415;
                    }
                    if (j != null && j.b != s.b) {
                        h.i = s;
                    }
                    break Label_0415;
                }
            }
            sparseArray.put(n, (Object)a);
        }
        y.s(d + h4 - y.d());
    }
    
    @Override
    public void b() {
        this.f.a();
    }
    
    @Override
    public void c(final byte[] array, final int n, final int n2, final t.b b, final g0.g g) {
        final y y = new y(array, n2 + n);
        y.p(n);
        g.accept(this.o(y));
    }
    
    @Override
    public int d() {
        return 2;
    }
    
    public final c1.e o(final y y) {
        while (y.b() >= 48 && y.h(8) == 15) {
            u(y, this.f);
        }
        final h f = this.f;
        final d i = f.i;
        if (i == null) {
            return new c1.e(v.Y(), -9223372036854775807L, -9223372036854775807L);
        }
        Object o = f.h;
        if (o == null) {
            o = this.d;
        }
        final Bitmap g = this.g;
        if (g == null || ((b)o).a + 1 != g.getWidth() || ((b)o).b + 1 != this.g.getHeight()) {
            final Bitmap bitmap = Bitmap.createBitmap(((b)o).a + 1, ((b)o).b + 1, Bitmap$Config.ARGB_8888);
            this.g = bitmap;
            this.c.setBitmap(bitmap);
        }
        final ArrayList<a> list = new ArrayList<a>();
        final SparseArray d = i.d;
        for (int j = 0; j < d.size(); ++j) {
            this.c.save();
            final e e = (e)d.valueAt(j);
            final f f2 = (f)this.f.c.get(d.keyAt(j));
            final int n = e.a + ((b)o).c;
            final int n2 = e.b + ((b)o).e;
            this.c.clipRect(n, n2, Math.min(f2.c + n, ((b)o).d), Math.min(f2.d + n2, ((b)o).f));
            a e2;
            if ((e2 = (a)this.f.d.get(f2.g)) == null && (e2 = (a)this.f.f.get(f2.g)) == null) {
                e2 = this.e;
            }
            final SparseArray k = f2.k;
            for (int l = 0; l < k.size(); ++l) {
                final int key = k.keyAt(l);
                final g g2 = (g)k.valueAt(l);
                c c = (c)this.f.e.get(key);
                if (c == null) {
                    c = (c)this.f.g.get(key);
                }
                if (c != null) {
                    Paint a;
                    if (c.b) {
                        a = null;
                    }
                    else {
                        a = this.a;
                    }
                    n(c, e2, f2.f, g2.c + n, n2 + g2.d, a, this.c);
                }
            }
            if (f2.b) {
                final int f3 = f2.f;
                int color;
                if (f3 == 3) {
                    color = e2.d[f2.h];
                }
                else if (f3 == 2) {
                    color = e2.c[f2.i];
                }
                else {
                    color = e2.b[f2.j];
                }
                this.b.setColor(color);
                this.c.drawRect((float)n, (float)n2, (float)(f2.c + n), (float)(f2.d + n2), this.b);
            }
            list.add(new f0.a.b().f(Bitmap.createBitmap(this.g, n, n2, f2.c, f2.d)).k(n / (float)((b)o).a).l(0).h(n2 / (float)((b)o).b, 0).i(0).n(f2.c / (float)((b)o).a).g(f2.d / (float)((b)o).b).a());
            this.c.drawColor(0, PorterDuff$Mode.CLEAR);
            this.c.restore();
        }
        return new c1.e(list, -9223372036854775807L, -9223372036854775807L);
    }
    
    public static final class a
    {
        public final int a;
        public final int[] b;
        public final int[] c;
        public final int[] d;
        
        public a(final int a, final int[] b, final int[] c, final int[] d) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        }
    }
    
    public static final class b
    {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        
        public b(final int a, final int b, final int c, final int d, final int e, final int f) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
            this.f = f;
        }
    }
    
    public static final class c
    {
        public final int a;
        public final boolean b;
        public final byte[] c;
        public final byte[] d;
        
        public c(final int a, final boolean b, final byte[] c, final byte[] d) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        }
    }
    
    public static final class d
    {
        public final int a;
        public final int b;
        public final int c;
        public final SparseArray d;
        
        public d(final int a, final int b, final int c, final SparseArray d) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        }
    }
    
    public static final class e
    {
        public final int a;
        public final int b;
        
        public e(final int a, final int b) {
            this.a = a;
            this.b = b;
        }
    }
    
    public static final class f
    {
        public final int a;
        public final boolean b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        public final int h;
        public final int i;
        public final int j;
        public final SparseArray k;
        
        public f(final int a, final boolean b, final int c, final int d, final int e, final int f, final int g, final int h, final int i, final int j, final SparseArray k) {
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
        
        public void a(final f f) {
            final SparseArray k = f.k;
            for (int i = 0; i < k.size(); ++i) {
                this.k.put(k.keyAt(i), (Object)k.valueAt(i));
            }
        }
    }
    
    public static final class g
    {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        
        public g(final int a, final int b, final int c, final int d, final int e, final int f) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
            this.f = f;
        }
    }
    
    public static final class h
    {
        public final int a;
        public final int b;
        public final SparseArray c;
        public final SparseArray d;
        public final SparseArray e;
        public final SparseArray f;
        public final SparseArray g;
        public b h;
        public d i;
        
        public h(final int a, final int b) {
            this.a = a;
            this.b = b;
            this.c = new SparseArray();
            this.d = new SparseArray();
            this.e = new SparseArray();
            this.f = new SparseArray();
            this.g = new SparseArray();
        }
        
        public void a() {
            this.c.clear();
            this.d.clear();
            this.e.clear();
            this.f.clear();
            this.g.clear();
            this.h = null;
            this.i = null;
        }
    }
}
