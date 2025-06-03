.class public final synthetic Le;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/plugin/common/BasicMessageChannel$MessageHandler;
.implements Ls3/b$a;
.implements Lv5/l$a;
.implements Lv5/e;
.implements Lo4/p$f;
.implements Li8/b;
.implements Lcom/google/android/gms/tasks/Continuation;
.implements Lt9/a$a;
.implements Lcom/google/android/gms/tasks/OnSuccessListener;
.implements Lio/flutter/embedding/engine/systemchannels/KeyEventChannel$EventResponseHandler;
.implements Lio/flutter/plugin/common/BasicMessageChannel$Reply;
.implements Lio/flutter/plugins/googlesignin/BackgroundTaskRunner$Callback;
.implements Lcom/google/android/gms/tasks/OnCompleteListener;
.implements Ln9/i;
.implements Ln7/q;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Le;->a:I

    iput-object p1, p0, Le;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Le;->b:Ljava/lang/Object;

    check-cast v0, Lq3/k;

    iget-object v0, v0, Lq3/k;->i:Lr3/c;

    invoke-interface {v0}, Lr3/c;->g()V

    const/4 v0, 0x0

    return-object v0
.end method

.method public accept(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Le;->b:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Exception;

    check-cast p1, La4/g$a;

    invoke-virtual {p1, v0}, La4/g$a;->e(Ljava/lang/Exception;)V

    return-void
.end method

.method public apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, Le;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    goto :goto_0

    .line 7
    :pswitch_0
    iget-object v0, p0, Le;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Lcom/google/firebase/firestore/FirebaseFirestore;

    .line 10
    .line 11
    move-object v6, p1

    .line 12
    check-cast v6, Ln9/a;

    .line 13
    .line 14
    iget-object v9, v0, Lcom/google/firebase/firestore/FirebaseFirestore;->k:Ld9/x;

    .line 15
    .line 16
    monitor-enter v9

    .line 17
    :try_start_0
    new-instance v3, Lg9/h;

    .line 18
    .line 19
    iget-object p1, v0, Lcom/google/firebase/firestore/FirebaseFirestore;->c:Lj9/f;

    .line 20
    .line 21
    iget-object v1, v0, Lcom/google/firebase/firestore/FirebaseFirestore;->d:Ljava/lang/String;

    .line 22
    .line 23
    iget-object v2, v0, Lcom/google/firebase/firestore/FirebaseFirestore;->j:Lcom/google/firebase/firestore/g;

    .line 24
    .line 25
    iget-object v4, v2, Lcom/google/firebase/firestore/g;->a:Ljava/lang/String;

    .line 26
    .line 27
    iget-boolean v5, v2, Lcom/google/firebase/firestore/g;->b:Z

    .line 28
    .line 29
    invoke-direct {v3, p1, v1, v4, v5}, Lg9/h;-><init>(Lj9/f;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 30
    .line 31
    .line 32
    new-instance p1, Lg9/u;

    .line 33
    .line 34
    iget-object v4, v0, Lcom/google/firebase/firestore/FirebaseFirestore;->b:Landroid/content/Context;

    .line 35
    .line 36
    iget-object v5, v0, Lcom/google/firebase/firestore/FirebaseFirestore;->e:Le9/a;

    .line 37
    .line 38
    iget-object v7, v0, Lcom/google/firebase/firestore/FirebaseFirestore;->f:Le9/a;

    .line 39
    .line 40
    iget-object v8, v0, Lcom/google/firebase/firestore/FirebaseFirestore;->l:Lm9/z;

    .line 41
    .line 42
    iget-object v0, v0, Lcom/google/firebase/firestore/FirebaseFirestore;->a:Ln9/i;

    .line 43
    .line 44
    invoke-interface {v0, v2}, Ln9/i;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    check-cast v0, Lg9/f;

    .line 49
    .line 50
    move-object v1, p1

    .line 51
    move-object v2, v4

    .line 52
    move-object v4, v5

    .line 53
    move-object v5, v7

    .line 54
    move-object v7, v8

    .line 55
    move-object v8, v0

    .line 56
    invoke-direct/range {v1 .. v8}, Lg9/u;-><init>(Landroid/content/Context;Lg9/h;Le9/a;Le9/a;Ln9/a;Lm9/z;Lg9/f;)V

    .line 57
    .line 58
    .line 59
    monitor-exit v9

    .line 60
    return-object p1

    .line 61
    :catchall_0
    move-exception p1

    .line 62
    monitor-exit v9
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 63
    throw p1

    .line 64
    :pswitch_1
    iget-object v0, p0, Le;->b:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v0, Ljava/util/List;

    .line 67
    .line 68
    check-cast p1, Lg9/u;

    .line 69
    .line 70
    invoke-virtual {p1, v0}, Lg9/u;->e(Ljava/util/List;)Lcom/google/android/gms/tasks/Task;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    return-object p1

    .line 75
    :pswitch_2
    iget-object v0, p0, Le;->b:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v0, Ld9/a;

    .line 78
    .line 79
    move-object v2, p1

    .line 80
    check-cast v2, Lg9/u;

    .line 81
    .line 82
    iget-object p1, v0, Ld9/a;->a:Lcom/google/firebase/firestore/i;

    .line 83
    .line 84
    iget-object v3, p1, Lcom/google/firebase/firestore/i;->a:Lg9/f0;

    .line 85
    .line 86
    iget-object v4, v0, Ld9/a;->b:Ljava/util/List;

    .line 87
    .line 88
    invoke-virtual {v2}, Lg9/u;->d()V

    .line 89
    .line 90
    .line 91
    new-instance p1, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 92
    .line 93
    invoke-direct {p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    .line 94
    .line 95
    .line 96
    iget-object v0, v2, Lg9/u;->d:Ln9/a;

    .line 97
    .line 98
    new-instance v7, Lg9/r;

    .line 99
    .line 100
    const/4 v6, 0x0

    .line 101
    move-object v1, v7

    .line 102
    move-object v5, p1

    .line 103
    invoke-direct/range {v1 .. v6}, Lg9/r;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/List;Ljava/lang/Object;I)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v0, v7}, Ln9/a;->a(Ljava/lang/Runnable;)Lcom/google/android/gms/tasks/Task;

    .line 107
    .line 108
    .line 109
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    return-object p1

    .line 114
    :goto_0
    iget-object v0, p0, Le;->b:Ljava/lang/Object;

    .line 115
    .line 116
    move-object v2, v0

    .line 117
    check-cast v2, Ljava/lang/String;

    .line 118
    .line 119
    check-cast p1, Landroid/database/Cursor;

    .line 120
    .line 121
    if-nez p1, :cond_0

    .line 122
    .line 123
    const/4 p1, 0x0

    .line 124
    goto :goto_1

    .line 125
    :cond_0
    new-instance v0, Lf9/e;

    .line 126
    .line 127
    const/4 v1, 0x0

    .line 128
    invoke-interface {p1, v1}, Landroid/database/Cursor;->getInt(I)I

    .line 129
    .line 130
    .line 131
    move-result v3

    .line 132
    new-instance v4, Lj9/q;

    .line 133
    .line 134
    new-instance v1, Lu7/m;

    .line 135
    .line 136
    const/4 v5, 0x1

    .line 137
    invoke-interface {p1, v5}, Landroid/database/Cursor;->getLong(I)J

    .line 138
    .line 139
    .line 140
    move-result-wide v5

    .line 141
    const/4 v7, 0x2

    .line 142
    invoke-interface {p1, v7}, Landroid/database/Cursor;->getInt(I)I

    .line 143
    .line 144
    .line 145
    move-result v7

    .line 146
    invoke-direct {v1, v7, v5, v6}, Lu7/m;-><init>(IJ)V

    .line 147
    .line 148
    .line 149
    invoke-direct {v4, v1}, Lj9/q;-><init>(Lu7/m;)V

    .line 150
    .line 151
    .line 152
    const/4 v1, 0x3

    .line 153
    invoke-interface {p1, v1}, Landroid/database/Cursor;->getInt(I)I

    .line 154
    .line 155
    .line 156
    move-result v5

    .line 157
    const/4 v1, 0x4

    .line 158
    invoke-interface {p1, v1}, Landroid/database/Cursor;->getLong(I)J

    .line 159
    .line 160
    .line 161
    move-result-wide v6

    .line 162
    move-object v1, v0

    .line 163
    invoke-direct/range {v1 .. v7}, Lf9/e;-><init>(Ljava/lang/String;ILj9/q;IJ)V

    .line 164
    .line 165
    .line 166
    move-object p1, v0

    .line 167
    :goto_1
    return-object p1

    .line 168
    nop

    .line 169
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
.end method

.method public b(Ljava/lang/Object;)I
    .locals 5

    .line 1
    iget-object v0, p0, Le;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lv3/i0;

    .line 4
    .line 5
    check-cast p1, Lo4/l;

    .line 6
    .line 7
    sget-object v1, Lo4/p;->a:Ljava/util/regex/Pattern;

    .line 8
    .line 9
    iget-object v1, p1, Lo4/l;->b:Ljava/lang/String;

    .line 10
    .line 11
    iget-object v2, v0, Lv3/i0;->t:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    const/4 v2, 0x0

    .line 18
    const/4 v3, 0x1

    .line 19
    if-nez v1, :cond_1

    .line 20
    .line 21
    iget-object v1, p1, Lo4/l;->b:Ljava/lang/String;

    .line 22
    .line 23
    invoke-static {v0}, Lo4/p;->b(Lv3/i0;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    move v1, v2

    .line 35
    goto :goto_1

    .line 36
    :cond_1
    :goto_0
    move v1, v3

    .line 37
    :goto_1
    if-eqz v1, :cond_2

    .line 38
    .line 39
    invoke-virtual {p1, v0, v2}, Lo4/l;->c(Lv3/i0;Z)Z

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    if-eqz p1, :cond_2

    .line 44
    .line 45
    move v2, v3

    .line 46
    :cond_2
    return v2
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

.method public c(Li8/a;)V
    .locals 2

    iget-object v0, p0, Le;->b:Ljava/lang/Object;

    check-cast v0, Lf8/a;

    monitor-enter v0

    :try_start_0
    iget-object v1, v0, Lf8/a;->c:Li8/b;

    instance-of v1, v1, Li8/c;

    if-eqz v1, :cond_0

    iget-object v1, v0, Lf8/a;->d:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    iget-object v1, v0, Lf8/a;->c:Li8/b;

    invoke-interface {v1, p1}, Li8/b;->c(Li8/a;)V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public get()Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Le;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    goto :goto_0

    .line 7
    :pswitch_0
    iget-object v0, p0, Le;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Lv3/m1;

    .line 10
    .line 11
    return-object v0

    .line 12
    :pswitch_1
    iget-object v0, p0, Le;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Landroid/content/Context;

    .line 15
    .line 16
    new-instance v1, Lr5/f;

    .line 17
    .line 18
    invoke-direct {v1, v0}, Lr5/f;-><init>(Landroid/content/Context;)V

    .line 19
    .line 20
    .line 21
    return-object v1

    .line 22
    :pswitch_2
    iget-object v0, p0, Le;->b:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, Lr5/o;

    .line 25
    .line 26
    return-object v0

    .line 27
    :goto_0
    iget-object v0, p0, Le;->b:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v0, Lv3/g0;

    .line 30
    .line 31
    iget-boolean v0, v0, Lv3/g0;->H:Z

    .line 32
    .line 33
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    return-object v0

    .line 38
    nop

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
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
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method

.method public h(Lt9/b;)V
    .locals 1

    iget-object v0, p0, Le;->b:Ljava/lang/Object;

    check-cast v0, Le9/b;

    monitor-enter v0

    :try_start_0
    invoke-interface {p1}, Lt9/b;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, La8/a;

    iput-object p1, v0, Le9/b;->b:La8/a;

    if-eqz p1, :cond_0

    invoke-interface {p1}, La8/a;->d()V

    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public invoke(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Le;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    check-cast p1, Lv3/f1$c;

    invoke-interface {p1, v0}, Lv3/f1$c;->r(Ljava/util/List;)V

    return-void
.end method

.method public onComplete(Lcom/google/android/gms/tasks/Task;)V
    .locals 1

    .line 1
    iget v0, p0, Le;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    goto :goto_0

    .line 7
    :pswitch_0
    iget-object v0, p0, Le;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Lio/flutter/plugins/firebase/core/GeneratedAndroidFirebaseCore$Result;

    .line 10
    .line 11
    invoke-static {v0, p1}, Lio/flutter/plugins/firebase/core/FlutterFirebaseCorePlugin;->d(Lio/flutter/plugins/firebase/core/GeneratedAndroidFirebaseCore$Result;Lcom/google/android/gms/tasks/Task;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :pswitch_1
    iget-object p1, p0, Le;->b:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p1, Ljava/util/concurrent/ScheduledFuture;

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    invoke-interface {p1, v0}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :pswitch_2
    iget-object p1, p0, Le;->b:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p1, Landroid/content/Intent;

    .line 27
    .line 28
    invoke-static {p1}, Laa/l0;->a(Landroid/content/Intent;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :goto_0
    iget-object v0, p0, Le;->b:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v0, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;

    .line 35
    .line 36
    invoke-static {v0, p1}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->b(Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;Lcom/google/android/gms/tasks/Task;)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    nop

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

.method public onFrameworkResponse(Z)V
    .locals 1

    iget-object v0, p0, Le;->b:Ljava/lang/Object;

    check-cast v0, Lio/flutter/embedding/android/KeyboardManager$Responder$OnKeyEventHandledCallback;

    invoke-static {v0, p1}, Lio/flutter/embedding/android/KeyChannelResponder;->a(Lio/flutter/embedding/android/KeyboardManager$Responder$OnKeyEventHandledCallback;Z)V

    return-void
.end method

.method public onMessage(Ljava/lang/Object;Lio/flutter/plugin/common/BasicMessageChannel$Reply;)V
    .locals 1

    .line 1
    iget v0, p0, Le;->a:I

    .line 2
    .line 3
    sparse-switch v0, :sswitch_data_0

    .line 4
    .line 5
    .line 6
    goto :goto_1

    .line 7
    :sswitch_0
    iget-object v0, p0, Le;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Lio/flutter/plugins/pathprovider/Messages$PathProviderApi;

    .line 10
    .line 11
    invoke-static {v0, p1, p2}, Lio/flutter/plugins/pathprovider/d;->e(Lio/flutter/plugins/pathprovider/Messages$PathProviderApi;Ljava/lang/Object;Lio/flutter/plugin/common/BasicMessageChannel$Reply;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :sswitch_1
    iget-object v0, p0, Le;->b:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Lio/flutter/plugins/firebase/core/GeneratedAndroidFirebaseCore$FirebaseAppHostApi;

    .line 18
    .line 19
    invoke-static {v0, p1, p2}, Lio/flutter/plugins/firebase/core/GeneratedAndroidFirebaseCore$FirebaseAppHostApi$-CC;->d(Lio/flutter/plugins/firebase/core/GeneratedAndroidFirebaseCore$FirebaseAppHostApi;Ljava/lang/Object;Lio/flutter/plugin/common/BasicMessageChannel$Reply;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :sswitch_2
    iget-object v0, p0, Le;->b:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v0, Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$MultiFactorTotpHostApi;

    .line 26
    .line 27
    invoke-static {v0, p1, p2}, Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$MultiFactorTotpHostApi$-CC;->c(Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$MultiFactorTotpHostApi;Ljava/lang/Object;Lio/flutter/plugin/common/BasicMessageChannel$Reply;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :sswitch_3
    iget-object p1, p0, Le;->b:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast p1, Lh;

    .line 34
    .line 35
    const-string v0, "reply"

    .line 36
    .line 37
    invoke-static {p2, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    :try_start_0
    invoke-interface {p1}, Lh;->isEnabled()La;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-static {p1}, Lva/a;->f(Ljava/lang/Object;)Ljava/util/List;

    .line 45
    .line 46
    .line 47
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    goto :goto_0

    .line 49
    :catchall_0
    move-exception p1

    .line 50
    invoke-static {p1}, Lx6/b;->c(Ljava/lang/Throwable;)Ljava/util/List;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    :goto_0
    invoke-interface {p2, p1}, Lio/flutter/plugin/common/BasicMessageChannel$Reply;->reply(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :goto_1
    iget-object v0, p0, Le;->b:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v0, Lio/flutter/plugins/urllauncher/Messages$UrlLauncherApi;

    .line 61
    .line 62
    invoke-static {v0, p1, p2}, Lio/flutter/plugins/urllauncher/b;->d(Lio/flutter/plugins/urllauncher/Messages$UrlLauncherApi;Ljava/lang/Object;Lio/flutter/plugin/common/BasicMessageChannel$Reply;)V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    nop

    .line 67
    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_3
        0xd -> :sswitch_2
        0xe -> :sswitch_1
        0x11 -> :sswitch_0
    .end sparse-switch
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
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
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

.method public onSuccess(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget-object v0, p0, Le;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lcom/google/firebase/messaging/FirebaseMessaging;

    .line 4
    .line 5
    check-cast p1, Li6/a;

    .line 6
    .line 7
    sget-object v1, Lcom/google/firebase/messaging/FirebaseMessaging;->m:Lcom/google/firebase/messaging/a;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    iget-object p1, p1, Li6/a;->a:Landroid/content/Intent;

    .line 15
    .line 16
    invoke-static {p1}, Laa/q;->b(Landroid/content/Intent;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Lcom/google/firebase/messaging/FirebaseMessaging;->h()V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
    .line 23
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

.method public reply(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Le;->b:Ljava/lang/Object;

    check-cast v0, Lio/flutter/embedding/engine/systemchannels/KeyEventChannel$EventResponseHandler;

    invoke-static {v0, p1}, Lio/flutter/embedding/engine/systemchannels/KeyEventChannel;->a(Lio/flutter/embedding/engine/systemchannels/KeyEventChannel$EventResponseHandler;Ljava/lang/Object;)V

    return-void
.end method

.method public run(Ljava/util/concurrent/Future;)V
    .locals 1

    iget-object v0, p0, Le;->b:Ljava/lang/Object;

    check-cast v0, Lio/flutter/plugins/googlesignin/Messages$Result;

    invoke-static {v0, p1}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->d(Lio/flutter/plugins/googlesignin/Messages$Result;Ljava/util/concurrent/Future;)V

    return-void
.end method

.method public then(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Le;->b:Ljava/lang/Object;

    check-cast v0, Lcom/google/firebase/firestore/i;

    new-instance v1, Lcom/google/firebase/firestore/k;

    new-instance v2, Lcom/google/firebase/firestore/i;

    iget-object v3, v0, Lcom/google/firebase/firestore/i;->a:Lg9/f0;

    iget-object v4, v0, Lcom/google/firebase/firestore/i;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    invoke-direct {v2, v3, v4}, Lcom/google/firebase/firestore/i;-><init>(Lg9/f0;Lcom/google/firebase/firestore/FirebaseFirestore;)V

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lg9/s0;

    iget-object v0, v0, Lcom/google/firebase/firestore/i;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    invoke-direct {v1, v2, p1, v0}, Lcom/google/firebase/firestore/k;-><init>(Lcom/google/firebase/firestore/i;Lg9/s0;Lcom/google/firebase/firestore/FirebaseFirestore;)V

    return-object v1
.end method
