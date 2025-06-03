.class public final synthetic LC3/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LC3/p$c;


# instance fields
.field public final synthetic a:LC3/o;

.field public final synthetic b:Ljava/lang/Runnable;

.field public final synthetic c:J

.field public final synthetic d:J

.field public final synthetic e:Ljava/util/concurrent/TimeUnit;


# direct methods
.method public synthetic constructor <init>(LC3/o;Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LC3/g;->a:LC3/o;

    .line 5
    .line 6
    iput-object p2, p0, LC3/g;->b:Ljava/lang/Runnable;

    .line 7
    .line 8
    iput-wide p3, p0, LC3/g;->c:J

    .line 9
    .line 10
    iput-wide p5, p0, LC3/g;->d:J

    .line 11
    .line 12
    iput-object p7, p0, LC3/g;->e:Ljava/util/concurrent/TimeUnit;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final a(LC3/p$b;)Ljava/util/concurrent/ScheduledFuture;
    .locals 8

    .line 1
    iget-object v0, p0, LC3/g;->a:LC3/o;

    .line 2
    .line 3
    iget-object v1, p0, LC3/g;->b:Ljava/lang/Runnable;

    .line 4
    .line 5
    iget-wide v2, p0, LC3/g;->c:J

    .line 6
    .line 7
    iget-wide v4, p0, LC3/g;->d:J

    .line 8
    .line 9
    iget-object v6, p0, LC3/g;->e:Ljava/util/concurrent/TimeUnit;

    .line 10
    .line 11
    move-object v7, p1

    .line 12
    invoke-static/range {v0 .. v7}, LC3/o;->b(LC3/o;Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;LC3/p$b;)Ljava/util/concurrent/ScheduledFuture;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
.end method
