.class public final LG1/f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/app/Application$ActivityLifecycleCallbacks;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LG1/f;->x(Landroid/app/Application;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 3

    .line 1
    const-string p2, "activity"

    .line 2
    .line 3
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object p2, LO1/C;->e:LO1/C$a;

    .line 7
    .line 8
    sget-object v0, Lx1/N;->s:Lx1/N;

    .line 9
    .line 10
    invoke-static {}, LG1/f;->g()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    const-string v2, "onActivityCreated"

    .line 15
    .line 16
    invoke-virtual {p2, v0, v1, v2}, LO1/C$a;->b(Lx1/N;Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-static {}, LG1/g;->a()V

    .line 20
    .line 21
    .line 22
    invoke-static {p1}, LG1/f;->p(Landroid/app/Activity;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public onActivityDestroyed(Landroid/app/Activity;)V
    .locals 4

    .line 1
    const-string v0, "activity"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, LO1/C;->e:LO1/C$a;

    .line 7
    .line 8
    sget-object v1, Lx1/N;->s:Lx1/N;

    .line 9
    .line 10
    invoke-static {}, LG1/f;->g()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    const-string v3, "onActivityDestroyed"

    .line 15
    .line 16
    invoke-virtual {v0, v1, v2, v3}, LO1/C$a;->b(Lx1/N;Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    sget-object v0, LG1/f;->a:LG1/f;

    .line 20
    .line 21
    invoke-static {v0, p1}, LG1/f;->h(LG1/f;Landroid/app/Activity;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public onActivityPaused(Landroid/app/Activity;)V
    .locals 4

    .line 1
    const-string v0, "activity"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, LO1/C;->e:LO1/C$a;

    .line 7
    .line 8
    sget-object v1, Lx1/N;->s:Lx1/N;

    .line 9
    .line 10
    invoke-static {}, LG1/f;->g()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    const-string v3, "onActivityPaused"

    .line 15
    .line 16
    invoke-virtual {v0, v1, v2, v3}, LO1/C$a;->b(Lx1/N;Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-static {}, LG1/g;->a()V

    .line 20
    .line 21
    .line 22
    sget-object v0, LG1/f;->a:LG1/f;

    .line 23
    .line 24
    invoke-static {v0, p1}, LG1/f;->i(LG1/f;Landroid/app/Activity;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public onActivityResumed(Landroid/app/Activity;)V
    .locals 4

    .line 1
    const-string v0, "activity"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, LO1/C;->e:LO1/C$a;

    .line 7
    .line 8
    sget-object v1, Lx1/N;->s:Lx1/N;

    .line 9
    .line 10
    invoke-static {}, LG1/f;->g()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    const-string v3, "onActivityResumed"

    .line 15
    .line 16
    invoke-virtual {v0, v1, v2, v3}, LO1/C$a;->b(Lx1/N;Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-static {}, LG1/g;->a()V

    .line 20
    .line 21
    .line 22
    invoke-static {p1}, LG1/f;->v(Landroid/app/Activity;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 2

    .line 1
    const-string v0, "activity"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "outState"

    .line 7
    .line 8
    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object p1, LO1/C;->e:LO1/C$a;

    .line 12
    .line 13
    sget-object p2, Lx1/N;->s:Lx1/N;

    .line 14
    .line 15
    invoke-static {}, LG1/f;->g()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const-string v1, "onActivitySaveInstanceState"

    .line 20
    .line 21
    invoke-virtual {p1, p2, v0, v1}, LO1/C$a;->b(Lx1/N;Ljava/lang/String;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public onActivityStarted(Landroid/app/Activity;)V
    .locals 3

    .line 1
    const-string v0, "activity"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, LG1/f;->f()I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    add-int/lit8 p1, p1, 0x1

    .line 11
    .line 12
    invoke-static {p1}, LG1/f;->j(I)V

    .line 13
    .line 14
    .line 15
    sget-object p1, LO1/C;->e:LO1/C$a;

    .line 16
    .line 17
    sget-object v0, Lx1/N;->s:Lx1/N;

    .line 18
    .line 19
    invoke-static {}, LG1/f;->g()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    const-string v2, "onActivityStarted"

    .line 24
    .line 25
    invoke-virtual {p1, v0, v1, v2}, LO1/C$a;->b(Lx1/N;Ljava/lang/String;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public onActivityStopped(Landroid/app/Activity;)V
    .locals 3

    .line 1
    const-string v0, "activity"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object p1, LO1/C;->e:LO1/C$a;

    .line 7
    .line 8
    sget-object v0, Lx1/N;->s:Lx1/N;

    .line 9
    .line 10
    invoke-static {}, LG1/f;->g()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    const-string v2, "onActivityStopped"

    .line 15
    .line 16
    invoke-virtual {p1, v0, v1, v2}, LO1/C$a;->b(Lx1/N;Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    sget-object p1, Ly1/p;->b:Ly1/p$a;

    .line 20
    .line 21
    invoke-virtual {p1}, Ly1/p$a;->i()V

    .line 22
    .line 23
    .line 24
    invoke-static {}, LG1/f;->f()I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    add-int/lit8 p1, p1, -0x1

    .line 29
    .line 30
    invoke-static {p1}, LG1/f;->j(I)V

    .line 31
    .line 32
    .line 33
    return-void
.end method
