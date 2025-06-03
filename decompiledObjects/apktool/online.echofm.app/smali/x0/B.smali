.class public final synthetic Lx0/B;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:Lx0/E$a;

.field public final synthetic p:Lx0/E;

.field public final synthetic q:Lx0/r;

.field public final synthetic r:Lx0/u;


# direct methods
.method public synthetic constructor <init>(Lx0/E$a;Lx0/E;Lx0/r;Lx0/u;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lx0/B;->o:Lx0/E$a;

    .line 5
    .line 6
    iput-object p2, p0, Lx0/B;->p:Lx0/E;

    .line 7
    .line 8
    iput-object p3, p0, Lx0/B;->q:Lx0/r;

    .line 9
    .line 10
    iput-object p4, p0, Lx0/B;->r:Lx0/u;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget-object v0, p0, Lx0/B;->o:Lx0/E$a;

    .line 2
    .line 3
    iget-object v1, p0, Lx0/B;->p:Lx0/E;

    .line 4
    .line 5
    iget-object v2, p0, Lx0/B;->q:Lx0/r;

    .line 6
    .line 7
    iget-object v3, p0, Lx0/B;->r:Lx0/u;

    .line 8
    .line 9
    invoke-static {v0, v1, v2, v3}, Lx0/E$a;->d(Lx0/E$a;Lx0/E;Lx0/r;Lx0/u;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
