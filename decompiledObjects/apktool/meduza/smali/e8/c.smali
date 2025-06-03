.class public final synthetic Le8/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le8/g$c;


# instance fields
.field public final synthetic a:Le8/f;

.field public final synthetic b:Ljava/lang/Runnable;

.field public final synthetic c:J

.field public final synthetic d:J

.field public final synthetic e:Ljava/util/concurrent/TimeUnit;


# direct methods
.method public synthetic constructor <init>(Le8/f;Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le8/c;->a:Le8/f;

    iput-object p2, p0, Le8/c;->b:Ljava/lang/Runnable;

    iput-wide p3, p0, Le8/c;->c:J

    iput-wide p5, p0, Le8/c;->d:J

    iput-object p7, p0, Le8/c;->e:Ljava/util/concurrent/TimeUnit;

    return-void
.end method


# virtual methods
.method public final b(Le8/g$a;)Ljava/util/concurrent/ScheduledFuture;
    .locals 10

    iget-object v0, p0, Le8/c;->a:Le8/f;

    iget-object v1, p0, Le8/c;->b:Ljava/lang/Runnable;

    iget-wide v4, p0, Le8/c;->c:J

    iget-wide v6, p0, Le8/c;->d:J

    iget-object v8, p0, Le8/c;->e:Ljava/util/concurrent/TimeUnit;

    iget-object v2, v0, Le8/f;->b:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v3, Lx0/g;

    const/4 v9, 0x5

    invoke-direct {v3, v0, v1, p1, v9}, Lx0/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-interface/range {v2 .. v8}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleWithFixedDelay(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p1

    return-object p1
.end method
