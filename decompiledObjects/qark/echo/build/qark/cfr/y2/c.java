/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package y2;

public abstract class c {
    public static String a(int n8) {
        switch (n8) {
            default: {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("unknown status code: ");
                stringBuilder.append(n8);
                return stringBuilder.toString();
            }
            case 22: {
                return "RECONNECTION_TIMED_OUT";
            }
            case 21: {
                return "RECONNECTION_TIMED_OUT_DURING_UPDATE";
            }
            case 20: {
                return "CONNECTION_SUSPENDED_DURING_CALL";
            }
            case 19: {
                return "REMOTE_EXCEPTION";
            }
            case 18: {
                return "DEAD_CLIENT";
            }
            case 17: {
                return "API_NOT_CONNECTED";
            }
            case 16: {
                return "CANCELED";
            }
            case 15: {
                return "TIMEOUT";
            }
            case 14: {
                return "INTERRUPTED";
            }
            case 13: {
                return "ERROR";
            }
            case 10: {
                return "DEVELOPER_ERROR";
            }
            case 8: {
                return "INTERNAL_ERROR";
            }
            case 7: {
                return "NETWORK_ERROR";
            }
            case 6: {
                return "RESOLUTION_REQUIRED";
            }
            case 5: {
                return "INVALID_ACCOUNT";
            }
            case 4: {
                return "SIGN_IN_REQUIRED";
            }
            case 3: {
                return "SERVICE_DISABLED";
            }
            case 2: {
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            }
            case 0: {
                return "SUCCESS";
            }
            case -1: 
        }
        return "SUCCESS_CACHE";
    }
}

