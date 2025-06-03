.class public final synthetic Lk0/R0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:Lk0/T0$a;

.field public final synthetic p:Landroid/util/Pair;

.field public final synthetic q:Lx0/r;

.field public final synthetic r:Lx0/u;

.field public final synthetic s:Ljava/io/IOException;

.field public final synthetic t:Z


# direct methods
.method public synthetic constructor <init>(Lk0/T0$a;Landroid/util/Pair;Lx0/r;Lx0/u;Ljava/io/IOException;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lk0/R0;->o:Lk0/T0$a;

    .line 5
    .line 6
    iput-object p2, p0, Lk0/R0;->p:Landroid/util/Pair;

    .line 7
    .line 8
    iput-object p3, p0, Lk0/R0;->q:Lx0/r;

    .line 9
    .line 10
    iput-object p4, p0, Lk0/R0;->r:Lx0/u;

    .line 11
    .line 12
    iput-object p5, p0, Lk0/R0;->s:Ljava/io/IOException;

    .line 13
    .line 14
    iput-boolean p6, p0, Lk0/R0;->t:Z

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 1
    iget-object v0, p0, Lk0/R0;->o:Lk0/T0$a;

    .line 2
    .line 3
    iget-object v1, p0, Lk0/R0;->p:Landroid/util/Pair;

    .line 4
    .line 5
    iget-object v2, p0, Lk0/R0;->q:Lx0/r;

    .line 6
    .line 7
    iget-object v3, p0, Lk0/R0;->r:Lx0/u;

    .line 8
    .line 9
    iget-object v4, p0, Lk0/R0;->s:Ljava/io/IOException;

    .line 10
    .line 11
    iget-boolean v5, p0, Lk0/R0;->t:Z

    .line 12
    .line 13
    invoke-static/range {v0 .. v5}, Lk0/T0$a;->B(Lk0/T0$a;Landroid/util/Pair;Lx0/r;Lx0/u;Ljava/io/IOException;Z)V

    .line 14
    .line 15
    .line 16
    return-void
.end method
