/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.content.Context
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.annotation.VisibleForTesting
 *  java.io.File
 *  java.io.FileOutputStream
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.zip.ZipEntry
 *  java.util.zip.ZipFile
 */
package com.yandex.metrica.impl.ob;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.ob.B0;
import com.yandex.metrica.impl.ob.Em;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

class s7 {
    @NonNull
    private final Context a;
    @Nullable
    private final File b;
    @NonNull
    private final B0 c;

    public s7(@NonNull Context context, @Nullable File file) {
        this(context, file, new B0());
    }

    @VisibleForTesting
    public s7(@NonNull Context context, @Nullable File file, @NonNull B0 b0) {
        this.a = context;
        this.b = file;
        this.c = b0;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @SuppressLint(value={"SetWorldReadable"})
    @Nullable
    public String a(@NonNull String object, @NonNull String string) {
        Em em2;
        File file;
        String string2;
        block20: {
            block22: {
                boolean bl;
                block21: {
                    int n4;
                    block19: {
                        string2 = this.a.getApplicationInfo().sourceDir;
                        file = this.c.b(this.b, string);
                        if (file == null) {
                            return null;
                        }
                        if (file.exists()) {
                            return file.getAbsolutePath();
                        }
                        em2 = Em.a(this.a, "crpad_ext");
                        em2.a();
                        if (!file.exists()) break block19;
                        object = file.getAbsolutePath();
                        em2.b();
                        return object;
                    }
                    string = new ZipFile(string2);
                    string2 = string.getEntry((String)object);
                    if (string2 == null) break block20;
                    InputStream inputStream = string.getInputStream((ZipEntry)string2);
                    string2 = new FileOutputStream(file);
                    object = new byte[4096];
                    while (-1 != (n4 = inputStream.read((byte[])object, 0, 4096))) {
                        string2.write((byte[])object, 0, n4);
                    }
                    bl = file.setReadable(true, false);
                    if (bl) break block21;
                    em2.b();
                    string.close();
                    return null;
                    {
                        catch (IOException iOException) {
                            return null;
                        }
                    }
                }
                bl = file.setExecutable(true, false);
                if (bl) break block22;
                em2.b();
                string.close();
                return null;
                {
                    catch (IOException iOException) {
                        return null;
                    }
                }
            }
            object = file.getAbsolutePath();
            em2.b();
            string.close();
            return object;
            {
                catch (IOException iOException) {
                    return object;
                }
            }
        }
        file = new StringBuilder();
        file.append("Cannot find ZipEntry");
        file.append((String)object);
        string2 = new RuntimeException(file.toString());
        throw string2;
        catch (Throwable throwable) {
            String string3;
            block23: {
                string3 = null;
                break block23;
                catch (Throwable throwable2) {
                    string3 = string;
                }
            }
            em2.b();
            if (string3 == null) return null;
            try {
                string3.close();
                return null;
            }
            catch (IOException iOException) {
                return null;
            }
        }
    }
}

