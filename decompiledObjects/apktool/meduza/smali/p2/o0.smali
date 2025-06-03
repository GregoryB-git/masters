.class public final Lp2/o0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ls7/e;

.field public final synthetic b:Lp2/q0;


# direct methods
.method public constructor <init>(Lp2/q0;Lz2/c;)V
    .locals 0

    iput-object p1, p0, Lp2/o0;->b:Lp2/q0;

    iput-object p2, p0, Lp2/o0;->a:Ls7/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget-object v0, p0, Lp2/o0;->b:Lp2/q0;

    .line 2
    .line 3
    iget-object v0, v0, Lp2/q0;->x:Lz2/c;

    .line 4
    .line 5
    iget-object v0, v0, Lz2/a;->a:Ljava/lang/Object;

    .line 6
    .line 7
    instance-of v0, v0, Lz2/a$b;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    :try_start_0
    iget-object v0, p0, Lp2/o0;->a:Ls7/e;

    .line 13
    .line 14
    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    invoke-static {}, Lo2/j;->d()Lo2/j;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    sget-object v1, Lp2/q0;->z:Ljava/lang/String;

    .line 22
    .line 23
    new-instance v2, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 26
    .line 27
    .line 28
    const-string v3, "Starting work for "

    .line 29
    .line 30
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    iget-object v3, p0, Lp2/o0;->b:Lp2/q0;

    .line 34
    .line 35
    iget-object v3, v3, Lp2/q0;->c:Lx2/s;

    .line 36
    .line 37
    iget-object v3, v3, Lx2/s;->c:Ljava/lang/String;

    .line 38
    .line 39
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    invoke-virtual {v0, v1, v2}, Lo2/j;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    iget-object v0, p0, Lp2/o0;->b:Lp2/q0;

    .line 50
    .line 51
    iget-object v1, v0, Lp2/q0;->x:Lz2/c;

    .line 52
    .line 53
    iget-object v0, v0, Lp2/q0;->d:Landroidx/work/d;

    .line 54
    .line 55
    invoke-virtual {v0}, Landroidx/work/d;->h()Lz2/c;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-virtual {v1, v0}, Lz2/c;->k(Ls7/e;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :catchall_0
    move-exception v0

    .line 64
    iget-object v1, p0, Lp2/o0;->b:Lp2/q0;

    .line 65
    .line 66
    iget-object v1, v1, Lp2/q0;->x:Lz2/c;

    .line 67
    .line 68
    invoke-virtual {v1, v0}, Lz2/c;->j(Ljava/lang/Throwable;)Z

    .line 69
    .line 70
    .line 71
    :goto_0
    return-void
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
