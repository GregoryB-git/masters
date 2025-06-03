.class public final Le7/v3;
.super Le7/v;
.source "SourceFile"


# instance fields
.field public final synthetic e:Le7/k3;


# direct methods
.method public constructor <init>(Le7/k3;Le7/j2;)V
    .locals 0

    iput-object p1, p0, Le7/v3;->e:Le7/k3;

    invoke-direct {p0, p2}, Le7/v;-><init>(Le7/c3;)V

    return-void
.end method


# virtual methods
.method public final c()V
    .locals 4

    new-instance v0, Ljava/lang/Thread;

    iget-object v1, p0, Le7/v3;->e:Le7/k3;

    invoke-virtual {v1}, Le7/o0;->o()Le7/k3;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Le7/r3;

    const/4 v3, 0x1

    invoke-direct {v2, v1, v3}, Le7/r3;-><init>(Le7/k3;I)V

    invoke-direct {v0, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    return-void
.end method
