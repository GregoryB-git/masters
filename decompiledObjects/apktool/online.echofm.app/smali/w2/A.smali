.class public final synthetic Lw2/A;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LV2/e;


# instance fields
.field public final synthetic a:Lw2/c;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/util/concurrent/ScheduledFuture;


# direct methods
.method public synthetic constructor <init>(Lw2/c;Ljava/lang/String;Ljava/util/concurrent/ScheduledFuture;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lw2/A;->a:Lw2/c;

    .line 5
    .line 6
    iput-object p2, p0, Lw2/A;->b:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Lw2/A;->c:Ljava/util/concurrent/ScheduledFuture;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a(LV2/j;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lw2/A;->a:Lw2/c;

    .line 2
    .line 3
    iget-object v1, p0, Lw2/A;->b:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, Lw2/A;->c:Ljava/util/concurrent/ScheduledFuture;

    .line 6
    .line 7
    invoke-virtual {v0, v1, v2, p1}, Lw2/c;->e(Ljava/lang/String;Ljava/util/concurrent/ScheduledFuture;LV2/j;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
