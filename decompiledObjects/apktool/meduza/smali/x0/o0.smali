.class public final Lx0/o0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb1/h;
.implements Ls1/e;
.implements Lb1/t0;


# instance fields
.field public final a:Lx0/i;

.field public final b:Lb1/s0;

.field public final c:Ljava/lang/Runnable;

.field public d:Lb1/p;

.field public e:Ls1/d;


# direct methods
.method public constructor <init>(Lx0/i;Lb1/s0;Lu/a;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lx0/o0;->d:Lb1/p;

    iput-object v0, p0, Lx0/o0;->e:Ls1/d;

    iput-object p1, p0, Lx0/o0;->a:Lx0/i;

    iput-object p2, p0, Lx0/o0;->b:Lb1/s0;

    iput-object p3, p0, Lx0/o0;->c:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final a(Lb1/k$a;)V
    .locals 1

    iget-object v0, p0, Lx0/o0;->d:Lb1/p;

    invoke-virtual {v0, p1}, Lb1/p;->f(Lb1/k$a;)V

    return-void
.end method

.method public final b()V
    .locals 1

    .line 1
    iget-object v0, p0, Lx0/o0;->d:Lb1/p;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lb1/p;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Lb1/p;-><init>(Lb1/o;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lx0/o0;->d:Lb1/p;

    .line 11
    .line 12
    new-instance v0, Ls1/d;

    .line 13
    .line 14
    invoke-direct {v0, p0}, Ls1/d;-><init>(Ls1/e;)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lx0/o0;->e:Ls1/d;

    .line 18
    .line 19
    invoke-virtual {v0}, Ls1/d;->a()V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lx0/o0;->c:Ljava/lang/Runnable;

    .line 23
    .line 24
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 25
    .line 26
    .line 27
    :cond_0
    return-void
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
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method

.method public final getDefaultViewModelCreationExtras()Lc1/a;
    .locals 4

    .line 1
    iget-object v0, p0, Lx0/o0;->a:Lx0/i;

    .line 2
    .line 3
    invoke-virtual {v0}, Lx0/i;->requireContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :goto_0
    instance-of v1, v0, Landroid/content/ContextWrapper;

    .line 12
    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    instance-of v1, v0, Landroid/app/Application;

    .line 16
    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    check-cast v0, Landroid/app/Application;

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    check-cast v0, Landroid/content/ContextWrapper;

    .line 23
    .line 24
    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    goto :goto_0

    .line 29
    :cond_1
    const/4 v0, 0x0

    .line 30
    :goto_1
    new-instance v1, Lc1/b;

    .line 31
    .line 32
    invoke-direct {v1}, Lc1/b;-><init>()V

    .line 33
    .line 34
    .line 35
    if-eqz v0, :cond_2

    .line 36
    .line 37
    sget-object v2, Lb1/p0;->a:Lb1/p0;

    .line 38
    .line 39
    iget-object v3, v1, Lc1/a;->a:Ljava/util/LinkedHashMap;

    .line 40
    .line 41
    invoke-interface {v3, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    :cond_2
    sget-object v0, Lb1/h0;->a:Lb1/h0$b;

    .line 45
    .line 46
    iget-object v2, p0, Lx0/o0;->a:Lx0/i;

    .line 47
    .line 48
    iget-object v3, v1, Lc1/a;->a:Ljava/util/LinkedHashMap;

    .line 49
    .line 50
    invoke-interface {v3, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    sget-object v0, Lb1/h0;->b:Lb1/h0$c;

    .line 54
    .line 55
    iget-object v2, v1, Lc1/a;->a:Ljava/util/LinkedHashMap;

    .line 56
    .line 57
    invoke-interface {v2, v0, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    iget-object v0, p0, Lx0/o0;->a:Lx0/i;

    .line 61
    .line 62
    invoke-virtual {v0}, Lx0/i;->getArguments()Landroid/os/Bundle;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    if-eqz v0, :cond_3

    .line 67
    .line 68
    sget-object v0, Lb1/h0;->c:Lb1/h0$a;

    .line 69
    .line 70
    iget-object v2, p0, Lx0/o0;->a:Lx0/i;

    .line 71
    .line 72
    invoke-virtual {v2}, Lx0/i;->getArguments()Landroid/os/Bundle;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    iget-object v3, v1, Lc1/a;->a:Ljava/util/LinkedHashMap;

    .line 77
    .line 78
    invoke-interface {v3, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    :cond_3
    return-object v1
    .line 82
    .line 83
.end method

.method public final getLifecycle()Lb1/k;
    .locals 1

    invoke-virtual {p0}, Lx0/o0;->b()V

    iget-object v0, p0, Lx0/o0;->d:Lb1/p;

    return-object v0
.end method

.method public final getSavedStateRegistry()Ls1/c;
    .locals 1

    invoke-virtual {p0}, Lx0/o0;->b()V

    iget-object v0, p0, Lx0/o0;->e:Ls1/d;

    iget-object v0, v0, Ls1/d;->b:Ls1/c;

    return-object v0
.end method

.method public final getViewModelStore()Lb1/s0;
    .locals 1

    invoke-virtual {p0}, Lx0/o0;->b()V

    iget-object v0, p0, Lx0/o0;->b:Lb1/s0;

    return-object v0
.end method
