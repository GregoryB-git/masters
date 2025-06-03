.class public final synthetic LV3/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LT3/d;


# instance fields
.field public final synthetic a:LV3/A;

.field public final synthetic b:Ljava/util/concurrent/ScheduledExecutorService;


# direct methods
.method public synthetic constructor <init>(LV3/A;Ljava/util/concurrent/ScheduledExecutorService;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LV3/d;->a:LV3/A;

    .line 5
    .line 6
    iput-object p2, p0, LV3/d;->b:Ljava/util/concurrent/ScheduledExecutorService;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(ZLT3/d$a;)V
    .locals 2

    .line 1
    iget-object v0, p0, LV3/d;->a:LV3/A;

    .line 2
    .line 3
    iget-object v1, p0, LV3/d;->b:Ljava/util/concurrent/ScheduledExecutorService;

    .line 4
    .line 5
    invoke-static {v0, v1, p1, p2}, LV3/f;->a(LV3/A;Ljava/util/concurrent/ScheduledExecutorService;ZLT3/d$a;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
