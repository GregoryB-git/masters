.class public final LY1/G$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LO1/V$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LY1/G;->o(LY1/u$e;)I
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:LY1/G;

.field public final synthetic b:LY1/u$e;


# direct methods
.method public constructor <init>(LY1/G;LY1/u$e;)V
    .locals 0

    .line 1
    iput-object p1, p0, LY1/G$d;->a:LY1/G;

    .line 2
    .line 3
    iput-object p2, p0, LY1/G$d;->b:LY1/u$e;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(Landroid/os/Bundle;Lx1/o;)V
    .locals 2

    .line 1
    iget-object v0, p0, LY1/G$d;->a:LY1/G;

    .line 2
    .line 3
    iget-object v1, p0, LY1/G$d;->b:LY1/u$e;

    .line 4
    .line 5
    invoke-virtual {v0, v1, p1, p2}, LY1/G;->x(LY1/u$e;Landroid/os/Bundle;Lx1/o;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
