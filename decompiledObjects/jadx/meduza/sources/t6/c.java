package t6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.SparseArray;
import b.z;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import n6.b;
import t6.a;

/* loaded from: classes.dex */
public final class c extends b {
    public static final Parcelable.Creator<c> CREATOR = new k();

    /* renamed from: a, reason: collision with root package name */
    public final int f14628a;

    /* renamed from: b, reason: collision with root package name */
    public final Parcel f14629b;

    /* renamed from: c, reason: collision with root package name */
    public final int f14630c;

    /* renamed from: d, reason: collision with root package name */
    public final h f14631d;

    /* renamed from: e, reason: collision with root package name */
    public final String f14632e;
    public int f;

    /* renamed from: o, reason: collision with root package name */
    public int f14633o;

    public c(int i10, Parcel parcel, h hVar) {
        this.f14628a = i10;
        m6.j.i(parcel);
        this.f14629b = parcel;
        this.f14630c = 2;
        this.f14631d = hVar;
        this.f14632e = hVar == null ? null : hVar.f14642c;
        this.f = 2;
    }

    public static void c(StringBuilder sb2, Map map, Parcel parcel) {
        Object obj;
        String str;
        Object valueOf;
        Object zaD;
        SparseArray sparseArray = new SparseArray();
        for (Map.Entry entry : map.entrySet()) {
            sparseArray.put(((a.C0230a) entry.getValue()).f14623o, entry);
        }
        sb2.append('{');
        int u10 = n6.b.u(parcel);
        boolean z10 = false;
        while (parcel.dataPosition() < u10) {
            int readInt = parcel.readInt();
            Map.Entry entry2 = (Map.Entry) sparseArray.get((char) readInt);
            if (entry2 != null) {
                if (z10) {
                    sb2.append(",");
                }
                String str2 = (String) entry2.getKey();
                a.C0230a c0230a = (a.C0230a) entry2.getValue();
                sb2.append("\"");
                sb2.append(str2);
                sb2.append("\":");
                BigInteger bigInteger = null;
                BigInteger bigInteger2 = null;
                Parcel[] parcelArr = null;
                String[] strArr = null;
                boolean[] zArr = null;
                BigDecimal[] bigDecimalArr = null;
                double[] dArr = null;
                float[] fArr = null;
                long[] jArr = null;
                BigInteger[] bigIntegerArr = null;
                Parcel parcel2 = null;
                r9 = null;
                String a10 = null;
                if (c0230a.f14627s != null) {
                    int i10 = c0230a.f14621d;
                    switch (i10) {
                        case 0:
                            valueOf = Integer.valueOf(n6.b.o(readInt, parcel));
                            zaD = a.zaD(c0230a, valueOf);
                            e(sb2, c0230a, zaD);
                            break;
                        case 1:
                            int s10 = n6.b.s(readInt, parcel);
                            int dataPosition = parcel.dataPosition();
                            if (s10 != 0) {
                                byte[] createByteArray = parcel.createByteArray();
                                parcel.setDataPosition(dataPosition + s10);
                                bigInteger2 = new BigInteger(createByteArray);
                            }
                            valueOf = bigInteger2;
                            zaD = a.zaD(c0230a, valueOf);
                            e(sb2, c0230a, zaD);
                            break;
                        case 2:
                            valueOf = Long.valueOf(n6.b.q(readInt, parcel));
                            zaD = a.zaD(c0230a, valueOf);
                            e(sb2, c0230a, zaD);
                            break;
                        case 3:
                            n6.b.w(parcel, readInt, 4);
                            valueOf = Float.valueOf(parcel.readFloat());
                            zaD = a.zaD(c0230a, valueOf);
                            e(sb2, c0230a, zaD);
                            break;
                        case 4:
                            n6.b.w(parcel, readInt, 8);
                            valueOf = Double.valueOf(parcel.readDouble());
                            zaD = a.zaD(c0230a, valueOf);
                            e(sb2, c0230a, zaD);
                            break;
                        case 5:
                            valueOf = n6.b.a(readInt, parcel);
                            zaD = a.zaD(c0230a, valueOf);
                            e(sb2, c0230a, zaD);
                            break;
                        case 6:
                            valueOf = Boolean.valueOf(n6.b.k(readInt, parcel));
                            zaD = a.zaD(c0230a, valueOf);
                            e(sb2, c0230a, zaD);
                            break;
                        case 7:
                            valueOf = n6.b.f(readInt, parcel);
                            zaD = a.zaD(c0230a, valueOf);
                            e(sb2, c0230a, zaD);
                            break;
                        case 8:
                        case 9:
                            zaD = a.zaD(c0230a, n6.b.c(readInt, parcel));
                            e(sb2, c0230a, zaD);
                            break;
                        case 10:
                            Bundle b10 = n6.b.b(readInt, parcel);
                            HashMap hashMap = new HashMap();
                            for (String str3 : b10.keySet()) {
                                String string = b10.getString(str3);
                                m6.j.i(string);
                                hashMap.put(str3, string);
                            }
                            zaD = a.zaD(c0230a, hashMap);
                            e(sb2, c0230a, zaD);
                            break;
                        case 11:
                            throw new IllegalArgumentException("Method does not accept concrete type.");
                        default:
                            throw new IllegalArgumentException(defpackage.f.h("Unknown field out type = ", i10));
                    }
                } else {
                    if (c0230a.f14622e) {
                        sb2.append("[");
                        switch (c0230a.f14621d) {
                            case 0:
                                int[] d10 = n6.b.d(readInt, parcel);
                                int length = d10.length;
                                for (int i11 = 0; i11 < length; i11++) {
                                    if (i11 != 0) {
                                        sb2.append(",");
                                    }
                                    sb2.append(d10[i11]);
                                }
                                break;
                            case 1:
                                int s11 = n6.b.s(readInt, parcel);
                                int dataPosition2 = parcel.dataPosition();
                                if (s11 != 0) {
                                    int readInt2 = parcel.readInt();
                                    bigIntegerArr = new BigInteger[readInt2];
                                    for (int i12 = 0; i12 < readInt2; i12++) {
                                        bigIntegerArr[i12] = new BigInteger(parcel.createByteArray());
                                    }
                                    parcel.setDataPosition(dataPosition2 + s11);
                                }
                                int length2 = bigIntegerArr.length;
                                for (int i13 = 0; i13 < length2; i13++) {
                                    if (i13 != 0) {
                                        sb2.append(",");
                                    }
                                    sb2.append(bigIntegerArr[i13]);
                                }
                                break;
                            case 2:
                                int s12 = n6.b.s(readInt, parcel);
                                int dataPosition3 = parcel.dataPosition();
                                if (s12 != 0) {
                                    jArr = parcel.createLongArray();
                                    parcel.setDataPosition(dataPosition3 + s12);
                                }
                                int length3 = jArr.length;
                                for (int i14 = 0; i14 < length3; i14++) {
                                    if (i14 != 0) {
                                        sb2.append(",");
                                    }
                                    sb2.append(jArr[i14]);
                                }
                                break;
                            case 3:
                                int s13 = n6.b.s(readInt, parcel);
                                int dataPosition4 = parcel.dataPosition();
                                if (s13 != 0) {
                                    fArr = parcel.createFloatArray();
                                    parcel.setDataPosition(dataPosition4 + s13);
                                }
                                int length4 = fArr.length;
                                for (int i15 = 0; i15 < length4; i15++) {
                                    if (i15 != 0) {
                                        sb2.append(",");
                                    }
                                    sb2.append(fArr[i15]);
                                }
                                break;
                            case 4:
                                int s14 = n6.b.s(readInt, parcel);
                                int dataPosition5 = parcel.dataPosition();
                                if (s14 != 0) {
                                    dArr = parcel.createDoubleArray();
                                    parcel.setDataPosition(dataPosition5 + s14);
                                }
                                int length5 = dArr.length;
                                for (int i16 = 0; i16 < length5; i16++) {
                                    if (i16 != 0) {
                                        sb2.append(",");
                                    }
                                    sb2.append(dArr[i16]);
                                }
                                break;
                            case 5:
                                int s15 = n6.b.s(readInt, parcel);
                                int dataPosition6 = parcel.dataPosition();
                                if (s15 != 0) {
                                    int readInt3 = parcel.readInt();
                                    bigDecimalArr = new BigDecimal[readInt3];
                                    for (int i17 = 0; i17 < readInt3; i17++) {
                                        bigDecimalArr[i17] = new BigDecimal(new BigInteger(parcel.createByteArray()), parcel.readInt());
                                    }
                                    parcel.setDataPosition(dataPosition6 + s15);
                                }
                                int length6 = bigDecimalArr.length;
                                for (int i18 = 0; i18 < length6; i18++) {
                                    if (i18 != 0) {
                                        sb2.append(",");
                                    }
                                    sb2.append(bigDecimalArr[i18]);
                                }
                                break;
                            case 6:
                                int s16 = n6.b.s(readInt, parcel);
                                int dataPosition7 = parcel.dataPosition();
                                if (s16 != 0) {
                                    zArr = parcel.createBooleanArray();
                                    parcel.setDataPosition(dataPosition7 + s16);
                                }
                                int length7 = zArr.length;
                                for (int i19 = 0; i19 < length7; i19++) {
                                    if (i19 != 0) {
                                        sb2.append(",");
                                    }
                                    sb2.append(zArr[i19]);
                                }
                                break;
                            case 7:
                                int s17 = n6.b.s(readInt, parcel);
                                int dataPosition8 = parcel.dataPosition();
                                if (s17 != 0) {
                                    strArr = parcel.createStringArray();
                                    parcel.setDataPosition(dataPosition8 + s17);
                                }
                                int length8 = strArr.length;
                                for (int i20 = 0; i20 < length8; i20++) {
                                    if (i20 != 0) {
                                        sb2.append(",");
                                    }
                                    sb2.append("\"");
                                    sb2.append(strArr[i20]);
                                    sb2.append("\"");
                                }
                                break;
                            case 8:
                            case 9:
                            case 10:
                                throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
                            case 11:
                                int s18 = n6.b.s(readInt, parcel);
                                int dataPosition9 = parcel.dataPosition();
                                if (s18 != 0) {
                                    int readInt4 = parcel.readInt();
                                    Parcel[] parcelArr2 = new Parcel[readInt4];
                                    for (int i21 = 0; i21 < readInt4; i21++) {
                                        int readInt5 = parcel.readInt();
                                        if (readInt5 != 0) {
                                            int dataPosition10 = parcel.dataPosition();
                                            Parcel obtain = Parcel.obtain();
                                            obtain.appendFrom(parcel, dataPosition10, readInt5);
                                            parcelArr2[i21] = obtain;
                                            parcel.setDataPosition(dataPosition10 + readInt5);
                                        } else {
                                            parcelArr2[i21] = null;
                                        }
                                    }
                                    parcel.setDataPosition(dataPosition9 + s18);
                                    parcelArr = parcelArr2;
                                }
                                int length9 = parcelArr.length;
                                for (int i22 = 0; i22 < length9; i22++) {
                                    if (i22 > 0) {
                                        sb2.append(",");
                                    }
                                    parcelArr[i22].setDataPosition(0);
                                    m6.j.i(c0230a.f14625q);
                                    m6.j.i(c0230a.f14626r);
                                    Map map2 = (Map) c0230a.f14626r.f14641b.get(c0230a.f14625q);
                                    m6.j.i(map2);
                                    c(sb2, map2, parcelArr[i22]);
                                }
                                break;
                            default:
                                throw new IllegalStateException("Unknown field type out.");
                        }
                        str = "]";
                    } else {
                        switch (c0230a.f14621d) {
                            case 0:
                                sb2.append(n6.b.o(readInt, parcel));
                                break;
                            case 1:
                                int s19 = n6.b.s(readInt, parcel);
                                int dataPosition11 = parcel.dataPosition();
                                if (s19 != 0) {
                                    byte[] createByteArray2 = parcel.createByteArray();
                                    parcel.setDataPosition(dataPosition11 + s19);
                                    bigInteger = new BigInteger(createByteArray2);
                                }
                                obj = bigInteger;
                                sb2.append(obj);
                                break;
                            case 2:
                                sb2.append(n6.b.q(readInt, parcel));
                                break;
                            case 3:
                                n6.b.w(parcel, readInt, 4);
                                sb2.append(parcel.readFloat());
                                break;
                            case 4:
                                n6.b.w(parcel, readInt, 8);
                                sb2.append(parcel.readDouble());
                                break;
                            case 5:
                                obj = n6.b.a(readInt, parcel);
                                sb2.append(obj);
                                break;
                            case 6:
                                sb2.append(n6.b.k(readInt, parcel));
                                break;
                            case 7:
                                String f = n6.b.f(readInt, parcel);
                                sb2.append("\"");
                                a10 = v6.d.a(f);
                                sb2.append(a10);
                                sb2.append("\"");
                                break;
                            case 8:
                                byte[] c10 = n6.b.c(readInt, parcel);
                                sb2.append("\"");
                                if (c10 != null) {
                                    a10 = Base64.encodeToString(c10, 0);
                                }
                                sb2.append(a10);
                                sb2.append("\"");
                                break;
                            case 9:
                                byte[] c11 = n6.b.c(readInt, parcel);
                                sb2.append("\"");
                                if (c11 != null) {
                                    a10 = Base64.encodeToString(c11, 10);
                                }
                                sb2.append(a10);
                                sb2.append("\"");
                                break;
                            case 10:
                                Bundle b11 = n6.b.b(readInt, parcel);
                                Set<String> keySet = b11.keySet();
                                sb2.append("{");
                                boolean z11 = true;
                                for (String str4 : keySet) {
                                    if (!z11) {
                                        sb2.append(",");
                                    }
                                    sb2.append("\"");
                                    sb2.append(str4);
                                    sb2.append("\":\"");
                                    sb2.append(v6.d.a(b11.getString(str4)));
                                    sb2.append("\"");
                                    z11 = false;
                                }
                                str = "}";
                                break;
                            case 11:
                                int s20 = n6.b.s(readInt, parcel);
                                int dataPosition12 = parcel.dataPosition();
                                if (s20 != 0) {
                                    parcel2 = Parcel.obtain();
                                    parcel2.appendFrom(parcel, dataPosition12, s20);
                                    parcel.setDataPosition(dataPosition12 + s20);
                                }
                                parcel2.setDataPosition(0);
                                m6.j.i(c0230a.f14625q);
                                m6.j.i(c0230a.f14626r);
                                Map map3 = (Map) c0230a.f14626r.f14641b.get(c0230a.f14625q);
                                m6.j.i(map3);
                                c(sb2, map3, parcel2);
                                break;
                            default:
                                throw new IllegalStateException("Unknown field type out");
                        }
                    }
                    sb2.append(str);
                }
                z10 = true;
            }
        }
        if (parcel.dataPosition() != u10) {
            throw new b.a(defpackage.f.h("Overread allowed size end=", u10), parcel);
        }
        sb2.append('}');
    }

