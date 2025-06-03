package c3;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: c3.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0841s {

    /* renamed from: a, reason: collision with root package name */
    public static final CopyOnWriteArrayList f10106a = new CopyOnWriteArrayList();

    public static InterfaceC0840r a(String str) {
        Iterator it = f10106a.iterator();
        while (it.hasNext()) {
            InterfaceC0840r interfaceC0840r = (InterfaceC0840r) it.next();
            if (interfaceC0840r.b(str)) {
                return interfaceC0840r;
            }
        }
        throw new GeneralSecurityException("No KMS client does support: " + str);
    }
}
