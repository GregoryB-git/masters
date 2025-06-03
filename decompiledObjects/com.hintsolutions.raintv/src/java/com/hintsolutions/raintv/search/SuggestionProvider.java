/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.SearchRecentSuggestionsProvider
 *  android.database.Cursor
 *  android.database.MatrixCursor
 *  android.net.Uri
 *  java.lang.Object
 *  java.lang.String
 */
package com.hintsolutions.raintv.search;

import android.content.SearchRecentSuggestionsProvider;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;

public class SuggestionProvider
extends SearchRecentSuggestionsProvider {
    public static final String AUTHORITY = "com.hintsolutions.raintv.search.SuggestionProvider";
    public static final int MODE = 1;
    private static String[] columns = new String[]{"_id", "suggest_text_1"};

    public SuggestionProvider() {
        this.setupSuggestions(AUTHORITY, 1);
    }

    public Cursor query(Uri uri, String[] stringArray, String string2, String[] stringArray2, String string3) {
        MatrixCursor matrixCursor = new MatrixCursor(columns);
        uri = super.query(uri, stringArray, string2, stringArray2, string3);
        uri.moveToFirst();
        try {
            while (!uri.isAfterLast()) {
                matrixCursor.addRow(new Object[]{"0", uri.getString(uri.getColumnIndex("suggest_text_1"))});
                uri.moveToNext();
            }
            return matrixCursor;
        }
        finally {
            uri.close();
        }
    }
}

