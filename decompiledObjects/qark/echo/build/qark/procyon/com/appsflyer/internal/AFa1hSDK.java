// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer.internal;

import android.os.Parcel;
import android.os.IInterface;
import android.content.ComponentName;
import java.util.concurrent.LinkedBlockingQueue;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;
import java.io.Reader;
import com.appsflyer.AFLogger;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.io.FileInputStream;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.TimeUnit;
import android.os.IBinder;
import android.content.ServiceConnection;
import android.content.Intent;
import android.os.Looper;
import android.content.Context;

@Deprecated
public final class AFa1hSDK implements AFa1bSDK
{
    private final AFb1bSDK values;
    
    public AFa1hSDK() {
    }
    
    public AFa1hSDK(final AFb1bSDK values) {
        this.values = values;
    }
    
    public static AFa1ySDK AFInAppEventType(final Context context) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Cannot be called from the main thread");
        }
        context.getPackageManager().getPackageInfo("com.android.vending", 0);
        final AFa1wSDK aFa1wSDK = new AFa1wSDK((byte)0);
        final Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        Label_0160: {
            Label_0145: {
                try {
                    if (!context.bindService(intent, (ServiceConnection)aFa1wSDK, 1)) {
                        break Label_0145;
                    }
                    if (aFa1wSDK.AFKeystoreWrapper) {
                        throw new IllegalStateException("Cannot call get on this connection more than once");
                    }
                    aFa1wSDK.AFKeystoreWrapper = true;
                    final IBinder binder = aFa1wSDK.AFInAppEventType.poll(10L, TimeUnit.SECONDS);
                    if (binder != null) {
                        final AFa1xSDK aFa1xSDK = new AFa1xSDK(binder);
                        final AFa1ySDK aFa1ySDK = new AFa1ySDK(aFa1xSDK.AFInAppEventParameterName(), aFa1xSDK.values());
                        context.unbindService((ServiceConnection)aFa1wSDK);
                        return aFa1ySDK;
                    }
                }
                finally {
                    break Label_0160;
                }
                throw new TimeoutException("Timed out waiting for the service connection");
            }
            context.unbindService((ServiceConnection)aFa1wSDK);
            throw new IOException("Google Play connection failed");
        }
        context.unbindService((ServiceConnection)aFa1wSDK);
    }
    
    private static AFa1rSDK valueOf(final File file) {
        Reader reader = null;
        Reader reader2 = null;
        Exception ex2 = null;
        Label_0129: {
            final Exception ex3;
            try {
                final InputStreamReader inputStreamReader = (InputStreamReader)(reader = new InputStreamReader(new FileInputStream(file), Charset.defaultCharset()));
                try {
                    try {
                        final char[] cbuf = new char[(int)file.length()];
                        reader = inputStreamReader;
                        inputStreamReader.read(cbuf);
                        reader = inputStreamReader;
                        final AFa1rSDK aFa1rSDK = new AFa1rSDK(cbuf);
                        reader = inputStreamReader;
                        aFa1rSDK.AFInAppEventParameterName = file.getName();
                        try {
                            inputStreamReader.close();
                            return aFa1rSDK;
                        }
                        catch (IOException ex) {
                            AFLogger.afErrorLogForExcManagerOnly("could not close load reader", ex);
                            return aFa1rSDK;
                        }
                    }
                    finally {}
                }
                catch (Exception reader) {}
            }
            catch (Exception ex3) {
                reader2 = null;
            }
            finally {
                reader2 = reader;
                ex2 = ex3;
                break Label_0129;
            }
            AFLogger.afErrorLogForExcManagerOnly("error while loading request from cache", ex3);
            if (reader2 != null) {
                try {
                    reader2.close();
                    return null;
                }
                catch (IOException ex4) {
                    AFLogger.afErrorLogForExcManagerOnly("could not close load reader", ex4);
                }
            }
            return null;
        }
        if (reader2 != null) {
            try {
                reader2.close();
            }
            catch (IOException ex5) {
                AFLogger.afErrorLogForExcManagerOnly("could not close load reader", ex5);
            }
        }
        throw ex2;
    }
    
    @Override
    public final void AFInAppEventType() {
        while (true) {
            try {
                final File file = new File(this.values.AFInAppEventType.getFilesDir(), "AFRequestCache");
                if (!file.exists()) {
                    file.mkdir();
                    return;
                }
                final File[] listFiles = file.listFiles();
                if (listFiles == null) {
                    return;
                }
                for (int length = listFiles.length, i = 0; i < length; ++i) {
                    final File file2 = listFiles[i];
                    final StringBuilder sb = new StringBuilder("CACHE: Found cached request");
                    sb.append(file2.getName());
                    AFLogger.afInfoLog(sb.toString());
                    final StringBuilder sb2 = new StringBuilder("CACHE: Deleting ");
                    sb2.append(file2.getName());
                    sb2.append(" from cache");
                    AFLogger.afInfoLog(sb2.toString());
                    file2.delete();
                }
                return;
                final Exception ex;
                AFLogger.afErrorLog("CACHE: Could not cache request", ex);
            }
            catch (Exception ex) {
                continue;
            }
            break;
        }
    }
    
    @Override
    public final String valueOf(final AFa1rSDK p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: astore_2       
        //     2: new             Ljava/io/File;
        //     5: dup            
        //     6: aload_0        
        //     7: getfield        com/appsflyer/internal/AFa1hSDK.values:Lcom/appsflyer/internal/AFb1bSDK;
        //    10: getfield        com/appsflyer/internal/AFb1bSDK.AFInAppEventType:Landroid/content/Context;
        //    13: invokevirtual   android/content/Context.getFilesDir:()Ljava/io/File;
        //    16: ldc             "AFRequestCache"
        //    18: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //    21: astore_3       
        //    22: aload_3        
        //    23: invokevirtual   java/io/File.exists:()Z
        //    26: ifne            36
        //    29: aload_3        
        //    30: invokevirtual   java/io/File.mkdir:()Z
        //    33: pop            
        //    34: aconst_null    
        //    35: areturn        
        //    36: aload_3        
        //    37: invokevirtual   java/io/File.listFiles:()[Ljava/io/File;
        //    40: astore_3       
        //    41: aload_3        
        //    42: ifnull          59
        //    45: aload_3        
        //    46: arraylength    
        //    47: bipush          40
        //    49: if_icmple       59
        //    52: ldc             "CACHE: reached cache limit, not caching request"
        //    54: invokestatic    com/appsflyer/AFLogger.afInfoLog:(Ljava/lang/String;)V
        //    57: aconst_null    
        //    58: areturn        
        //    59: new             Ljava/lang/StringBuilder;
        //    62: dup            
        //    63: ldc             "CACHE: caching request with URL: "
        //    65: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //    68: astore_3       
        //    69: aload_3        
        //    70: aload_1        
        //    71: getfield        com/appsflyer/internal/AFa1rSDK.valueOf:Ljava/lang/String;
        //    74: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    77: pop            
        //    78: aload_3        
        //    79: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //    82: invokestatic    com/appsflyer/AFLogger.afInfoLog:(Ljava/lang/String;)V
        //    85: invokestatic    java/lang/System.currentTimeMillis:()J
        //    88: invokestatic    java/lang/Long.toString:(J)Ljava/lang/String;
        //    91: astore          4
        //    93: new             Ljava/io/File;
        //    96: dup            
        //    97: new             Ljava/io/File;
        //   100: dup            
        //   101: aload_0        
        //   102: getfield        com/appsflyer/internal/AFa1hSDK.values:Lcom/appsflyer/internal/AFb1bSDK;
        //   105: getfield        com/appsflyer/internal/AFb1bSDK.AFInAppEventType:Landroid/content/Context;
        //   108: invokevirtual   android/content/Context.getFilesDir:()Ljava/io/File;
        //   111: ldc             "AFRequestCache"
        //   113: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //   116: aload           4
        //   118: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //   121: astore_3       
        //   122: aload_3        
        //   123: invokevirtual   java/io/File.createNewFile:()Z
        //   126: pop            
        //   127: new             Ljava/io/OutputStreamWriter;
        //   130: dup            
        //   131: new             Ljava/io/FileOutputStream;
        //   134: dup            
        //   135: aload_3        
        //   136: invokevirtual   java/io/File.getPath:()Ljava/lang/String;
        //   139: iconst_1       
        //   140: invokespecial   java/io/FileOutputStream.<init>:(Ljava/lang/String;Z)V
        //   143: invokestatic    java/nio/charset/Charset.defaultCharset:()Ljava/nio/charset/Charset;
        //   146: invokespecial   java/io/OutputStreamWriter.<init>:(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V
        //   149: astore_3       
        //   150: aload_3        
        //   151: astore_2       
        //   152: aload_3        
        //   153: ldc_w           "version="
        //   156: invokevirtual   java/io/Writer.write:(Ljava/lang/String;)V
        //   159: aload_3        
        //   160: astore_2       
        //   161: aload_3        
        //   162: aload_1        
        //   163: getfield        com/appsflyer/internal/AFa1rSDK.AFKeystoreWrapper:Ljava/lang/String;
        //   166: invokevirtual   java/io/Writer.write:(Ljava/lang/String;)V
        //   169: aload_3        
        //   170: astore_2       
        //   171: aload_3        
        //   172: bipush          10
        //   174: invokevirtual   java/io/Writer.write:(I)V
        //   177: aload_3        
        //   178: astore_2       
        //   179: aload_3        
        //   180: ldc_w           "url="
        //   183: invokevirtual   java/io/Writer.write:(Ljava/lang/String;)V
        //   186: aload_3        
        //   187: astore_2       
        //   188: aload_3        
        //   189: aload_1        
        //   190: getfield        com/appsflyer/internal/AFa1rSDK.valueOf:Ljava/lang/String;
        //   193: invokevirtual   java/io/Writer.write:(Ljava/lang/String;)V
        //   196: aload_3        
        //   197: astore_2       
        //   198: aload_3        
        //   199: bipush          10
        //   201: invokevirtual   java/io/Writer.write:(I)V
        //   204: aload_3        
        //   205: astore_2       
        //   206: aload_3        
        //   207: ldc_w           "data="
        //   210: invokevirtual   java/io/Writer.write:(Ljava/lang/String;)V
        //   213: aload_3        
        //   214: astore_2       
        //   215: aload_3        
        //   216: aload_1        
        //   217: invokevirtual   com/appsflyer/internal/AFa1rSDK.AFInAppEventType:()[B
        //   220: iconst_2       
        //   221: invokestatic    android/util/Base64.encodeToString:([BI)Ljava/lang/String;
        //   224: invokevirtual   java/io/Writer.write:(Ljava/lang/String;)V
        //   227: aload_3        
        //   228: astore_2       
        //   229: aload_3        
        //   230: bipush          10
        //   232: invokevirtual   java/io/Writer.write:(I)V
        //   235: aload_3        
        //   236: astore_2       
        //   237: aload_1        
        //   238: getfield        com/appsflyer/internal/AFa1rSDK.AFInAppEventType:Lcom/appsflyer/internal/AFd1vSDK;
        //   241: astore_1       
        //   242: aload_1        
        //   243: ifnull          276
        //   246: aload_3        
        //   247: astore_2       
        //   248: aload_3        
        //   249: ldc_w           "type="
        //   252: invokevirtual   java/io/Writer.write:(Ljava/lang/String;)V
        //   255: aload_3        
        //   256: astore_2       
        //   257: aload_3        
        //   258: aload_1        
        //   259: invokevirtual   java/lang/Enum.name:()Ljava/lang/String;
        //   262: invokevirtual   java/io/Writer.write:(Ljava/lang/String;)V
        //   265: aload_3        
        //   266: astore_2       
        //   267: aload_3        
        //   268: bipush          10
        //   270: invokevirtual   java/io/Writer.write:(I)V
        //   273: goto            276
        //   276: aload_3        
        //   277: astore_2       
        //   278: aload_3        
        //   279: invokevirtual   java/io/Writer.flush:()V
        //   282: aload_3        
        //   283: astore_2       
        //   284: ldc_w           "CACHE: done, cacheKey: "
        //   287: aload           4
        //   289: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   292: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //   295: invokestatic    com/appsflyer/AFLogger.afInfoLog:(Ljava/lang/String;)V
        //   298: aload_3        
        //   299: invokevirtual   java/io/Writer.close:()V
        //   302: aload           4
        //   304: areturn        
        //   305: astore_1       
        //   306: ldc_w           "could not close cache writer"
        //   309: aload_1        
        //   310: invokestatic    com/appsflyer/AFLogger.afErrorLogForExcManagerOnly:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   313: aload           4
        //   315: areturn        
        //   316: aload_1        
        //   317: astore_2       
        //   318: ldc             "CACHE: Could not cache request"
        //   320: aload_3        
        //   321: invokestatic    com/appsflyer/AFLogger.afErrorLog:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   324: aload_1        
        //   325: ifnull          342
        //   328: aload_1        
        //   329: invokevirtual   java/io/Writer.close:()V
        //   332: aconst_null    
        //   333: areturn        
        //   334: astore_1       
        //   335: ldc_w           "could not close cache writer"
        //   338: aload_1        
        //   339: invokestatic    com/appsflyer/AFLogger.afErrorLogForExcManagerOnly:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   342: aconst_null    
        //   343: areturn        
        //   344: aload_1        
        //   345: ifnull          363
        //   348: aload_1        
        //   349: invokevirtual   java/io/Writer.close:()V
        //   352: goto            363
        //   355: astore_1       
        //   356: ldc_w           "could not close cache writer"
        //   359: aload_1        
        //   360: invokestatic    com/appsflyer/AFLogger.afErrorLogForExcManagerOnly:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   363: aload_2        
        //   364: athrow         
        //   365: astore_3       
        //   366: aload_2        
        //   367: astore_1       
        //   368: aload_3        
        //   369: astore_2       
        //   370: goto            344
        //   373: astore_3       
        //   374: aconst_null    
        //   375: astore_1       
        //   376: goto            316
        //   379: astore_3       
        //   380: aload_2        
        //   381: astore_1       
        //   382: aload_3        
        //   383: astore_2       
        //   384: goto            344
        //   387: astore_2       
        //   388: aload_3        
        //   389: astore_1       
        //   390: aload_2        
        //   391: astore_3       
        //   392: goto            316
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  2      34     373    379    Ljava/lang/Exception;
        //  2      34     365    373    Any
        //  36     41     373    379    Ljava/lang/Exception;
        //  36     41     365    373    Any
        //  45     57     373    379    Ljava/lang/Exception;
        //  45     57     365    373    Any
        //  59     150    373    379    Ljava/lang/Exception;
        //  59     150    365    373    Any
        //  152    159    387    395    Ljava/lang/Exception;
        //  152    159    379    387    Any
        //  161    169    387    395    Ljava/lang/Exception;
        //  161    169    379    387    Any
        //  171    177    387    395    Ljava/lang/Exception;
        //  171    177    379    387    Any
        //  179    186    387    395    Ljava/lang/Exception;
        //  179    186    379    387    Any
        //  188    196    387    395    Ljava/lang/Exception;
        //  188    196    379    387    Any
        //  198    204    387    395    Ljava/lang/Exception;
        //  198    204    379    387    Any
        //  206    213    387    395    Ljava/lang/Exception;
        //  206    213    379    387    Any
        //  215    227    387    395    Ljava/lang/Exception;
        //  215    227    379    387    Any
        //  229    235    387    395    Ljava/lang/Exception;
        //  229    235    379    387    Any
        //  237    242    387    395    Ljava/lang/Exception;
        //  237    242    379    387    Any
        //  248    255    387    395    Ljava/lang/Exception;
        //  248    255    379    387    Any
        //  257    265    387    395    Ljava/lang/Exception;
        //  257    265    379    387    Any
        //  267    273    387    395    Ljava/lang/Exception;
        //  267    273    379    387    Any
        //  278    282    387    395    Ljava/lang/Exception;
        //  278    282    379    387    Any
        //  284    298    387    395    Ljava/lang/Exception;
        //  284    298    379    387    Any
        //  298    302    305    316    Ljava/io/IOException;
        //  318    324    379    387    Any
        //  328    332    334    342    Ljava/io/IOException;
        //  348    352    355    363    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0276:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2596)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @Override
    public final void valueOf() {
        Label_0054: {
            try {
                if (!new File(this.values.AFInAppEventType.getFilesDir(), "AFRequestCache").exists()) {
                    new File(this.values.AFInAppEventType.getFilesDir(), "AFRequestCache").mkdir();
                    return;
                }
            }
            catch (Exception ex) {
                break Label_0054;
            }
            return;
        }
        final Exception ex;
        AFLogger.afErrorLog("CACHE: Could not create cache directory", ex);
    }
    
    @NonNull
    @Override
    public final List<AFa1rSDK> values() {
        final ArrayList<AFa1rSDK> list = new ArrayList<AFa1rSDK>();
        while (true) {
            try {
                final File file = new File(this.values.AFInAppEventType.getFilesDir(), "AFRequestCache");
                if (!file.exists()) {
                    file.mkdir();
                }
                final File[] listFiles = file.listFiles();
                if (listFiles == null) {
                    return list;
                }
                for (int length = listFiles.length, i = 0; i < length; ++i) {
                    final File file2 = listFiles[i];
                    final StringBuilder sb = new StringBuilder("CACHE: Found cached request");
                    sb.append(file2.getName());
                    AFLogger.afInfoLog(sb.toString());
                    list.add(valueOf(file2));
                }
                return list;
                final Exception ex;
                AFLogger.afErrorLog("CACHE: Could not get cached requests", ex);
                return list;
            }
            catch (Exception ex2) {}
            final Exception ex2;
            final Exception ex = ex2;
            continue;
        }
    }
    
    @Override
    public final boolean values(final String str) {
        final File file = new File(new File(this.values.AFInAppEventType.getFilesDir(), "AFRequestCache"), str);
        final StringBuilder sb = new StringBuilder("CACHE: Deleting ");
        sb.append(str);
        sb.append(" from cache");
        AFLogger.afInfoLog(sb.toString());
        if (file.exists()) {
            try {
                return file.delete();
            }
            catch (Exception ex) {
                final StringBuilder sb2 = new StringBuilder("CACHE: Could not delete ");
                sb2.append(str);
                sb2.append(" from cache");
                AFLogger.afErrorLog(sb2.toString(), ex);
                return false;
            }
        }
        return true;
    }
    
    public static final class AFa1wSDK implements ServiceConnection
    {
        final LinkedBlockingQueue<IBinder> AFInAppEventType;
        boolean AFKeystoreWrapper;
        
        private AFa1wSDK() {
            this.AFInAppEventType = new LinkedBlockingQueue<IBinder>(1);
            this.AFKeystoreWrapper = false;
        }
        
        public final void onServiceConnected(final ComponentName componentName, final IBinder e) {
            try {
                this.AFInAppEventType.put(e);
            }
            catch (InterruptedException ex) {
                AFLogger.afErrorLogForExcManagerOnly("onServiceConnected Interrupted", ex);
            }
        }
        
        public final void onServiceDisconnected(final ComponentName componentName) {
        }
    }
    
    public static final class AFa1xSDK implements IInterface
    {
        private final IBinder valueOf;
        
        public AFa1xSDK(final IBinder valueOf) {
            this.valueOf = valueOf;
        }
        
        public final String AFInAppEventParameterName() {
            final Parcel obtain = Parcel.obtain();
            final Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.valueOf.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            }
            finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
        
        public final IBinder asBinder() {
            return this.valueOf;
        }
        
        public final boolean values() {
            final Parcel obtain = Parcel.obtain();
            final Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                boolean b = true;
                obtain.writeInt(1);
                this.valueOf.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                if (obtain2.readInt() == 0) {
                    b = false;
                }
                return b;
            }
            finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }
    
    public static final class AFa1ySDK
    {
        final String valueOf;
        private final boolean values;
        
        public AFa1ySDK(final String valueOf, final boolean values) {
            this.valueOf = valueOf;
            this.values = values;
        }
        
        public final boolean AFInAppEventType() {
            return this.values;
        }
    }
}
