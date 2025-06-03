.class public final synthetic Ln5/B;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:LE5/j;

.field public final synthetic p:LE5/k$d;

.field public final synthetic q:Ln5/k;


# direct methods
.method public synthetic constructor <init>(LE5/j;LE5/k$d;Ln5/k;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ln5/B;->o:LE5/j;

    .line 5
    .line 6
    iput-object p2, p0, Ln5/B;->p:LE5/k$d;

    .line 7
    .line 8
    iput-object p3, p0, Ln5/B;->q:Ln5/k;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Ln5/B;->o:LE5/j;

    .line 2
    .line 3
    iget-object v1, p0, Ln5/B;->p:LE5/k$d;

    .line 4
    .line 5
    iget-object v2, p0, Ln5/B;->q:Ln5/k;

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, Ln5/E;->f(LE5/j;LE5/k$d;Ln5/k;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
