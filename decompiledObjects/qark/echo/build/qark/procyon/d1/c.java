// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package d1;

import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.UnderlineSpan;
import android.text.style.StyleSpan;
import android.text.SpannableString;
import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.Layout$Alignment;
import c1.q;
import java.nio.ByteBuffer;
import c1.p;
import c1.k;
import g0.o;
import f0.a;
import java.util.Comparator;
import java.util.Collections;
import java.util.ArrayList;
import g0.d;
import java.util.List;
import g0.y;
import g0.z;

public final class c extends e
{
    public final z h;
    public final y i;
    public int j;
    public final boolean k;
    public final int l;
    public final b[] m;
    public b n;
    public List o;
    public List p;
    public c q;
    public int r;
    
    public c(int i, final List list) {
        this.h = new z();
        this.i = new y();
        this.j = -1;
        boolean k = true;
        int l = i;
        if (i == -1) {
            l = 1;
        }
        this.l = l;
        if (list == null || !g0.d.f(list)) {
            k = false;
        }
        this.k = k;
        this.m = new b[8];
        for (i = 0; i < 8; ++i) {
            this.m[i] = new b();
        }
        this.n = this.m[0];
    }
    
    private void G() {
        for (int i = 0; i < 8; ++i) {
            this.m[i].l();
        }
    }
    
    private List r() {
        final ArrayList<a> list = new ArrayList<a>();
        final int n = 0;
        for (int i = 0; i < 8; ++i) {
            if (!this.m[i].j() && this.m[i].k()) {
                final a c = this.m[i].c();
                if (c != null) {
                    list.add(c);
                }
            }
        }
        Collections.sort((List<Object>)list, a.b());
        final ArrayList list2 = new ArrayList<f0.a>(list.size());
        for (int j = n; j < list.size(); ++j) {
            list2.add(((a)list.get(j)).a);
        }
        return Collections.unmodifiableList((List<?>)list2);
    }
    
    public final void A(final int i) {
        b b;
        char c;
        if (i == 160) {
            b = this.n;
            c = '\u33c4';
        }
        else {
            final StringBuilder sb = new StringBuilder();
            sb.append("Invalid G3 character: ");
            sb.append(i);
            g0.o.h("Cea708Decoder", sb.toString());
            b = this.n;
            c = '_';
        }
        b.a(c);
    }
    
    public final void B() {
        this.n.m(this.i.h(4), this.i.h(2), this.i.h(2), this.i.g(), this.i.g(), this.i.h(3), this.i.h(3));
    }
    
    public final void C() {
        final int h = b.h(this.i.h(2), this.i.h(2), this.i.h(2), this.i.h(2));
        final int h2 = b.h(this.i.h(2), this.i.h(2), this.i.h(2), this.i.h(2));
        this.i.r(2);
        this.n.n(h, h2, b.g(this.i.h(2), this.i.h(2), this.i.h(2)));
    }
    
    public final void D() {
        this.i.r(4);
        final int h = this.i.h(4);
        this.i.r(2);
        this.n.o(h, this.i.h(6));
    }
    
    public final void E() {
        final int h = b.h(this.i.h(2), this.i.h(2), this.i.h(2), this.i.h(2));
        final int h2 = this.i.h(2);
        final int g = b.g(this.i.h(2), this.i.h(2), this.i.h(2));
        int n = h2;
        if (this.i.g()) {
            n = (h2 | 0x4);
        }
        final boolean g2 = this.i.g();
        final int h3 = this.i.h(2);
        final int h4 = this.i.h(2);
        final int h5 = this.i.h(2);
        this.i.r(8);
        this.n.q(h, g, g2, n, h3, h4, h5);
    }
    
