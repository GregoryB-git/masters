package u5;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class m implements k {

    /* renamed from: c, reason: collision with root package name */
    public static final m f15048c = new m(Collections.emptyMap());

    /* renamed from: a, reason: collision with root package name */
    public int f15049a;

    /* renamed from: b, reason: collision with root package name */
    public final Map<String, byte[]> f15050b;

    public m() {
        this(Collections.emptyMap());
    }

    public m(Map<String, byte[]> map) {
        this.f15050b = Collections.unmodifiableMap(map);
    }

    public static boolean b(Map<String, byte[]> map, Map<String, byte[]> map2) {
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry<String, byte[]> entry : map.entrySet()) {
            if (!Arrays.equals(entry.getValue(), map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    public final m a(l lVar) {
        byte[] bArr;
        HashMap hashMap = new HashMap(this.f15050b);
        List unmodifiableList = Collections.unmodifiableList(new ArrayList(lVar.f15047b));
        for (int i10 = 0; i10 < unmodifiableList.size(); i10++) {
            hashMap.remove(unmodifiableList.get(i10));
        }
        HashMap hashMap2 = new HashMap(lVar.f15046a);
        for (Map.Entry entry : hashMap2.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr2 = (byte[]) value;
                entry.setValue(Arrays.copyOf(bArr2, bArr2.length));
            }
        }
        for (Map.Entry entry2 : Collections.unmodifiableMap(hashMap2).entrySet()) {
            String str = (String) entry2.getKey();
            Object value2 = entry2.getValue();
            if (value2 instanceof Long) {
                bArr = ByteBuffer.allocate(8).putLong(((Long) value2).longValue()).array();
            } else if (value2 instanceof String) {
                bArr = ((String) value2).getBytes(n7.d.f11284c);
            } else {
                if (!(value2 instanceof byte[])) {
                    throw new IllegalArgumentException();
                }
                bArr = (byte[]) value2;
            }
            hashMap.put(str, bArr);
        }
        return b(this.f15050b, hashMap) ? this : new m(hashMap);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        return b(this.f15050b, ((m) obj).f15050b);
    }

    public final int hashCode() {
        if (this.f15049a == 0) {
            int i10 = 0;
            for (Map.Entry<String, byte[]> entry : this.f15050b.entrySet()) {
                i10 += Arrays.hashCode(entry.getValue()) ^ entry.getKey().hashCode();
            }
            this.f15049a = i10;
        }
        return this.f15049a;
    }
}
