package B3;

import com.google.firebase.components.ComponentRegistrar;
import java.util.List;

/* loaded from: classes.dex */
public interface j {

    /* renamed from: a, reason: collision with root package name */
    public static final j f768a = new j() { // from class: B3.i
        @Override // B3.j
        public final List a(ComponentRegistrar componentRegistrar) {
            return componentRegistrar.getComponents();
        }
    };

    List a(ComponentRegistrar componentRegistrar);
}
