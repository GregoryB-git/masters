.class public final Lgb/y2$u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgb/y2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "u"
.end annotation


# instance fields
.field public final a:Lgb/y2$t;

.field public final synthetic b:Lgb/y2;


# direct methods
.method public constructor <init>(Lgb/y2;Lgb/y2$t;)V
    .locals 0

    iput-object p1, p0, Lgb/y2$u;->b:Lgb/y2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lgb/y2$u;->a:Lgb/y2$t;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lgb/y2$u;->b:Lgb/y2;

    .line 2
    .line 3
    iget-object v1, v0, Lgb/y2;->o:Lgb/y2$y;

    .line 4
    .line 5
    iget v1, v1, Lgb/y2$y;->e:I

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-virtual {v0, v1, v2}, Lgb/y2;->r(IZ)Lgb/y2$a0;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    iget-object v1, p0, Lgb/y2$u;->b:Lgb/y2;

    .line 16
    .line 17
    iget-object v1, v1, Lgb/y2;->b:Ljava/util/concurrent/Executor;

    .line 18
    .line 19
    new-instance v2, Lgb/y2$u$a;

    .line 20
    .line 21
    invoke-direct {v2, p0, v0}, Lgb/y2$u$a;-><init>(Lgb/y2$u;Lgb/y2$a0;)V

    .line 22
    .line 23
    .line 24
    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 25
    .line 26
    .line 27
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
