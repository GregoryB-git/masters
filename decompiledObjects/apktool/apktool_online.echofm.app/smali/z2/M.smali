.class public final Lz2/M;
.super LT2/d;
.source "SourceFile"

# interfaces
.implements Ly2/e$a;
.implements Ly2/e$b;


# static fields
.field public static final i:Ly2/a$a;


# instance fields
.field public final b:Landroid/content/Context;

.field public final c:Landroid/os/Handler;

.field public final d:Ly2/a$a;

.field public final e:Ljava/util/Set;

.field public final f:LA2/d;

.field public g:LS2/e;

.field public h:Lz2/L;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, LS2/d;->c:Ly2/a$a;

    .line 2
    .line 3
    sput-object v0, Lz2/M;->i:Ly2/a$a;

    .line 4
    .line 5
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/os/Handler;LA2/d;)V
    .locals 1

    .line 1
    sget-object v0, Lz2/M;->i:Ly2/a$a;

    .line 2
    .line 3
    invoke-direct {p0}, LT2/d;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lz2/M;->b:Landroid/content/Context;

    .line 7
    .line 8
    iput-object p2, p0, Lz2/M;->c:Landroid/os/Handler;

    .line 9
    .line 10
    const-string p1, "ClientSettings must not be null"

    .line 11
    .line 12
    invoke-static {p3, p1}, LA2/n;->j(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    check-cast p1, LA2/d;

    .line 17
    .line 18
    iput-object p1, p0, Lz2/M;->f:LA2/d;

    .line 19
    .line 20
    invoke-virtual {p3}, LA2/d;->e()Ljava/util/Set;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iput-object p1, p0, Lz2/M;->e:Ljava/util/Set;

    .line 25
    .line 26
    iput-object v0, p0, Lz2/M;->d:Ly2/a$a;

    .line 27
    .line 28
    return-void
.end method

.method public static bridge synthetic a1(Lz2/M;)Lz2/L;
    .locals 0

    .line 1
    iget-object p0, p0, Lz2/M;->h:Lz2/L;

    .line 2
    .line 3
    return-object p0
.end method

.method public static bridge synthetic b1(Lz2/M;LT2/l;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, LT2/l;->a()Lx2/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lx2/b;->i()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p1}, LT2/l;->d()LA2/I;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-static {p1}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    check-cast p1, LA2/I;

    .line 20
    .line 21
    invoke-virtual {p1}, LA2/I;->a()Lx2/b;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, Lx2/b;->i()Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-nez v1, :cond_1

    .line 30
    .line 31
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    new-instance v1, Ljava/lang/Exception;

    .line 36
    .line 37
    invoke-direct {v1}, Ljava/lang/Exception;-><init>()V

    .line 38
    .line 39
    .line 40
    const-string v2, "Sign-in succeeded with resolve account failure: "

    .line 41
    .line 42
    invoke-virtual {v2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    const-string v2, "SignInCoordinator"

    .line 47
    .line 48
    invoke-static {v2, p1, v1}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 49
    .line 50
    .line 51
    :cond_0
    iget-object p1, p0, Lz2/M;->h:Lz2/L;

    .line 52
    .line 53
    invoke-interface {p1, v0}, Lz2/L;->a(Lx2/b;)V

    .line 54
    .line 55
    .line 56
    :goto_0
    iget-object p0, p0, Lz2/M;->g:LS2/e;

    .line 57
    .line 58
    invoke-interface {p0}, Ly2/a$f;->c()V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :cond_1
    iget-object v0, p0, Lz2/M;->h:Lz2/L;

    .line 63
    .line 64
    invoke-virtual {p1}, LA2/I;->d()LA2/i;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    iget-object v1, p0, Lz2/M;->e:Ljava/util/Set;

    .line 69
    .line 70
    invoke-interface {v0, p1, v1}, Lz2/L;->c(LA2/i;Ljava/util/Set;)V

    .line 71
    .line 72
    .line 73
    goto :goto_0
.end method


# virtual methods
.method public final K(LT2/l;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lz2/M;->c:Landroid/os/Handler;

    .line 2
    .line 3
    new-instance v1, Lz2/K;

    .line 4
    .line 5
    invoke-direct {v1, p0, p1}, Lz2/K;-><init>(Lz2/M;LT2/l;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final c1(Lz2/L;)V
    .locals 9

    .line 1
    iget-object v0, p0, Lz2/M;->g:LS2/e;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Ly2/a$f;->c()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, Lz2/M;->f:LA2/d;

    .line 9
    .line 10
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v0, v1}, LA2/d;->i(Ljava/lang/Integer;)V

    .line 19
    .line 20
    .line 21
    iget-object v2, p0, Lz2/M;->d:Ly2/a$a;

    .line 22
    .line 23
    iget-object v3, p0, Lz2/M;->b:Landroid/content/Context;

    .line 24
    .line 25
    iget-object v0, p0, Lz2/M;->c:Landroid/os/Handler;

    .line 26
    .line 27
    invoke-virtual {v0}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    iget-object v5, p0, Lz2/M;->f:LA2/d;

    .line 32
    .line 33
    invoke-virtual {v5}, LA2/d;->f()LS2/a;

    .line 34
    .line 35
    .line 36
    move-result-object v6

    .line 37
    move-object v7, p0

    .line 38
    move-object v8, p0

    .line 39
    invoke-virtual/range {v2 .. v8}, Ly2/a$a;->a(Landroid/content/Context;Landroid/os/Looper;LA2/d;Ljava/lang/Object;Ly2/e$a;Ly2/e$b;)Ly2/a$f;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    iput-object v0, p0, Lz2/M;->g:LS2/e;

    .line 44
    .line 45
    iput-object p1, p0, Lz2/M;->h:Lz2/L;

    .line 46
    .line 47
    iget-object p1, p0, Lz2/M;->e:Ljava/util/Set;

    .line 48
    .line 49
    if-eqz p1, :cond_2

    .line 50
    .line 51
    invoke-interface {p1}, Ljava/util/Set;->isEmpty()Z

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    if-eqz p1, :cond_1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    iget-object p1, p0, Lz2/M;->g:LS2/e;

    .line 59
    .line 60
    invoke-interface {p1}, LS2/e;->n()V

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :cond_2
    :goto_0
    iget-object p1, p0, Lz2/M;->c:Landroid/os/Handler;

    .line 65
    .line 66
    new-instance v0, Lz2/J;

    .line 67
    .line 68
    invoke-direct {v0, p0}, Lz2/J;-><init>(Lz2/M;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 72
    .line 73
    .line 74
    return-void
.end method

.method public final d1()V
    .locals 1

    .line 1
    iget-object v0, p0, Lz2/M;->g:LS2/e;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Ly2/a$f;->c()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final n(I)V
    .locals 0

    .line 1
    iget-object p1, p0, Lz2/M;->g:LS2/e;

    .line 2
    .line 3
    invoke-interface {p1}, Ly2/a$f;->c()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final o(Lx2/b;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lz2/M;->h:Lz2/L;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lz2/L;->a(Lx2/b;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final v(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lz2/M;->g:LS2/e;

    .line 2
    .line 3
    invoke-interface {p1, p0}, LS2/e;->d(LT2/f;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
