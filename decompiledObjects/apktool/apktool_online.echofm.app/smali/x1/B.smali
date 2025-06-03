.class public final Lx1/B;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx1/B$b;,
        Lx1/B$a;
    }
.end annotation


# static fields
.field public static final a:Lx1/B;

.field public static final b:Ljava/lang/String;

.field public static final c:Ljava/util/HashSet;

.field public static d:Ljava/util/concurrent/Executor;

.field public static volatile e:Ljava/lang/String;

.field public static volatile f:Ljava/lang/String;

.field public static volatile g:Ljava/lang/String;

.field public static volatile h:Ljava/lang/Boolean;

.field public static i:Ljava/util/concurrent/atomic/AtomicLong;

.field public static volatile j:Z

.field public static k:Z

.field public static l:LO1/B;

.field public static m:Landroid/content/Context;

.field public static n:I

.field public static final o:Ljava/util/concurrent/locks/ReentrantLock;

.field public static p:Ljava/lang/String;

.field public static q:Z

.field public static r:Z

.field public static s:Z

.field public static final t:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static volatile u:Ljava/lang/String;

.field public static volatile v:Ljava/lang/String;

.field public static w:Lx1/B$a;

.field public static x:Z


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lx1/B;

    .line 2
    .line 3
    invoke-direct {v0}, Lx1/B;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lx1/B;->a:Lx1/B;

    .line 7
    .line 8
    const-class v0, Lx1/B;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sput-object v0, Lx1/B;->b:Ljava/lang/String;

    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    new-array v0, v0, [Lx1/N;

    .line 18
    .line 19
    sget-object v1, Lx1/N;->t:Lx1/N;

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    aput-object v1, v0, v2

    .line 23
    .line 24
    invoke-static {v0}, LW5/I;->c([Ljava/lang/Object;)Ljava/util/HashSet;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    sput-object v0, Lx1/B;->c:Ljava/util/HashSet;

    .line 29
    .line 30
    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    .line 31
    .line 32
    const-wide/32 v3, 0x10000

    .line 33
    .line 34
    .line 35
    invoke-direct {v0, v3, v4}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    .line 36
    .line 37
    .line 38
    sput-object v0, Lx1/B;->i:Ljava/util/concurrent/atomic/AtomicLong;

    .line 39
    .line 40
    const v0, 0xface

    .line 41
    .line 42
    .line 43
    sput v0, Lx1/B;->n:I

    .line 44
    .line 45
    new-instance v0, Ljava/util/concurrent/locks/ReentrantLock;

    .line 46
    .line 47
    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    .line 48
    .line 49
    .line 50
    sput-object v0, Lx1/B;->o:Ljava/util/concurrent/locks/ReentrantLock;

    .line 51
    .line 52
    invoke-static {}, LO1/H;->a()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    sput-object v0, Lx1/B;->p:Ljava/lang/String;

    .line 57
    .line 58
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 59
    .line 60
    invoke-direct {v0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 61
    .line 62
    .line 63
    sput-object v0, Lx1/B;->t:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 64
    .line 65
    const-string v0, "instagram.com"

    .line 66
    .line 67
    sput-object v0, Lx1/B;->u:Ljava/lang/String;

    .line 68
    .line 69
    const-string v0, "facebook.com"

    .line 70
    .line 71
    sput-object v0, Lx1/B;->v:Ljava/lang/String;

    .line 72
    .line 73
    new-instance v0, Lx1/s;

    .line 74
    .line 75
    invoke-direct {v0}, Lx1/s;-><init>()V

    .line 76
    .line 77
    .line 78
    sput-object v0, Lx1/B;->w:Lx1/B$a;

    .line 79
    .line 80
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final A()J
    .locals 2

    .line 1
    invoke-static {}, LO1/Q;->l()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lx1/B;->i:Ljava/util/concurrent/atomic/AtomicLong;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    return-wide v0
.end method

.method public static final B()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "16.3.0"

    .line 2
    .line 3
    return-object v0
.end method

.method public static final C(Lx1/a;Ljava/lang/String;Lorg/json/JSONObject;Lx1/F$b;)Lx1/F;
    .locals 1

    .line 1
    sget-object v0, Lx1/F;->n:Lx1/F$c;

    .line 2
    .line 3
    invoke-virtual {v0, p0, p1, p2, p3}, Lx1/F$c;->A(Lx1/a;Ljava/lang/String;Lorg/json/JSONObject;Lx1/F$b;)Lx1/F;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public static final D()Z
    .locals 1

    .line 1
    sget-boolean v0, Lx1/B;->j:Z

    .line 2
    .line 3
    return v0
.end method

.method public static final declared-synchronized E()Z
    .locals 2

    .line 1
    const-class v0, Lx1/B;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-boolean v1, Lx1/B;->x:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    monitor-exit v0

    .line 7
    return v1

    .line 8
    :catchall_0
    move-exception v1

    .line 9
    monitor-exit v0

    .line 10
    throw v1
.end method

.method public static final F()Z
    .locals 1

    .line 1
    sget-object v0, Lx1/B;->t:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static final G()Z
    .locals 1

    .line 1
    sget-boolean v0, Lx1/B;->k:Z

    .line 2
    .line 3
    return v0
.end method

.method public static final H(Lx1/N;)Z
    .locals 2

    .line 1
    const-string v0, "behavior"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lx1/B;->c:Ljava/util/HashSet;

    .line 7
    .line 8
    monitor-enter v0

    .line 9
    :try_start_0
    invoke-static {}, Lx1/B;->D()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0, p0}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    if-eqz p0, :cond_0

    .line 20
    .line 21
    const/4 p0, 0x1

    .line 22
    goto :goto_0

    .line 23
    :catchall_0
    move-exception p0

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    const/4 p0, 0x0

    .line 26
    :goto_0
    monitor-exit v0

    .line 27
    return p0

    .line 28
    :goto_1
    monitor-exit v0

    .line 29
    throw p0
.end method

.method public static final I(Landroid/content/Context;)V
    .locals 6

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    const/16 v1, 0x80

    .line 13
    .line 14
    invoke-virtual {v0, p0, v1}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    .line 15
    .line 16
    .line 17
    move-result-object p0
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 18
    const-string v0, "try {\n          context.packageManager.getApplicationInfo(\n              context.packageName, PackageManager.GET_META_DATA)\n        } catch (e: PackageManager.NameNotFoundException) {\n          return\n        }"

    .line 19
    .line 20
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    .line 24
    .line 25
    if-nez v0, :cond_1

    .line 26
    .line 27
    return-void

    .line 28
    :cond_1
    sget-object v0, Lx1/B;->e:Ljava/lang/String;

    .line 29
    .line 30
    const/4 v1, 0x0

    .line 31
    if-nez v0, :cond_5

    .line 32
    .line 33
    iget-object v0, p0, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    .line 34
    .line 35
    const-string v2, "com.facebook.sdk.ApplicationId"

    .line 36
    .line 37
    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    instance-of v2, v0, Ljava/lang/String;

    .line 42
    .line 43
    if-eqz v2, :cond_3

    .line 44
    .line 45
    check-cast v0, Ljava/lang/String;

    .line 46
    .line 47
    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 48
    .line 49
    const-string v3, "ROOT"

    .line 50
    .line 51
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    const-string v3, "(this as java.lang.String).toLowerCase(locale)"

    .line 59
    .line 60
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    const-string v3, "fb"

    .line 64
    .line 65
    const/4 v4, 0x0

    .line 66
    const/4 v5, 0x2

    .line 67
    invoke-static {v2, v3, v1, v5, v4}, Lkotlin/text/i;->s(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    if-eqz v2, :cond_2

    .line 72
    .line 73
    invoke-virtual {v0, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    const-string v2, "(this as java.lang.String).substring(startIndex)"

    .line 78
    .line 79
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    :cond_2
    sput-object v0, Lx1/B;->e:Ljava/lang/String;

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_3
    instance-of v0, v0, Ljava/lang/Number;

    .line 86
    .line 87
    if-nez v0, :cond_4

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_4
    new-instance p0, Lx1/o;

    .line 91
    .line 92
    const-string v0, "App Ids cannot be directly placed in the manifest.They must be prefixed by \'fb\' or be placed in the string resource file."

    .line 93
    .line 94
    invoke-direct {p0, v0}, Lx1/o;-><init>(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    throw p0

    .line 98
    :cond_5
    :goto_0
    sget-object v0, Lx1/B;->f:Ljava/lang/String;

    .line 99
    .line 100
    if-nez v0, :cond_6

    .line 101
    .line 102
    iget-object v0, p0, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    .line 103
    .line 104
    const-string v2, "com.facebook.sdk.ApplicationName"

    .line 105
    .line 106
    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    sput-object v0, Lx1/B;->f:Ljava/lang/String;

    .line 111
    .line 112
    :cond_6
    sget-object v0, Lx1/B;->g:Ljava/lang/String;

    .line 113
    .line 114
    if-nez v0, :cond_7

    .line 115
    .line 116
    iget-object v0, p0, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    .line 117
    .line 118
    const-string v2, "com.facebook.sdk.ClientToken"

    .line 119
    .line 120
    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    sput-object v0, Lx1/B;->g:Ljava/lang/String;

    .line 125
    .line 126
    :cond_7
    sget v0, Lx1/B;->n:I

    .line 127
    .line 128
    const v2, 0xface

    .line 129
    .line 130
    .line 131
    if-ne v0, v2, :cond_8

    .line 132
    .line 133
    iget-object v0, p0, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    .line 134
    .line 135
    const-string v3, "com.facebook.sdk.CallbackOffset"

    .line 136
    .line 137
    invoke-virtual {v0, v3, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 138
    .line 139
    .line 140
    move-result v0

    .line 141
    sput v0, Lx1/B;->n:I

    .line 142
    .line 143
    :cond_8
    sget-object v0, Lx1/B;->h:Ljava/lang/Boolean;

    .line 144
    .line 145
    if-nez v0, :cond_9

    .line 146
    .line 147
    iget-object p0, p0, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    .line 148
    .line 149
    const-string v0, "com.facebook.sdk.CodelessDebugLogEnabled"

    .line 150
    .line 151
    invoke-virtual {p0, v0, v1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 152
    .line 153
    .line 154
    move-result p0

    .line 155
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 156
    .line 157
    .line 158
    move-result-object p0

    .line 159
    sput-object p0, Lx1/B;->h:Ljava/lang/Boolean;

    .line 160
    .line 161
    :catch_0
    :cond_9
    return-void
.end method

.method public static final K(Landroid/content/Context;Ljava/lang/String;)V
    .locals 3

    .line 1
    const-class v0, Lx1/B;

    .line 2
    .line 3
    invoke-static {v0}, LT1/a;->d(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    :try_start_0
    const-string v1, "context"

    .line 11
    .line 12
    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const-string v1, "applicationId"

    .line 16
    .line 17
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    if-nez p0, :cond_1

    .line 25
    .line 26
    return-void

    .line 27
    :cond_1
    invoke-static {}, Lx1/B;->t()Ljava/util/concurrent/Executor;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    new-instance v2, Lx1/A;

    .line 32
    .line 33
    invoke-direct {v2, p0, p1}, Lx1/A;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 37
    .line 38
    .line 39
    sget-object p0, LO1/n;->a:LO1/n;

    .line 40
    .line 41
    sget-object p0, LO1/n$b;->E:LO1/n$b;

    .line 42
    .line 43
    invoke-static {p0}, LO1/n;->g(LO1/n$b;)Z

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    if-eqz p0, :cond_2

    .line 48
    .line 49
    invoke-static {}, LI1/c;->d()Z

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    if-eqz p0, :cond_2

    .line 54
    .line 55
    const-string p0, "com.facebook.sdk.attributionTracking"

    .line 56
    .line 57
    invoke-static {p1, p0}, LI1/c;->g(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :catchall_0
    move-exception p0

    .line 62
    goto :goto_1

    .line 63
    :cond_2
    :goto_0
    return-void

    .line 64
    :goto_1
    invoke-static {p0, v0}, LT1/a;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    return-void
.end method

.method public static final L(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "$applicationContext"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "$applicationId"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object v0, Lx1/B;->a:Lx1/B;

    .line 12
    .line 13
    invoke-virtual {v0, p0, p1}, Lx1/B;->J(Landroid/content/Context;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public static final declared-synchronized M(Landroid/content/Context;)V
    .locals 2

    .line 1
    const-class v0, Lx1/B;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    const-string v1, "applicationContext"

    .line 5
    .line 6
    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-static {p0, v1}, Lx1/B;->N(Landroid/content/Context;Lx1/B$b;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    .line 13
    monitor-exit v0

    .line 14
    return-void

    .line 15
    :catchall_0
    move-exception p0

    .line 16
    monitor-exit v0

    .line 17
    throw p0
.end method

.method public static final declared-synchronized N(Landroid/content/Context;Lx1/B$b;)V
    .locals 4

    .line 1
    const-class v0, Lx1/B;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    const-string v1, "applicationContext"

    .line 5
    .line 6
    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    sget-object v1, Lx1/B;->t:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_1

    .line 16
    .line 17
    if-nez p1, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-interface {p1}, Lx1/B$b;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    .line 22
    .line 23
    :goto_0
    monitor-exit v0

    .line 24
    return-void

    .line 25
    :catchall_0
    move-exception p0

    .line 26
    goto/16 :goto_2

    .line 27
    .line 28
    :cond_1
    const/4 v2, 0x0

    .line 29
    :try_start_1
    invoke-static {p0, v2}, LO1/Q;->e(Landroid/content/Context;Z)V

    .line 30
    .line 31
    .line 32
    invoke-static {p0, v2}, LO1/Q;->f(Landroid/content/Context;Z)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    const-string v3, "applicationContext.applicationContext"

    .line 40
    .line 41
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    sput-object v2, Lx1/B;->m:Landroid/content/Context;

    .line 45
    .line 46
    sget-object v2, Ly1/p;->b:Ly1/p$a;

    .line 47
    .line 48
    invoke-virtual {v2, p0}, Ly1/p$a;->d(Landroid/content/Context;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    sget-object p0, Lx1/B;->m:Landroid/content/Context;

    .line 52
    .line 53
    const/4 v2, 0x0

    .line 54
    if-eqz p0, :cond_9

    .line 55
    .line 56
    invoke-static {p0}, Lx1/B;->I(Landroid/content/Context;)V

    .line 57
    .line 58
    .line 59
    sget-object p0, Lx1/B;->e:Ljava/lang/String;

    .line 60
    .line 61
    if-eqz p0, :cond_8

    .line 62
    .line 63
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 64
    .line 65
    .line 66
    move-result p0

    .line 67
    if-eqz p0, :cond_8

    .line 68
    .line 69
    sget-object p0, Lx1/B;->g:Ljava/lang/String;

    .line 70
    .line 71
    if-eqz p0, :cond_7

    .line 72
    .line 73
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 74
    .line 75
    .line 76
    move-result p0

    .line 77
    if-eqz p0, :cond_7

    .line 78
    .line 79
    const/4 p0, 0x1

    .line 80
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 81
    .line 82
    .line 83
    invoke-static {}, Lx1/B;->o()Z

    .line 84
    .line 85
    .line 86
    move-result p0

    .line 87
    if-eqz p0, :cond_2

    .line 88
    .line 89
    invoke-static {}, Lx1/B;->j()V

    .line 90
    .line 91
    .line 92
    :cond_2
    sget-object p0, Lx1/B;->m:Landroid/content/Context;

    .line 93
    .line 94
    if-eqz p0, :cond_6

    .line 95
    .line 96
    instance-of p0, p0, Landroid/app/Application;

    .line 97
    .line 98
    if-eqz p0, :cond_4

    .line 99
    .line 100
    invoke-static {}, Lx1/X;->f()Z

    .line 101
    .line 102
    .line 103
    move-result p0

    .line 104
    if-eqz p0, :cond_4

    .line 105
    .line 106
    sget-object p0, LG1/f;->a:LG1/f;

    .line 107
    .line 108
    sget-object p0, Lx1/B;->m:Landroid/content/Context;

    .line 109
    .line 110
    if-eqz p0, :cond_3

    .line 111
    .line 112
    check-cast p0, Landroid/app/Application;

    .line 113
    .line 114
    sget-object v1, Lx1/B;->e:Ljava/lang/String;

    .line 115
    .line 116
    invoke-static {p0, v1}, LG1/f;->x(Landroid/app/Application;Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_3
    const-string p0, "applicationContext"

    .line 121
    .line 122
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->n(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    throw v2

    .line 126
    :cond_4
    :goto_1
    invoke-static {}, LO1/v;->h()V

    .line 127
    .line 128
    .line 129
    invoke-static {}, LO1/E;->x()V

    .line 130
    .line 131
    .line 132
    sget-object p0, LO1/b;->b:LO1/b$a;

    .line 133
    .line 134
    sget-object v1, Lx1/B;->m:Landroid/content/Context;

    .line 135
    .line 136
    if-eqz v1, :cond_5

    .line 137
    .line 138
    invoke-virtual {p0, v1}, LO1/b$a;->a(Landroid/content/Context;)LO1/b;

    .line 139
    .line 140
    .line 141
    new-instance p0, LO1/B;

    .line 142
    .line 143
    new-instance v1, Lx1/t;

    .line 144
    .line 145
    invoke-direct {v1}, Lx1/t;-><init>()V

    .line 146
    .line 147
    .line 148
    invoke-direct {p0, v1}, LO1/B;-><init>(Ljava/util/concurrent/Callable;)V

    .line 149
    .line 150
    .line 151
    sput-object p0, Lx1/B;->l:LO1/B;

    .line 152
    .line 153
    sget-object p0, LO1/n;->a:LO1/n;

    .line 154
    .line 155
    sget-object p0, LO1/n$b;->I:LO1/n$b;

    .line 156
    .line 157
    new-instance v1, Lx1/u;

    .line 158
    .line 159
    invoke-direct {v1}, Lx1/u;-><init>()V

    .line 160
    .line 161
    .line 162
    invoke-static {p0, v1}, LO1/n;->a(LO1/n$b;LO1/n$a;)V

    .line 163
    .line 164
    .line 165
    sget-object p0, LO1/n$b;->s:LO1/n$b;

    .line 166
    .line 167
    new-instance v1, Lx1/v;

    .line 168
    .line 169
    invoke-direct {v1}, Lx1/v;-><init>()V

    .line 170
    .line 171
    .line 172
    invoke-static {p0, v1}, LO1/n;->a(LO1/n$b;LO1/n$a;)V

    .line 173
    .line 174
    .line 175
    sget-object p0, LO1/n$b;->T:LO1/n$b;

    .line 176
    .line 177
    new-instance v1, Lx1/w;

    .line 178
    .line 179
    invoke-direct {v1}, Lx1/w;-><init>()V

    .line 180
    .line 181
    .line 182
    invoke-static {p0, v1}, LO1/n;->a(LO1/n$b;LO1/n$a;)V

    .line 183
    .line 184
    .line 185
    sget-object p0, LO1/n$b;->U:LO1/n$b;

    .line 186
    .line 187
    new-instance v1, Lx1/x;

    .line 188
    .line 189
    invoke-direct {v1}, Lx1/x;-><init>()V

    .line 190
    .line 191
    .line 192
    invoke-static {p0, v1}, LO1/n;->a(LO1/n$b;LO1/n$a;)V

    .line 193
    .line 194
    .line 195
    sget-object p0, LO1/n$b;->V:LO1/n$b;

    .line 196
    .line 197
    new-instance v1, Lx1/y;

    .line 198
    .line 199
    invoke-direct {v1}, Lx1/y;-><init>()V

    .line 200
    .line 201
    .line 202
    invoke-static {p0, v1}, LO1/n;->a(LO1/n$b;LO1/n$a;)V

    .line 203
    .line 204
    .line 205
    new-instance p0, Ljava/util/concurrent/FutureTask;

    .line 206
    .line 207
    new-instance v1, Lx1/z;

    .line 208
    .line 209
    invoke-direct {v1, p1}, Lx1/z;-><init>(Lx1/B$b;)V

    .line 210
    .line 211
    .line 212
    invoke-direct {p0, v1}, Ljava/util/concurrent/FutureTask;-><init>(Ljava/util/concurrent/Callable;)V

    .line 213
    .line 214
    .line 215
    invoke-static {}, Lx1/B;->t()Ljava/util/concurrent/Executor;

    .line 216
    .line 217
    .line 218
    move-result-object p1

    .line 219
    invoke-interface {p1, p0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 220
    .line 221
    .line 222
    monitor-exit v0

    .line 223
    return-void

    .line 224
    :cond_5
    :try_start_2
    const-string p0, "applicationContext"

    .line 225
    .line 226
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->n(Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    throw v2

    .line 230
    :cond_6
    const-string p0, "applicationContext"

    .line 231
    .line 232
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->n(Ljava/lang/String;)V

    .line 233
    .line 234
    .line 235
    throw v2

    .line 236
    :cond_7
    new-instance p0, Lx1/o;

    .line 237
    .line 238
    const-string p1, "A valid Facebook app client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk."

    .line 239
    .line 240
    invoke-direct {p0, p1}, Lx1/o;-><init>(Ljava/lang/String;)V

    .line 241
    .line 242
    .line 243
    throw p0

    .line 244
    :cond_8
    new-instance p0, Lx1/o;

    .line 245
    .line 246
    const-string p1, "A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk."

    .line 247
    .line 248
    invoke-direct {p0, p1}, Lx1/o;-><init>(Ljava/lang/String;)V

    .line 249
    .line 250
    .line 251
    throw p0

    .line 252
    :cond_9
    const-string p0, "applicationContext"

    .line 253
    .line 254
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->n(Ljava/lang/String;)V

    .line 255
    .line 256
    .line 257
    throw v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 258
    :goto_2
    monitor-exit v0

    .line 259
    throw p0
.end method

.method public static final O()Ljava/io/File;
    .locals 1

    .line 1
    sget-object v0, Lx1/B;->m:Landroid/content/Context;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_0
    const-string v0, "applicationContext"

    .line 11
    .line 12
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->n(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    throw v0
.end method

.method public static final P(Z)V
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    invoke-static {}, LQ1/g;->d()V

    .line 4
    .line 5
    .line 6
    :cond_0
    return-void
.end method

.method public static final Q(Z)V
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    invoke-static {}, Ly1/B;->a()V

    .line 4
    .line 5
    .line 6
    :cond_0
    return-void
.end method

.method public static final R(Z)V
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x1

    .line 4
    sput-boolean p0, Lx1/B;->q:Z

    .line 5
    .line 6
    :cond_0
    return-void
.end method

.method public static final S(Z)V
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x1

    .line 4
    sput-boolean p0, Lx1/B;->r:Z

    .line 5
    .line 6
    :cond_0
    return-void
.end method

.method public static final T(Z)V
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x1

    .line 4
    sput-boolean p0, Lx1/B;->s:Z

    .line 5
    .line 6
    :cond_0
    return-void
.end method

.method public static final U(Lx1/B$b;)Ljava/lang/Void;
    .locals 2

    .line 1
    sget-object v0, Lx1/g;->f:Lx1/g$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lx1/g$a;->e()Lx1/g;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lx1/g;->j()Z

    .line 8
    .line 9
    .line 10
    sget-object v0, Lx1/Q;->d:Lx1/Q$a;

    .line 11
    .line 12
    invoke-virtual {v0}, Lx1/Q$a;->a()Lx1/Q;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0}, Lx1/Q;->d()Z

    .line 17
    .line 18
    .line 19
    sget-object v0, Lx1/a;->z:Lx1/a$c;

    .line 20
    .line 21
    invoke-virtual {v0}, Lx1/a$c;->g()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    sget-object v0, Lx1/O;->v:Lx1/O$b;

    .line 28
    .line 29
    invoke-virtual {v0}, Lx1/O$b;->b()Lx1/O;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    if-nez v1, :cond_0

    .line 34
    .line 35
    invoke-virtual {v0}, Lx1/O$b;->a()V

    .line 36
    .line 37
    .line 38
    :cond_0
    if-nez p0, :cond_1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    invoke-interface {p0}, Lx1/B$b;->a()V

    .line 42
    .line 43
    .line 44
    :goto_0
    sget-object p0, Ly1/p;->b:Ly1/p$a;

    .line 45
    .line 46
    invoke-static {}, Lx1/B;->l()Landroid/content/Context;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    sget-object v1, Lx1/B;->e:Ljava/lang/String;

    .line 51
    .line 52
    invoke-virtual {p0, v0, v1}, Ly1/p$a;->g(Landroid/content/Context;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    invoke-static {}, Lx1/X;->n()V

    .line 56
    .line 57
    .line 58
    invoke-static {}, Lx1/B;->l()Landroid/content/Context;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    const-string v1, "getApplicationContext().applicationContext"

    .line 67
    .line 68
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0, v0}, Ly1/p$a;->h(Landroid/content/Context;)Ly1/p;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    invoke-virtual {p0}, Ly1/p;->a()V

    .line 76
    .line 77
    .line 78
    const/4 p0, 0x0

    .line 79
    return-object p0
.end method

.method public static final V(Z)V
    .locals 1

    .line 1
    invoke-static {p0}, Lx1/X;->s(Z)V

    .line 2
    .line 3
    .line 4
    if-eqz p0, :cond_0

    .line 5
    .line 6
    invoke-static {}, Lx1/B;->l()Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    check-cast p0, Landroid/app/Application;

    .line 11
    .line 12
    sget-object v0, LG1/f;->a:LG1/f;

    .line 13
    .line 14
    invoke-static {}, Lx1/B;->m()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-static {p0, v0}, LG1/f;->x(Landroid/app/Application;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
.end method

.method public static final W([Ljava/lang/String;II)V
    .locals 5

    .line 1
    const-string v0, "data_processing_options"

    .line 2
    .line 3
    const-class v1, Lx1/B;

    .line 4
    .line 5
    invoke-static {v1}, LT1/a;->d(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    const/4 v2, 0x0

    .line 13
    if-nez p0, :cond_1

    .line 14
    .line 15
    :try_start_0
    new-array p0, v2, [Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :catchall_0
    move-exception p0

    .line 19
    goto :goto_1

    .line 20
    :cond_1
    :goto_0
    :try_start_1
    new-instance v3, Lorg/json/JSONObject;

    .line 21
    .line 22
    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 23
    .line 24
    .line 25
    new-instance v4, Lorg/json/JSONArray;

    .line 26
    .line 27
    invoke-static {p0}, LW5/g;->u([Ljava/lang/Object;)Ljava/util/List;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, Ljava/util/Collection;

    .line 32
    .line 33
    invoke-direct {v4, p0}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v3, v0, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 37
    .line 38
    .line 39
    const-string p0, "data_processing_options_country"

    .line 40
    .line 41
    invoke-virtual {v3, p0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 42
    .line 43
    .line 44
    const-string p0, "data_processing_options_state"

    .line 45
    .line 46
    invoke-virtual {v3, p0, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 47
    .line 48
    .line 49
    sget-object p0, Lx1/B;->m:Landroid/content/Context;

    .line 50
    .line 51
    if-eqz p0, :cond_2

    .line 52
    .line 53
    const-string p1, "com.facebook.sdk.DataProcessingOptions"

    .line 54
    .line 55
    invoke-virtual {p0, p1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    invoke-virtual {v3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-interface {p0, v0, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 72
    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_2
    const-string p0, "applicationContext"

    .line 76
    .line 77
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->n(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    const/4 p0, 0x0

    .line 81
    throw p0
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 82
    :goto_1
    invoke-static {p0, v1}, LT1/a;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    :catch_0
    :goto_2
    return-void
.end method

.method public static synthetic a()Ljava/io/File;
    .locals 1

    .line 1
    invoke-static {}, Lx1/B;->O()Ljava/io/File;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static synthetic b(Z)V
    .locals 0

    .line 1
    invoke-static {p0}, Lx1/B;->P(Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic c(Z)V
    .locals 0

    .line 1
    invoke-static {p0}, Lx1/B;->S(Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic d(Lx1/B$b;)Ljava/lang/Void;
    .locals 0

    .line 1
    invoke-static {p0}, Lx1/B;->U(Lx1/B$b;)Ljava/lang/Void;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic e(Lx1/a;Ljava/lang/String;Lorg/json/JSONObject;Lx1/F$b;)Lx1/F;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lx1/B;->C(Lx1/a;Ljava/lang/String;Lorg/json/JSONObject;Lx1/F$b;)Lx1/F;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic f(Z)V
    .locals 0

    .line 1
    invoke-static {p0}, Lx1/B;->Q(Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic g(Z)V
    .locals 0

    .line 1
    invoke-static {p0}, Lx1/B;->R(Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic h(Z)V
    .locals 0

    .line 1
    invoke-static {p0}, Lx1/B;->T(Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic i(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lx1/B;->L(Landroid/content/Context;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final j()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    sput-boolean v0, Lx1/B;->x:Z

    .line 3
    .line 4
    return-void
.end method

.method public static final k()Z
    .locals 1

    .line 1
    invoke-static {}, Lx1/X;->d()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public static final l()Landroid/content/Context;
    .locals 1

    .line 1
    invoke-static {}, LO1/Q;->l()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lx1/B;->m:Landroid/content/Context;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return-object v0

    .line 9
    :cond_0
    const-string v0, "applicationContext"

    .line 10
    .line 11
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->n(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    throw v0
.end method

.method public static final m()Ljava/lang/String;
    .locals 2

    .line 1
    invoke-static {}, LO1/Q;->l()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lx1/B;->e:Ljava/lang/String;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return-object v0

    .line 9
    :cond_0
    new-instance v0, Lx1/o;

    .line 10
    .line 11
    const-string v1, "A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk."

    .line 12
    .line 13
    invoke-direct {v0, v1}, Lx1/o;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    throw v0
.end method

.method public static final n()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {}, LO1/Q;->l()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lx1/B;->f:Ljava/lang/String;

    .line 5
    .line 6
    return-object v0
.end method

.method public static final o()Z
    .locals 1

    .line 1
    invoke-static {}, Lx1/X;->e()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public static final p()Z
    .locals 1

    .line 1
    invoke-static {}, Lx1/X;->f()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public static final q()I
    .locals 1

    .line 1
    invoke-static {}, LO1/Q;->l()V

    .line 2
    .line 3
    .line 4
    sget v0, Lx1/B;->n:I

    .line 5
    .line 6
    return v0
.end method

.method public static final r()Ljava/lang/String;
    .locals 2

    .line 1
    invoke-static {}, LO1/Q;->l()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lx1/B;->g:Ljava/lang/String;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return-object v0

    .line 9
    :cond_0
    new-instance v0, Lx1/o;

    .line 10
    .line 11
    const-string v1, "A valid Facebook client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk. Visit https://developers.facebook.com/docs/android/getting-started#add-app_id for more information."

    .line 12
    .line 13
    invoke-direct {v0, v1}, Lx1/o;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    throw v0
.end method

.method public static final s()Z
    .locals 1

    .line 1
    invoke-static {}, Lx1/X;->g()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public static final t()Ljava/util/concurrent/Executor;
    .locals 2

    .line 1
    sget-object v0, Lx1/B;->o:Ljava/util/concurrent/locks/ReentrantLock;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 4
    .line 5
    .line 6
    :try_start_0
    sget-object v1, Lx1/B;->d:Ljava/util/concurrent/Executor;

    .line 7
    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    sget-object v1, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    .line 11
    .line 12
    sput-object v1, Lx1/B;->d:Ljava/util/concurrent/Executor;

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :catchall_0
    move-exception v1

    .line 16
    goto :goto_1

    .line 17
    :cond_0
    :goto_0
    sget-object v1, LV5/t;->a:LV5/t;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 20
    .line 21
    .line 22
    sget-object v0, Lx1/B;->d:Ljava/util/concurrent/Executor;

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    return-object v0

    .line 27
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 28
    .line 29
    const-string v1, "Required value was null."

    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    throw v0

    .line 39
    :goto_1
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 40
    .line 41
    .line 42
    throw v1
.end method

.method public static final u()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lx1/B;->v:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final v()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "fb.gg"

    .line 2
    .line 3
    return-object v0
.end method

.method public static final w()Ljava/lang/String;
    .locals 5

    .line 1
    sget-object v0, LO1/P;->a:LO1/P;

    .line 2
    .line 3
    sget-object v0, Lx1/B;->b:Ljava/lang/String;

    .line 4
    .line 5
    sget-object v1, Lkotlin/jvm/internal/x;->a:Lkotlin/jvm/internal/x;

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    new-array v2, v1, [Ljava/lang/Object;

    .line 9
    .line 10
    sget-object v3, Lx1/B;->p:Ljava/lang/String;

    .line 11
    .line 12
    const/4 v4, 0x0

    .line 13
    aput-object v3, v2, v4

    .line 14
    .line 15
    invoke-static {v2, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const-string v2, "getGraphApiVersion: %s"

    .line 20
    .line 21
    invoke-static {v2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    const-string v2, "java.lang.String.format(format, *args)"

    .line 26
    .line 27
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-static {v0, v1}, LO1/P;->j0(Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    sget-object v0, Lx1/B;->p:Ljava/lang/String;

    .line 34
    .line 35
    return-object v0
.end method

.method public static final x()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lx1/a;->z:Lx1/a$c;

    .line 2
    .line 3
    invoke-virtual {v0}, Lx1/a$c;->e()Lx1/a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Lx1/a;->h()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    :goto_0
    invoke-static {v0}, LO1/P;->E(Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    return-object v0
.end method

.method public static final y()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lx1/B;->u:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final z(Landroid/content/Context;)Z
    .locals 2

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, LO1/Q;->l()V

    .line 7
    .line 8
    .line 9
    const-string v0, "com.facebook.sdk.appEventPreferences"

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    const-string v0, "limitEventUsage"

    .line 17
    .line 18
    invoke-interface {p0, v0, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    return p0
.end method


# virtual methods
.method public final J(Landroid/content/Context;Ljava/lang/String;)V
    .locals 12

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    invoke-static {p0}, LT1/a;->d(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v2

    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    :try_start_0
    sget-object v2, LO1/a;->f:LO1/a$a;

    .line 11
    .line 12
    invoke-virtual {v2, p1}, LO1/a$a;->e(Landroid/content/Context;)LO1/a;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    const-string v3, "com.facebook.sdk.attributionTracking"

    .line 17
    .line 18
    invoke-virtual {p1, v3, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    const-string v4, "ping"

    .line 23
    .line 24
    invoke-static {p2, v4}, Lkotlin/jvm/internal/Intrinsics;->i(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    const-wide/16 v5, 0x0

    .line 29
    .line 30
    invoke-interface {v3, v4, v5, v6}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 31
    .line 32
    .line 33
    move-result-wide v7
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    :try_start_1
    sget-object v9, LG1/h;->a:LG1/h;

    .line 35
    .line 36
    sget-object v9, LG1/h$a;->o:LG1/h$a;

    .line 37
    .line 38
    sget-object v10, Ly1/p;->b:Ly1/p$a;

    .line 39
    .line 40
    invoke-virtual {v10, p1}, Ly1/p$a;->d(Landroid/content/Context;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v10

    .line 44
    invoke-static {p1}, Lx1/B;->z(Landroid/content/Context;)Z

    .line 45
    .line 46
    .line 47
    move-result v11

    .line 48
    invoke-static {v9, v2, v10, v11, p1}, LG1/h;->a(LG1/h$a;LO1/a;Ljava/lang/String;ZLandroid/content/Context;)Lorg/json/JSONObject;

    .line 49
    .line 50
    .line 51
    move-result-object p1
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 52
    :try_start_2
    sget-object v2, Lkotlin/jvm/internal/x;->a:Lkotlin/jvm/internal/x;

    .line 53
    .line 54
    const-string v2, "%s/activities"

    .line 55
    .line 56
    new-array v9, v0, [Ljava/lang/Object;

    .line 57
    .line 58
    aput-object p2, v9, v1

    .line 59
    .line 60
    invoke-static {v9, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p2

    .line 64
    invoke-static {v2, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p2

    .line 68
    const-string v0, "java.lang.String.format(format, *args)"

    .line 69
    .line 70
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    sget-object v0, Lx1/B;->w:Lx1/B$a;

    .line 74
    .line 75
    const/4 v1, 0x0

    .line 76
    invoke-interface {v0, v1, p2, p1, v1}, Lx1/B$a;->a(Lx1/a;Ljava/lang/String;Lorg/json/JSONObject;Lx1/F$b;)Lx1/F;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    cmp-long p2, v7, v5

    .line 81
    .line 82
    if-nez p2, :cond_1

    .line 83
    .line 84
    invoke-virtual {p1}, Lx1/F;->k()Lx1/K;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    invoke-virtual {p1}, Lx1/K;->b()Lx1/r;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    if-nez p1, :cond_1

    .line 93
    .line 94
    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 99
    .line 100
    .line 101
    move-result-wide v0

    .line 102
    invoke-interface {p1, v4, v0, v1}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 103
    .line 104
    .line 105
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 106
    .line 107
    .line 108
    goto :goto_1

    .line 109
    :catchall_0
    move-exception p1

    .line 110
    goto :goto_2

    .line 111
    :catch_0
    move-exception p1

    .line 112
    goto :goto_0

    .line 113
    :catch_1
    move-exception p1

    .line 114
    new-instance p2, Lx1/o;

    .line 115
    .line 116
    const-string v0, "An error occurred while publishing install."

    .line 117
    .line 118
    invoke-direct {p2, v0, p1}, Lx1/o;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 119
    .line 120
    .line 121
    throw p2
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 122
    :goto_0
    :try_start_3
    const-string p2, "Facebook-publish"

    .line 123
    .line 124
    invoke-static {p2, p1}, LO1/P;->i0(Ljava/lang/String;Ljava/lang/Exception;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 125
    .line 126
    .line 127
    :cond_1
    :goto_1
    return-void

    .line 128
    :goto_2
    invoke-static {p1, p0}, LT1/a;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    return-void
.end method
