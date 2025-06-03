package H2;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public interface a extends IInterface {

    /* renamed from: H2.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0037a extends M2.b implements a {
        public AbstractBinderC0037a() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        public static a o(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            return queryLocalInterface instanceof a ? (a) queryLocalInterface : new c(iBinder);
        }
    }
}
