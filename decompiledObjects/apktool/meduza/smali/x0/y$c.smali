.class public final Lx0/y$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le0/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx0/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lx0/y;


# direct methods
.method public constructor <init>(Lx0/y;)V
    .locals 0

    iput-object p1, p0, Lx0/y$c;->a:Lx0/y;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/MenuItem;)Z
    .locals 1

    iget-object v0, p0, Lx0/y$c;->a:Lx0/y;

    invoke-virtual {v0, p1}, Lx0/y;->q(Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method

.method public final b(Landroid/view/Menu;)V
    .locals 1

    iget-object v0, p0, Lx0/y$c;->a:Lx0/y;

    invoke-virtual {v0, p1}, Lx0/y;->r(Landroid/view/Menu;)V

    return-void
.end method

.method public final c(Landroid/view/Menu;Landroid/view/MenuInflater;)V
    .locals 1

    iget-object v0, p0, Lx0/y$c;->a:Lx0/y;

    invoke-virtual {v0, p1, p2}, Lx0/y;->l(Landroid/view/Menu;Landroid/view/MenuInflater;)Z

    return-void
.end method

.method public final d(Landroid/view/Menu;)V
    .locals 1

    iget-object v0, p0, Lx0/y$c;->a:Lx0/y;

    invoke-virtual {v0, p1}, Lx0/y;->u(Landroid/view/Menu;)Z

    return-void
.end method
