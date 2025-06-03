// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

public abstract class s3
{
    public static final String[] a;
    public static final String[] b;
    
    static {
        a = new String[] { "firebase_last_notification", "first_open_time", "first_visit_time", "last_deep_link_referrer", "user_id", "last_advertising_id_reset", "first_open_after_install", "lifetime_user_engagement", "session_user_engagement", "non_personalized_ads", "ga_session_number", "ga_session_id", "last_gclid", "gbraid", "session_number", "session_id" };
        b = new String[] { "_ln", "_fot", "_fvt", "_ldl", "_id", "_lair", "_fi", "_lte", "_se", "_npa", "_sno", "_sid", "_lgclid", "_gbraid", "_sno", "_sid" };
    }
    
    public static String a(final String s) {
        return t4.b(s, s3.a, s3.b);
    }
}
