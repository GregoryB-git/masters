/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.Log
 *  java.io.BufferedInputStream
 *  java.io.BufferedOutputStream
 *  java.io.Closeable
 *  java.io.File
 *  java.io.FileInputStream
 *  java.io.FileNotFoundException
 *  java.io.FileOutputStream
 *  java.io.InputStream
 *  java.io.ObjectInputStream
 *  java.io.ObjectOutputStream
 *  java.io.ObjectStreamClass
 *  java.io.OutputStream
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package y1;

import O1.P;
import android.content.Context;
import android.util.Log;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.io.OutputStream;
import kotlin.jvm.internal.Intrinsics;
import x1.B;
import y1.G;
import y1.a;
import y1.e;

public final class g {
    public static final g a = new g();
    public static final String b = g.class.getName();

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public static final G a() {
        block25 : {
            block24 : {
                // MONITORENTER : y1.g.class
                G1.g.b();
                var4 = B.l();
                var3_1 = null;
                var0_2 = var4.openFileInput("AppEventsLogger.persistedevents");
                Intrinsics.checkNotNullExpressionValue(var0_2, "context.openFileInput(PERSISTED_EVENTS_FILENAME)");
                var0_2 = var1_10 = new a((InputStream)new BufferedInputStream((InputStream)var0_2));
                var2_14 = var1_10.readObject();
                if (var2_14 == null) break block24;
                var0_2 = var1_10;
                var2_14 = (G)var2_14;
                P.j((Closeable)var1_10);
                try {
                    var4.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                }
                catch (Exception var0_4) {
                    Log.w((String)g.b, (String)"Got unexpected exception when removing events file: ", (Throwable)var0_4);
                }
                var0_2 = var2_14;
            }
            var0_2 = var1_10;
            try {
                ** try [egrp 6[TRYBLOCK] [15, 14 : 109->119)] { 
lbl30: // 1 sources:
                throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.PersistedEvents");
            }
            catch (Throwable var1_11) {
                ** GOTO lbl53
            }
lbl33: // 2 sources:
            catch (Exception var2_15) {
                break block25;
            }
            catch (Throwable var1_12) {
                var0_2 = null;
                ** GOTO lbl53
            }
            catch (Exception var2_16) {
                var1_10 = null;
            }
        }
        var0_2 = var1_10;
        Log.w((String)g.b, (String)"Got unexpected exception while reading events: ", (Throwable)var2_17);
        P.j((Closeable)var1_10);
        ** try [egrp 8[TRYBLOCK] [19 : 152->163)] { 
lbl-1000: // 1 sources:
        {
            var4.getFileStreamPath("AppEventsLogger.persistedevents").delete();
            var0_2 = var3_1;
        }
lbl50: // 1 sources:
        catch (Exception var0_6) {
            block26 : {
                block27 : {
                    var1_10 = g.b;
                    break block26;
lbl53: // 2 sources:
                    P.j((Closeable)var0_2);
                    try {
                        var4.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                        throw var1_13;
                    }
                    catch (Exception var0_7) {
                        Log.w((String)g.b, (String)"Got unexpected exception when removing events file: ", (Throwable)var0_7);
                    }
                    throw var1_13;
                    catch (FileNotFoundException var0_5) {}
                    var1_10 = null;
                    break block27;
lbl63: // 2 sources:
                    catch (FileNotFoundException var0_9) {}
                }
                P.j((Closeable)var1_10);
                try {
                    var4.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                    var0_2 = var3_1;
                }
                catch (Exception var0_8) {
                    var1_10 = g.b;
                }
            }
            Log.w((String)var1_10, (String)"Got unexpected exception when removing events file: ", (Throwable)var0_2);
            var0_2 = var3_1;
        }
        var1_10 = var0_2;
        if (var0_2 == null) {
            var1_10 = new G();
        }
        // MONITOREXIT : y1.g.class
        return var1_10;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static final void b(G g8) {
        Context context;
        ObjectOutputStream objectOutputStream;
        block8 : {
            context = B.l();
            Object var2_2 = null;
            objectOutputStream = new ObjectOutputStream((OutputStream)new BufferedOutputStream((OutputStream)context.openFileOutput("AppEventsLogger.persistedevents", 0)));
            try {
                objectOutputStream.writeObject((Object)g8);
            }
            catch (Throwable throwable) {
                g8 = objectOutputStream;
                objectOutputStream = throwable;
                break block8;
            }
            P.j((Closeable)objectOutputStream);
            return;
            catch (Throwable throwable) {
                g8 = var2_2;
            }
        }
        try {
            Log.w((String)b, (String)"Got unexpected exception while persisting events: ", (Throwable)objectOutputStream);
            context.getFileStreamPath("AppEventsLogger.persistedevents").delete();
        }
        catch (Throwable throwable) {}
        P.j((Closeable)g8);
        throw throwable;
        catch (Exception exception) {}
        P.j((Closeable)g8);
    }

    public static final class y1.g$a
    extends ObjectInputStream {
        public static final a o = new a(null);

        public y1.g$a(InputStream inputStream) {
            super(inputStream);
        }

        /*
         * Enabled aggressive block sorting
         */
        public ObjectStreamClass readClassDescriptor() {
            Object object;
            block4 : {
                block3 : {
                    ObjectStreamClass objectStreamClass;
                    block2 : {
                        objectStreamClass = super.readClassDescriptor();
                        if (!Intrinsics.a(objectStreamClass.getName(), "com.facebook.appevents.AppEventsLogger$AccessTokenAppIdPair$SerializationProxyV1")) break block2;
                        object = a.b.class;
                        break block3;
                    }
                    object = objectStreamClass;
                    if (!Intrinsics.a(objectStreamClass.getName(), "com.facebook.appevents.AppEventsLogger$AppEvent$SerializationProxyV2")) break block4;
                    object = e.b.class;
                }
                object = ObjectStreamClass.lookup((Class)object);
            }
            Intrinsics.checkNotNullExpressionValue(object, "resultClassDescriptor");
            return object;
        }

        public static final class a {
            public a() {
            }

            public /* synthetic */ a(kotlin.jvm.internal.g g8) {
                this();
            }
        }

    }

}

