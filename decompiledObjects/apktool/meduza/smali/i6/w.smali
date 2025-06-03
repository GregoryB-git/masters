.class public final Li6/w;
.super Li6/x;
.source "SourceFile"


# direct methods
.method public constructor <init>(IILandroid/os/Bundle;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Li6/x;-><init>(IILandroid/os/Bundle;)V

    return-void
.end method


# virtual methods
.method public final a(Landroid/os/Bundle;)V
    .locals 2

    const-string v0, "ack"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p0, v0}, Li6/x;->d(Landroid/os/Bundle;)V

    return-void

    :cond_0
    new-instance p1, Lz3/f;

    const-string v1, "Invalid response to one way request"

    invoke-direct {p1, v1, v0}, Lz3/f;-><init>(Ljava/lang/String;Ljava/lang/SecurityException;)V

    invoke-virtual {p0, p1}, Li6/x;->c(Lz3/f;)V

    return-void
.end method

.method public final b()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
