/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  org.json.JSONException
 *  org.json.JSONObject
 *  retrofit2.HttpException
 */
package ru.tvrain.core.utils;

import org.json.JSONException;
import org.json.JSONObject;
import retrofit2.HttpException;

public class ResponseHelper {
    private static final String EMPTY_RESPONSE = "\u041d\u0435\u0442 \u043e\u0442\u0432\u0435\u0442\u0430 \u043e\u0442 \u0441\u0435\u0440\u0432\u0435\u0440\u0430";
    private static final String WRONG_RESPONSE = "\u041d\u0435\u0432\u0435\u0440\u043d\u044b\u0439 \u043e\u0442\u0432\u0435\u0442 \u043e\u0442 \u0441\u0435\u0440\u0432\u0435\u0440\u0430";

    /*
     * Exception decompiling
     */
    public static String getErrorMessage(String var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Started 2 blocks at once
         *     at kb.j.j1(SourceFile:66)
         *     at kb.j.X0(SourceFile:54)
         *     at kb.i.Z0(SourceFile:40)
         *     at ib.f.d(SourceFile:217)
         *     at ib.f.e(SourceFile:7)
         *     at ib.f.c(SourceFile:95)
         *     at rc.f.n(SourceFile:11)
         *     at pc.i.m(SourceFile:5)
         *     at pc.d.K(SourceFile:92)
         *     at pc.d.g0(SourceFile:1)
         *     at fb.b.d(SourceFile:191)
         *     at fb.b.c(SourceFile:145)
         *     at fb.a.a(SourceFile:108)
         *     at com.thesourceofcode.jadec.decompilers.JavaExtractionWorker.decompileWithCFR(SourceFile:76)
         *     at com.thesourceofcode.jadec.decompilers.JavaExtractionWorker.doWork(SourceFile:110)
         *     at com.thesourceofcode.jadec.decompilers.BaseDecompiler.withAttempt(SourceFile:3)
         *     at com.thesourceofcode.jadec.workers.DecompilerWorker.d(SourceFile:53)
         *     at com.thesourceofcode.jadec.workers.DecompilerWorker.b(SourceFile:1)
         *     at e7.a.run(SourceFile:1)
         *     at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1156)
         *     at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:651)
         *     at java.lang.Thread.run(Thread.java:1119)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private static String getErrors(JSONObject object) {
        StringBuilder stringBuilder = new StringBuilder("");
        for (int i2 = 0; i2 < object.names().length(); ++i2) {
            try {
                stringBuilder.append(object.names().get(i2).toString());
                stringBuilder.append(" ");
                stringBuilder.append(object.getJSONArray(object.names().get(i2).toString()).get(0).toString());
                stringBuilder.append("\n");
                continue;
            }
            catch (JSONException jSONException) {
                jSONException.printStackTrace();
            }
        }
        if (stringBuilder.length() < 1) {
            try {
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append(object.names().get(0).toString());
                stringBuilder2.append(" ");
                stringBuilder2.append(object.getJSONArray(object.names().get(0).toString()).get(0).toString());
                object = stringBuilder2.toString();
                return object;
            }
            catch (JSONException jSONException) {
                jSONException.printStackTrace();
            }
        }
        return stringBuilder.toString();
    }

    public static int getHttpCode(Throwable throwable) {
        try {
            int n3 = ((HttpException)throwable).response().code();
            return n3;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return 200;
        }
    }

    public static String getRetrofitErrorMessage(Throwable object) {
        try {
            String string2 = new String(((HttpException)object).response().errorBody().bytes());
            object = ResponseHelper.getErrorMessage(string2);
            return object;
        }
        catch (Exception exception) {
            return ResponseHelper.getErrorMessage("");
        }
    }
}

