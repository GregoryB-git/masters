.class public Landroidx/lifecycle/i$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/lifecycle/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public a:Landroidx/lifecycle/d$c;

.field public b:Landroidx/lifecycle/f;


# direct methods
.method public constructor <init>(Landroidx/lifecycle/g;Landroidx/lifecycle/d$c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Landroidx/lifecycle/j;->f(Ljava/lang/Object;)Landroidx/lifecycle/f;

    move-result-object p1

    iput-object p1, p0, Landroidx/lifecycle/i$a;->b:Landroidx/lifecycle/f;

    iput-object p2, p0, Landroidx/lifecycle/i$a;->a:Landroidx/lifecycle/d$c;

    return-void
.end method


# virtual methods
.method public a(Landroidx/lifecycle/h;Landroidx/lifecycle/d$b;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Landroidx/lifecycle/d$b;->e()Landroidx/lifecycle/d$c;

    move-result-object v0

    iget-object v1, p0, Landroidx/lifecycle/i$a;->a:Landroidx/lifecycle/d$c;

    invoke-static {v1, v0}, Landroidx/lifecycle/i;->k(Landroidx/lifecycle/d$c;Landroidx/lifecycle/d$c;)Landroidx/lifecycle/d$c;

    move-result-object v1

    iput-object v1, p0, Landroidx/lifecycle/i$a;->a:Landroidx/lifecycle/d$c;

    iget-object v1, p0, Landroidx/lifecycle/i$a;->b:Landroidx/lifecycle/f;

    invoke-interface {v1, p1, p2}, Landroidx/lifecycle/f;->a(Landroidx/lifecycle/h;Landroidx/lifecycle/d$b;)V

    iput-object v0, p0, Landroidx/lifecycle/i$a;->a:Landroidx/lifecycle/d$c;

    return-void
.end method
