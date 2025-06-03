.class public final synthetic Ld;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/plugin/common/BasicMessageChannel$MessageHandler;
.implements Li0/d;
.implements Ls3/b$a;
.implements Lv5/l$a;
.implements Lz4/x$a;
.implements Lcom/google/android/gms/tasks/Continuation;
.implements Lt9/a$a;
.implements Lcom/google/android/gms/tasks/OnFailureListener;
.implements Lcom/google/android/gms/tasks/SuccessContinuation;
.implements Lh3/g;
.implements Lio/flutter/util/ViewUtils$ViewVisitor;
.implements Ld8/e;
.implements Ln7/q;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Ld;->a:I

    iput-object p1, p0, Ld;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ld;->b:Ljava/lang/Object;

    check-cast v0, Lr3/c;

    invoke-interface {v0}, Lr3/c;->H()Ln3/a;

    move-result-object v0

    return-object v0
.end method

.method public apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Ld;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lea/k;

    .line 4
    .line 5
    check-cast p1, Lea/y;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    sget-object v0, Lea/z;->a:Lea/z;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    sget-object v0, Lea/z;->b:La9/d;

    .line 16
    .line 17
    invoke-virtual {v0, p1}, La9/d;->a(Ljava/lang/Object;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const-string v1, "SessionEvents.SESSION_EVENT_ENCODER.encode(value)"

    .line 22
    .line 23
    invoke-static {v0, v1}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    new-instance v1, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 29
    .line 30
    .line 31
    const-string v2, "Session Event Type: "

    .line 32
    .line 33
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    iget-object p1, p1, Lea/y;->a:Lea/m;

    .line 37
    .line 38
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    const-string v1, "EventGDTLogger"

    .line 50
    .line 51
    invoke-static {v1, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 52
    .line 53
    .line 54
    sget-object p1, Llc/a;->a:Ljava/nio/charset/Charset;

    .line 55
    .line 56
    invoke-virtual {v0, p1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    const-string v0, "this as java.lang.String).getBytes(charset)"

    .line 61
    .line 62
    invoke-static {p1, v0}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    return-object p1
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method

.method public b(Li0/e;ILandroid/os/Bundle;)Z
    .locals 7

    .line 1
    iget-object v0, p0, Ld;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/view/View;

    .line 4
    .line 5
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x1

    .line 9
    const/16 v4, 0x19

    .line 10
    .line 11
    if-lt v1, v4, :cond_1

    .line 12
    .line 13
    and-int/2addr p2, v3

    .line 14
    if-eqz p2, :cond_1

    .line 15
    .line 16
    :try_start_0
    iget-object p2, p1, Li0/e;->a:Li0/e$c;

    .line 17
    .line 18
    invoke-interface {p2}, Li0/e$c;->b()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    .line 20
    .line 21
    iget-object p2, p1, Li0/e;->a:Li0/e$c;

    .line 22
    .line 23
    invoke-interface {p2}, Li0/e$c;->d()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    check-cast p2, Landroid/os/Parcelable;

    .line 28
    .line 29
    if-nez p3, :cond_0

    .line 30
    .line 31
    new-instance p3, Landroid/os/Bundle;

    .line 32
    .line 33
    invoke-direct {p3}, Landroid/os/Bundle;-><init>()V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    new-instance v4, Landroid/os/Bundle;

    .line 38
    .line 39
    invoke-direct {v4, p3}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 40
    .line 41
    .line 42
    move-object p3, v4

    .line 43
    :goto_0
    const-string v4, "androidx.core.view.extra.INPUT_CONTENT_INFO"

    .line 44
    .line 45
    invoke-virtual {p3, v4, p2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 46
    .line 47
    .line 48
    goto :goto_1

    .line 49
    :catch_0
    move-exception p1

    .line 50
    const-string p2, "InputConnectionCompat"

    .line 51
    .line 52
    const-string p3, "Can\'t insert content from IME; requestPermission() failed"

    .line 53
    .line 54
    invoke-static {p2, p3, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 55
    .line 56
    .line 57
    goto :goto_3

    .line 58
    :cond_1
    :goto_1
    new-instance p2, Landroid/content/ClipData;

    .line 59
    .line 60
    iget-object v4, p1, Li0/e;->a:Li0/e$c;

    .line 61
    .line 62
    invoke-interface {v4}, Li0/e$c;->getDescription()Landroid/content/ClipDescription;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    new-instance v5, Landroid/content/ClipData$Item;

    .line 67
    .line 68
    iget-object v6, p1, Li0/e;->a:Li0/e$c;

    .line 69
    .line 70
    invoke-interface {v6}, Li0/e$c;->a()Landroid/net/Uri;

    .line 71
    .line 72
    .line 73
    move-result-object v6

    .line 74
    invoke-direct {v5, v6}, Landroid/content/ClipData$Item;-><init>(Landroid/net/Uri;)V

    .line 75
    .line 76
    .line 77
    invoke-direct {p2, v4, v5}, Landroid/content/ClipData;-><init>(Landroid/content/ClipDescription;Landroid/content/ClipData$Item;)V

    .line 78
    .line 79
    .line 80
    const/4 v4, 0x2

    .line 81
    const/16 v5, 0x1f

    .line 82
    .line 83
    if-lt v1, v5, :cond_2

    .line 84
    .line 85
    new-instance v1, Le0/c$a;

    .line 86
    .line 87
    invoke-direct {v1, p2, v4}, Le0/c$a;-><init>(Landroid/content/ClipData;I)V

    .line 88
    .line 89
    .line 90
    goto :goto_2

    .line 91
    :cond_2
    new-instance v1, Le0/c$c;

    .line 92
    .line 93
    invoke-direct {v1, p2, v4}, Le0/c$c;-><init>(Landroid/content/ClipData;I)V

    .line 94
    .line 95
    .line 96
    :goto_2
    iget-object p1, p1, Li0/e;->a:Li0/e$c;

    .line 97
    .line 98
    invoke-interface {p1}, Li0/e$c;->c()Landroid/net/Uri;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    invoke-interface {v1, p1}, Le0/c$b;->a(Landroid/net/Uri;)V

    .line 103
    .line 104
    .line 105
    invoke-interface {v1, p3}, Le0/c$b;->setExtras(Landroid/os/Bundle;)V

    .line 106
    .line 107
    .line 108
    invoke-interface {v1}, Le0/c$b;->build()Le0/c;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    invoke-static {v0, p1}, Le0/d0;->f(Landroid/view/View;Le0/c;)Le0/c;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    if-nez p1, :cond_3

    .line 117
    .line 118
    move v2, v3

    .line 119
    :cond_3
    :goto_3
    return v2
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
.end method

.method public g(Ld8/u;)Ljava/lang/Object;
    .locals 44

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    const-class v2, Lu7/f;

    .line 6
    .line 7
    iget v3, v1, Ld;->a:I

    .line 8
    .line 9
    packed-switch v3, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    goto/16 :goto_19

    .line 13
    .line 14
    :pswitch_0
    iget-object v3, v1, Ld;->b:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v3, Lcom/google/firebase/crashlytics/CrashlyticsRegistrar;

    .line 17
    .line 18
    sget v4, Lcom/google/firebase/crashlytics/CrashlyticsRegistrar;->d:I

    .line 19
    .line 20
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    sget-object v4, Lk8/i;->d:Lk8/i$a;

    .line 24
    .line 25
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 29
    .line 30
    .line 31
    move-result-wide v4

    .line 32
    invoke-virtual {v0, v2}, Ld8/u;->get(Ljava/lang/Class;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    check-cast v2, Lu7/f;

    .line 37
    .line 38
    const-class v6, Lu9/d;

    .line 39
    .line 40
    invoke-virtual {v0, v6}, Ld8/u;->get(Ljava/lang/Class;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v6

    .line 44
    check-cast v6, Lu9/d;

    .line 45
    .line 46
    const-class v7, Lg8/a;

    .line 47
    .line 48
    invoke-virtual {v0, v7}, Ld8/u;->f(Ljava/lang/Class;)Lt9/a;

    .line 49
    .line 50
    .line 51
    move-result-object v7

    .line 52
    const-class v8, Lw7/a;

    .line 53
    .line 54
    invoke-virtual {v0, v8}, Ld8/u;->f(Ljava/lang/Class;)Lt9/a;

    .line 55
    .line 56
    .line 57
    move-result-object v8

    .line 58
    const-class v9, Lda/a;

    .line 59
    .line 60
    invoke-virtual {v0, v9}, Ld8/u;->f(Ljava/lang/Class;)Lt9/a;

    .line 61
    .line 62
    .line 63
    move-result-object v9

    .line 64
    iget-object v10, v3, Lcom/google/firebase/crashlytics/CrashlyticsRegistrar;->a:Ld8/t;

    .line 65
    .line 66
    invoke-virtual {v0, v10}, Ld8/u;->e(Ld8/t;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v10

    .line 70
    check-cast v10, Ljava/util/concurrent/ExecutorService;

    .line 71
    .line 72
    iget-object v11, v3, Lcom/google/firebase/crashlytics/CrashlyticsRegistrar;->b:Ld8/t;

    .line 73
    .line 74
    invoke-virtual {v0, v11}, Ld8/u;->e(Ld8/t;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v11

    .line 78
    check-cast v11, Ljava/util/concurrent/ExecutorService;

    .line 79
    .line 80
    iget-object v3, v3, Lcom/google/firebase/crashlytics/CrashlyticsRegistrar;->c:Ld8/t;

    .line 81
    .line 82
    invoke-virtual {v0, v3}, Ld8/u;->e(Ld8/t;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    check-cast v0, Ljava/util/concurrent/ExecutorService;

    .line 87
    .line 88
    invoke-virtual {v2}, Lu7/f;->a()V

    .line 89
    .line 90
    .line 91
    iget-object v3, v2, Lu7/f;->a:Landroid/content/Context;

    .line 92
    .line 93
    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v12

    .line 97
    const-string v13, "Initializing Firebase Crashlytics "

    .line 98
    .line 99
    const-string v14, "19.4.0"

    .line 100
    .line 101
    const-string v15, " for "

    .line 102
    .line 103
    invoke-static {v13, v14, v15, v12}, La0/j;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v13

    .line 107
    const-string v15, "FirebaseCrashlytics"

    .line 108
    .line 109
    const/4 v14, 0x0

    .line 110
    invoke-static {v15, v13, v14}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 111
    .line 112
    .line 113
    new-instance v14, Lk8/i;

    .line 114
    .line 115
    invoke-direct {v14, v10, v11}, Lk8/i;-><init>(Ljava/util/concurrent/ExecutorService;Ljava/util/concurrent/ExecutorService;)V

    .line 116
    .line 117
    .line 118
    new-instance v13, Lp8/e;

    .line 119
    .line 120
    invoke-direct {v13, v3}, Lp8/e;-><init>(Landroid/content/Context;)V

    .line 121
    .line 122
    .line 123
    new-instance v11, Lj8/w;

    .line 124
    .line 125
    invoke-direct {v11, v2}, Lj8/w;-><init>(Lu7/f;)V

    .line 126
    .line 127
    .line 128
    new-instance v10, Lj8/a0;

    .line 129
    .line 130
    invoke-direct {v10, v3, v12, v6, v11}, Lj8/a0;-><init>(Landroid/content/Context;Ljava/lang/String;Lu9/d;Lj8/w;)V

    .line 131
    .line 132
    .line 133
    new-instance v12, Lg8/b;

    .line 134
    .line 135
    invoke-direct {v12, v7}, Lg8/b;-><init>(Lt9/a;)V

    .line 136
    .line 137
    .line 138
    new-instance v6, Lf8/a;

    .line 139
    .line 140
    invoke-direct {v6, v8}, Lf8/a;-><init>(Lt9/a;)V

    .line 141
    .line 142
    .line 143
    new-instance v8, Lj8/j;

    .line 144
    .line 145
    invoke-direct {v8, v11, v13}, Lj8/j;-><init>(Lj8/w;Lp8/e;)V

    .line 146
    .line 147
    .line 148
    sget-object v7, Lfa/a;->a:Lfa/a;

    .line 149
    .line 150
    sget-object v7, Lfa/b$a;->a:Lfa/b$a;

    .line 151
    .line 152
    sget-object v16, Lfa/a;->a:Lfa/a;

    .line 153
    .line 154
    move-object/from16 p1, v13

    .line 155
    .line 156
    invoke-static {v7}, Lfa/a;->a(Lfa/b$a;)Lfa/a$a;

    .line 157
    .line 158
    .line 159
    move-result-object v13

    .line 160
    move-object/from16 v16, v14

    .line 161
    .line 162
    iget-object v14, v13, Lfa/a$a;->b:Lfa/b;

    .line 163
    .line 164
    move-object/from16 v17, v15

    .line 165
    .line 166
    const-string v15, "Subscriber "

    .line 167
    .line 168
    const-string v1, "SessionsDependencies"

    .line 169
    .line 170
    if-eqz v14, :cond_0

    .line 171
    .line 172
    new-instance v13, Ljava/lang/StringBuilder;

    .line 173
    .line 174
    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v13, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    invoke-virtual {v13, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    const-string v7, " already registered."

    .line 184
    .line 185
    invoke-virtual {v13, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 186
    .line 187
    .line 188
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v7

    .line 192
    invoke-static {v1, v7}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 193
    .line 194
    .line 195
    goto :goto_0

    .line 196
    :cond_0
    iput-object v8, v13, Lfa/a$a;->b:Lfa/b;

    .line 197
    .line 198
    new-instance v14, Ljava/lang/StringBuilder;

    .line 199
    .line 200
    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    .line 201
    .line 202
    .line 203
    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 204
    .line 205
    .line 206
    invoke-virtual {v14, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 207
    .line 208
    .line 209
    const-string v7, " registered."

    .line 210
    .line 211
    invoke-virtual {v14, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 212
    .line 213
    .line 214
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object v7

    .line 218
    invoke-static {v1, v7}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 219
    .line 220
    .line 221
    iget-object v1, v13, Lfa/a$a;->a:Lvc/a;

    .line 222
    .line 223
    const/4 v7, 0x0

    .line 224
    invoke-interface {v1, v7}, Lvc/a;->a(Ljava/lang/Object;)V

    .line 225
    .line 226
    .line 227
    :goto_0
    new-instance v15, Lg8/f;

    .line 228
    .line 229
    invoke-direct {v15, v9}, Lg8/f;-><init>(Lt9/a;)V

    .line 230
    .line 231
    .line 232
    new-instance v1, Lj8/s;

    .line 233
    .line 234
    new-instance v13, Le;

    .line 235
    .line 236
    const/4 v7, 0x7

    .line 237
    invoke-direct {v13, v6, v7}, Le;-><init>(Ljava/lang/Object;I)V

    .line 238
    .line 239
    .line 240
    new-instance v14, Laa/m0;

    .line 241
    .line 242
    const/4 v7, 0x6

    .line 243
    invoke-direct {v14, v6, v7}, Laa/m0;-><init>(Ljava/lang/Object;I)V

    .line 244
    .line 245
    .line 246
    move-object v6, v1

    .line 247
    move-object v7, v2

    .line 248
    move-object/from16 v18, v8

    .line 249
    .line 250
    move-object v8, v10

    .line 251
    move-object v9, v12

    .line 252
    move-object/from16 v21, v10

    .line 253
    .line 254
    move-object v10, v11

    .line 255
    move-object/from16 v26, v11

    .line 256
    .line 257
    move-object v11, v13

    .line 258
    move-object v12, v14

    .line 259
    move-object/from16 v14, p1

    .line 260
    .line 261
    move-object v13, v14

    .line 262
    move-wide/from16 v27, v4

    .line 263
    .line 264
    move-object v4, v14

    .line 265
    move-object/from16 p1, v16

    .line 266
    .line 267
    move-object/from16 v14, v18

    .line 268
    .line 269
    move-object/from16 v5, v17

    .line 270
    .line 271
    invoke-direct/range {v6 .. v16}, Lj8/s;-><init>(Lu7/f;Lj8/a0;Lg8/b;Lj8/w;Le;Laa/m0;Lp8/e;Lj8/j;Lg8/f;Lk8/i;)V

    .line 272
    .line 273
    .line 274
    invoke-virtual {v2}, Lu7/f;->a()V

    .line 275
    .line 276
    .line 277
    iget-object v2, v2, Lu7/f;->c:Lu7/j;

    .line 278
    .line 279
    iget-object v2, v2, Lu7/j;->b:Ljava/lang/String;

    .line 280
    .line 281
    invoke-static {v3}, Lj8/g;->d(Landroid/content/Context;)Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object v8

    .line 285
    new-instance v9, Ljava/util/ArrayList;

    .line 286
    .line 287
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 288
    .line 289
    .line 290
    const-string v6, "array"

    .line 291
    .line 292
    const-string v7, "com.google.firebase.crashlytics.build_ids_lib"

    .line 293
    .line 294
    invoke-static {v3, v7, v6}, Lj8/g;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I

    .line 295
    .line 296
    .line 297
    move-result v7

    .line 298
    const-string v10, "com.google.firebase.crashlytics.build_ids_arch"

    .line 299
    .line 300
    invoke-static {v3, v10, v6}, Lj8/g;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I

    .line 301
    .line 302
    .line 303
    move-result v10

    .line 304
    const-string v11, "com.google.firebase.crashlytics.build_ids_build_id"

    .line 305
    .line 306
    invoke-static {v3, v11, v6}, Lj8/g;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I

    .line 307
    .line 308
    .line 309
    move-result v6

    .line 310
    if-eqz v7, :cond_6

    .line 311
    .line 312
    if-eqz v10, :cond_6

    .line 313
    .line 314
    if-nez v6, :cond_1

    .line 315
    .line 316
    goto :goto_3

    .line 317
    :cond_1
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 318
    .line 319
    .line 320
    move-result-object v12

    .line 321
    invoke-virtual {v12, v7}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    .line 322
    .line 323
    .line 324
    move-result-object v7

    .line 325
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 326
    .line 327
    .line 328
    move-result-object v12

    .line 329
    invoke-virtual {v12, v10}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    .line 330
    .line 331
    .line 332
    move-result-object v10

    .line 333
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 334
    .line 335
    .line 336
    move-result-object v12

    .line 337
    invoke-virtual {v12, v6}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    .line 338
    .line 339
    .line 340
    move-result-object v6

    .line 341
    array-length v12, v7

    .line 342
    array-length v13, v6

    .line 343
    if-ne v12, v13, :cond_4

    .line 344
    .line 345
    array-length v12, v10

    .line 346
    array-length v13, v6

    .line 347
    if-eq v12, v13, :cond_2

    .line 348
    .line 349
    goto :goto_2

    .line 350
    :cond_2
    const/4 v12, 0x0

    .line 351
    :goto_1
    array-length v13, v6

    .line 352
    if-ge v12, v13, :cond_3

    .line 353
    .line 354
    new-instance v13, Lj8/e;

    .line 355
    .line 356
    aget-object v14, v7, v12

    .line 357
    .line 358
    aget-object v15, v10, v12

    .line 359
    .line 360
    aget-object v11, v6, v12

    .line 361
    .line 362
    invoke-direct {v13, v14, v15, v11}, Lj8/e;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 363
    .line 364
    .line 365
    invoke-virtual {v9, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 366
    .line 367
    .line 368
    add-int/lit8 v12, v12, 0x1

    .line 369
    .line 370
    goto :goto_1

    .line 371
    :cond_3
    const/4 v7, 0x3

    .line 372
    goto :goto_5

    .line 373
    :cond_4
    :goto_2
    const/4 v11, 0x3

    .line 374
    new-array v12, v11, [Ljava/lang/Object;

    .line 375
    .line 376
    array-length v7, v7

    .line 377
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 378
    .line 379
    .line 380
    move-result-object v7

    .line 381
    const/4 v11, 0x0

    .line 382
    aput-object v7, v12, v11

    .line 383
    .line 384
    array-length v7, v10

    .line 385
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 386
    .line 387
    .line 388
    move-result-object v7

    .line 389
    const/4 v10, 0x1

    .line 390
    aput-object v7, v12, v10

    .line 391
    .line 392
    array-length v6, v6

    .line 393
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 394
    .line 395
    .line 396
    move-result-object v6

    .line 397
    const/4 v7, 0x2

    .line 398
    aput-object v6, v12, v7

    .line 399
    .line 400
    const-string v6, "Lengths did not match: %d %d %d"

    .line 401
    .line 402
    invoke-static {v6, v12}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 403
    .line 404
    .line 405
    move-result-object v6

    .line 406
    const/4 v11, 0x3

    .line 407
    invoke-static {v5, v11}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 408
    .line 409
    .line 410
    move-result v7

    .line 411
    if-eqz v7, :cond_5

    .line 412
    .line 413
    move v7, v11

    .line 414
    goto :goto_4

    .line 415
    :cond_5
    move v7, v11

    .line 416
    goto :goto_5

    .line 417
    :cond_6
    :goto_3
    const/4 v11, 0x3

    .line 418
    new-array v12, v11, [Ljava/lang/Object;

    .line 419
    .line 420
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 421
    .line 422
    .line 423
    move-result-object v7

    .line 424
    const/4 v11, 0x0

    .line 425
    aput-object v7, v12, v11

    .line 426
    .line 427
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 428
    .line 429
    .line 430
    move-result-object v7

    .line 431
    const/4 v10, 0x1

    .line 432
    aput-object v7, v12, v10

    .line 433
    .line 434
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 435
    .line 436
    .line 437
    move-result-object v6

    .line 438
    const/4 v7, 0x2

    .line 439
    aput-object v6, v12, v7

    .line 440
    .line 441
    const-string v6, "Could not find resources: %d %d %d"

    .line 442
    .line 443
    invoke-static {v6, v12}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 444
    .line 445
    .line 446
    move-result-object v6

    .line 447
    const/4 v7, 0x3

    .line 448
    invoke-static {v5, v7}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 449
    .line 450
    .line 451
    move-result v10

    .line 452
    if-eqz v10, :cond_7

    .line 453
    .line 454
    :goto_4
    const/4 v10, 0x0

    .line 455
    invoke-static {v5, v6, v10}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 456
    .line 457
    .line 458
    :cond_7
    :goto_5
    const-string v6, "Mapping file ID is: "

    .line 459
    .line 460
    invoke-static {v6, v8}, Lg;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 461
    .line 462
    .line 463
    move-result-object v6

    .line 464
    invoke-static {v5, v7}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 465
    .line 466
    .line 467
    move-result v10

    .line 468
    if-eqz v10, :cond_8

    .line 469
    .line 470
    const/4 v7, 0x0

    .line 471
    invoke-static {v5, v6, v7}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 472
    .line 473
    .line 474
    :cond_8
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 475
    .line 476
    .line 477
    move-result-object v6

    .line 478
    :cond_9
    :goto_6
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 479
    .line 480
    .line 481
    move-result v7

    .line 482
    if-eqz v7, :cond_a

    .line 483
    .line 484
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 485
    .line 486
    .line 487
    move-result-object v7

    .line 488
    check-cast v7, Lj8/e;

    .line 489
    .line 490
    const/4 v10, 0x3

    .line 491
    new-array v11, v10, [Ljava/lang/Object;

    .line 492
    .line 493
    iget-object v10, v7, Lj8/e;->a:Ljava/lang/String;

    .line 494
    .line 495
    const/4 v12, 0x0

    .line 496
    aput-object v10, v11, v12

    .line 497
    .line 498
    iget-object v10, v7, Lj8/e;->b:Ljava/lang/String;

    .line 499
    .line 500
    const/4 v12, 0x1

    .line 501
    aput-object v10, v11, v12

    .line 502
    .line 503
    iget-object v7, v7, Lj8/e;->c:Ljava/lang/String;

    .line 504
    .line 505
    const/4 v10, 0x2

    .line 506
    aput-object v7, v11, v10

    .line 507
    .line 508
    const-string v7, "Build id for %s on %s: %s"

    .line 509
    .line 510
    invoke-static {v7, v11}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 511
    .line 512
    .line 513
    move-result-object v7

    .line 514
    const/4 v10, 0x3

    .line 515
    invoke-static {v5, v10}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 516
    .line 517
    .line 518
    move-result v11

    .line 519
    if-eqz v11, :cond_9

    .line 520
    .line 521
    const/4 v11, 0x0

    .line 522
    invoke-static {v5, v7, v11}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 523
    .line 524
    .line 525
    goto :goto_6

    .line 526
    :cond_a
    new-instance v14, Lg8/c;

    .line 527
    .line 528
    invoke-direct {v14, v3}, Lg8/c;-><init>(Landroid/content/Context;)V

    .line 529
    .line 530
    .line 531
    :try_start_0
    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 532
    .line 533
    .line 534
    move-result-object v11

    .line 535
    invoke-virtual/range {v21 .. v21}, Lj8/a0;->d()Ljava/lang/String;

    .line 536
    .line 537
    .line 538
    move-result-object v13

    .line 539
    invoke-virtual {v3}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 540
    .line 541
    .line 542
    move-result-object v6

    .line 543
    const/4 v7, 0x0

    .line 544
    invoke-virtual {v6, v11, v7}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 545
    .line 546
    .line 547
    move-result-object v6

    .line 548
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 549
    .line 550
    const/16 v10, 0x1c

    .line 551
    .line 552
    if-lt v7, v10, :cond_b

    .line 553
    .line 554
    invoke-static {v6}, Lcom/google/android/recaptcha/internal/a;->e(Landroid/content/pm/PackageInfo;)J

    .line 555
    .line 556
    .line 557
    move-result-wide v16

    .line 558
    invoke-static/range {v16 .. v17}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    .line 559
    .line 560
    .line 561
    move-result-object v7

    .line 562
    goto :goto_7

    .line 563
    :cond_b
    iget v7, v6, Landroid/content/pm/PackageInfo;->versionCode:I

    .line 564
    .line 565
    invoke-static {v7}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 566
    .line 567
    .line 568
    move-result-object v7

    .line 569
    :goto_7
    move-object/from16 v24, v7

    .line 570
    .line 571
    iget-object v6, v6, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    .line 572
    .line 573
    if-nez v6, :cond_c

    .line 574
    .line 575
    const-string v6, "0.0"

    .line 576
    .line 577
    :cond_c
    move-object/from16 v23, v6

    .line 578
    .line 579
    new-instance v12, Lj8/a;

    .line 580
    .line 581
    move-object v6, v12

    .line 582
    move-object v7, v2

    .line 583
    move-object v10, v13

    .line 584
    move-object/from16 v43, v12

    .line 585
    .line 586
    move-object/from16 v12, v24

    .line 587
    .line 588
    move-object v15, v13

    .line 589
    move-object/from16 v13, v23

    .line 590
    .line 591
    invoke-direct/range {v6 .. v14}, Lj8/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lg8/c;)V
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_4

    .line 592
    .line 593
    .line 594
    const-string v6, "Installer package name is: "

    .line 595
    .line 596
    invoke-static {v6, v15}, Lg;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 597
    .line 598
    .line 599
    move-result-object v6

    .line 600
    const/4 v7, 0x2

    .line 601
    invoke-static {v5, v7}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 602
    .line 603
    .line 604
    move-result v7

    .line 605
    if-eqz v7, :cond_d

    .line 606
    .line 607
    const/4 v7, 0x0

    .line 608
    invoke-static {v5, v6, v7}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 609
    .line 610
    .line 611
    :cond_d
    new-instance v6, Leb/y;

    .line 612
    .line 613
    invoke-direct {v6}, Leb/y;-><init>()V

    .line 614
    .line 615
    .line 616
    invoke-virtual/range {v21 .. v21}, Lj8/a0;->d()Ljava/lang/String;

    .line 617
    .line 618
    .line 619
    move-result-object v7

    .line 620
    new-instance v15, Lnc/g0;

    .line 621
    .line 622
    const/16 v8, 0x10

    .line 623
    .line 624
    invoke-direct {v15, v8}, Lnc/g0;-><init>(I)V

    .line 625
    .line 626
    .line 627
    new-instance v8, Lg/s;

    .line 628
    .line 629
    const/16 v9, 0xa

    .line 630
    .line 631
    invoke-direct {v8, v15, v9}, Lg/s;-><init>(Ljava/lang/Object;I)V

    .line 632
    .line 633
    .line 634
    new-instance v9, Ld2/h0;

    .line 635
    .line 636
    invoke-direct {v9, v4}, Ld2/h0;-><init>(Lp8/e;)V

    .line 637
    .line 638
    .line 639
    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 640
    .line 641
    const/4 v10, 0x1

    .line 642
    new-array v11, v10, [Ljava/lang/Object;

    .line 643
    .line 644
    const/4 v10, 0x0

    .line 645
    aput-object v2, v11, v10

    .line 646
    .line 647
    const-string v10, "https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/%s/settings"

    .line 648
    .line 649
    invoke-static {v4, v10, v11}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 650
    .line 651
    .line 652
    move-result-object v10

    .line 653
    new-instance v11, Lr8/b;

    .line 654
    .line 655
    invoke-direct {v11, v10, v6}, Lr8/b;-><init>(Ljava/lang/String;Leb/y;)V

    .line 656
    .line 657
    .line 658
    const/4 v6, 0x2

    .line 659
    new-array v6, v6, [Ljava/lang/Object;

    .line 660
    .line 661
    sget-object v10, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 662
    .line 663
    sget-object v12, Lj8/a0;->h:Ljava/lang/String;

    .line 664
    .line 665
    const-string v13, ""

    .line 666
    .line 667
    invoke-virtual {v10, v12, v13}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 668
    .line 669
    .line 670
    move-result-object v10

    .line 671
    const/4 v13, 0x0

    .line 672
    aput-object v10, v6, v13

    .line 673
    .line 674
    sget-object v10, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 675
    .line 676
    const-string v13, ""

    .line 677
    .line 678
    invoke-virtual {v10, v12, v13}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 679
    .line 680
    .line 681
    move-result-object v10

    .line 682
    const/4 v13, 0x1

    .line 683
    aput-object v10, v6, v13

    .line 684
    .line 685
    const-string v10, "%s/%s"

    .line 686
    .line 687
    invoke-static {v4, v10, v6}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 688
    .line 689
    .line 690
    move-result-object v18

    .line 691
    sget-object v4, Landroid/os/Build$VERSION;->INCREMENTAL:Ljava/lang/String;

    .line 692
    .line 693
    const-string v6, ""

    .line 694
    .line 695
    invoke-virtual {v4, v12, v6}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 696
    .line 697
    .line 698
    move-result-object v19

    .line 699
    sget-object v4, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    .line 700
    .line 701
    const-string v6, ""

    .line 702
    .line 703
    invoke-virtual {v4, v12, v6}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 704
    .line 705
    .line 706
    move-result-object v20

    .line 707
    const/4 v4, 0x4

    .line 708
    new-array v6, v4, [Ljava/lang/String;

    .line 709
    .line 710
    invoke-static {v3}, Lj8/g;->d(Landroid/content/Context;)Ljava/lang/String;

    .line 711
    .line 712
    .line 713
    move-result-object v10

    .line 714
    const/4 v12, 0x0

    .line 715
    aput-object v10, v6, v12

    .line 716
    .line 717
    const/4 v10, 0x1

    .line 718
    aput-object v2, v6, v10

    .line 719
    .line 720
    const/4 v12, 0x2

    .line 721
    aput-object v23, v6, v12

    .line 722
    .line 723
    const/4 v12, 0x3

    .line 724
    aput-object v24, v6, v12

    .line 725
    .line 726
    new-instance v12, Ljava/util/ArrayList;

    .line 727
    .line 728
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 729
    .line 730
    .line 731
    const/4 v13, 0x0

    .line 732
    :goto_8
    const-string v14, ""

    .line 733
    .line 734
    if-ge v13, v4, :cond_f

    .line 735
    .line 736
    aget-object v4, v6, v13

    .line 737
    .line 738
    if-eqz v4, :cond_e

    .line 739
    .line 740
    const-string v10, "-"

    .line 741
    .line 742
    invoke-virtual {v4, v10, v14}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 743
    .line 744
    .line 745
    move-result-object v4

    .line 746
    sget-object v10, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 747
    .line 748
    invoke-virtual {v4, v10}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 749
    .line 750
    .line 751
    move-result-object v4

    .line 752
    invoke-virtual {v12, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 753
    .line 754
    .line 755
    :cond_e
    add-int/lit8 v13, v13, 0x1

    .line 756
    .line 757
    const/4 v4, 0x4

    .line 758
    const/4 v10, 0x1

    .line 759
    goto :goto_8

    .line 760
    :cond_f
    invoke-static {v12}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 761
    .line 762
    .line 763
    new-instance v4, Ljava/lang/StringBuilder;

    .line 764
    .line 765
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 766
    .line 767
    .line 768
    invoke-virtual {v12}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 769
    .line 770
    .line 771
    move-result-object v6

    .line 772
    :goto_9
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 773
    .line 774
    .line 775
    move-result v10

    .line 776
    if-eqz v10, :cond_10

    .line 777
    .line 778
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 779
    .line 780
    .line 781
    move-result-object v10

    .line 782
    check-cast v10, Ljava/lang/String;

    .line 783
    .line 784
    invoke-virtual {v4, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 785
    .line 786
    .line 787
    goto :goto_9

    .line 788
    :cond_10
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 789
    .line 790
    .line 791
    move-result-object v4

    .line 792
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 793
    .line 794
    .line 795
    move-result v6

    .line 796
    if-lez v6, :cond_11

    .line 797
    .line 798
    invoke-static {v4}, Lj8/g;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 799
    .line 800
    .line 801
    move-result-object v4

    .line 802
    goto :goto_a

    .line 803
    :cond_11
    const/4 v4, 0x0

    .line 804
    :goto_a
    move-object/from16 v22, v4

    .line 805
    .line 806
    if-eqz v7, :cond_12

    .line 807
    .line 808
    const/4 v10, 0x4

    .line 809
    goto :goto_b

    .line 810
    :cond_12
    const/4 v10, 0x1

    .line 811
    :goto_b
    invoke-static {v10}, Lf;->e(I)I

    .line 812
    .line 813
    .line 814
    move-result v25

    .line 815
    new-instance v4, Lr8/i;

    .line 816
    .line 817
    move-object/from16 v16, v4

    .line 818
    .line 819
    move-object/from16 v17, v2

    .line 820
    .line 821
    invoke-direct/range {v16 .. v25}, Lr8/i;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj8/a0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 822
    .line 823
    .line 824
    new-instance v2, Lr8/f;

    .line 825
    .line 826
    const/4 v6, 0x3

    .line 827
    const/4 v7, 0x2

    .line 828
    move-object v12, v2

    .line 829
    move-object v13, v3

    .line 830
    move-object v3, v14

    .line 831
    move-object v14, v4

    .line 832
    const/4 v4, 0x1

    .line 833
    move-object/from16 v16, v8

    .line 834
    .line 835
    move-object/from16 v17, v9

    .line 836
    .line 837
    move-object/from16 v18, v11

    .line 838
    .line 839
    move-object/from16 v19, v26

    .line 840
    .line 841
    invoke-direct/range {v12 .. v19}, Lr8/f;-><init>(Landroid/content/Context;Lr8/i;Lnc/g0;Lg/s;Ld2/h0;Lr8/b;Lj8/w;)V

    .line 842
    .line 843
    .line 844
    iget-object v8, v2, Lr8/f;->a:Landroid/content/Context;

    .line 845
    .line 846
    const-string v9, "com.google.firebase.crashlytics"

    .line 847
    .line 848
    const/4 v10, 0x0

    .line 849
    invoke-virtual {v8, v9, v10}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 850
    .line 851
    .line 852
    move-result-object v8

    .line 853
    const-string v9, "existing_instance_identifier"

    .line 854
    .line 855
    invoke-interface {v8, v9, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 856
    .line 857
    .line 858
    move-result-object v3

    .line 859
    iget-object v8, v2, Lr8/f;->b:Lr8/i;

    .line 860
    .line 861
    iget-object v8, v8, Lr8/i;->f:Ljava/lang/String;

    .line 862
    .line 863
    invoke-virtual {v3, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 864
    .line 865
    .line 866
    move-result v3

    .line 867
    xor-int/2addr v3, v4

    .line 868
    if-nez v3, :cond_13

    .line 869
    .line 870
    invoke-virtual {v2, v4}, Lr8/f;->a(I)Lr8/c;

    .line 871
    .line 872
    .line 873
    move-result-object v3

    .line 874
    if-eqz v3, :cond_13

    .line 875
    .line 876
    iget-object v6, v2, Lr8/f;->h:Ljava/util/concurrent/atomic/AtomicReference;

    .line 877
    .line 878
    invoke-virtual {v6, v3}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 879
    .line 880
    .line 881
    iget-object v6, v2, Lr8/f;->i:Ljava/util/concurrent/atomic/AtomicReference;

    .line 882
    .line 883
    invoke-virtual {v6}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 884
    .line 885
    .line 886
    move-result-object v6

    .line 887
    check-cast v6, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 888
    .line 889
    invoke-virtual {v6, v3}, Lcom/google/android/gms/tasks/TaskCompletionSource;->trySetResult(Ljava/lang/Object;)Z

    .line 890
    .line 891
    .line 892
    const/4 v3, 0x0

    .line 893
    invoke-static {v3}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    .line 894
    .line 895
    .line 896
    move-result-object v3

    .line 897
    goto :goto_c

    .line 898
    :cond_13
    invoke-virtual {v2, v6}, Lr8/f;->a(I)Lr8/c;

    .line 899
    .line 900
    .line 901
    move-result-object v3

    .line 902
    if-eqz v3, :cond_14

    .line 903
    .line 904
    iget-object v6, v2, Lr8/f;->h:Ljava/util/concurrent/atomic/AtomicReference;

    .line 905
    .line 906
    invoke-virtual {v6, v3}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 907
    .line 908
    .line 909
    iget-object v6, v2, Lr8/f;->i:Ljava/util/concurrent/atomic/AtomicReference;

    .line 910
    .line 911
    invoke-virtual {v6}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 912
    .line 913
    .line 914
    move-result-object v6

    .line 915
    check-cast v6, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 916
    .line 917
    invoke-virtual {v6, v3}, Lcom/google/android/gms/tasks/TaskCompletionSource;->trySetResult(Ljava/lang/Object;)Z

    .line 918
    .line 919
    .line 920
    :cond_14
    iget-object v3, v2, Lr8/f;->g:Lj8/w;

    .line 921
    .line 922
    iget-object v6, v3, Lj8/w;->h:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 923
    .line 924
    invoke-virtual {v6}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    .line 925
    .line 926
    .line 927
    move-result-object v6

    .line 928
    iget-object v8, v3, Lj8/w;->c:Ljava/lang/Object;

    .line 929
    .line 930
    monitor-enter v8

    .line 931
    :try_start_1
    iget-object v3, v3, Lj8/w;->d:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 932
    .line 933
    invoke-virtual {v3}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    .line 934
    .line 935
    .line 936
    move-result-object v3

    .line 937
    monitor-exit v8
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 938
    invoke-static {v6, v3}, Lk8/a;->a(Lcom/google/android/gms/tasks/Task;Lcom/google/android/gms/tasks/Task;)Lcom/google/android/gms/tasks/Task;

    .line 939
    .line 940
    .line 941
    move-result-object v3

    .line 942
    move-object/from16 v6, p1

    .line 943
    .line 944
    iget-object v8, v6, Lk8/i;->a:Lk8/b;

    .line 945
    .line 946
    new-instance v9, Lr8/e;

    .line 947
    .line 948
    invoke-direct {v9, v2, v6}, Lr8/e;-><init>(Lr8/f;Lk8/i;)V

    .line 949
    .line 950
    .line 951
    invoke-virtual {v3, v8, v9}, Lcom/google/android/gms/tasks/Task;->onSuccessTask(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/SuccessContinuation;)Lcom/google/android/gms/tasks/Task;

    .line 952
    .line 953
    .line 954
    move-result-object v3

    .line 955
    :goto_c
    new-instance v6, Lr3/j;

    .line 956
    .line 957
    const/16 v8, 0xf

    .line 958
    .line 959
    invoke-direct {v6, v8}, Lr3/j;-><init>(I)V

    .line 960
    .line 961
    .line 962
    invoke-virtual {v3, v0, v6}, Lcom/google/android/gms/tasks/Task;->addOnFailureListener(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/OnFailureListener;)Lcom/google/android/gms/tasks/Task;

    .line 963
    .line 964
    .line 965
    iget-object v0, v1, Lj8/s;->a:Landroid/content/Context;

    .line 966
    .line 967
    if-eqz v0, :cond_16

    .line 968
    .line 969
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 970
    .line 971
    .line 972
    move-result-object v3

    .line 973
    if-eqz v3, :cond_16

    .line 974
    .line 975
    const-string v6, "com.crashlytics.RequireBuildId"

    .line 976
    .line 977
    const-string v8, "bool"

    .line 978
    .line 979
    invoke-static {v0, v6, v8}, Lj8/g;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I

    .line 980
    .line 981
    .line 982
    move-result v8

    .line 983
    if-lez v8, :cond_15

    .line 984
    .line 985
    invoke-virtual {v3, v8}, Landroid/content/res/Resources;->getBoolean(I)Z

    .line 986
    .line 987
    .line 988
    move-result v0

    .line 989
    :goto_d
    move v15, v0

    .line 990
    goto :goto_e

    .line 991
    :cond_15
    const-string v3, "string"

    .line 992
    .line 993
    invoke-static {v0, v6, v3}, Lj8/g;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I

    .line 994
    .line 995
    .line 996
    move-result v3

    .line 997
    if-lez v3, :cond_16

    .line 998
    .line 999
    invoke-virtual {v0, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 1000
    .line 1001
    .line 1002
    move-result-object v0

    .line 1003
    invoke-static {v0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 1004
    .line 1005
    .line 1006
    move-result v0

    .line 1007
    goto :goto_d

    .line 1008
    :cond_16
    move v15, v4

    .line 1009
    :goto_e
    move-object/from16 v0, v43

    .line 1010
    .line 1011
    iget-object v3, v0, Lj8/a;->b:Ljava/lang/String;

    .line 1012
    .line 1013
    const-string v6, "The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app\'s build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin"

    .line 1014
    .line 1015
    if-nez v15, :cond_17

    .line 1016
    .line 1017
    invoke-static {v5, v7}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 1018
    .line 1019
    .line 1020
    move-result v3

    .line 1021
    if-eqz v3, :cond_18

    .line 1022
    .line 1023
    const-string v3, "Configured not to require a build ID."

    .line 1024
    .line 1025
    const/4 v7, 0x0

    .line 1026
    invoke-static {v5, v3, v7}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 1027
    .line 1028
    .line 1029
    goto :goto_f

    .line 1030
    :cond_17
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1031
    .line 1032
    .line 1033
    move-result v3

    .line 1034
    if-nez v3, :cond_19

    .line 1035
    .line 1036
    :cond_18
    :goto_f
    move v15, v4

    .line 1037
    goto :goto_10

    .line 1038
    :cond_19
    const-string v3, "."

    .line 1039
    .line 1040
    invoke-static {v5, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1041
    .line 1042
    .line 1043
    const-string v7, ".     |  | "

    .line 1044
    .line 1045
    invoke-static {v5, v7}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1046
    .line 1047
    .line 1048
    const-string v7, ".     |  |"

    .line 1049
    .line 1050
    invoke-static {v5, v7}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1051
    .line 1052
    .line 1053
    invoke-static {v5, v7}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1054
    .line 1055
    .line 1056
    const-string v8, ".   \\ |  | /"

    .line 1057
    .line 1058
    invoke-static {v5, v8}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1059
    .line 1060
    .line 1061
    const-string v8, ".    \\    /"

    .line 1062
    .line 1063
    invoke-static {v5, v8}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1064
    .line 1065
    .line 1066
    const-string v8, ".     \\  /"

    .line 1067
    .line 1068
    invoke-static {v5, v8}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1069
    .line 1070
    .line 1071
    const-string v8, ".      \\/"

    .line 1072
    .line 1073
    invoke-static {v5, v8}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1074
    .line 1075
    .line 1076
    invoke-static {v5, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1077
    .line 1078
    .line 1079
    invoke-static {v5, v6}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1080
    .line 1081
    .line 1082
    invoke-static {v5, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1083
    .line 1084
    .line 1085
    const-string v8, ".      /\\"

    .line 1086
    .line 1087
    invoke-static {v5, v8}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1088
    .line 1089
    .line 1090
    const-string v8, ".     /  \\"

    .line 1091
    .line 1092
    invoke-static {v5, v8}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1093
    .line 1094
    .line 1095
    const-string v8, ".    /    \\"

    .line 1096
    .line 1097
    invoke-static {v5, v8}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1098
    .line 1099
    .line 1100
    const-string v8, ".   / |  | \\"

    .line 1101
    .line 1102
    invoke-static {v5, v8}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1103
    .line 1104
    .line 1105
    invoke-static {v5, v7}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1106
    .line 1107
    .line 1108
    invoke-static {v5, v7}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1109
    .line 1110
    .line 1111
    invoke-static {v5, v7}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1112
    .line 1113
    .line 1114
    invoke-static {v5, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1115
    .line 1116
    .line 1117
    const/4 v15, 0x0

    .line 1118
    :goto_10
    if-eqz v15, :cond_21

    .line 1119
    .line 1120
    new-instance v3, Lj8/f;

    .line 1121
    .line 1122
    invoke-direct {v3}, Lj8/f;-><init>()V

    .line 1123
    .line 1124
    .line 1125
    iget-object v3, v3, Lj8/f;->a:Ljava/lang/String;

    .line 1126
    .line 1127
    :try_start_2
    new-instance v6, Lr4/c;

    .line 1128
    .line 1129
    const-string v7, "crash_marker"

    .line 1130
    .line 1131
    iget-object v8, v1, Lj8/s;->j:Lp8/e;

    .line 1132
    .line 1133
    const/4 v9, 0x4

    .line 1134
    invoke-direct {v6, v9, v7, v8}, Lr4/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 1135
    .line 1136
    .line 1137
    iput-object v6, v1, Lj8/s;->f:Lr4/c;

    .line 1138
    .line 1139
    new-instance v6, Lr4/c;

    .line 1140
    .line 1141
    const-string v7, "initialization_marker"

    .line 1142
    .line 1143
    invoke-direct {v6, v9, v7, v8}, Lr4/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 1144
    .line 1145
    .line 1146
    iput-object v6, v1, Lj8/s;->e:Lr4/c;

    .line 1147
    .line 1148
    new-instance v6, Ll8/n;

    .line 1149
    .line 1150
    iget-object v7, v1, Lj8/s;->p:Lk8/i;

    .line 1151
    .line 1152
    invoke-direct {v6, v3, v8, v7}, Ll8/n;-><init>(Ljava/lang/String;Lp8/e;Lk8/i;)V

    .line 1153
    .line 1154
    .line 1155
    new-instance v7, Ll8/f;

    .line 1156
    .line 1157
    iget-object v8, v1, Lj8/s;->j:Lp8/e;

    .line 1158
    .line 1159
    invoke-direct {v7, v8}, Ll8/f;-><init>(Lp8/e;)V

    .line 1160
    .line 1161
    .line 1162
    new-instance v8, Ls8/a;

    .line 1163
    .line 1164
    new-array v4, v4, [Ls8/c;

    .line 1165
    .line 1166
    new-instance v9, Lb/a0;

    .line 1167
    .line 1168
    invoke-direct {v9}, Lb/a0;-><init>()V

    .line 1169
    .line 1170
    .line 1171
    const/4 v10, 0x0

    .line 1172
    aput-object v9, v4, v10

    .line 1173
    .line 1174
    invoke-direct {v8, v4}, Ls8/a;-><init>([Ls8/c;)V

    .line 1175
    .line 1176
    .line 1177
    iget-object v4, v1, Lj8/s;->o:Lg8/f;

    .line 1178
    .line 1179
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1180
    .line 1181
    .line 1182
    new-instance v9, Lg/s;

    .line 1183
    .line 1184
    invoke-direct {v9, v6}, Lg/s;-><init>(Ll8/n;)V

    .line 1185
    .line 1186
    .line 1187
    iget-object v4, v4, Lg8/f;->a:Lt9/a;

    .line 1188
    .line 1189
    new-instance v10, Lio/flutter/plugins/firebase/auth/g;

    .line 1190
    .line 1191
    const/16 v11, 0xe

    .line 1192
    .line 1193
    invoke-direct {v10, v9, v11}, Lio/flutter/plugins/firebase/auth/g;-><init>(Ljava/lang/Object;I)V

    .line 1194
    .line 1195
    .line 1196
    invoke-interface {v4, v10}, Lt9/a;->a(Lt9/a$a;)V

    .line 1197
    .line 1198
    .line 1199
    iget-object v4, v1, Lj8/s;->a:Landroid/content/Context;

    .line 1200
    .line 1201
    iget-object v9, v1, Lj8/s;->i:Lj8/a0;

    .line 1202
    .line 1203
    iget-object v10, v1, Lj8/s;->j:Lp8/e;

    .line 1204
    .line 1205
    iget-object v11, v1, Lj8/s;->c:Ll/l;

    .line 1206
    .line 1207
    iget-object v12, v1, Lj8/s;->m:Lj8/j;

    .line 1208
    .line 1209
    iget-object v13, v1, Lj8/s;->p:Lk8/i;

    .line 1210
    .line 1211
    move-object/from16 v29, v4

    .line 1212
    .line 1213
    move-object/from16 v30, v9

    .line 1214
    .line 1215
    move-object/from16 v31, v10

    .line 1216
    .line 1217
    move-object/from16 v32, v0

    .line 1218
    .line 1219
    move-object/from16 v33, v7

    .line 1220
    .line 1221
    move-object/from16 v34, v6

    .line 1222
    .line 1223
    move-object/from16 v35, v8

    .line 1224
    .line 1225
    move-object/from16 v36, v2

    .line 1226
    .line 1227
    move-object/from16 v37, v11

    .line 1228
    .line 1229
    move-object/from16 v38, v12

    .line 1230
    .line 1231
    move-object/from16 v39, v13

    .line 1232
    .line 1233
    invoke-static/range {v29 .. v39}, Lj8/d0;->c(Landroid/content/Context;Lj8/a0;Lp8/e;Lj8/a;Ll8/f;Ll8/n;Ls8/a;Lr8/f;Ll/l;Lj8/j;Lk8/i;)Lj8/d0;

    .line 1234
    .line 1235
    .line 1236
    move-result-object v38

    .line 1237
    new-instance v4, Lj8/n;

    .line 1238
    .line 1239
    iget-object v8, v1, Lj8/s;->a:Landroid/content/Context;

    .line 1240
    .line 1241
    iget-object v9, v1, Lj8/s;->i:Lj8/a0;

    .line 1242
    .line 1243
    iget-object v10, v1, Lj8/s;->b:Lj8/w;

    .line 1244
    .line 1245
    iget-object v11, v1, Lj8/s;->j:Lp8/e;

    .line 1246
    .line 1247
    iget-object v12, v1, Lj8/s;->f:Lr4/c;

    .line 1248
    .line 1249
    iget-object v13, v1, Lj8/s;->n:Lg8/a;

    .line 1250
    .line 1251
    iget-object v14, v1, Lj8/s;->l:Lh8/a;

    .line 1252
    .line 1253
    iget-object v15, v1, Lj8/s;->m:Lj8/j;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_3

    .line 1254
    .line 1255
    move-object/from16 v17, v5

    .line 1256
    .line 1257
    :try_start_3
    iget-object v5, v1, Lj8/s;->p:Lk8/i;

    .line 1258
    .line 1259
    move-object/from16 v29, v4

    .line 1260
    .line 1261
    move-object/from16 v30, v8

    .line 1262
    .line 1263
    move-object/from16 v31, v9

    .line 1264
    .line 1265
    move-object/from16 v32, v10

    .line 1266
    .line 1267
    move-object/from16 v33, v11

    .line 1268
    .line 1269
    move-object/from16 v34, v12

    .line 1270
    .line 1271
    move-object/from16 v35, v0

    .line 1272
    .line 1273
    move-object/from16 v36, v6

    .line 1274
    .line 1275
    move-object/from16 v37, v7

    .line 1276
    .line 1277
    move-object/from16 v39, v13

    .line 1278
    .line 1279
    move-object/from16 v40, v14

    .line 1280
    .line 1281
    move-object/from16 v41, v15

    .line 1282
    .line 1283
    move-object/from16 v42, v5

    .line 1284
    .line 1285
    invoke-direct/range {v29 .. v42}, Lj8/n;-><init>(Landroid/content/Context;Lj8/a0;Lj8/w;Lp8/e;Lr4/c;Lj8/a;Ll8/n;Ll8/f;Lj8/d0;Lg8/a;Lh8/a;Lj8/j;Lk8/i;)V

    .line 1286
    .line 1287
    .line 1288
    iput-object v4, v1, Lj8/s;->h:Lj8/n;

    .line 1289
    .line 1290
    iget-object v0, v1, Lj8/s;->e:Lr4/c;

    .line 1291
    .line 1292
    iget-object v4, v0, Lr4/c;->c:Ljava/lang/Object;

    .line 1293
    .line 1294
    check-cast v4, Lp8/e;

    .line 1295
    .line 1296
    iget-object v0, v0, Lr4/c;->b:Ljava/lang/Object;

    .line 1297
    .line 1298
    check-cast v0, Ljava/lang/String;

    .line 1299
    .line 1300
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1301
    .line 1302
    .line 1303
    new-instance v5, Ljava/io/File;

    .line 1304
    .line 1305
    iget-object v4, v4, Lp8/e;->c:Ljava/io/File;

    .line 1306
    .line 1307
    invoke-direct {v5, v4, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 1308
    .line 1309
    .line 1310
    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    .line 1311
    .line 1312
    .line 1313
    move-result v0

    .line 1314
    iget-object v4, v1, Lj8/s;->p:Lk8/i;

    .line 1315
    .line 1316
    iget-object v4, v4, Lk8/i;->a:Lk8/b;

    .line 1317
    .line 1318
    iget-object v4, v4, Lk8/b;->a:Ljava/util/concurrent/ExecutorService;

    .line 1319
    .line 1320
    new-instance v5, Ly2/h;

    .line 1321
    .line 1322
    const/4 v6, 0x1

    .line 1323
    invoke-direct {v5, v1, v6}, Ly2/h;-><init>(Ljava/lang/Object;I)V

    .line 1324
    .line 1325
    .line 1326
    invoke-interface {v4, v5}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    .line 1327
    .line 1328
    .line 1329
    move-result-object v4
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    .line 1330
    const-wide/16 v7, 0x3

    .line 1331
    .line 1332
    :try_start_4
    sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 1333
    .line 1334
    invoke-interface {v4, v7, v8, v5}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    .line 1335
    .line 1336
    .line 1337
    move-result-object v4

    .line 1338
    check-cast v4, Ljava/lang/Boolean;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 1339
    .line 1340
    :try_start_5
    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 1341
    .line 1342
    invoke-virtual {v5, v4}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 1343
    .line 1344
    .line 1345
    move-result v4

    .line 1346
    goto :goto_11

    .line 1347
    :catch_0
    const/4 v4, 0x0

    .line 1348
    :goto_11
    iput-boolean v4, v1, Lj8/s;->g:Z

    .line 1349
    .line 1350
    iget-object v4, v1, Lj8/s;->h:Lj8/n;

    .line 1351
    .line 1352
    invoke-static {}, Ljava/lang/Thread;->getDefaultUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    .line 1353
    .line 1354
    .line 1355
    move-result-object v5

    .line 1356
    iput-object v2, v4, Lj8/n;->o:Lr8/h;

    .line 1357
    .line 1358
    iget-object v7, v4, Lj8/n;->e:Lk8/i;

    .line 1359
    .line 1360
    iget-object v7, v7, Lk8/i;->a:Lk8/b;

    .line 1361
    .line 1362
    new-instance v8, Lw/g;

    .line 1363
    .line 1364
    const/16 v9, 0x10

    .line 1365
    .line 1366
    invoke-direct {v8, v9, v4, v3}, Lw/g;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 1367
    .line 1368
    .line 1369
    invoke-virtual {v7, v8}, Lk8/b;->a(Ljava/lang/Runnable;)Lcom/google/android/gms/tasks/Task;

    .line 1370
    .line 1371
    .line 1372
    new-instance v3, Lj8/l;

    .line 1373
    .line 1374
    invoke-direct {v3, v4}, Lj8/l;-><init>(Lj8/n;)V

    .line 1375
    .line 1376
    .line 1377
    new-instance v7, Lj8/v;

    .line 1378
    .line 1379
    iget-object v8, v4, Lj8/n;->j:Lg8/a;

    .line 1380
    .line 1381
    invoke-direct {v7, v3, v2, v5, v8}, Lj8/v;-><init>(Lj8/l;Lr8/f;Ljava/lang/Thread$UncaughtExceptionHandler;Lg8/a;)V

    .line 1382
    .line 1383
    .line 1384
    iput-object v7, v4, Lj8/n;->n:Lj8/v;

    .line 1385
    .line 1386
    invoke-static {v7}, Ljava/lang/Thread;->setDefaultUncaughtExceptionHandler(Ljava/lang/Thread$UncaughtExceptionHandler;)V

    .line 1387
    .line 1388
    .line 1389
    if-eqz v0, :cond_1e

    .line 1390
    .line 1391
    iget-object v0, v1, Lj8/s;->a:Landroid/content/Context;

    .line 1392
    .line 1393
    const-string v3, "android.permission.ACCESS_NETWORK_STATE"

    .line 1394
    .line 1395
    invoke-virtual {v0, v3}, Landroid/content/Context;->checkCallingOrSelfPermission(Ljava/lang/String;)I

    .line 1396
    .line 1397
    .line 1398
    move-result v3

    .line 1399
    if-nez v3, :cond_1a

    .line 1400
    .line 1401
    move v3, v6

    .line 1402
    goto :goto_12

    .line 1403
    :cond_1a
    const/4 v3, 0x0

    .line 1404
    :goto_12
    if-eqz v3, :cond_1c

    .line 1405
    .line 1406
    const-string v3, "connectivity"

    .line 1407
    .line 1408
    invoke-virtual {v0, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 1409
    .line 1410
    .line 1411
    move-result-object v0

    .line 1412
    check-cast v0, Landroid/net/ConnectivityManager;

    .line 1413
    .line 1414
    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    .line 1415
    .line 1416
    .line 1417
    move-result-object v0

    .line 1418
    if-eqz v0, :cond_1b

    .line 1419
    .line 1420
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnectedOrConnecting()Z

    .line 1421
    .line 1422
    .line 1423
    move-result v0

    .line 1424
    if-eqz v0, :cond_1b

    .line 1425
    .line 1426
    goto :goto_13

    .line 1427
    :cond_1b
    const/4 v0, 0x0

    .line 1428
    goto :goto_14

    .line 1429
    :cond_1c
    :goto_13
    move v0, v6

    .line 1430
    :goto_14
    if-eqz v0, :cond_1e

    .line 1431
    .line 1432
    const-string v0, "Crashlytics did not finish previous background initialization. Initializing synchronously."
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2

    .line 1433
    .line 1434
    const/4 v3, 0x3

    .line 1435
    move-object/from16 v4, v17

    .line 1436
    .line 1437
    :try_start_6
    invoke-static {v4, v3}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 1438
    .line 1439
    .line 1440
    move-result v3

    .line 1441
    if-eqz v3, :cond_1d

    .line 1442
    .line 1443
    const/4 v3, 0x0

    .line 1444
    invoke-static {v4, v0, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 1445
    .line 1446
    .line 1447
    :cond_1d
    invoke-virtual {v1, v2}, Lj8/s;->b(Lr8/f;)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1

    .line 1448
    .line 1449
    .line 1450
    goto :goto_16

    .line 1451
    :catch_1
    move-exception v0

    .line 1452
    goto :goto_15

    .line 1453
    :cond_1e
    move-object/from16 v4, v17

    .line 1454
    .line 1455
    const/4 v0, 0x3

    .line 1456
    invoke-static {v4, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 1457
    .line 1458
    .line 1459
    move-result v0

    .line 1460
    if-eqz v0, :cond_1f

    .line 1461
    .line 1462
    const-string v0, "Successfully configured exception handler."

    .line 1463
    .line 1464
    const/4 v3, 0x0

    .line 1465
    invoke-static {v4, v0, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 1466
    .line 1467
    .line 1468
    goto :goto_17

    .line 1469
    :catch_2
    move-exception v0

    .line 1470
    move-object/from16 v4, v17

    .line 1471
    .line 1472
    goto :goto_15

    .line 1473
    :catch_3
    move-exception v0

    .line 1474
    move-object v4, v5

    .line 1475
    :goto_15
    const-string v3, "Crashlytics was not started due to an exception during initialization"

    .line 1476
    .line 1477
    invoke-static {v4, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 1478
    .line 1479
    .line 1480
    const/4 v0, 0x0

    .line 1481
    iput-object v0, v1, Lj8/s;->h:Lj8/n;

    .line 1482
    .line 1483
    :goto_16
    const/4 v6, 0x0

    .line 1484
    :cond_1f
    :goto_17
    if-eqz v6, :cond_20

    .line 1485
    .line 1486
    iget-object v0, v1, Lj8/s;->p:Lk8/i;

    .line 1487
    .line 1488
    iget-object v0, v0, Lk8/i;->a:Lk8/b;

    .line 1489
    .line 1490
    new-instance v3, Lg/q;

    .line 1491
    .line 1492
    const/16 v5, 0xd

    .line 1493
    .line 1494
    invoke-direct {v3, v5, v1, v2}, Lg/q;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 1495
    .line 1496
    .line 1497
    invoke-virtual {v0, v3}, Lk8/b;->a(Ljava/lang/Runnable;)Lcom/google/android/gms/tasks/Task;

    .line 1498
    .line 1499
    .line 1500
    :cond_20
    new-instance v0, Lf8/c;

    .line 1501
    .line 1502
    invoke-direct {v0, v1}, Lf8/c;-><init>(Lj8/s;)V

    .line 1503
    .line 1504
    .line 1505
    goto :goto_18

    .line 1506
    :cond_21
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 1507
    .line 1508
    invoke-direct {v0, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1509
    .line 1510
    .line 1511
    throw v0

    .line 1512
    :catchall_0
    move-exception v0

    .line 1513
    :try_start_7
    monitor-exit v8
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 1514
    throw v0

    .line 1515
    :catch_4
    move-exception v0

    .line 1516
    move-object v4, v5

    .line 1517
    const-string v1, "Error retrieving app package info."

    .line 1518
    .line 1519
    invoke-static {v4, v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 1520
    .line 1521
    .line 1522
    const/4 v0, 0x0

    .line 1523
    :goto_18
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1524
    .line 1525
    .line 1526
    move-result-wide v1

    .line 1527
    sub-long v1, v1, v27

    .line 1528
    .line 1529
    const-wide/16 v5, 0x10

    .line 1530
    .line 1531
    cmp-long v3, v1, v5

    .line 1532
    .line 1533
    if-lez v3, :cond_22

    .line 1534
    .line 1535
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1536
    .line 1537
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 1538
    .line 1539
    .line 1540
    const-string v5, "Initializing Crashlytics blocked main for "

    .line 1541
    .line 1542
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1543
    .line 1544
    .line 1545
    invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 1546
    .line 1547
    .line 1548
    const-string v1, " ms"

    .line 1549
    .line 1550
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1551
    .line 1552
    .line 1553
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1554
    .line 1555
    .line 1556
    move-result-object v1

    .line 1557
    const/4 v2, 0x3

    .line 1558
    invoke-static {v4, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 1559
    .line 1560
    .line 1561
    move-result v2

    .line 1562
    if-eqz v2, :cond_22

    .line 1563
    .line 1564
    const/4 v2, 0x0

    .line 1565
    invoke-static {v4, v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 1566
    .line 1567
    .line 1568
    :cond_22
    return-object v0

    .line 1569
    :pswitch_1
    iget-object v0, v1, Ld;->b:Ljava/lang/Object;

    .line 1570
    .line 1571
    return-object v0

    .line 1572
    :goto_19
    iget-object v3, v1, Ld;->b:Ljava/lang/Object;

    .line 1573
    .line 1574
    check-cast v3, Ld8/t;

    .line 1575
    .line 1576
    new-instance v10, Lq9/c;

    .line 1577
    .line 1578
    const-class v4, Landroid/content/Context;

    .line 1579
    .line 1580
    invoke-virtual {v0, v4}, Ld8/u;->get(Ljava/lang/Class;)Ljava/lang/Object;

    .line 1581
    .line 1582
    .line 1583
    move-result-object v4

    .line 1584
    move-object v5, v4

    .line 1585
    check-cast v5, Landroid/content/Context;

    .line 1586
    .line 1587
    invoke-virtual {v0, v2}, Ld8/u;->get(Ljava/lang/Class;)Ljava/lang/Object;

    .line 1588
    .line 1589
    .line 1590
    move-result-object v2

    .line 1591
    check-cast v2, Lu7/f;

    .line 1592
    .line 1593
    invoke-virtual {v2}, Lu7/f;->g()Ljava/lang/String;

    .line 1594
    .line 1595
    .line 1596
    move-result-object v6

    .line 1597
    const-class v2, Lq9/d;

    .line 1598
    .line 1599
    invoke-virtual {v0, v2}, Ld8/u;->g(Ljava/lang/Class;)Ljava/util/Set;

    .line 1600
    .line 1601
    .line 1602
    move-result-object v7

    .line 1603
    const-class v2, Lca/f;

    .line 1604
    .line 1605
    invoke-virtual {v0, v2}, Ld8/u;->b(Ljava/lang/Class;)Lt9/b;

    .line 1606
    .line 1607
    .line 1608
    move-result-object v8

    .line 1609
    invoke-virtual {v0, v3}, Ld8/u;->e(Ld8/t;)Ljava/lang/Object;

    .line 1610
    .line 1611
    .line 1612
    move-result-object v0

    .line 1613
    move-object v9, v0

    .line 1614
    check-cast v9, Ljava/util/concurrent/Executor;

    .line 1615
    .line 1616
    move-object v4, v10

    .line 1617
    invoke-direct/range {v4 .. v9}, Lq9/c;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/util/Set;Lt9/b;Ljava/util/concurrent/Executor;)V

    .line 1618
    .line 1619
    .line 1620
    return-object v10

    .line 1621
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    .line 1770
    .line 1771
    .line 1772
    .line 1773
    .line 1774
    .line 1775
    .line 1776
    .line 1777
    .line 1778
    .line 1779
    .line 1780
    .line 1781
    .line 1782
    .line 1783
    .line 1784
    .line 1785
    .line 1786
    .line 1787
    .line 1788
    .line 1789
    .line 1790
    .line 1791
    .line 1792
    .line 1793
    .line 1794
    .line 1795
    .line 1796
    .line 1797
    .line 1798
    .line 1799
    .line 1800
    .line 1801
    .line 1802
    .line 1803
    .line 1804
    .line 1805
    .line 1806
    .line 1807
    .line 1808
    .line 1809
    .line 1810
    .line 1811
    .line 1812
    .line 1813
    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    .line 1868
    .line 1869
    .line 1870
    .line 1871
    .line 1872
    .line 1873
    .line 1874
    .line 1875
    .line 1876
    .line 1877
    .line 1878
    .line 1879
    .line 1880
    .line 1881
    .line 1882
    .line 1883
    .line 1884
    .line 1885
    .line 1886
    .line 1887
    .line 1888
    .line 1889
    .line 1890
    .line 1891
    .line 1892
    .line 1893
    .line 1894
    .line 1895
    .line 1896
    .line 1897
    .line 1898
    .line 1899
    .line 1900
    .line 1901
    .line 1902
    .line 1903
    .line 1904
    .line 1905
    .line 1906
    .line 1907
    .line 1908
    .line 1909
    .line 1910
    .line 1911
    .line 1912
    .line 1913
    .line 1914
    .line 1915
    .line 1916
    .line 1917
    .line 1918
    .line 1919
    .line 1920
    .line 1921
    .line 1922
    .line 1923
    .line 1924
    .line 1925
    .line 1926
    .line 1927
    .line 1928
    .line 1929
    .line 1930
    .line 1931
    .line 1932
    .line 1933
    .line 1934
    .line 1935
    .line 1936
    .line 1937
    .line 1938
    .line 1939
    .line 1940
    .line 1941
    .line 1942
    .line 1943
    .line 1944
    .line 1945
    .line 1946
    .line 1947
    .line 1948
    .line 1949
    .line 1950
    .line 1951
    .line 1952
    .line 1953
    .line 1954
    .line 1955
    .line 1956
    .line 1957
    .line 1958
    .line 1959
    .line 1960
    .line 1961
    .line 1962
    .line 1963
    .line 1964
    .line 1965
    .line 1966
    .line 1967
    .line 1968
    .line 1969
    .line 1970
    .line 1971
    .line 1972
    .line 1973
    .line 1974
    .line 1975
    .line 1976
    .line 1977
    .line 1978
    .line 1979
    .line 1980
    .line 1981
    .line 1982
    .line 1983
    .line 1984
    .line 1985
    .line 1986
    .line 1987
    .line 1988
    .line 1989
    .line 1990
    .line 1991
    .line 1992
    .line 1993
    .line 1994
    .line 1995
    .line 1996
    .line 1997
    .line 1998
    .line 1999
    .line 2000
    .line 2001
    .line 2002
    .line 2003
    .line 2004
    .line 2005
    .line 2006
    .line 2007
    .line 2008
    .line 2009
    .line 2010
    .line 2011
    .line 2012
    .line 2013
    .line 2014
    .line 2015
    .line 2016
    .line 2017
    .line 2018
    .line 2019
    .line 2020
    .line 2021
    .line 2022
    .line 2023
    .line 2024
    .line 2025
    .line 2026
    .line 2027
    .line 2028
    .line 2029
    .line 2030
    .line 2031
    .line 2032
    .line 2033
    .line 2034
    .line 2035
    .line 2036
    .line 2037
    .line 2038
    .line 2039
    .line 2040
    .line 2041
    .line 2042
    .line 2043
    .line 2044
    .line 2045
    .line 2046
    .line 2047
    .line 2048
    .line 2049
    .line 2050
    .line 2051
    .line 2052
    .line 2053
    .line 2054
    .line 2055
    .line 2056
    .line 2057
    .line 2058
    .line 2059
    .line 2060
    .line 2061
    .line 2062
    .line 2063
    .line 2064
    .line 2065
    .line 2066
    .line 2067
    .line 2068
    .line 2069
    .line 2070
    .line 2071
    .line 2072
    .line 2073
    .line 2074
    .line 2075
    .line 2076
    .line 2077
    .line 2078
    .line 2079
    .line 2080
    .line 2081
    .line 2082
    .line 2083
    .line 2084
    .line 2085
    .line 2086
    .line 2087
    .line 2088
    .line 2089
    .line 2090
    .line 2091
    .line 2092
    .line 2093
    .line 2094
    .line 2095
    .line 2096
    .line 2097
    .line 2098
    .line 2099
    .line 2100
    .line 2101
    .line 2102
    .line 2103
    .line 2104
    .line 2105
    .line 2106
    .line 2107
    .line 2108
    .line 2109
    .line 2110
    .line 2111
    .line 2112
    .line 2113
    .line 2114
    .line 2115
    .line 2116
    .line 2117
    .line 2118
    .line 2119
    .line 2120
    .line 2121
    .line 2122
    .line 2123
    .line 2124
    .line 2125
    .line 2126
    .line 2127
    .line 2128
    .line 2129
    .line 2130
    .line 2131
    .line 2132
    .line 2133
    .line 2134
    .line 2135
    .line 2136
    .line 2137
    .line 2138
    .line 2139
    .line 2140
    .line 2141
    .line 2142
    .line 2143
    .line 2144
    .line 2145
    .line 2146
    .line 2147
    .line 2148
    .line 2149
    .line 2150
    .line 2151
    .line 2152
    .line 2153
    .line 2154
    .line 2155
    .line 2156
    .line 2157
    .line 2158
    .line 2159
    .line 2160
    .line 2161
    .line 2162
    .line 2163
    .line 2164
    .line 2165
    .line 2166
    .line 2167
    .line 2168
    .line 2169
    .line 2170
    .line 2171
    .line 2172
    .line 2173
    .line 2174
    .line 2175
    .line 2176
    .line 2177
    .line 2178
    .line 2179
    .line 2180
    .line 2181
    .line 2182
    .line 2183
    .line 2184
    .line 2185
    .line 2186
    .line 2187
    .line 2188
    .line 2189
    .line 2190
    .line 2191
    .line 2192
    .line 2193
    .line 2194
    .line 2195
    .line 2196
    .line 2197
    .line 2198
    .line 2199
    .line 2200
    .line 2201
    .line 2202
    .line 2203
    .line 2204
    .line 2205
    .line 2206
    .line 2207
    .line 2208
    .line 2209
    .line 2210
    .line 2211
    .line 2212
    .line 2213
    .line 2214
    .line 2215
    .line 2216
    .line 2217
    .line 2218
    .line 2219
    .line 2220
    .line 2221
    .line 2222
    .line 2223
    .line 2224
    .line 2225
    .line 2226
    .line 2227
    .line 2228
    .line 2229
    .line 2230
    .line 2231
    .line 2232
    .line 2233
    .line 2234
    .line 2235
    .line 2236
    .line 2237
    .line 2238
    .line 2239
    .line 2240
    .line 2241
    .line 2242
    .line 2243
    .line 2244
    .line 2245
    .line 2246
    .line 2247
    .line 2248
    .line 2249
    .line 2250
    .line 2251
    .line 2252
    .line 2253
    .line 2254
    .line 2255
    .line 2256
    .line 2257
    .line 2258
    .line 2259
    .line 2260
    .line 2261
    .line 2262
    .line 2263
    .line 2264
    .line 2265
    .line 2266
    .line 2267
    .line 2268
    .line 2269
    .line 2270
    .line 2271
    .line 2272
    .line 2273
    .line 2274
    .line 2275
    .line 2276
    .line 2277
    .line 2278
    .line 2279
    .line 2280
    .line 2281
    .line 2282
    .line 2283
    .line 2284
    .line 2285
    .line 2286
    .line 2287
    .line 2288
    .line 2289
    .line 2290
    .line 2291
    .line 2292
    .line 2293
    .line 2294
    .line 2295
    .line 2296
    .line 2297
    .line 2298
    .line 2299
    .line 2300
    .line 2301
    .line 2302
    .line 2303
    .line 2304
    .line 2305
    .line 2306
    .line 2307
    .line 2308
    .line 2309
    .line 2310
    .line 2311
    .line 2312
    .line 2313
    .line 2314
    .line 2315
    .line 2316
    .line 2317
    .line 2318
    .line 2319
    .line 2320
    .line 2321
    .line 2322
    .line 2323
    .line 2324
    .line 2325
    .line 2326
    .line 2327
    .line 2328
    .line 2329
    .line 2330
    .line 2331
    .line 2332
    .line 2333
    .line 2334
    .line 2335
    .line 2336
    .line 2337
    .line 2338
    .line 2339
    .line 2340
    .line 2341
    .line 2342
    .line 2343
    .line 2344
    .line 2345
    .line 2346
    .line 2347
    .line 2348
    .line 2349
    .line 2350
    .line 2351
    .line 2352
    .line 2353
    .line 2354
    .line 2355
    .line 2356
    .line 2357
    .line 2358
    .line 2359
    .line 2360
    .line 2361
    .line 2362
    .line 2363
    .line 2364
    .line 2365
    .line 2366
    .line 2367
    .line 2368
    .line 2369
    .line 2370
    .line 2371
    .line 2372
    .line 2373
    .line 2374
    .line 2375
    .line 2376
    .line 2377
    .line 2378
    .line 2379
    .line 2380
    .line 2381
    .line 2382
    .line 2383
    .line 2384
    .line 2385
    .line 2386
    .line 2387
    .line 2388
    .line 2389
    .line 2390
    .line 2391
    .line 2392
    .line 2393
    .line 2394
    .line 2395
    .line 2396
    .line 2397
    .line 2398
    .line 2399
    .line 2400
    .line 2401
    .line 2402
    .line 2403
    .line 2404
    .line 2405
    .line 2406
    .line 2407
    .line 2408
    .line 2409
    .line 2410
    .line 2411
    .line 2412
    .line 2413
    .line 2414
    .line 2415
    .line 2416
    .line 2417
    .line 2418
    .line 2419
    .line 2420
    .line 2421
    .line 2422
    .line 2423
    .line 2424
    .line 2425
    .line 2426
    .line 2427
    .line 2428
    .line 2429
    .line 2430
    .line 2431
    .line 2432
    .line 2433
    .line 2434
    .line 2435
    .line 2436
    .line 2437
    .line 2438
    .line 2439
    .line 2440
    .line 2441
    .line 2442
    .line 2443
    .line 2444
    .line 2445
    .line 2446
    .line 2447
    .line 2448
    .line 2449
    .line 2450
    .line 2451
    .line 2452
    .line 2453
    .line 2454
    .line 2455
    .line 2456
    .line 2457
    .line 2458
    .line 2459
    .line 2460
    .line 2461
    .line 2462
    .line 2463
    .line 2464
    .line 2465
    .line 2466
    .line 2467
    .line 2468
    .line 2469
    .line 2470
    .line 2471
    .line 2472
    .line 2473
    .line 2474
    .line 2475
    .line 2476
    .line 2477
    .line 2478
    .line 2479
    .line 2480
    .line 2481
    .line 2482
    .line 2483
    .line 2484
    .line 2485
    .line 2486
    .line 2487
    .line 2488
    .line 2489
    .line 2490
    .line 2491
    .line 2492
    .line 2493
    .line 2494
    .line 2495
    .line 2496
    .line 2497
    .line 2498
    .line 2499
    .line 2500
    .line 2501
    .line 2502
    .line 2503
    .line 2504
    .line 2505
    .line 2506
    .line 2507
    .line 2508
    .line 2509
    .line 2510
    .line 2511
    .line 2512
    .line 2513
    .line 2514
    .line 2515
    .line 2516
    .line 2517
    .line 2518
    .line 2519
    .line 2520
    .line 2521
    .line 2522
    .line 2523
    .line 2524
    .line 2525
    .line 2526
    .line 2527
    .line 2528
    .line 2529
    .line 2530
    .line 2531
    .line 2532
    .line 2533
    .line 2534
    .line 2535
    .line 2536
    .line 2537
    .line 2538
    .line 2539
    .line 2540
    .line 2541
    .line 2542
    .line 2543
    .line 2544
    .line 2545
    .line 2546
    .line 2547
    .line 2548
    .line 2549
    .line 2550
    .line 2551
    .line 2552
    .line 2553
    .line 2554
    .line 2555
    .line 2556
    .line 2557
    .line 2558
    .line 2559
    .line 2560
    .line 2561
    .line 2562
    .line 2563
    .line 2564
    .line 2565
    .line 2566
    .line 2567
    .line 2568
    .line 2569
    .line 2570
    .line 2571
    .line 2572
    .line 2573
    .line 2574
    .line 2575
    .line 2576
    .line 2577
    .line 2578
    .line 2579
    .line 2580
    .line 2581
    .line 2582
    .line 2583
    .line 2584
    .line 2585
    .line 2586
    .line 2587
    .line 2588
    .line 2589
    .line 2590
    .line 2591
    .line 2592
    .line 2593
    .line 2594
    .line 2595
    .line 2596
    .line 2597
    .line 2598
    .line 2599
    .line 2600
    .line 2601
    .line 2602
    .line 2603
    .line 2604
    .line 2605
    .line 2606
    .line 2607
    .line 2608
    .line 2609
    .line 2610
    .line 2611
    .line 2612
    .line 2613
    .line 2614
    .line 2615
    .line 2616
    .line 2617
    .line 2618
    .line 2619
    .line 2620
    .line 2621
    .line 2622
    .line 2623
    .line 2624
    .line 2625
    .line 2626
    .line 2627
    .line 2628
    .line 2629
    .line 2630
    .line 2631
    .line 2632
    .line 2633
    .line 2634
    .line 2635
    .line 2636
    .line 2637
    .line 2638
    .line 2639
    .line 2640
    .line 2641
    .line 2642
    .line 2643
    .line 2644
    .line 2645
    .line 2646
    .line 2647
    .line 2648
    .line 2649
    .line 2650
    .line 2651
    .line 2652
    .line 2653
    .line 2654
    .line 2655
    .line 2656
    .line 2657
    .line 2658
    .line 2659
    .line 2660
    .line 2661
    .line 2662
    .line 2663
    .line 2664
    .line 2665
    .line 2666
    .line 2667
    .line 2668
    .line 2669
    .line 2670
    .line 2671
    .line 2672
    .line 2673
    .line 2674
    .line 2675
    .line 2676
    .line 2677
    .line 2678
    .line 2679
    .line 2680
    .line 2681
    .line 2682
    .line 2683
    .line 2684
    .line 2685
    .line 2686
    .line 2687
    .line 2688
    .line 2689
    .line 2690
    .line 2691
    .line 2692
    .line 2693
    .line 2694
    .line 2695
    .line 2696
    .line 2697
    .line 2698
    .line 2699
    .line 2700
    .line 2701
    .line 2702
    .line 2703
    .line 2704
    .line 2705
    .line 2706
    .line 2707
    .line 2708
    .line 2709
    .line 2710
    .line 2711
    .line 2712
    .line 2713
    .line 2714
    .line 2715
    .line 2716
    .line 2717
    .line 2718
    .line 2719
    .line 2720
    .line 2721
    .line 2722
    .line 2723
    .line 2724
    .line 2725
    .line 2726
    .line 2727
    .line 2728
    .line 2729
    .line 2730
    .line 2731
    .line 2732
    .line 2733
    .line 2734
    .line 2735
    .line 2736
    .line 2737
    .line 2738
    .line 2739
    .line 2740
    .line 2741
    .line 2742
    .line 2743
    .line 2744
    .line 2745
    .line 2746
    .line 2747
    .line 2748
    .line 2749
    .line 2750
    .line 2751
    .line 2752
    .line 2753
    .line 2754
    .line 2755
    .line 2756
    .line 2757
    .line 2758
    .line 2759
    .line 2760
    .line 2761
    .line 2762
    .line 2763
    .line 2764
    .line 2765
    .line 2766
    .line 2767
    .line 2768
    .line 2769
    .line 2770
    .line 2771
    .line 2772
    .line 2773
    .line 2774
    .line 2775
    .line 2776
    .line 2777
    .line 2778
    .line 2779
    .line 2780
    .line 2781
    .line 2782
    .line 2783
    .line 2784
    .line 2785
    .line 2786
    .line 2787
    .line 2788
    .line 2789
    .line 2790
    .line 2791
    .line 2792
    .line 2793
    .line 2794
    .line 2795
    .line 2796
    .line 2797
    .line 2798
    .line 2799
    .line 2800
    .line 2801
    .line 2802
    .line 2803
    .line 2804
    .line 2805
    .line 2806
    .line 2807
    .line 2808
    .line 2809
    .line 2810
    .line 2811
    .line 2812
    .line 2813
    .line 2814
    .line 2815
    .line 2816
    .line 2817
    .line 2818
    .line 2819
    .line 2820
    .line 2821
    .line 2822
    .line 2823
    .line 2824
    .line 2825
    .line 2826
    .line 2827
    .line 2828
    .line 2829
    .line 2830
    .line 2831
    .line 2832
    .line 2833
    .line 2834
    .line 2835
    .line 2836
    .line 2837
    .line 2838
    .line 2839
    .line 2840
    .line 2841
    .line 2842
    .line 2843
    .line 2844
    .line 2845
    .line 2846
    .line 2847
    .line 2848
    .line 2849
    .line 2850
    .line 2851
    .line 2852
    .line 2853
    .line 2854
    .line 2855
    .line 2856
    .line 2857
    .line 2858
    .line 2859
    .line 2860
    .line 2861
    .line 2862
    .line 2863
    .line 2864
    .line 2865
    .line 2866
    .line 2867
    .line 2868
    .line 2869
    .line 2870
    .line 2871
    .line 2872
    .line 2873
    .line 2874
    .line 2875
    .line 2876
    .line 2877
    .line 2878
    .line 2879
    .line 2880
    .line 2881
    .line 2882
    .line 2883
    .line 2884
    .line 2885
    .line 2886
    .line 2887
    .line 2888
    .line 2889
    .line 2890
    .line 2891
    .line 2892
    .line 2893
    .line 2894
    .line 2895
    .line 2896
    .line 2897
    .line 2898
    .line 2899
    .line 2900
    .line 2901
    .line 2902
    .line 2903
    .line 2904
    .line 2905
    .line 2906
    .line 2907
    .line 2908
    .line 2909
    .line 2910
    .line 2911
    .line 2912
    .line 2913
    .line 2914
    .line 2915
    .line 2916
    .line 2917
    .line 2918
    .line 2919
    .line 2920
    .line 2921
    .line 2922
    .line 2923
    .line 2924
    .line 2925
    .line 2926
    .line 2927
    .line 2928
    .line 2929
    .line 2930
    .line 2931
    .line 2932
    .line 2933
    .line 2934
    .line 2935
    .line 2936
    .line 2937
    .line 2938
    .line 2939
    .line 2940
    .line 2941
    .line 2942
    .line 2943
    .line 2944
    .line 2945
    .line 2946
    .line 2947
    .line 2948
    .line 2949
    .line 2950
    .line 2951
    .line 2952
    .line 2953
    .line 2954
    .line 2955
    .line 2956
    .line 2957
    .line 2958
    .line 2959
    .line 2960
    .line 2961
    .line 2962
    .line 2963
    .line 2964
.end method

.method public get()Ljava/lang/Object;
    .locals 11

    .line 1
    iget v0, p0, Ld;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    goto/16 :goto_2

    .line 7
    .line 8
    :pswitch_0
    iget-object v0, p0, Ld;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Landroid/content/Context;

    .line 11
    .line 12
    sget-object v1, Lt5/q;->n:Lo7/l0;

    .line 13
    .line 14
    const-class v1, Lt5/q;

    .line 15
    .line 16
    monitor-enter v1

    .line 17
    :try_start_0
    sget-object v2, Lt5/q;->t:Lt5/q;

    .line 18
    .line 19
    if-nez v2, :cond_2

    .line 20
    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    :goto_0
    move-object v4, v2

    .line 30
    sget v2, Lv5/e0;->a:I

    .line 31
    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    const-string v2, "phone"

    .line 35
    .line 36
    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    check-cast v0, Landroid/telephony/TelephonyManager;

    .line 41
    .line 42
    if-eqz v0, :cond_1

    .line 43
    .line 44
    invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getNetworkCountryIso()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-nez v2, :cond_1

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_1
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-virtual {v0}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    :goto_1
    invoke-static {v0}, Lx6/b;->y0(Ljava/lang/String;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-static {v0}, Lt5/q;->j(Ljava/lang/String;)[I

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    new-instance v5, Ljava/util/HashMap;

    .line 72
    .line 73
    const/16 v2, 0x8

    .line 74
    .line 75
    invoke-direct {v5, v2}, Ljava/util/HashMap;-><init>(I)V

    .line 76
    .line 77
    .line 78
    const/4 v2, 0x0

    .line 79
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    const-wide/32 v6, 0xf4240

    .line 84
    .line 85
    .line 86
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 87
    .line 88
    .line 89
    move-result-object v6

    .line 90
    invoke-virtual {v5, v3, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    const/4 v3, 0x2

    .line 94
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 95
    .line 96
    .line 97
    move-result-object v6

    .line 98
    sget-object v7, Lt5/q;->n:Lo7/l0;

    .line 99
    .line 100
    aget v8, v0, v2

    .line 101
    .line 102
    invoke-virtual {v7, v8}, Lo7/l0;->get(I)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v8

    .line 106
    check-cast v8, Ljava/lang/Long;

    .line 107
    .line 108
    invoke-virtual {v5, v6, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    const/4 v6, 0x3

    .line 112
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 113
    .line 114
    .line 115
    move-result-object v8

    .line 116
    sget-object v9, Lt5/q;->o:Lo7/l0;

    .line 117
    .line 118
    const/4 v10, 0x1

    .line 119
    aget v10, v0, v10

    .line 120
    .line 121
    invoke-virtual {v9, v10}, Lo7/l0;->get(I)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v9

    .line 125
    check-cast v9, Ljava/lang/Long;

    .line 126
    .line 127
    invoke-virtual {v5, v8, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    const/4 v8, 0x4

    .line 131
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 132
    .line 133
    .line 134
    move-result-object v9

    .line 135
    sget-object v10, Lt5/q;->p:Lo7/l0;

    .line 136
    .line 137
    aget v3, v0, v3

    .line 138
    .line 139
    invoke-virtual {v10, v3}, Lo7/l0;->get(I)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v3

    .line 143
    check-cast v3, Ljava/lang/Long;

    .line 144
    .line 145
    invoke-virtual {v5, v9, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    const/4 v3, 0x5

    .line 149
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 150
    .line 151
    .line 152
    move-result-object v9

    .line 153
    sget-object v10, Lt5/q;->q:Lo7/l0;

    .line 154
    .line 155
    aget v6, v0, v6

    .line 156
    .line 157
    invoke-virtual {v10, v6}, Lo7/l0;->get(I)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v6

    .line 161
    check-cast v6, Ljava/lang/Long;

    .line 162
    .line 163
    invoke-virtual {v5, v9, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    const/16 v6, 0xa

    .line 167
    .line 168
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 169
    .line 170
    .line 171
    move-result-object v6

    .line 172
    sget-object v9, Lt5/q;->r:Lo7/l0;

    .line 173
    .line 174
    aget v8, v0, v8

    .line 175
    .line 176
    invoke-virtual {v9, v8}, Lo7/l0;->get(I)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v8

    .line 180
    check-cast v8, Ljava/lang/Long;

    .line 181
    .line 182
    invoke-virtual {v5, v6, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    const/16 v6, 0x9

    .line 186
    .line 187
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 188
    .line 189
    .line 190
    move-result-object v6

    .line 191
    sget-object v8, Lt5/q;->s:Lo7/l0;

    .line 192
    .line 193
    aget v3, v0, v3

    .line 194
    .line 195
    invoke-virtual {v8, v3}, Lo7/l0;->get(I)Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v3

    .line 199
    check-cast v3, Ljava/lang/Long;

    .line 200
    .line 201
    invoke-virtual {v5, v6, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    const/4 v3, 0x7

    .line 205
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 206
    .line 207
    .line 208
    move-result-object v3

    .line 209
    aget v0, v0, v2

    .line 210
    .line 211
    invoke-virtual {v7, v0}, Lo7/l0;->get(I)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    check-cast v0, Ljava/lang/Long;

    .line 216
    .line 217
    invoke-virtual {v5, v3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    const/16 v6, 0x7d0

    .line 221
    .line 222
    sget-object v7, Lv5/c;->a:Lv5/z;

    .line 223
    .line 224
    new-instance v0, Lt5/q;

    .line 225
    .line 226
    const/4 v8, 0x1

    .line 227
    move-object v3, v0

    .line 228
    invoke-direct/range {v3 .. v8}, Lt5/q;-><init>(Landroid/content/Context;Ljava/util/HashMap;ILv5/z;Z)V

    .line 229
    .line 230
    .line 231
    sput-object v0, Lt5/q;->t:Lt5/q;

    .line 232
    .line 233
    :cond_2
    sget-object v0, Lt5/q;->t:Lt5/q;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 234
    .line 235
    monitor-exit v1

    .line 236
    return-object v0

    .line 237
    :catchall_0
    move-exception v0

    .line 238
    monitor-exit v1

    .line 239
    throw v0

    .line 240
    :pswitch_1
    iget-object v0, p0, Ld;->b:Ljava/lang/Object;

    .line 241
    .line 242
    check-cast v0, Landroid/content/Context;

    .line 243
    .line 244
    new-instance v1, Lv3/l;

    .line 245
    .line 246
    invoke-direct {v1, v0}, Lv3/l;-><init>(Landroid/content/Context;)V

    .line 247
    .line 248
    .line 249
    return-object v1

    .line 250
    :goto_2
    iget-object v0, p0, Ld;->b:Ljava/lang/Object;

    .line 251
    .line 252
    check-cast v0, Li9/n;

    .line 253
    .line 254
    iget-object v0, v0, Li9/n;->f:Li9/h;

    .line 255
    .line 256
    return-object v0

    .line 257
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
.end method

.method public h(Lt9/b;)V
    .locals 3

    .line 1
    iget-object v0, p0, Ld;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Le9/d;

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    invoke-interface {p1}, Lt9/b;->get()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, Lc8/b;

    .line 11
    .line 12
    iput-object p1, v0, Le9/d;->c:Lc8/b;

    .line 13
    .line 14
    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 15
    :try_start_1
    iget p1, v0, Le9/d;->e:I

    .line 16
    .line 17
    add-int/lit8 p1, p1, 0x1

    .line 18
    .line 19
    iput p1, v0, Le9/d;->e:I

    .line 20
    .line 21
    iget-object p1, v0, Le9/d;->d:Ln9/j;

    .line 22
    .line 23
    if-eqz p1, :cond_2

    .line 24
    .line 25
    monitor-enter v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 26
    :try_start_2
    iget-object v1, v0, Le9/d;->c:Lc8/b;

    .line 27
    .line 28
    if-nez v1, :cond_0

    .line 29
    .line 30
    const/4 v1, 0x0

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    invoke-interface {v1}, Lc8/b;->a()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    :goto_0
    if-eqz v1, :cond_1

    .line 37
    .line 38
    new-instance v2, Le9/e;

    .line 39
    .line 40
    invoke-direct {v2, v1}, Le9/e;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    sget-object v2, Le9/e;->b:Le9/e;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 45
    .line 46
    :goto_1
    :try_start_3
    monitor-exit v0

    .line 47
    invoke-interface {p1, v2}, Ln9/j;->a(Le9/e;)V

    .line 48
    .line 49
    .line 50
    goto :goto_2

    .line 51
    :catchall_0
    move-exception p1

    .line 52
    monitor-exit v0

    .line 53
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 54
    :cond_2
    :goto_2
    :try_start_4
    monitor-exit v0

    .line 55
    iget-object p1, v0, Le9/d;->c:Lc8/b;

    .line 56
    .line 57
    iget-object v1, v0, Le9/d;->b:Le9/c;

    .line 58
    .line 59
    invoke-interface {p1, v1}, Lc8/b;->b(Lc8/a;)V

    .line 60
    .line 61
    .line 62
    monitor-exit v0

    .line 63
    return-void

    .line 64
    :catchall_1
    move-exception p1

    .line 65
    monitor-exit v0

    .line 66
    throw p1

    .line 67
    :catchall_2
    move-exception p1

    .line 68
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 69
    throw p1
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method

.method public invoke(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget v0, p0, Ld;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    goto :goto_0

    .line 7
    :pswitch_0
    iget-object v0, p0, Ld;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Lp4/a;

    .line 10
    .line 11
    check-cast p1, Lv3/f1$c;

    .line 12
    .line 13
    invoke-interface {p1, v0}, Lv3/f1$c;->w(Lp4/a;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :pswitch_1
    iget-object v0, p0, Ld;->b:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, Lx3/d;

    .line 20
    .line 21
    check-cast p1, Lv3/f1$c;

    .line 22
    .line 23
    sget v1, Lv3/d0;->h0:I

    .line 24
    .line 25
    invoke-interface {p1, v0}, Lv3/f1$c;->d0(Lx3/d;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :goto_0
    iget-object v0, p0, Ld;->b:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v0, Lh5/c;

    .line 32
    .line 33
    check-cast p1, Lv3/f1$c;

    .line 34
    .line 35
    invoke-interface {p1, v0}, Lv3/f1$c;->j(Lh5/c;)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method

.method public onFailure(Ljava/lang/Exception;)V
    .locals 1

    .line 1
    iget v0, p0, Ld;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    goto :goto_0

    .line 7
    :pswitch_0
    iget-object v0, p0, Ld;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :goto_0
    iget-object v0, p0, Ld;->b:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Lio/flutter/plugins/firebase/dynamiclinks/FlutterFirebaseDynamicLinksPlugin;

    .line 18
    .line 19
    invoke-static {v0, p1}, Lio/flutter/plugins/firebase/dynamiclinks/FlutterFirebaseDynamicLinksPlugin;->g(Lio/flutter/plugins/firebase/dynamiclinks/FlutterFirebaseDynamicLinksPlugin;Ljava/lang/Exception;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :pswitch_data_0
    .packed-switch 0xb
        :pswitch_0
    .end packed-switch
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method

.method public onMessage(Ljava/lang/Object;Lio/flutter/plugin/common/BasicMessageChannel$Reply;)V
    .locals 2

    .line 1
    iget v0, p0, Ld;->a:I

    .line 2
    .line 3
    sparse-switch v0, :sswitch_data_0

    .line 4
    .line 5
    .line 6
    goto :goto_1

    .line 7
    :sswitch_0
    iget-object v0, p0, Ld;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Lio/flutter/plugins/firebase/core/GeneratedAndroidFirebaseCore$FirebaseAppHostApi;

    .line 10
    .line 11
    invoke-static {v0, p1, p2}, Lio/flutter/plugins/firebase/core/GeneratedAndroidFirebaseCore$FirebaseAppHostApi$-CC;->c(Lio/flutter/plugins/firebase/core/GeneratedAndroidFirebaseCore$FirebaseAppHostApi;Ljava/lang/Object;Lio/flutter/plugin/common/BasicMessageChannel$Reply;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :sswitch_1
    iget-object v0, p0, Ld;->b:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$MultiFactorUserHostApi;

    .line 18
    .line 19
    invoke-static {v0, p1, p2}, Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$MultiFactorUserHostApi$-CC;->e(Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$MultiFactorUserHostApi;Ljava/lang/Object;Lio/flutter/plugin/common/BasicMessageChannel$Reply;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :sswitch_2
    iget-object v0, p0, Ld;->b:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v0, Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$MultiFactorTotpSecretHostApi;

    .line 26
    .line 27
    invoke-static {v0, p1, p2}, Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$MultiFactorTotpSecretHostApi$-CC;->c(Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$MultiFactorTotpSecretHostApi;Ljava/lang/Object;Lio/flutter/plugin/common/BasicMessageChannel$Reply;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :sswitch_3
    iget-object v0, p0, Ld;->b:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v0, Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$MultiFactorTotpHostApi;

    .line 34
    .line 35
    invoke-static {v0, p1, p2}, Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$MultiFactorTotpHostApi$-CC;->b(Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$MultiFactorTotpHostApi;Ljava/lang/Object;Lio/flutter/plugin/common/BasicMessageChannel$Reply;)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :sswitch_4
    iget-object v0, p0, Ld;->b:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v0, Lh;

    .line 42
    .line 43
    const-string v1, "reply"

    .line 44
    .line 45
    invoke-static {p2, v1}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 49
    .line 50
    invoke-static {p1, v1}, Lec/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    check-cast p1, Ljava/util/List;

    .line 54
    .line 55
    const/4 v1, 0x0

    .line 56
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    const-string v1, "null cannot be cast to non-null type <root>.ToggleMessage"

    .line 61
    .line 62
    invoke-static {p1, v1}, Lec/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    check-cast p1, Lb;

    .line 66
    .line 67
    :try_start_0
    invoke-interface {v0, p1}, Lh;->a(Lb;)V

    .line 68
    .line 69
    .line 70
    const/4 p1, 0x0

    .line 71
    invoke-static {p1}, Lva/a;->f(Ljava/lang/Object;)Ljava/util/List;

    .line 72
    .line 73
    .line 74
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 75
    goto :goto_0

    .line 76
    :catchall_0
    move-exception p1

    .line 77
    invoke-static {p1}, Lx6/b;->c(Ljava/lang/Throwable;)Ljava/util/List;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    :goto_0
    invoke-interface {p2, p1}, Lio/flutter/plugin/common/BasicMessageChannel$Reply;->reply(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    return-void

    .line 85
    :goto_1
    iget-object v0, p0, Ld;->b:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast v0, Lio/flutter/plugins/firebase/core/GeneratedAndroidFirebaseCore$FirebaseCoreHostApi;

    .line 88
    .line 89
    invoke-static {v0, p1, p2}, Lio/flutter/plugins/firebase/core/GeneratedAndroidFirebaseCore$FirebaseCoreHostApi$-CC;->d(Lio/flutter/plugins/firebase/core/GeneratedAndroidFirebaseCore$FirebaseCoreHostApi;Ljava/lang/Object;Lio/flutter/plugin/common/BasicMessageChannel$Reply;)V

    .line 90
    .line 91
    .line 92
    return-void

    .line 93
    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_4
        0xf -> :sswitch_3
        0x10 -> :sswitch_2
        0x11 -> :sswitch_1
        0x12 -> :sswitch_0
    .end sparse-switch
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
.end method

.method public run(Landroid/view/View;)Z
    .locals 1

    iget-object v0, p0, Ld;->b:Ljava/lang/Object;

    check-cast v0, [Ljava/lang/Class;

    invoke-static {v0, p1}, Lio/flutter/util/ViewUtils;->b([Ljava/lang/Class;Landroid/view/View;)Z

    move-result p1

    return p1
.end method

.method public then(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;
    .locals 3

    iget v0, p0, Ld;->a:I

    packed-switch v0, :pswitch_data_0

    goto :goto_1

    :pswitch_0
    iget-object v0, p0, Ld;->b:Ljava/lang/Object;

    check-cast v0, Lo9/b;

    check-cast p1, Lz7/a;

    const-string v1, "this$0"

    .line 1
    invoke-static {v0, v1}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "result"

    invoke-static {p1, v1}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lz7/a;->a()Ljava/lang/Exception;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lo9/b;->d:Ljava/lang/String;

    const-string v1, "Error getting App Check token. Error: "

    .line 2
    invoke-static {v1}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 3
    invoke-virtual {p1}, Lz7/a;->a()Ljava/lang/Exception;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lz7/a;->b()Ljava/lang/String;

    move-result-object p1

    :goto_0
    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1

    .line 4
    :goto_1
    iget-object v0, p0, Ld;->b:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    check-cast p1, Laa/j0;

    sget-object v1, Lcom/google/firebase/messaging/FirebaseMessaging;->m:Lcom/google/firebase/messaging/a;

    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    new-instance v1, Laa/g0;

    const-string v2, "S"

    invoke-direct {v1, v2, v0}, Laa/g0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 7
    invoke-virtual {p1, v1}, Laa/j0;->e(Laa/g0;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    invoke-virtual {p1}, Laa/j0;->f()V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0xc
        :pswitch_0
    .end packed-switch
.end method

.method public then(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Ld;->b:Ljava/lang/Object;

    check-cast v0, Lcom/google/firebase/firestore/c;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object p1

    move-object v4, p1

    check-cast v4, Lj9/g;

    if-eqz v4, :cond_0

    invoke-interface {v4}, Lj9/g;->d()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    move v6, p1

    new-instance p1, Lcom/google/firebase/firestore/d;

    iget-object v2, v0, Lcom/google/firebase/firestore/c;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    iget-object v3, v0, Lcom/google/firebase/firestore/c;->a:Lj9/i;

    const/4 v5, 0x1

    move-object v1, p1

    invoke-direct/range {v1 .. v6}, Lcom/google/firebase/firestore/d;-><init>(Lcom/google/firebase/firestore/FirebaseFirestore;Lj9/i;Lj9/g;ZZ)V

    return-object p1
.end method
