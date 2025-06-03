.class public final Le7/r5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public a:J

.field public b:J

.field public final synthetic c:Ll3/l;


# direct methods
.method public constructor <init>(Ll3/l;JJ)V
    .locals 0

    iput-object p1, p0, Le7/r5;->c:Ll3/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p2, p0, Le7/r5;->a:J

    iput-wide p4, p0, Le7/r5;->b:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Le7/r5;->c:Ll3/l;

    iget-object v0, v0, Ll3/l;->b:Ljava/lang/Object;

    check-cast v0, Le7/q5;

    invoke-virtual {v0}, Ld2/q;->zzl()Le7/e2;

    move-result-object v0

    new-instance v1, Li6/r;

    const/4 v2, 0x4

    invoke-direct {v1, p0, v2}, Li6/r;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v0, v1}, Le7/e2;->u(Ljava/lang/Runnable;)V

    return-void
.end method
