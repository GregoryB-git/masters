.class public final Lh4/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc4/j;


# instance fields
.field public final a:J

.field public final b:Lc4/j;


# direct methods
.method public constructor <init>(JLc4/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lh4/d;->a:J

    iput-object p3, p0, Lh4/d;->b:Lc4/j;

    return-void
.end method


# virtual methods
.method public final m()V
    .locals 1

    iget-object v0, p0, Lh4/d;->b:Lc4/j;

    invoke-interface {v0}, Lc4/j;->m()V

    return-void
.end method

.method public final r(II)Lc4/v;
    .locals 1

    iget-object v0, p0, Lh4/d;->b:Lc4/j;

    invoke-interface {v0, p1, p2}, Lc4/j;->r(II)Lc4/v;

    move-result-object p1

    return-object p1
.end method

.method public final t(Lc4/t;)V
    .locals 2

    iget-object v0, p0, Lh4/d;->b:Lc4/j;

    new-instance v1, Lh4/d$a;

    invoke-direct {v1, p0, p1}, Lh4/d$a;-><init>(Lh4/d;Lc4/t;)V

    invoke-interface {v0, v1}, Lc4/j;->t(Lc4/t;)V

    return-void
.end method
