package R2;

import java.util.BitSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class b6 extends C5 {

    /* renamed from: d, reason: collision with root package name */
    public String f5221d;

    /* renamed from: e, reason: collision with root package name */
    public Set f5222e;

    /* renamed from: f, reason: collision with root package name */
    public Map f5223f;

    /* renamed from: g, reason: collision with root package name */
    public Long f5224g;

    /* renamed from: h, reason: collision with root package name */
    public Long f5225h;

    public b6(D5 d52) {
        super(d52);
    }

    public final boolean A(int i7, int i8) {
        BitSet bitSet;
        d6 d6Var = (d6) this.f5223f.get(Integer.valueOf(i7));
        if (d6Var == null) {
            return false;
        }
        bitSet = d6Var.f5258d;
        return bitSet.get(i8);
    }

    @Override // R2.C5
    public final boolean x() {
        return false;
    }

    public final d6 y(Integer num) {
        if (this.f5223f.containsKey(num)) {
            return (d6) this.f5223f.get(num);
        }
        d6 d6Var = new d6(this, this.f5221d);
        this.f5223f.put(num, d6Var);
        return d6Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:248:0x05d3, code lost:
    
        r7 = j().L();
        r8 = R2.Y1.v(r52.f5221d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x05e5, code lost:
    
        if (r9.P() == false) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x05e7, code lost:
    
        r9 = java.lang.Integer.valueOf(r9.k());
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x05f1, code lost:
    
        r7.c("Invalid property filter ID. appId, id", r8, java.lang.String.valueOf(r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x05f0, code lost:
    
        r9 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List z(java.lang.String r53, java.util.List r54, java.util.List r55, java.lang.Long r56, java.lang.Long r57) {
        /*
            Method dump skipped, instructions count: 1700
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: R2.b6.z(java.lang.String, java.util.List, java.util.List, java.lang.Long, java.lang.Long):java.util.List");
    }
}
