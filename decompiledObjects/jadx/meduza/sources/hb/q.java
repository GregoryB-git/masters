package hb;

import gb.p3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class q {
    static {
        Logger.getLogger(q.class.getName());
    }

    public static byte[][] a(ArrayList arrayList) {
        int size = arrayList.size() * 2;
        byte[][] bArr = new byte[size][];
        Iterator it = arrayList.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            jb.d dVar = (jb.d) it.next();
            int i11 = i10 + 1;
            bArr[i10] = dVar.f8743a.s();
            i10 = i11 + 1;
            bArr[i11] = dVar.f8744b.s();
        }
        Logger logger = p3.f6652a;
        int i12 = 0;
        while (i12 < size) {
            byte[] bArr2 = bArr[i12];
            int i13 = i12 + 1;
            byte[] bArr3 = bArr[i13];
            if (p3.a(bArr2, p3.f6653b)) {
                for (byte b10 : bArr3) {
                    if (b10 == 44) {
                        ArrayList arrayList2 = new ArrayList(size + 10);
                        for (int i14 = 0; i14 < i12; i14++) {
                            arrayList2.add(bArr[i14]);
                        }
                        while (i12 < size) {
                            byte[] bArr4 = bArr[i12];
                            byte[] bArr5 = bArr[i12 + 1];
                            if (p3.a(bArr4, p3.f6653b)) {
                                int i15 = 0;
                                for (int i16 = 0; i16 <= bArr5.length; i16++) {
                                    if (i16 == bArr5.length || bArr5[i16] == 44) {
                                        byte[] a10 = p7.a.f13018a.a(new String(bArr5, i15, i16 - i15, n7.d.f11282a));
                                        arrayList2.add(bArr4);
                                        arrayList2.add(a10);
                                        i15 = i16 + 1;
                                    }
                                }
                            } else {
                                arrayList2.add(bArr4);
                                arrayList2.add(bArr5);
                            }
                            i12 += 2;
                        }
                        return (byte[][]) arrayList2.toArray(new byte[0][]);
                    }
                }
                bArr[i13] = p7.a.f13018a.a(new String(bArr3, n7.d.f11282a));
            }
            i12 += 2;
        }
        return bArr;
    }
}
