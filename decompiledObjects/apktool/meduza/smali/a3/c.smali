.class public final La3/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La3/b;


# instance fields
.field public final a:Ly2/r;

.field public final b:Lnc/c1;

.field public final c:Landroid/os/Handler;

.field public final d:La3/c$a;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/ExecutorService;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, La3/c;->c:Landroid/os/Handler;

    new-instance v0, La3/c$a;

    invoke-direct {v0, p0}, La3/c$a;-><init>(La3/c;)V

    iput-object v0, p0, La3/c;->d:La3/c$a;

    new-instance v0, Ly2/r;

    invoke-direct {v0, p1}, Ly2/r;-><init>(Ljava/util/concurrent/ExecutorService;)V

    iput-object v0, p0, La3/c;->a:Ly2/r;

    invoke-static {v0}, Lx6/b;->W(Ljava/util/concurrent/Executor;)Lnc/c1;

    move-result-object p1

    iput-object p1, p0, La3/c;->b:Lnc/c1;

    return-void
.end method


# virtual methods
.method public final a()Lnc/c1;
    .locals 1

    iget-object v0, p0, La3/c;->b:Lnc/c1;

    return-object v0
.end method

.method public final b()La3/c$a;
    .locals 1

    iget-object v0, p0, La3/c;->d:La3/c$a;

    return-object v0
.end method

.method public final c()Ly2/r;
    .locals 1

    iget-object v0, p0, La3/c;->a:Ly2/r;

    return-object v0
.end method

.method public final d(Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    iget-object v0, p0, La3/c;->a:Ly2/r;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ly2/r;->execute(Ljava/lang/Runnable;)V

    .line 4
    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
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
