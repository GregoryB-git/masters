.class public final Le7/g4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Le7/e3;

.field public final synthetic b:J

.field public final synthetic c:Z

.field public final synthetic d:Le7/k3;


# direct methods
.method public constructor <init>(Le7/k3;Le7/e3;JZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p2, p0, Le7/g4;->a:Le7/e3;

    iput-wide p3, p0, Le7/g4;->b:J

    iput-boolean p5, p0, Le7/g4;->c:Z

    iput-object p1, p0, Le7/g4;->d:Le7/k3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    iget-object v0, p0, Le7/g4;->d:Le7/k3;

    iget-object v1, p0, Le7/g4;->a:Le7/e3;

    invoke-virtual {v0, v1}, Le7/k3;->y(Le7/e3;)V

    iget-object v2, p0, Le7/g4;->d:Le7/k3;

    iget-object v3, p0, Le7/g4;->a:Le7/e3;

    iget-wide v4, p0, Le7/g4;->b:J

    iget-boolean v7, p0, Le7/g4;->c:Z

    const/4 v6, 0x0

    invoke-static/range {v2 .. v7}, Le7/k3;->A(Le7/k3;Le7/e3;JZZ)V

    return-void
.end method
