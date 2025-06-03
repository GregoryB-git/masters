.class public final LR4/r;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LR4/r;

.field public static final b:Lj4/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LR4/r;

    .line 2
    .line 3
    invoke-direct {v0}, LR4/r;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LR4/r;->a:LR4/r;

    .line 7
    .line 8
    new-instance v0, Ll4/d;

    .line 9
    .line 10
    invoke-direct {v0}, Ll4/d;-><init>()V

    .line 11
    .line 12
    .line 13
    sget-object v1, LR4/c;->a:Lk4/a;

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ll4/d;->j(Lk4/a;)Ll4/d;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const/4 v1, 0x1

    .line 20
    invoke-virtual {v0, v1}, Ll4/d;->k(Z)Ll4/d;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0}, Ll4/d;->i()Lj4/a;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    const-string v1, "JsonDataEncoderBuilder()\u2026lues(true)\n      .build()"

    .line 29
    .line 30
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    sput-object v0, LR4/r;->b:Lj4/a;

    .line 34
    .line 35
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ls3/e;)LR4/b;
    .locals 11

    .line 1
    const-string v0, "firebaseApp"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ls3/e;->m()Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const-string v1, "firebaseApp.applicationContext"

    .line 11
    .line 12
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const/4 v2, 0x0

    .line 24
    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 29
    .line 30
    const/16 v3, 0x1c

    .line 31
    .line 32
    if-lt v2, v3, :cond_0

    .line 33
    .line 34
    invoke-static {v0}, Lcom/appsflyer/internal/g;->a(Landroid/content/pm/PackageInfo;)J

    .line 35
    .line 36
    .line 37
    move-result-wide v2

    .line 38
    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    goto :goto_0

    .line 43
    :cond_0
    iget v2, v0, Landroid/content/pm/PackageInfo;->versionCode:I

    .line 44
    .line 45
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    :goto_0
    new-instance v10, LR4/b;

    .line 50
    .line 51
    invoke-virtual {p1}, Ls3/e;->r()Ls3/m;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-virtual {p1}, Ls3/m;->c()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    const-string p1, "firebaseApp.options.applicationId"

    .line 60
    .line 61
    invoke-static {v4, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    sget-object v5, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 65
    .line 66
    const-string p1, "MODEL"

    .line 67
    .line 68
    invoke-static {v5, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    sget-object v7, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    .line 72
    .line 73
    const-string p1, "RELEASE"

    .line 74
    .line 75
    invoke-static {v7, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    sget-object v8, LR4/n;->s:LR4/n;

    .line 79
    .line 80
    new-instance v9, LR4/a;

    .line 81
    .line 82
    const-string p1, "packageName"

    .line 83
    .line 84
    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    iget-object p1, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    .line 88
    .line 89
    if-nez p1, :cond_1

    .line 90
    .line 91
    move-object p1, v2

    .line 92
    :cond_1
    sget-object v0, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 93
    .line 94
    const-string v3, "MANUFACTURER"

    .line 95
    .line 96
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    invoke-direct {v9, v1, p1, v2, v0}, LR4/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    const-string v6, "1.1.0"

    .line 103
    .line 104
    move-object v3, v10

    .line 105
    invoke-direct/range {v3 .. v9}, LR4/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LR4/n;LR4/a;)V

    .line 106
    .line 107
    .line 108
    return-object v10
.end method

.method public final b()Lj4/a;
    .locals 1

    .line 1
    sget-object v0, LR4/r;->b:Lj4/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c(Ls3/e;LR4/p;LT4/f;Ljava/util/Map;)LR4/q;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p4

    .line 4
    .line 5
    const-string v2, "firebaseApp"

    .line 6
    .line 7
    move-object/from16 v3, p1

    .line 8
    .line 9
    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string v2, "sessionDetails"

    .line 13
    .line 14
    move-object/from16 v4, p2

    .line 15
    .line 16
    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const-string v2, "sessionsSettings"

    .line 20
    .line 21
    move-object/from16 v5, p3

    .line 22
    .line 23
    invoke-static {v5, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v2, "subscribers"

    .line 27
    .line 28
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    new-instance v2, LR4/q;

    .line 32
    .line 33
    sget-object v6, LR4/j;->q:LR4/j;

    .line 34
    .line 35
    new-instance v15, LR4/t;

    .line 36
    .line 37
    invoke-virtual/range {p2 .. p2}, LR4/p;->b()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v8

    .line 41
    invoke-virtual/range {p2 .. p2}, LR4/p;->a()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v9

    .line 45
    invoke-virtual/range {p2 .. p2}, LR4/p;->c()I

    .line 46
    .line 47
    .line 48
    move-result v10

    .line 49
    invoke-virtual/range {p2 .. p2}, LR4/p;->d()J

    .line 50
    .line 51
    .line 52
    move-result-wide v11

    .line 53
    new-instance v13, LR4/f;

    .line 54
    .line 55
    sget-object v4, LS4/b$a;->p:LS4/b$a;

    .line 56
    .line 57
    invoke-interface {v1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    check-cast v4, LS4/b;

    .line 62
    .line 63
    invoke-virtual {v0, v4}, LR4/r;->d(LS4/b;)LR4/d;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    sget-object v7, LS4/b$a;->o:LS4/b$a;

    .line 68
    .line 69
    invoke-interface {v1, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    check-cast v1, LS4/b;

    .line 74
    .line 75
    invoke-virtual {v0, v1}, LR4/r;->d(LS4/b;)LR4/d;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    move-object/from16 v17, v2

    .line 80
    .line 81
    invoke-virtual/range {p3 .. p3}, LT4/f;->b()D

    .line 82
    .line 83
    .line 84
    move-result-wide v2

    .line 85
    invoke-direct {v13, v4, v1, v2, v3}, LR4/f;-><init>(LR4/d;LR4/d;D)V

    .line 86
    .line 87
    .line 88
    const/16 v1, 0x20

    .line 89
    .line 90
    const/16 v16, 0x0

    .line 91
    .line 92
    const/4 v14, 0x0

    .line 93
    move-object v7, v15

    .line 94
    move-object v2, v15

    .line 95
    move v15, v1

    .line 96
    invoke-direct/range {v7 .. v16}, LR4/t;-><init>(Ljava/lang/String;Ljava/lang/String;IJLR4/f;Ljava/lang/String;ILkotlin/jvm/internal/g;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual/range {p0 .. p1}, LR4/r;->a(Ls3/e;)LR4/b;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    move-object/from16 v3, v17

    .line 104
    .line 105
    invoke-direct {v3, v6, v2, v1}, LR4/q;-><init>(LR4/j;LR4/t;LR4/b;)V

    .line 106
    .line 107
    .line 108
    return-object v3
.end method

.method public final d(LS4/b;)LR4/d;
    .locals 0

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    sget-object p1, LR4/d;->q:LR4/d;

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-interface {p1}, LS4/b;->c()Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    if-eqz p1, :cond_1

    .line 11
    .line 12
    sget-object p1, LR4/d;->r:LR4/d;

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_1
    sget-object p1, LR4/d;->s:LR4/d;

    .line 16
    .line 17
    :goto_0
    return-object p1
.end method
