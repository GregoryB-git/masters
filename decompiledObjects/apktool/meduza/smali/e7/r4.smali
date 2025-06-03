.class public final Le7/r4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Landroid/os/Bundle;

.field public final synthetic b:Le7/q4;

.field public final synthetic c:Le7/q4;

.field public final synthetic d:J

.field public final synthetic e:Le7/s4;


# direct methods
.method public constructor <init>(Le7/s4;Landroid/os/Bundle;Le7/q4;Le7/q4;J)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p2, p0, Le7/r4;->a:Landroid/os/Bundle;

    iput-object p3, p0, Le7/r4;->b:Le7/q4;

    iput-object p4, p0, Le7/r4;->c:Le7/q4;

    iput-wide p5, p0, Le7/r4;->d:J

    iput-object p1, p0, Le7/r4;->e:Le7/s4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 10

    iget-object v0, p0, Le7/r4;->e:Le7/s4;

    iget-object v1, p0, Le7/r4;->a:Landroid/os/Bundle;

    iget-object v2, p0, Le7/r4;->b:Le7/q4;

    iget-object v3, p0, Le7/r4;->c:Le7/q4;

    iget-wide v4, p0, Le7/r4;->d:J

    if-eqz v1, :cond_0

    const-string v6, "screen_name"

    invoke-virtual {v1, v6}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    const-string v6, "screen_class"

    invoke-virtual {v1, v6}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    :cond_0
    invoke-virtual {v0}, Ld2/q;->k()Le7/r6;

    move-result-object v6

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-string v9, "screen_view"

    invoke-virtual {v6, v9, v1, v7, v8}, Le7/r6;->w(Ljava/lang/String;Landroid/os/Bundle;Ljava/util/List;Z)Landroid/os/Bundle;

    move-result-object v6

    const/4 v7, 0x1

    move-object v1, v2

    move-object v2, v3

    move-wide v3, v4

    move v5, v7

    invoke-virtual/range {v0 .. v6}, Le7/s4;->x(Le7/q4;Le7/q4;JZLandroid/os/Bundle;)V

    return-void
.end method
