.class public final Lgb/r1$m$e$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgb/r1$m$e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "b"
.end annotation


# instance fields
.field public final synthetic a:Lgb/r1$m$e;


# direct methods
.method public constructor <init>(Lgb/r1$m$e;)V
    .locals 0

    iput-object p1, p0, Lgb/r1$m$e$b;->a:Lgb/r1$m$e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lgb/r1$m$e$b;->a:Lgb/r1$m$e;

    .line 2
    .line 3
    iget-object v1, v0, Lgb/r1$m$e;->o:Lgb/r1$m;

    .line 4
    .line 5
    iget-object v1, v1, Lgb/r1$m;->e:Lgb/r1;

    .line 6
    .line 7
    iget-object v1, v1, Lgb/r1;->C:Ljava/util/Collection;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-interface {v1, v0}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lgb/r1$m$e$b;->a:Lgb/r1$m$e;

    .line 15
    .line 16
    iget-object v0, v0, Lgb/r1$m$e;->o:Lgb/r1$m;

    .line 17
    .line 18
    iget-object v0, v0, Lgb/r1$m;->e:Lgb/r1;

    .line 19
    .line 20
    iget-object v0, v0, Lgb/r1;->C:Ljava/util/Collection;

    .line 21
    .line 22
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    iget-object v0, p0, Lgb/r1$m$e$b;->a:Lgb/r1$m$e;

    .line 29
    .line 30
    iget-object v0, v0, Lgb/r1$m$e;->o:Lgb/r1$m;

    .line 31
    .line 32
    iget-object v0, v0, Lgb/r1$m;->e:Lgb/r1;

    .line 33
    .line 34
    iget-object v1, v0, Lgb/r1;->b0:Lgb/r1$i;

    .line 35
    .line 36
    iget-object v0, v0, Lgb/r1;->D:Ljava/lang/Object;

    .line 37
    .line 38
    const/4 v2, 0x0

    .line 39
    invoke-virtual {v1, v0, v2}, Lgb/c1;->c(Ljava/lang/Object;Z)V

    .line 40
    .line 41
    .line 42
    iget-object v0, p0, Lgb/r1$m$e$b;->a:Lgb/r1$m$e;

    .line 43
    .line 44
    iget-object v0, v0, Lgb/r1$m$e;->o:Lgb/r1$m;

    .line 45
    .line 46
    iget-object v0, v0, Lgb/r1$m;->e:Lgb/r1;

    .line 47
    .line 48
    const/4 v1, 0x0

    .line 49
    iput-object v1, v0, Lgb/r1;->C:Ljava/util/Collection;

    .line 50
    .line 51
    iget-object v0, v0, Lgb/r1;->H:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 52
    .line 53
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-eqz v0, :cond_0

    .line 58
    .line 59
    iget-object v0, p0, Lgb/r1$m$e$b;->a:Lgb/r1$m$e;

    .line 60
    .line 61
    iget-object v0, v0, Lgb/r1$m$e;->o:Lgb/r1$m;

    .line 62
    .line 63
    iget-object v0, v0, Lgb/r1$m;->e:Lgb/r1;

    .line 64
    .line 65
    iget-object v0, v0, Lgb/r1;->G:Lgb/r1$p;

    .line 66
    .line 67
    sget-object v1, Lgb/r1;->h0:Leb/e1;

    .line 68
    .line 69
    invoke-virtual {v0, v1}, Lgb/r1$p;->a(Leb/e1;)V

    .line 70
    .line 71
    .line 72
    :cond_0
    return-void
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
