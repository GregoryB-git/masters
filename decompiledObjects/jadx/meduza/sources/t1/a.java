package t1;

import ec.i;

/* loaded from: classes.dex */
public final class a implements e {

    /* renamed from: a, reason: collision with root package name */
    public final String f14405a;

    /* renamed from: t1.a$a, reason: collision with other inner class name */
    public static final class C0225a {
        public static void a(d dVar, Object[] objArr) {
            double floatValue;
            long longValue;
            int intValue;
            if (objArr == null) {
                return;
            }
            int length = objArr.length;
            int i10 = 0;
            while (i10 < length) {
                Object obj = objArr[i10];
                i10++;
                if (obj == null) {
                    dVar.d0(i10);
                } else if (obj instanceof byte[]) {
                    dVar.T((byte[]) obj, i10);
                } else {
                    if (obj instanceof Float) {
                        floatValue = ((Number) obj).floatValue();
                    } else if (obj instanceof Double) {
                        floatValue = ((Number) obj).doubleValue();
                    } else {
                        if (obj instanceof Long) {
                            longValue = ((Number) obj).longValue();
                        } else {
                            if (obj instanceof Integer) {
                                intValue = ((Number) obj).intValue();
                            } else if (obj instanceof Short) {
                                intValue = ((Number) obj).shortValue();
                            } else if (obj instanceof Byte) {
                                intValue = ((Number) obj).byteValue();
                            } else if (obj instanceof String) {
                                dVar.n(i10, (String) obj);
                            } else {
                                if (!(obj instanceof Boolean)) {
                                    throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i10 + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
                                }
                                longValue = ((Boolean) obj).booleanValue() ? 1L : 0L;
                            }
                            longValue = intValue;
                        }
                        dVar.F(i10, longValue);
                    }
                    dVar.s(i10, floatValue);
                }
            }
        }
    }

    public a(String str) {
        i.e(str, "query");
        this.f14405a = str;
    }

    @Override // t1.e
    public final void f(d dVar) {
    }

    @Override // t1.e
    public final String g() {
        return this.f14405a;
    }
}
