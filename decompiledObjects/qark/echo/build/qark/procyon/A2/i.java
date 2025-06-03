// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package A2;

import android.os.IBinder;
import M2.b;
import android.accounts.Account;
import android.os.IInterface;

public interface i extends IInterface
{
    Account b();
    
    public abstract static class a extends b implements i
    {
        public static i o(final IBinder binder) {
            if (binder == null) {
                return null;
            }
            final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            if (queryLocalInterface instanceof i) {
                return (i)queryLocalInterface;
            }
            return new n0(binder);
        }
    }
}
