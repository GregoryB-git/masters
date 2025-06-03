.class public final synthetic Lx0/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:Lx0/E$a;

.field public final synthetic p:Lx0/E;

.field public final synthetic q:Lx0/u;


# direct methods
.method public synthetic constructor <init>(Lx0/E$a;Lx0/E;Lx0/u;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lx0/z;->o:Lx0/E$a;

    .line 5
    .line 6
    iput-object p2, p0, Lx0/z;->p:Lx0/E;

    .line 7
    .line 8
    iput-object p3, p0, Lx0/z;->q:Lx0/u;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lx0/z;->o:Lx0/E$a;

    .line 2
    .line 3
    iget-object v1, p0, Lx0/z;->p:Lx0/E;

    .line 4
    .line 5
    iget-object v2, p0, Lx0/z;->q:Lx0/u;

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, Lx0/E$a;->e(Lx0/E$a;Lx0/E;Lx0/u;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
