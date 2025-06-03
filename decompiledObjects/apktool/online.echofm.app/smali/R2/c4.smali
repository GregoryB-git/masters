.class public final LR2/c4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LR2/U5;


# instance fields
.field public final synthetic a:LR2/C3;


# direct methods
.method public constructor <init>(LR2/C3;)V
    .locals 0

    .line 1
    iput-object p1, p0, LR2/c4;->a:LR2/C3;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final r(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-string v1, "auto"

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, LR2/c4;->a:LR2/C3;

    .line 10
    .line 11
    invoke-virtual {v0, v1, p2, p3, p1}, LR2/C3;->Y(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    iget-object p1, p0, LR2/c4;->a:LR2/C3;

    .line 16
    .line 17
    invoke-virtual {p1, v1, p2, p3}, LR2/C3;->y0(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method
