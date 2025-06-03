// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package d1;

import android.text.SpannableString;
import android.text.Layout$Alignment;
import android.text.style.UnderlineSpan;
import android.text.style.StyleSpan;
import android.text.style.ForegroundColorSpan;
import android.text.SpannableStringBuilder;
import c1.q;
import java.nio.ByteBuffer;
import c1.p;
import c1.k;
import java.util.Collections;
import g0.o;
import java.util.List;
import java.util.ArrayList;
import g0.z;

public final class a extends e
{
    public static final int[] A;
    public static final int[] B;
    public static final int[] C;
    public static final int[] D;
    public static final int[] E;
    public static final int[] F;
    public static final boolean[] G;
    public static final int[] z;
    public final z h;
    public final int i;
    public final int j;
    public final int k;
    public final long l;
    public final ArrayList m;
    public a n;
    public List o;
    public List p;
    public int q;
    public int r;
    public boolean s;
    public boolean t;
    public byte u;
    public byte v;
    public int w;
    public boolean x;
    public long y;
    
    static {
        z = new int[] { 11, 1, 3, 12, 14, 5, 7, 9 };
        A = new int[] { 0, 4, 8, 12, 16, 20, 24, 28 };
        B = new int[] { -1, -16711936, -16776961, -16711681, -65536, -256, -65281 };
        C = new int[] { 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632 };
        D = new int[] { 174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251 };
        E = new int[] { 193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187 };
        F = new int[] { 195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496 };
        G = new boolean[] { false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false };
    }
    
