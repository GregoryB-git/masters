.class public final synthetic Ln5/A;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:Z

.field public final synthetic p:Ljava/lang/String;

.field public final synthetic q:LE5/k$d;

.field public final synthetic r:Ljava/lang/Boolean;

.field public final synthetic s:Ln5/k;

.field public final synthetic t:LE5/j;

.field public final synthetic u:Z

.field public final synthetic v:I


# direct methods
.method public synthetic constructor <init>(ZLjava/lang/String;LE5/k$d;Ljava/lang/Boolean;Ln5/k;LE5/j;ZI)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Ln5/A;->o:Z

    .line 5
    .line 6
    iput-object p2, p0, Ln5/A;->p:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Ln5/A;->q:LE5/k$d;

    .line 9
    .line 10
    iput-object p4, p0, Ln5/A;->r:Ljava/lang/Boolean;

    .line 11
    .line 12
    iput-object p5, p0, Ln5/A;->s:Ln5/k;

    .line 13
    .line 14
    iput-object p6, p0, Ln5/A;->t:LE5/j;

    .line 15
    .line 16
    iput-boolean p7, p0, Ln5/A;->u:Z

    .line 17
    .line 18
    iput p8, p0, Ln5/A;->v:I

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    .line 1
    iget-boolean v0, p0, Ln5/A;->o:Z

    .line 2
    .line 3
    iget-object v1, p0, Ln5/A;->p:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, Ln5/A;->q:LE5/k$d;

    .line 6
    .line 7
    iget-object v3, p0, Ln5/A;->r:Ljava/lang/Boolean;

    .line 8
    .line 9
    iget-object v4, p0, Ln5/A;->s:Ln5/k;

    .line 10
    .line 11
    iget-object v5, p0, Ln5/A;->t:LE5/j;

    .line 12
    .line 13
    iget-boolean v6, p0, Ln5/A;->u:Z

    .line 14
    .line 15
    iget v7, p0, Ln5/A;->v:I

    .line 16
    .line 17
    invoke-static/range {v0 .. v7}, Ln5/E;->d(ZLjava/lang/String;LE5/k$d;Ljava/lang/Boolean;Ln5/k;LE5/j;ZI)V

    .line 18
    .line 19
    .line 20
    return-void
.end method
