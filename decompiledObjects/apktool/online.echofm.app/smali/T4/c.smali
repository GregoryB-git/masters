.class public final LT4/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LT4/h;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LT4/c$a;
    }
.end annotation


# static fields
.field public static final g:LT4/c$a;


# instance fields
.field public final a:LX5/g;

.field public final b:Ls4/i;

.field public final c:LR4/b;

.field public final d:LT4/a;

.field public final e:LT4/g;

.field public final f:Ly6/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LT4/c$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LT4/c$a;-><init>(Lkotlin/jvm/internal/g;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LT4/c;->g:LT4/c$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(LX5/g;Ls4/i;LR4/b;LT4/a;LP/f;)V
    .locals 1

    .line 1
    const-string v0, "backgroundDispatcher"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "firebaseInstallationsApi"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "appInfo"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "configsFetcher"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "dataStore"

    .line 22
    .line 23
    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, LT4/c;->a:LX5/g;

    .line 30
    .line 31
    iput-object p2, p0, LT4/c;->b:Ls4/i;

    .line 32
    .line 33
    iput-object p3, p0, LT4/c;->c:LR4/b;

    .line 34
    .line 35
    iput-object p4, p0, LT4/c;->d:LT4/a;

    .line 36
    .line 37
    new-instance p1, LT4/g;

    .line 38
    .line 39
    invoke-direct {p1, p5}, LT4/g;-><init>(LP/f;)V

    .line 40
    .line 41
    .line 42
    iput-object p1, p0, LT4/c;->e:LT4/g;

    .line 43
    .line 44
    const/4 p1, 0x1

    .line 45
    const/4 p2, 0x0

    .line 46
    const/4 p3, 0x0

    .line 47
    invoke-static {p3, p1, p2}, Ly6/c;->b(ZILjava/lang/Object;)Ly6/a;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    iput-object p1, p0, LT4/c;->f:Ly6/a;

    .line 52
    .line 53
    return-void
.end method

.method public static final synthetic e(LT4/c;)LT4/g;
    .locals 0

    .line 1
    iget-object p0, p0, LT4/c;->e:LT4/g;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public a()Ljava/lang/Boolean;
    .locals 1

    .line 1
    iget-object v0, p0, LT4/c;->e:LT4/g;

    .line 2
    .line 3
    invoke-virtual {v0}, LT4/g;->g()Ljava/lang/Boolean;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public b()Ljava/lang/Double;
    .locals 1

    .line 1
    iget-object v0, p0, LT4/c;->e:LT4/g;

    .line 2
    .line 3
    invoke-virtual {v0}, LT4/g;->f()Ljava/lang/Double;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public c(LX5/d;)Ljava/lang/Object;
    .locals 14

    .line 1
    instance-of v0, p1, LT4/c$b;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, LT4/c$b;

    iget v1, v0, LT4/c$b;->s:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LT4/c$b;->s:I

    goto :goto_0

    :cond_0
    new-instance v0, LT4/c$b;

    invoke-direct {v0, p0, p1}, LT4/c$b;-><init>(LT4/c;LX5/d;)V

    :goto_0
    iget-object p1, v0, LT4/c$b;->q:Ljava/lang/Object;

    invoke-static {}, LY5/b;->c()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LT4/c$b;->s:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v2, :cond_4

    if-eq v2, v5, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v0, v0, LT4/c$b;->o:Ljava/lang/Object;

    check-cast v0, Ly6/a;

    :try_start_0
    invoke-static {p1}, LV5/o;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_3

    :catchall_0
    move-exception p1

    goto/16 :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v2, v0, LT4/c$b;->p:Ljava/lang/Object;

    check-cast v2, Ly6/a;

    iget-object v7, v0, LT4/c$b;->o:Ljava/lang/Object;

    check-cast v7, LT4/c;

    :try_start_1
    invoke-static {p1}, LV5/o;->b(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto/16 :goto_2

    :catchall_1
    move-exception p1

    move-object v0, v2

    goto/16 :goto_4

    :cond_3
    iget-object v2, v0, LT4/c$b;->p:Ljava/lang/Object;

    check-cast v2, Ly6/a;

    iget-object v7, v0, LT4/c$b;->o:Ljava/lang/Object;

    check-cast v7, LT4/c;

    invoke-static {p1}, LV5/o;->b(Ljava/lang/Object;)V

    move-object p1, v2

    goto :goto_1

    :cond_4
    invoke-static {p1}, LV5/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LT4/c;->f:Ly6/a;

    invoke-interface {p1}, Ly6/a;->c()Z

    move-result p1

    if-nez p1, :cond_5

    iget-object p1, p0, LT4/c;->e:LT4/g;

    invoke-virtual {p1}, LT4/g;->d()Z

    move-result p1

    if-nez p1, :cond_5

    sget-object p1, LV5/t;->a:LV5/t;

    return-object p1

    :cond_5
    iget-object p1, p0, LT4/c;->f:Ly6/a;

    iput-object p0, v0, LT4/c$b;->o:Ljava/lang/Object;

    iput-object p1, v0, LT4/c$b;->p:Ljava/lang/Object;

    iput v5, v0, LT4/c$b;->s:I

    invoke-interface {p1, v6, v0}, Ly6/a;->a(Ljava/lang/Object;LX5/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_6

    return-object v1

    :cond_6
    move-object v7, p0

    :goto_1
    :try_start_2
    iget-object v2, v7, LT4/c;->e:LT4/g;

    invoke-virtual {v2}, LT4/g;->d()Z

    move-result v2

    if-nez v2, :cond_7

    sget-object v0, LV5/t;->a:LV5/t;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    invoke-interface {p1, v6}, Ly6/a;->b(Ljava/lang/Object;)V

    return-object v0

    :catchall_2
    move-exception v0

    move-object v13, v0

    move-object v0, p1

    move-object p1, v13

    goto/16 :goto_4

    :cond_7
    :try_start_3
    iget-object v2, v7, LT4/c;->b:Ls4/i;

    invoke-interface {v2}, Ls4/i;->a()LV2/j;

    move-result-object v2

    const-string v8, "firebaseInstallationsApi.id"

    invoke-static {v2, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v7, v0, LT4/c$b;->o:Ljava/lang/Object;

    iput-object p1, v0, LT4/c$b;->p:Ljava/lang/Object;

    iput v4, v0, LT4/c$b;->s:I

    invoke-static {v2, v0}, Lz6/b;->a(LV2/j;LX5/d;)Ljava/lang/Object;

    move-result-object v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    if-ne v2, v1, :cond_8

    return-object v1

    :cond_8
    move-object v13, v2

    move-object v2, p1

    move-object p1, v13

    :goto_2
    :try_start_4
    check-cast p1, Ljava/lang/String;

    if-nez p1, :cond_9

    const-string p1, "SessionConfigFetcher"

    const-string v0, "Error getting Firebase Installation ID. Skipping this Session Event."

    invoke-static {p1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    sget-object p1, LV5/t;->a:LV5/t;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    invoke-interface {v2, v6}, Ly6/a;->b(Ljava/lang/Object;)V

    return-object p1

    :cond_9
    const/4 v8, 0x5

    :try_start_5
    new-array v8, v8, [LV5/m;

    const-string v9, "X-Crashlytics-Installation-ID"

    invoke-static {v9, p1}, LV5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)LV5/m;

    move-result-object p1

    const/4 v9, 0x0

    aput-object p1, v8, v9

    const-string p1, "X-Crashlytics-Device-Model"

    sget-object v10, Lkotlin/jvm/internal/x;->a:Lkotlin/jvm/internal/x;

    const-string v10, "%s/%s"

    new-array v11, v4, [Ljava/lang/Object;

    sget-object v12, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    aput-object v12, v11, v9

    sget-object v9, Landroid/os/Build;->MODEL:Ljava/lang/String;

    aput-object v9, v11, v5

    invoke-static {v11, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v9

    invoke-static {v10, v9}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    const-string v10, "format(format, *args)"

    invoke-static {v9, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v7, v9}, LT4/c;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static {p1, v9}, LV5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)LV5/m;

    move-result-object p1

    aput-object p1, v8, v5

    const-string p1, "X-Crashlytics-OS-Build-Version"

    sget-object v5, Landroid/os/Build$VERSION;->INCREMENTAL:Ljava/lang/String;

    const-string v9, "INCREMENTAL"

    invoke-static {v5, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v7, v5}, LT4/c;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {p1, v5}, LV5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)LV5/m;

    move-result-object p1

    aput-object p1, v8, v4

    const-string p1, "X-Crashlytics-OS-Display-Version"

    sget-object v4, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    const-string v5, "RELEASE"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v7, v4}, LT4/c;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {p1, v4}, LV5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)LV5/m;

    move-result-object p1

    aput-object p1, v8, v3

    const-string p1, "X-Crashlytics-API-Client-Version"

    iget-object v4, v7, LT4/c;->c:LR4/b;

    invoke-virtual {v4}, LR4/b;->f()Ljava/lang/String;

    move-result-object v4

    invoke-static {p1, v4}, LV5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)LV5/m;

    move-result-object p1

    const/4 v4, 0x4

    aput-object p1, v8, v4

    invoke-static {v8}, LW5/C;->f([LV5/m;)Ljava/util/Map;

    move-result-object p1

    iget-object v4, v7, LT4/c;->d:LT4/a;

    new-instance v5, LT4/c$c;

    invoke-direct {v5, v7, v6}, LT4/c$c;-><init>(LT4/c;LX5/d;)V

    new-instance v7, LT4/c$d;

    invoke-direct {v7, v6}, LT4/c$d;-><init>(LX5/d;)V

    iput-object v2, v0, LT4/c$b;->o:Ljava/lang/Object;

    iput-object v6, v0, LT4/c$b;->p:Ljava/lang/Object;

    iput v3, v0, LT4/c$b;->s:I

    invoke-interface {v4, p1, v5, v7, v0}, LT4/a;->a(Ljava/util/Map;Lg6/p;Lg6/p;LX5/d;)Ljava/lang/Object;

    move-result-object p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    if-ne p1, v1, :cond_a

    return-object v1

    :cond_a
    move-object v0, v2

    :goto_3
    :try_start_6
    sget-object p1, LV5/t;->a:LV5/t;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    invoke-interface {v0, v6}, Ly6/a;->b(Ljava/lang/Object;)V

    sget-object p1, LV5/t;->a:LV5/t;

    return-object p1

    :goto_4
    invoke-interface {v0, v6}, Ly6/a;->b(Ljava/lang/Object;)V

    throw p1
.end method

.method public d()Lo6/a;
    .locals 2

    .line 1
    iget-object v0, p0, LT4/c;->e:LT4/g;

    .line 2
    .line 3
    invoke-virtual {v0}, LT4/g;->e()Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget-object v1, Lo6/a;->p:Lo6/a$a;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    sget-object v1, Lo6/d;->s:Lo6/d;

    .line 16
    .line 17
    invoke-static {v0, v1}, Lo6/c;->o(ILo6/d;)J

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    invoke-static {v0, v1}, Lo6/a;->h(J)Lo6/a;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 v0, 0x0

    .line 27
    :goto_0
    return-object v0
.end method

.method public final f(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Lkotlin/text/Regex;

    .line 2
    .line 3
    const-string v1, "/"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string v1, ""

    .line 9
    .line 10
    invoke-virtual {v0, p1, v1}, Lkotlin/text/Regex;->replace(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1
.end method
