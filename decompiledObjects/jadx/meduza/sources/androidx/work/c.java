package androidx.work;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import o2.j;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public static final String f1453b = j.f("Data");

    /* renamed from: c, reason: collision with root package name */
    public static final c f1454c;

    /* renamed from: a, reason: collision with root package name */
    public HashMap f1455a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public HashMap f1456a = new HashMap();

        public final void a(HashMap hashMap) {
            for (Map.Entry entry : hashMap.entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value == null) {
                    this.f1456a.put(str, null);
                } else {
                    Class<?> cls = value.getClass();
                    if (cls == Boolean.class || cls == Byte.class || cls == Integer.class || cls == Long.class || cls == Float.class || cls == Double.class || cls == String.class || cls == Boolean[].class || cls == Byte[].class || cls == Integer[].class || cls == Long[].class || cls == Float[].class || cls == Double[].class || cls == String[].class) {
                        this.f1456a.put(str, value);
                    } else {
                        int i10 = 0;
                        if (cls == boolean[].class) {
                            HashMap hashMap2 = this.f1456a;
                            boolean[] zArr = (boolean[]) value;
                            String str2 = c.f1453b;
                            Boolean[] boolArr = new Boolean[zArr.length];
                            while (i10 < zArr.length) {
                                boolArr[i10] = Boolean.valueOf(zArr[i10]);
                                i10++;
                            }
                            hashMap2.put(str, boolArr);
                        } else if (cls == byte[].class) {
                            HashMap hashMap3 = this.f1456a;
                            byte[] bArr = (byte[]) value;
                            String str3 = c.f1453b;
                            Byte[] bArr2 = new Byte[bArr.length];
                            while (i10 < bArr.length) {
                                bArr2[i10] = Byte.valueOf(bArr[i10]);
                                i10++;
                            }
                            hashMap3.put(str, bArr2);
                        } else if (cls == int[].class) {
                            HashMap hashMap4 = this.f1456a;
                            int[] iArr = (int[]) value;
                            String str4 = c.f1453b;
                            Integer[] numArr = new Integer[iArr.length];
                            while (i10 < iArr.length) {
                                numArr[i10] = Integer.valueOf(iArr[i10]);
                                i10++;
                            }
                            hashMap4.put(str, numArr);
                        } else if (cls == long[].class) {
                            HashMap hashMap5 = this.f1456a;
                            long[] jArr = (long[]) value;
                            String str5 = c.f1453b;
                            Long[] lArr = new Long[jArr.length];
                            while (i10 < jArr.length) {
                                lArr[i10] = Long.valueOf(jArr[i10]);
                                i10++;
                            }
                            hashMap5.put(str, lArr);
                        } else if (cls == float[].class) {
                            HashMap hashMap6 = this.f1456a;
                            float[] fArr = (float[]) value;
                            String str6 = c.f1453b;
                            Float[] fArr2 = new Float[fArr.length];
                            while (i10 < fArr.length) {
                                fArr2[i10] = Float.valueOf(fArr[i10]);
                                i10++;
                            }
                            hashMap6.put(str, fArr2);
                        } else {
                            if (cls != double[].class) {
                                throw new IllegalArgumentException("Key " + str + " has invalid type " + cls);
                            }
                            HashMap hashMap7 = this.f1456a;
                            double[] dArr = (double[]) value;
                            String str7 = c.f1453b;
                            Double[] dArr2 = new Double[dArr.length];
                            while (i10 < dArr.length) {
                                dArr2[i10] = Double.valueOf(dArr[i10]);
                                i10++;
                            }
                            hashMap7.put(str, dArr2);
                        }
                    }
                }
            }
        }

        public final void b(String str, String str2) {
            this.f1456a.put(str, str2);
        }
    }

    static {
        c cVar = new c(new HashMap());
        e(cVar);
        f1454c = cVar;
    }

    public c() {
    }

    public c(c cVar) {
        this.f1455a = new HashMap(cVar.f1455a);
    }

    public c(HashMap hashMap) {
        this.f1455a = new HashMap(hashMap);
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0067: MOVE (r7 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:36:0x0066 */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0050 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x006a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.work.c a(byte[] r7) {
        /*
            java.lang.String r0 = "Error in Data#fromByteArray: "
            int r1 = r7.length
            r2 = 10240(0x2800, float:1.4349E-41)
            if (r1 > r2) goto L7f
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream
            r2.<init>(r7)
            r7 = 0
            java.io.ObjectInputStream r3 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L41 java.lang.ClassNotFoundException -> L43 java.io.IOException -> L45
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L41 java.lang.ClassNotFoundException -> L43 java.io.IOException -> L45
            int r7 = r3.readInt()     // Catch: java.lang.Throwable -> L3b java.lang.ClassNotFoundException -> L3d java.io.IOException -> L3f
        L1b:
            if (r7 <= 0) goto L2b
            java.lang.String r4 = r3.readUTF()     // Catch: java.lang.Throwable -> L3b java.lang.ClassNotFoundException -> L3d java.io.IOException -> L3f
            java.lang.Object r5 = r3.readObject()     // Catch: java.lang.Throwable -> L3b java.lang.ClassNotFoundException -> L3d java.io.IOException -> L3f
            r1.put(r4, r5)     // Catch: java.lang.Throwable -> L3b java.lang.ClassNotFoundException -> L3d java.io.IOException -> L3f
            int r7 = r7 + (-1)
            goto L1b
        L2b:
            r3.close()     // Catch: java.io.IOException -> L2f
            goto L35
        L2f:
            r7 = move-exception
            java.lang.String r3 = androidx.work.c.f1453b
            android.util.Log.e(r3, r0, r7)
        L35:
            r2.close()     // Catch: java.io.IOException -> L39
            goto L60
        L39:
            r7 = move-exception
            goto L5b
        L3b:
            r7 = move-exception
            goto L66
        L3d:
            r7 = move-exception
            goto L49
        L3f:
            r7 = move-exception
            goto L49
        L41:
            r1 = move-exception
            goto L68
        L43:
            r3 = move-exception
            goto L46
        L45:
            r3 = move-exception
        L46:
            r6 = r3
            r3 = r7
            r7 = r6
        L49:
            java.lang.String r4 = androidx.work.c.f1453b     // Catch: java.lang.Throwable -> L3b
            android.util.Log.e(r4, r0, r7)     // Catch: java.lang.Throwable -> L3b
            if (r3 == 0) goto L35
            r3.close()     // Catch: java.io.IOException -> L54
            goto L35
        L54:
            r7 = move-exception
            java.lang.String r3 = androidx.work.c.f1453b
            android.util.Log.e(r3, r0, r7)
            goto L35
        L5b:
            java.lang.String r2 = androidx.work.c.f1453b
            android.util.Log.e(r2, r0, r7)
        L60:
            androidx.work.c r7 = new androidx.work.c
            r7.<init>(r1)
            return r7
        L66:
            r1 = r7
            r7 = r3
        L68:
            if (r7 == 0) goto L74
            r7.close()     // Catch: java.io.IOException -> L6e
            goto L74
        L6e:
            r7 = move-exception
            java.lang.String r3 = androidx.work.c.f1453b
            android.util.Log.e(r3, r0, r7)
        L74:
            r2.close()     // Catch: java.io.IOException -> L78
            goto L7e
        L78:
            r7 = move-exception
            java.lang.String r2 = androidx.work.c.f1453b
            android.util.Log.e(r2, r0, r7)
        L7e:
            throw r1
        L7f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Data cannot occupy more than 10240 bytes when serialized"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.c.a(byte[]):androidx.work.c");
    }

    public static byte[] e(c cVar) {
        ObjectOutputStream objectOutputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream2 = null;
        try {
            try {
                objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                try {
                    objectOutputStream.writeInt(cVar.f1455a.size());
                    for (Map.Entry entry : cVar.f1455a.entrySet()) {
                        objectOutputStream.writeUTF((String) entry.getKey());
                        objectOutputStream.writeObject(entry.getValue());
                    }
                    try {
                        objectOutputStream.close();
                    } catch (IOException e10) {
                        Log.e(f1453b, "Error in Data#toByteArray: ", e10);
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e11) {
                        Log.e(f1453b, "Error in Data#toByteArray: ", e11);
                    }
                    if (byteArrayOutputStream.size() <= 10240) {
                        return byteArrayOutputStream.toByteArray();
                    }
                    throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                } catch (IOException e12) {
                    e = e12;
                    objectOutputStream2 = objectOutputStream;
                    Log.e(f1453b, "Error in Data#toByteArray: ", e);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    if (objectOutputStream2 != null) {
                        try {
                            objectOutputStream2.close();
                        } catch (IOException e13) {
                            Log.e(f1453b, "Error in Data#toByteArray: ", e13);
                        }
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e14) {
                        Log.e(f1453b, "Error in Data#toByteArray: ", e14);
                    }
                    return byteArray;
                } catch (Throwable th) {
                    th = th;
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (IOException e15) {
                            Log.e(f1453b, "Error in Data#toByteArray: ", e15);
                        }
                    }
                    try {
                        byteArrayOutputStream.close();
                        throw th;
                    } catch (IOException e16) {
                        Log.e(f1453b, "Error in Data#toByteArray: ", e16);
                        throw th;
                    }
                }
            } catch (IOException e17) {
                e = e17;
            }
        } catch (Throwable th2) {
            th = th2;
            objectOutputStream = null;
        }
    }

    public final boolean b(String str) {
        Object obj = this.f1455a.get(str);
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        return false;
    }

    public final long c(String str) {
        Object obj = this.f1455a.get(str);
        if (obj instanceof Long) {
            return ((Long) obj).longValue();
        }
        return 0L;
    }

    public final String d(String str) {
        Object obj = this.f1455a.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        Set<String> keySet = this.f1455a.keySet();
        if (!keySet.equals(cVar.f1455a.keySet())) {
            return false;
        }
        for (String str : keySet) {
            Object obj2 = this.f1455a.get(str);
            Object obj3 = cVar.f1455a.get(str);
            if (!((obj2 == null || obj3 == null) ? obj2 == obj3 : ((obj2 instanceof Object[]) && (obj3 instanceof Object[])) ? Arrays.deepEquals((Object[]) obj2, (Object[]) obj3) : obj2.equals(obj3))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.f1455a.hashCode() * 31;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Data {");
        if (!this.f1455a.isEmpty()) {
            for (String str : this.f1455a.keySet()) {
                sb2.append(str);
                sb2.append(" : ");
                Object obj = this.f1455a.get(str);
                if (obj instanceof Object[]) {
                    sb2.append(Arrays.toString((Object[]) obj));
                } else {
                    sb2.append(obj);
                }
                sb2.append(", ");
            }
        }
        sb2.append("}");
        return sb2.toString();
    }
}
