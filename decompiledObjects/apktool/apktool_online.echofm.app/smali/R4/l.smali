.class public final LR4/l;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LR4/l$a;
    }
.end annotation


# static fields
.field public static final h:LR4/l$a;


# instance fields
.field public final a:Ls3/e;

.field public final b:LR4/b;

.field public final c:LT4/f;

.field public final d:LR4/x;

.field public final e:LR4/s;

.field public final f:LR4/h;

.field public final g:LR4/o;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LR4/l$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LR4/l$a;-><init>(Lkotlin/jvm/internal/g;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LR4/l;->h:LR4/l$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Ls3/e;Ls4/i;Lp6/F;Lp6/F;Lr4/b;)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v8, p2

    .line 6
    .line 7
    move-object/from16 v9, p5

    .line 8
    .line 9
    const-string v2, "firebaseApp"

    .line 10
    .line 11
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const-string v2, "firebaseInstallations"

    .line 15
    .line 16
    invoke-static {v8, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const-string v2, "backgroundDispatcher"

    .line 20
    .line 21
    move-object/from16 v10, p3

    .line 22
    .line 23
    invoke-static {v10, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v2, "blockingDispatcher"

    .line 27
    .line 28
    move-object/from16 v4, p4

    .line 29
    .line 30
    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    const-string v2, "transportFactoryProvider"

    .line 34
    .line 35
    invoke-static {v9, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    .line 39
    .line 40
    .line 41
    iput-object v1, v0, LR4/l;->a:Ls3/e;

    .line 42
    .line 43
    sget-object v2, LR4/r;->a:LR4/r;

    .line 44
    .line 45
    invoke-virtual {v2, v1}, LR4/r;->a(Ls3/e;)LR4/b;

    .line 46
    .line 47
    .line 48
    move-result-object v7

    .line 49
    iput-object v7, v0, LR4/l;->b:LR4/b;

    .line 50
    .line 51
    new-instance v11, LT4/f;

    .line 52
    .line 53
    invoke-virtual/range {p1 .. p1}, Ls3/e;->m()Landroid/content/Context;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    const-string v2, "firebaseApp.applicationContext"

    .line 58
    .line 59
    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    move-object v2, v11

    .line 63
    move-object/from16 v5, p3

    .line 64
    .line 65
    move-object/from16 v6, p2

    .line 66
    .line 67
    invoke-direct/range {v2 .. v7}, LT4/f;-><init>(Landroid/content/Context;LX5/g;LX5/g;Ls4/i;LR4/b;)V

    .line 68
    .line 69
    .line 70
    iput-object v11, v0, LR4/l;->c:LT4/f;

    .line 71
    .line 72
    new-instance v4, LR4/w;

    .line 73
    .line 74
    invoke-direct {v4}, LR4/w;-><init>()V

    .line 75
    .line 76
    .line 77
    iput-object v4, v0, LR4/l;->d:LR4/x;

    .line 78
    .line 79
    new-instance v2, LR4/h;

    .line 80
    .line 81
    invoke-direct {v2, v9}, LR4/h;-><init>(Lr4/b;)V

    .line 82
    .line 83
    .line 84
    iput-object v2, v0, LR4/l;->f:LR4/h;

    .line 85
    .line 86
    new-instance v3, LR4/o;

    .line 87
    .line 88
    invoke-direct {v3, v8, v2}, LR4/o;-><init>(Ls4/i;LR4/i;)V

    .line 89
    .line 90
    .line 91
    iput-object v3, v0, LR4/l;->g:LR4/o;

    .line 92
    .line 93
    new-instance v8, LR4/s;

    .line 94
    .line 95
    invoke-virtual/range {p0 .. p0}, LR4/l;->f()Z

    .line 96
    .line 97
    .line 98
    move-result v13

    .line 99
    const/16 v16, 0x4

    .line 100
    .line 101
    const/16 v17, 0x0

    .line 102
    .line 103
    const/4 v15, 0x0

    .line 104
    move-object v12, v8

    .line 105
    move-object v14, v4

    .line 106
    invoke-direct/range {v12 .. v17}, LR4/s;-><init>(ZLR4/x;Lg6/a;ILkotlin/jvm/internal/g;)V

    .line 107
    .line 108
    .line 109
    iput-object v8, v0, LR4/l;->e:LR4/s;

    .line 110
    .line 111
    new-instance v6, LR4/l$c;

    .line 112
    .line 113
    invoke-direct {v6, v0}, LR4/l$c;-><init>(LR4/l;)V

    .line 114
    .line 115
    .line 116
    new-instance v2, LR4/v;

    .line 117
    .line 118
    move-object v3, v2

    .line 119
    move-object v7, v11

    .line 120
    invoke-direct/range {v3 .. v8}, LR4/v;-><init>(LR4/x;LX5/g;LR4/u;LT4/f;LR4/s;)V

    .line 121
    .line 122
    .line 123
    invoke-virtual/range {p1 .. p1}, Ls3/e;->m()Landroid/content/Context;

    .line 124
    .line 125
    .line 126
    move-result-object v3

    .line 127
    invoke-virtual {v3}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 128
    .line 129
    .line 130
    move-result-object v3

    .line 131
    instance-of v4, v3, Landroid/app/Application;

    .line 132
    .line 133
    if-eqz v4, :cond_0

    .line 134
    .line 135
    move-object v4, v3

    .line 136
    check-cast v4, Landroid/app/Application;

    .line 137
    .line 138
    invoke-virtual {v2}, LR4/v;->d()Landroid/app/Application$ActivityLifecycleCallbacks;

    .line 139
    .line 140
    .line 141
    move-result-object v5

    .line 142
    invoke-virtual {v4, v5}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 143
    .line 144
    .line 145
    new-instance v4, LR4/k;

    .line 146
    .line 147
    invoke-direct {v4, v3, v2}, LR4/k;-><init>(Landroid/content/Context;LR4/v;)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v1, v4}, Ls3/e;->h(Ls3/f;)V

    .line 151
    .line 152
    .line 153
    goto :goto_0

    .line 154
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 155
    .line 156
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 157
    .line 158
    .line 159
    const-string v2, "Failed to register lifecycle callbacks, unexpected context "

    .line 160
    .line 161
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 165
    .line 166
    .line 167
    move-result-object v2

    .line 168
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    const/16 v2, 0x2e

    .line 172
    .line 173
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v1

    .line 180
    const-string v2, "FirebaseSessions"

    .line 181
    .line 182
    invoke-static {v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 183
    .line 184
    .line 185
    :goto_0
    return-void
.end method

.method public static synthetic a(Landroid/content/Context;LR4/v;Ljava/lang/String;Ls3/m;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, LR4/l;->b(Landroid/content/Context;LR4/v;Ljava/lang/String;Ls3/m;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final b(Landroid/content/Context;LR4/v;Ljava/lang/String;Ls3/m;)V
    .locals 0

    .line 1
    const-string p2, "$sessionInitiator"

    .line 2
    .line 3
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p2, "FirebaseSessions"

    .line 7
    .line 8
    const-string p3, "FirebaseApp instance deleted. Sessions library will not collect session data."

    .line 9
    .line 10
    invoke-static {p2, p3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 11
    .line 12
    .line 13
    check-cast p0, Landroid/app/Application;

    .line 14
    .line 15
    invoke-virtual {p1}, LR4/v;->d()Landroid/app/Application$ActivityLifecycleCallbacks;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p0, p1}, Landroid/app/Application;->unregisterActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public static final synthetic c(LR4/l;LR4/p;LX5/d;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LR4/l;->d(LR4/p;LX5/d;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method


# virtual methods
.method public final d(LR4/p;LX5/d;)Ljava/lang/Object;
    .locals 10

    .line 1
    instance-of v0, p2, LR4/l$b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, LR4/l$b;

    .line 7
    .line 8
    iget v1, v0, LR4/l$b;->t:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, LR4/l$b;->t:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, LR4/l$b;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, LR4/l$b;-><init>(LR4/l;LX5/d;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, LR4/l$b;->r:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, LY5/b;->c()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, LR4/l$b;->t:I

    .line 32
    .line 33
    const/4 v3, 0x3

    .line 34
    const/4 v4, 0x2

    .line 35
    const/4 v5, 0x1

    .line 36
    const-string v6, "FirebaseSessions"

    .line 37
    .line 38
    if-eqz v2, :cond_4

    .line 39
    .line 40
    if-eq v2, v5, :cond_3

    .line 41
    .line 42
    if-eq v2, v4, :cond_2

    .line 43
    .line 44
    if-ne v2, v3, :cond_1

    .line 45
    .line 46
    :try_start_0
    invoke-static {p2}, LV5/o;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 47
    .line 48
    .line 49
    goto/16 :goto_6

    .line 50
    .line 51
    :catch_0
    move-exception p1

    .line 52
    goto/16 :goto_5

    .line 53
    .line 54
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 55
    .line 56
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 57
    .line 58
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    throw p1

    .line 62
    :cond_2
    iget-object p1, v0, LR4/l$b;->q:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast p1, Ljava/util/Map;

    .line 65
    .line 66
    iget-object v2, v0, LR4/l$b;->p:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v2, LR4/p;

    .line 69
    .line 70
    iget-object v4, v0, LR4/l$b;->o:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v4, LR4/l;

    .line 73
    .line 74
    invoke-static {p2}, LV5/o;->b(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    goto/16 :goto_4

    .line 78
    .line 79
    :cond_3
    iget-object p1, v0, LR4/l$b;->p:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast p1, LR4/p;

    .line 82
    .line 83
    iget-object v2, v0, LR4/l$b;->o:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v2, LR4/l;

    .line 86
    .line 87
    invoke-static {p2}, LV5/o;->b(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_4
    invoke-static {p2}, LV5/o;->b(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    sget-object p2, LS4/a;->a:LS4/a;

    .line 95
    .line 96
    iput-object p0, v0, LR4/l$b;->o:Ljava/lang/Object;

    .line 97
    .line 98
    iput-object p1, v0, LR4/l$b;->p:Ljava/lang/Object;

    .line 99
    .line 100
    iput v5, v0, LR4/l$b;->t:I

    .line 101
    .line 102
    invoke-virtual {p2, v0}, LS4/a;->c(LX5/d;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object p2

    .line 106
    if-ne p2, v1, :cond_5

    .line 107
    .line 108
    return-object v1

    .line 109
    :cond_5
    move-object v2, p0

    .line 110
    :goto_1
    check-cast p2, Ljava/util/Map;

    .line 111
    .line 112
    invoke-interface {p2}, Ljava/util/Map;->isEmpty()Z

    .line 113
    .line 114
    .line 115
    move-result v5

    .line 116
    if-eqz v5, :cond_6

    .line 117
    .line 118
    const-string p1, "Sessions SDK did not have any dependent SDKs register as dependencies. Events will not be sent."

    .line 119
    .line 120
    :goto_2
    invoke-static {v6, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 121
    .line 122
    .line 123
    sget-object p1, LV5/t;->a:LV5/t;

    .line 124
    .line 125
    return-object p1

    .line 126
    :cond_6
    invoke-interface {p2}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 127
    .line 128
    .line 129
    move-result-object v5

    .line 130
    check-cast v5, Ljava/lang/Iterable;

    .line 131
    .line 132
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 133
    .line 134
    .line 135
    move-result-object v5

    .line 136
    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 137
    .line 138
    .line 139
    move-result v7

    .line 140
    if-eqz v7, :cond_7

    .line 141
    .line 142
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v7

    .line 146
    check-cast v7, LS4/b;

    .line 147
    .line 148
    new-instance v8, LS4/b$b;

    .line 149
    .line 150
    invoke-virtual {p1}, LR4/p;->b()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v9

    .line 154
    invoke-direct {v8, v9}, LS4/b$b;-><init>(Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    invoke-interface {v7, v8}, LS4/b;->b(LS4/b$b;)V

    .line 158
    .line 159
    .line 160
    goto :goto_3

    .line 161
    :cond_7
    invoke-interface {p2}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 162
    .line 163
    .line 164
    move-result-object v5

    .line 165
    check-cast v5, Ljava/lang/Iterable;

    .line 166
    .line 167
    instance-of v7, v5, Ljava/util/Collection;

    .line 168
    .line 169
    if-eqz v7, :cond_8

    .line 170
    .line 171
    move-object v7, v5

    .line 172
    check-cast v7, Ljava/util/Collection;

    .line 173
    .line 174
    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    .line 175
    .line 176
    .line 177
    move-result v7

    .line 178
    if-eqz v7, :cond_8

    .line 179
    .line 180
    goto :goto_7

    .line 181
    :cond_8
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 182
    .line 183
    .line 184
    move-result-object v5

    .line 185
    :cond_9
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 186
    .line 187
    .line 188
    move-result v7

    .line 189
    if-eqz v7, :cond_e

    .line 190
    .line 191
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v7

    .line 195
    check-cast v7, LS4/b;

    .line 196
    .line 197
    invoke-interface {v7}, LS4/b;->c()Z

    .line 198
    .line 199
    .line 200
    move-result v7

    .line 201
    if-eqz v7, :cond_9

    .line 202
    .line 203
    const-string v5, "Data Collection is enabled for at least one Subscriber"

    .line 204
    .line 205
    invoke-static {v6, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 206
    .line 207
    .line 208
    iget-object v5, v2, LR4/l;->c:LT4/f;

    .line 209
    .line 210
    iput-object v2, v0, LR4/l$b;->o:Ljava/lang/Object;

    .line 211
    .line 212
    iput-object p1, v0, LR4/l$b;->p:Ljava/lang/Object;

    .line 213
    .line 214
    iput-object p2, v0, LR4/l$b;->q:Ljava/lang/Object;

    .line 215
    .line 216
    iput v4, v0, LR4/l$b;->t:I

    .line 217
    .line 218
    invoke-virtual {v5, v0}, LT4/f;->g(LX5/d;)Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v4

    .line 222
    if-ne v4, v1, :cond_a

    .line 223
    .line 224
    return-object v1

    .line 225
    :cond_a
    move-object v4, v2

    .line 226
    move-object v2, p1

    .line 227
    move-object p1, p2

    .line 228
    :goto_4
    iget-object p2, v4, LR4/l;->c:LT4/f;

    .line 229
    .line 230
    invoke-virtual {p2}, LT4/f;->d()Z

    .line 231
    .line 232
    .line 233
    move-result p2

    .line 234
    if-nez p2, :cond_b

    .line 235
    .line 236
    const-string p1, "Sessions SDK disabled. Events will not be sent."

    .line 237
    .line 238
    goto :goto_2

    .line 239
    :cond_b
    iget-object p2, v4, LR4/l;->e:LR4/s;

    .line 240
    .line 241
    invoke-virtual {p2}, LR4/s;->c()Z

    .line 242
    .line 243
    .line 244
    move-result p2

    .line 245
    if-nez p2, :cond_c

    .line 246
    .line 247
    const-string p1, "Sessions SDK has dropped this session due to sampling."

    .line 248
    .line 249
    goto/16 :goto_2

    .line 250
    .line 251
    :cond_c
    :try_start_1
    sget-object p2, LR4/r;->a:LR4/r;

    .line 252
    .line 253
    iget-object v5, v4, LR4/l;->a:Ls3/e;

    .line 254
    .line 255
    iget-object v7, v4, LR4/l;->c:LT4/f;

    .line 256
    .line 257
    invoke-virtual {p2, v5, v2, v7, p1}, LR4/r;->c(Ls3/e;LR4/p;LT4/f;Ljava/util/Map;)LR4/q;

    .line 258
    .line 259
    .line 260
    move-result-object p1

    .line 261
    iget-object p2, v4, LR4/l;->g:LR4/o;

    .line 262
    .line 263
    const/4 v2, 0x0

    .line 264
    iput-object v2, v0, LR4/l$b;->o:Ljava/lang/Object;

    .line 265
    .line 266
    iput-object v2, v0, LR4/l$b;->p:Ljava/lang/Object;

    .line 267
    .line 268
    iput-object v2, v0, LR4/l$b;->q:Ljava/lang/Object;

    .line 269
    .line 270
    iput v3, v0, LR4/l$b;->t:I

    .line 271
    .line 272
    invoke-virtual {p2, p1, v0}, LR4/o;->a(LR4/q;LX5/d;)Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    move-result-object p1
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_0

    .line 276
    if-ne p1, v1, :cond_d

    .line 277
    .line 278
    return-object v1

    .line 279
    :goto_5
    const-string p2, "FirebaseApp is not initialized. Sessions library will not collect session data."

    .line 280
    .line 281
    invoke-static {v6, p2, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 282
    .line 283
    .line 284
    :cond_d
    :goto_6
    sget-object p1, LV5/t;->a:LV5/t;

    .line 285
    .line 286
    return-object p1

    .line 287
    :cond_e
    :goto_7
    const-string p1, "Data Collection is disabled for all subscribers. Skipping this Session Event"

    .line 288
    .line 289
    goto/16 :goto_2
.end method

.method public final e(LS4/b;)V
    .locals 2

    .line 1
    const-string v0, "subscriber"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, LS4/a;->a:LS4/a;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, LS4/a;->e(LS4/b;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    .line 16
    const-string v1, "Registering Sessions SDK subscriber with name: "

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-interface {p1}, LS4/b;->a()LS4/b$a;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v1, ", data collection enabled: "

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-interface {p1}, LS4/b;->c()Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    const-string v1, "FirebaseSessions"

    .line 45
    .line 46
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 47
    .line 48
    .line 49
    iget-object v0, p0, LR4/l;->e:LR4/s;

    .line 50
    .line 51
    invoke-virtual {v0}, LR4/s;->e()Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-eqz v0, :cond_0

    .line 56
    .line 57
    new-instance v0, LS4/b$b;

    .line 58
    .line 59
    iget-object v1, p0, LR4/l;->e:LR4/s;

    .line 60
    .line 61
    invoke-virtual {v1}, LR4/s;->d()LR4/p;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    invoke-virtual {v1}, LR4/p;->b()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    invoke-direct {v0, v1}, LS4/b$b;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    invoke-interface {p1, v0}, LS4/b;->b(LS4/b$b;)V

    .line 73
    .line 74
    .line 75
    :cond_0
    return-void
.end method

.method public final f()Z
    .locals 4

    .line 1
    invoke-static {}, Ljava/lang/Math;->random()D

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iget-object v2, p0, LR4/l;->c:LT4/f;

    .line 6
    .line 7
    invoke-virtual {v2}, LT4/f;->b()D

    .line 8
    .line 9
    .line 10
    move-result-wide v2

    .line 11
    cmpg-double v0, v0, v2

    .line 12
    .line 13
    if-gtz v0, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    :goto_0
    return v0
.end method
