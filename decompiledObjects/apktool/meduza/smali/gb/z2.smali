.class public final Lgb/z2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ljava/util/Collection;

.field public final synthetic b:Lgb/y2$a0;

.field public final synthetic c:Ljava/util/concurrent/Future;

.field public final synthetic d:Ljava/util/concurrent/Future;

.field public final synthetic e:Lgb/y2;


# direct methods
.method public constructor <init>(Lgb/y2;Ljava/util/Collection;Lgb/y2$a0;Ljava/util/concurrent/Future;Ljava/util/concurrent/Future;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lgb/z2;->e:Lgb/y2;

    iput-object p2, p0, Lgb/z2;->a:Ljava/util/Collection;

    iput-object p3, p0, Lgb/z2;->b:Lgb/y2$a0;

    iput-object p4, p0, Lgb/z2;->c:Ljava/util/concurrent/Future;

    iput-object p5, p0, Lgb/z2;->d:Ljava/util/concurrent/Future;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lgb/z2;->a:Ljava/util/Collection;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lgb/y2$a0;

    .line 18
    .line 19
    iget-object v2, p0, Lgb/z2;->b:Lgb/y2$a0;

    .line 20
    .line 21
    if-eq v1, v2, :cond_0

    .line 22
    .line 23
    iget-object v1, v1, Lgb/y2$a0;->a:Lgb/s;

    .line 24
    .line 25
    sget-object v2, Lgb/y2;->C:Leb/e1;

    .line 26
    .line 27
    invoke-interface {v1, v2}, Lgb/s;->n(Leb/e1;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    iget-object v0, p0, Lgb/z2;->c:Ljava/util/concurrent/Future;

    .line 32
    .line 33
    const/4 v1, 0x0

    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    invoke-interface {v0, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 37
    .line 38
    .line 39
    :cond_2
    iget-object v0, p0, Lgb/z2;->d:Ljava/util/concurrent/Future;

    .line 40
    .line 41
    if-eqz v0, :cond_3

    .line 42
    .line 43
    invoke-interface {v0, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 44
    .line 45
    .line 46
    :cond_3
    iget-object v0, p0, Lgb/z2;->e:Lgb/y2;

    .line 47
    .line 48
    invoke-virtual {v0}, Lgb/y2;->x()V

    .line 49
    .line 50
    .line 51
    return-void
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
