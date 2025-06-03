/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Throwable
 *  ru.tvrain.core.data.RainUser
 *  rx.functions.Action1
 */
import com.hintsolutions.raintv.profile.RegistrationActivity;
import ru.tvrain.core.data.RainUser;
import rx.functions.Action1;

public final class b4
implements Action1 {
    public final int a;
    public final RegistrationActivity b;

    public /* synthetic */ b4(RegistrationActivity registrationActivity, int n2) {
        this.a = n2;
        this.b = registrationActivity;
    }

    public final void call(Object object) {
        switch (this.a) {
            default: {
                break;
            }
            case 0: {
                RegistrationActivity.z(this.b, (RainUser)object);
                return;
            }
        }
        RegistrationActivity.A(this.b, (Throwable)object);
    }
}

