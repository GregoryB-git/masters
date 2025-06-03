.class public final synthetic Lx3/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lx3/l$a;

.field public final synthetic b:I

.field public final synthetic c:J

.field public final synthetic d:J


# direct methods
.method public synthetic constructor <init>(Lx3/l$a;IJJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx3/k;->a:Lx3/l$a;

    iput p2, p0, Lx3/k;->b:I

    iput-wide p3, p0, Lx3/k;->c:J

    iput-wide p5, p0, Lx3/k;->d:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    iget-object v0, p0, Lx3/k;->a:Lx3/l$a;

    iget v2, p0, Lx3/k;->b:I

    iget-wide v3, p0, Lx3/k;->c:J

    iget-wide v5, p0, Lx3/k;->d:J

    iget-object v1, v0, Lx3/l$a;->b:Lx3/l;

    sget v0, Lv5/e0;->a:I

    invoke-interface/range {v1 .. v6}, Lx3/l;->z(IJJ)V

    return-void
.end method
