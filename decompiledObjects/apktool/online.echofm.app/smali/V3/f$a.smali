.class public LV3/f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LV3/A$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LV3/f;->D(LV3/A;Ljava/util/concurrent/ScheduledExecutorService;ZLT3/d$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ljava/util/concurrent/ScheduledExecutorService;

.field public final synthetic b:LT3/d$a;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/ScheduledExecutorService;LT3/d$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, LV3/f$a;->a:Ljava/util/concurrent/ScheduledExecutorService;

    .line 2
    .line 3
    iput-object p2, p0, LV3/f$a;->b:LT3/d$a;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static synthetic b(LT3/d$a;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, LV3/f$a;->c(LT3/d$a;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic c(LT3/d$a;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-interface {p0, p1}, LT3/d$a;->a(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, LV3/f$a;->a:Ljava/util/concurrent/ScheduledExecutorService;

    .line 2
    .line 3
    iget-object v1, p0, LV3/f$a;->b:LT3/d$a;

    .line 4
    .line 5
    new-instance v2, LV3/e;

    .line 6
    .line 7
    invoke-direct {v2, v1, p1}, LV3/e;-><init>(LT3/d$a;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-interface {v0, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method
