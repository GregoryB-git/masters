.class public final Lgb/x2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lgb/x2$a;,
        Lgb/x2$b;
    }
.end annotation


# instance fields
.field public final a:Ljava/util/concurrent/ScheduledExecutorService;

.field public final b:Ljava/util/concurrent/Executor;

.field public final c:Ljava/lang/Runnable;

.field public final d:Ln7/p;

.field public e:J

.field public f:Z

.field public g:Ljava/util/concurrent/ScheduledFuture;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ScheduledFuture<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lgb/r1$j;Leb/h1;Ljava/util/concurrent/ScheduledExecutorService;Ln7/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgb/x2;->c:Ljava/lang/Runnable;

    iput-object p2, p0, Lgb/x2;->b:Ljava/util/concurrent/Executor;

    iput-object p3, p0, Lgb/x2;->a:Ljava/util/concurrent/ScheduledExecutorService;

    iput-object p4, p0, Lgb/x2;->d:Ln7/p;

    invoke-virtual {p4}, Ln7/p;->b()V

    return-void
.end method