    public final void F() {
        final c q = this.q;
        if (q.d != q.b * 2 - 1) {
            final StringBuilder sb = new StringBuilder();
            sb.append("DtvCcPacket ended prematurely; size is ");
            sb.append(this.q.b * 2 - 1);
            sb.append(", but current index is ");
            sb.append(this.q.d);
            sb.append(" (sequence number ");
            sb.append(this.q.a);
            sb.append(");");
            g0.o.b("Cea708Decoder", sb.toString());
        }
        final y i = this.i;
        final c q2 = this.q;
        i.o(q2.c, q2.d);
        int n = 0;
        while (this.i.b() > 0) {
            final int h = this.i.h(3);
            final int h2 = this.i.h(5);
            int j;
            if ((j = h) == 7) {
                this.i.r(2);
                final int h3 = this.i.h(6);
                if ((j = h3) < 7) {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("Invalid extended service number: ");
                    sb2.append(h3);
                    g0.o.h("Cea708Decoder", sb2.toString());
                    j = h3;
                }
            }
            if (h2 == 0) {
                if (j != 0) {
                    final StringBuilder sb3 = new StringBuilder();
                    sb3.append("serviceNumber is non-zero (");
                    sb3.append(j);
                    sb3.append(") when blockSize is 0");
                    g0.o.h("Cea708Decoder", sb3.toString());
                    break;
                }
                break;
            }
            else if (j != this.l) {
                this.i.s(h2);
            }
            else {
                final int e = this.i.e();
                int n2 = n;
                while (true) {
                    n = n2;
                    if (this.i.e() >= e + h2 * 8) {
                        break;
                    }
                    int k = this.i.h(8);
                    StringBuilder sb4 = null;
                    String str = null;
                    Label_0437: {
                        if (k != 16) {
                            if (k <= 31) {
                                this.s(k);
                                continue;
                            }
                            if (k <= 127) {
                                this.x(k);
                            }
                            else if (k <= 159) {
                                this.t(k);
                            }
                            else {
                                if (k > 255) {
                                    sb4 = new StringBuilder();
                                    str = "Invalid base command: ";
                                    break Label_0437;
                                }
                                this.y(k);
                            }
                        }
                        else {
                            k = this.i.h(8);
                            if (k <= 31) {
                                this.u(k);
                                continue;
                            }
                            if (k <= 127) {
                                this.z(k);
                            }
                            else {
                                if (k <= 159) {
                                    this.v(k);
                                    continue;
                                }
                                if (k > 255) {
                                    sb4 = new StringBuilder();
                                    str = "Invalid extended command: ";
                                    break Label_0437;
                                }
                                this.A(k);
                            }
                        }
                        n2 = 1;
                        continue;
                    }
                    sb4.append(str);
                    sb4.append(k);
                    g0.o.h("Cea708Decoder", sb4.toString());
                }
            }
        }
        if (n != 0) {
            this.o = this.r();
        }
    }
    
    @Override
    public void flush() {
        super.flush();
        this.o = null;
        this.p = null;
        this.r = 0;
        this.n = this.m[0];
        this.G();
        this.q = null;
    }
    
    @Override
    public k g() {
        final List o = this.o;
        this.p = o;
        return new f((List)g0.a.e(o));
    }
    
