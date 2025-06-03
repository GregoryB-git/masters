// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package H2;

import android.os.IBinder;
import M2.b;
import android.os.IInterface;

public interface a extends IInterface
{
    public abstract static class a extends b implements H2.a
    {
        public a() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }
        
        public static H2.a o(final IBinder binder) {
            if (binder == null) {
                return null;
            }
            final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            if (queryLocalInterface instanceof H2.a) {
                return (H2.a)queryLocalInterface;
            }
            return new c(binder);
        }
    }
}
