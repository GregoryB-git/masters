.class public final Lm9/d$a;
.super Landroid/net/ConnectivityManager$NetworkCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm9/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field public final synthetic a:Lm9/d;


# direct methods
.method public constructor <init>(Lm9/d;)V
    .locals 0

    iput-object p1, p0, Lm9/d$a;->a:Lm9/d;

    invoke-direct {p0}, Landroid/net/ConnectivityManager$NetworkCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAvailable(Landroid/net/Network;)V
    .locals 1

    iget-object p1, p0, Lm9/d$a;->a:Lm9/d;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lm9/d;->c(Z)V

    return-void
.end method

.method public final onLost(Landroid/net/Network;)V
    .locals 1

    iget-object p1, p0, Lm9/d$a;->a:Lm9/d;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lm9/d;->c(Z)V

    return-void
.end method
