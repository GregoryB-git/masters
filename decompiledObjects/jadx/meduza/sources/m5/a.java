package m5;

import h5.f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import v5.e0;
import v5.u;

/* loaded from: classes.dex */
public final class a extends f {

    /* renamed from: r, reason: collision with root package name */
    public static final Pattern f10204r = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* renamed from: m, reason: collision with root package name */
    public final boolean f10205m;

    /* renamed from: n, reason: collision with root package name */
    public final b f10206n;

    /* renamed from: o, reason: collision with root package name */
    public LinkedHashMap f10207o;

    /* renamed from: p, reason: collision with root package name */
    public float f10208p = -3.4028235E38f;

    /* renamed from: q, reason: collision with root package name */
    public float f10209q = -3.4028235E38f;

    public a(List<byte[]> list) {
        if (list == null || list.isEmpty()) {
            this.f10205m = false;
            this.f10206n = null;
            return;
        }
        this.f10205m = true;
        String n2 = e0.n(list.get(0));
        x6.b.q(n2.startsWith("Format:"));
        b a10 = b.a(n2);
        a10.getClass();
        this.f10206n = a10;
        j(new u(list.get(1)), n7.d.f11284c);
    }

    public static int i(long j10, ArrayList arrayList, ArrayList arrayList2) {
        int i10;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                i10 = 0;
                break;
            }
            if (((Long) arrayList.get(size)).longValue() == j10) {
                return size;
            }
            if (((Long) arrayList.get(size)).longValue() < j10) {
                i10 = size + 1;
                break;
            }
        }
        arrayList.add(i10, Long.valueOf(j10));
        arrayList2.add(i10, i10 == 0 ? new ArrayList() : new ArrayList((Collection) arrayList2.get(i10 - 1)));
        return i10;
    }

    public static long k(String str) {
        Matcher matcher = f10204r.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String group = matcher.group(1);
        int i10 = e0.f15881a;
        return (Long.parseLong(matcher.group(4)) * 10000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(2)) * 60 * 1000000) + (Long.parseLong(group) * 60 * 60 * 1000000);
    }

    /* JADX WARN: Removed duplicated region for block: B:88:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01f0  */
    @Override // h5.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final h5.g h(byte[] r21, int r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 774
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m5.a.h(byte[], int, boolean):h5.g");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02a2 A[Catch: RuntimeException -> 0x02d9, TRY_LEAVE, TryCatch #2 {RuntimeException -> 0x02d9, blocks: (B:49:0x01da, B:51:0x01e8, B:52:0x01f7, B:54:0x01fb, B:55:0x020a, B:57:0x020e, B:58:0x021d, B:60:0x0221, B:62:0x0227, B:63:0x0248, B:65:0x024e, B:68:0x025f, B:70:0x0263, B:73:0x0274, B:75:0x0278, B:78:0x0289, B:80:0x028d, B:83:0x029e, B:85:0x02a2, B:87:0x02a8, B:94:0x02d3, B:95:0x02bd, B:107:0x022e), top: B:48:0x01da, inners: #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(v5.u r29, java.nio.charset.Charset r30) {
        /*
            Method dump skipped, instructions count: 862
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m5.a.j(v5.u, java.nio.charset.Charset):void");
    }
}
