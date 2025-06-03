.class public final Lgb/c2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lgb/r1$m;


# direct methods
.method public constructor <init>(Lgb/r1$m;)V
    .locals 0

    iput-object p1, p0, Lgb/c2;->a:Lgb/r1$m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lgb/c2;->a:Lgb/r1$m;

    .line 2
    .line 3
    iget-object v1, v0, Lgb/r1$m;->e:Lgb/r1;

    .line 4
    .line 5
    iget-object v1, v1, Lgb/r1;->C:Ljava/util/Collection;

    .line 6
    .line 7
    if-nez v1, :cond_1

    .line 8
    .line 9
    iget-object v0, v0, Lgb/r1$m;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sget-object v1, Lgb/r1;->k0:Lgb/r1$a;

    .line 16
    .line 17
    if-ne v0, v1, :cond_0

    .line 18
    .line 19
    iget-object v0, p0, Lgb/c2;->a:Lgb/r1$m;

    .line 20
    .line 21
    iget-object v0, v0, Lgb/r1$m;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    :cond_0
    iget-object v0, p0, Lgb/c2;->a:Lgb/r1$m;

    .line 28
    .line 29
    iget-object v0, v0, Lgb/r1$m;->e:Lgb/r1;

    .line 30
    .line 31
    iget-object v0, v0, Lgb/r1;->G:Lgb/r1$p;

    .line 32
    .line 33
    sget-object v1, Lgb/r1;->h0:Leb/e1;

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Lgb/r1$p;->a(Leb/e1;)V

    .line 36
    .line 37
    .line 38
    :cond_1
    return-void
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
