package okhttp3.internal.http;

/* loaded from: classes.dex */
public final class HttpMethod {
    private HttpMethod() {
    }

    public static boolean a(String str) {
        return str.equals("POST") || str.equals("PATCH") || str.equals("PUT") || str.equals("DELETE") || str.equals("MOVE");
    }

    public static boolean b(String str) {
        return (str.equals("GET") || str.equals("HEAD")) ? false : true;
    }
}
