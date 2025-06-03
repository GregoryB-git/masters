.class public final Le7/u4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Le7/q4;

.field public final synthetic b:Le7/q4;

.field public final synthetic c:J

.field public final synthetic d:Z

.field public final synthetic e:Le7/s4;


# direct methods
.method public constructor <init>(Le7/s4;Le7/q4;Le7/q4;JZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p2, p0, Le7/u4;->a:Le7/q4;

    iput-object p3, p0, Le7/u4;->b:Le7/q4;

    iput-wide p4, p0, Le7/u4;->c:J

    iput-boolean p6, p0, Le7/u4;->d:Z

    iput-object p1, p0, Le7/u4;->e:Le7/s4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    iget-object v0, p0, Le7/u4;->e:Le7/s4;

    iget-object v1, p0, Le7/u4;->a:Le7/q4;

    iget-object v2, p0, Le7/u4;->b:Le7/q4;

    iget-wide v3, p0, Le7/u4;->c:J

    iget-boolean v5, p0, Le7/u4;->d:Z

    const/4 v6, 0x0

    invoke-virtual/range {v0 .. v6}, Le7/s4;->x(Le7/q4;Le7/q4;JZLandroid/os/Bundle;)V

    return-void
.end method
