package t6;

import android.os.Parcel;
import android.util.Base64;
import android.util.Log;
import b.z;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import m6.h;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: t6.a$a, reason: collision with other inner class name */
    public static class C0230a<I, O> extends n6.a {
        public static final d CREATOR = new d();

        /* renamed from: a, reason: collision with root package name */
        public final int f14618a;

        /* renamed from: b, reason: collision with root package name */
        public final int f14619b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f14620c;

        /* renamed from: d, reason: collision with root package name */
        public final int f14621d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f14622e;
        public final String f;

        /* renamed from: o, reason: collision with root package name */
        public final int f14623o;

        /* renamed from: p, reason: collision with root package name */
        public final Class f14624p;

        /* renamed from: q, reason: collision with root package name */
        public final String f14625q;

        /* renamed from: r, reason: collision with root package name */
        public h f14626r;

        /* renamed from: s, reason: collision with root package name */
        public final b f14627s;

        public C0230a(int i10, int i11, boolean z10, int i12, boolean z11, String str, int i13, String str2, s6.b bVar) {
            this.f14618a = i10;
            this.f14619b = i11;
            this.f14620c = z10;
            this.f14621d = i12;
            this.f14622e = z11;
            this.f = str;
            this.f14623o = i13;
            if (str2 == null) {
                this.f14624p = null;
                this.f14625q = null;
            } else {
                this.f14624p = c.class;
                this.f14625q = str2;
            }
            if (bVar == null) {
                this.f14627s = null;
                return;
            }
            s6.a aVar = bVar.f14230b;
            if (aVar == null) {
                throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
            }
            this.f14627s = aVar;
        }

        public C0230a(int i10, boolean z10, int i11, boolean z11, String str, int i12, Class cls) {
            this.f14618a = 1;
            this.f14619b = i10;
            this.f14620c = z10;
            this.f14621d = i11;
            this.f14622e = z11;
            this.f = str;
            this.f14623o = i12;
            this.f14624p = cls;
            this.f14625q = cls == null ? null : cls.getCanonicalName();
            this.f14627s = null;
        }

        public static C0230a D(int i10, String str) {
            return new C0230a(7, true, 7, true, str, i10, null);
        }

        public final String toString() {
            h.a aVar = new h.a(this);
            aVar.a(Integer.valueOf(this.f14618a), "versionCode");
            aVar.a(Integer.valueOf(this.f14619b), "typeIn");
            aVar.a(Boolean.valueOf(this.f14620c), "typeInArray");
            aVar.a(Integer.valueOf(this.f14621d), "typeOut");
            aVar.a(Boolean.valueOf(this.f14622e), "typeOutArray");
            aVar.a(this.f, "outputFieldName");
            aVar.a(Integer.valueOf(this.f14623o), "safeParcelFieldId");
            String str = this.f14625q;
            if (str == null) {
                str = null;
            }
            aVar.a(str, "concreteTypeName");
            Class cls = this.f14624p;
            if (cls != null) {
                aVar.a(cls.getCanonicalName(), "concreteType.class");
            }
            b bVar = this.f14627s;
            if (bVar != null) {
                aVar.a(bVar.getClass().getCanonicalName(), "converterName");
            }
            return aVar.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            int i11 = this.f14618a;
            int J = z.J(20293, parcel);
            z.z(parcel, 1, i11);
            z.z(parcel, 2, this.f14619b);
            z.t(parcel, 3, this.f14620c);
            z.z(parcel, 4, this.f14621d);
            z.t(parcel, 5, this.f14622e);
            z.F(parcel, 6, this.f, false);
            z.z(parcel, 7, this.f14623o);
            String str = this.f14625q;
            s6.b bVar = null;
            if (str == null) {
                str = null;
            }
            z.F(parcel, 8, str, false);
            b bVar2 = this.f14627s;
            if (bVar2 != null) {
                if (!(bVar2 instanceof s6.a)) {
                    throw new IllegalArgumentException("Unsupported safe parcelable field converter class.");
                }
                bVar = new s6.b((s6.a) bVar2);
            }
            z.E(parcel, 9, bVar, i10, false);
            z.L(J, parcel);
        }
    }

    public interface b<I, O> {
    }

    public static final Object zaD(C0230a c0230a, Object obj) {
        b bVar = c0230a.f14627s;
        if (bVar == null) {
            return obj;
        }
        s6.a aVar = (s6.a) bVar;
        aVar.getClass();
        String str = (String) aVar.f14228c.get(((Integer) obj).intValue());
        return (str == null && aVar.f14227b.containsKey("gms_unknown")) ? "gms_unknown" : str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void zaE(C0230a c0230a, Object obj) {
        int i10 = c0230a.f14621d;
        m6.j.i(c0230a.f14627s);
        s6.a aVar = (s6.a) c0230a.f14627s;
        Integer num = (Integer) aVar.f14227b.get((String) obj);
        Integer num2 = num;
        if (num == null) {
            num2 = (Integer) aVar.f14227b.get("gms_unknown");
        }
        m6.j.i(num2);
        String str = c0230a.f;
        switch (i10) {
            case 0:
                setIntegerInternal(c0230a, str, num2.intValue());
                return;
            case 1:
                zaf(c0230a, str, (BigInteger) num2);
                return;
            case 2:
                setLongInternal(c0230a, str, ((Long) num2).longValue());
                return;
            case 3:
            default:
                throw new IllegalStateException(defpackage.f.h("Unsupported type for conversion: ", i10));
            case 4:
                zan(c0230a, str, ((Double) num2).doubleValue());
                return;
            case 5:
                zab(c0230a, str, (BigDecimal) num2);
                return;
            case 6:
                setBooleanInternal(c0230a, str, ((Boolean) num2).booleanValue());
                return;
            case 7:
                setStringInternal(c0230a, str, (String) num2);
                return;
            case 8:
            case 9:
                setDecodedBytesInternal(c0230a, str, (byte[]) num2);
                return;
        }
    }

    private static final void zaF(StringBuilder sb2, C0230a c0230a, Object obj) {
        String aVar;
        int i10 = c0230a.f14619b;
        if (i10 == 11) {
            Class cls = c0230a.f14624p;
            m6.j.i(cls);
            aVar = ((a) cls.cast(obj)).toString();
        } else if (i10 != 7) {
            sb2.append(obj);
            return;
        } else {
            aVar = "\"";
            sb2.append("\"");
            sb2.append(v6.d.a((String) obj));
        }
        sb2.append(aVar);
    }

    private static final void zaG(String str) {
        if (Log.isLoggable("FastJsonResponse", 6)) {
            Log.e("FastJsonResponse", "Output field (" + str + ") has a null value, but expected a primitive");
        }
    }

    public <T extends a> void addConcreteTypeArrayInternal(C0230a c0230a, String str, ArrayList<T> arrayList) {
        throw new UnsupportedOperationException("Concrete type array not supported");
    }

    public <T extends a> void addConcreteTypeInternal(C0230a c0230a, String str, T t) {
        throw new UnsupportedOperationException("Concrete type not supported");
    }

    public abstract Map<String, C0230a<?, ?>> getFieldMappings();

    public Object getFieldValue(C0230a c0230a) {
        String str = c0230a.f;
        if (c0230a.f14624p == null) {
            return getValueObject(str);
        }
        boolean z10 = getValueObject(str) == null;
        Object[] objArr = {c0230a.f};
        if (!z10) {
            throw new IllegalStateException(String.format("Concrete field shouldn't be value object: %s", objArr));
        }
        try {
            return getClass().getMethod("get" + Character.toUpperCase(str.charAt(0)) + str.substring(1), new Class[0]).invoke(this, new Object[0]);
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }

    public abstract Object getValueObject(String str);

    public boolean isFieldSet(C0230a c0230a) {
        if (c0230a.f14621d != 11) {
            return isPrimitiveFieldSet(c0230a.f);
        }
        if (c0230a.f14622e) {
            throw new UnsupportedOperationException("Concrete type arrays not supported");
        }
        throw new UnsupportedOperationException("Concrete types not supported");
    }

    public abstract boolean isPrimitiveFieldSet(String str);

    public void setBooleanInternal(C0230a<?, ?> c0230a, String str, boolean z10) {
        throw new UnsupportedOperationException("Boolean not supported");
    }

    public void setDecodedBytesInternal(C0230a<?, ?> c0230a, String str, byte[] bArr) {
        throw new UnsupportedOperationException("byte[] not supported");
    }

    public void setIntegerInternal(C0230a<?, ?> c0230a, String str, int i10) {
        throw new UnsupportedOperationException("Integer not supported");
    }

    public void setLongInternal(C0230a<?, ?> c0230a, String str, long j10) {
        throw new UnsupportedOperationException("Long not supported");
    }

    public void setStringInternal(C0230a<?, ?> c0230a, String str, String str2) {
        throw new UnsupportedOperationException("String not supported");
    }

    public void setStringMapInternal(C0230a<?, ?> c0230a, String str, Map<String, String> map) {
        throw new UnsupportedOperationException("String map not supported");
    }

    public void setStringsInternal(C0230a<?, ?> c0230a, String str, ArrayList<String> arrayList) {
        throw new UnsupportedOperationException("String list not supported");
    }

    public String toString() {
        String str;
        String encodeToString;
        Map<String, C0230a<?, ?>> fieldMappings = getFieldMappings();
        StringBuilder sb2 = new StringBuilder(100);
        for (String str2 : fieldMappings.keySet()) {
            C0230a<?, ?> c0230a = fieldMappings.get(str2);
            if (isFieldSet(c0230a)) {
                Object zaD = zaD(c0230a, getFieldValue(c0230a));
                if (sb2.length() == 0) {
                    sb2.append("{");
                } else {
                    sb2.append(",");
                }
                sb2.append("\"");
                sb2.append(str2);
                sb2.append("\":");
                if (zaD != null) {
                    switch (c0230a.f14621d) {
                        case 8:
                            sb2.append("\"");
                            encodeToString = Base64.encodeToString((byte[]) zaD, 0);
                            sb2.append(encodeToString);
                            sb2.append("\"");
                            break;
                        case 9:
                            sb2.append("\"");
                            encodeToString = Base64.encodeToString((byte[]) zaD, 10);
                            sb2.append(encodeToString);
                            sb2.append("\"");
                            break;
                        case 10:
                            x6.b.B0(sb2, (HashMap) zaD);
                            break;
                        default:
                            if (c0230a.f14620c) {
                                ArrayList arrayList = (ArrayList) zaD;
                                sb2.append("[");
                                int size = arrayList.size();
                                for (int i10 = 0; i10 < size; i10++) {
                                    if (i10 > 0) {
                                        sb2.append(",");
                                    }
                                    Object obj = arrayList.get(i10);
                                    if (obj != null) {
                                        zaF(sb2, c0230a, obj);
                                    }
                                }
                                str = "]";
                                break;
                            } else {
                                zaF(sb2, c0230a, zaD);
                                break;
                            }
                    }
                } else {
                    str = "null";
                }
                sb2.append(str);
            }
        }
        sb2.append(sb2.length() > 0 ? "}" : "{}");
        return sb2.toString();
    }

    public final void zaA(C0230a c0230a, String str) {
        if (c0230a.f14627s != null) {
            zaE(c0230a, str);
        } else {
            setStringInternal(c0230a, c0230a.f, str);
        }
    }

    public final void zaB(C0230a c0230a, Map map) {
        if (c0230a.f14627s != null) {
            zaE(c0230a, map);
        } else {
            setStringMapInternal(c0230a, c0230a.f, map);
        }
    }

    public final void zaC(C0230a c0230a, ArrayList arrayList) {
        if (c0230a.f14627s != null) {
            zaE(c0230a, arrayList);
        } else {
            setStringsInternal(c0230a, c0230a.f, arrayList);
        }
    }

    public final void zaa(C0230a c0230a, BigDecimal bigDecimal) {
        if (c0230a.f14627s != null) {
            zaE(c0230a, bigDecimal);
        } else {
            zab(c0230a, c0230a.f, bigDecimal);
        }
    }

    public void zab(C0230a c0230a, String str, BigDecimal bigDecimal) {
        throw new UnsupportedOperationException("BigDecimal not supported");
    }

    public final void zac(C0230a c0230a, ArrayList arrayList) {
        if (c0230a.f14627s != null) {
            zaE(c0230a, arrayList);
        } else {
            zad(c0230a, c0230a.f, arrayList);
        }
    }

    public void zad(C0230a c0230a, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("BigDecimal list not supported");
    }

    public final void zae(C0230a c0230a, BigInteger bigInteger) {
        if (c0230a.f14627s != null) {
            zaE(c0230a, bigInteger);
        } else {
            zaf(c0230a, c0230a.f, bigInteger);
        }
    }

    public void zaf(C0230a c0230a, String str, BigInteger bigInteger) {
        throw new UnsupportedOperationException("BigInteger not supported");
    }

    public final void zag(C0230a c0230a, ArrayList arrayList) {
        if (c0230a.f14627s != null) {
            zaE(c0230a, arrayList);
        } else {
            zah(c0230a, c0230a.f, arrayList);
        }
    }

    public void zah(C0230a c0230a, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("BigInteger list not supported");
    }

    public final void zai(C0230a c0230a, boolean z10) {
        if (c0230a.f14627s != null) {
            zaE(c0230a, Boolean.valueOf(z10));
        } else {
            setBooleanInternal(c0230a, c0230a.f, z10);
        }
    }

    public final void zaj(C0230a c0230a, ArrayList arrayList) {
        if (c0230a.f14627s != null) {
            zaE(c0230a, arrayList);
        } else {
            zak(c0230a, c0230a.f, arrayList);
        }
    }

    public void zak(C0230a c0230a, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Boolean list not supported");
    }

    public final void zal(C0230a c0230a, byte[] bArr) {
        if (c0230a.f14627s != null) {
            zaE(c0230a, bArr);
        } else {
            setDecodedBytesInternal(c0230a, c0230a.f, bArr);
        }
    }

    public final void zam(C0230a c0230a, double d10) {
        if (c0230a.f14627s != null) {
            zaE(c0230a, Double.valueOf(d10));
        } else {
            zan(c0230a, c0230a.f, d10);
        }
    }

    public void zan(C0230a c0230a, String str, double d10) {
        throw new UnsupportedOperationException("Double not supported");
    }

    public final void zao(C0230a c0230a, ArrayList arrayList) {
        if (c0230a.f14627s != null) {
            zaE(c0230a, arrayList);
        } else {
            zap(c0230a, c0230a.f, arrayList);
        }
    }

    public void zap(C0230a c0230a, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Double list not supported");
    }

    public final void zaq(C0230a c0230a, float f) {
        if (c0230a.f14627s != null) {
            zaE(c0230a, Float.valueOf(f));
        } else {
            zar(c0230a, c0230a.f, f);
        }
    }

    public void zar(C0230a c0230a, String str, float f) {
        throw new UnsupportedOperationException("Float not supported");
    }

    public final void zas(C0230a c0230a, ArrayList arrayList) {
        if (c0230a.f14627s != null) {
            zaE(c0230a, arrayList);
        } else {
            zat(c0230a, c0230a.f, arrayList);
        }
    }

    public void zat(C0230a c0230a, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Float list not supported");
    }

    public final void zau(C0230a c0230a, int i10) {
        if (c0230a.f14627s != null) {
            zaE(c0230a, Integer.valueOf(i10));
        } else {
            setIntegerInternal(c0230a, c0230a.f, i10);
        }
    }

    public final void zav(C0230a c0230a, ArrayList arrayList) {
        if (c0230a.f14627s != null) {
            zaE(c0230a, arrayList);
        } else {
            zaw(c0230a, c0230a.f, arrayList);
        }
    }

    public void zaw(C0230a c0230a, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Integer list not supported");
    }

    public final void zax(C0230a c0230a, long j10) {
        if (c0230a.f14627s != null) {
            zaE(c0230a, Long.valueOf(j10));
        } else {
            setLongInternal(c0230a, c0230a.f, j10);
        }
    }

    public final void zay(C0230a c0230a, ArrayList arrayList) {
        if (c0230a.f14627s != null) {
            zaE(c0230a, arrayList);
        } else {
            zaz(c0230a, c0230a.f, arrayList);
        }
    }

    public void zaz(C0230a c0230a, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Long list not supported");
    }
}
