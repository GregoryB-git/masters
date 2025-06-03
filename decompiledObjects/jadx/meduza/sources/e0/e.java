package e0;

import a4.g;
import a4.h;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.Layout;
import android.util.Base64;
import android.util.JsonReader;
import android.view.View;
import ca.e;
import com.google.firebase.components.ComponentRegistrar;
import e0.f;
import h5.a;
import io.flutter.util.ViewUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import n8.a;
import o4.p;
import r3.t;
import r5.m;
import t8.c;
import v3.g;
import v3.i0;
import v3.i1;
import v3.o0;
import v3.o1;
import v3.p0;
import v3.s1;
import v5.l;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements f.a, t.a, g.a, l.b, v5.e, h.b, p.f, e.a, d8.f, a.InterfaceC0173a, c.a.InterfaceC0231a, ViewUtils.ViewVisitor, l.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3784a;

    public /* synthetic */ e(int i10) {
        this.f3784a = i10;
    }

    @Override // d8.f
    public List a(ComponentRegistrar componentRegistrar) {
        return componentRegistrar.getComponents();
    }

    @Override // v5.e
    public void accept(Object obj) {
        ((g.a) obj).a();
    }

    @Override // r3.t.a
    public Object apply(Object obj) {
        h3.c cVar = r3.t.f;
        return (List) r3.t.k0(((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new d(3));
    }

    @Override // o4.p.f
    public int b(Object obj) {
        Pattern pattern = o4.p.f11853a;
        String str = ((o4.l) obj).f11804a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (v5.e0.f15881a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }

    @Override // n8.a.InterfaceC0173a
    public Object c(JsonReader jsonReader) {
        switch (this.f3784a) {
            case 21:
                a9.d dVar = n8.a.f11321a;
                jsonReader.beginObject();
                String str = null;
                byte[] bArr = null;
                while (jsonReader.hasNext()) {
                    String nextName = jsonReader.nextName();
                    nextName.getClass();
                    if (nextName.equals("filename")) {
                        str = jsonReader.nextString();
                        if (str == null) {
                            throw new NullPointerException("Null filename");
                        }
                    } else if (nextName.equals("contents")) {
                        bArr = Base64.decode(jsonReader.nextString(), 2);
                        if (bArr == null) {
                            throw new NullPointerException("Null contents");
                        }
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                if (str != null && bArr != null) {
                    return new m8.g(str, bArr);
                }
                StringBuilder sb2 = new StringBuilder();
                if (str == null) {
                    sb2.append(" filename");
                }
                if (bArr == null) {
                    sb2.append(" contents");
                }
                throw new IllegalStateException(a0.j.l("Missing required properties:", sb2));
            case 22:
                return n8.a.g(jsonReader);
            default:
                return n8.a.a(jsonReader);
        }
    }

    @Override // v5.l.b
    public void d(Object obj, v5.h hVar) {
    }

    @Override // ca.e.a
    public String e(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.type.television") ? "tv" : context.getPackageManager().hasSystemFeature("android.hardware.type.watch") ? "watch" : context.getPackageManager().hasSystemFeature("android.hardware.type.automotive") ? "auto" : (Build.VERSION.SDK_INT < 26 || !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) ? "" : "embedded";
    }

    @Override // v3.g.a
    public v3.g f(Bundle bundle) {
        Bundle bundle2;
        Bundle bundle3;
        int i10 = 0;
        switch (this.f3784a) {
            case 2:
                v3.i0 i0Var = v3.i0.Q;
                i0.a aVar = new i0.a();
                if (bundle != null) {
                    ClassLoader classLoader = v5.b.class.getClassLoader();
                    int i11 = v5.e0.f15881a;
                    bundle.setClassLoader(classLoader);
                }
                String string = bundle.getString(v3.i0.R);
                v3.i0 i0Var2 = v3.i0.Q;
                String str = i0Var2.f15447a;
                if (string == null) {
                    string = str;
                }
                aVar.f15463a = string;
                String string2 = bundle.getString(v3.i0.S);
                String str2 = i0Var2.f15448b;
                if (string2 == null) {
                    string2 = str2;
                }
                aVar.f15464b = string2;
                String string3 = bundle.getString(v3.i0.T);
                String str3 = i0Var2.f15449c;
                if (string3 == null) {
                    string3 = str3;
                }
                aVar.f15465c = string3;
                aVar.f15466d = bundle.getInt(v3.i0.U, i0Var2.f15450d);
                aVar.f15467e = bundle.getInt(v3.i0.V, i0Var2.f15451e);
                aVar.f = bundle.getInt(v3.i0.W, i0Var2.f);
                aVar.f15468g = bundle.getInt(v3.i0.X, i0Var2.f15452o);
                String string4 = bundle.getString(v3.i0.Y);
                String str4 = i0Var2.f15454q;
                if (string4 == null) {
                    string4 = str4;
                }
                aVar.f15469h = string4;
                p4.a aVar2 = (p4.a) bundle.getParcelable(v3.i0.Z);
                p4.a aVar3 = i0Var2.f15455r;
                if (aVar2 == null) {
                    aVar2 = aVar3;
                }
                aVar.f15470i = aVar2;
                String string5 = bundle.getString(v3.i0.f15424a0);
                String str5 = i0Var2.f15456s;
                if (string5 == null) {
                    string5 = str5;
                }
                aVar.f15471j = string5;
                String string6 = bundle.getString(v3.i0.f15425b0);
                String str6 = i0Var2.t;
                if (string6 == null) {
                    string6 = str6;
                }
                aVar.f15472k = string6;
                aVar.f15473l = bundle.getInt(v3.i0.f15426c0, i0Var2.f15457u);
                ArrayList arrayList = new ArrayList();
                while (true) {
                    byte[] byteArray = bundle.getByteArray(v3.i0.f15427d0 + "_" + Integer.toString(i10, 36));
                    if (byteArray == null) {
                        aVar.f15474m = arrayList;
                        aVar.f15475n = (a4.d) bundle.getParcelable(v3.i0.f15428e0);
                        String str7 = v3.i0.f15429f0;
                        v3.i0 i0Var3 = v3.i0.Q;
                        aVar.f15476o = bundle.getLong(str7, i0Var3.f15460x);
                        aVar.f15477p = bundle.getInt(v3.i0.f15430g0, i0Var3.f15461y);
                        aVar.f15478q = bundle.getInt(v3.i0.f15431h0, i0Var3.f15462z);
                        aVar.f15479r = bundle.getFloat(v3.i0.f15432i0, i0Var3.A);
                        aVar.f15480s = bundle.getInt(v3.i0.f15433j0, i0Var3.B);
                        aVar.t = bundle.getFloat(v3.i0.f15434k0, i0Var3.C);
                        aVar.f15481u = bundle.getByteArray(v3.i0.f15435l0);
                        aVar.f15482v = bundle.getInt(v3.i0.f15436m0, i0Var3.E);
                        Bundle bundle4 = bundle.getBundle(v3.i0.f15437n0);
                        if (bundle4 != null) {
                            aVar.f15483w = (w5.b) w5.b.f16326r.f(bundle4);
                        }
                        aVar.f15484x = bundle.getInt(v3.i0.f15438o0, i0Var3.G);
                        aVar.f15485y = bundle.getInt(v3.i0.f15439p0, i0Var3.H);
                        aVar.f15486z = bundle.getInt(v3.i0.f15440q0, i0Var3.I);
                        aVar.A = bundle.getInt(v3.i0.f15441r0, i0Var3.J);
                        aVar.B = bundle.getInt(v3.i0.f15442s0, i0Var3.K);
                        aVar.C = bundle.getInt(v3.i0.f15443t0, i0Var3.L);
                        aVar.D = bundle.getInt(v3.i0.f15445v0, i0Var3.M);
                        aVar.E = bundle.getInt(v3.i0.w0, i0Var3.N);
                        aVar.F = bundle.getInt(v3.i0.f15444u0, i0Var3.O);
                        return new v3.i0(aVar);
                    }
                    arrayList.add(byteArray);
                    i10++;
                }
            case 3:
                String string7 = bundle.getString(v3.o0.f15529p, "");
                string7.getClass();
                Bundle bundle5 = bundle.getBundle(v3.o0.f15530q);
                o0.e eVar = bundle5 == null ? o0.e.f : (o0.e) o0.e.t.f(bundle5);
                Bundle bundle6 = bundle.getBundle(v3.o0.f15531r);
                v3.p0 p0Var = bundle6 == null ? v3.p0.Q : (v3.p0) v3.p0.f15649y0.f(bundle6);
                Bundle bundle7 = bundle.getBundle(v3.o0.f15532s);
                o0.c cVar = bundle7 == null ? o0.c.f15565u : (o0.c) o0.b.t.f(bundle7);
                Bundle bundle8 = bundle.getBundle(v3.o0.t);
                return new v3.o0(string7, cVar, null, eVar, p0Var, bundle8 == null ? o0.h.f15601c : (o0.h) o0.h.f15604o.f(bundle8));
            case 4:
                p0.a aVar4 = new p0.a();
                aVar4.f15666a = bundle.getCharSequence(v3.p0.R);
                aVar4.f15667b = bundle.getCharSequence(v3.p0.S);
                aVar4.f15668c = bundle.getCharSequence(v3.p0.T);
                aVar4.f15669d = bundle.getCharSequence(v3.p0.U);
                aVar4.f15670e = bundle.getCharSequence(v3.p0.V);
                aVar4.f = bundle.getCharSequence(v3.p0.W);
                aVar4.f15671g = bundle.getCharSequence(v3.p0.X);
                byte[] byteArray2 = bundle.getByteArray(v3.p0.f15626a0);
                String str8 = v3.p0.f15645t0;
                Integer valueOf = bundle.containsKey(str8) ? Integer.valueOf(bundle.getInt(str8)) : null;
                aVar4.f15674j = byteArray2 != null ? (byte[]) byteArray2.clone() : null;
                aVar4.f15675k = valueOf;
                aVar4.f15676l = (Uri) bundle.getParcelable(v3.p0.f15627b0);
                aVar4.f15687x = bundle.getCharSequence(v3.p0.f15638m0);
                aVar4.f15688y = bundle.getCharSequence(v3.p0.f15639n0);
                aVar4.f15689z = bundle.getCharSequence(v3.p0.f15640o0);
                aVar4.C = bundle.getCharSequence(v3.p0.f15643r0);
                aVar4.D = bundle.getCharSequence(v3.p0.f15644s0);
                aVar4.E = bundle.getCharSequence(v3.p0.f15646u0);
                aVar4.G = bundle.getBundle(v3.p0.f15648x0);
                String str9 = v3.p0.Y;
                if (bundle.containsKey(str9) && (bundle3 = bundle.getBundle(str9)) != null) {
                    aVar4.f15672h = (i1) i1.f15488b.f(bundle3);
                }
                String str10 = v3.p0.Z;
                if (bundle.containsKey(str10) && (bundle2 = bundle.getBundle(str10)) != null) {
                    aVar4.f15673i = (i1) i1.f15488b.f(bundle2);
                }
                String str11 = v3.p0.f15628c0;
                if (bundle.containsKey(str11)) {
                    aVar4.f15677m = Integer.valueOf(bundle.getInt(str11));
                }
                String str12 = v3.p0.f15629d0;
                if (bundle.containsKey(str12)) {
                    aVar4.f15678n = Integer.valueOf(bundle.getInt(str12));
                }
                String str13 = v3.p0.f15630e0;
                if (bundle.containsKey(str13)) {
                    aVar4.f15679o = Integer.valueOf(bundle.getInt(str13));
                }
                String str14 = v3.p0.w0;
                if (bundle.containsKey(str14)) {
                    aVar4.f15680p = Boolean.valueOf(bundle.getBoolean(str14));
                }
                String str15 = v3.p0.f15631f0;
                if (bundle.containsKey(str15)) {
                    aVar4.f15681q = Boolean.valueOf(bundle.getBoolean(str15));
                }
                String str16 = v3.p0.f15632g0;
                if (bundle.containsKey(str16)) {
                    aVar4.f15682r = Integer.valueOf(bundle.getInt(str16));
                }
                String str17 = v3.p0.f15633h0;
                if (bundle.containsKey(str17)) {
                    aVar4.f15683s = Integer.valueOf(bundle.getInt(str17));
                }
                String str18 = v3.p0.f15634i0;
                if (bundle.containsKey(str18)) {
                    aVar4.t = Integer.valueOf(bundle.getInt(str18));
                }
                String str19 = v3.p0.f15635j0;
                if (bundle.containsKey(str19)) {
                    aVar4.f15684u = Integer.valueOf(bundle.getInt(str19));
                }
                String str20 = v3.p0.f15636k0;
                if (bundle.containsKey(str20)) {
                    aVar4.f15685v = Integer.valueOf(bundle.getInt(str20));
                }
                String str21 = v3.p0.f15637l0;
                if (bundle.containsKey(str21)) {
                    aVar4.f15686w = Integer.valueOf(bundle.getInt(str21));
                }
                String str22 = v3.p0.f15641p0;
                if (bundle.containsKey(str22)) {
                    aVar4.A = Integer.valueOf(bundle.getInt(str22));
                }
                String str23 = v3.p0.f15642q0;
                if (bundle.containsKey(str23)) {
                    aVar4.B = Integer.valueOf(bundle.getInt(str23));
                }
                String str24 = v3.p0.f15647v0;
                if (bundle.containsKey(str24)) {
                    aVar4.F = Integer.valueOf(bundle.getInt(str24));
                }
                return new v3.p0(aVar4);
            case 7:
                String str25 = o1.f15621e;
                x6.b.q(bundle.getInt(i1.f15487a, -1) == 2);
                int i12 = bundle.getInt(o1.f15621e, 5);
                float f = bundle.getFloat(o1.f, -1.0f);
                return f == -1.0f ? new o1(i12) : new o1(f, i12);
            case 9:
                String str26 = s1.a.f;
                d dVar = z4.i0.f17683p;
                Bundle bundle9 = bundle.getBundle(s1.a.f);
                bundle9.getClass();
                z4.i0 i0Var4 = (z4.i0) dVar.f(bundle9);
                int[] intArray = bundle.getIntArray(s1.a.f15786o);
                int[] iArr = new int[i0Var4.f17684a];
                if (intArray == null) {
                    intArray = iArr;
                }
                boolean[] booleanArray = bundle.getBooleanArray(s1.a.f15787p);
                boolean[] zArr = new boolean[i0Var4.f17684a];
                if (booleanArray == null) {
                    booleanArray = zArr;
                }
                return new s1.a(i0Var4, bundle.getBoolean(s1.a.f15788q, false), intArray, booleanArray);
            case 14:
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(z4.j0.f17690e);
                return parcelableArrayList == null ? new z4.j0(new z4.i0[0]) : new z4.j0((z4.i0[]) v5.b.a(z4.i0.f17683p, parcelableArrayList).toArray(new z4.i0[0]));
            case 16:
                h5.a aVar5 = h5.a.f7094z;
                a.C0105a c0105a = new a.C0105a();
                CharSequence charSequence = bundle.getCharSequence(h5.a.A);
                if (charSequence != null) {
                    c0105a.f7110a = charSequence;
                }
                Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(h5.a.B);
                if (alignment != null) {
                    c0105a.f7112c = alignment;
                }
                Layout.Alignment alignment2 = (Layout.Alignment) bundle.getSerializable(h5.a.C);
                if (alignment2 != null) {
                    c0105a.f7113d = alignment2;
                }
                Bitmap bitmap = (Bitmap) bundle.getParcelable(h5.a.D);
                if (bitmap != null) {
                    c0105a.f7111b = bitmap;
                }
                String str27 = h5.a.E;
                if (bundle.containsKey(str27)) {
                    String str28 = h5.a.F;
                    if (bundle.containsKey(str28)) {
                        float f10 = bundle.getFloat(str27);
                        int i13 = bundle.getInt(str28);
                        c0105a.f7114e = f10;
                        c0105a.f = i13;
                    }
                }
                String str29 = h5.a.G;
                if (bundle.containsKey(str29)) {
                    c0105a.f7115g = bundle.getInt(str29);
                }
                String str30 = h5.a.H;
                if (bundle.containsKey(str30)) {
                    c0105a.f7116h = bundle.getFloat(str30);
                }
                String str31 = h5.a.I;
                if (bundle.containsKey(str31)) {
                    c0105a.f7117i = bundle.getInt(str31);
                }
                String str32 = h5.a.K;
                if (bundle.containsKey(str32)) {
                    String str33 = h5.a.J;
                    if (bundle.containsKey(str33)) {
                        float f11 = bundle.getFloat(str32);
                        int i14 = bundle.getInt(str33);
                        c0105a.f7119k = f11;
                        c0105a.f7118j = i14;
                    }
                }
                String str34 = h5.a.L;
                if (bundle.containsKey(str34)) {
                    c0105a.f7120l = bundle.getFloat(str34);
                }
                String str35 = h5.a.M;
                if (bundle.containsKey(str35)) {
                    c0105a.f7121m = bundle.getFloat(str35);
                }
                String str36 = h5.a.N;
                if (bundle.containsKey(str36)) {
                    c0105a.f7123o = bundle.getInt(str36);
                    c0105a.f7122n = true;
                }
                if (!bundle.getBoolean(h5.a.O, false)) {
                    c0105a.f7122n = false;
                }
                String str37 = h5.a.P;
                if (bundle.containsKey(str37)) {
                    c0105a.f7124p = bundle.getInt(str37);
                }
                String str38 = h5.a.Q;
                if (bundle.containsKey(str38)) {
                    c0105a.f7125q = bundle.getFloat(str38);
                }
                return c0105a.a();
            default:
                r5.m mVar = r5.m.I;
                return new r5.m(new m.a(bundle));
        }
    }

    @Override // v5.l.a
    public void invoke(Object obj) {
        switch (this.f3784a) {
            case 0:
                ((w3.b) obj).i0();
                break;
            default:
                ((w3.b) obj).I();
                break;
        }
    }

    @Override // a4.h.b
    public void release() {
    }

    @Override // io.flutter.util.ViewUtils.ViewVisitor
    public boolean run(View view) {
        boolean hasFocus;
        hasFocus = view.hasFocus();
        return hasFocus;
    }
}
