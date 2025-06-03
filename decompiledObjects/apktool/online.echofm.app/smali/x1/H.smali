.class public final synthetic Lx1/H;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:Ljava/util/ArrayList;

.field public final synthetic p:Lx1/J;


# direct methods
.method public synthetic constructor <init>(Ljava/util/ArrayList;Lx1/J;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lx1/H;->o:Ljava/util/ArrayList;

    .line 5
    .line 6
    iput-object p2, p0, Lx1/H;->p:Lx1/J;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lx1/H;->o:Ljava/util/ArrayList;

    .line 2
    .line 3
    iget-object v1, p0, Lx1/H;->p:Lx1/J;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lx1/F$c;->a(Ljava/util/ArrayList;Lx1/J;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
