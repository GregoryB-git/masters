/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.graphics.Color
 *  android.text.Layout
 *  android.text.Layout$Alignment
 *  android.text.SpannableString
 *  android.text.SpannableStringBuilder
 *  android.text.style.BackgroundColorSpan
 *  android.text.style.ForegroundColorSpan
 *  android.text.style.StyleSpan
 *  android.text.style.UnderlineSpan
 *  java.lang.CharSequence
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.nio.ByteBuffer
 *  java.util.ArrayList
 *  java.util.Collections
 *  java.util.Comparator
 *  java.util.List
 */
package d1;

import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import c1.k;
import c1.p;
import c1.q;
import d1.e;
import d1.f;
import f0.a;
import g0.d;
import g0.o;
import g0.y;
import g0.z;
import j0.i;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public final class c
extends e {
    public final z h = new z();
    public final y i = new y();
    public int j = -1;
    public final boolean k;
    public final int l;
    public final b[] m;
    public b n;
    public List o;
    public List p;
    public c q;
    public int r;

    public c(int n8, List list) {
        boolean bl = true;
        int n9 = n8;
        if (n8 == -1) {
            n9 = 1;
        }
        this.l = n9;
        if (list == null || !d.f(list)) {
            bl = false;
        }
        this.k = bl;
        this.m = new b[8];
        for (n8 = 0; n8 < 8; ++n8) {
            this.m[n8] = new b();
        }
        this.n = this.m[0];
    }

    private void G() {
        for (int i8 = 0; i8 < 8; ++i8) {
            this.m[i8].l();
        }
    }

    private List r() {
        Object object;
        int n8;
        ArrayList arrayList = new ArrayList();
        int n9 = 0;
        for (n8 = 0; n8 < 8; ++n8) {
            if (this.m[n8].j() || !this.m[n8].k() || (object = this.m[n8].c()) == null) continue;
            arrayList.add(object);
        }
        Collections.sort((List)arrayList, (Comparator)c);
        object = new ArrayList(arrayList.size());
        for (n8 = n9; n8 < arrayList.size(); ++n8) {
            object.add((Object)((a)arrayList.get((int)n8)).a);
        }
        return Collections.unmodifiableList((List)object);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void A(int n8) {
        int n9;
        b b8;
        if (n8 == 160) {
            b8 = this.n;
            n9 = 13252;
        } else {
            b8 = new StringBuilder();
            b8.append("Invalid G3 character: ");
            b8.append(n8);
            o.h("Cea708Decoder", b8.toString());
            b8 = this.n;
            n9 = 95;
        }
        b8.a((char)n9);
    }

    public final void B() {
        int n8 = this.i.h(4);
        int n9 = this.i.h(2);
        int n10 = this.i.h(2);
        boolean bl = this.i.g();
        boolean bl2 = this.i.g();
        int n11 = this.i.h(3);
        int n12 = this.i.h(3);
        this.n.m(n8, n9, n10, bl, bl2, n11, n12);
    }

    public final void C() {
        int n8 = this.i.h(2);
        n8 = b.h(this.i.h(2), this.i.h(2), this.i.h(2), n8);
        int n9 = this.i.h(2);
        n9 = b.h(this.i.h(2), this.i.h(2), this.i.h(2), n9);
        this.i.r(2);
        int n10 = b.g(this.i.h(2), this.i.h(2), this.i.h(2));
        this.n.n(n8, n9, n10);
    }

    public final void D() {
        this.i.r(4);
        int n8 = this.i.h(4);
        this.i.r(2);
        int n9 = this.i.h(6);
        this.n.o(n8, n9);
    }

    public final void E() {
        int n8 = this.i.h(2);
        int n9 = b.h(this.i.h(2), this.i.h(2), this.i.h(2), n8);
        int n10 = this.i.h(2);
        int n11 = b.g(this.i.h(2), this.i.h(2), this.i.h(2));
        n8 = n10;
        if (this.i.g()) {
            n8 = n10 | 4;
        }
        boolean bl = this.i.g();
        n10 = this.i.h(2);
        int n12 = this.i.h(2);
        int n13 = this.i.h(2);
        this.i.r(8);
        this.n.q(n9, n11, bl, n8, n10, n12, n13);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final void F() {
        var5_1 = this.q;
        if (var5_1.d != var5_1.b * 2 - 1) {
            var5_1 = new StringBuilder();
            var5_1.append("DtvCcPacket ended prematurely; size is ");
            var5_1.append(this.q.b * 2 - 1);
            var5_1.append(", but current index is ");
            var5_1.append(this.q.d);
            var5_1.append(" (sequence number ");
            var5_1.append(this.q.a);
            var5_1.append(");");
            o.b("Cea708Decoder", var5_1.toString());
        }
        var5_1 = this.i;
        var6_2 = this.q;
        var5_1.o(var6_2.c, var6_2.d);
        var1_3 = 0;
        do {
            block16 : {
                block15 : {
                    block14 : {
                        if (this.i.b() <= 0) return;
                        var3_5 = this.i.h(3);
                        var4_6 = this.i.h(5);
                        var2_4 = var3_5;
                        if (var3_5 == 7) {
                            this.i.r(2);
                            var2_4 = var3_5 = this.i.h(6);
                            if (var3_5 < 7) {
                                var5_1 = new StringBuilder();
                                var5_1.append("Invalid extended service number: ");
                                var5_1.append(var3_5);
                                o.h("Cea708Decoder", var5_1.toString());
                                var2_4 = var3_5;
                            }
                        }
                        if (var4_6 != 0) break block14;
                        if (var2_4 != 0) {
                            var5_1 = new StringBuilder();
                            var5_1.append("serviceNumber is non-zero (");
                            var5_1.append(var2_4);
                            var5_1.append(") when blockSize is 0");
                            o.h("Cea708Decoder", var5_1.toString());
                        }
                        break block15;
                    }
                    if (var2_4 != this.l) {
                        this.i.s(var4_6);
                        continue;
                    }
                    break block16;
                }
                if (var1_3 == 0) return;
                this.o = this.r();
                return;
            }
            var3_5 = this.i.e();
            var2_4 = var1_3;
            do {
                block22 : {
                    block24 : {
                        block19 : {
                            block23 : {
                                block17 : {
                                    block21 : {
                                        block20 : {
                                            block18 : {
                                                var1_3 = var2_4;
                                                if (this.i.e() >= var3_5 + var4_6 * 8) ** break;
                                                var1_3 = this.i.h(8);
                                                if (var1_3 == 16) break block17;
                                                if (var1_3 <= 31) {
                                                    this.s(var1_3);
                                                    continue;
                                                }
                                                if (var1_3 > 127) break block18;
                                                this.x(var1_3);
                                                break block19;
                                            }
                                            if (var1_3 > 159) break block20;
                                            this.t(var1_3);
                                            break block19;
                                        }
                                        if (var1_3 > 255) break block21;
                                        this.y(var1_3);
                                        break block19;
                                    }
                                    var5_1 = new StringBuilder();
                                    var6_2 = "Invalid base command: ";
                                    break block22;
                                }
                                var1_3 = this.i.h(8);
                                if (var1_3 <= 31) {
                                    this.u(var1_3);
                                    continue;
                                }
                                if (var1_3 > 127) break block23;
                                this.z(var1_3);
                                break block19;
                            }
                            if (var1_3 <= 159) {
                                this.v(var1_3);
                                continue;
                            }
                            if (var1_3 > 255) break block24;
                            this.A(var1_3);
                        }
                        var2_4 = 1;
                        continue;
                    }
                    var5_1 = new StringBuilder();
                    var6_2 = "Invalid extended command: ";
                }
                var5_1.append((String)var6_2);
                var5_1.append(var1_3);
                o.h("Cea708Decoder", var5_1.toString());
            } while (true);
            break;
        } while (true);
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
        List list;
        this.p = list = this.o;
        return new f((List)g0.a.e((Object)list));
    }

    @Override
    public void h(p object) {
        object = (ByteBuffer)g0.a.e((Object)object.r);
        byte[] arrby = object.array();
        this.h.R(arrby, object.limit());
        while (this.h.a() >= 3) {
            int n8 = this.h.G();
            int n9 = n8 & 3;
            boolean bl = false;
            n8 = (n8 & 4) == 4 ? 1 : 0;
            byte by = (byte)this.h.G();
            byte by2 = (byte)this.h.G();
            if (n9 != 2 && n9 != 3 || n8 == 0) continue;
            if (n9 == 3) {
                this.q();
                int n10 = (by & 192) >> 6;
                n8 = this.j;
                if (n8 != -1 && n10 != (n8 + 1) % 4) {
                    this.G();
                    object = new StringBuilder();
                    object.append("Sequence number discontinuity. previous=");
                    object.append(this.j);
                    object.append(" current=");
                    object.append(n10);
                    o.h("Cea708Decoder", object.toString());
                }
                this.j = n10;
                n8 = n9 = by & 63;
                if (n9 == 0) {
                    n8 = 64;
                }
                this.q = object = new c(n10, n8);
                arrby = object.c;
                n8 = object.d;
                object.d = n8 + 1;
                arrby[n8] = by2;
            } else {
                if (n9 == 2) {
                    bl = true;
                }
                g0.a.a(bl);
                object = this.q;
                if (object == null) {
                    o.c("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                    continue;
                }
                arrby = object.c;
                n8 = object.d;
                arrby[n8] = by;
                object.d = n8 + 2;
                arrby[n8 + 1] = by2;
            }
            object = this.q;
            if (object.d != object.b * 2 - 1) continue;
            this.q();
        }
    }

    @Override
    public boolean m() {
        if (this.o != this.p) {
            return true;
        }
        return false;
    }

    public final void q() {
        if (this.q == null) {
            return;
        }
        this.F();
        this.q = null;
    }

    /*
     * Exception decompiling
     */
    public final void s(int var1_1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Extractable last case doesn't follow previous
        // org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:486)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.replaceRawSwitches(SwitchReplacer.java:65)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:423)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:217)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:162)
        // org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:95)
        // org.benf.cfr.reader.entities.Method.analyse(Method.java:357)
        // org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:769)
        // org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:701)
        // org.benf.cfr.reader.Main.doJar(Main.java:134)
        // org.benf.cfr.reader.Main.main(Main.java:189)
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final void t(int var1_1) {
        var5_2 = 16;
        var3_3 = 1;
        var4_4 = 1;
        var2_5 = 1;
        switch (var1_1) {
            default: {
                var6_6 = new StringBuilder();
                var6_6.append("Invalid C1 command: ");
                var6_6.append(var1_1);
                o.h("Cea708Decoder", var6_6.toString());
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
                this.w(var1_1 -= 152);
                if (this.r == var1_1) return;
                this.r = var1_1;
                var6_7 = this.m[var1_1];
                ** GOTO lbl93
            }
            case 151: {
                if (this.n.i()) {
                    this.E();
                    return;
                }
                var6_8 = this.i;
                var1_1 = 32;
                ** GOTO lbl43
            }
            case 146: {
                if (this.n.i()) {
                    this.D();
                    return;
                }
                ** GOTO lbl41
            }
            case 145: {
                if (this.n.i()) {
                    this.C();
                    return;
                }
                var6_8 = this.i;
                var1_1 = 24;
                ** GOTO lbl43
            }
            case 144: {
                if (this.n.i()) {
                    this.B();
                    return;
                }
lbl41: // 3 sources:
                var6_8 = this.i;
                var1_1 = var5_2;
lbl43: // 3 sources:
                var6_8.r(var1_1);
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
            case 140: {
                while (var2_5 <= 8) {
                    if (this.i.g()) {
                        this.m[8 - var2_5].l();
                    }
                    ++var2_5;
                }
                return;
            }
            case 139: {
                var1_1 = 1;
                while (var1_1 <= 8) {
                    if (this.i.g()) {
                        var6_9 = this.m[8 - var1_1];
                        var6_9.p(var6_9.k() ^ true);
                    }
                    ++var1_1;
                }
                return;
            }
            case 138: {
                while (var3_3 <= 8) {
                    if (this.i.g()) {
                        this.m[8 - var3_3].p(false);
                    }
                    ++var3_3;
                }
                return;
            }
            case 137: {
                var1_1 = 1;
                while (var1_1 <= 8) {
                    if (this.i.g()) {
                        this.m[8 - var1_1].p(true);
                    }
                    ++var1_1;
                }
                return;
            }
            case 136: {
                while (var4_4 <= 8) {
                    if (this.i.g()) {
                        this.m[8 - var4_4].e();
                    }
                    ++var4_4;
                }
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
                if (this.r == (var1_1 -= 128)) return;
                this.r = var1_1;
                var6_7 = this.m[var1_1];
lbl93: // 2 sources:
                this.n = var6_7;
                return;
            }
            case 142: 
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void u(int n8) {
        y y8;
        if (n8 <= 7) {
            return;
        }
        if (n8 <= 15) {
            y8 = this.i;
            n8 = 8;
        } else if (n8 <= 23) {
            y8 = this.i;
            n8 = 16;
        } else {
            if (n8 > 31) {
                return;
            }
            y8 = this.i;
            n8 = 24;
        }
        y8.r(n8);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void v(int n8) {
        block6 : {
            y y8;
            block5 : {
                block4 : {
                    if (n8 > 135) break block4;
                    y8 = this.i;
                    n8 = 32;
                    break block5;
                }
                if (n8 > 143) break block6;
                y8 = this.i;
                n8 = 40;
            }
            y8.r(n8);
            return;
        }
        if (n8 <= 159) {
            this.i.r(2);
            n8 = this.i.h(6);
            this.i.r(n8 * 8);
        }
    }

    public final void w(int n8) {
        b b8 = this.m[n8];
        this.i.r(2);
        boolean bl = this.i.g();
        this.i.r(2);
        n8 = this.i.h(3);
        boolean bl2 = this.i.g();
        int n9 = this.i.h(7);
        int n10 = this.i.h(8);
        int n11 = this.i.h(4);
        int n12 = this.i.h(4);
        this.i.r(2);
        this.i.r(6);
        this.i.r(2);
        b8.f(bl, n8, bl2, n9, n10, n12, n11, this.i.h(3), this.i.h(3));
    }

    public final void x(int n8) {
        if (n8 == 127) {
            this.n.a('\u266b');
            return;
        }
        this.n.a((char)(n8 & 255));
    }

    public final void y(int n8) {
        this.n.a((char)(n8 & 255));
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void z(int n8) {
        int n9;
        b b8;
        block30 : {
            block20 : {
                block21 : {
                    block22 : {
                        block23 : {
                            block24 : {
                                block25 : {
                                    block26 : {
                                        block27 : {
                                            block28 : {
                                                block29 : {
                                                    n9 = 32;
                                                    if (n8 == 32) break block20;
                                                    if (n8 == 33) break block21;
                                                    if (n8 == 37) break block22;
                                                    if (n8 == 42) break block23;
                                                    if (n8 == 44) break block24;
                                                    if (n8 == 63) break block25;
                                                    if (n8 == 57) break block26;
                                                    if (n8 == 58) break block27;
                                                    if (n8 == 60) break block28;
                                                    if (n8 == 61) break block29;
                                                    switch (n8) {
                                                        default: {
                                                            switch (n8) {
                                                                default: {
                                                                    StringBuilder stringBuilder = new StringBuilder();
                                                                    stringBuilder.append("Invalid G2 character: ");
                                                                    stringBuilder.append(n8);
                                                                    o.h("Cea708Decoder", stringBuilder.toString());
                                                                    return;
                                                                }
                                                                case 127: {
                                                                    b8 = this.n;
                                                                    n9 = 9484;
                                                                    break block30;
                                                                }
                                                                case 126: {
                                                                    b8 = this.n;
                                                                    n9 = 9496;
                                                                    break block30;
                                                                }
                                                                case 125: {
                                                                    b8 = this.n;
                                                                    n9 = 9472;
                                                                    break block30;
                                                                }
                                                                case 124: {
                                                                    b8 = this.n;
                                                                    n9 = 9492;
                                                                    break block30;
                                                                }
                                                                case 123: {
                                                                    b8 = this.n;
                                                                    n9 = 9488;
                                                                    break block30;
                                                                }
                                                                case 122: {
                                                                    b8 = this.n;
                                                                    n9 = 9474;
                                                                    break block30;
                                                                }
                                                                case 121: {
                                                                    b8 = this.n;
                                                                    n9 = 8542;
                                                                    break block30;
                                                                }
                                                                case 120: {
                                                                    b8 = this.n;
                                                                    n9 = 8541;
                                                                    break block30;
                                                                }
                                                                case 119: {
                                                                    b8 = this.n;
                                                                    n9 = 8540;
                                                                    break block30;
                                                                }
                                                                case 118: 
                                                            }
                                                            b8 = this.n;
                                                            n9 = 8539;
                                                            break block30;
                                                        }
                                                        case 53: {
                                                            b8 = this.n;
                                                            n9 = 8226;
                                                            break block30;
                                                        }
                                                        case 52: {
                                                            b8 = this.n;
                                                            n9 = 8221;
                                                            break block30;
                                                        }
                                                        case 51: {
                                                            b8 = this.n;
                                                            n9 = 8220;
                                                            break block30;
                                                        }
                                                        case 50: {
                                                            b8 = this.n;
                                                            n9 = 8217;
                                                            break block30;
                                                        }
                                                        case 49: {
                                                            b8 = this.n;
                                                            n9 = 8216;
                                                            break block30;
                                                        }
                                                        case 48: 
                                                    }
                                                    b8 = this.n;
                                                    n9 = 9608;
                                                    break block30;
                                                }
                                                b8 = this.n;
                                                n9 = 8480;
                                                break block30;
                                            }
                                            b8 = this.n;
                                            n9 = 339;
                                            break block30;
                                        }
                                        b8 = this.n;
                                        n9 = 353;
                                        break block30;
                                    }
                                    b8 = this.n;
                                    n9 = 8482;
                                    break block30;
                                }
                                b8 = this.n;
                                n9 = 376;
                                break block30;
                            }
                            b8 = this.n;
                            n9 = 338;
                            break block30;
                        }
                        b8 = this.n;
                        n9 = 352;
                        break block30;
                    }
                    b8 = this.n;
                    n9 = 8230;
                    break block30;
                }
                b8 = this.n;
                n9 = 160;
                break block30;
            }
            b8 = this.n;
        }
        b8.a((char)n9);
    }

    public static final class a {
        public static final Comparator c = new d1.b();
        public final f0.a a;
        public final int b;

        public a(CharSequence object, Layout.Alignment alignment, float f8, int n8, int n9, float f9, int n10, float f10, boolean bl, int n11, int n12) {
            object = new a.b().o((CharSequence)object).p(alignment).h(f8, n8).i(n9).k(f9).l(n10).n(f10);
            if (bl) {
                object.s(n11);
            }
            this.a = object.a();
            this.b = n12;
        }

        public static /* synthetic */ int a(a a8, a a9) {
            return a.c(a8, a9);
        }

        public static /* synthetic */ int c(a a8, a a9) {
            return Integer.compare((int)a9.b, (int)a8.b);
        }
    }

    public static final class b {
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
        public final List a = new ArrayList();
        public final SpannableStringBuilder b = new SpannableStringBuilder();
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
            int n8;
            int n9;
            v = b.h(2, 2, 2, 0);
            w = n8 = b.h(0, 0, 0, 0);
            x = n9 = b.h(0, 0, 0, 3);
            y = new int[]{0, 0, 0, 0, 0, 2, 0};
            z = new int[]{0, 0, 0, 0, 0, 0, 2};
            A = new int[]{3, 3, 3, 3, 3, 3, 1};
            B = new boolean[]{false, false, false, true, true, true, false};
            C = new int[]{n8, n9, n8, n8, n9, n8, n8};
            D = new int[]{0, 1, 2, 3, 4, 3, 4};
            E = new int[]{0, 0, 0, 0, 0, 3, 3};
            F = new int[]{n8, n8, n8, n8, n8, n9, n9};
        }

        public b() {
            this.l();
        }

        public static int g(int n8, int n9, int n10) {
            return b.h(n8, n9, n10, 0);
        }

        /*
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Lifted jumps to return sites
         */
        public static int h(int var0, int var1_1, int var2_2, int var3_3) {
            block4 : {
                block3 : {
                    var4_4 = 0;
                    g0.a.c(var0, 0, 4);
                    g0.a.c(var1_1, 0, 4);
                    g0.a.c(var2_2, 0, 4);
                    g0.a.c(var3_3, 0, 4);
                    if (var3_3 == 0 || var3_3 == 1) ** GOTO lbl-1000
                    if (var3_3 != 2) {
                        ** if (var3_3 == 3) goto lbl-1000
                    }
                    break block3;
lbl-1000: // 2 sources:
                    {
                        var3_3 = 255;
                        ** GOTO lbl16
                    }
lbl-1000: // 1 sources:
                    {
                        var3_3 = 0;
                    }
                    break block4;
                }
                var3_3 = 127;
            }
            var0 = var0 > 1 ? 255 : 0;
            var1_1 = var1_1 > 1 ? 255 : 0;
            if (var2_2 <= 1) return Color.argb((int)var3_3, (int)var0, (int)var1_1, (int)var4_4);
            var4_4 = 255;
            return Color.argb((int)var3_3, (int)var0, (int)var1_1, (int)var4_4);
        }

        public void a(char c8) {
            if (c8 == '\n') {
                this.a.add((Object)this.d());
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
                do {
                    if (this.a.size() < this.j && this.a.size() < 15) {
                        this.u = this.a.size();
                        return;
                    }
                    this.a.remove(0);
                } while (true);
            }
            this.b.append(c8);
        }

        public void b() {
            int n8 = this.b.length();
            if (n8 > 0) {
                this.b.delete(n8 - 1, n8);
            }
        }

        public a c() {
            float f8;
            Layout.Alignment alignment;
            boolean bl;
            int n8;
            SpannableStringBuilder spannableStringBuilder;
            float f9;
            block9 : {
                block6 : {
                    block7 : {
                        block8 : {
                            if (this.j()) {
                                return null;
                            }
                            spannableStringBuilder = new SpannableStringBuilder();
                            bl = false;
                            for (n8 = 0; n8 < this.a.size(); ++n8) {
                                spannableStringBuilder.append((CharSequence)this.a.get(n8));
                                spannableStringBuilder.append('\n');
                            }
                            spannableStringBuilder.append((CharSequence)this.d());
                            n8 = this.k;
                            if (n8 == 0) break block6;
                            if (n8 == 1) break block7;
                            if (n8 == 2) break block8;
                            if (n8 != 3) {
                                StringBuilder stringBuilder = new StringBuilder();
                                stringBuilder.append("Unexpected justification value: ");
                                stringBuilder.append(this.k);
                                throw new IllegalArgumentException(stringBuilder.toString());
                            }
                            break block6;
                        }
                        alignment = Layout.Alignment.ALIGN_CENTER;
                        break block9;
                    }
                    alignment = Layout.Alignment.ALIGN_OPPOSITE;
                    break block9;
                }
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            if (this.f) {
                f9 = (float)this.h / 99.0f;
                f8 = (float)this.g / 99.0f;
            } else {
                f9 = (float)this.h / 209.0f;
                f8 = (float)this.g / 74.0f;
            }
            int n9 = this.i;
            n8 = n9 / 3 == 0 ? 0 : (n9 / 3 == 1 ? 1 : 2);
            n9 = n9 % 3 == 0 ? 0 : (n9 % 3 == 1 ? 1 : 2);
            if (this.n != w) {
                bl = true;
            }
            return new a((CharSequence)spannableStringBuilder, alignment, f8 * 0.9f + 0.05f, 0, n8, f9 * 0.9f + 0.05f, n9, -3.4028235E38f, bl, this.n, this.e);
        }

        public SpannableString d() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder((CharSequence)this.b);
            int n8 = spannableStringBuilder.length();
            if (n8 > 0) {
                if (this.o != -1) {
                    spannableStringBuilder.setSpan((Object)new StyleSpan(2), this.o, n8, 33);
                }
                if (this.p != -1) {
                    spannableStringBuilder.setSpan((Object)new UnderlineSpan(), this.p, n8, 33);
                }
                if (this.q != -1) {
                    spannableStringBuilder.setSpan((Object)new ForegroundColorSpan(this.r), this.q, n8, 33);
                }
                if (this.s != -1) {
                    spannableStringBuilder.setSpan((Object)new BackgroundColorSpan(this.t), this.s, n8, 33);
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

        public void f(boolean bl, int n8, boolean bl2, int n9, int n10, int n11, int n12, int n13, int n14) {
            this.c = true;
            this.d = bl;
            this.e = n8;
            this.f = bl2;
            this.g = n9;
            this.h = n10;
            this.i = n12;
            n8 = this.j;
            n9 = n11 + 1;
            if (n8 != n9) {
                this.j = n9;
                while (this.a.size() >= this.j || this.a.size() >= 15) {
                    this.a.remove(0);
                }
            }
            if (n13 != 0 && this.l != n13) {
                this.l = n13;
                n8 = n13 - 1;
                this.q(C[n8], x, B[n8], 0, z[n8], A[n8], y[n8]);
            }
            if (n14 != 0 && this.m != n14) {
                this.m = n14;
                n8 = n14 - 1;
                this.m(0, 1, 1, false, false, E[n8], D[n8]);
                this.n(v, F[n8], w);
            }
        }

        public boolean i() {
            return this.c;
        }

        public boolean j() {
            if (this.i() && (!this.a.isEmpty() || this.b.length() != 0)) {
                return false;
            }
            return true;
        }

        public boolean k() {
            return this.d;
        }

        public void l() {
            int n8;
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
            this.n = n8 = w;
            this.r = v;
            this.t = n8;
        }

        public void m(int n8, int n9, int n10, boolean bl, boolean bl2, int n11, int n12) {
            if (this.o != -1) {
                if (!bl) {
                    this.b.setSpan((Object)new StyleSpan(2), this.o, this.b.length(), 33);
                    this.o = -1;
                }
            } else if (bl) {
                this.o = this.b.length();
            }
            if (this.p != -1) {
                if (!bl2) {
                    this.b.setSpan((Object)new UnderlineSpan(), this.p, this.b.length(), 33);
                    this.p = -1;
                    return;
                }
            } else if (bl2) {
                this.p = this.b.length();
            }
        }

        public void n(int n8, int n9, int n10) {
            if (this.q != -1 && this.r != n8) {
                this.b.setSpan((Object)new ForegroundColorSpan(this.r), this.q, this.b.length(), 33);
            }
            if (n8 != v) {
                this.q = this.b.length();
                this.r = n8;
            }
            if (this.s != -1 && this.t != n9) {
                this.b.setSpan((Object)new BackgroundColorSpan(this.t), this.s, this.b.length(), 33);
            }
            if (n9 != w) {
                this.s = this.b.length();
                this.t = n9;
            }
        }

        public void o(int n8, int n9) {
            if (this.u != n8) {
                this.a('\n');
            }
            this.u = n8;
        }

        public void p(boolean bl) {
            this.d = bl;
        }

        public void q(int n8, int n9, boolean bl, int n10, int n11, int n12, int n13) {
            this.n = n8;
            this.k = n13;
        }
    }

    public static final class c {
        public final int a;
        public final int b;
        public final byte[] c;
        public int d;

        public c(int n8, int n9) {
            this.a = n8;
            this.b = n9;
            this.c = new byte[n9 * 2 - 1];
            this.d = 0;
        }
    }

}

