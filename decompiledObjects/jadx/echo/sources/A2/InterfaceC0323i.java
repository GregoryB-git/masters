package A2;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;

/* renamed from: A2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC0323i extends IInterface {

    /* renamed from: A2.i$a */
    public static abstract class a extends M2.b implements InterfaceC0323i {
        public static InterfaceC0323i o(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            return queryLocalInterface instanceof InterfaceC0323i ? (InterfaceC0323i) queryLocalInterface : new n0(iBinder);
        }
    }

    Account b();
}
