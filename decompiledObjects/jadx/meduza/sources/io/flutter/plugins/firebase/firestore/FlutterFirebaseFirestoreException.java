package io.flutter.plugins.firebase.firestore;

import com.google.firebase.firestore.f;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class FlutterFirebaseFirestoreException extends Exception {
    private static final String ERROR_ABORTED = "The operation was aborted, typically due to a concurrency issue like transaction aborts, etc.";
    private static final String ERROR_ALREADY_EXISTS = "Some document that we attempted to create already exists.";
    private static final String ERROR_CANCELLED = "The operation was cancelled (typically by the caller).";
    private static final String ERROR_DATA_LOSS = "Unrecoverable data loss or corruption.";
    private static final String ERROR_DEADLINE_EXCEEDED = "Deadline expired before operation could complete. For operations that change the state of the system, this error may be returned even if the operation has completed successfully. For example, a successful response from a server could have been delayed long enough for the deadline to expire.";
    private static final String ERROR_FAILED_PRECONDITION = "Operation was rejected because the system is not in a state required for the operation's execution. If performing a query, ensure it has been indexed via the Firebase console.";
    private static final String ERROR_INTERNAL = "Internal errors. Means some invariants expected by underlying system has been broken. If you see one of these errors, something is very broken.";
    private static final String ERROR_INVALID_ARGUMENT = "Client specified an invalid argument. Note that this differs from failed-precondition. invalid-argument indicates arguments that are problematic regardless of the state of the system (e.g., an invalid field name).";
    private static final String ERROR_NOT_FOUND = "Some requested document was not found.";
    private static final String ERROR_OUT_OF_RANGE = "Operation was attempted past the valid range.";
    private static final String ERROR_PERMISSION_DENIED = "The caller does not have permission to execute the specified operation.";
    private static final String ERROR_RESOURCE_EXHAUSTED = "Some resource has been exhausted, perhaps a per-user quota, or perhaps the entire file system is out of space.";
    private static final String ERROR_UNAUTHENTICATED = "The request does not have valid authentication credentials for the operation.";
    private static final String ERROR_UNAVAILABLE = "The service is currently unavailable. This is a most likely a transient condition and may be corrected by retrying with a backoff.";
    private static final String ERROR_UNIMPLEMENTED = "Operation is not implemented or not supported/enabled.";
    private static final String ERROR_UNKNOWN = "Operation is not implemented or not supported/enabled.";
    private final String code;
    private final String message;

    /* renamed from: io.flutter.plugins.firebase.firestore.FlutterFirebaseFirestoreException$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$google$firebase$firestore$FirebaseFirestoreException$Code;

        static {
            int[] iArr = new int[f.a.values().length];
            $SwitchMap$com$google$firebase$firestore$FirebaseFirestoreException$Code = iArr;
            try {
                f.a aVar = f.a.OK;
                iArr[10] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int[] iArr2 = $SwitchMap$com$google$firebase$firestore$FirebaseFirestoreException$Code;
                f.a aVar2 = f.a.OK;
                iArr2[6] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                int[] iArr3 = $SwitchMap$com$google$firebase$firestore$FirebaseFirestoreException$Code;
                f.a aVar3 = f.a.OK;
                iArr3[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                int[] iArr4 = $SwitchMap$com$google$firebase$firestore$FirebaseFirestoreException$Code;
                f.a aVar4 = f.a.OK;
                iArr4[15] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                int[] iArr5 = $SwitchMap$com$google$firebase$firestore$FirebaseFirestoreException$Code;
                f.a aVar5 = f.a.OK;
                iArr5[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                int[] iArr6 = $SwitchMap$com$google$firebase$firestore$FirebaseFirestoreException$Code;
                f.a aVar6 = f.a.OK;
                iArr6[9] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                int[] iArr7 = $SwitchMap$com$google$firebase$firestore$FirebaseFirestoreException$Code;
                f.a aVar7 = f.a.OK;
                iArr7[13] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                int[] iArr8 = $SwitchMap$com$google$firebase$firestore$FirebaseFirestoreException$Code;
                f.a aVar8 = f.a.OK;
                iArr8[3] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                int[] iArr9 = $SwitchMap$com$google$firebase$firestore$FirebaseFirestoreException$Code;
                f.a aVar9 = f.a.OK;
                iArr9[5] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                int[] iArr10 = $SwitchMap$com$google$firebase$firestore$FirebaseFirestoreException$Code;
                f.a aVar10 = f.a.OK;
                iArr10[11] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                int[] iArr11 = $SwitchMap$com$google$firebase$firestore$FirebaseFirestoreException$Code;
                f.a aVar11 = f.a.OK;
                iArr11[7] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                int[] iArr12 = $SwitchMap$com$google$firebase$firestore$FirebaseFirestoreException$Code;
                f.a aVar12 = f.a.OK;
                iArr12[8] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                int[] iArr13 = $SwitchMap$com$google$firebase$firestore$FirebaseFirestoreException$Code;
                f.a aVar13 = f.a.OK;
                iArr13[16] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                int[] iArr14 = $SwitchMap$com$google$firebase$firestore$FirebaseFirestoreException$Code;
                f.a aVar14 = f.a.OK;
                iArr14[14] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                int[] iArr15 = $SwitchMap$com$google$firebase$firestore$FirebaseFirestoreException$Code;
                f.a aVar15 = f.a.OK;
                iArr15[12] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                int[] iArr16 = $SwitchMap$com$google$firebase$firestore$FirebaseFirestoreException$Code;
                f.a aVar16 = f.a.OK;
                iArr16[2] = 16;
            } catch (NoSuchFieldError unused16) {
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public FlutterFirebaseFirestoreException(com.google.firebase.firestore.f fVar, Throwable th) {
        super(fVar != null ? fVar.getMessage() : "", th);
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        char c10;
        String str6 = null;
        if (th == null || th.getMessage() == null) {
            str = ERROR_OUT_OF_RANGE;
        } else {
            String message = th.getMessage();
            str = ERROR_OUT_OF_RANGE;
            if (message.contains(":")) {
                Matcher matcher = Pattern.compile("([A-Z_]{3,25}):\\s(.*)").matcher(th.getMessage());
                if (matcher.find()) {
                    String trim = matcher.group(1).trim();
                    str2 = "out-of-range";
                    str3 = matcher.group(2).trim();
                    trim.getClass();
                    switch (trim.hashCode()) {
                        case -1842427240:
                            if (trim.equals("DATA_LOSS")) {
                                c10 = 0;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -1711692763:
                            if (trim.equals("INVALID_ARGUMENT")) {
                                c10 = 1;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -1416305653:
                            if (trim.equals("PERMISSION_DENIED")) {
                                c10 = 2;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -1031784143:
                            if (trim.equals("CANCELLED")) {
                                c10 = 3;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -1025686472:
                            if (trim.equals("RESOURCE_EXHAUSTED")) {
                                c10 = 4;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -849706474:
                            if (trim.equals("UNAUTHENTICATED")) {
                                c10 = 5;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -476794961:
                            if (trim.equals("ABORTED")) {
                                c10 = 6;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -376214182:
                            if (trim.equals("DEADLINE_EXCEEDED")) {
                                c10 = 7;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 433141802:
                            if (trim.equals("UNKNOWN")) {
                                c10 = '\b';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 695165606:
                            if (trim.equals("OUT_OF_RANGE")) {
                                c10 = '\t';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 979228314:
                            if (trim.equals("FAILED_PRECONDITION")) {
                                c10 = '\n';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 1023286998:
                            if (trim.equals("NOT_FOUND")) {
                                c10 = 11;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 1353037501:
                            if (trim.equals("INTERNAL")) {
                                c10 = '\f';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 1487498288:
                            if (trim.equals("UNAVAILABLE")) {
                                c10 = '\r';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 1661336131:
                            if (trim.equals("ALREADY_EXISTS")) {
                                c10 = 14;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 1854913705:
                            if (trim.equals("UNIMPLEMENTED")) {
                                c10 = 15;
                                break;
                            }
                            c10 = 65535;
                            break;
                        default:
                            c10 = 65535;
                            break;
                    }
                    switch (c10) {
                        case 0:
                            str3 = ERROR_DATA_LOSS;
                            str6 = "data-loss";
                            break;
                        case 1:
                            str3 = ERROR_INVALID_ARGUMENT;
                            str6 = "invalid-argument";
                            break;
                        case 2:
                            str3 = ERROR_PERMISSION_DENIED;
                            str6 = "permission-denied";
                            break;
                        case 3:
                            str3 = ERROR_CANCELLED;
                            str6 = "cancelled";
                            break;
                        case 4:
                            str3 = ERROR_RESOURCE_EXHAUSTED;
                            str6 = "resource-exhausted";
                            break;
                        case 5:
                            str3 = ERROR_UNAUTHENTICATED;
                            str6 = "unauthenticated";
                            break;
                        case 6:
                            str3 = ERROR_ABORTED;
                            str6 = "aborted";
                            break;
                        case 7:
                            str3 = ERROR_DEADLINE_EXCEEDED;
                            str6 = "deadline-exceeded";
                            break;
                        case '\b':
                            str6 = "unknown";
                            str3 = "Operation is not implemented or not supported/enabled.";
                            break;
                        case '\t':
                            str3 = str;
                            str6 = str2;
                            break;
                        case '\n':
                            str6 = "failed-precondition";
                            if (!str3.contains("index")) {
                                str3 = ERROR_FAILED_PRECONDITION;
                                break;
                            }
                            break;
                        case 11:
                            str3 = ERROR_NOT_FOUND;
                            str6 = "not-found";
                            break;
                        case '\f':
                            str3 = ERROR_INTERNAL;
                            str6 = "internal";
                            break;
                        case '\r':
                            str3 = ERROR_UNAVAILABLE;
                            str6 = "unavailable";
                            break;
                        case 14:
                            str3 = ERROR_ALREADY_EXISTS;
                            str6 = "already-exists";
                            break;
                        case 15:
                            str3 = "Operation is not implemented or not supported/enabled.";
                            str6 = "unimplemented";
                            break;
                        default:
                            str3 = null;
                            break;
                    }
                    if (str6 != null && fVar != null) {
                        switch (AnonymousClass1.$SwitchMap$com$google$firebase$firestore$FirebaseFirestoreException$Code[fVar.f3161a.ordinal()]) {
                            case 1:
                                str4 = ERROR_ABORTED;
                                str5 = "aborted";
                                break;
                            case 2:
                                str4 = ERROR_ALREADY_EXISTS;
                                str5 = "already-exists";
                                break;
                            case 3:
                                str4 = ERROR_CANCELLED;
                                str5 = "cancelled";
                                break;
                            case 4:
                                str4 = ERROR_DATA_LOSS;
                                str5 = "data-loss";
                                break;
                            case 5:
                                str4 = ERROR_DEADLINE_EXCEEDED;
                                str5 = "deadline-exceeded";
                                break;
                            case 6:
                                if ((fVar.getMessage() != null && fVar.getMessage().contains("query requires an index")) || fVar.getMessage().contains("ensure it has been indexed")) {
                                    str4 = fVar.getMessage();
                                    str5 = "failed-precondition";
                                    break;
                                } else {
                                    str5 = "failed-precondition";
                                    str4 = ERROR_FAILED_PRECONDITION;
                                    break;
                                }
                                break;
                            case 7:
                                str4 = ERROR_INTERNAL;
                                str5 = "internal";
                                break;
                            case 8:
                                str4 = ERROR_INVALID_ARGUMENT;
                                str5 = "invalid-argument";
                                break;
                            case 9:
                                str4 = ERROR_NOT_FOUND;
                                str5 = "not-found";
                                break;
                            case 10:
                                str4 = str;
                                str5 = str2;
                                break;
                            case 11:
                                str4 = ERROR_PERMISSION_DENIED;
                                str5 = "permission-denied";
                                break;
                            case 12:
                                str4 = ERROR_RESOURCE_EXHAUSTED;
                                str5 = "resource-exhausted";
                                break;
                            case 13:
                                str4 = ERROR_UNAUTHENTICATED;
                                str5 = "unauthenticated";
                                break;
                            case 14:
                                str4 = ERROR_UNAVAILABLE;
                                str5 = "unavailable";
                                break;
                            case 15:
                                str4 = "Operation is not implemented or not supported/enabled.";
                                str5 = "unimplemented";
                                break;
                            case 16:
                                str4 = "Unknown error or an error from a different error domain.";
                                str5 = "unknown";
                                break;
                            default:
                                str4 = "An unknown error occurred";
                                str5 = "unknown";
                                break;
                        }
                    } else {
                        str4 = str3;
                        str5 = str6;
                    }
                    this.code = str5;
                    this.message = str4;
                }
            }
        }
        str2 = "out-of-range";
        str3 = null;
        if (str6 != null) {
        }
        str4 = str3;
        str5 = str6;
        this.code = str5;
        this.message = str4;
    }

    public String getCode() {
        return this.code;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }
}
