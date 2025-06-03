/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  ru.tvrain.core.data.UserInfo
 *  ru.tvrain.core.data.rain_country.RCProfileInfo
 *  rx.functions.Action1
 */
import com.hintsolutions.raintv.MainActivity;
import java.util.ArrayList;
import ru.tvrain.core.data.UserInfo;
import ru.tvrain.core.data.rain_country.RCProfileInfo;
import rx.functions.Action1;

public final class x2
implements Action1 {
    public final int a;
    public final MainActivity b;
    public final UserInfo c;

    public /* synthetic */ x2(MainActivity mainActivity, UserInfo userInfo, int n4) {
        this.a = n4;
        this.b = mainActivity;
        this.c = userInfo;
    }

    public final void call(Object object) {
        switch (this.a) {
            default: {
                break;
            }
            case 1: {
                MainActivity.D(this.b, this.c, (ArrayList)object);
                return;
            }
            case 0: {
                MainActivity.J(this.b, this.c, (RCProfileInfo)object);
                return;
            }
        }
        MainActivity.F(this.b, this.c, (Throwable)object);
    }
}

