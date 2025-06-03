.class public final synthetic LY1/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LO1/F$b;


# instance fields
.field public final synthetic a:LY1/q;

.field public final synthetic b:LY1/u$e;


# direct methods
.method public synthetic constructor <init>(LY1/q;LY1/u$e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LY1/p;->a:LY1/q;

    .line 5
    .line 6
    iput-object p2, p0, LY1/p;->b:LY1/u$e;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    iget-object v0, p0, LY1/p;->a:LY1/q;

    .line 2
    .line 3
    iget-object v1, p0, LY1/p;->b:LY1/u$e;

    .line 4
    .line 5
    invoke-static {v0, v1, p1}, LY1/q;->p(LY1/q;LY1/u$e;Landroid/os/Bundle;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
