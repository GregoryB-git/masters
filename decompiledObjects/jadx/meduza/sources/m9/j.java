package m9;

import com.google.firebase.firestore.f;
import java.util.Arrays;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: d, reason: collision with root package name */
    public static final HashSet f10815d = new HashSet(Arrays.asList("date", "x-google-backends", "x-google-netmon-label", "x-google-service", "x-google-gfe-request-trace"));

    /* renamed from: a, reason: collision with root package name */
    public final e0 f10816a;

    /* renamed from: b, reason: collision with root package name */
    public final n9.a f10817b;

    /* renamed from: c, reason: collision with root package name */
    public final v f10818c;

    public j(n9.a aVar, e0 e0Var, v vVar) {
        this.f10817b = aVar;
        this.f10816a = e0Var;
        this.f10818c = vVar;
    }

    public static boolean a(f.a aVar) {
        switch (aVar) {
            case OK:
                throw new IllegalArgumentException("Treated status OK as error");
            case CANCELLED:
            case UNKNOWN:
            case DEADLINE_EXCEEDED:
            case RESOURCE_EXHAUSTED:
            case INTERNAL:
            case UNAVAILABLE:
            case UNAUTHENTICATED:
                return false;
            case INVALID_ARGUMENT:
            case NOT_FOUND:
            case ALREADY_EXISTS:
            case PERMISSION_DENIED:
            case FAILED_PRECONDITION:
            case ABORTED:
            case OUT_OF_RANGE:
            case UNIMPLEMENTED:
            case DATA_LOSS:
                return true;
            default:
                throw new IllegalArgumentException("Unknown gRPC status code: " + aVar);
        }
    }
}