    public static final void d(StringBuilder sb2, int i10, Object obj) {
        switch (i10) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                sb2.append(obj);
                return;
            case 7:
                sb2.append("\"");
                m6.j.i(obj);
                sb2.append(v6.d.a(obj.toString()));
                sb2.append("\"");
                return;
            case 8:
                sb2.append("\"");
                byte[] bArr = (byte[]) obj;
                sb2.append(bArr != null ? Base64.encodeToString(bArr, 0) : null);
                sb2.append("\"");
                return;
            case 9:
                sb2.append("\"");
                byte[] bArr2 = (byte[]) obj;
                sb2.append(bArr2 != null ? Base64.encodeToString(bArr2, 10) : null);
                sb2.append("\"");
                return;
            case 10:
                m6.j.i(obj);
                x6.b.B0(sb2, (HashMap) obj);
                return;
            case 11:
                throw new IllegalArgumentException("Method does not accept concrete type.");
            default:
                throw new IllegalArgumentException(defpackage.f.h("Unknown type = ", i10));
        }
    }

    public static final void e(StringBuilder sb2, a.C0230a c0230a, Object obj) {
        if (!c0230a.f14620c) {
            d(sb2, c0230a.f14619b, obj);
            return;
        }
        ArrayList arrayList = (ArrayList) obj;
        sb2.append("[");
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (i10 != 0) {
                sb2.append(",");
            }
            d(sb2, c0230a.f14619b, arrayList.get(i10));
        }
        sb2.append("]");
    }

    public final Parcel a() {
        int i10 = this.f;
        if (i10 != 0) {
            if (i10 == 1) {
                z.L(this.f14633o, this.f14629b);
            }
            return this.f14629b;
        }
        int J = z.J(20293, this.f14629b);
        this.f14633o = J;
        z.L(J, this.f14629b);
        this.f = 2;
        return this.f14629b;
    }

    @Override // t6.a
    public final <T extends a> void addConcreteTypeArrayInternal(a.C0230a c0230a, String str, ArrayList<T> arrayList) {
        b(c0230a);
        ArrayList arrayList2 = new ArrayList();
        m6.j.i(arrayList);
        arrayList.size();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList2.add(((c) arrayList.get(i10)).a());
        }
        Parcel parcel = this.f14629b;
        int J = z.J(c0230a.f14623o, parcel);
        int size2 = arrayList2.size();
        parcel.writeInt(size2);
        for (int i11 = 0; i11 < size2; i11++) {
            Parcel parcel2 = (Parcel) arrayList2.get(i11);
            if (parcel2 != null) {
                parcel.writeInt(parcel2.dataSize());
                parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            } else {
                parcel.writeInt(0);
            }
        }
        z.L(J, parcel);
    }

    @Override // t6.a
    public final <T extends a> void addConcreteTypeInternal(a.C0230a c0230a, String str, T t) {
        b(c0230a);
        Parcel a10 = ((c) t).a();
        Parcel parcel = this.f14629b;
        int i10 = c0230a.f14623o;
        if (a10 == null) {
            parcel.writeInt(i10 | 0);
            return;
        }
        int J = z.J(i10, parcel);
        parcel.appendFrom(a10, 0, a10.dataSize());
        z.L(J, parcel);
    }

    public final void b(a.C0230a c0230a) {
        if (c0230a.f14623o == -1) {
            throw new IllegalStateException("Field does not have a valid safe parcelable field id.");
        }
        Parcel parcel = this.f14629b;
        if (parcel == null) {
            throw new IllegalStateException("Internal Parcel object is null.");
        }
        int i10 = this.f;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("Attempted to parse JSON with a SafeParcelResponse object that is already filled with data.");
            }
        } else {
            this.f14633o = z.J(20293, parcel);
            this.f = 1;
        }
    }

    @Override // t6.a
    public final Map<String, a.C0230a<?, ?>> getFieldMappings() {
        h hVar = this.f14631d;
        if (hVar == null) {
            return null;
        }
        String str = this.f14632e;
        m6.j.i(str);
        return (Map) hVar.f14641b.get(str);
    }

    @Override // t6.b, t6.a
    public final Object getValueObject(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    @Override // t6.b, t6.a
    public final boolean isPrimitiveFieldSet(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    @Override // t6.a
    public final void setBooleanInternal(a.C0230a<?, ?> c0230a, String str, boolean z10) {
        b(c0230a);
        z.t(this.f14629b, c0230a.f14623o, z10);
    }

    @Override // t6.a
    public final void setDecodedBytesInternal(a.C0230a<?, ?> c0230a, String str, byte[] bArr) {
        b(c0230a);
        z.w(this.f14629b, c0230a.f14623o, bArr, true);
    }

    @Override // t6.a
    public final void setIntegerInternal(a.C0230a<?, ?> c0230a, String str, int i10) {
        b(c0230a);
        z.z(this.f14629b, c0230a.f14623o, i10);
    }

    @Override // t6.a
    public final void setLongInternal(a.C0230a<?, ?> c0230a, String str, long j10) {
        b(c0230a);
        z.C(this.f14629b, c0230a.f14623o, j10);
    }

    @Override // t6.a
    public final void setStringInternal(a.C0230a<?, ?> c0230a, String str, String str2) {
        b(c0230a);
        z.F(this.f14629b, c0230a.f14623o, str2, true);
    }

    @Override // t6.a
    public final void setStringMapInternal(a.C0230a<?, ?> c0230a, String str, Map<String, String> map) {
        b(c0230a);
        Bundle bundle = new Bundle();
        m6.j.i(map);
        for (String str2 : map.keySet()) {
            bundle.putString(str2, map.get(str2));
        }
        z.v(this.f14629b, c0230a.f14623o, bundle, true);
    }

    @Override // t6.a
    public final void setStringsInternal(a.C0230a<?, ?> c0230a, String str, ArrayList<String> arrayList) {
        b(c0230a);
        m6.j.i(arrayList);
        int size = arrayList.size();
        String[] strArr = new String[size];
        for (int i10 = 0; i10 < size; i10++) {
            strArr[i10] = arrayList.get(i10);
        }
        Parcel parcel = this.f14629b;
        int J = z.J(c0230a.f14623o, parcel);
        parcel.writeStringArray(strArr);
        z.L(J, parcel);
    }

    @Override // t6.a
    public final String toString() {
        m6.j.j(this.f14631d, "Cannot convert to JSON on client side.");
        Parcel a10 = a();
        a10.setDataPosition(0);
        StringBuilder sb2 = new StringBuilder(100);
        String str = this.f14632e;
        m6.j.i(str);
        Map map = (Map) this.f14631d.f14641b.get(str);
        m6.j.i(map);
        c(sb2, map, a10);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f14628a;
        int J = z.J(20293, parcel);
        z.z(parcel, 1, i11);
        Parcel a10 = a();
        if (a10 != null) {
            int J2 = z.J(2, parcel);
            parcel.appendFrom(a10, 0, a10.dataSize());
            z.L(J2, parcel);
        }
        z.E(parcel, 3, this.f14630c != 0 ? this.f14631d : null, i10, false);
        z.L(J, parcel);
    }

    @Override // t6.a
    public final void zab(a.C0230a c0230a, String str, BigDecimal bigDecimal) {
        b(c0230a);
        Parcel parcel = this.f14629b;
        int i10 = c0230a.f14623o;
        if (bigDecimal == null) {
            parcel.writeInt(i10 | 0);
            return;
        }
        int J = z.J(i10, parcel);
        parcel.writeByteArray(bigDecimal.unscaledValue().toByteArray());
        parcel.writeInt(bigDecimal.scale());
        z.L(J, parcel);
    }

    @Override // t6.a
    public final void zad(a.C0230a c0230a, String str, ArrayList arrayList) {
        b(c0230a);
        m6.j.i(arrayList);
        int size = arrayList.size();
        BigDecimal[] bigDecimalArr = new BigDecimal[size];
        for (int i10 = 0; i10 < size; i10++) {
            bigDecimalArr[i10] = (BigDecimal) arrayList.get(i10);
        }
        Parcel parcel = this.f14629b;
        int J = z.J(c0230a.f14623o, parcel);
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            parcel.writeByteArray(bigDecimalArr[i11].unscaledValue().toByteArray());
            parcel.writeInt(bigDecimalArr[i11].scale());
        }
        z.L(J, parcel);
    }

    @Override // t6.a
    public final void zaf(a.C0230a c0230a, String str, BigInteger bigInteger) {
        b(c0230a);
        Parcel parcel = this.f14629b;
        int i10 = c0230a.f14623o;
        if (bigInteger == null) {
            parcel.writeInt(i10 | 0);
            return;
        }
        int J = z.J(i10, parcel);
        parcel.writeByteArray(bigInteger.toByteArray());
        z.L(J, parcel);
    }

    @Override // t6.a
    public final void zah(a.C0230a c0230a, String str, ArrayList arrayList) {
        b(c0230a);
        m6.j.i(arrayList);
        int size = arrayList.size();
        BigInteger[] bigIntegerArr = new BigInteger[size];
        for (int i10 = 0; i10 < size; i10++) {
            bigIntegerArr[i10] = (BigInteger) arrayList.get(i10);
        }
        Parcel parcel = this.f14629b;
        int J = z.J(c0230a.f14623o, parcel);
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            parcel.writeByteArray(bigIntegerArr[i11].toByteArray());
        }
        z.L(J, parcel);
    }

    @Override // t6.a
    public final void zak(a.C0230a c0230a, String str, ArrayList arrayList) {
        b(c0230a);
        m6.j.i(arrayList);
        int size = arrayList.size();
        boolean[] zArr = new boolean[size];
        for (int i10 = 0; i10 < size; i10++) {
            zArr[i10] = ((Boolean) arrayList.get(i10)).booleanValue();
        }
        Parcel parcel = this.f14629b;
        int J = z.J(c0230a.f14623o, parcel);
        parcel.writeBooleanArray(zArr);
        z.L(J, parcel);
    }

    @Override // t6.a
    public final void zan(a.C0230a c0230a, String str, double d10) {
        b(c0230a);
        Parcel parcel = this.f14629b;
        parcel.writeInt(c0230a.f14623o | 524288);
        parcel.writeDouble(d10);
    }

    @Override // t6.a
    public final void zap(a.C0230a c0230a, String str, ArrayList arrayList) {
        b(c0230a);
        m6.j.i(arrayList);
        int size = arrayList.size();
        double[] dArr = new double[size];
        for (int i10 = 0; i10 < size; i10++) {
            dArr[i10] = ((Double) arrayList.get(i10)).doubleValue();
        }
        Parcel parcel = this.f14629b;
        int J = z.J(c0230a.f14623o, parcel);
        parcel.writeDoubleArray(dArr);
        z.L(J, parcel);
    }

    @Override // t6.a
    public final void zar(a.C0230a c0230a, String str, float f) {
        b(c0230a);
        Parcel parcel = this.f14629b;
        parcel.writeInt(c0230a.f14623o | 262144);
        parcel.writeFloat(f);
    }

    @Override // t6.a
    public final void zat(a.C0230a c0230a, String str, ArrayList arrayList) {
        b(c0230a);
        m6.j.i(arrayList);
        int size = arrayList.size();
        float[] fArr = new float[size];
        for (int i10 = 0; i10 < size; i10++) {
            fArr[i10] = ((Float) arrayList.get(i10)).floatValue();
        }
        Parcel parcel = this.f14629b;
        int J = z.J(c0230a.f14623o, parcel);
        parcel.writeFloatArray(fArr);
        z.L(J, parcel);
    }

    @Override // t6.a
    public final void zaw(a.C0230a c0230a, String str, ArrayList arrayList) {
        b(c0230a);
        m6.j.i(arrayList);
        int size = arrayList.size();
        int[] iArr = new int[size];
        for (int i10 = 0; i10 < size; i10++) {
            iArr[i10] = ((Integer) arrayList.get(i10)).intValue();
        }
        z.A(this.f14629b, c0230a.f14623o, iArr, true);
    }

    @Override // t6.a
    public final void zaz(a.C0230a c0230a, String str, ArrayList arrayList) {
        b(c0230a);
        m6.j.i(arrayList);
        int size = arrayList.size();
        long[] jArr = new long[size];
        for (int i10 = 0; i10 < size; i10++) {
            jArr[i10] = ((Long) arrayList.get(i10)).longValue();
        }
        Parcel parcel = this.f14629b;
        int J = z.J(c0230a.f14623o, parcel);
        parcel.writeLongArray(jArr);
        z.L(J, parcel);
    }
}
