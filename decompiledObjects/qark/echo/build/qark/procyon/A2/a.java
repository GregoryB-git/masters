// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package A2;

import android.os.RemoteException;
import android.util.Log;
import android.os.Binder;
import android.accounts.Account;

public abstract class a extends i.a
{
    public static Account v(final i i) {
        final Account account = null;
        while (true) {
            if (i != null) {
                final long clearCallingIdentity = Binder.clearCallingIdentity();
                while (true) {
                    try {
                        while (true) {
                            while (true) {
                                try {
                                    final Account b = i.b();
                                    Binder.restoreCallingIdentity(clearCallingIdentity);
                                    return b;
                                }
                                finally {
                                    break;
                                }
                                Log.w("AccountAccessor", "Remote account accessor probably died");
                                final Account b = account;
                                continue;
                            }
                        }
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                        return null;
                    }
                    catch (RemoteException ex) {}
                    continue;
                }
            }
            continue;
        }
    }
}
