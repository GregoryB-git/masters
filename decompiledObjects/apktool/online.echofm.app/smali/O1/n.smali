.class public final LO1/n;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LO1/n$b;,
        LO1/n$a;,
        LO1/n$c;
    }
.end annotation


# static fields
.field public static final a:LO1/n;

.field public static final b:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LO1/n;

    .line 2
    .line 3
    invoke-direct {v0}, LO1/n;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LO1/n;->a:LO1/n;

    .line 7
    .line 8
    new-instance v0, Ljava/util/HashMap;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, LO1/n;->b:Ljava/util/Map;

    .line 14
    .line 15
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a(LO1/n$b;LO1/n$a;)V
    .locals 1

    .line 1
    const-string v0, "feature"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "callback"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object v0, LO1/q;->a:LO1/q;

    .line 12
    .line 13
    new-instance v0, LO1/n$d;

    .line 14
    .line 15
    invoke-direct {v0, p1, p0}, LO1/n$d;-><init>(LO1/n$a;LO1/n$b;)V

    .line 16
    .line 17
    .line 18
    invoke-static {v0}, LO1/q;->h(LO1/q$a;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public static final c(LO1/n$b;)V
    .locals 3

    .line 1
    const-string v0, "feature"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lx1/B;->l()Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const-string v1, "com.facebook.internal.FEATURE_MANAGER"

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {p0}, LO1/n$b;->j()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-static {}, Lx1/B;->B()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-interface {v0, p0, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public static final d(Ljava/lang/String;)LO1/n$b;
    .locals 9

    .line 1
    const-string v0, "className"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, LO1/n;->a:LO1/n;

    .line 7
    .line 8
    invoke-virtual {v0}, LO1/n;->f()V

    .line 9
    .line 10
    .line 11
    sget-object v0, LO1/n;->b:Ljava/util/Map;

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_2

    .line 26
    .line 27
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    check-cast v1, Ljava/util/Map$Entry;

    .line 32
    .line 33
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    check-cast v2, LO1/n$b;

    .line 38
    .line 39
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    check-cast v1, [Ljava/lang/String;

    .line 44
    .line 45
    array-length v3, v1

    .line 46
    const/4 v4, 0x0

    .line 47
    move v5, v4

    .line 48
    :cond_1
    if-ge v5, v3, :cond_0

    .line 49
    .line 50
    aget-object v6, v1, v5

    .line 51
    .line 52
    add-int/lit8 v5, v5, 0x1

    .line 53
    .line 54
    const/4 v7, 0x2

    .line 55
    const/4 v8, 0x0

    .line 56
    invoke-static {p0, v6, v4, v7, v8}, Lkotlin/text/i;->s(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v6

    .line 60
    if-eqz v6, :cond_1

    .line 61
    .line 62
    return-object v2

    .line 63
    :cond_2
    sget-object p0, LO1/n$b;->q:LO1/n$b;

    .line 64
    .line 65
    return-object p0
.end method

.method public static final g(LO1/n$b;)Z
    .locals 5

    .line 1
    const-string v0, "feature"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, LO1/n$b;->q:LO1/n$b;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    if-ne v0, p0, :cond_0

    .line 10
    .line 11
    return v1

    .line 12
    :cond_0
    sget-object v0, LO1/n$b;->r:LO1/n$b;

    .line 13
    .line 14
    const/4 v2, 0x1

    .line 15
    if-ne v0, p0, :cond_1

    .line 16
    .line 17
    return v2

    .line 18
    :cond_1
    invoke-static {}, Lx1/B;->l()Landroid/content/Context;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const-string v3, "com.facebook.internal.FEATURE_MANAGER"

    .line 23
    .line 24
    invoke-virtual {v0, v3, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {p0}, LO1/n$b;->j()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    const/4 v4, 0x0

    .line 33
    invoke-interface {v0, v3, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    if-eqz v0, :cond_2

    .line 38
    .line 39
    invoke-static {}, Lx1/B;->B()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_2

    .line 48
    .line 49
    return v1

    .line 50
    :cond_2
    invoke-virtual {p0}, LO1/n$b;->h()LO1/n$b;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    if-ne v0, p0, :cond_3

    .line 55
    .line 56
    sget-object v0, LO1/n;->a:LO1/n;

    .line 57
    .line 58
    invoke-virtual {v0, p0}, LO1/n;->e(LO1/n$b;)Z

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    goto :goto_0

    .line 63
    :cond_3
    invoke-static {v0}, LO1/n;->g(LO1/n$b;)Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-eqz v0, :cond_4

    .line 68
    .line 69
    sget-object v0, LO1/n;->a:LO1/n;

    .line 70
    .line 71
    invoke-virtual {v0, p0}, LO1/n;->e(LO1/n$b;)Z

    .line 72
    .line 73
    .line 74
    move-result p0

    .line 75
    if-eqz p0, :cond_4

    .line 76
    .line 77
    move v1, v2

    .line 78
    :cond_4
    :goto_0
    return v1
.end method


# virtual methods
.method public final b(LO1/n$b;)Z
    .locals 1

    .line 1
    sget-object v0, LO1/n$c;->a:[I

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    aget p1, v0, p1

    .line 8
    .line 9
    packed-switch p1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    const/4 p1, 0x1

    .line 13
    goto :goto_0

    .line 14
    :pswitch_0
    const/4 p1, 0x0

    .line 15
    :goto_0
    return p1

    .line 16
    nop

    .line 17
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final e(LO1/n$b;)Z
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, LO1/n;->b(LO1/n$b;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    sget-object v1, LO1/q;->a:LO1/q;

    .line 6
    .line 7
    invoke-virtual {p1}, LO1/n$b;->j()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {}, Lx1/B;->m()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-static {p1, v1, v0}, LO1/q;->d(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    return p1
.end method

.method public final declared-synchronized f()V
    .locals 6

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    sget-object v0, LO1/n;->b:Ljava/util/Map;

    .line 3
    .line 4
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 5
    .line 6
    .line 7
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    monitor-exit p0

    .line 11
    return-void

    .line 12
    :cond_0
    :try_start_1
    sget-object v1, LO1/n$b;->w:LO1/n$b;

    .line 13
    .line 14
    const/4 v2, 0x1

    .line 15
    new-array v3, v2, [Ljava/lang/String;

    .line 16
    .line 17
    const-string v4, "com.facebook.appevents.aam."

    .line 18
    .line 19
    const/4 v5, 0x0

    .line 20
    aput-object v4, v3, v5

    .line 21
    .line 22
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    sget-object v1, LO1/n$b;->t:LO1/n$b;

    .line 26
    .line 27
    new-array v3, v2, [Ljava/lang/String;

    .line 28
    .line 29
    const-string v4, "com.facebook.appevents.codeless."

    .line 30
    .line 31
    aput-object v4, v3, v5

    .line 32
    .line 33
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    sget-object v1, LO1/n$b;->u:LO1/n$b;

    .line 37
    .line 38
    new-array v3, v2, [Ljava/lang/String;

    .line 39
    .line 40
    const-string v4, "com.facebook.appevents.cloudbridge."

    .line 41
    .line 42
    aput-object v4, v3, v5

    .line 43
    .line 44
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    sget-object v1, LO1/n$b;->M:LO1/n$b;

    .line 48
    .line 49
    new-array v3, v2, [Ljava/lang/String;

    .line 50
    .line 51
    const-string v4, "com.facebook.internal.instrument.errorreport."

    .line 52
    .line 53
    aput-object v4, v3, v5

    .line 54
    .line 55
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    sget-object v1, LO1/n$b;->N:LO1/n$b;

    .line 59
    .line 60
    new-array v3, v2, [Ljava/lang/String;

    .line 61
    .line 62
    const-string v4, "com.facebook.internal.instrument.anrreport."

    .line 63
    .line 64
    aput-object v4, v3, v5

    .line 65
    .line 66
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    sget-object v1, LO1/n$b;->x:LO1/n$b;

    .line 70
    .line 71
    new-array v3, v2, [Ljava/lang/String;

    .line 72
    .line 73
    const-string v4, "com.facebook.appevents.ml."

    .line 74
    .line 75
    aput-object v4, v3, v5

    .line 76
    .line 77
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    sget-object v1, LO1/n$b;->y:LO1/n$b;

    .line 81
    .line 82
    new-array v3, v2, [Ljava/lang/String;

    .line 83
    .line 84
    const-string v4, "com.facebook.appevents.suggestedevents."

    .line 85
    .line 86
    aput-object v4, v3, v5

    .line 87
    .line 88
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    sget-object v1, LO1/n$b;->v:LO1/n$b;

    .line 92
    .line 93
    new-array v3, v2, [Ljava/lang/String;

    .line 94
    .line 95
    const-string v4, "com.facebook.appevents.restrictivedatafilter.RestrictiveDataManager"

    .line 96
    .line 97
    aput-object v4, v3, v5

    .line 98
    .line 99
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    sget-object v1, LO1/n$b;->z:LO1/n$b;

    .line 103
    .line 104
    new-array v3, v2, [Ljava/lang/String;

    .line 105
    .line 106
    const-string v4, "com.facebook.appevents.integrity.IntegrityManager"

    .line 107
    .line 108
    aput-object v4, v3, v5

    .line 109
    .line 110
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    sget-object v1, LO1/n$b;->B:LO1/n$b;

    .line 114
    .line 115
    new-array v3, v2, [Ljava/lang/String;

    .line 116
    .line 117
    const-string v4, "com.facebook.appevents.integrity.ProtectedModeManager"

    .line 118
    .line 119
    aput-object v4, v3, v5

    .line 120
    .line 121
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    sget-object v1, LO1/n$b;->C:LO1/n$b;

    .line 125
    .line 126
    new-array v3, v2, [Ljava/lang/String;

    .line 127
    .line 128
    const-string v4, "com.facebook.appevents.integrity.MACARuleMatchingManager"

    .line 129
    .line 130
    aput-object v4, v3, v5

    .line 131
    .line 132
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    sget-object v1, LO1/n$b;->D:LO1/n$b;

    .line 136
    .line 137
    new-array v3, v2, [Ljava/lang/String;

    .line 138
    .line 139
    const-string v4, "com.facebook.appevents.eventdeactivation."

    .line 140
    .line 141
    aput-object v4, v3, v5

    .line 142
    .line 143
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    sget-object v1, LO1/n$b;->E:LO1/n$b;

    .line 147
    .line 148
    new-array v3, v2, [Ljava/lang/String;

    .line 149
    .line 150
    const-string v4, "com.facebook.appevents.ondeviceprocessing."

    .line 151
    .line 152
    aput-object v4, v3, v5

    .line 153
    .line 154
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    sget-object v1, LO1/n$b;->G:LO1/n$b;

    .line 158
    .line 159
    new-array v3, v2, [Ljava/lang/String;

    .line 160
    .line 161
    const-string v4, "com.facebook.appevents.iap."

    .line 162
    .line 163
    aput-object v4, v3, v5

    .line 164
    .line 165
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    sget-object v1, LO1/n$b;->O:LO1/n$b;

    .line 169
    .line 170
    new-array v2, v2, [Ljava/lang/String;

    .line 171
    .line 172
    const-string v3, "com.facebook.internal.logging.monitor"

    .line 173
    .line 174
    aput-object v3, v2, v5

    .line 175
    .line 176
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 177
    .line 178
    .line 179
    monitor-exit p0

    .line 180
    return-void

    .line 181
    :catchall_0
    move-exception v0

    .line 182
    monitor-exit p0

    .line 183
    throw v0
.end method