    @Override
    public void h(final p p) {
        final ByteBuffer byteBuffer = (ByteBuffer)g0.a.e(p.r);
        this.h.R(byteBuffer.array(), byteBuffer.limit());
        while (this.h.a() >= 3) {
            final int g = this.h.G();
            final int n = g & 0x3;
            boolean b = false;
            final boolean b2 = (g & 0x4) == 0x4;
            final byte b3 = (byte)this.h.G();
            final byte b4 = (byte)this.h.G();
            if (n != 2 && n != 3) {
                continue;
            }
            if (!b2) {
                continue;
            }
            if (n == 3) {
                this.q();
                final int n2 = (b3 & 0xC0) >> 6;
                final int j = this.j;
                if (j != -1 && n2 != (j + 1) % 4) {
                    this.G();
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Sequence number discontinuity. previous=");
                    sb.append(this.j);
                    sb.append(" current=");
                    sb.append(n2);
                    g0.o.h("Cea708Decoder", sb.toString());
                }
                this.j = n2;
                int n3;
                if ((n3 = (b3 & 0x3F)) == 0) {
                    n3 = 64;
                }
                final c q = new c(n2, n3);
                this.q = q;
                q.c[q.d++] = b4;
            }
            else {
                if (n == 2) {
                    b = true;
                }
                g0.a.a(b);
                final c q2 = this.q;
                if (q2 == null) {
                    g0.o.c("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                    continue;
                }
                final byte[] c = q2.c;
                final int d = q2.d;
                c[d] = b3;
                q2.d = d + 2;
                c[d + 1] = b4;
            }
            final c q3 = this.q;
            if (q3.d != q3.b * 2 - 1) {
                continue;
            }
            this.q();
        }
    }
    
    @Override
    public boolean m() {
        return this.o != this.p;
    }
    
    public final void q() {
        if (this.q == null) {
            return;
        }
        this.F();
        this.q = null;
    }
    
    public final void s(int i) {
        if (i != 0) {
            if (i != 3) {
                final int n = 8;
                if (i == 8) {
                    this.n.b();
                    return;
                }
                switch (i) {
                    default: {
                        y y;
                        if (i >= 17 && i <= 23) {
                            final StringBuilder sb = new StringBuilder();
                            sb.append("Currently unsupported COMMAND_EXT1 Command: ");
                            sb.append(i);
                            g0.o.h("Cea708Decoder", sb.toString());
                            y = this.i;
                            i = n;
                        }
                        else {
                            if (i < 24 || i > 31) {
                                final StringBuilder sb2 = new StringBuilder();
                                sb2.append("Invalid C0 command: ");
                                sb2.append(i);
                                g0.o.h("Cea708Decoder", sb2.toString());
                                return;
                            }
                            final StringBuilder sb3 = new StringBuilder();
                            sb3.append("Currently unsupported COMMAND_P16 Command: ");
                            sb3.append(i);
                            g0.o.h("Cea708Decoder", sb3.toString());
                            y = this.i;
                            i = 16;
                        }
                        y.r(i);
                    }
                    case 13: {
                        this.n.a('\n');
                    }
                    case 12: {
                        this.G();
                    }
                    case 14: {
                        break;
                    }
                }
            }
            else {
                this.o = this.r();
            }
        }
    }
    
    public final void t(int i) {
        final int n = 16;
        int j = 1;
        int k = 1;
        int l = 1;
        while (true) {
            Label_0272: {
                b n2 = null;
                switch (i) {
                    default: {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Invalid C1 command: ");
                        sb.append(i);
                        g0.o.h("Cea708Decoder", sb.toString());
                        return;
                    }
                    case 152:
                    case 153:
                    case 154:
                    case 155:
                    case 156:
                    case 157:
                    case 158:
                    case 159: {
                        i -= 152;
                        this.w(i);
                        if (this.r != i) {
                            this.r = i;
                            n2 = this.m[i];
                            break;
                        }
                        return;
                    }
                    case 151: {
                        if (!this.n.i()) {
                            final y y = this.i;
                            i = 32;
                            break Label_0250;
                        }
                        this.E();
                        return;
                    }
                    case 146: {
                        if (!this.n.i()) {
                            break Label_0272;
                        }
                        this.D();
                        return;
                    }
                    case 145: {
                        if (!this.n.i()) {
                            final y y = this.i;
                            i = 24;
                            break Label_0250;
                        }
                        this.C();
                        return;
                    }
                    case 144: {
                        if (!this.n.i()) {
                            break Label_0272;
                        }
                        this.B();
                        return;
                    }
                    case 143: {
                        this.G();
                        return;
                    }
                    case 141: {
                        this.i.r(8);
                        return;
                    }
                    case 128:
                    case 129:
                    case 130:
                    case 131:
                    case 132:
                    case 133:
                    case 134:
                    case 135: {
                        i -= 128;
                        if (this.r != i) {
                            this.r = i;
                            n2 = this.m[i];
                            break;
                        }
                        return;
                    }
                    case 142: {
                        return;
                    }
                    case 140: {
                        while (l <= 8) {
                            if (this.i.g()) {
                                this.m[8 - l].l();
                            }
                            ++l;
                        }
                        return;
                    }
                    case 139: {
                        b b;
                        for (i = 1; i <= 8; ++i) {
                            if (this.i.g()) {
                                b = this.m[8 - i];
                                b.p(b.k() ^ true);
                            }
                        }
                        return;
                    }
                    case 138: {
                        while (j <= 8) {
                            if (this.i.g()) {
                                this.m[8 - j].p(false);
                            }
                            ++j;
                        }
                        return;
                    }
                    case 137: {
                        for (i = 1; i <= 8; ++i) {
                            if (this.i.g()) {
                                this.m[8 - i].p(true);
                            }
                        }
                        return;
                    }
                    case 136: {
                        while (k <= 8) {
                            if (this.i.g()) {
                                this.m[8 - k].e();
                            }
                            ++k;
                        }
                        return;
                    }
                }
                this.n = n2;
                return;
                y y = null;
                y.r(i);
                return;
            }
            final y y = this.i;
            i = n;
            continue;
        }
    }
    
    public final void u(int n) {
        if (n <= 7) {
            return;
        }
        y y;
        if (n <= 15) {
            y = this.i;
            n = 8;
        }
        else if (n <= 23) {
            y = this.i;
            n = 16;
        }
        else {
            if (n > 31) {
                return;
            }
            y = this.i;
            n = 24;
        }
        y.r(n);
    }
    
    public final void v(int h) {
        y y;
        if (h <= 135) {
            y = this.i;
            h = 32;
        }
        else {
            if (h > 143) {
                if (h <= 159) {
                    this.i.r(2);
                    h = this.i.h(6);
                    this.i.r(h * 8);
                }
                return;
            }
            y = this.i;
            h = 40;
        }
        y.r(h);
    }
    
    public final void w(int h) {
        final b b = this.m[h];
        this.i.r(2);
        final boolean g = this.i.g();
        this.i.r(2);
        h = this.i.h(3);
        final boolean g2 = this.i.g();
        final int h2 = this.i.h(7);
        final int h3 = this.i.h(8);
        final int h4 = this.i.h(4);
        final int h5 = this.i.h(4);
        this.i.r(2);
        this.i.r(6);
        this.i.r(2);
        b.f(g, h, g2, h2, h3, h5, h4, this.i.h(3), this.i.h(3));
    }
    
    public final void x(final int n) {
        if (n == 127) {
            this.n.a('\u266b');
            return;
        }
        this.n.a((char)(n & 0xFF));
    }
    
    public final void y(final int n) {
        this.n.a((char)(n & 0xFF));
    }
    
    public final void z(final int i) {
        char c = ' ';
        b b = null;
        Label_0201: {
            if (i != 32) {
                if (i != 33) {
                    if (i != 37) {
                        if (i != 42) {
                            if (i != 44) {
                                if (i != 63) {
                                    if (i != 57) {
                                        if (i != 58) {
                                            if (i != 60) {
                                                if (i != 61) {
                                                    switch (i) {
                                                        default: {
                                                            switch (i) {
                                                                default: {
                                                                    final StringBuilder sb = new StringBuilder();
                                                                    sb.append("Invalid G2 character: ");
                                                                    sb.append(i);
                                                                    g0.o.h("Cea708Decoder", sb.toString());
                                                                    return;
                                                                }
                                                                case 127: {
                                                                    b = this.n;
                                                                    c = '\u250c';
                                                                    break Label_0201;
                                                                }
                                                                case 126: {
                                                                    b = this.n;
                                                                    c = '\u2518';
                                                                    break Label_0201;
                                                                }
                                                                case 125: {
                                                                    b = this.n;
                                                                    c = '\u2500';
                                                                    break Label_0201;
                                                                }
                                                                case 124: {
                                                                    b = this.n;
                                                                    c = '\u2514';
                                                                    break Label_0201;
                                                                }
                                                                case 123: {
                                                                    b = this.n;
                                                                    c = '\u2510';
                                                                    break Label_0201;
                                                                }
                                                                case 122: {
                                                                    b = this.n;
                                                                    c = '\u2502';
                                                                    break Label_0201;
                                                                }
                                                                case 121: {
                                                                    b = this.n;
                                                                    c = '\u215e';
                                                                    break Label_0201;
                                                                }
                                                                case 120: {
                                                                    b = this.n;
                                                                    c = '\u215d';
                                                                    break Label_0201;
                                                                }
                                                                case 119: {
                                                                    b = this.n;
                                                                    c = '\u215c';
                                                                    break Label_0201;
                                                                }
                                                                case 118: {
                                                                    b = this.n;
                                                                    c = '\u215b';
                                                                    break Label_0201;
                                                                }
                                                            }
                                                            break;
                                                        }
                                                        case 53: {
                                                            b = this.n;
                                                            c = '\u2022';
                                                            break;
                                                        }
                                                        case 52: {
                                                            b = this.n;
                                                            c = '\u201d';
                                                            break;
                                                        }
                                                        case 51: {
                                                            b = this.n;
                                                            c = '\u201c';
                                                            break;
                                                        }
                                                        case 50: {
                                                            b = this.n;
                                                            c = '\u2019';
                                                            break;
                                                        }
                                                        case 49: {
                                                            b = this.n;
                                                            c = '\u2018';
                                                            break;
                                                        }
                                                        case 48: {
                                                            b = this.n;
                                                            c = '\u2588';
                                                            break;
                                                        }
                                                    }
                                                }
                                                else {
                                                    b = this.n;
                                                    c = '\u2120';
                                                }
                                            }
                                            else {
                                                b = this.n;
                                                c = '\u0153';
                                            }
                                        }
                                        else {
                                            b = this.n;
                                            c = '\u0161';
                                        }
                                    }
                                    else {
                                        b = this.n;
                                        c = '\u2122';
                                    }
                                }
                                else {
                                    b = this.n;
                                    c = '\u0178';
                                }
                            }
                            else {
                                b = this.n;
                                c = '\u0152';
                            }
                        }
                        else {
                            b = this.n;
                            c = '\u0160';
                        }
                    }
                    else {
                        b = this.n;
                        c = '\u2026';
                    }
                }
                else {
                    b = this.n;
                    c = ' ';
                }
            }
            else {
                b = this.n;
            }
        }
        b.a(c);
    }
    
    public static final class a
    {
        public static final Comparator c;
        public final f0.a a;
        public final int b;
        
        static {
            c = new d1.b();
        }
        
        public a(final CharSequence charSequence, final Layout$Alignment layout$Alignment, final float n, final int n2, final int n3, final float n4, final int n5, final float n6, final boolean b, final int n7, final int b2) {
            final f0.a.b n8 = new f0.a.b().o(charSequence).p(layout$Alignment).h(n, n2).i(n3).k(n4).l(n5).n(n6);
            if (b) {
                n8.s(n7);
            }
            this.a = n8.a();
            this.b = b2;
        }
        
        public static /* synthetic */ Comparator b() {
            return a.c;
        }
    }
    
    public static final class b
    {
        public static final int[] A;
        public static final boolean[] B;
        public static final int[] C;
        public static final int[] D;
        public static final int[] E;
        public static final int[] F;
        public static final int v;
        public static final int w;
        public static final int x;
        public static final int[] y;
        public static final int[] z;
        public final List a;
        public final SpannableStringBuilder b;
        public boolean c;
        public boolean d;
        public int e;
        public boolean f;
        public int g;
        public int h;
        public int i;
        public int j;
        public int k;
        public int l;
        public int m;
        public int n;
        public int o;
        public int p;
        public int q;
        public int r;
        public int s;
        public int t;
        public int u;
        
        static {
            v = h(2, 2, 2, 0);
            final int n = w = h(0, 0, 0, 0);
            final int n2 = x = h(0, 0, 0, 3);
            y = new int[] { 0, 0, 0, 0, 0, 2, 0 };
            z = new int[] { 0, 0, 0, 0, 0, 0, 2 };
            A = new int[] { 3, 3, 3, 3, 3, 3, 1 };
            B = new boolean[] { false, false, false, true, true, true, false };
            C = new int[] { n, n2, n, n, n2, n, n };
            D = new int[] { 0, 1, 2, 3, 4, 3, 4 };
            E = new int[] { 0, 0, 0, 0, 0, 3, 3 };
            F = new int[] { n, n, n, n, n, n2, n2 };
        }
        
        public b() {
            this.a = new ArrayList();
            this.b = new SpannableStringBuilder();
            this.l();
        }
        
        public static int g(final int n, final int n2, final int n3) {
            return h(n, n2, n3, 0);
        }
        
        public static int h(int n, int n2, final int n3, int n4) {
            int n5 = 0;
            g0.a.c(n, 0, 4);
            g0.a.c(n2, 0, 4);
            g0.a.c(n3, 0, 4);
            g0.a.c(n4, 0, 4);
            Label_0065: {
                if (n4 != 0 && n4 != 1) {
                    if (n4 == 2) {
                        n4 = 127;
                        break Label_0065;
                    }
                    if (n4 == 3) {
                        n4 = 0;
                        break Label_0065;
                    }
                }
                n4 = 255;
            }
            if (n > 1) {
                n = 255;
            }
            else {
                n = 0;
            }
            if (n2 > 1) {
                n2 = 255;
            }
            else {
                n2 = 0;
            }
            if (n3 > 1) {
                n5 = 255;
            }
            return Color.argb(n4, n, n2, n5);
        }
        
        public void a(final char c) {
            if (c == '\n') {
                this.a.add(this.d());
                this.b.clear();
                if (this.o != -1) {
                    this.o = 0;
                }
                if (this.p != -1) {
                    this.p = 0;
                }
                if (this.q != -1) {
                    this.q = 0;
                }
                if (this.s != -1) {
                    this.s = 0;
                }
                while (this.a.size() >= this.j || this.a.size() >= 15) {
                    this.a.remove(0);
                }
                this.u = this.a.size();
                return;
            }
            this.b.append(c);
        }
        
        public void b() {
            final int length = this.b.length();
            if (length > 0) {
                this.b.delete(length - 1, length);
            }
        }
        
        public a c() {
            if (this.j()) {
                return null;
            }
            final SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            boolean b = false;
            for (int i = 0; i < this.a.size(); ++i) {
                spannableStringBuilder.append((CharSequence)this.a.get(i));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append((CharSequence)this.d());
            final int k = this.k;
            while (true) {
                Label_0163: {
                    if (k == 0) {
                        break Label_0163;
                    }
                    Layout$Alignment layout$Alignment;
                    if (k != 1) {
                        if (k != 2) {
                            if (k == 3) {
                                break Label_0163;
                            }
                            final StringBuilder sb = new StringBuilder();
                            sb.append("Unexpected justification value: ");
                            sb.append(this.k);
                            throw new IllegalArgumentException(sb.toString());
                        }
                        else {
                            layout$Alignment = Layout$Alignment.ALIGN_CENTER;
                        }
                    }
                    else {
                        layout$Alignment = Layout$Alignment.ALIGN_OPPOSITE;
                    }
                    float n;
                    float n2;
                    if (this.f) {
                        n = this.h / 99.0f;
                        n2 = this.g / 99.0f;
                    }
                    else {
                        n = this.h / 209.0f;
                        n2 = this.g / 74.0f;
                    }
                    final int j = this.i;
                    int n3;
                    if (j / 3 == 0) {
                        n3 = 0;
                    }
                    else if (j / 3 == 1) {
                        n3 = 1;
                    }
                    else {
                        n3 = 2;
                    }
                    int n4;
                    if (j % 3 == 0) {
                        n4 = 0;
                    }
                    else if (j % 3 == 1) {
                        n4 = 1;
                    }
                    else {
                        n4 = 2;
                    }
                    if (this.n != d1.c.b.w) {
                        b = true;
                    }
                    return new a((CharSequence)spannableStringBuilder, layout$Alignment, n2 * 0.9f + 0.05f, 0, n3, n * 0.9f + 0.05f, n4, -3.4028235E38f, b, this.n, this.e);
                }
                Layout$Alignment layout$Alignment = Layout$Alignment.ALIGN_NORMAL;
                continue;
            }
        }
        
        public SpannableString d() {
            final SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder((CharSequence)this.b);
            final int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.o != -1) {
                    spannableStringBuilder.setSpan((Object)new StyleSpan(2), this.o, length, 33);
                }
                if (this.p != -1) {
                    spannableStringBuilder.setSpan((Object)new UnderlineSpan(), this.p, length, 33);
                }
                if (this.q != -1) {
                    spannableStringBuilder.setSpan((Object)new ForegroundColorSpan(this.r), this.q, length, 33);
                }
                if (this.s != -1) {
                    spannableStringBuilder.setSpan((Object)new BackgroundColorSpan(this.t), this.s, length, 33);
                }
            }
            return new SpannableString((CharSequence)spannableStringBuilder);
        }
        
        public void e() {
            this.a.clear();
            this.b.clear();
            this.o = -1;
            this.p = -1;
            this.q = -1;
            this.s = -1;
            this.u = 0;
        }
        
        public void f(final boolean d, int j, final boolean f, int n, final int h, final int n2, final int i, final int l, final int m) {
            this.c = true;
            this.d = d;
            this.e = j;
            this.f = f;
            this.g = n;
            this.h = h;
            this.i = i;
            j = this.j;
            n = n2 + 1;
            if (j != n) {
                this.j = n;
                while (this.a.size() >= this.j || this.a.size() >= 15) {
                    this.a.remove(0);
                }
            }
            if (l != 0 && this.l != l) {
                this.l = l;
                j = l - 1;
                this.q(d1.c.b.C[j], d1.c.b.x, d1.c.b.B[j], 0, d1.c.b.z[j], d1.c.b.A[j], d1.c.b.y[j]);
            }
            if (m != 0 && this.m != m) {
                this.m = m;
                j = m - 1;
                this.m(0, 1, 1, false, false, d1.c.b.E[j], d1.c.b.D[j]);
                this.n(d1.c.b.v, d1.c.b.F[j], d1.c.b.w);
            }
        }
        
        public boolean i() {
            return this.c;
        }
        
        public boolean j() {
            return !this.i() || (this.a.isEmpty() && this.b.length() == 0);
        }
        
        public boolean k() {
            return this.d;
        }
        
        public void l() {
            this.e();
            this.c = false;
            this.d = false;
            this.e = 4;
            this.f = false;
            this.g = 0;
            this.h = 0;
            this.i = 0;
            this.j = 15;
            this.k = 0;
            this.l = 0;
            this.m = 0;
            final int w = d1.c.b.w;
            this.n = w;
            this.r = d1.c.b.v;
            this.t = w;
        }
        
        public void m(final int n, final int n2, final int n3, final boolean b, final boolean b2, final int n4, final int n5) {
            if (this.o != -1) {
                if (!b) {
                    this.b.setSpan((Object)new StyleSpan(2), this.o, this.b.length(), 33);
                    this.o = -1;
                }
            }
            else if (b) {
                this.o = this.b.length();
            }
            if (this.p != -1) {
                if (!b2) {
                    this.b.setSpan((Object)new UnderlineSpan(), this.p, this.b.length(), 33);
                    this.p = -1;
                }
            }
            else if (b2) {
                this.p = this.b.length();
            }
        }
        
        public void n(final int r, final int t, final int n) {
            if (this.q != -1 && this.r != r) {
                this.b.setSpan((Object)new ForegroundColorSpan(this.r), this.q, this.b.length(), 33);
            }
            if (r != d1.c.b.v) {
                this.q = this.b.length();
                this.r = r;
            }
            if (this.s != -1 && this.t != t) {
                this.b.setSpan((Object)new BackgroundColorSpan(this.t), this.s, this.b.length(), 33);
            }
            if (t != d1.c.b.w) {
                this.s = this.b.length();
                this.t = t;
            }
        }
        
        public void o(final int u, final int n) {
            if (this.u != u) {
                this.a('\n');
            }
            this.u = u;
        }
        
        public void p(final boolean d) {
            this.d = d;
        }
        
        public void q(final int n, final int n2, final boolean b, final int n3, final int n4, final int n5, final int k) {
            this.n = n;
            this.k = k;
        }
    }
    
    public static final class c
    {
        public final int a;
        public final int b;
        public final byte[] c;
        public int d;
        
        public c(final int a, final int b) {
            this.a = a;
            this.b = b;
            this.c = new byte[b * 2 - 1];
            this.d = 0;
        }
    }
}