    public a(final String anObject, final int n, final long n2) {
        this.h = new z();
        this.m = new ArrayList();
        this.n = new a(0, 4);
        this.w = 0;
        if (n2 != -9223372036854775807L) {
            a.a(n2 >= 16000L);
            this.l = n2 * 1000L;
        }
        else {
            this.l = -9223372036854775807L;
        }
        int i;
        if ("application/x-mp4-cea-608".equals(anObject)) {
            i = 2;
        }
        else {
            i = 3;
        }
        this.i = i;
        Label_0186: {
            Label_0149: {
                Label_0144: {
                    if (n != 1) {
                        if (n != 2) {
                            if (n != 3) {
                                if (n != 4) {
                                    g0.o.h("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
                                    break Label_0144;
                                }
                                this.k = 1;
                            }
                            else {
                                this.k = 0;
                            }
                            this.j = 1;
                            break Label_0186;
                        }
                        this.k = 1;
                        break Label_0149;
                    }
                }
                this.k = 0;
            }
            this.j = 0;
        }
        this.O(0);
        this.N();
        this.x = true;
        this.y = -9223372036854775807L;
    }
    
    public static boolean B(final byte b) {
        return (b & 0xE0) == 0x0;
    }
    
    public static boolean C(final byte b, final byte b2) {
        return (b & 0xF6) == 0x12 && (b2 & 0xE0) == 0x20;
    }
    
    public static boolean D(final byte b, final byte b2) {
        return (b & 0xF7) == 0x11 && (b2 & 0xF0) == 0x20;
    }
    
    public static boolean E(final byte b, final byte b2) {
        return (b & 0xF6) == 0x14 && (b2 & 0xF0) == 0x20;
    }
    
    public static boolean F(final byte b, final byte b2) {
        return (b & 0xF0) == 0x10 && (b2 & 0xC0) == 0x40;
    }
    
    public static boolean G(final byte b) {
        return (b & 0xF0) == 0x10;
    }
    
    public static boolean I(final byte b) {
        return (b & 0xF6) == 0x14;
    }
    
    public static boolean J(final byte b, final byte b2) {
        return (b & 0xF7) == 0x11 && (b2 & 0xF0) == 0x30;
    }
    
    public static boolean K(final byte b, final byte b2) {
        return (b & 0xF7) == 0x17 && b2 >= 33 && b2 <= 35;
    }
    
    public static boolean L(final byte b) {
        return 1 <= b && b <= 15;
    }
    
    public static /* synthetic */ int[] q() {
        return a.B;
    }
    
    public static char r(final byte b) {
        return (char)a.C[(b & 0x7F) - 32];
    }
    
    public static int s(final byte b) {
        return b >> 3 & 0x1;
    }
    
    public static char u(final byte b) {
        return (char)a.E[b & 0x1F];
    }
    
    public static char v(final byte b) {
        return (char)a.F[b & 0x1F];
    }
    
    public static char w(final byte b, final byte b2) {
        if ((b & 0x1) == 0x0) {
            return u(b2);
        }
        return v(b2);
    }
    
    public static char x(final byte b) {
        return (char)a.D[b & 0xF];
    }
    
    public final void A(final byte b, final byte b2) {
        int n2;
        final int n = n2 = a.z[b & 0x7];
        if ((b2 & 0x20) != 0x0) {
            n2 = n + 1;
        }
        if (n2 != a.b(this.n)) {
            if (this.q != 1 && !this.n.i()) {
                final a a = new a(this.q, this.r);
                this.n = a;
                this.m.add(a);
            }
            a.c(this.n, n2);
        }
        boolean b3 = false;
        final boolean b4 = (b2 & 0x10) == 0x10;
        if ((b2 & 0x1) == 0x1) {
            b3 = true;
        }
        final int n3 = b2 >> 1 & 0x7;
        final a n4 = this.n;
        int n5;
        if (b4) {
            n5 = 8;
        }
        else {
            n5 = n3;
        }
        n4.p(n5, b3);
        if (b4) {
            a.d(this.n, a.A[n3]);
        }
    }
    
    public final boolean H(final boolean b, final byte u, final byte v) {
        if (!b || !G(u)) {
            return this.t = false;
        }
        if (this.t && this.u == u && this.v == v) {
            this.t = false;
            return true;
        }
        this.t = true;
        this.u = u;
        this.v = v;
        return false;
    }
    
    public final void M(final byte b, final byte b2) {
        Label_0007: {
            if (!L(b)) {
                if (I(b)) {
                    Label_0089: {
                        if (b2 != 32 && b2 != 47) {
                            switch (b2) {
                                default: {
                                    switch (b2) {
                                        case 42:
                                        case 43: {
                                            break Label_0007;
                                        }
                                        default: {
                                            return;
                                        }
                                        case 41: {
                                            break Label_0089;
                                        }
                                    }
                                    break;
                                }
                                case 37:
                                case 38:
                                case 39: {
                                    break;
                                }
                            }
                        }
                    }
                    this.x = true;
                }
                return;
            }
        }
        this.x = false;
    }
    
    public final void N() {
        this.n.j(this.q);
        this.m.clear();
        this.m.add(this.n);
    }
    
    public final void O(final int q) {
        final int q2 = this.q;
        if (q2 == q) {
            return;
        }
        if ((this.q = q) == 3) {
            for (int i = 0; i < this.m.size(); ++i) {
                ((a)this.m.get(i)).l(q);
            }
            return;
        }
        this.N();
        if (q2 == 3 || q == 1 || q == 0) {
            this.o = Collections.emptyList();
        }
    }
    
    public final void P(final int r) {
        this.r = r;
        this.n.m(r);
    }
    
    public final boolean Q() {
        final long l = this.l;
        boolean b = false;
        if (l != -9223372036854775807L) {
            if (this.y == -9223372036854775807L) {
                return false;
            }
            b = b;
            if (this.l() - this.y >= this.l) {
                b = true;
            }
        }
        return b;
    }
    
    public final boolean R(final byte b) {
        if (B(b)) {
            this.w = s(b);
        }
        return this.w == this.k;
    }
    
    @Override
    public void flush() {
        super.flush();
        this.o = null;
        this.p = null;
        this.O(0);
        this.P(4);
        this.N();
        this.s = false;
        this.t = false;
        this.u = 0;
        this.v = 0;
        this.w = 0;
        this.x = true;
        this.y = -9223372036854775807L;
    }
    
    @Override
    public k g() {
        final List o = this.o;
        this.p = o;
        return new f((List)a.e(o));
    }
    
    @Override
    public void h(final p p) {
        final ByteBuffer byteBuffer = (ByteBuffer)a.e(p.r);
        this.h.R(byteBuffer.array(), byteBuffer.limit());
        boolean b = false;
        while (true) {
            final int a = this.h.a();
            final int i = this.i;
            if (a < i) {
                break;
            }
            int g;
            if (i == 2) {
                g = -4;
            }
            else {
                g = this.h.G();
            }
            final int g2 = this.h.G();
            final int g3 = this.h.G();
            if ((g & 0x2) != 0x0) {
                continue;
            }
            if ((g & 0x1) != this.j) {
                continue;
            }
            final byte b2 = (byte)(g2 & 0x7F);
            final byte b3 = (byte)(g3 & 0x7F);
            if (b2 == 0 && b3 == 0) {
                continue;
            }
            final boolean s = this.s;
            boolean s2 = false;
            Label_0181: {
                if ((g & 0x4) == 0x4) {
                    final boolean[] g4 = d1.a.G;
                    if (g4[g2] && g4[g3]) {
                        s2 = true;
                        break Label_0181;
                    }
                }
                s2 = false;
            }
            this.s = s2;
            if (this.H(s2, b2, b3)) {
                continue;
            }
            Label_0217: {
                if (!this.s) {
                    if (!s) {
                        continue;
                    }
                    this.N();
                }
                else {
                    this.M(b2, b3);
                    if (!this.x) {
                        continue;
                    }
                    if (!this.R(b2)) {
                        continue;
                    }
                    a a2;
                    char c;
                    if (B(b2)) {
                        if (J(b2, b3)) {
                            a2 = this.n;
                            c = x(b3);
                        }
                        else if (C(b2, b3)) {
                            this.n.f();
                            a2 = this.n;
                            c = w(b2, b3);
                        }
                        else {
                            if (D(b2, b3)) {
                                this.y(b3);
                                break Label_0217;
                            }
                            if (F(b2, b3)) {
                                this.A(b2, b3);
                                break Label_0217;
                            }
                            if (K(b2, b3)) {
                                d1.a.a.a(this.n, b3 - 32);
                                break Label_0217;
                            }
                            if (E(b2, b3)) {
                                this.z(b3);
                            }
                            break Label_0217;
                        }
                    }
                    else {
                        this.n.e(r(b2));
                        if ((b3 & 0xE0) == 0x0) {
                            break Label_0217;
                        }
                        a2 = this.n;
                        c = r(b3);
                    }
                    a2.e(c);
                }
            }
            b = true;
        }
        if (b) {
            final int q = this.q;
            if (q == 1 || q == 3) {
                this.o = this.t();
                this.y = this.l();
            }
        }
    }
    
    @Override
    public q j() {
        final q j = super.j();
        if (j != null) {
            return j;
        }
        if (this.Q()) {
            final q k = this.k();
            if (k != null) {
                this.o = Collections.emptyList();
                this.y = -9223372036854775807L;
                k.z(this.l(), this.g(), Long.MAX_VALUE);
                return k;
            }
        }
        return null;
    }
    
    @Override
    public boolean m() {
        return this.o != this.p;
    }
    
    @Override
    public void release() {
    }
    
    public final List t() {
        final int size = this.m.size();
        final ArrayList list = new ArrayList<f0.a>(size);
        int a = 2;
        final int n = 0;
        int min;
        for (int i = 0; i < size; ++i, a = min) {
            final f0.a g = this.m.get(i).g(Integer.MIN_VALUE);
            list.add(g);
            min = a;
            if (g != null) {
                min = Math.min(a, g.i);
            }
        }
        final ArrayList list2 = new ArrayList<f0.a>(size);
        for (int j = n; j < size; ++j) {
            final f0.a a2 = list.get(j);
            if (a2 != null) {
                f0.a a3 = a2;
                if (a2.i != a) {
                    a3 = (f0.a)g0.a.e(this.m.get(j).g(a));
                }
                list2.add(a3);
            }
        }
        return list2;
    }
    
    public final void y(final byte b) {
        this.n.e(' ');
        this.n.p(b >> 1 & 0x7, (b & 0x1) == 0x1);
    }
    
    public final void z(final byte b) {
        if (b == 32) {
            this.O(2);
            return;
        }
        if (b == 41) {
            this.O(3);
            return;
        }
        switch (b) {
            default: {
                final int q = this.q;
                if (q == 0) {
                    return;
                }
                if (b != 33) {
                    while (true) {
                        switch (b) {
                            default: {}
                            case 47: {
                                this.o = this.t();
                            }
                            case 46: {
                                this.N();
                            }
                            case 45: {
                                if (q == 1 && !this.n.i()) {
                                    this.n.k();
                                    return;
                                }
                                break;
                            }
                            case 44: {
                                this.o = Collections.emptyList();
                                final int q2 = this.q;
                                if (q2 == 1) {
                                    continue;
                                }
                                if (q2 == 3) {
                                    continue;
                                }
                                break;
                            }
                        }
                        break;
                    }
                }
                else {
                    this.n.f();
                }
            }
            case 39: {
                this.O(1);
                this.P(4);
            }
            case 38: {
                this.O(1);
                this.P(3);
            }
            case 37: {
                this.O(1);
                this.P(2);
            }
        }
    }
    
    public static final class a
    {
        public final List a;
        public final List b;
        public final StringBuilder c;
        public int d;
        public int e;
        public int f;
        public int g;
        public int h;
        
        public a(final int n, final int h) {
            this.a = new ArrayList();
            this.b = new ArrayList();
            this.c = new StringBuilder();
            this.j(n);
            this.h = h;
        }
        
        public static /* synthetic */ int a(final a a, final int f) {
            return a.f = f;
        }
        
        public static /* synthetic */ int b(final a a) {
            return a.d;
        }
        
        public static /* synthetic */ int c(final a a, final int d) {
            return a.d = d;
        }
        
        public static /* synthetic */ int d(final a a, final int e) {
            return a.e = e;
        }
        
        public static void n(final SpannableStringBuilder spannableStringBuilder, final int n, final int n2, final int n3) {
            if (n3 == -1) {
                return;
            }
            spannableStringBuilder.setSpan((Object)new ForegroundColorSpan(n3), n, n2, 33);
        }
        
        public static void o(final SpannableStringBuilder spannableStringBuilder, final int n, final int n2) {
            spannableStringBuilder.setSpan((Object)new StyleSpan(2), n, n2, 33);
        }
        
        public static void q(final SpannableStringBuilder spannableStringBuilder, final int n, final int n2) {
            spannableStringBuilder.setSpan((Object)new UnderlineSpan(), n, n2, 33);
        }
        
        public void e(final char c) {
            if (this.c.length() < 32) {
                this.c.append(c);
            }
        }
        
        public void f() {
            final int length = this.c.length();
            if (length > 0) {
                this.c.delete(length - 1, length);
                for (int i = this.a.size() - 1; i >= 0; --i) {
                    final a a = this.a.get(i);
                    final int c = a.c;
                    if (c != length) {
                        break;
                    }
                    a.c = c - 1;
                }
            }
        }
        
        public f0.a g(int n) {
            final SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i = 0; i < this.b.size(); ++i) {
                spannableStringBuilder.append((CharSequence)this.b.get(i));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append((CharSequence)this.h());
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int n2 = this.e + this.f;
            final int n3 = 32 - n2 - spannableStringBuilder.length();
            final int a = n2 - n3;
            if (n == Integer.MIN_VALUE) {
                if (this.g == 2 && (Math.abs(a) < 3 || n3 < 0)) {
                    n = 1;
                }
                else if (this.g == 2 && a > 0) {
                    n = 2;
                }
                else {
                    n = 0;
                }
            }
            float n4;
            if (n != 1) {
                if (n == 2) {
                    n2 = 32 - n3;
                }
                n4 = n2 / 32.0f * 0.8f + 0.1f;
            }
            else {
                n4 = 0.5f;
            }
            final int d = this.d;
            int n5;
            if (d > 7) {
                n5 = d - 17;
            }
            else {
                n5 = d;
                if (this.g == 1) {
                    n5 = d - (this.h - 1);
                }
            }
            return new f0.a.b().o((CharSequence)spannableStringBuilder).p(Layout$Alignment.ALIGN_NORMAL).h((float)n5, 1).k(n4).l(n).a();
        }
        
        public final SpannableString h() {
            final SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder((CharSequence)this.c);
            final int length = spannableStringBuilder.length();
            final int n2;
            int n = n2 = -1;
            int n4;
            final int n3 = n4 = n2;
            int n5;
            int i = n5 = 0;
            int n6 = n3;
            int n7 = n5;
            int n8 = n2;
            while (i < this.a.size()) {
                final a a = this.a.get(i);
                final boolean b = a.b;
                final int a2 = a.a;
                int n9 = n4;
                int n10 = n5;
                if (a2 != 8) {
                    final int n11 = (a2 == 7) ? 1 : 0;
                    if (a2 != 7) {
                        n4 = d1.a.q()[a2];
                    }
                    n10 = n11;
                    n9 = n4;
                }
                final int c = a.c;
                final int n12 = i + 1;
                int c2;
                if (n12 < this.a.size()) {
                    c2 = this.a.get(n12).c;
                }
                else {
                    c2 = length;
                }
                if (c == c2) {
                    i = n12;
                    n4 = n9;
                    n5 = n10;
                }
                else {
                    int n13;
                    if (n != -1 && !b) {
                        q(spannableStringBuilder, n, c);
                        n13 = -1;
                    }
                    else if ((n13 = n) == -1) {
                        n13 = n;
                        if (b) {
                            n13 = c;
                        }
                    }
                    int n14;
                    if (n8 != -1 && n10 == 0) {
                        o(spannableStringBuilder, n8, c);
                        n14 = -1;
                    }
                    else if ((n14 = n8) == -1) {
                        n14 = n8;
                        if (n10 != 0) {
                            n14 = c;
                        }
                    }
                    i = n12;
                    n = n13;
                    n8 = n14;
                    n4 = n9;
                    n5 = n10;
                    if (n9 == n6) {
                        continue;
                    }
                    n(spannableStringBuilder, n7, c, n6);
                    n6 = n9;
                    i = n12;
                    n = n13;
                    n8 = n14;
                    n7 = c;
                    n4 = n9;
                    n5 = n10;
                }
            }
            if (n != -1 && n != length) {
                q(spannableStringBuilder, n, length);
            }
            if (n8 != -1 && n8 != length) {
                o(spannableStringBuilder, n8, length);
            }
            if (n7 != length) {
                n(spannableStringBuilder, n7, length, n6);
            }
            return new SpannableString((CharSequence)spannableStringBuilder);
        }
        
        public boolean i() {
            return this.a.isEmpty() && this.b.isEmpty() && this.c.length() == 0;
        }
        
        public void j(final int g) {
            this.g = g;
            this.a.clear();
            this.b.clear();
            this.c.setLength(0);
            this.d = 15;
            this.e = 0;
            this.f = 0;
        }
        
        public void k() {
            this.b.add(this.h());
            this.c.setLength(0);
            this.a.clear();
            while (this.b.size() >= Math.min(this.h, this.d)) {
                this.b.remove(0);
            }
        }
        
        public void l(final int g) {
            this.g = g;
        }
        
        public void m(final int h) {
            this.h = h;
        }
        
        public void p(final int n, final boolean b) {
            this.a.add(new a(n, b, this.c.length()));
        }
        
        public static class a
        {
            public final int a;
            public final boolean b;
            public int c;
            
            public a(final int a, final boolean b, final int c) {
                this.a = a;
                this.b = b;
                this.c = c;
            }
        }
    }
}
